package com.researchit.common;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Person extends DBBaseObject {
    protected String firstName;

    protected String lastName;

    protected String title;

    protected String middleName;
    protected String fullName;
	
    protected List<Address> addresses = new ArrayList<Address>();

    public Person() {
        super();
    }

    public Person(String id) throws Exception {
        super();
        setId(id);
        getPersistantObject();
    }

    protected void getPersistantObject() throws Exception {
        String query = "SELECT * FROM people WHERE id =" + id;
        try {
            this.connect();
            this.getStatement();
            resultSet = this.executeQuery(query);
            if (resultSet != null && resultSet.next()) {
                id = resultSet.getString("id");
                this.setTitle(resultSet.getString("title"));
                this.setFirstName(resultSet.getString("first_name"));
                this.setMiddleName(resultSet.getString("middle_name"));
                this.setLastName(resultSet.getString("last_name"));
            }
            closeStatement();
        } finally {
            closeConnection();
        }
 //       this.getPersistantAddresses();

    }

    public void getPersistantAddresses() throws Exception {
        String query = "SELECT id FROM addresses WHERE person_id =" + this.getId() +" ORDER BY Id";
        try {
            this.connect();
            this.getStatement();
            resultSet = this.executeQuery(query);
            this.addresses = new ArrayList<Address>();
            if (resultSet != null ) {
                while(resultSet.next()){
                    this.addresses.add(new Address(resultSet.getString("id")));
                }
            }
            closeStatement();
        } finally {
            closeConnection();
        }
    }

    public void delete() throws Exception {
        try {
            this.connect();
            this.getStatement();
            this.connection.setAutoCommit(false) ;
            String sql = "DELETE FROM addresses WHERE person_id=" + this.getId();
            this.insertUpdate(sql);
            sql = "DELETE FROM people WHERE id=" + this.getId();
            this.getStatement();
            this.insertUpdate(sql);	                
            this.connection.commit() ;
            closeStatement();
        } finally {
            closeConnection();
        }
    }

    public boolean exists() throws Exception {
        if (!(this.getId().equalsIgnoreCase(""))) {
            String sql = "SELECT id from people WHERE id=" + getId();
            return this.recordExists(sql);
        } else {
            return false;
        }
    }

    public void save() throws Exception {
        boolean updating = exists();
        String sql;
        java.sql.PreparedStatement pst;
        try {
            connect();
            if (updating) {
                sql = "UPDATE people SET title=?, first_name=?, middle_name=?, last_name=?"
                        + " WHERE id=?";
                pst = getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                pst.setInt(5, Integer.parseInt(getId()));
            } else {
                sql = "INSERT INTO people (title, first_name, middle_name, last_name) "
                        + "VALUES (?, ?, ?, ?)";
                pst = getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            }
            pst.setString(1, getTitle());
            pst.setString(2, getFirstName());
            pst.setString(3, getMiddleName());
            pst.setString(4, getLastName());
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
    //      update changelog
//            sql = "INSERT INTO changelog (changed_on, changed_by, SQLText) VALUES(?,?,?)";
//            pst = getConnection().prepareStatement(sql);
//            pst.setDate(1, Utility.dateToSQL(new Date()));
//            pst.setString(2, this.getUsername()); 
//            pst.setString(3,pstString);
//            pst.execute();
//            pst.close();
            this.saveAddresses();
        } finally {
            closeConnection();
        }
    }

    private void saveAddresses() throws Exception {
    	if(this.addresses!=null){
    		for (Address address : this.addresses) {
                address.setPersonId(id);
                address.save();
            }
    	}
    }
    
    
    public Address getResidentialAddress() throws Exception {
    	Address a = new Address();
    	for (Address address: this.getAddresses()) {
    		if (Address.TYPERESIDENTIAL.equals(address.getType())) {
    			a = address;
    		}
    	}
    	return a;
    }
    
    public Address getPostalAddress() throws Exception {
    	Address a = new Address();
    	for (Address address: this.getAddresses()) {
    		if (Address.TYPEPOSTAL.equals(address.getType())) {
    			a = address;
    		}
    	}
    	return a;
    }

    /**
     * Updates the list of address for this person with a new Residential Address
     * 
     * If moved is true, the old address is arhived, if moved is false, the old address is simply replaced
     * @param address
     * @param moved is this new address because the person has moved (should the old address be archived or deleted)
     * @throws Exception
     */
	public void setResidentialAddress(Address address, boolean moved) throws Exception {
		Address old=getResidentialAddress();
		if (old.getId() != null && !"".equals(old.getId())) {
			if (moved) {
				old.setType(Address.TYPEARCHIVED);
			} else {
				addresses.remove(old);
				old.delete();
				
			}
		}
		address.setType(Address.TYPERESIDENTIAL);
		addresses.add(address);
		
	}
    
	/**
	 * Updates the list of addresses for this person with a new Postal Address
	 * @param address
	 * @throws Exception
	 */
	public void setPostalAddress(Address address) throws Exception {
		Address old = getPostalAddress();
		if (old.getId() != null && !"".equals(old.getId())) {
			addresses.remove(old);
			old.delete();
		}
		address.setType(Address.TYPEPOSTAL);
		addresses.add(address);
	}
    
    public String getFirstName() {
    	if (this.firstName == null) {
            this.firstName = "";
        }else if (this.firstName.equals("NULL")) {
            this.firstName = "";
        }
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
    	if (this.lastName == null) {
            this.lastName = "";
        }else if (this.lastName.equals("NULL")) {
            lastName = "";
        }
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
    	if (this.middleName == null) {
            this.middleName = "";
        }else if (this.middleName.equalsIgnoreCase("NULL")) {
            this.middleName = "";
        }
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getTitle() {
    	if (this.title == null) {
            this.title = "";
        }else if (this.title.equalsIgnoreCase("NULL")) {
            this.title = "";
        }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Address> getAddresses() throws Exception {
       if (this.addresses == null) {
           this.addresses = new ArrayList<Address>();
       }
    	this.getPersistantAddresses();
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    /**
     * @return Returns the fullName.
     */
    public String getFullName() {
        this.fullName = this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
        if (this.fullName.equals("  ")) {
        	this.fullName = "No Name";
        }
        return fullName;
    }
    

    /**
     * @param fullName The fullName to set.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
