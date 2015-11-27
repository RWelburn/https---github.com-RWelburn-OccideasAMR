package com.researchit.test;

import junit.framework.TestCase;

import com.javaranch.unittest.helper.sql.pool.JNDIUnitTestHelper;

public class ExpertTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		if(JNDIUnitTestHelper.notInitialized()){   	
            JNDIUnitTestHelper.init("C:/Storage/Development/OccIDEAS/workspace/OccIdeasV2/JavaSource/com/researchit/test/occideasdb.properties");
         }
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testExpert() throws Exception{
		
	}
}
