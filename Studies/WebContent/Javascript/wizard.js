//Generic AJAX
function AJAXInteraction(url, callback, jsonobj) {

    var req = init();                         
    req.onreadystatechange = processRequest;
        
    function init() {
      if (window.XMLHttpRequest) {
        return new XMLHttpRequest();
      } else if (window.ActiveXObject) {
        return new ActiveXObject("Microsoft.XMLHTTP");
      }
      if (true){

      }
    }
    
    function processRequest () {
      // readyState of 4 signifies request is complete
      if (req.readyState == 4) {
	// status of 200 signifies sucessful HTTP call
        if (req.status == 200) {
          if (callback) callback(req.responseXML);
        }
      }
    }

    this.doPost = function() {
      // make a HTTP POST request to the URL asynchronously
      req.open("POST", url, true);
      req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	  req.send(JSON.stringify(jsonobj));
    }
}
//Transaction specific code
function saveForm() {
    var step = document.getElementById("wizardStep");
    //alert(step.value);
    if(step.value==1){
        var txtValue = document.getElementById("studyName");
    	var jsonobj = {};
    	jsonobj.name = txtValue.value;
    }
    if(step.value==2){
        var txtValue = document.getElementById("studyDesc");
        var jsonobj = {};
    	jsonobj.description = txtValue.value;
    //alert(txtValue.value);
    }
    if(step.value==3){
        var agents = document.getElementsByTagName("input");
        var jsonobj = [{}];
        var trueCount = -1;
        for(i=0;i<agents.length;i++) {
        var agent = agents[i];
        	if (agent.type == "checkbox") {
	        	if(agent.checked == true){
	        		trueCount ++; 
	        		jsonobj[0][trueCount] = agent.id;
	        	}
        	}
        }
    }
        if(step.value==4){
        var ssjsms = document.getElementsByTagName("input");
        var jsonobj = [{}];
        var trueCount = -1;
        for(i=0;i<ssjsms.length;i++) {
        var ssjsm = ssjsms[i];
        //alert(ssjsm.type + " " + ssjsm.name);
        	if (ssjsm.type == "checkbox" && ssjsm.name != "") {
	        	if(ssjsm.checked == true){
	        		trueCount ++; 
	        		jsonobj[0][trueCount] = ssjsm.id;
	        	}
        	}
        }
    }
    if(step.value==5){
        var ssjsms = document.getElementsByTagName("input");
        var jsonobj = [{}];
        var trueCount = -1;
        for(i=0;i<ssjsms.length;i++) {
        var ssjsm = ssjsms[i];
        	if (ssjsm.type == "checkbox") {
	        	if(ssjsm.checked == true){
	        	//alert(ssjsm.type + " " + ssjms.name);
	        		trueCount ++; 
	        		jsonobj[0][trueCount] = ssjsm.id;
	        	}
        	}
        }
    }
	if(step.value==6){
	var fjsms = document.getElementsByTagName("input");
	var jsonobj = [{}];
	var trueCount = -1;
	//alert(fjsms.length);
	for(i=0;i<fjsms.length;i++) {
	//alert(fjsms[i].type);
        //var fjsm = fjsms[i];
        //alert(fjsms[i].type + " " + fjsms[i].name);
        	if (fjsms[i].type == "checkbox") {
	        	if(fjsms[i].checked == true){
	        	//alert(fjsms[i].type + " " + fjsms[i].name);
	        		trueCount ++; 
	        		jsonobj[0][trueCount] = fjsms[i].id;
	        	}
        	}
        }
    }
    var url = "StudyWiz?action=save&step=" + encodeURIComponent(step.value); 
    //alert(url);
   // alert(JSON.stringify(jsonobj));
    var ajax = new AJAXInteraction(url, studywizCallback, jsonobj);
    ajax.doPost(); 
}

