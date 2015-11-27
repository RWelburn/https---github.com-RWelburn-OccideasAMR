window.onresize = setPosition;
window.onscroll = setPosition;
       
function setPosition(){
	var objBody; 
	var objScrollPos;	
	var objActB;  
	if ( document.all ){
	   objBody = document.documentElement;
	   objScrollPos = document.all('scrollPos');
	   if(objBody){
		  if(objScrollPos){
			objScrollPos.value = objBody.scrollTop;
		  }
	   }	
	   objActB = document.all('divActionButtons'); 
       if (objActB) {	
       	var mainPageObj = document.all('MainPage'); 
       	var mainPageHeight = mainPageObj.offsetHeight;
       	var newPos = objBody.scrollTop + objBody.clientHeight - objActB.offsetHeight;
       	if((newPos+50) < mainPageHeight){
       		objActB.style.top = newPos;
       	}else{
       		objActB.style.top = (mainPageHeight-50);
       	}
       }
	}else{
	   	objScrollPos = document.getElementById('scrollPos');	   
		if(objScrollPos){
			objScrollPos.value = window.pageYOffset;
		}
	   	objActB = document.getElementById('divActionButtons');	
       	if (objActB) {		  	 	   
      	  	var mainPageObj = document.getElementById('MainPage'); 
	       	var mainPageHeight = mainPageObj.offsetHeight;
	       	var mainPageWidth = mainPageObj.offsetWidth;
	       	var windowWidth = window.innerWidth;
	       	var newPos = window.pageYOffset + window.innerHeight - 68;
	       	if((newPos+50) < mainPageHeight){
	       		if(windowWidth<(mainPageWidth+10)){
	       			newPos = newPos-10;
	       		}
	       		objActB.style.top = newPos+ 'px';	
	       	}else{
	       		objActB.style.top = (mainPageHeight-50) + 'px';
	       	}
       	}
	}	 	  			   		
}
function moveToSetPosition(position){	
//	alert(position);
	window.scrollTo(0,position);	
}
function enableControl(theControl){
	if(document.getElementById(theControl)){
		document.getElementById(theControl).disabled=false;
	}
}		
function validateCheckBoxes(theMessage){
    var iCount = 0;
  	if(document.all){ 		
  		for(var i = 0; i < document.all.length; i++){
   			if(document.all(i).tagName == 'INPUT'){
   				if(document.all(i).checked){
   					iCount++;  					
   				}
   			}
		}
  	}else{  		
  		var inputs = document.getElementsByTagName('input');       
		for (var i = 0; i < inputs.length; i++) { 			
  			if(inputs[i].checked){
   				iCount++;  					
   			}
		}
  	}
  	if(iCount == 0){
  		alert(theMessage);
  		return false;
  	}else{
  		if(iCount>1){
  			var msg = 'Apply to '+iCount+' items?';
  			return confirm(msg);
  		}
  	}
}	

function validateCheckBoxesConfirmDelete(validateMsg, confirmMsg){
	var iCount = 0;
	if(document.all){		
  		for(i = 0; i < document.all.length; i++){
   			if(document.all(i).tagName == 'INPUT'){
   				if(document.all(i).checked){
   					iCount++;		
   				}
   			}
		}
  	}else{ 		
  		var inputs = document.getElementsByTagName('INPUT');       
		for (var i = 0; i < inputs.length; i++) { 
			if (inputs[i].type == 'checkbox') {		
  				if(inputs[i].checked){
   					iCount++;  					
   				}
   			}
		}
  	}
  	if(iCount == 0){
  		alert(validateMsg);
  		return false;
  	} else if(iCount>1){
  		var msg = 'Apply to '+iCount+ ' ' + confirmMsg + 's?';
  		if (confirm(msg)){
  			return confirm('Are you sure you wish to delete these ' + confirmMsg + 's?');
  		} else {
  			return false;
  		}
  	} else if(iCount == 1) {
		return confirm('Are you sure you wish to delete this ' + confirmMsg + '?');
  	} else {
  		return false;
  	}
}	

