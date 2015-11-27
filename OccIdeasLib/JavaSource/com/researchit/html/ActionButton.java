/**
 * Version:
 *     $Id: ActionButton.java,v 1.13 2008/08/25 01:37:25 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: ActionButton.java,v $
 *     Revision 1.13  2008/08/25 01:37:25  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.12  2008/05/26 08:23:24  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit.html;

public class ActionButton {

	 private String name ="";
	 private String title = "";
	 private boolean isEnabled = false;
	 private String txtHTML = "";
	 private String iconHeight = "32";
	 private String iconWidth = "32";
	 private String iconName = "";
	 private String onClick = "";
	 private String disabled = "";

	 public ActionButton(){};
	 
	 public	ActionButton(String name, String title, String iconName) {
		this.name = name;
		this.title = title;
		this.iconName = iconName;		 
	 }
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTxtHTML() {
		String tempIconName = "";		
		if (this.isEnabled == false){
			tempIconName = "dis_" + this.iconName + "'";
			disabled = "disabled";
		}else{
			tempIconName = this.iconName + "'";
			disabled = "";
		}		
		txtHTML = "<input style='padding-left: 5px;'"
			+ "type=image src='ImageStream?ImageName="
			+ tempIconName
			+ " "
			+ disabled
			+" name="
			+ this.name
			+ " height="
			+ this.iconHeight
			+ " width="
			+ this.iconWidth
			+ " title=\""
			+ this.title
			+ "\" alt=\""
			+ this.title
			+ "\" "
			+ onClick
			+ "></input>";
		
		return txtHTML;
	}
	public String getIconName() {
		return iconName;
	}
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setOnClick(String onClick) {
		this.onClick = onClick;
	}
	public String getIconHeight() {
		return iconHeight;
	}
	public void setIconHeight(String iconHeight) {
		this.iconHeight = iconHeight;
	}
	public String getIconWidth() {
		return iconWidth;
	}
	public void setIconWidth(String iconWidth) {
		this.iconWidth = iconWidth;
	}
	
	public String toString() {
		return getTxtHTML();
	}
	public static String getSelectAllTxtHTML() {
		return "<img style='padding-left: 5px;' src='ImageStream?ImageName=selectall.gif'  name=selectAll height=32 width=32 title='Select All' alt='Select All'  onclick='return checkAllCheckboxes();'></img>";
	}	
}