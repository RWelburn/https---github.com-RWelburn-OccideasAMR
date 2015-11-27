/**
 * Revisions:
 *     $Log$
 *     Revision 1.22  2009/04/23 09:24:34  troy.sadkowsky
 *     participant contact updates
 *
 *     Revision 1.21  2008/12/30 00:11:38  troy.sadkowsky
 *     paging and speed enhancements
 *
 *     Revision 1.20  2008/12/20 02:07:08  troy.sadkowsky
 *     v2 updates
 *
 */
package com.researchit;

import java.util.ArrayList;
import java.util.List;

public class Util {

	public Util() {
		
	}
	
	/** Takes the following parameters and returns a page of strings from the list
	 * @param items - list string items
	 * @param selectedItemIndex - Any item in the string list that needs highlighting
	 * @param pageLength - Number of items on a page
	 * @param page - The page of items to return
	 * @param preText - Any string to add to the begining of the string item
	 * @param postText - Any string to add to the end of the string item
	 * @return A list of string items comprising the page selected from the main list
	 */
	public static Object[] getPageFromPagedItems(List<String> items, int pageLength, int page){

		int totalPages = Util.getTotalPagesFromPagedItems(items.size(), pageLength);
//		Checks for out of range page number		
		if (page > totalPages){
			page = totalPages;
		}
		if (page <1){
			page = 1;
		}	
		int firstItem = (page - 1) * pageLength;
		int lastItem = page * pageLength;
		if (lastItem > items.size()){ 
			lastItem = items.size();
		}
		List<String> pageItems = items.subList(firstItem, lastItem);
		if (page < totalPages) {
			pageItems.add("<tr><td>&nbsp;</td><td>more.....</td>");
		}
		Object[] listArray = pageItems.toArray();		
		return listArray;
	}
	public static Object[] getPageFromPagedItems(ArrayList<JobHistory> items, int pageLength, int page){

		int totalPages = Util.getTotalPagesFromPagedItems(items.size(), pageLength);
//		Checks for out of range page number		
		if (page > totalPages){
			page = totalPages;
		}
		if (page <1){
			page = 1;
		}	
		int firstItem = (page - 1) * pageLength;
		int lastItem = page * pageLength;
		if (lastItem > items.size()){ 
			lastItem = items.size();
		}
		List<JobHistory> pageItems = items.subList(firstItem, lastItem);
		//if (page < totalPages) {
		//	pageItems.add("<tr><td>&nbsp;</td><td>more.....</td>");
		//}
		Object[] listArray = pageItems.toArray();		
		return listArray;
	}
	
	/** Calculates how many pages there are when a list of items is paged
	 * @param items - number of items to make into pages
	 * @param pageLength - number of items on each page
	 * @return - Total number of pages
	 */
	public static int getTotalPagesFromPagedItems(int items, int pageLength){
		return ((int)((double)items - 0.5)/pageLength) + 1;
	}
	public static String dateToDDMMYYYY(Object date){
		String retValue = "";
		if (date == null) return null;
		if(date.getClass() == String.class){			
			String strDate = (String)date;
			if(!(strDate.equalsIgnoreCase(""))){
				String day = "";
				String month = "";
				String year = "";		
				String time = "";		
				char c = strDate.charAt(4);
				if(c=='-'){
					year = strDate.substring(0,4);
					month = strDate.substring(5,7);
					day = strDate.substring(8,10);
					if(strDate.length() == 16){
						time = strDate.substring(10,16);
					}					
					retValue = day+"-"+month+"-"+year+time;
				}else{
					retValue = strDate;
				}
			}		
		}
		return retValue;
	}
	
	/**Takes the page reference from the navigation bar and returns the appropriate page in the wiki
	 * @param occideasPage - Occideas page reference
	 * @return - Wiki page
	 */
	public static String getWikiPage(String navPath) {
		String wikiPage = "";
		if(!(navPath.equalsIgnoreCase(""))){
			if(!(navPath.equalsIgnoreCase("_"))){
				String[] pathElements = null;
				pathElements = navPath.split("_");
				if (pathElements[0].contains("Questionnaire")) {pathElements[0] = "Questionnaire";}
				if (pathElements[0].contains("Assessment")) {pathElements[0] = "Assessment";}
				if (pathElements[0].contains("Studies")) {pathElements[0] = "Studies";}
				if (pathElements[0].contains("OccIDEASHome")) {pathElements[0] = "OccIDEASHome";}
				navPath = "";
				
				for (String element : pathElements) {
					if(element.equalsIgnoreCase("Next")){
						continue;
					}
					navPath +=  "_" + element.replace(" ","_");
				}
				navPath = navPath.replaceFirst("_", "");
				wikiPage = navPath;
			}		
		}
		return wikiPage;
	}
	public static ArrayList<JobSpecificModule> mergeSort(ArrayList<JobSpecificModule> aJSMs) throws Exception{
		int centre = 0;
		int i = 0;
		
		ArrayList<JobSpecificModule> left = new ArrayList<JobSpecificModule>();
		ArrayList<JobSpecificModule> right = new ArrayList<JobSpecificModule>();
		ArrayList<JobSpecificModule> retVal = new ArrayList<JobSpecificModule>();
		
		if(aJSMs.size()<= 1){
			retVal = aJSMs;
		}else{
			centre = aJSMs.size()/2;
			for(i = 0; i<centre; i++){
				left.add(aJSMs.get(i));
			}
			for(i = centre; i<aJSMs.size(); i++){
				right.add(aJSMs.get(i));
			}
			left= mergeSort(left);
			right = mergeSort(right);
			retVal = merge(left,right);
		}
		return retVal;
	}
	private static ArrayList<JobSpecificModule> merge(ArrayList<JobSpecificModule> l, ArrayList<JobSpecificModule> r) throws Exception{
		ArrayList<JobSpecificModule> retVal = new ArrayList<JobSpecificModule>();
		
		while (l.size()> 0
				&& r.size() > 0){
			if(l.get(0).getSearchCount() > r.get(0).getSearchCount()){
				retVal.add(l.get(0));
				l.remove(0);
			}else{
				retVal.add(r.get(0));
				r.remove(0);				
			}
		}
		if(l.size()> 0){
			for(int i = 0; i < l.size(); i++){
				retVal.add(l.get(i));
			}
		}
		if(r.size()> 0){
			for(int i = 0; i < r.size(); i++){
				retVal.add(r.get(i));
			}			
		}
		return retVal;
	}

	public static String decrypt(String id) {
		String retValue = ((Integer)((Integer.valueOf(id))/97)).toString();
		return retValue;
	}

	public static String encrypt(String id) {
		String retValue = ((Integer)(Integer.valueOf(id)*97)).toString();
		return retValue;
	}
}

