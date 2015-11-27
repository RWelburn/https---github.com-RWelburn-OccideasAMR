//Animated Collapsible DIV- Author: Dynamic Drive (http://www.dynamicdrive.com)
//Last updated Aug 1st, 07'. Fixed bug with "block" parameter not working when persist is enabled
//Updated June 27th, 07'. Added ability for a DIV to be initially expanded.

var uniquepageid=window.location.href.replace("http://"+window.location.hostname, "").replace(/^\//, "") //get current page path and name, used to uniquely identify this page for persistence feature

function animatedcollapse(divId, animatetime, persistexpand, initstate, toggleId,focusObjId){
	this.divId=divId
	//alert(toggleId);
	this.toggleObj=document.getElementById(toggleId)
	//alert(this.toggleObj);
	this.divObj=document.getElementById(divId)
	if(document.getElementById(focusObjId)){
		this.focusObj=document.getElementById(focusObjId)
	}
	
	//alert(this.divObj.parentNode.tagName);
	this.divObj.style.overflow="hidden"
	this.timelength=animatetime
	this.initstate=(typeof initstate!="undefined" && initstate=="block")? "block" : "contract"
	this.isExpanded=animatedcollapse.getCookie(uniquepageid+"-"+divId) //"yes" or "no", based on cookie value
	this.contentheight=parseInt(this.divObj.style.height)
	
	//var parent = this.divObj.parentNode
	//while(parent){
	//	if(parent.className == 'someclass'){
	//		this.parentObj = parent
	//	}
	//	parent = parent.parentNode
	//}
	//this.pcontentheight=parseInt(this.parentObj.style.height)
	//alert(this.pcontentheight);
	
	
	var thisobj=this
	if (isNaN(this.contentheight)){ //if no CSS "height" attribute explicitly defined, get DIV's height on window.load
		animatedcollapse.dotask(window, function(){thisobj._getheight(persistexpand)}, "load")
		if (!persistexpand && this.initstate=="contract" || persistexpand && this.isExpanded!="yes" && this.isExpanded!=""){ //Hide DIV (unless div should be expanded by default, OR persistence is enabled and this DIV should be expanded)
			this.divObj.style.visibility="hidden" //hide content (versus collapse) until we can get its height
		}
	}
	else if (!persistexpand && this.initstate=="contract" || persistexpand && this.isExpanded!="yes" && this.isExpanded!=""){ //Hide DIV (unless div should be expanded by default, OR persistence is enabled and this DIV should be expanded)
		this.divObj.style.height=0 //just collapse content if CSS "height" attribute available		
	}
	if (persistexpand)
		animatedcollapse.dotask(window, function(){animatedcollapse.setCookie(uniquepageid+"-"+thisobj.divId, thisobj.isExpanded)}, "unload")
}

animatedcollapse.prototype._getheight=function(persistexpand){
	this.contentheight=this.divObj.offsetHeight
	if (!persistexpand && this.initstate=="contract" || persistexpand && this.isExpanded!="yes"){ //Hide DIV (unless div should be expanded by default, OR persistence is enabled and this DIV should be expanded)
		this.divObj.style.height=0 //collapse content
		this.divObj.style.visibility="visible"
	}
	else //else if persistence is enabled AND this content should be expanded, define its CSS height value so slideup() has something to work with
		this.divObj.style.height=this.contentheight+"px"
}


animatedcollapse.prototype._slideengine=function(direction){
	var elapsed=new Date().getTime()-this.startTime //get time animation has run
	var thisobj=this
	if (elapsed<this.timelength){ //if time run is less than specified length
		var distancepercent=(direction=="down")? animatedcollapse.curveincrement(elapsed/this.timelength) : 1-animatedcollapse.curveincrement(elapsed/this.timelength)
		this.divObj.style.height=distancepercent * this.contentheight +"px"
		//this.parentObj.style.height=this.pcontentheight+(distancepercent * this.contentheight) +"px"
		
	//	var parent = this.divObj.parentNode;
	//	while(parent){
			//alert(parent.name);
	//		if(parent.className == 'someclass'){
				//alert(1);
	//			parent.style.height=parent.style.height+(distancepercent * 100) +"px"
	//		}
	//		parent = parent.parentNode;
	//	}
		this.runtimer=setTimeout(function(){thisobj._slideengine(direction)}, 10)
	}
	else{ //if animation finished
		this.divObj.style.height=(direction=="down")? this.contentheight+"px" : 0
		this.isExpanded=(direction=="down")? "yes" : "no" //remember whether content is expanded or not
		this.runtimer=null
//		alert('finished');
		if(direction=="down"){
			animatedcollapse.fixParentSizes(this.divObj);
			if(this.focusObj){
				this.focusObj.focus();
			}
		}		
	}
}


animatedcollapse.prototype.slidedown=function(){
	if (typeof this.runtimer=="undefined" || this.runtimer==null){ //if animation isn't already running or has stopped running
		if (isNaN(this.contentheight)) //if content height not available yet (until window.onload)
			alert("Please wait until document has fully loaded then click again")
		else if (parseInt(this.divObj.style.height)==0){ //if content is collapsed
			this.startTime=new Date().getTime() //Set animation start time
			this._slideengine("down")
		}
	}
}

animatedcollapse.prototype.slideup=function(){
	if (typeof this.runtimer=="undefined" || this.runtimer==null){ //if animation isn't already running or has stopped running
		if (isNaN(this.contentheight)) //if content height not available yet (until window.onload)
			alert("Please wait until document has fully loaded then click again")
		else if (parseInt(this.divObj.style.height)==this.contentheight){ //if content is expanded
			this.startTime=new Date().getTime()
			this._slideengine("up")
		}
	}
}
animatedcollapse.fixParentSizes=function(divObj1){
	var parent = divObj1.parentNode;
	var parentDiv = null;
	var parentTable = null;
	while(parent){		
		if(parent.className == 'questions'){
			parentTable = parent;	
//			alert('the ptable '+parentTable.offsetHeight);						
		}
		if(parent.className == 'parentDiv'){
			parentDiv = parent;
			if(parentDiv !=null){
//				alert('the pdivh'+parentDiv.style.height);
				if(parentTable.offsetHeight>parentDiv.offsetHeight){
//					alert('table bigger '+parentTable.offsetHeight+' '+parentDiv.offsetHeight);
					parentDiv.style.height = parentTable.offsetHeight+'px';
				}
			}
		}
		parent = parent.parentNode;
	}
}
animatedcollapse.prototype.slideit=function(focusobj){
	if (isNaN(this.contentheight)) {//if content height not available yet (until window.onload)
		alert("Please wait until document has fully loaded then click again")
	}
	else if (this.toggleObj.checked){
		this.slidedown(focusobj)						
	}
	else{
		this.divObj.style.height=this.contentheight+"px";
		this.slideup()
	}
	
}

// -------------------------------------------------------------------
// A few utility functions below:
// -------------------------------------------------------------------

animatedcollapse.curveincrement=function(percent){
	return (1-Math.cos(percent*Math.PI)) / 2 //return cos curve based value from a percentage input
}


animatedcollapse.dotask=function(target, functionref, tasktype){ //assign a function to execute to an event handler (ie: onunload)
	var tasktype=(window.addEventListener)? tasktype : "on"+tasktype
	if (target.addEventListener){
		target.addEventListener(tasktype, functionref, false)
	}
	else if (target.attachEvent){
		target.attachEvent(tasktype, functionref)
	}
}

animatedcollapse.getCookie=function(Name){ 
	var re=new RegExp(Name+"=[^;]+", "i"); //construct RE to search for target name/value pair
	if (document.cookie.match(re)) //if cookie found
		return document.cookie.match(re)[0].split("=")[1] //return its value
	return ""
}

animatedcollapse.setCookie=function(name, value){
		document.cookie = name+"="+value
}