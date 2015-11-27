package com.researchit.common;

import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.researchit.util.Utility;


public class Address extends DBBaseObject {

	private String personId;
	private String type;
	private String address;
	private String area;
	private String postCode;
	private String suburb;
	private String state;
	private String country;
	private Date from;
	private Date to;
	private String fromMonth = "0";
	private String fromYear = "0";
	private String toMonth = "0";
	private String toYear = "0";
	private String homePhone;
	private String workPhone;
	
	public String getFromMonth() {
		String result = fromMonth.equals("-1")?"Unknown":fromMonth;
		return result;
	}

	public void setFromMonth(String fromMonth) {
		this.fromMonth = fromMonth;
	}

	public String getFromYear() {
		String result = fromYear.equals("-1")?"Unknown":fromYear;
		return result;
	}

	public void setFromYear(String fromYear) {
		this.fromYear = fromYear;
	}

	public String getToMonth() {
		String result = toMonth.equals("-1")?"Unknown":toMonth;
		return result;
	}

	public void setToMonth(String toMonth) {
		this.toMonth = toMonth;
	}

	public String getToYear() {
		String result = toYear.equals("-1")?"Unknown":toYear;
		return result;
	}

	public void setToYear(String toYear) {
		this.toYear = toYear;
	}

	private String mobilePhone;
	private String otherPhone;
	private String email;
	private String preferredNumber;
	private boolean valid;
	public static final String TYPERESIDENTIAL = "RES";
	public static final String TYPEPOSTAL = "POS";
	public static final String TYPEARCHIVED = "OLD";

	public Address() {
		super();
	}

	public Address(String id) throws Exception {
		super(id);
		getPersistantObject();
	}

	protected void getPersistantObject() throws Exception {
		String query = "SELECT * FROM addresses WHERE id =" + this.getId();
		try {
			this.connect();
			this.getStatement();
			resultSet = this.executeQuery(query);
			if (resultSet != null && resultSet.next()) {
				this.setId(resultSet.getString("id"));
				this.setPersonId(resultSet.getString("person_id"));
				this.setType(resultSet.getString("type"));
				this.setAddress(resultSet.getString("address"));
				this.setArea(resultSet.getString("area"));
				this.setSuburb(resultSet.getString("suburb"));
				this.setState(resultSet.getString("state"));
				this.setPostCode(resultSet.getString("postcode"));
				this.setCountry(resultSet.getString("country"));
				this.setFrom(resultSet.getDate("from_date"));
				this.setTo(resultSet.getDate("to_date"));
				this.setHomePhone(resultSet.getString("home_phone"));
				this.setWorkPhone(resultSet.getString("work_phone"));
				this.setMobilePhone(resultSet.getString("mobile_phone"));
				this.setOtherPhone(resultSet.getString("other_phone"));
				this.setEmail(resultSet.getString("email"));
				this.setPreferredNumber(resultSet.getString("preferredNumber"));
				this.setFromMonth((resultSet.getString("from_month")));
				this.setFromYear((resultSet.getString("from_year")));
				this.setToMonth((resultSet.getString("to_month")));
				this.setToYear((resultSet.getString("to_year")));
			}
			closeStatement();
		} finally {
			closeConnection();
		}

	}

	public void delete() throws Exception {
		@SuppressWarnings("unused")
		int rows = 0;
		String sql = "DELETE FROM addresses WHERE id=" + this.getId();
		try {
			this.connect();
			this.getStatement();
			rows = this.insertUpdate(sql);
			closeStatement();
		} finally {
			closeConnection();
		}
	}

	public boolean exists() throws Exception {
		if (!(this.getId().equalsIgnoreCase(""))) {
			String sql = "SELECT id from addresses WHERE id=" + getId();
			return this.recordExists(sql);
		} else {
			return false;
		}
	}