function studywizCallback(responseXML) {
   var wizResponse = responseXML.getElementsByTagName("result")[0];
   var msg = wizResponse.getAttribute("message");
   var status = wizResponse.getAttribute("status");
   var updateHtml = wizResponse.getAttribute("updatehtml");
   var mdiv = document.getElementById("userMessage");
   var content = document.getElementById("wizardStepContent");
   var nextBtn = document.getElementById("next_btn");
   if (status == "valid") {
       // set the style on the div to valid
       mdiv.className = "bp_valid";
       mdiv.innerHTML = msg;
       if (updateHtml!=""){
       	content.innerHTML = updateHtml;
       }
       nextBtn.disabled = false;
    } else {
       // set the style on the div to invalid
       mdiv.className = "bp_invalid";
       mdiv.innerHTML = msg;
       nextBtn.disabled = true;
    }  
}
 
function nextForm() { 
    var step = document.getElementById("wizardStep");
    //alert(step.value);
    var url = "StudyWiz?action=next&step=" + encodeURIComponent(step.value); 
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback); 
    ajax.doPost(); 
}

function backForm() {
    var step = document.getElementById("wizardStep");
    var url = "StudyWiz?action=back&step=" + encodeURIComponent(step.value); 
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback); 
    ajax.doPost(); 
}

function finishForm() {
	var answer = confirm("Are you sure you want to finish now?");
	if (!answer){
		return false;
	}
    var url = "StudyWiz?action=finish";
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizFinishCallback);
    ajax.doPost();
}

