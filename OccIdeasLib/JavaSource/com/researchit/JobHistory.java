/**
 * Version:
 *     $Id: JobHistory.java,v 1.72 2009/02/04 22:44:08 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: JobHistory.java,v $
 *     Revision 1.72  2009/02/04 22:44:08  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.71  2009/01/05 06:54:02  troy.sadkowsky
 *     default first jobhistory reference number to 1
 *
 *     Revision 1.70  2008/12/23 10:32:24  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.69  2008/11/25 23:29:06  troy.sadkowsky
 *     speed enhancements
 *
 *     Revision 1.68  2008/11/15 09:08:59  troy.sadkowsky
 *     various bug fixes and code cleaning
 *
 *     Revision 1.67  2008/11/14 09:14:40  troy.sadkowsky
 *     usability updates
 *
 *     Revision 1.66  2008/10/20 05:26:55  Troy.Sadkowsky
 *     validation updates speed enhancement
 *
 *     Revision 1.65  2008/10/03 02:57:30  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.64  2008/09/20 08:59:29  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.63  2008/09/15 03:07:42  troy.sadkowsky
 *     new filter capabiities
 *
 *     Revision 1.62  2008/09/12 02:40:17  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.61  2008/09/10 09:11:35  troy.sadkowsky
 *     ASsessment updates
 *
 *     Revision 1.60  2008/09/03 07:35:24  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.59  2008/08/25 01:37:21  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.58  2008/08/20 03:36:35  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.57  2008/08/11 01:50:52  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.56  2008/07/23 00:14:40  troy.sadkowsky
 *     flat file frozen jsm
 *
 *     Revision 1.55  2008/06/02 04:35:15  ray.welburn
 *     Additional validation on participant and job history for numbers
 *
 *     Revision 1.54  2008/06/01 11:59:10  ray.welburn
 *     Add lastupdated to participant on job history update and assessment run
 *
 *     Revision 1.53  2008/06/01 09:37:01  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.52  2008/05/30 01:53:19  troy.sadkowsky
 *     added revision log
 *
 *     Revision 1.2  2008/05/26 08:22:05  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//import java.util.Collections;


import com.researchit.common.DBBaseObject;
import com.researchit.common.Participant;
import com.researchit.common.Study;
import com.researchit.html.OccCalendar;


public class JobHistory extends DBBaseObject {

    private int age;
    private Integer priority = 99;
    private String jobTitle;
    private String participantId;
    private Integer yearStarted = 0;
	private Integer daysperweek = -1;
    private float durationYears;
    private Date startDate;
    private Date finishDate;
    private String startMonth = "0";
    private String startYear = "0";
    private String finishMonth = "0";
    private String finishYear = "0";
    private String employer;
    private String JSM;
    private String finalJSMId;
    private String finalJSMName;
    private float weeksPerYear;   
    private float hoursPerWeek;
    private String street;
	private String suburb;
    private String state;
    private String country;
    private String jobDescription;
    private String comments;
    private String statusId = JobHistoryStatus.TOBEREVIEWED;
    private String referenceNumber = "1";
    private String participantReferenceNumber;
    private ArrayList<JobSpecificModule> jsms;
    private ArrayList<Interview> interviews;   
    private ArrayList<Assessment> assessments;   
    private String errorMessage = "";

        
/*	public ArrayList<JobHistoryDetail> getDetail() {
		return detail;
	}
	public void setDetail(ArrayList<JobHistoryDetail> detail) {
		this.detail = detail;
	}*/
/*	public boolean isShiftWork() throws Exception{
		for (JobHistoryColumn col : this.getColumn()){
			if (col.getName().toLowerCase().contains("shift")){
				if (col.getValue() != null) {
					if (col.getValue().equals("1")){
				return true;
					}
				}
			}
		}
		return false;
	}
	public String frequentFlyerStatus() {
		for (JobHistoryColumn col : this.getColumn()){
			if (col.getName().contains("FFlyer") && col.getValue().equals("True")){
				return "True";
			}
			if (col.getName().contains("FFlyer") && col.getValue().equals("No Job Number!")){
				return "No Job Number!";
			}
			if (col.getName().contains("FFlyer") && col.getValue().equals("HighValue")){
				return "HighValue";
			}
		}
		return "false";
	}
	public ArrayList<JobHistoryColumn> getColumn() {
		return column;
	}
	public void setColumn(ArrayList<JobHistoryColumn> column) {
		this.column = column;
	}*/
    
    public JobHistory() {
        super();

    }
    public JobHistory(String id) throws Exception {
        super();
        this.setId(id);
        this.getPersistentObject();
    }
    
    
	public String getName() {		
		return this.getReferenceNumber();
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
    	return errorMessage;
    }    
