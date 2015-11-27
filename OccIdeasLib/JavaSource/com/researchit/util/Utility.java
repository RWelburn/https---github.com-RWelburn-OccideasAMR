/**
 * 
 */
package com.researchit.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.researchit.html.OccCalendar;

/**
 * @author damienA
 *
 */
public class Utility {
    
	/**
	 * Convert java date to SQL date
	 */
	public static java.sql.Date dateToSQL(Date date) {
		if (date == null) {
			return null;
		} else {
			return new java.sql.Date(date.getTime());
		}
	}
	public static String getOsName() {
		  String os = "";
		  if (System.getProperty("os.name").toLowerCase().indexOf("windows") > -1) {
		    os = "windows";
		  } else if (System.getProperty("os.name").toLowerCase().indexOf("linux") > -1) {
		    os = "linux";
		  } else if (System.getProperty("os.name").toLowerCase().indexOf("mac") > -1) {
		    os = "mac";
		  }
		 
		  return os;
		}
	public static String dateToYYYYMMDD(Object date) throws Exception{
		String retValue = "";
		if (date == null) return null;
		if(date.getClass() == String.class){
			String strDate = date.toString();
			String day = "";
			String month = "";
			String year = "";
			if(strDate.length()==10){
				char c = strDate.charAt(2);
				if(c=='/'){
					//swap year and day around
					day = strDate.substring(0,2);
					month = strDate.substring(3,5);
					year = strDate.substring(6,10);
					retValue = year+"-"+month+"-"+day;
				}else{
					throw new Exception("Incorrect Date Format");
				}
			}else if(strDate.length()==0){
				retValue = null;
			}else{
				throw new Exception("Incorrect Number of Characters in Date Field");
			}
		}
		return retValue;
	}

	public static String dateToDDMMYYY(Object date) throws Exception{
		String retValue = "";
		if (date == null) return null;
		if(date.getClass() == String.class){
			String strDate = (String)date;
			String day = "";
			String month = "";
			String year = "";
			if(strDate.length()==10){
				char c = strDate.charAt(2);
				if(c=='/'){
					//swap year and day around
					day = strDate.substring(0,2);
					month = strDate.substring(3,5);
					year = strDate.substring(6,10);
					retValue = day+"-"+month+"-"+year;
				}else{
					c = strDate.charAt(4);
					if(c=='-'){
						year = strDate.substring(0,4);
						month = strDate.substring(5,7);
						day = strDate.substring(8,10);
						retValue = day+"/"+month+"/"+year;
					}else{
						throw new Exception("incorrect format");
					}
					
				}
			}else {
				throw new Exception("incorrect number of characters");
			}
		}
		return retValue;
	}
	
    public static String quoteSQL(Object value) {
    	if (value == null || value.equals("null")) {
    		return "null";
    	}
    	if (value.getClass() == String.class) {
    		return "\"" + value + "\"";
    	} else if (value.getClass() == Date.class) {
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    		return "\"" + sdf.format((Date)value) + "\"";
    	} else if (value.getClass() == Integer.class) {
    		if ((Integer)value == -1) {
    			return "null";
    		}
    	}
    	return value.toString();
    }
    
    public static Integer getInteger(String strint) {
    	if (strint == null || strint.equals("") || strint.equals("null")) {
    		return null;
    	} else {
    		return Integer.parseInt(strint);
    	}
    }
    
    public static Float getFloat(String strfloat) {
    	if (strfloat == null || strfloat.equals("") || strfloat.equals("null")) {
    		return null;
    	} else {
    		return Float.parseFloat(strfloat);
    	}
    }
    
    public static String quoteSQLDate(String date) throws Exception {
    	return quoteSQL(dateToYYYYMMDD(date));
    }
	public static String getTempPath() throws Exception {
		String retValue = "";
		if(Utility.getOsName().equalsIgnoreCase("windows")){			
			retValue = "C:\\xmlFile.xml";
		}else if(Utility.getOsName().equalsIgnoreCase("linux")){
			Context initCtx = new InitialContext();
			Context ctx = (Context) initCtx.lookup("java:/comp/env");
			Object o = ctx.lookup("tomcatTemp");
			retValue = o.toString()+"xmlFile.xml";
		} else {
			throw new Exception("Error getting OS name for finding correct temp path to put temp xml file");
		}
		return retValue;
	}
	
	public static Date stringToDate(String date) throws Exception {
		OccCalendar cal = new OccCalendar(date);
		return new Date(cal.getTimeInMillis());
	}
}