function studywizNextCallback(responseXML) {
   var wizResponse = responseXML.getElementsByTagName("result")[0];
   var msg = wizResponse.getAttribute("message");
   var nextStep = wizResponse.getAttribute("step");
   var stepHtml = wizResponse.getAttribute("stepHtml");
   var step = document.getElementById("wizardStep");
   var wizStepContent = document.getElementById("wizardStepContent");
   var mdiv = document.getElementById("userMessage");
   var nextBtn = document.getElementById("next_btn");
   //var backBtn = document.getElementById("back_btn");
   //backBtn.disabled = false;
   nextBtn.disabled = true;
   mdiv.className = "bp_valid";
   mdiv.innerHTML = msg;
   wizStepContent.innerHTML = stepHtml;
   step.value = nextStep;
   //if (nextStep==1){
   //	backBtn.disabled = true;
   //}else{
   //	backBtn.disabled = false;
   //}
}  
function studywizFinishCallback(responseXML) {
	var wiz = document.getElementById('study_wiz');
	wiz.className = 'nowiz';
	var lock = document.getElementById('skm_LockPane');
	if (lock){
		lock.className = 'LockOff';
	}
	window.location = "/Studies";
}
function editStudyJsm(jsmId) {
//alert(jsmId);
    var url = "StudyWiz?action=editStudyJsm&jsmId=" + jsmId; 
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback); 
    ajax.doPost(); 
}
function editQuestion() {
        var questions = document.getElementsByTagName("input");
        var questionNo = "";
        var trueCount = 0;
        //alert(questions.length);
        for(i=0;i<questions.length;i++) {
        var question = questions[i];
        	if (question.type == "checkbox") {
	        	if(question.checked == true){
	        	//alert(question.type + " " + question.name);
	        		trueCount ++;
	        		if(trueCount > 1){
	        			alert("Select one question only");
        				return false;
        			} 
	        		questionNo = question.id;
	        	}
        	}
        }
    var url = "StudyWiz?action=editQuestion&step=5&questionNo=" + questionNo;
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}
function addProbQuestion() {
	var url = "StudyWiz?action=addProbQuestion";
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}
function addFreqQuestion() {
	var url = "StudyWiz?action=addFreqQuestion";
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}
function moveUp() {
        var qoras = document.getElementsByTagName("input");
        var qoraNo = "";
        var qoraType = "possanswer";
        var trueCount = 0;
        //alert(qoras.length);
        for(i=0;i<qoras.length;i++) {
        var qora = qoras[i];
        	if (qora.type == "checkbox") {
	        	if(qora.checked == true){
	        	//alert(qora.type + " " + qora.name);
	        	if (qora.name.match("questions") != null){
	        		qoraType = "question";
	        	}
	        		trueCount ++;
	        		if(trueCount > 1){
	        			alert("Select one question or answer only");
        				return false;
        			}
        			qoraNo = qora.id;
	        	}
        	}
        }
        if(trueCount < 1){
	        alert("Select at least one question or answer");
        	return false;
        }
    var url = "StudyWiz?action=moveUp&step=5&qoraNo=" + qoraNo + "&qoraType=" + qoraType;
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}
function moveDown() {
        var qoras = document.getElementsByTagName("input");
        var qoraNo = "";
        var qoraType = "possanswer";
        var trueCount = 0;
        //alert(qoras.length);
        for(i=0;i<qoras.length;i++) {
        var qora = qoras[i];
        	if (qora.type == "checkbox") {
	        	if(qora.checked == true){
	        	//alert(qora.type + " " + qora.name);
	        	if (qora.name.match("questions") != null){
	        		qoraType = "question";
	        	}
	        		trueCount ++;
	        		if(trueCount > 1){
	        			alert("Select one question or answer only");
        				return false;
        			}
        			qoraNo = qora.id;
	        	}
        	}
        }
        if(trueCount < 1){
	        alert("Select at least one question or answer");
        	return false;
        }
    var url = "StudyWiz?action=moveDown&step=5&qoraNo=" + qoraNo + "&qoraType=" + qoraType;
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}
function deleteQuestion() {
        var qoras = document.getElementsByTagName("input");
        var qoraNo = "";
        var qoraType = "possanswer";
        var trueCount = 0;
        //alert(qoras.length);
        for(i=0;i<qoras.length;i++) {
        var qora = qoras[i];
        	if (qora.type == "checkbox") {
	        	if(qora.checked == true){
	        	//alert(qora.type + " " + qora.name);
	        	if (qora.name.match("questions") != null){
	        		qoraType = "question";
	        	}
	        		trueCount ++;
	        		if(trueCount > 1){
	        			alert("Select one question or answer only");
        				return false;
        			}
        			qoraNo = qora.id;
	        	}
        	}
        }
        if(trueCount < 1){
	        alert("Select at least one question or answer");
        	return false;
        }
    var url = "StudyWiz?action=deleteqora&qoraNo=" + qoraNo + "&qoraType=" + qoraType;
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}
function linkAjsm() {
        var possanswers = document.getElementsByTagName("input");
        var possanswerNo = "";
        var trueCount = 0;
        //alert(possanswers.length);
        for(i=0;i<possanswers.length;i++) {
        var possanswer = possanswers[i];
        	if (possanswer.type == "checkbox") {
	        	if(possanswer.checked == true){
	        	//alert(possanswer.type + " " + possanswer.name);
	        		trueCount ++;
	        		if(trueCount > 1){
	        			alert("Select one possible answer only");
        				return false;
        			}else if(possanswer.name.match("possible") == null){
        				alert("Select a possible answer");
        				return false;
        			}
	        		possanswerNo = possanswer.id;
	        	}
        	}
        }
  		if(trueCount < 1){
	        alert("Select at least one possible answer");
        	return false;
        }
    var url = "StudyWiz?action=linkAjsm&step=5&possanswerNo=" + possanswerNo;
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}

function importAjsm(ajsmId){
//alert("importAjsm " + ajsmId);
    var url = "StudyWiz?action=importAjsmToAnswer&step=5&ajsmId=" + ajsmId;
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}

function reviewfjsm(fjsmId){
    var url = "StudyWiz?action=reviewfjsm&step=7&fjsmId=" + fjsmId;
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}

function closeWindow(window){
//alert(window);
    var url = "StudyWiz?action=closeWindow&step=7&window=" + window;
    //alert(url);
    var ajax = new AJAXInteraction(url, studywizNextCallback);
    ajax.doPost(); 
}

//Utility Code
function toggleAllCheckboxes(boxname) {
//alert(boxname);
	var inputs = document.getElementsByTagName("input");
    for(i=0;i<inputs.length;i++) {
        var input = inputs[i];
        if (input.type == "checkbox" && input.name.match(boxname) != null) {
	        if(input.checked == true){
	        	input.checked = false; 
	        }else {
	        	input.checked = true;
	        }
    	}
    }
}