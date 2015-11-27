/**
 * Version:
 *     $Id: AgentGroup.java,v 1.9 2008/08/25 01:37:18 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: AgentGroup.java,v $
 *     Revision 1.9  2008/08/25 01:37:18  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.8  2008/05/26 08:22:04  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgentGroup extends Agent {

    private ArrayList<Agent> agents;
    private ArrayList<AgentGroup> agentGroups;
    private int searchMatches;
	
	public AgentGroup() {
		super();
	}
	public AgentGroup(String dbID) throws Exception {
		super(dbID);
	}
	public List<Agent> getAgents() throws Exception {
		if(this.agents==null){
			this.getPersistentAgents();
		}
		return agents;
	}
    private void getPersistentAgentGroups() throws Exception {
        ResultSet rs = null;
        try {
            ArrayList<AgentGroup> groups = new ArrayList<AgentGroup>();
            String strSQL = "SELECT id,name,description FROM agent "
                    + "WHERE (parentagentid IS NULL) ORDER BY name";
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    AgentGroup agent = new AgentGroup();
                    String id = rs.getString("id");
                    agent.setId(id);
                    groups.add(agent);
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
            this.setAgentGroups(groups);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {         
            this.closeConnection();         
        }
        for(AgentGroup agentgroup: this.getAgentGroups()){
        	agentgroup.getPersistentObject();
        }
    }	
	private void getPersistentAgents() throws Exception {
		ResultSet rs = null;
		try {
			ArrayList<Agent> children = new ArrayList<Agent>();
			String strSQL = "SELECT id,name,description FROM agent "
					+ "WHERE (parentagentid = " + this.getId()
					+ ") ";
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					Agent agent = new Agent();
					agent.setId(rs.getString("id"));
					children.add(agent);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
			this.setAgents(children);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {			
			this.closeConnection();			
		}
		for(Agent agent: this.getAgents()){
        	agent.getPersistentObject();
        }
	}
	public void setAgents(ArrayList<Agent> agents) {
		this.agents = agents;
	}
	public ArrayList<AgentGroup> getSearchedAgentGroups(String search) throws Exception {
		ArrayList<AgentGroup> retVal = new ArrayList<AgentGroup>();
		ArrayList<AgentGroup> agArray = getAgentGroups();
		int searchMatches = 0;
		List<Agent> agentsArray;
		boolean matched = false;

		for(AgentGroup ag: agArray)	{
			searchMatches = 0;
			if(ag.getName().toLowerCase().contains(search.toLowerCase())){
				matched = true;
				searchMatches ++;
			}
			agentsArray = ag.getAgents();
			for( Agent a: agentsArray){
				if(a.getName().toLowerCase().contains(search.toLowerCase())){
					matched = true;
					searchMatches ++;
				}
			}
			if(matched){
				ag.setSearchMatches(searchMatches);
				retVal.add(ag);
				matched = false;
			}
		}
		return retVal;
	}	
    public ArrayList<AgentGroup> getAgentGroups() throws Exception {
        if(this.agentGroups==null){
            this.getPersistentAgentGroups();
        }
        return this.agentGroups;
    }
    public void setAgentGroups(ArrayList<AgentGroup> agentGroups) {
        this.agentGroups = agentGroups;
    }
	public int getSearchMatches() {
		return searchMatches;
	}
	public void setSearchMatches(int searchMatches) {
		this.searchMatches = searchMatches;
	}   
}