/*    public ArrayList<JobHistoryTask> getJobHistorytasks() {
        if (this.jobHistoryTasks == null) {
            this.jobHistoryTasks = new ArrayList<JobHistoryTask>();
        }
        return jobHistoryTasks;
    }
    public void setJobtasks(ArrayList<JobHistoryTask> jobtasks) {
        this.jobHistoryTasks = jobtasks;
    }*/
    public String getState() {
        if (this.state == null) {
            this.state = "";
        }else if(this.state.equalsIgnoreCase("NULL")){
        	this.state = "";
        }
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getSuburb() {
        if (this.suburb == null) {
            this.suburb = "";
        }else if(this.suburb.equalsIgnoreCase("NULL")){
        	this.suburb = "";
        }
        return suburb;
    }
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }
    public Date getStartDate() {
		return startDate;
	}
	public int getStartYearInt() {
		if (this.getStartYear() == null || this.getStartYear().equalsIgnoreCase("")) {
			return 0;
		}else if(this.getStartYear().equalsIgnoreCase("unknown")){
			return -1;
		}else{
			return Integer.parseInt(this.getStartYear());
		}
	}
	public int getStartMonthInt() {
		if (this.getStartMonth() == null || this.getStartMonth().equalsIgnoreCase("")) {
			return 0;
		}else if(this.getStartMonth().equalsIgnoreCase("unknown")){
			return -1;
		}else{
			return Integer.parseInt(this.getStartMonth());
		}
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public void setStartDate(String from) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			if (from != null) {
				this.setStartDate(df.parse(from));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public int getFinishYearInt() {
		if (this.getFinishYear() == null || this.getFinishYear().equalsIgnoreCase("")) {
			return 0;
		}else if(this.getFinishYear().equalsIgnoreCase("unknown")){
			return -1;
		}else{
			return Integer.parseInt(this.getFinishYear());
		}
	}
	public int getFinishMonthInt() {
		if (this.getFinishMonth() == null || this.getFinishMonth().equalsIgnoreCase("")) {
			return 0;
		}else if(this.getFinishMonth().equalsIgnoreCase("unknown")){
			return -1;
		}else{
			return Integer.parseInt(this.getFinishMonth());
		}
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	public void setFinishDate(String to) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			if (to != null) {
				this.setFinishDate(df.parse(to));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getFinalJSMId() {
        if (this.finalJSMId == null) {
            this.finalJSMId = "NULL";
        }else if(this.finalJSMId.equalsIgnoreCase("")){
        	this.finalJSMId = "NULL";
        }
        return finalJSMId;
    }
    public void setFinalJSMId(String finalJSMId) {
        if (finalJSMId != null) {
            if (finalJSMId.equalsIgnoreCase("None")) {
                finalJSMId = null;
            }
        }
        this.finalJSMId = finalJSMId;
    }

    public void getPersistentObject() throws Exception {
        String strSQL = "SELECT id, age, priority, yearstarted, durationyears, employer, jobtitle, "
        		+ "street, start_date, finish_date,  start_month, start_year, end_month, end_year, "
                + " participantid, finaljsmid, ifinaljsmfrozen, weeksperyear, hoursperweek, suburb, state, country, "
                + " description, comments, jobdescription, jobhistorystatusid, referencenumber "
                + " FROM jobhistory WHERE id = "
                + this.getId();
        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    this.setId(rs.getString("id"));
                    this.setAge(rs.getInt("age"));
                    this.setPriority(rs.getInt("priority"));
                    this.setYearStarted(rs.getInt("yearstarted"));
                    this.setDurationYears(rs.getFloat("durationyears"));
                    this.setEmployer(rs.getString("employer"));
                    this.setJobTitle(rs.getString("jobtitle"));
                    this.setParticipantId(rs.getString("participantid"));
                    this.setFinalJSMId(rs.getString("finaljsmid"));
                    this.setWeeksPerYear(rs.getFloat("weeksperyear"));
                    this.setHoursPerWeek(rs.getFloat("hoursperweek"));
                    this.setSuburb(rs.getString("suburb"));
                    this.setState(rs.getString("state"));
                    this.setCountry(rs.getString("country"));
                    this.setDescription(rs.getString("description"));
                    this.setComments(rs.getString("comments"));
                    this.setJobDescription(rs.getString("jobdescription"));
                    this.setStatusId(rs.getString("jobhistorystatusid"));
                    this.setReferenceNumber(rs.getString("referencenumber"));
                    this.setStreet(rs.getString("street"));
                    this.setStartDate(rs.getDate("start_date"));
                    this.setFinishDate(rs.getDate("finish_date"));
                    this.setStartMonth(rs.getString("start_month"));
                    this.setStartYear(rs.getString("start_year"));
                    this.setFinishMonth(rs.getString("end_month"));
                    this.setFinishYear(rs.getString("end_year"));
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
//      get frozen jsm name if started
        if (!(this.getFinalJSMId().equalsIgnoreCase(""))) {
            JobSpecificModule fjsm = new JobSpecificModule(this.getFinalJSMId());
            this.setFinalJSMName(fjsm.getName());
        }
//      get all tasks
        //this.getPersistentTaskObjects();
        
    }

	public String getStartMonth() {
		String result = startMonth.equals("-1")?"Unknown":startMonth;
		return result;
	}
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}
	public String getStartYear() {
		String result = startYear.equals("-1")?"Unknown":startYear;
		return result;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getFinishMonth() {
		String result = finishMonth.equals("-1")?"Unknown":finishMonth;
		return result;
	}
	public void setFinishMonth(String finishMonth) {
		this.finishMonth = finishMonth;
	}
	public String getFinishYear() {
		String result = finishYear.equals("-1")?"Unknown":finishYear;
		return result;
	}
	public void setFinishYear(String finishYear) {
		this.finishYear = finishYear;
	}
	/*    private void getPersistentTaskObjects() throws Exception {
        String strSQL = "SELECT id,name,description,jobhistoryid FROM task WHERE jobhistoryid = " + this.getId();       
        try {
        	ResultSet rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                this.jobHistoryTasks = new ArrayList<JobHistoryTask>();
                while (rs.next()) {
                    JobHistoryTask jt = new JobHistoryTask();
                    jt.setId(rs.getString("id"));
                    jt.setName(rs.getString("name"));
                    jt.setDescription(rs.getString("description"));
                    jt.setJobHistoryId(rs.getString("jobhistoryid"));
                    this.jobHistoryTasks.add(jt);
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
    }*/
    private void getPersistentInterviewObjects() throws Exception {
        this.interviews = new ArrayList<Interview>();
        String strSQL = "SELECT id FROM jsminterview WHERE jobhistoryid = " + this.getId()+ " ORDER BY id";
        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String id = rs.getString("id");
                    Interview interview = new Interview();
                    interview.setId(id);
                    this.interviews.add(interview);
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        for(Interview interview : this.interviews){
        	interview.getPersistentObject();
        }
    }
    public String getEmployer() {
        if (this.employer == null){
            this.employer = "";
        }else if(this.employer.equalsIgnoreCase("NULL")){
        	this.employer = "";
        }
        return employer;
    }
    public void setEmployer(String employer) {
        this.employer = employer;
    }
    public String getJobTitle() {
    	if (this.jobTitle == null){
            this.jobTitle = "";
        }else if(this.jobTitle.equalsIgnoreCase("NULL")){
        	this.jobTitle = "";
        }
        return jobTitle;
    }
    public void setJobTitle(String jobtitle) {
        this.jobTitle = jobtitle;
    }
    public void update() throws Exception {
    	Participant p = new Participant(Long.parseLong(this.getParticipantId()));
    	OccCalendar now = new OccCalendar();
    	p.setLastUpdated(now.getDatabaseFormatDate());
    	p.save();
    	//p.update();
        boolean updating = exists();
        String sql;
        if (updating) {
            sql = "UPDATE jobhistory SET age="
                    + this.getAge()
                    + ", priority="
                    + this.getPriority()
                    + ", yearstarted="
                    + this.getYearStarted()
                    + ", durationyears="
                    + this.getDurationYears()
                    + ", employer='"
                    + this.escapeSpecialCharacters(this.getEmployer())
                    + "', jobtitle='"
                    + this.getJobTitle()
                    + "', participantid="
                    + this.getParticipantId()
                    + ", finaljsmid="
                    + this.getFinalJSMId()
                    + ", weeksperyear="
                    + this.getWeeksPerYear()
                    + ", hoursperweek="
                    + this.getHoursPerWeek()
                    + ", suburb='"
                    + this.escapeSpecialCharacters(this.getSuburb())
                    + "', state='"
                    + this.escapeSpecialCharacters(this.getState())
                    + "', country='"
                    + this.escapeSpecialCharacters(this.getCountry())
                    + "', description='"
                    + this.escapeSpecialCharacters(this.getDescription())
                    + "', comments='"
                    + this.escapeSpecialCharacters(this.getComments())
                    + "', jobdescription='"
                    + this.escapeSpecialCharacters(this.getJobDescription())
                    + "', jobhistorystatusid="
                    + this.getStatusId()
                    + ", referencenumber='"
                    + this.escapeSpecialCharacters(this.getReferenceNumber())
                    + "', street='"
                    + this.escapeSpecialCharacters(this.getStreet())
                    + "', start_date="
                    + null//Utility.dateToSQL(this.getStartDate())
                    + ", finish_date="
                    + null//Utility.dateToSQL(this.getFinishDate())
                    + ", start_month='"
                    + this.getStartMonth()
                    + "', start_year='"
                    + this.getStartYear()
                    + "', end_month='"
                    + this.getFinishMonth()
                    + "', end_year='"
                    + this.getFinishYear()
                    + "' WHERE id="
                    + this.getId();
            this.sqlExecuteUpdate(sql);
        } else {
            sql = "INSERT INTO jobhistory (age, priority, yearstarted, durationyears, employer, jobtitle, participantid, finaljsmid, weeksperyear, hoursperweek, suburb, state, country, description, comments, jobdescription, jobhistorystatusid, referencenumber, street, start_date, finish_date, start_month, start_year, end_month, end_year) "
                    + "VALUES ("
                    + this.getAge()
                    + ", "
                    + this.getPriority()
                    + ", "
                    + this.getYearStarted()
                    + ", "
                    + this.getDurationYears()
                    + ", '"
                    + this.escapeSpecialCharacters(this.getEmployer())
                    + "', '"
                    + this.getJobTitle()
                    + "', "
                    + this.getParticipantId()
                    + ", "
                    + this.getFinalJSMId()
                    + ", "
                    + this.getWeeksPerYear()
                    + ", "
                    + this.getHoursPerWeek()
                    + ", '"
                    + this.escapeSpecialCharacters(this.getSuburb())
                    + "', '"
                    + this.escapeSpecialCharacters(this.getState())
                    + "', '"
                    + this.escapeSpecialCharacters(this.getCountry())
                    + "', '"
                    + this.escapeSpecialCharacters(this.getDescription())
                    + "', '"
                    + this.escapeSpecialCharacters(this.getComments())
                    + "', '"
                    + this.escapeSpecialCharacters(this.getJobDescription())
                    + "', "
                    + this.getStatusId()
                    + ", '"
                    + this.escapeSpecialCharacters(this.getReferenceNumber())
            		+ "', '"
            		+ this.escapeSpecialCharacters(this.getStreet())
            		+ "', "
            		+ null//"''"//Utility.dateToSQL(this.getStartDate())
            		+ ", "
            		+ null//Utility.dateToSQL(this.getFinishDate())
            		+ ", '"
                    + this.getStartMonth()
                    + "', '"
                    + this.getStartYear()
                    + "', '"
                    + this.getFinishMonth()
                    + "', '"
                    + this.getFinishYear()
            		+"')";

            this.setId(this.sqlExecuteInsert(sql).toString());
        }
    }
    public boolean exists() throws Exception {
        boolean bRetValue = false;
        if (!(this.getId().equalsIgnoreCase(""))) {
            bRetValue = true;
        } 
        return bRetValue;
    }
    public String getParticipantId() {
        return participantId;
    }
    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }
    public String getJSM() throws Exception {
        /*JobTitle job = new JobTitle(this.getJobTitle());
        JSM = job.getJsmName();*/
        return JSM;
    }
    public void setJSM(String jsm) {
        JSM = jsm;
    }
/*    public String getJobName() throws Exception {
        String strName = "";
        if (this.getJobTitle() != null) {
            if (!(this.getJobTitle().equalsIgnoreCase(""))) {
                JobTitle job = new JobTitle(this.getJobTitleId());
                strName = job.getDescription();
            }
        }
        return strName;
    }*/
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAgeAsString(String age) {   	  		
    	try {
    		this.age = Integer.valueOf(age); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   	
    }
    public float getDurationYears() {
        return durationYears;
    }
    public void setDurationYears(float durationYears) {
        this.durationYears = durationYears;
    }
    public float getHoursPerWeek() {
        return hoursPerWeek;
    }
    public void setHoursPerWeek(float hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
    public Integer getPriority() {
        return priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public Integer getYearStarted() {
        return yearStarted;
    }
    public void setYearStarted(Integer yearStarted) {
        this.yearStarted = yearStarted;
    }
    public String getJobDescription() {
        if (this.jobDescription == null) {
            this.jobDescription = "";
        }else if(this.jobDescription.equalsIgnoreCase("NULL")){
        	this.jobDescription = "";
        }
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
/*    public JobTitle getMappedJob() throws Exception {
        JobTitle job = null;
        if (!(this.getJobTitleId().equalsIgnoreCase(""))) {
            job = new JobTitle(this.getJobTitleId());
        }
        return job;
    }
    public String getMappedJobName() throws Exception {
        String strRetValue = "";
        if ((this.getJobTitleId().equalsIgnoreCase(""))||(this.getJobTitleId().equalsIgnoreCase("NULL"))) {
            String strSQL = "SELECT id,name FROM jobtitle WHERE name = '"
                    + this.escapeSpecialCharacters(getJobDescription())
                    + "'";
            ResultSet rs = null;
            try {
                rs = this.sqlExecuteSelect(strSQL);
                if (rs != null) {
                    if (rs.next()) {
                        strRetValue = rs.getString("name");
                        this.setJobTitleId(rs.getString("id"));
                    }
                    if (rs.getStatement() != null) {
                        rs.getStatement().close();
                    }
                    rs.close();
                }
                // find via tasks
                if ((this.getJobTitleId().equalsIgnoreCase(""))||(this.getJobTitleId().equalsIgnoreCase("NULL"))) {
                    for(JobTitle jt:this.getJobMappingSuggestions()){
                    	strRetValue = jt.getName();
                    	this.setJobTitleId(jt.getId());
                    	break;
                    }
                }
            } catch (SQLException e) {
                throw new Exception(e.getMessage());
            } finally {
                this.closeConnection();
            }
        } else {
            JobTitle job = new JobTitle(this.getJobTitleId());
            strRetValue = job.getName();
        }
        return strRetValue;
    }*/
/*    public String getMappedJSMName() throws Exception {
        String strRetValue = "";
        if (!(this.getJobTitleId().equalsIgnoreCase(""))) {
            JobTitle job = new JobTitle(this.getJobTitleId());
            strRetValue = job.getJsmName();
        }
        return strRetValue;
    }*/
    public void removeTasks() throws Exception {
        String strSQL = "";
        try {
            strSQL = "DELETE FROM task WHERE jobhistoryid = " + this.getId();
            this.sqlExecuteUpdate(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public void delete() throws Exception {
        String strSQL = "";
        try {        	
            strSQL = "DELETE FROM jsminterview WHERE jobhistoryid = " + this.getId();
            this.sqlExecuteUpdate(strSQL);
            strSQL = "DELETE FROM jobhistory WHERE id = " + this.getId();
            this.sqlExecuteUpdate(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }   
    public ArrayList<Interview> getInterviews() throws Exception {
        if (this.interviews == null) {
            this.getPersistentInterviewObjects();
        }
        return interviews;
    }
    public void setInterviews(ArrayList<Interview> interviews) {
        this.interviews = interviews;
    }
    public Interview getCurrentInterview() throws Exception {
        Interview interview = null;
        for (Interview intrvw : this.getInterviews()) {
            interview = intrvw;
        }
        return interview;
    }
    public Interview getCurrentInterview(String fjsmId) throws Exception {
        Interview interview = null;
        for (Interview intrvw : this.getInterviews()) {
        	if(fjsmId.equalsIgnoreCase(intrvw.getFrozenJsmId())){
        		interview = intrvw;
        	}          
        }
        return interview;
    }
//    public int getFinalJSMRootQuestionCount(String strChemID) throws Exception {
//        int iCount = 0;
 //       if (!(this.getFinalJSMId().equalsIgnoreCase(""))) {
//           JobSpecificModule jsm = new JobSpecificModule(this.getFinalJSMId());
//            iCount = jsm.getMjsmsQuestionsCount(strChemID);
 //       }
 //       return iCount;
 //   }
    public String getStatusId() {
        if (this.statusId == null) {
            this.statusId = "1";
        }
        return statusId;
    }
    public void setStatusId(String status) {
        this.statusId = status;
    }
    public String getReferenceNumber() {
        if (this.referenceNumber == null) {
            this.referenceNumber = "&lt;not set&gt;";
        }else if(this.referenceNumber.equalsIgnoreCase("NULL")){
        	this.referenceNumber = "&lt;not set&gt;";
        }
        return referenceNumber;
    }
    public void setReferenceNumber(String occHisRefID) {
        this.referenceNumber = occHisRefID;
    }
    public void saveAssement(String chemicalid, String exposure, String level, String weeks, String hours, String dontknow, String username, String userid,String comments)
            throws Exception {
        String sql = "DELETE FROM agentassessments WHERE agentid = "
                + chemicalid
                + " AND jobhistoryid = "
                + this.getId();
        this.sqlExecuteUpdate(sql);
        sql = "INSERT INTO agentassessments (jobhistoryid,agentid,exposure,level,frequencyweeks,frequencyhours,dontknow,assessorusername,comments) "
                + "VALUES ("
                + this.getId()
                + ", "
                + chemicalid
                + ", '"
                + exposure
                + "', '"
                + level
                + "', '"
                + weeks
                + "', '"
                + hours
                + "','"
                + dontknow
                + "','"
                + username
                + "','"+this.escapeSpecialCharacters(comments)+"')";
        this.sqlExecuteInsert(sql);       
    }
    public boolean isAllManuallyAssessed(Study study) throws Exception {
    	boolean retValue = true;
    	//Participant p = new Participant(Long.valueOf(this.getParticipantId()));
    	//Study study = new Study(p.getStudyId());	
		for(Agent agent: study.getAgents()){
			if(!(this.isAgentAssessedManual(agent.getId()))){
				retValue = false;
				break;
			}
		}
		return retValue;
	}
    public void removeAssessment(String chemicalid) throws Exception {
    	OccCalendar now = new OccCalendar();
        String sql = "DELETE FROM agentassessments WHERE agentid = "
                + chemicalid
                + " AND jobhistoryid = "
                + this.getId() +" AND assessorusername<>'OccIDEAS'";
        this.sqlExecuteUpdate(sql);
        Participant p = new Participant(Long.valueOf(this.getParticipantId()));
        p.setStatusId(ParticipantStatus.ASSESSMENTINCOMPLETE);
        p.setLastUpdated(now.getDatabaseFormatDateTime());
    	p.save();
    }
    public String getCountry() {
    	if (this.country == null) {
            this.country = "";
        }else if(this.country.equalsIgnoreCase("NULL")){
        	this.country = "";
        }
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getComments() {
    	if (this.comments == null) {
            this.comments = "";
        }else if(this.comments.equalsIgnoreCase("NULL")){
        	this.comments = "";
        }
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public ArrayList<JobSpecificModule> getJsms() throws Exception {
        if (this.jsms == null) {
            this.getPersistentJSMs();
        }
        return jsms;
    }
    private void getPersistentJSMs() throws Exception {
        JobSpecificModule jsm = new JobSpecificModule();
        String strSQL = "SELECT DISTINCT jsm.id FROM jobhistory"
                + " INNER JOIN participant ON jobhistory.participantid = participant.id"
                + " INNER JOIN studyjsms ON participant.studyid = studyjsms.studyid"
                + " INNER JOIN jsm ON studyjsms.jsmid = jsm.id" 
                + " WHERE (jobhistory.id = "+this.getId()+") AND jsm.jsmtypeid = 1";
        this.jsms = jsm.getJobSpecificModules(strSQL);
    }
    public void setJsms(ArrayList<JobSpecificModule> jsms) {
        this.jsms = jsms;
    }
    public String getFinalJSMName() {
        return finalJSMName;
    }
    public void setFinalJSMName(String finalJSMName) {
        this.finalJSMName = finalJSMName;
    }
    public boolean isAgentAssessedBy(String id,String assessor) throws Exception {
        String strSQL = "SELECT id "
                + " FROM agentassessments "
                + " WHERE (jobhistoryid = "
                + this.getId()
                + ") AND (agentid = "
                + id
                + ") AND assessorusername = '"+assessor+"'";
        ResultSet rs = null;
        boolean retValue = false;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    retValue = true;
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        return retValue;
    }
    public boolean isAgentAssessedAuto(String agentId) throws Exception {
        String strSQL = "SELECT id "
                + " FROM agentassessments "
                + " WHERE (jobhistoryid = "
                + this.getId()
                + ") AND (agentid = "
                + agentId
                + ") AND assessorusername = 'OccIDEAS'";
        ResultSet rs = null;
        boolean retValue = false;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    retValue = true;
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        return retValue;
    }
    public boolean isAgentAssessedManual(String agentId) throws Exception {
        String strSQL = "SELECT id "
                + " FROM agentassessments "
                + " WHERE (jobhistoryid = "
                + this.getId()
                + ") AND (agentid = "
                + agentId
                + ") AND assessorusername <> 'OccIDEAS'";
        ResultSet rs = null;
        boolean retValue = false;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    retValue = true;
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        return retValue;
    }
    public String getStatusName() throws Exception {
    	JobHistoryStatus jhs = new JobHistoryStatus(this.getStatusId());
        return jhs.getName();
    }

	public ArrayList<JobHistory> getJobHistories(String sql) throws Exception {
		ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(sql);
            if (rs != null) {
                while (rs.next()) {
                    JobHistory jh = new JobHistory();
                    jh.setId(rs.getString("id"));
                    jh.setReferenceNumber("referencenumber");
                    jhs.add(jh);
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        //for(JobHistory jh: jhs){
        //	jh.getPersistentObject();
        //}
        return jhs;
	}

//	public List<JobHistoryStatus> getStatuses(String strFilter) throws Exception {
//		List<JobHistoryStatus> statuses = new ArrayList<JobHistoryStatus>();
//		String strSQL = "";
//		ResultSet rs = null;
//		try {
//			strSQL = "SELECT id,name,description FROM jobhistorystatus "+strFilter;
//			rs = this.sqlExecuteSelect(strSQL);
//			while (rs.next()) {
//				JobHistoryStatus status = new JobHistoryStatus();
//				status.setId(rs.getString("id"));
//				status.setName(rs.getString("name"));
//				status.setDescription(rs.getString("description"));
//				statuses.add(status);
//			}
//			if (rs.getStatement() != null) {
//				rs.getStatement().close();
//			}
//			rs.close();	
//		} catch (SQLException e) {
//			throw new Exception(e.getMessage());
//		} finally {
//			this.closeConnection();
//		}
//		return statuses;
//	}

/*	public ArrayList<JobTitle> getJobMappingSuggestions() throws Exception{
		ArrayList<JobTitle> retValue = new ArrayList<JobTitle>();
//		String whereCondition = "WHERE ";
//		for(JobHistoryTask jht:this.getJobHistorytasks()){
//			String strName = jht.getName();
//			for(String word:strName.split(" ")){
//				whereCondition += " (keyword.name LIKE '%"+this.escapeSpecialCharacters(word)+"%') OR";
//			}
//		}
//		if(whereCondition.contains("OR")){
//			whereCondition = whereCondition.substring(0,whereCondition.lastIndexOf("OR"));
//			String sql = "SELECT COUNT(jobtitle.id) AS theCount, keyword.jobtitleid AS id" +
//					" FROM  keyword" +
//					" INNER JOIN jobtitle ON keyword.jobtitleid = jobtitle.id " 
//					+ whereCondition +
//					" GROUP BY keyword.jobtitleid ORDER BY theCount DESC";
//			JobTitle jt = new JobTitle();
//			retValue = jt.getJobTitles(sql);
//		}	
		
		ArrayList<JobHistoryTask> newListJHTs = new ArrayList<JobHistoryTask>();
		for(JobHistoryTask jht:this.getJobHistorytasks()){
			for(String word:jht.getName().split(" ")){
				JobHistoryTask njht = new JobHistoryTask();
				njht.setName(word);
				if(!(njht.isCommonWord())){
					newListJHTs.add(njht);
				}
			}	
		}
		JobTitle jtAll = new JobTitle();
		String sql = "SELECT id FROM jobtitle";
		for(JobTitle jt:jtAll.getJobTitles(sql)){
			int iCount = 0;
			for(Keyword kw: jt.getKeywords()){
				if(newListJHTs.contains(kw)){
					iCount++;
				}
			}
			if(iCount!=0){
				jt.setCount(iCount);
				retValue.add(jt);
			}
		}
		Collections.sort(retValue);
		return retValue;
	}*/
	public float getWeeksPerYear() {
		return weeksPerYear;
	}

	public void setWeeksPerYear(float weeksPerYear) {
		this.weeksPerYear = weeksPerYear;
	}

//	public Assessment getAssessment(String agentID) throws Exception {
//		Assessment retValue = new Assessment();
//		String strSQL = "SELECT id, jobhistoryid, agentid, exposure, level, frequencyweeks," +
//        " frequencyhours, dontknow, assessorusername, assessorid, comments " +
//        " FROM agentassessments " +
//        " WHERE (jobhistoryid = " + this.getId()+ ") AND (agentid = "+agentID+") AND (NOT(assessorusername = 'OccIDEAS'))";
//        ResultSet rs = null; 
//        String id = "";
//        try {
//            rs = this.sqlExecuteSelect(strSQL);
//            if (rs != null) {
//                if (rs.next()) {
//                    id = rs.getString("id");                   
//                }
//                if (rs.getStatement() != null) {
//                    rs.getStatement().close();
//                }
//                rs.close();
//            }
//        } catch (SQLException e) {
//            throw new Exception(e.getMessage());
//        } finally {
//            this.closeConnection();
//        }
//        if(!(id.equalsIgnoreCase(""))){
//        	retValue = new Assessment(id);
//        }       
//		return retValue;
//	}
	public Assessment getManualAssessment(String agentID) throws Exception {
		Assessment retValue = new Assessment();
		String strSQL = "SELECT id, jobhistoryid, agentid, exposure, level, frequencyweeks," +
        " frequencyhours, dontknow, assessorusername, assessorid, comments " +
        " FROM agentassessments " +
        " WHERE (jobhistoryid = " + this.getId()+ ") AND (agentid = "+agentID+") AND (assessorusername <> 'OccIDEAS')";
        ResultSet rs = null;  
        String id = "";
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    id = rs.getString("id");
                    
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        if(!(id.equalsIgnoreCase(""))){
        	retValue = new Assessment(id);
        }
		return retValue;
	}
	public Assessment getAutoAssessment(String agentID) throws Exception {
		Assessment retValue = new Assessment();
		String strSQL = "SELECT id, jobhistoryid, agentid, exposure, level, frequencyweeks," +
        " frequencyhours, dontknow, assessorusername, assessorid, comments " +
        " FROM agentassessments " +
        " WHERE (jobhistoryid = " + this.getId()+ ") AND (agentid = "+agentID+") AND (assessorusername = 'OccIDEAS')";
        ResultSet rs = null;  
        String id = "";
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    id = rs.getString("id");
                    
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        if(!(id.equalsIgnoreCase(""))){
        	retValue = new Assessment(id);
        }
		return retValue;
	}
	public ArrayList<Assessment> getAutoAssessmentsNotNone() throws Exception {
		ArrayList<Assessment> retValue = new ArrayList<Assessment>();
		String strSQL = "SELECT id FROM agentassessments " +
        " WHERE (jobhistoryid = " + this.getId()+ ") AND (exposure <> 'None') AND (assessorusername = 'OccIDEAS')";
        ResultSet rs = null;       
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String id = rs.getString("id");
                    Assessment assessment = new Assessment();
                    assessment.setId(id);
                    retValue.add(assessment); 
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        for(Assessment assessment: retValue){
        	assessment.getPersistentObject();
        }
		return retValue;
	}
	public ArrayList<Assessment> getAutoAssessments() throws Exception {
		ArrayList<Assessment> retValue = new ArrayList<Assessment>();
		String strSQL = "SELECT id FROM agentassessments " +
        " WHERE (jobhistoryid = " + this.getId()+ ") AND (assessorusername = 'OccIDEAS')";
        ResultSet rs = null;       
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String id = rs.getString("id");
                    Assessment assessment = new Assessment();
                    assessment.setId(id);
                    retValue.add(assessment); 
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        for(Assessment assessment: retValue){
        	assessment.getPersistentObject();
        }
		return retValue;
	}

	public ArrayList<Assessment> getManualAssessments() throws Exception {
		ArrayList<Assessment> retValue = new ArrayList<Assessment>();
		String strSQL = "SELECT id FROM agentassessments " +
        " WHERE (jobhistoryid = " + this.getId()+ ") AND (assessorusername <> 'OccIDEAS')";
        ResultSet rs = null;       
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String id = rs.getString("id");
                    Assessment assessment = new Assessment();
                    assessment.setId(id);
                    retValue.add(assessment); 
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
        for(Assessment assessment: retValue){
        	assessment.getPersistentObject();
        }
		return retValue;
	}	
/*	public boolean isValid() throws Exception{
	  	boolean retVal = true;
	  	String errorMessage = "";
	  	
	  	// test OccHisID
	  	if ((getReferenceNumber()== null) || (getReferenceNumber().compareToIgnoreCase("")== 0) || (getReferenceNumber().equalsIgnoreCase("<not set>")) ) {
	  		errorMessage += " OccHisID";
	  		retVal &= false;
	  	}
	  	//test Job Title
	  	if (getJobDescription() == null || getJobDescription().compareToIgnoreCase("") == 0 ) {
	  		errorMessage += " Job Title";
	  		retVal &= false;
	  	}
	  	//test Tasks
	  	if (jobHistoryTasks == null || jobHistoryTasks.isEmpty()) {
	  		errorMessage += " Task";
	  		retVal &= false;
	  	}
	  	//test Age
	  	if (getAge() == 0) {
	  		errorMessage += " Age";
	  		retVal &= false;
	  	}
	  	//test Started
	  	if (getYearStarted() == null || getYearStarted() <= 0) {
	  		errorMessage += " Started";
	  		retVal &= false;
	  	}
	  	//test Yrs
	  	if (getDurationYears() == 0) {
	  		errorMessage += " Years";
	  		retVal &= false;
	  	}
	  	//test Weeks
	  	if (getWeeksPerYear() == 0) {
	  		errorMessage += " Weeks";
	  		retVal &= false;
	  	}
	  	//test Hours
	  	if (getHoursPerWeek() == 0) {
	  		errorMessage += " Hours";
	  		retVal &= false;
	  	}
	  	//test Employer
	  	if (getEmployer() == null || getEmployer().compareToIgnoreCase("") == 0) {
	  		errorMessage += " Employer";
	  		retVal &= false;
	  	}
	  	//test Suburb
	  	if (getSuburb() == null || getSuburb().compareToIgnoreCase("") == 0) {
	  		errorMessage += " Suburb";
	  		retVal &= false;
	  	}
	  	//test State
	  	if (getState() == null || getState().compareToIgnoreCase("") == 0) {
	  		errorMessage += " State";
	  		retVal &= false;
	  	}
	  	//test Country
	  	if (getCountry() == null || getCountry().compareToIgnoreCase("") == 0) {
	  		errorMessage += " Country";
	  		retVal &=false;
	  	}
	   	//errorMessage
	  	if (!retVal) {
	  		errorMessage = "Warning! Please complete" + errorMessage.replace(" ",", ");
	  		this.setErrorMessage(errorMessage);
	  	}
	  		
	  	return retVal;
	}*/

	public Integer getDaysperweek() {
		return daysperweek;
	}

	public void setDaysperweek(Integer daysperweek) {
		this.daysperweek = daysperweek;
	}

//	public Integer getNrsmokedday() {
//		return nrsmokedday;
//	}
//
//	public void setNrsmokedday(Integer nrsmokedday) {
//		this.nrsmokedday = nrsmokedday;
//	}
	public boolean isNumber(String number) {
		String chars = "1234567890.";
		char[] numbers = number.toCharArray();
		for (char s : numbers) {
			if (!chars.contains(String.valueOf(s))) {
				return false;
			}
		}
		return true;
	}
	
    public void save() throws Exception {
    	update();
    }
    
	public boolean hasFiredRules() throws Exception {
		boolean retValue = false;
		if(this.getAutoAssessmentsNotNone().size()!=0){
			retValue = true;
		}
		return retValue;
	}
	public boolean hasExposure(String exposureStatus) throws Exception {
		boolean retValue = false;
		for(Assessment assessment:this.getAutoAssessments()){
			if(assessment.getOutCome().equalsIgnoreCase(exposureStatus)){
				retValue = true;
				break;
			}	
		}
		return retValue;
	}
	public String getParticipantReferenceNumber() {
		return participantReferenceNumber;
	}
	public void setParticipantReferenceNumber(String participantReferenceNumber) {
		this.participantReferenceNumber = participantReferenceNumber;
	}
/*	public void loadTasks() throws Exception {
		this.getPersistentTaskObjects();		
	}*/
	public ArrayList<Assessment> getAssessments() {
		if(assessments==null){
			assessments = new ArrayList<Assessment>();
		}
		return assessments;
	}
	public void setAssessments(ArrayList<Assessment> assessments) {
		this.assessments = assessments;
	}
	public Assessment getAssessmentManual(Agent agent) {
		Assessment retValue = new Assessment();
		for(Assessment assessment: this.getAssessments()){
			if(!(assessment.getId().equalsIgnoreCase(""))){
				if(assessment.getAgentId().equalsIgnoreCase(agent.getId())){
					if(!(assessment.getAssessorId().equalsIgnoreCase("-1"))){
						retValue = assessment;
						break;
					}
				}
			}			
		}		
		return retValue;
	}
	public Assessment getAssessmentAuto(Agent agent) {
		Assessment retValue = new Assessment();
		for(Assessment assessment: this.getAssessments()){
			if(!(assessment.getId().equalsIgnoreCase(""))){
				if(assessment.getAgentId().equalsIgnoreCase(agent.getId())){
					if(assessment.getAssessorId().equalsIgnoreCase("-1")){
						retValue = assessment;
						break;
					}
				}
			}
		}		
		return retValue;
	}
	
/*	public ArrayList<JobHistoryColumn> getAdditionalJHData(int jobHistoryCount) throws Exception {
		ArrayList<JobHistoryColumn> retValue = new ArrayList<JobHistoryColumn>();
		ArrayList<JobHistoryColumn> ffJobNos = new ArrayList<JobHistoryColumn>();
		boolean fFlyer = false;
		Participant p = new Participant(Long.valueOf(this.getParticipantId()));
		if(this.getColumn()==null){
			String strSQL = "SELECT * FROM jhxmlcolumn " +
	        " WHERE reference_number = '" + p.getParticipantRefnum() + "'";
	        ResultSet rs = null;       
	        try {
        		String jhReferenceNumber = this.getReferenceNumber();
	            rs = this.sqlExecuteSelect(strSQL);
	            if (rs != null) {
	                while (rs.next()) {
	                	JobHistoryColumn column = new JobHistoryColumn();
	                	String name = rs.getString("name");
	                	String value = rs.getString("value");
	                	if (value == null){value = "";}
	                		if(name.contains("FFlyers") && value.equals("1")){
	                			fFlyer = true;
	                		}
	                		if (name.contains("FF_numb")){
	                			column.setName(name);
	                			column.setValue(value.trim());
	                			ffJobNos.add(column);
	                		}
	                		String bceesOccupationalNumber = name.substring(name.lastIndexOf("_") + 1);
	                		if(bceesOccupationalNumber.equalsIgnoreCase(jhReferenceNumber)){
	                			column.setName(name);
	                			column.setValue(value);
	                			retValue.add(column); 
	                		}

	                }
	                if (fFlyer) {//If the participant has an FF job
	                	String FFJobString ="";
	                	for (JobHistoryColumn flyerJobNo : ffJobNos){//go through the FF job nos
	                		String ffValue = flyerJobNo.getValue();
	                		if (ffValue != null && !ffValue.equals("")){
		                		FFJobString += ffValue;
		                		if (Integer.valueOf(ffValue.trim()) > 16){
		                			FFJobString += "HighValue";
		                		} 
//		                		if an FF job no matchs this job no
		                		if(ffValue.replaceAll("^0+(?!$)", "").equals(jhReferenceNumber)){
		                			JobHistoryColumn newcol = new JobHistoryColumn();
		                			newcol.setName("FFlyer");//add a new value to the list to show this job is FF
		                			newcol.setValue("True");
		                			retValue.add(newcol); 
		                		}
	                		}
	                	}
	                	if (FFJobString.contains("HighValue")){
                			JobHistoryColumn newcol = new JobHistoryColumn();
                			newcol.setName("FFlyer");//add a new value to the list to show this job is FF
                			newcol.setValue("HighValue");
                			retValue.add(newcol);
                		}
	                	if (FFJobString.equals("")){
                			JobHistoryColumn newcol = new JobHistoryColumn();
                			newcol.setName("FFlyer");//add a new value to the list to show this job is FF
                			newcol.setValue("No Job Number!");
                			retValue.add(newcol);
                		}
	                }
	                if (rs.getStatement() != null) {
	                    rs.getStatement().close();
	                }
	                rs.close();
	            }
	        } catch (SQLException e) {
	            throw new Exception(e.getMessage());
	        } finally {
	            this.closeConnection();
	        }
	        this.setColumn(retValue);
		}
        return retValue;
	}*/
/*	public String getStaticTasks() throws Exception {
		String retValue = "";
		String fieldName = "Duties_"+this.getReferenceNumber();
		Participant p = new Participant(Long.valueOf(this.getParticipantId()));
		String strSQL = "SELECT value FROM jhxmlcolumn WHERE name = '"+fieldName+"' AND reference_number = '"+p.getReferenceNumber()+"';";       
        try {
        	ResultSet rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {                    
                    retValue = rs.getString("value");
                }
                rs.close();
            }
        } catch (SQLException e) {
//        	To Do deal with getStaticTasks:"+e.getMessage());
        } finally {
            this.closeConnection();
        }
        return retValue;
	}*/
/*	public void setDuties(String duties) {
		this.duties = duties;
	}*/
/*	public String getDuties() {
		if(this.duties != null){
			if(this.duties.equalsIgnoreCase("")||this.duties.equalsIgnoreCase("null")){
				try{
					this.duties = this.getStaticTasks();
				}catch(Exception e){
					System.out.println("ERROR: getting static tasks:"+e.getMessage());
				}	
			}
		}else{
			try{
				this.duties = this.getStaticTasks();
			}catch(Exception e){
				System.out.println("ERROR: getting static tasks:"+e.getMessage());
			}	
		}
		return duties;
	}*/	
    public String getStreet() {
    	if (this.street == null) {
            this.street = "";
        }else if(this.street.equalsIgnoreCase("NULL")){
        	this.street = "";
        }
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