	public void save() throws Exception {
		boolean updating = exists();
		String sql;
		java.sql.PreparedStatement pst;
		//String pstString;
		try {
			connect();
			if (updating) {
				sql = "UPDATE addresses SET person_id=?, type=?, address=?, area=?, suburb=?, state=?, postcode=?, country=?, from_date=?, to_date=?"
					+ ", home_phone=?, work_phone=?, mobile_phone=?, other_phone=?, email=?, preferrednumber=?, from_month=?, from_year=?, to_month=?, to_year=?  WHERE id=?";
				pst = getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
				pst.setInt(21, Integer.parseInt(getId()));
			} else {
				sql = "INSERT INTO addresses (person_id, type, address, area, suburb, state, postcode, country, from_date, to_date"
					+ ",home_phone,work_phone,mobile_phone,other_phone,email,preferrednumber,from_month,from_year,to_month,to_year) " +
					"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				pst = getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			}
			pst.setString(1, this.getPersonId());
			pst.setString(2, this.getType());
			pst.setString(3, this.getAddress());
			pst.setString(4, this.getArea());
			pst.setString(5, this.getSuburb());
			pst.setString(6, this.getState());
			pst.setString(7, this.getPostCode());
			pst.setString(8, this.getCountry());
			pst.setDate(9, Utility.dateToSQL(this.getFrom()));
			pst.setDate(10, Utility.dateToSQL(this.getTo()));
			pst.setString(11, this.getHomePhone());
			pst.setString(12, this.getWorkPhone());
			pst.setString(13, this.getMobilePhone());
			pst.setString(14, this.getOtherPhone());
			pst.setString(15, this.getEmail());
			pst.setString(16, this.getPreferredNumber());
			pst.setString(17, this.getFromMonth());
			pst.setString(18, this.getFromYear());
			pst.setString(19, this.getToMonth());
			pst.setString(20, this.getToYear());
			//pstString = pst.toString();
			pst.executeUpdate();
			if (!updating) {
				java.sql.ResultSet rs = pst.getGeneratedKeys();
				if (rs != null && rs.next()) {
					id = rs.getString(1);
				} else {
					// TODO deal with error
					throw new Exception("Couldn't get generated ID");
				}
			}
			pst.close();

			//      update changelog
			//            sql = "INSERT INTO changelog (changed_on, changed_by, SQLText) VALUES(?,?,?)";
			//            pst = getConnection().prepareStatement(sql);
			//            pst.setDate(1, Utility.dateToSQL(new Date()));
			//            pst.setString(2, this.getUsername()); 
			//            pst.setString(3,pstString);
			//            pst.execute();
			//            pst.close();
		} finally {
			closeConnection();
		}
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	public String getPersonId() {
		return personId;
	}


	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getAddress() {
		if (address == null) {
			address = "";
		}
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPostCode() {
		if (postCode == null) {
			postCode = "";
		}
		return postCode;
	}


	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	public String getState() {
		if (state == null) {
			state = "";
		}
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getSuburb() {
		if (suburb == null) {
			suburb = "";
		}
		return suburb;
	}


	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	/**
	 * @return Returns the valid.
	 */
	public boolean isValid() {
		this.setWarnings(null);
		this.valid = true;
		//removed until
		//if((this.getType()==null)||(this.getType().equalsIgnoreCase(""))){
		//    this.getWarnings().put("addresses.type","Address Type is required");                                   
		//}
		if((this.getAddress()==null)||(this.getAddress().trim().equalsIgnoreCase(""))){
			this.getWarnings().put("addresses.address","Address is required");                                   
		}
		if((this.getPostCode()==null)||(this.getPostCode().trim().equalsIgnoreCase(""))){
			this.getWarnings().put("addresses.postcode","postcode is required");                                   
		}
		if((this.getState()==null)||(this.getState().trim().equalsIgnoreCase(""))){
			this.getWarnings().put("addresses.state","State is required");                                   
		}
		if((this.getSuburb()==null)||(this.getSuburb().trim().equalsIgnoreCase(""))){
			this.getWarnings().put("addresses.suburb","Suburb is required");                                   
		}
		if(this.getWarnings().size()!=0){
			this.valid = false;
		}
		return valid;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getOtherPhone() {
		return otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}


	public String toString() {
		String retValue = "";
		retValue = this.getAddress()+" "+this.getSuburb()+" "+this.getState()+" "+this.getPostCode();
		return retValue;
	}

	public String getEmail() {
		if(email==null){
			email = "";
		}
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPreferredNumber(String preferredNumber) {
		this.preferredNumber = preferredNumber;
	}

	public String getPreferredNumber() {
		return preferredNumber;
	}

	public String getArea() {
		if (area == null) {
			area = "";
		}
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCountry() {
		if (country == null) {
			country = "";
		}
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getFrom() {
		return from;
	}
	
	public String getFromString() {
		if (this.getFrom() != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.format(this.getFrom());
		}else{
			return "Not Specified";
		}
	}

	public int getFromYearInt() {
		if (this.getFromYear() == null || this.getFromYear().equalsIgnoreCase("")) {
			return 0;
		}else if(this.getFromYear().equalsIgnoreCase("unknown")){
			return -1;
		}else{
			return Integer.parseInt(this.getFromYear());
		}
	}

	public int getFromMonthInt() {
		if (this.getFromMonth() == null || this.getFromMonth().equalsIgnoreCase("")) {
			return 0;
		}else if(this.getFromMonth().equalsIgnoreCase("unknown")){
			return -1;
		}else{
			return Integer.parseInt(this.getFromMonth());
		}
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	
	public void setFrom(String from) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			if (from != null) {
				this.setFrom(df.parse(from));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Date getTo() {
		return to;
	}
	
	public String getToString() {
		if (this.getTo() != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.format(this.getTo());
		}else{
			return "Not Specified";
		}
	}

	public int getToYearInt() {
		if (this.getToYear() == null || this.getToYear().equalsIgnoreCase("")) {
			return 0;
		}else if(this.getToYear().equalsIgnoreCase("unknown")){
			return -1;
		}else{
			return Integer.parseInt(this.getToYear());
		}
	}

	public int getToMonthInt() {
		if (this.getToMonth() == null || this.getToMonth().equalsIgnoreCase("")) {
			return 0;
		}else if(this.getToMonth().equalsIgnoreCase("unknown")){
			return -1;
		}else{
			return Integer.parseInt(this.getToMonth());
		}
	}

	public void setTo(Date to) {
		this.to = to;
	}

	public void setTo(String to) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			if (to != null) {
				this.setTo(df.parse(to));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