function autoCheck(theName, theValue){					
  	if(theValue == 0){ 			 			  				
  		if(document.all){
  			//alert(document.all(theName));
  			if(document.all(theName)[0]){
  				document.all(theName)[0].checked = true;
  			}else{					
  				document.all(theName).checked = true;
  			}
  		}else{
  			if(document.getElementsByName(theName)[0]){
  				document.getElementsByName(theName)[0].checked = true;
  			}else if(document.getElementById(theName)){
  				document.getElementById(theName).checked = true;
  			}
  		}							
  	}else{ 	
  		if(document.all){
	  		if(document.getElementsByName(theName)){
	  			for(i = 0; i < document.getElementsByName(theName).length; i++){
	 				if(document.getElementsByName(theName)[i].value == theValue){
	  					document.getElementsByName(theName)[i].checked = true;
	  				}
	  			}
	  		}
  		}else{
  			if(document.getElementById(theName)){
  				if(document.getElementById(theName).value == theValue){
	  				document.getElementById(theName).checked = true;
	  			}
  			}else{
				if(document.getElementsByName(theName)){
	  				for(i = 0; i < document.getElementsByName(theName).length; i++){
	 					if(document.getElementsByName(theName)[i].value == theValue){
	  						document.getElementsByName(theName)[i].checked = true;
	  					}
	  				}
	  			}
  			}
  		}	 				
  	}	 	
}	
function startStudy(){
  	if(confirm('Starting a study will freeze all JSM within the study.  This may take a few minutes. Are you sure?')){
  		showProgress();
  	}
}
function checkDirtyPage(){
  	if(document.getElementById('dirtypage')){
  		//return confirm('Are you sure?');
  	}else{
  		return true;
  	}
}
function toggleCheck(objectName, objectValue){
    if(document.getElementsByName(objectName)){
		for(i = 0; i < document.getElementsByName(objectName).length; i++){
			if(document.getElementsByName(objectName)(i).value == objectValue){
				if(document.getElementsByName(objectName)(i).checked){
					document.getElementsByName(objectName)(i).checked = false;
				}else{
					document.getElementsByName(objectName)(i).checked = true;
				}
			}
		}
	}
}
function validateOnlyOneCheckBox(){
  	var iCount = 0;
  	if(document.all){
  		for(i = 0; i < document.all.length; i++){
   			if(document.all(i).tagName == 'INPUT'){
   				if(document.all(i).checked){
   					iCount++;  					
   				}
   			}
		}
  	}else{
  		var inputs = document.getElementsByTagName('INPUT');       
		for (var i = 0; i < inputs.length; i++) { 
			if (inputs[i].type == 'checkbox') {		
  				if(inputs[i].checked){
   					iCount++;  					
   				}
   			}
		}
  	}
  	if(iCount==0){
  		alert('Please specify which item to apply this action to');
  		return false;
  	}
  	if(iCount>1){
  		var iRemove = iCount-1;
  		alert('Please specify which item to apply this action to and remove '+iRemove+' selected items');
  		return false;
  	}
}	
function showProgress(){
	window.setTimeout("progressVisible()",1000);
}
function progressVisible(){
	document.getElementById('progressBar').style.visibility = "visible";
	
}
function checkCheckBoxes(){
  	if(document.all){
  		if(document.all('checkedIDsList')){
	  		var stringlist = document.all('checkedIDsList');
	  		var arrayOfIDs = new Array();
	  		arrayOfIDs = stringlist.value.split(',');
	  		for(i = 0; i < document.all.length; i++){
	   			if(document.all(i).tagName == 'INPUT'){
	   				var obj = document.all(i); 				
	   				if(obj.type == 'checkbox'){	   					
	   					var strName = obj.name;  					
	   					var k = strName.lastIndexOf('_');  					
	   					var strID = strName.substring(k+1);
	   					for(var j=0;j < arrayOfIDs.length; j++){
	   						if(strID == arrayOfIDs[j])
	   						{ 
	   							obj.checked = true;
	   						}
	   					}
	   				}
	   			}
			}
		}
  	}else{  		
  		if(document.getElementById('checkedIDsList')){  		
	  		var stringlist = document.getElementById('checkedIDsList');
	  		var arrayOfIDs = new Array();
	  		arrayOfIDs = stringlist.value.split(',');	 	  		 		
	  		var inputs = document.getElementsByTagName('INPUT');  	  		
	  		for(i = 0; i < inputs.length; i++){	   			
	   			var obj = inputs[i]; 				
	   			if(obj.type == 'checkbox'){	  	   					 					
	   				var strName = obj.name;  						   					
	   				var k = strName.lastIndexOf('_');  						   					
	   				var strID = strName.substring(k+1);	   				
	   				for(var j=0;j < arrayOfIDs.length; j++){
	   					if(strID == arrayOfIDs[j])
	   					{ 	   	   												
	   						obj.checked = true;
	   					}
	   				}
	   			}	   			
			}	  		
		}
  	}
}	
function toggleClass(id,checked,unchecked){	
	if(document.getElementById(id)){			
		if(document.getElementById(id).className == checked){			
			document.getElementById(id).className = unchecked;
		}else{
			document.getElementById(id).className = checked;
		}		
	}
}
function changeImage(id,imageName){	
	if(document.getElementById(id)){		
		var img1 = new Image();
   		img1.src = imageName;			
		document.getElementById(id).src = img1.src;		
	}
}
function autoPost(){
	if(document.getElementById('controllerpost')){
		document.getElementById('controllerpost').submit();	
	}
}

