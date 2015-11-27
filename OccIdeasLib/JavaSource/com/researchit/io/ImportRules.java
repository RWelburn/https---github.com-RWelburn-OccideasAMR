package com.researchit.io;

import com.javaranch.unittest.helper.sql.pool.JNDIUnitTestHelper;
import com.researchit.expert.ExpertAgent;

public class ImportRules {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
    		if(JNDIUnitTestHelper.notInitialized()){           
    			JNDIUnitTestHelper.init("C:/Storage/Development/OccIDEAS/workspace/OccIdeasV2/JavaSource/com/researchit/test/occideasdb.properties");
 
    			ExpertAgent ea = new ExpertAgent();
    			ea.setName("Lead");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\lead.clp");
    				ea.save();
    			}
    			ea.setName("Other Toxic Metals");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\ometals.clp");
    				ea.save();
    			}
    			ea.setName("Other Metals");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\otmetals.clp");
    				ea.save();
    			}
    			ea.setName("Wood Dust");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\wooddust.clp");
    				ea.save();
    			}
    			ea.setName("Organochlorines");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\organochlorines.clp");
    				ea.save();
    			}
    			ea.setName("Organophosphates");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\organochlorines.clp");
    				ea.save();
    			}
    			ea.setName("Phenoxy Herbicides");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\organochlorines.clp");
    				ea.save();
    			}
    			ea.setName("Other Herbicides");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\organochlorines.clp");
    				ea.save();
    			}
    			ea.setName("Other Pesticides");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\organochlorines.clp");
    				ea.save();
    			}
    			ea.setName("Mineral Oils");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\mineraloils.clp");
    				ea.save();
    			}
    			ea.setName("Synthetic Oils");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\syntheticoils.clp");
    				ea.save();
    			}
       			ea.setName("Natural Oils");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\naturaloils.clp");
    				ea.save();
    			}
       			ea.setName("Mineral Fertilizers");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\naturaloils.clp");
    				ea.save();
    			}
       			ea.setName("Natural Fertilizers");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\naturaloils.clp");
    				ea.save();
    			}
       			ea.setName("Diesel Exhaust");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\dieselexhaust.clp");
    				ea.save();
    			}
       			ea.setName("Petrol Exhaust");
    			if(ea.exists()){
    				ea.setExpertRuleFilePath("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\Rules\\petrolexhaust.clp");
    				ea.save();
    			}
                
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
