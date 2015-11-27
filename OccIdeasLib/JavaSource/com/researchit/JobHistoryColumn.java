package com.researchit;

import com.researchit.common.DBBaseObject;

public class JobHistoryColumn extends DBBaseObject implements Comparable{
	private String name;
	private String value;
	private String type;//teleforms or liquid office
	private String reference_number;

	public String getReference_number() {
		return reference_number;
	}
	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null){
			name = "";
		}
		this.name = name;
	}
	public String getValue() {
		if(value == null){
			value = "";
		}
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int compareTo(Object o) {
		JobHistoryColumn jh = (JobHistoryColumn)o;
		if (this.getReference_number().equalsIgnoreCase(jh.getReference_number()) && this.getName().equalsIgnoreCase(jh.getName())){
			return 0;
		}
		return -1;
	}
}