function checkMaxLength(control){
	maxLength = control.attributes["maxLength"].value;
  	value = control.value;
   	if(value.length > maxLength-1){
    	alert('The maximum length of your response must be less than 1024 characters long');
    	event.returnValue = false;
 }
}
function setUnknown(elementName){
	if(document.all){
		var obj = document.all(elementName);
		if(obj.disabled){
			obj.value = ''
			obj.disabled = false
		}else{
			obj.value = '9999'
			obj.disabled = true
		}
		
	}else{
		var obj = document.getElementById(elementName);
		if(obj.disabled){
			obj.value = ''
			obj.disabled = false
		}else{
			obj.value = '9999'
			obj.disabled = true
		}
	}
}
function validateNumber(elementName){
	if(document.all){
		var obj = document.all(elementName);
		if(obj.value != ''){
			if(isNaN(obj.value)){							
				alert('Please only enter number characters into this field');
				obj.select();				
			}
		}		
	}else{
		var obj = document.getElementsByName(elementName)[0];
		if(obj.value != ''){
			if(isNaN(obj.value)){							
				alert('Please only enter number characters into this field');
				obj.select();				
			}
		}			
	}	
}
function validateOnlyOneRuleChecked(msg){
  	if(document.all){
  		var iCount = 0;
  		for(i = 0; i < document.all.length; i++){
   			if(document.all(i).tagName == 'INPUT'){
   				if(document.all(i).type == 'radio'){
   					if(document.all(i).name == 'rules'){
   						if(document.all(i).checked){
   							iCount++;  					
   						}
   					}					
   				}
   			}
		}
  	}else{
  		var inputs = document.getElementsByTagName('INPUT');       
		for (var i = 0; i < inputs.length; i++) { 
			if (inputs[i].type == 'radio') {
				if(inputs[i].name == 'rules'){		
  					if(inputs[i].checked){
   						iCount++;  					
   					}
   				}
   			}
		}
  	}
  	if(iCount==0){
  		alert(msg);
  		return false;
  	} 	
}	
function removeCheckIfChecked(theObjectName){
	if(document.getElementById(theObjectName)){  
		var flagObj = document.getElementById('radioChangeFlag');
		if(flagObj.value == theObjectName){
			if(document.getElementById(theObjectName).checked){
				document.getElementById(theObjectName).checked = false;
			}else{
				document.getElementById(theObjectName).checked = true;
			}
			setHiddenRadioFlag('0');
		}else{
			setHiddenRadioFlag(theObjectName);
		}
  	}
}

