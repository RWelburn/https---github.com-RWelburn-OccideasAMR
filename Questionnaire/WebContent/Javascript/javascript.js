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
       	if((newPos+75) < mainPageHeight){
       		objActB.style.top = newPos;
       	}else{
       		objActB.style.top = (mainPageHeight-45);
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
	       	if((newPos+75) < mainPageHeight){
	       		if(windowWidth<(mainPageWidth+10)){
	       			newPos = newPos-10;
	       		}
	       		objActB.style.top = newPos+ 'px';	
	       	}else{
	       		objActB.style.top = (mainPageHeight-45)+ 'px';
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
function saveSuccessfulHide(){
	document.getElementById('SaveSuccessful').style.visibility = "hidden";	
}
function saveSuccessfulShow(){
	document.getElementById('SaveSuccessful').style.visibility = "visible";	
}
function flashSaveSuccessful(){
	saveSuccessfulShow();
	window.setTimeout("saveSuccessfulHide()",2000);
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
	showProgress();
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
		}else if(strvalue == 'New Job'){
			obj.value = '';		
		}else if(strvalue == 'Word Search'){
			obj.value = '';		
		}else if(strvalue == 'Participant Search'){
			obj.value = '';		
		}
	}
}
function setFocus(objName){
	if(document.all){
		var obj = document.all(objName);
		if(obj!=null){
			obj.focus();	
		}	
	}else{
		var obj = document.getElementsByName(objName)[0];
		if(obj!=null){
			obj.focus();
		}
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
//AJAX Functions for getting server progress updates
var pollId;
/** Delay between requests to the server when polling. */ 
var pollDelay = 1000; 
/** Start polling the server */
function startPoll() {
	skm_LockScreen();
    pollId = setInterval(poll, pollDelay);
}   
/** Stop polling the server */
function stopPoll() {
skm_UnLockScreen()
    clearInterval(pollId);
}   
function poll() {
	getProgress();
}
/*
 * Returns a new XMLHttpRequest object, or false if this browser
 * doesn't support it
 */
function newXMLHttpRequest() {
  var xmlreq = false;
  if (window.XMLHttpRequest) {
    // Create XMLHttpRequest object in non-Microsoft browsers
    xmlreq = new XMLHttpRequest();
  } else if (window.ActiveXObject) {
    // Create XMLHttpRequest via MS ActiveX
    try {
      // Try to create XMLHttpRequest in later versions
      // of Internet Explorer
      xmlreq = new ActiveXObject("Msxml2.XMLHTTP");
    } catch (e1) {
      // Failed to create required ActiveXObject
      try {
        // Try version supported by older versions
        // of Internet Explorer
        xmlreq = new ActiveXObject("Microsoft.XMLHTTP");
      } catch (e2) {
        // Unable to create an XMLHttpRequest with ActiveX
      }
    }
  }
  return xmlreq;
}
/*
 * Gets an update of the current item being processed
 */
function getProgress() {
  // Obtain an XMLHttpRequest instance
  var req = newXMLHttpRequest();
  // Set the handler function to receive callback notifications
  // from the request object
  var handlerFunction = getReadyStateHandler(req, updateProgress);
  req.onreadystatechange = handlerFunction; 
  // Open an HTTP POST connection to the progress StudyUpdate servlet.
  // Third parameter specifies request is asynchronous.
  req.open("POST", "ProgressUpdate", true);
  // Specify that the body of the request contains form data
  req.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
  // Send form encoded data stating that I want to  
  // get an update of progress.
  req.send("action=getUpdate");
}

/*
 * Returns a function that waits for the specified XMLHttpRequest
 * to complete, then passes its XML response
 * to the given handler function.
 * req - The XMLHttpRequest whose state is changing
 * responseXmlHandler - Function to pass the XML response to
 */
function getReadyStateHandler(req, responseXmlHandler) {
  // Return an anonymous function that listens to the 
  // XMLHttpRequest instance
  return function () {
    // If the request's status is "complete"
    if (req.readyState == 4) {
      // Check that a successful server response was received
      if (req.status == 200) {
        // Pass the XML payload of the response to the 
        // handler function
        responseXmlHandler(req.responseXML);
      } else {
        // An HTTP problem has occurred
        alert("HTTP error: "+req.status);
        stopPoll();
      }
    }
  }
}
function updateProgress(progressXml) {
	// Get the root "progress" element from the document
	var progress = progressXml.getElementsByTagName("progress")[0];
	var item = progress.getAttribute("item");
	var total = progress.getAttribute("total");
	// Update the HTML element used to display the progress details
    var contents = document.getElementById("studyprogress");
    var lock = document.getElementById('skm_LockPane');
    if (parseInt(item) > parseInt(total)){
    	lock.innerHTML = "The processing is now complete."; 
    	stopPoll();	
    }else{
    	lock.innerHTML = "<div style='border:solid 1px;width:210px;background-color:lightblue;margin:0 auto;';><table><tr><td>Processing Item " + item + " of " + total + "</td></tr><tr><td><div id='progress'><div id='progress_done' style='float:left;'></div><div id='progress_todo' style='float:right;'></div></div></tr></td></table></div>";
    }
    var iDone = parseInt(item*100/total);
    progressBar(0,0,iDone);
}
// Lock the page during processing
function skm_LockScreen()
      {
         var lock = document.getElementById('skm_LockPane');
         if (lock)
            lock.className = 'LockOn';
//alert("lock on");
         
      }
      // Unlock the page after processing
      function skm_UnLockScreen()
      {
         var lock = document.getElementById('skm_LockPane');
         if (lock)
            lock.className = 'LockOff';

//alert("lock off");  
      } 
//Progress Bar      
function progressBar(iWidth,iHeight,iDone) {  
	if (iWidth != 0) {
		document.getElementById("progress").style.width = iWidth +"px";
	} else {
		document.getElementById("progress").style.width = 200 +"px";
	}
	if (iHeight != 0) {
		document.getElementById("progress").style.height = iHeight +"px";
		document.getElementById("progress_done").style.height = iHeight +"px";
		document.getElementById("progress_todo").style.height = iHeight +"px";
	} else {
		document.getElementById("progress").style.height = 20 +"px";
		document.getElementById("progress_done").style.height = 20 +"px";
		document.getElementById("progress_todo").style.height = 20 +"px";
	}
	document.getElementById("progress_done").innerHTML = iDone +"%";
	document.getElementById("progress_done").style.backgroundColor = "green";
	document.getElementById("progress_done").style.width = iDone +"%";
	document.getElementById("progress_todo").style.backgroundColor = "yellow";
	document.getElementById("progress_todo").style.width = (100 - iDone) +"%";
	if (iDone != 100) {	
		document.getElementById("progress_todo").innerHTML = "&nbsp;"		
	}else{
		if(iDone >= 100){
			refreshToMain();
		}	
	}	
}
function refreshToMain(){
	window.location = "./main.jsp";
}
function checkExistingFreetext() {
	var returnVal = true;
	var inputs = document.getElementsByTagName("input");
	var hasFreetext = false;
	var isMultiple = false;
    for(i=0;i<inputs.length;i++) {
        var input = inputs[i];
        if (input.type == "text" && input.id.match("freetext") != null) {
	        hasFreetext = true;
    	}
    	if (input.type == "checkbox" && input.id.match("isMultiple") != null && input.checked == true) {
	        isMultiple = true
    	}
    }
    if(hasFreetext && !isMultiple){
    returnVal = false;
    	alert("'Allow Multiple' must be checked to have more than one freetext answer.");
    }
    return returnVal;
}