/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.7  2009/02/22 02:27:11  ray.welburn
 *     Repair option to search by date range
 *
 *     Revision 1.6  2008/05/26 08:23:31  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit.html;

import java.util.GregorianCalendar;

public class OccCalendar extends GregorianCalendar{
	
	private static final long serialVersionUID = 1L;
	
	public OccCalendar(){		
		super();
	}	
	public OccCalendar(String date)throws Exception{
		super();
		this.setDate(date);
		
	}
	public void setDate(String date) throws Exception{
		try{
	String[] dateElements = date.split("/");
	int year = Integer.parseInt(dateElements[2]);
	int month = Integer.parseInt(dateElements[1]) - 1;
	int day = Integer.parseInt(dateElements[0]);
	this.set(year, month, day);
		}catch(Exception e){
			throw new Exception("Problem with date format");
		}
	}
	
	public void setDateTime(String dateTime) {
		int year = Integer.parseInt(dateTime.substring(0, 4));
		int month = Integer.parseInt(dateTime.substring(5, 7)) - 1;
		int day = Integer.parseInt(dateTime.substring(8, 10));
		int hour = Integer.parseInt(dateTime.substring(11, 13));
		int minute = Integer.parseInt(dateTime.substring(14, 16));
		this.set(year, month, day, hour, minute);
		
	}
	public String getDatabaseFormatDateTime() {
		String dateTime = this.getDatabaseFormatDate() + " " + this.getDatabaseFormatTime();
		return dateTime;		
	}
	public String getDatabaseFormatTime() {
		String time = "";
		time = String.valueOf(this.get(OccCalendar.HOUR_OF_DAY)) +  ":" +
		String.valueOf(this.get(OccCalendar.MINUTE)) + ":00.0";
		return time;		
	}
	public String getDatabaseFormatDate() {
		String date = "";
		date = String.valueOf(this.get(OccCalendar.YEAR)) + "-" +
		String.valueOf(this.get(OccCalendar.MONTH) + 1) + "-" +
		String.valueOf(this.get(OccCalendar.DAY_OF_MONTH));
		return date;
	}	
	public String showYearCombo() {
		int startYear = this.get(OccCalendar.YEAR);
		String htmlString = "<select name='year'>";
		for (int x = 0;x < 10;x++){
			htmlString += "<option>";
			htmlString += Integer.toString(startYear + x);
			htmlString += "</option>";
		}
		htmlString += "</select>";
		return htmlString;
	}
	public String showMonthCombo() {
		int startMonth = this.get(OccCalendar.MONTH) + 1;
		String htmlString = "<select name='month'>";
		for (int x = 1;x < 13;x++){
			if (startMonth == x){
				htmlString += "<option selected>";
			}else{
				htmlString += "<option>";
			}
			htmlString += Integer.toString(x);;
			htmlString += "</option>";
		}
		htmlString += "</select>";
		return htmlString;
	}
	public String showDayCombo() {
		int startDay = this.get(OccCalendar.DAY_OF_MONTH);
		String htmlString = "<select name='day'>";
		for (int x = 1;x < 32;x++){
			if (startDay == x){
				htmlString += "<option selected>";
			}else{
				htmlString += "<option>";
			}
			htmlString += Integer.toString(x);
			htmlString += "</option>";
		}
		htmlString += "</select>";
		return htmlString;
	}
	public String showHourCombo() {
		int startHour = this.get(OccCalendar.HOUR_OF_DAY);
		String htmlString = "<select name='hour'>";
		for (int x = 1;x < 24;x++){
			if ((startHour) == x){
				htmlString += "<option selected>";
			}else{
				htmlString += "<option>";
			}
			htmlString += ("0" + Integer.toString(x)).substring((("0" + Integer.toString(x)).length())-2);
			htmlString += "</option>";
		}
		htmlString += "</select>";
		return htmlString;
	}
	public String showMinuteCombo() {
		int startMinute = this.get(OccCalendar.MINUTE);;
		String htmlString = "<select name='minute'>";
		for (int x = 0;x < 12;x++){
			if ((startMinute) == x * 5){
				htmlString += "<option selected>";
			}else{
				htmlString += "<option>";
			}
			htmlString += ("0" + Integer.toString(x * 5)).substring((("0" + Integer.toString(x * 5)).length())-2);
			htmlString += "</option>";
		}
		htmlString += "</select>";
		return htmlString;
	}
}