function changeRBStyle(theObjectName){
  	var radioName = document.getElementById(theObjectName).name;
	var names = document.getElementsByName(radioName);
  	var allUnchecked=true;
  	for(var i = 0; i < names.length; i++){
  		if(names[i].checked){
  			allUnchecked=false;

  		}
  	}
  	if(allUnchecked) {
  		for(var i = 0; i < names.length; i++){
  			var divname = names[i].id + "div";

  			var myelement2 = document.getElementById(divname);
			myelement2.style.color = "black";
  		}
  	}else{
		for(var i = 0; i < names.length; i++){
			if(names[i].checked){
  				var divname = names[i].id + "div";

  				var myelement2 = document.getElementById(divname);
				myelement2.style.color = "black";
  			}else{
  				var divname = names[i].id + "div";


  				var myelement2 = document.getElementById(divname);
				myelement2.style.color = "lightgrey";
  			}
  		}
  	}
}
function setHiddenRadioFlag(theObjectName){
	var flagObj = document.getElementById('radioChangeFlag');
  	flagObj.value = theObjectName;
  	//alert('flag '+flagObj.value);
}
function removeAllCheckBoxes(){
  	if(document.all){
  		var iCount = 0;
  		for(i = 0; i < document.all.length; i++){
   			if(document.all(i).tagName == 'INPUT'){
   				if(document.all(i).checked){
   					document.all(i).checked = false;
   				}
   			}
		}
  	}
}
function clearText(obj) {
	if(obj){
		var strvalue = obj.value.substring(0,19);
		if(strvalue == 'New Possible Answer'){
			obj.value = '';		
		}
	}
}
function setFocus(objName){
	if(document.all){
		var obj = document.all(objName);
		obj.focus();		
	}else{
		var obj = document.getElementsByName(objName)[0];
		obj.focus();
	}
}
function disableEnterKey() {
	document.onkeypress = register;	
}
function register(e) {	
	if (!e) {		
		e = window.event;
	}
	if (e['keyCode'] == '13') {
		var keyInfo = 'Return Key is Disabled'; 
		alert(keyInfo); 
		return false;
	}
}
intImage = 2;
function swapSelectAllImage(selectAllImage){
	switch(intImage){
		case 1:
			selectAllImage.src = '/Questionnaire/ImageStream?ImageName=unchecked.gif'
			intImage = 2
			uncheckAllCheckboxes()
			return(false);		
		case 2:			
			selectAllImage.src = '/Questionnaire/ImageStream?ImageName=checked.gif'
			intImage = 1
			checkAllCheckboxes()
			return(false);		
	}
}
function askSurvey(pid){
	if(confirm('Thank you for your participation.  If you would like to provide user feedback, please click OK to fill out our user feedback survey.')){
		window.location = "/Studies/selfadminpagesurvey.jsp?PID="+pid;
	}
}
function confirmEnterDemo(){
	var mssge = "You are about to enter the system in Demo Mode.\r\rTo explore the functions of OccIDEAS, click on each of the blue tabs at the top"
+" in turn.\rFor each of the blue tabs, you can then click on the yellow tabs that"
+" you want to look at.\rYou can click on the left hand side menu for more options"
+" within each yellow tab.\rMost of the action buttons at the bottom of the"
+" screen are greyed out, but you can experiment with those which are available.\rPlease"
+" feel free to try out OccIDEAS as much as you like.";

	return confirm(mssge);

}
function confirmValueSelected(objectName){
	var retValue = false;
	if(document.getElementById(objectName)){
		var val = document.getElementById(objectName).value;
		if(val == 'NULL'){
			alert('Please select a job history reference number to use');
			retValue = false;
		}else{
			retValue = true;
		}
	}
	return retValue;
}
function checkAllCheckboxes(){
  	if(document.all){
  		for(i = 0; i < document.all.length; i++){
   			if(document.all(i).tagName == 'INPUT'){
   				if(document.all(i).checked == false){
   					document.all(i).checked = true;
   				}
   			}
		}
  	}else{
  		var inputs = document.getElementsByTagName('INPUT');       
		for (var i = 0; i < inputs.length; i++) { 
			if (inputs[i].type == 'checkbox') {		
  				if(inputs[i].checked == false){
   					inputs[i].checked = true;					
   				}
   			}
		}
  	}
}
function uncheckAllCheckboxes(){
  	if(document.all){
  		for(i = 0; i < document.all.length; i++){
   			if(document.all(i).tagName == 'INPUT'){
   				if(document.all(i).checked == true){
   					document.all(i).checked = false;
   				}
   			}
		}
  	}else{
  		var inputs = document.getElementsByTagName('INPUT');       
		for (var i = 0; i < inputs.length; i++) { 
			if (inputs[i].type == 'checkbox') {		
  				if(inputs[i].checked == true){
   					inputs[i].checked = false;					
   				}
   			}
		}
  	}
}

var refreshinterval=5

var displaycountdown="yes"

var starttime
var nowtime
var reloadseconds=0
var secondssinceloaded=0
var staticparam

function starttime(params) {	
    staticparam = params;
	starttime=new Date();
	starttime=starttime.getTime();
    countdown();
}

function countdown() {
	nowtime= new Date();
	nowtime=nowtime.getTime();
	secondssinceloaded=(nowtime-starttime)/1000;
	reloadseconds=Math.round(refreshinterval-secondssinceloaded);
	if (refreshinterval>=secondssinceloaded) {
        var timer=setTimeout("countdown()",1000);
		if (displaycountdown=="yes") {
			window.status="Page refreshing in "+reloadseconds+ " seconds";
		}
    }
    else {
        clearTimeout(timer);
        window.location = "./main.jsp"+staticparam;
		//window.location.reload(true);
    } 
}