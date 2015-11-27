package com.researchit.test;

import junit.framework.TestCase;

import com.javaranch.unittest.helper.sql.pool.JNDIUnitTestHelper;

public class ExtensiveTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		if(JNDIUnitTestHelper.notInitialized()){           
            JNDIUnitTestHelper.init("C:/wtp-eclipse/eclipse/workspace/OccIdeasV2/JavaSource/com/researchit/test/occideasdb.properties");
 //           JNDIUnitTestHelper.init("C:/Storage/Development/QCF-OEIDS/wtp-eclipse/eclipse/workspace/OccIdeasV2/JavaSource/com/qldcancer/test/occideasdb.properties");
   //         JNDIUnitTestHelper.init("X:/wtp-eclipse/eclipse/workspace/OccIdeasLib/JavaSource/com/qldcancer/test/occideasdb.properties");
        }
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testExtensive() throws Exception{
	//	Importer imp = new Importer();
		//imp.importTextJSMFile("C:\\OEIDS\\ExportsTest\\$DR.txt");	
        //imp.importTextJSMFiles("C:\\OEIDS\\ExportsTest");
	}
}
