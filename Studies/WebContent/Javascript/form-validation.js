/**
 * DHTML phone number validation script. Courtesy of SmartWebby.com (http://www.smartwebby.com/dhtml/)
 */

//Declaring required variables
var digits = "0123456789";
//non-digit characters which are allowed in phone numbers
var phoneNumberDelimiters = "()- ";
//characters which are allowed in international phone numbers
//(a leading + is OK)
var validWorldPhoneChars = phoneNumberDelimiters + "+";
//Minimum no of digits in an international phone no.
var minDigitsInIPhoneNumber = 10;
var minDigitsInIPhoneNumberMeso = 4;

function isInteger(s)
{   var i;
for (i = 0; i < s.length; i++)
{   
	// Check that current character is number.
	var c = s.charAt(i);
	if (((c < "0") || (c > "9"))) return false;
}
// All characters are numbers.
return true;
}
function trim(s)
{   var i;
var returnString = "";
// Search through string's characters one by one.
// If character is not a whitespace, append to returnString.
for (i = 0; i < s.length; i++)
{   
	// Check that current character isn't whitespace.
	var c = s.charAt(i);
	if (c != " ") returnString += c;
}
return returnString;
}
function stripCharsInBag(s, bag)
{   var i;
var returnString = "";
// Search through string's characters one by one.
// If character is not in bag, append to returnString.
for (i = 0; i < s.length; i++)
{   
	// Check that current character isn't whitespace.
	var c = s.charAt(i);
	if (bag.indexOf(c) == -1) returnString += c;
}
return returnString;
}

function checkInternationalPhone(strPhone){
	var bracket=3
	strPhone=trim(strPhone)
	if(strPhone.indexOf("+")>1) return false
	if(strPhone.indexOf("-")!=-1)bracket=bracket+1
	if(strPhone.indexOf("(")!=-1 && strPhone.indexOf("(")>bracket)return false
	var brchr=strPhone.indexOf("(")
	if(strPhone.indexOf("(")!=-1 && strPhone.charAt(brchr+2)!=")")return false
	if(strPhone.indexOf("(")==-1 && strPhone.indexOf(")")!=-1)return false
	s=stripCharsInBag(strPhone,validWorldPhoneChars);
	return (isInteger(s) && s.length >= minDigitsInIPhoneNumber);
}
function checkPhoneIs4Long(strPhone){
	return (isInteger(strPhone) && strPhone.length >= minDigitsInIPhoneNumberMeso);
}

function ValidatePhoneNumber(){
	var Phone=document.controllerpost.phoneNumber
	if (Phone.value != "") {
		if (checkPhoneIs4Long(Phone.value)==false){
			document.getElementById('phoneerr').innerHTML = '<input type=hidden name=phoneError value=true>';
			//alert("Please Enter a Valid Phone Number")
			Phone.focus()
			return false
		}
	}
}


function ValidateEmailAddress(){
	var emailAddress = document.controllerpost.emailAddress;
	var regExEmail = /^([0-9a-zA-Z]([-\.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\w]*[0-9a-zA-Z]\.)+[a-zA-Z]{2,9})$/; 
	if(emailAddress.value==''){ 
//		alert("Please enter a valid email address"); 
//		emailAddress.focus(); 
//		return false; 
	}else{
		if(!regExEmail.test(emailAddress.value)){
			alert("Please enter a valid email address"); 
			emailAddress.focus(); 
			return false; 
		} 
	} 
}

function ValidateFirstName(){
	var firstName = document.controllerpost.firstName;
	if(firstName.value==''){
		//alert("Please enter a first name"); 
	}
	firstName.focus(); 
	return false; 
}

function ValidateLastName(){
	var lastName = document.controllerpost.lastName;
	if(lastName.value==''){
		document.getElementById('nameerr').innerHTML = '<input type=hidden name=nameError value=true>';
		//alert("Please enter a last name"); 
	}
	lastName.focus(); 
	return false; 
}

function ValidateGender(){
	var genderSelection=document.controllerpost.gender;
	if(genderSelection.value==0){
		alert("Please select a gender");
		return false;
	}
}
//Participant validation

function ValidateParticipantForm(){
	//ValidateFirstName();
	ValidateLastName();
	//ValidateGender();
	ValidatePhoneNumber();
	ValidateEmailAddress();
	return true;
}

//Job History validation

function ValidateJobHistoryForm(){
	ValidateJobOccHisRefID();
	ValidateJobDescription();
	//ValidateYearStarted();
	//ValidateDurationYears();
	//ValidateWeeksperyear();
	ValidateHoursperweek();
	return true;
}
function ValidateJobOccHisRefID(){
	var selection=document.controllerpost.jobOccHisRefID;
	if(selection.value==0){
		alert("Please enter a job history id number");
		return false;
	}
}
function ValidateJobDescription(){
	var selection=document.controllerpost.jobDescription;
	if(selection.value==0){
		document.getElementById('jobdescerr').innerHTML = '<input type=hidden name=jobDescError value=true>';
		//alert("Please enter a job description");
		return false;
	}
}
function ValidateYearStarted(){
	var selection=document.controllerpost.yearStarted;
//	if(selection.value==0){
//		alert("Please enter the year started");
//		return false;
//	}
	if(!isInteger(selection.value)){
		alert("Please enter the year started");
		return false;
	}
	if(selection.value.length!=4){
		alert("Please enter a four digit year");
		return false;
	}
}
function ValidateDurationYears(){
	var selection=document.controllerpost.durationYears;
	if(selection.value==0){
		alert("Please enter the duration in years");
		return false;
	}
}
function ValidateWeeksperyear(){
	var selection=document.controllerpost.weeksPerYear;
	if(selection.value==0){
		alert("Please enter the number of weeks per year");
		return false;
	}
}
function ValidateHoursperweek(){
	var selection=document.controllerpost.hoursPerWeek;
	if(selection.value==0){
		document.getElementById('hrsperweekerr').innerHTML = '<input type=hidden name=hrsPerWeekError value=true>';
		//alert("Please enter the number of hours per week");
		return false;
	}
}
//Dirty Pages
function MarkPageDirty(){
	//alert("dirty"); 
	document.getElementById('dirtyflag').innerHTML = '<input type="hidden" name="pageDirty" value="true">Close';
	//alert("done"); 
}
function CheckDirtyPage(){
	//alert("dirty page search"); 
	var flagHtml = document.getElementById('dirtyflag').innerHTML;
	//alert(flagHtml); 
	if(flagHtml == '<input type="hidden" name="pageDirty" value="true">Close'){
		//alert("dirty page found");
		var answer = confirm ("Are you sure you want to exit before saving?");
		if (answer){
			return true;
		}
		return false;
	}
	return true; 
}
function ClearDirtyFlag(){
	//alert("clear page flag"); 
	var lastName = document.getElementById('dirtyflag').innerHTML;
	alert(lastName); 
	if(lastName != null){
		//alert("clearing dirty page");
		document.getElementById('dirtyflag').innerHTML = 'Close';
	}
}
