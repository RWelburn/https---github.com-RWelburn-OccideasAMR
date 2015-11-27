/**
 * Version:
 *     $Id: JobSpecificModule.java,v 1.123 2009/05/06 08:25:12 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: JobSpecificModule.java,v $
 *     Revision 1.123  2009/05/06 08:25:12  troy.sadkowsky
 *     occideas new version updates
 *
 *     Revision 1.122  2009/05/01 02:23:54  troy.sadkowsky
 *     updates for more error handles on export and import
 *
 *     Revision 1.121  2009/02/15 05:54:11  ray.welburn
 *     Add rules array
 *
 *     Revision 1.120  2009/02/04 22:44:24  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.119  2008/12/23 10:32:25  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.118  2008/12/20 02:07:08  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.117  2008/11/15 09:08:59  troy.sadkowsky
 *     various bug fixes and code cleaning
 *
 *     Revision 1.116  2008/10/20 00:37:49  troy.sadkowsky
 *     to excel show rules
 *
 *     Revision 1.115  2008/10/03 02:57:30  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.114  2008/09/20 08:59:29  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.113  2008/09/10 09:11:35  troy.sadkowsky
 *     ASsessment updates
 *
 *     Revision 1.112  2008/09/03 07:35:24  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.111  2008/09/02 23:30:44  Troy.Sadkowsky
 *     removed old code and enhanced jsm exporter
 *
 *     Revision 1.110  2008/08/25 01:37:22  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.109  2008/08/18 07:10:07  troy.sadkowsky
 *     connection close error
 *
 *     Revision 1.108  2008/08/11 01:50:48  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.107  2008/08/02 06:16:56  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.106  2008/07/23 00:14:40  troy.sadkowsky
 *     flat file frozen jsm
 *
 *     Revision 1.105  2008/07/18 06:06:02  troy.sadkowsky
 *     new flat frozen jsm
 *
 *     Revision 1.104  2008/06/29 23:22:09  troy.sadkowsky
 *     enhanced export function
 *
 *     Revision 1.103  2008/06/11 00:37:26  troy.sadkowsky
 *     refactor insert and updates
 *
 *     Revision 1.102  2008/05/26 08:22:03  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.101  2008/05/18 12:17:51  troy.sadkowsky
 *     implmented q count funciton
 *
 *     Revision 1.100  2008/05/10 07:40:24  troy.sadkowsky
 *     updates for export JSMs
 *
 *     Revision 1.99  2008/03/17 03:28:48  troy.sadkowsky
 *     fix to show questions associated by agents through aJSMs
 *
 *     Revision 1.98  2008/03/16 03:47:29  ray.welburn
 *     Add Global min max button
 *
 *     Revision 1.97  2008/03/12 07:40:38  troy.sadkowsky
 *     record last updated for JSM mods
 *
 *     Revision 1.96  2008/03/05 05:05:59  troy.sadkowsky
 *     import aJSMs
 *
 *     Revision 1.95  2008/03/01 04:25:19  troy.sadkowsky
 *     no crossed facts
 *
 *     Revision 1.94  2008/02/25 04:21:51  troy.sadkowsky
 *     new export function
 *
 *     Revision 1.93  2008/02/15 08:49:24  troy.sadkowsky
 *     copy jsms function
 *
 *     Revision 1.92  2008/02/15 04:00:33  troy.sadkowsky
 *     removed olf code, added data cleaning functions and ui updates
 *
 *     Revision 1.91  2008/02/08 07:36:50  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.90  2008/02/03 23:29:50  troy.sadkowsky
 *     only show started interviews
 *
 *     Revision 1.89  2008/01/24 11:20:13  troy.sadkowsky
 *     rett participant interview status
 *
 *     Revision 1.88  2008/01/15 13:50:18  troy.sadkowsky
 *     connection problem and ajsm links
 *
 *     Revision 1.87  2008/01/15 12:14:48  troy.sadkowsky
 *     speed up rule view
 *
 *     Revision 1.86  2007/12/08 05:45:41  ray.welburn
 *     Change Associated JSMS to list Uses AJSMS list and Used By JSM list
 *
 *     Revision 1.85  2007/12/04 05:11:42  ray.welburn
 *     Correct message when linked ajsm is deleted
 *
 *     Revision 1.84  2007/11/24 03:58:54  troy.sadkowsky
 *     filter by participant status
 *
 *     Revision 1.83  2007/11/23 06:35:08  troy.sadkowsky
 *     logic for if comments is null
 *
 *     Revision 1.82  2007/11/21 07:38:55  troy.sadkowsky
 *     bug fix for showing shared aJSMs
 *
 *     Revision 1.81  2007/11/21 01:54:39  ray.welburn
 *     Change default comments and credits to blank
 *
 *     Revision 1.80  2007/11/14 05:14:13  troy.sadkowsky
 *     jh statuses
 *
 *     Revision 1.79  2007/10/25 23:58:01  troy.sadkowsky
 *     removed old code and removed share conn on updates and selects
 *
 *     Revision 1.78  2007/10/25 03:45:53  troy.sadkowsky
 *     bug fix for comments insert
 *
 *     Revision 1.77  2007/10/22 04:01:50  troy.sadkowsky
 *     small fix for sorting agents in lhsm
 *
 *     Revision 1.76  2007/10/18 23:10:16  troy.sadkowsky
 *     new import functions
 *
 *     Revision 1.75  2007/10/09 07:21:09  troy.sadkowsky
 *     auto create study specific jsms
 *
 *     Revision 1.74  2007/09/24 05:18:49  Troy.Sadkowsky
 *     select name jsms
 *
 *     Revision 1.73  2007/09/13 03:38:19  ray.welburn
 *     Refactor maxminimise of Q&A's and put functionality into JSM object
 *
 *     Revision 1.72  2007/09/11 23:04:26  troy.sadkowsky
 *     changes for sharing jsms
 *
 *     Revision 1.71  2007/09/05 00:01:39  Troy.Sadkowsky
 *     minor fix for sql server query
 *
 *     Revision 1.70  2007/09/03 00:39:35  troy.sadkowsky
 *     updates for aug 24th meeting
 *
 *     Revision 1.69  2007/08/20 11:55:35  troy.sadkowsky
 *     auto minimize freq questions on agent rule view
 *
 *     Revision 1.68  2007/08/19 03:39:56  troy.sadkowsky
 *     removed needles suppress warnigns
 *
 *     Revision 1.67  2007/08/19 00:30:39  ray.welburn
 *     Update to Validation of AJSM linked JSMs
 *
 *     Revision 1.66  2007/08/13 00:19:47  troy.sadkowsky
 *     new jobhistory field requirements and sharing ability
 *
 *     Revision 1.65  2007/08/09 03:10:41  ray.welburn
 *     Search sting query modified to look for matches in description as well as in name
 *
 *     Revision 1.64  2007/08/08 23:53:51  troy.sadkowsky
 *     db and objects for share jsms feature
 *
 *     Revision 1.63  2007/08/06 21:55:02  troy.sadkowsky
 *     minor updates for isLInkedAJSM
 *
 *     Revision 1.62  2007/08/06 04:55:09  Troy.Sadkowsky
 *     replaced first with next to be compatible with sql server driver
 *
 *     Revision 1.61  2007/08/02 06:18:00  ray.welburn
 *     Added isLinkedAJSM method to JSM - checks to see if an AJSM is linked in the datebase. Returns false if not.
 *
 *     Revision 1.60  2007/07/28 01:32:51  troy.sadkowsky
 *     agent description updates and clean mql
 *
 *     Revision 1.59  2007/07/19 22:21:28  troy.sadkowsky
 *     rmeoved references to windows c path so app will work on linux os
 *
 *     Revision 1.58  2007/07/15 23:09:09  troy.sadkowsky
 *     organised imports
 *
 *     Revision 1.57  2007/07/13 05:37:55  Jeff.Keys
 *     case sensitive search count
 *
 *     Revision 1.56  2007/07/08 23:21:04  Jeff.Keys
 *     ordered jsm searches
 *
 *     Revision 1.55  2007/07/03 07:33:35  Jeff.Keys
 *     do not search on question description
 *
 *     Revision 1.54  2007/07/03 03:30:54  troy.sadkowsky
 *     show duplicate keyphrases
 *
 *     Revision 1.53  2007/07/02 00:42:28  troy.sadkowsky
 *     new comments field in insert jsm
 *
 *     Revision 1.52  2007/07/01 02:31:55  Jeff.Keys
 *     jsm comments field
 *
 *     Revision 1.51  2007/06/28 14:40:55  Jeff.Keys
 *     questionnaire searches -structure
 *
 *     Revision 1.50  2007/06/28 07:29:51  Jeff.Keys
 *     questionnaire searches
 *
 *     Revision 1.49  2007/06/17 03:46:35  Jeff.Keys
 *     questionnaire searches -agents
 *
 *     Revision 1.48  2007/06/17 00:23:12  Jeff.Keys
 *     questionnaire searches -agents
 *
 *     Revision 1.47  2007/06/16 02:53:52  Jeff.Keys
 *     occIDEAS alpha maintenance
 *
 *     Revision 1.46  2007/06/09 01:29:14  Jeff.Keys
 *     Include jsm.userid in jsm searches
 *
 *     Revision 1.45  2007/06/03 23:19:49  Troy.Sadkowsky
 *     build 1.30 updates
 *
 *     Revision 1.44  2007/05/30 00:58:31  Troy.Sadkowsky
 *     my JSMs will only show those that the current logged in user has created
 *
 *     Revision 1.43  2007/05/22 11:19:02  Troy.Sadkowsky
 *     study options
 *
 *     Revision 1.42  2007/05/12 14:09:44  jeff.keys
 *     clean up comments
 *
 *     Revision 1.41  2007/05/03 13:52:50  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.40  2007/04/30 04:30:37  jeff.keys
 *     q search review
 *
 *     Revision 1.39  2007/04/29 22:36:56  jeff.keys
 *     q search review
 *
 *     Revision 1.38  2007/04/25 21:56:25  Troy.Sadkowsky
 *     made dbobject sortable and removed old objects and functions
 *
 *     Revision 1.37  2007/04/13 04:17:13  Troy.Sadkowsky
 *     further rule creation updates and bug fix for adding new jsm
 *
 *     Revision 1.36  2007/04/12 13:27:00  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.35  2007/04/04 12:02:01  Troy.Sadkowsky
 *     linking jobs through template jsms
 *
 *     Revision 1.34  2007/03/30 04:54:56  Troy.Sadkowsky
 *     mods for user-study relationships
 *
 *     Revision 1.33  2007/03/21 13:46:10  Troy.Sadkowsky
 *     bug fix on copy template, datetime field, new add permission code, print view
 *
 *     Revision 1.32  2007/03/18 20:55:14  Troy.Sadkowsky
 *     bug 109 record participants contact details
 *
 *     Revision 1.31  2007/03/18 13:40:40  troy.sadkowsky
 *     new copy template jsm feature
 *
 *     Revision 1.30  2007/03/15 12:56:12  Troy.Sadkowsky
 *     minor updates for self administered interview
 *
 *     Revision 1.29  2007/03/11 11:12:37  troy.sadkowsky
 *     changed method of add and edit studies to not use popups
 *
 *     Revision 1.28  2007/02/20 02:23:32  Jeff
 *     *** empty log message ***
 *
 *     Revision 1.27  2007/02/20 02:14:28  Jeff
 *     Implement credits attribute
 *
 *     Revision 1.26  2007/02/18 08:04:40  Jeff
 *     Enhancement 88: from editjsm form allow users to add and remove ajsms
 *
 *     Revision 1.25  2007/02/18 01:07:13  Jeff
 *     Enhancement 88: from editjsm form allow users to add and remove ajsms
 *
 *     Revision 1.24  2007/02/15 13:18:25  Jeff
 *     Enhancement 88: Add ajsms. The addQuestion method doesn't work
 *
 *     Revision 1.23  2007/02/13 11:52:05  Jeff
 *     Enhancement 88: from editjsm form allow users to add and remove ajsms
 *
 *     Revision 1.22  2007/02/13 07:40:59  Jeff
 *     Enhancement 88: from editjsm form allow users to add and remove ajsms
 *
 *     Revision 1.21  2007/02/12 00:41:58  Jeff
 *     Add and remove AJSMs
 *
 *     Revision 1.20  2007/01/08 12:45:49  Administrator
 *     version 14 updates
 *
 *     Revision 1.19  2006/12/12 13:43:29  admin
 *     build v1.13
 *
 *     Revision 1.18  2006/11/24 23:02:30  admin
 *     updates before demo
 *
 *     Revision 1.17  2006/11/20 12:26:35  admin
 *     build v1.11 changes
 *
 *     Revision 1.16  2006/11/03 07:24:55  admin
 *     changed question types
 *
 *     Revision 1.15  2006/10/31 21:09:26  admin
 *     build v1.08
 *
 *     Revision 1.14  2006/10/17 00:15:28  admin
 *     mapping
 *
 *     Revision 1.13  2006/10/10 23:52:56  admin
 *     worked on jobs
 *
 *     Revision 1.12  2006/08/23 22:29:08  admin
 *     job history assessment counts
 *
 *     Revision 1.11  2006/07/27 23:19:13  admin
 *     version 1.02
 *
 *     Revision 1.10  2006/07/25 05:32:30  admin
 *     assessment updates
 *
 *     Revision 1.9  2006/07/25 05:29:06  admin
 *     new import functions
 *
 *     Revision 1.8  2006/06/30 05:55:14  administrator
 *     updates for rework
 *
 *     Revision 1.7  2006/06/29 05:49:00  administrator
 *     updates for rework
 *
 *     Revision 1.6  2006/06/16 02:10:21  administrator
 *     updates for rework
 *
 *     Revision 1.5  2006/06/15 05:16:23  administrator
 *     restructure progress
 *
 *     Revision 1.4  2006/06/14 06:59:08  administrator
 *     updates for rework
 *
 *     Revision 1.3  2006/06/13 23:28:52  administrator
 *     restructure progress
 *
 *     Revision 1.2  2006/06/12 06:58:32  administrator
 *     updates for rework
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.6  2006/05/31 07:15:34  administrator
 *     updates for rework
 *
 *     Revision 1.5  2006/05/30 23:45:44  administrator
 *     restructure progress
 *
 *     Revision 1.4  2006/05/24 06:01:22  administrator
 *     updates for rework
 *
 *     Revision 1.3  2006/05/23 23:22:13  administrator
 *     restructure progress
 *
 *     Revision 1.2  2006/05/22 06:18:16  administrator
 *     removed errors form first check in
 *
 *     Revision 1.1  2006/05/22 06:06:01  administrator
 *     Version 2
 *
 *     Revision 1.38  2006/04/21 02:25:52  administrator
 *     save assessment
 *
 *     Revision 1.37  2006/04/05 07:12:35  administrator
 *     filter out chemicals correctly
 *
 *     Revision 1.36  2006/04/04 02:12:40  administrator
 *     cleaned show all questions function
 *
 *     Revision 1.35  2006/03/29 02:25:53  administrator
 *     updates for exposure assessment
 *
 *     Revision 1.34  2006/03/24 06:29:24  administrator
 *     new functions for listing questions and possible answers
 *
 *     Revision 1.33  2006/03/24 02:39:35  administrator
 *     bug fix for interview associate jsm link and new function to show question list
 *
 *     Revision 1.32  2006/03/24 00:08:16  administrator
 *     bug fix for linking associate jsms
 *
 *     Revision 1.31  2006/03/22 06:43:11  administrator
 *     made export folder public
 *
 *     Revision 1.30  2006/03/21 22:16:44  administrator
 *     work on connections
 *
 *     Revision 1.29  2006/03/15 05:47:53  administrator
 *     additions for assesments
 *
 *     Revision 1.28  2006/03/13 04:02:40  administrator
 *     tidied code
 *
 *     Revision 1.27  2006/03/08 06:40:59  administrator
 *     version 0.27
 *
 *     Revision 1.26  2006/03/02 23:19:34  administrator
 *     changed objects to throw excpetions not throwables
 *
 *     Revision 1.25  2006/02/27 06:34:04  administrator
 *     new functionlaity and table for mapping occideas jobs to entered jobs
 *
 *     Revision 1.24  2006/02/24 06:28:49  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.23  2006/02/23 07:11:59  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.22  2006/02/23 04:04:26  administrator
 *     altered display of questions
 *
 *     Revision 1.21  2006/02/22 09:09:36  administrator
 *     converted throwable to exception
 *
 *     Revision 1.20  2006/02/20 09:13:02  administrator
 *     set to correct export path
 *
 *     Revision 1.19  2006/02/17 06:37:39  administrator
 *     new fields for notes and multiple answer questions
 *
 *     Revision 1.18  2006/02/16 22:44:06  administrator
 *     new connection pool
 *
 *     Revision 1.17  2006/02/08 00:12:57  administrator
 *     New Verion 0.23
 *
 *     Revision 1.16  2006/02/07 23:04:54  administrator
 *     include chemicals on export
 *
 *     Revision 1.15  2006/02/06 22:27:38  administrator
 *     put check box on JSM link for delete
 *
 *     Revision 1.14  2006/02/02 08:49:10  administrator
 *     integrate aJSM into mJSM
 *
 *     Revision 1.13  2006/02/01 06:49:58  administrator
 *     fixed scrolling through questions applying rules
 *
 *     Revision 1.12  2006/01/31 23:17:17  administrator
 *     change display look
 *
 *     Revision 1.11  2006/01/30 06:33:39  administrator
 *     eport function
 *
 *     Revision 1.10  2006/01/25 04:21:19  administrator
 *     neatened up show chems and rules
 *
 *     Revision 1.9  2006/01/17 23:51:54  administrator
 *     renamed showall questions
 *
 *     Revision 1.8  2006/01/13 06:57:34  administrator
 *     new interview section objects
 *
 *     Revision 1.7  2005/12/21 02:53:37  administrator
 *     job task display
 *
 *     Revision 1.6  2005/12/20 23:21:28  administrator
 *     add update to jsm
 *
 *     Revision 1.5  2005/12/07 04:28:49  administrator
 *     Job History implementation
 *
 *     Revision 1.4  2005/11/29 05:23:57  administrator
 *     green rules
 *
 *     Revision 1.3  2005/11/18 05:57:03  administrator
 *     iteration 8
 *
 *     Revision 1.2  2005/11/17 22:54:39  administrator
 *     interview functionality
 *
 *     Revision 1.1  2005/11/16 05:28:39  administrator
 *     new library to share amongst mql, ims and ams
 *
 *     Revision 1.31  2005/11/09 06:12:49  administrator
 *     clean up old code
 *
 *     Revision 1.30  2005/11/04 07:26:42  administrator
 *     jsm upload and import
 *
 *     Revision 1.29  2005/11/02 02:41:44  administrator
 *     Implemented Toggle feature for chemicals and rules
 *
 *     Revision 1.28  2005/11/01 22:42:46  administrator
 *     prep for M1
 *
 *     Revision 1.27  2005/10/20 05:46:32  administrator
 *     moved form
 *
 *     Revision 1.26  2005/10/11 22:11:35  administrator
 *     Floating action buttons, multiple chemicals and import function
 *
 *     Revision 1.25  2005/10/10 07:10:21  administrator
 *     implemented sequence change functionality
 *
 *     Revision 1.24  2005/09/30 06:50:24  administrator
 *     edit text functions
 *
 *     Revision 1.23  2005/09/30 00:26:00  administrator
 *     unify the interface and enhancement on action buttons
 *
 *     Revision 1.22  2005/09/14 04:29:13  administrator
 *     feature for creating rules
 *
 *     Revision 1.21  2005/09/13 23:19:11  administrator
 *     store count for multiple occurances of a question
 *
 *     Revision 1.20  2005/09/09 07:09:36  administrator
 *     Tidy up interface
 *
 *     Revision 1.19  2005/09/08 22:45:06  administrator
 *     reworked objects for job association
 *
 *     Revision 1.18  2005/09/02 07:15:55  administrator
 *     have way through new relationships restructure
 *
 *     Revision 1.17  2005/09/02 01:05:03  administrator
 *     new relationship change for mulitple questions
 *
 *     Revision 1.16  2005/08/29 04:44:40  administrator
 *     fixed structure functions
 *
 *     Revision 1.15  2005/08/24 03:42:08  administrator
 *     Connection is static and stays open
 *
 *     Revision 1.14  2005/08/24 03:04:14  administrator
 *     tidy up before conn bug fix
 *
 *     Revision 1.13  2005/08/24 01:35:57  administrator
 *     chemicals working with setting all levels
 *
 *     Revision 1.12  2005/08/23 23:34:53  administrator
 *     Chemical Associations
 *
 *     Revision 1.11  2005/08/22 10:11:34  administrator
 *     fixed child parent relationships
 *
 *     Revision 1.10  2005/08/22 05:55:53  administrator
 *     reworked connection method to close on overridden finalize
 *
 *     Revision 1.9  2005/08/22 03:55:26  administrator
 *     importer and furhter restructure with frames
 *
 *     Revision 1.8  2005/08/12 06:54:25  administrator
 *     import function
 *
 *     Revision 1.7  2005/08/12 00:58:22  administrator
 *     show all answers and questions
 *
 *     Revision 1.6  2005/08/05 03:27:32  administrator
 *     M1
 *
 *     Revision 1.5  2005/08/04 23:52:26  administrator
 *     Rules
 *
 *     Revision 1.4  2005/08/04 07:13:09  administrator
 *     structure removing
 *
 *     Revision 1.3  2005/08/04 04:22:56  administrator
 *     half implemented tab feature
 *
 *     Revision 1.2  2005/07/29 02:20:23  administrator
 *     fixed tree closing bug
 *
 *     Revision 1.1  2005/07/29 01:10:13  administrator
 *     table format of questions and answers
 *
 *     
 */
package com.researchit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.researchit.common.DBBaseObject;
import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertRule;

public class JobSpecificModule extends DBBaseObject implements Comparable<JobSpecificModule> {

	public static final int TEMPLATE = 0;
	public static final int STUDY = 1;
	public static final int EVALUATION = 3;
	private ArrayList<Question> questions;
	private ArrayList<PossibleAnswer> possibleAnswers;
	protected ArrayList<Agent> agents;
	protected ArrayList<User> users;
	protected ArrayList<ExpertRule> rules;
	protected String interviewStartNote;
	protected String interviewEndNote;
	protected int questionCount = -1;
	protected int possibleAnswerCount = -1;
	//private ArrayList<JobTitle> jobs;
	private boolean associateModule;	
	private boolean readOnly;
	private String credits;
//	private int jobHistoryCount = -1;
	private int jobHistoryAssessedCount = -1;
	private int jsmTypeId = 0;
	private String parentJSMId;
	private String userId;
	protected String errorMessage;
	private String comments;
	private int searchCount = 0;	
	private String dateUpdated;
	private String jsmAssociates = "";
	private String forumLink;
	private String studyId = "";

	public String getForumLink() {
		if(forumLink==null){
			forumLink = "";
		}else if (forumLink.equalsIgnoreCase("null")) {
			return "";
		}
		return forumLink;
	}
	public void setForumLink(String forumLink) {
		this.forumLink = forumLink;
	}
	public String getComments() {
		if(this.comments==null){
			return "";
		}else if (this.comments.equalsIgnoreCase("null")) {
			return "";
		}else {
			return this.comments;			
		}
	}
	public void setComments(String value) {
		this.comments = value;
	}
	public int getJsmTypeId() {
		return jsmTypeId;
	}
	public void setJsmTypeId(int type) {
		this.jsmTypeId = type;
	}
	public int getJobHistoryAssessedCount() {
		return jobHistoryAssessedCount;
	}
	public void setJobHistoryAssessedCount(int jobHistoryAssessedCount) {
		this.jobHistoryAssessedCount = jobHistoryAssessedCount;
	}
	/*public ArrayList<JobTitle> getJobs() throws Exception {
		if (this.jobs == null) {
			this.getPersistentJobs();
		}
		return jobs;
	}*/
/*	public void setJobs(ArrayList<JobTitle> jobs) {
		this.jobs = jobs;
	}*/
	public ArrayList<Question> getQuestions() throws Exception {
		if (this.questions == null) {
			this.getPersistentQuestions();
		}
		return questions;
	}
	
	public ArrayList<Question> getQuestionList() throws Exception {
		ResultSet rs = null;
		ArrayList<Question> questions = new ArrayList<Question>();
		String strSQL = "SELECT jsmquestionstructure.id, questionid, sequence, parentid, notes, ismultiple"
				+ " FROM jsmquestionstructure "
				+ " WHERE (jsmid = "
				+ this.getId()
				+ ") ";
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String qid = rs.getString("questionid");
				String linkedqid = rs.getString("id");
				Question question = new Question();
				question.setId(qid);
				question.setJsmStructureQuestionID(linkedqid);
				question.setSequence(rs.getString("sequence"));
				questions.add(question);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(Question q:questions){
			q.getPersistentStructureObject();
		}
		return questions;
	}
	public ArrayList<Question> getQuestions(String agentId) throws Exception {
		ResultSet rs = null;
		ArrayList<Question> questions = new ArrayList<Question>();
		String strSQL = "SELECT DISTINCT jsmquestionstructure.id, questionid, sequence, parentid, notes, ismultiple"
				+ " FROM jsmquestionstructure LEFT OUTER JOIN jsmquestionstructureagent ON jsmquestionstructure.id = jsmquestionstructureagent.jsmquestionstructureid "
				+ " WHERE (jsmid = "
				+ this.getId()
				+ ") AND (parentid = "
				+ Question.ROOTPARENTID
				+ ") AND  ((jsmquestionstructureagent.agentid IN ("+agentId+")) OR (jsmquestionstructure.ajsmid IS NOT NULL) ) ORDER BY sequence";
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String qid = rs.getString("questionid");
				String linkedqid = rs.getString("id");
				Question question = new Question();
				question.setId(qid);
				question.setJsmStructureQuestionID(linkedqid);
				question.setSequence(rs.getString("sequence"));
				questions.add(question);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(Question q:questions){
			q.getPersistentStructureObject();
		}
		return questions;
	}
	public ArrayList<Question> getMjsmsQuestions(String strAgentIDs) throws Exception {
		ArrayList<Question> questions = new ArrayList<Question>();
		for (Question q : this.getQuestions(strAgentIDs)) {
			if (q.isAssociateJSM()) {
				String jsmID = q.getAssociateJSMID();
				if (!(jsmID.equalsIgnoreCase(""))) {
					//this.connect();
					JobSpecificModule jsm = new JobSpecificModule(jsmID);
					jsm.getFullQuestions();
					//this.closeConnection();
					if (jsm.getId() != "") {
						questions.addAll(jsm.getMjsmsQuestions(strAgentIDs));
					}
				}
			}else{
				q.filterChildQuestionsThroughAJSMs(strAgentIDs);
				questions.add(q);
			}
		}
		this.questions = questions;
		return questions;
	}
	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	public JobSpecificModule() {
		super();
	}
	public JobSpecificModule(String jsmID) throws Exception {
		this.setId(jsmID);
		this.getPersistentObject();
	}
	protected void getPersistentQuestions() throws Exception {
		ResultSet rs = null;
		ArrayList<Question> questions = new ArrayList<Question>();
		String strSQL = "SELECT id, questionid, sequence, parentid, notes, ismultiple"
				+ " FROM jsmquestionstructure"
				+ " WHERE (jsmid = "
				+ this.getId()
				+ ") AND (parentid = "
				+ Question.ROOTPARENTID
				+ ")" + " ORDER BY sequence";
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String qid = rs.getString("questionid");
				String linkedqid = rs.getString("id");
				Question question = new Question();
				question.setId(qid);
				question.setJsmStructureQuestionID(linkedqid);
				question.setSequence(rs.getString("sequence"));
				questions.add(question);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(Question q:questions){
			q.getPersistentStructureObject();
		}
		this.setQuestions(questions);
	}

/*	private void getPersistentJobs() throws Exception {
		ResultSet rs = null;
		try {
			ArrayList<JobTitle> jobs = new ArrayList<JobTitle>();
			String strSQL = "";
			if (this.getJsmTypeId() == JobSpecificModule.TEMPLATE) { // template jsm
				strSQL = "SELECT id, name, description" + " FROM  jobtitle"
						+ " WHERE (jsmid = " + this.getId() + ") ORDER BY name";
			} else if (this.getJsmTypeId() == JobSpecificModule.STUDY) { // not a template jsm
				strSQL = "SELECT id, name, description" + " FROM  jobtitle"
						+ " WHERE (jsmid = " + this.getParentJSMId()
						+ ") ORDER BY name";
			}

			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String jobid = rs.getString("id");
					JobTitle job = new JobTitle();
					job.setId(jobid);
					job.setName(rs.getString("name"));
					job.setDescription(rs.getString("description"));
					job.setJsmName(this.getName());
					jobs.add(job);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
			this.setJobs(jobs);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}*/
	public void removeLinkedQuestions() throws Exception {
		if (this.getId().equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing jsm");
		}
		try {
			String strSQL = "DELETE FROM jsmquestionstructure WHERE jsmid = "
					+ this.getId();
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public void removeQuestion(JobSpecificModule ajsm) throws Exception {

		try {
			ArrayList<Question> qs = this.getQuestions();
			String ajsmName = ajsm.getName();
			// ajsmName = ajsmName.substring(ajsmName.indexOf("-")+1).trim();
			for (Question q : qs) {
				String qName = q.getName().substring(
						q.getName().indexOf(":") + 1).trim();
				if (ajsmName.equals(qName)) {
					q.unLink();
					questions.remove(q);
					break;
				}
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public void linkToPossibleAnswer(PossibleAnswer pa) throws Exception {
		String ajsmName = this.getName();
		ajsmName = "JSM: " + ajsmName.trim();
		Question q = new Question();
		q.setName(ajsmName);
		q.setDescription(ajsmName);
		q.setTypeID(Question.ASSOCIATEJSMLINK);
		q.setAjsmId(this.getId());
		if(!(q.exists())){
			q.insert();
		}
		q.linkToPossibleAnswer(pa.getId(), pa.getJsmQuestionPossibleAnswerStructureID());
	}
	public void linkAssociateJSM(JobSpecificModule ajsm) throws Exception {
		String ajsmName = ajsm.getName();
		ajsmName = "JSM: " + ajsmName.trim();
		Question q = new Question();
		q.setName(ajsmName);
		q.setDescription(ajsmName);
		q.setTypeID(Question.ASSOCIATEJSMLINK);
		q.setAjsmId(ajsm.getId());
		if(!(q.exists())){
			q.insert();
		}
		q.linkToJSM(this.getId());
	}
	public void delete() throws Exception {		
		//remove all rules
		for(Agent agent: this.getAgents()){
			for(ExpertRule er: this.getRules(agent)){
				er.delete();
			}
		}
		String strSQL = "";
		try {
			strSQL = "DELETE FROM jsmquestionstructure WHERE jsmid = "
					+ this.getId();
			this.sqlExecuteUpdate(strSQL);
			strSQL = "DELETE FROM jsm WHERE id = " + this.getId();
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public boolean exists() throws Exception {
		return this.exists(null);
	}
	public boolean exists(Connection conn) throws Exception {
		boolean bRetValue = false;
		if (!(this.getId().equalsIgnoreCase(""))) {
			bRetValue = true;
		} else {
			String strSQL = "SELECT id FROM jsm WHERE name = '"
					+ this.escapeSpecialCharacters(this.getName()) + "'";
			ResultSet rs = null;
			try {
				rs = this.sqlExecuteSelect(strSQL,conn);
				if (rs != null) {
					if (rs.next()) {
						this.setId(rs.getString("id"));
						bRetValue = true;
					}
					if (rs.getStatement() != null) {
						rs.getStatement().close();
					}
					rs.close();
				}
			} catch (SQLException e) {
				throw new Exception(e.getMessage());
			} finally {
				this.closeConnection();
			}
		}
		return bRetValue;
	}
	private void getPersistentObject() throws Exception {
		String strSQL = "SELECT id," + "name," + "description,"
				+ "isassociate," + "interviewstartnote," + "interviewendnote, "
				+ "credits," + "jsmtypeid," + "parentjsmid," + "userid, "
				+ "comments, readonly, forumlink " + "FROM jsm WHERE id = " + this.getId();

		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setDescription(rs.getString("description"));
					this.setAssociateModule(rs.getBoolean("isassociate"));
					this.setName(rs.getString("name"));
					this.setInterviewStartNote(rs
							.getString("interviewstartnote"));
					this.setInterviewEndNote(rs.getString("interviewendnote"));
					this.setCredits(rs.getString("credits"));
					this.setJsmTypeId(rs.getInt("jsmtypeid"));
					this.setParentJSMId(rs.getString("parentjsmid"));
					this.setUserId(rs.getString("userid"));
					this.setComments(rs.getString("comments"));
					this.setReadOnly(rs.getBoolean("readonly"));
					this.setForumLink(rs.getString("forumlink"));
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void save() throws Exception {
		String strSQL = "";
		if (this.exists()) {
			int isAssociate = (int) (Boolean.valueOf(this.isAssociateModule())
					.booleanValue() ? 1 : 0);
			strSQL = "UPDATE jsm SET name='"
					+ this.escapeSpecialCharacters(this.getName())
					+ "',description='"
					+ this.escapeSpecialCharacters(this.getDescription())
					+ "',interviewstartnote='"
					+ this.escapeSpecialCharacters(this.getInterviewStartNote())
					+ "',interviewendnote='"
					+ this.escapeSpecialCharacters(this.getInterviewEndNote())
					+ "',isassociate=" + isAssociate + ",credits='"
					+ this.escapeSpecialCharacters(this.getCredits())
					+ "',jsmtypeid=" + this.getJsmTypeId() + ",parentjsmid="
					+ this.getParentJSMId() + ",userid=" + this.getUserId()
					+ ",comments='" + this.getComments() + "',forumlink='" + this.getForumLink() + "' WHERE id = "
					+ this.getId();
			try {
				this.sqlExecuteUpdate(strSQL);
			} catch (SQLException e) {
				throw new Exception(e.getMessage());
			}
		} else {
			this.insert();
		}
	}
	public void insert() throws Exception{
		this.insert(null);
	}
	public void insert(Connection conn) throws Exception{
		int isAssociate = (int) (Boolean.valueOf(this.isAssociateModule()).booleanValue() ? 1 : 0);
		String strSQL = "INSERT INTO jsm "
				+ "(name,"
				+ "description,"
				+ "interviewstartnote,"
				+ "interviewendnote,"
				+ "isassociate,"
				+ "credits,"
				+ "jsmtypeid,"
				+ "parentjsmid,"
				+ "userid,comments,forumlink) VALUES('"
				+ this.escapeSpecialCharacters(this.getName())
				+ "','"
				+ this.escapeSpecialCharacters(this.getDescription())
				+ "','"
				+ this.escapeSpecialCharacters(this.getInterviewStartNote()) + "','"
				+ this.escapeSpecialCharacters(this.getInterviewEndNote())
				+ "'," + isAssociate + ",'"
				+ this.escapeSpecialCharacters(this.getCredits()) + "',"
				+ this.getJsmTypeId() + "," + this.getParentJSMId() + ","
				+ this.getUserId() + ",'" + this.escapeSpecialCharacters(this.getComments()) 
				+ "','" + this.escapeSpecialCharacters(this.getForumLink()) + "')";
		try {
			String id = String.valueOf(this.sqlExecuteInsert(strSQL,conn));
			this.setId(id);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public void getFullQuestions() throws Exception {
		for (Question q : this.getQuestions()) {
			q.getFullPossibleAnswers();
		}
	}
	public ArrayList<Agent> getAgents() throws Exception {
		if (this.agents == null) {
			this.getPersistentAgents();
		}
		return agents;
	}
	private void getPersistentAgents() throws Exception {
		ResultSet rs = null;
		try {
			this.agents = new ArrayList<Agent>();
			String strSQL = "SELECT DISTINCT agent.id AS id"
					+ " FROM (jsmquestionstructureagent INNER JOIN jsmquestionstructure ON jsmquestionstructureagent.jsmquestionstructureid = jsmquestionstructure.id) INNER JOIN agent ON jsmquestionstructureagent.agentid = agent.id"
					+ " WHERE (((jsmquestionstructure.jsmid)=" + this.getId() + ")) ORDER BY agent.id";
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					Agent agent = new Agent();
					agent.setId(id);
					this.agents.add(agent);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		for(Agent agent:this.agents){
			agent.getPersistentObject();
		}
	}
	public ArrayList<Agent> getAgentGroups() throws Exception {
		ResultSet rs = null;
		ArrayList<Agent> agents = new ArrayList<Agent>();
		try {			
			String strSQL = "SELECT DISTINCT agent.parentagentid AS id"
					+ " FROM (jsmquestionstructureagent INNER JOIN jsmquestionstructure ON jsmquestionstructureagent.jsmquestionstructureid = jsmquestionstructure.id) INNER JOIN agent ON jsmquestionstructureagent.agentid = agent.id"
					+ " WHERE (((jsmquestionstructure.jsmid)=" + this.getId() + ")) ORDER BY id";
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					if(id!=null){
						Agent agent = new Agent();
						agent.setId(id);
						agents.add(agent);
					}					
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		for(Agent agent:agents){
			agent.getPersistentObject();
		}
		return agents;
	}
	public boolean hasAgent(String agentID) throws Exception {
		boolean retValue = false;
		for (Agent agent : this.getAgents()) {
			if (agent.getId().equalsIgnoreCase(agentID)) {
				retValue = true;
				break;
			}
		}
		return retValue;
	}
	public void setCredits(String newCredits) {
		this.credits = newCredits;
	}
	public String getCredits() {
		if(this.credits == null){
			return "";
		}else if (this.credits.equalsIgnoreCase("null")) {
			return "";
		}else {
			return this.credits;			
		}
	}
	public boolean isAssociateModule() {
		return associateModule;
	}
	public void setAssociateModule(boolean associateModule) {
		this.associateModule = associateModule;
	}
	public String getInterviewEndNote() {
		return interviewEndNote;
	}
	public void setInterviewEndNote(String interviewEndNote) {
		this.interviewEndNote = interviewEndNote;
	}
	public String getInterviewStartNote() {
		return interviewStartNote;
	}
	public void setInterviewStartNote(String interviewStartNote) {
		this.interviewStartNote = interviewStartNote;
	}
	public ArrayList<JobSpecificModule> getStudySpecificAJSMs(String userId)
			throws Exception {
		ArrayList<JobSpecificModule> retValue = new ArrayList<JobSpecificModule>();
		if ((this.isAssociateModule()) || (this.getId().equalsIgnoreCase(""))) {
			String strSQL = "SELECT id FROM jsm WHERE isassociate = 1 AND jsmtypeid = 1 AND userid = "
					+ userId + " ORDER BY name";
			retValue = this.getJobSpecificModules(strSQL);
			strSQL = "SELECT DISTINCT jsmid AS id FROM userjsms INNER JOIN jsm ON userjsms.jsmid = jsm.id WHERE (userjsms.userid = "+userId+") AND (jsm.isassociate = 1)";
			retValue.addAll(this.getJobSpecificModules(strSQL));
		} else {
			for (Question q : this.getQuestions()) {
				if (q.isAssociateJSM()) {
					String jsmId = q.getAssociateJSMID();
					if (!(jsmId.equalsIgnoreCase(""))) {
						JobSpecificModule jsm = new JobSpecificModule(jsmId);
						retValue.add(jsm);
					}
				}
			}
		}
		return retValue;
	}
	public ArrayList<JobSpecificModule> getTemplateAJSMs()
			throws Exception {
		ArrayList<JobSpecificModule> retValue = new ArrayList<JobSpecificModule>();
		if ((this.isAssociateModule()) || (this.getId().equalsIgnoreCase(""))) {
			String strSQL = "SELECT id FROM jsm WHERE isassociate = 1 AND jsmtypeid = 0 ORDER BY name";
			retValue = this.getJobSpecificModules(strSQL);
		} else {
			for (Question q : this.getQuestions()) {
				if (q.isAssociateJSM()) {
					String jsmId = q.getAssociateJSMID();
					if (!(jsmId.equalsIgnoreCase(""))) {
						JobSpecificModule jsm = new JobSpecificModule(jsmId);
						retValue.add(jsm);
					}
				}
			}
		}
		return retValue;
	}
	public ArrayList<JobSpecificModule> getJobSpecificModules(String strSQL)
			throws Exception {
		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String jsmID = rs.getString("id");
					JobSpecificModule jsm = new JobSpecificModule();
					jsm.setId(jsmID);
					jsms.add(jsm);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		for(JobSpecificModule jsm: jsms){
			jsm.getPersistentObject();
		}
		return jsms;
	}
	public ArrayList<JobSpecificModule> getTemplateJSMs()
			throws Exception {
		String strSQL = "SELECT id FROM jsm WHERE isassociate = 0 AND jsmtypeid = 0 ORDER BY name";
		return this.getJobSpecificModules(strSQL);
	}
	public ArrayList<JobSpecificModule> getStudySpecificJSMs(String userId)
			throws Exception {
		String strSQL = "SELECT DISTINCT id,name FROM jsm WHERE isassociate = 0 AND jsmtypeid = 1 AND userid="
				+ userId + " ORDER BY name";
		ArrayList<JobSpecificModule> retValue = new ArrayList<JobSpecificModule>();
		retValue = this.getJobSpecificModules(strSQL);		
		strSQL = "SELECT DISTINCT jsmid AS id FROM userjsms INNER JOIN jsm ON userjsms.jsmid = jsm.id WHERE (userjsms.userid = "+userId+") AND (jsm.isassociate = 0)";
		retValue.addAll(this.getJobSpecificModules(strSQL));
		return retValue;
	}
	public ArrayList<JobSpecificModule> getSearchedJSMs(String strSearch)
			throws Exception {
		return getSearchedJSMs(strSearch, "All", null, false);
	}
	public ArrayList<JobSpecificModule> getSearchedJSMs(String strSearch,
			boolean searchCount) throws Exception {
		return getSearchedJSMs(strSearch, "All", null, searchCount);
	}
	public ArrayList<JobSpecificModule> getSearchedJSMs(String strSearch,
			String JSMType, User u, boolean searchCount) throws Exception {
		ArrayList<JobSpecificModule> matchedJSMs = new ArrayList<JobSpecificModule>();
		ArrayList<JobSpecificModule> typedJSMs = new ArrayList<JobSpecificModule>();

		if (JSMType.equalsIgnoreCase("All")) {
			typedJSMs = getAllJSMs();
		} else if (JSMType.equalsIgnoreCase("TAJSMs")) {
			typedJSMs = getTemplateAJSMs();
		} else if (JSMType.equalsIgnoreCase("AJSMs")) {
			typedJSMs = getStudySpecificAJSMs(u.getId());
		} else if (JSMType.equalsIgnoreCase("TJSMs")) {
			typedJSMs = getTemplateJSMs();
		} else if (JSMType.equalsIgnoreCase("JSMs")) {
			typedJSMs = getStudySpecificJSMs(u.getId());
		}
		for (JobSpecificModule jsm : typedJSMs) {
			int qMatched = jsm.getSearchedQuestions(strSearch);
			int iPossibleAnswerCount = jsm
					.getSearchedPossibleAnswersCount(strSearch);
			if (qMatched > 0 || iPossibleAnswerCount > 0) {
				jsm.setSearchCount(qMatched + iPossibleAnswerCount);

				matchedJSMs.add(jsm);
			}
		}
		return matchedJSMs;
	}
	public boolean containsSearch(String strSearch) throws Exception {
		int qMatched = this.getSearchedQuestions(strSearch);
		int iPossibleAnswerCount = this.getSearchedPossibleAnswersCount(strSearch);
		this.setSearchCount(qMatched + iPossibleAnswerCount);
		return ((qMatched > 0) || (iPossibleAnswerCount > 0));
	}
	private ArrayList<JobSpecificModule> getAllJSMs() throws Exception {
		ArrayList<JobSpecificModule> jsms = this
				.getTemplateJSMs();
		jsms.addAll(this.getTemplateAJSMs());
		return jsms;
	}
	public int getSearchedQuestions(String search) throws Exception {
		String qName = "";

		int retVal = 0;
		String strSQL = "SELECT q.name, jsmQ.description" + " FROM jsmquestionstructure jsmQ "
				+ "		INNER JOIN question q" + "			ON jsmQ.questionid = q.id"
				+ " WHERE jsmQ.jsmid = " + this.getId()
				+ " AND (jsmQ.description LIKE '%" + search + "%' OR q.name LIKE '%" + search + "%')";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					qName = rs.getString("description") + rs.getString("name");
					while (qName.toLowerCase().contains(search.toLowerCase())) {
						qName = qName.toLowerCase().replaceFirst(
								search.toLowerCase(), "");
						retVal++;
					}
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		return retVal;
	}
	public ArrayList<Question> getAgentSearchedQuestions(String strSearch,
			String jsmid) throws Exception {
		Integer questionid = 0;
		ArrayList<Question> retValue = new ArrayList<Question>();
		String strSQL = "SELECT DISTINCT jsmQ.questionid "
				+ " FROM jsmquestionstructure jsmQ "
				+ " INNER JOIN jsmquestionstructureagent jsmQAg "
				+ " ON jsmQ.id = jsmQAg.jsmquestionstructureid "
				+ " INNER JOIN agent ag " + " ON jsmQAg.agentid = ag.id "
				+ " WHERE jsmQ.jsmid = " + jsmid + " AND ag.name LIKE '%"
				+ strSearch + "%'";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					questionid = rs.getInt("questionid");
					retValue.add(new Question(questionid.toString()));
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		return retValue;
	}
	private int getSearchedPossibleAnswersCount(String strSearch)
			throws Exception {
		int iRetValue = 0;
		String paName = "";

		String SQL = " SELECT DISTINCT qa.possibleanswerid, " + " a.name "
				+ " FROM jsmquestionstructure q "
				+ " 		INNER JOIN jsmquestionpossibleanswerstructure qa "
				+ " 			ON q.id = qa.jsmquestionstructureid "
				+ " 		INNER JOIN possibleanswer a "
				+ " 			ON qa.possibleanswerid = a.id " + " WHERE q.jsmid = "
				+ this.getId() + " AND a.name LIKE '%" + strSearch + "%'";

		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(SQL);
			if (rs != null) {
				while (rs.next()) {
					paName += rs.getString("name");
					// iRetValue = rs.getInt("");
				}
				while (paName.toLowerCase().contains(strSearch.toLowerCase())) {
					iRetValue++;
					paName = paName.toLowerCase().replaceFirst(
							strSearch.toLowerCase(), "");
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		return iRetValue;
	}
	public int getQuestionCount() throws Exception {
		String strSQL = "SELECT Count(jsmquestionstructure.id) AS theCount" +
				" FROM jsmquestionstructure" +
				" LEFT JOIN jsmquestionstructure AS jsmquestionstructure_1 ON jsmquestionstructure.ajsmid = jsmquestionstructure_1.jsmid" +
				" WHERE jsmquestionstructure.jsmid= "
			+ this.getId() + "";

		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					questionCount = rs.getInt("theCount");
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		return questionCount;
	}
	public void setQuestionCount(int count) {
		this.questionCount = count;
	}
	public int getPossibleAnswerCount() {
		return possibleAnswerCount;
	}
	public void setPossibleAnswerCount(int possibleAnswerCount) {
		this.possibleAnswerCount = possibleAnswerCount;
	}
	public FrozenJobSpecificModule getFrozenJSM(String studyId)
			throws Exception {
		FrozenJobSpecificModule fjsm = null;
		String strSQL = "SELECT id FROM frozenjsm WHERE originaljsmid = "
				+ this.getId() + " AND studyid = " + studyId +" ORDER BY id DESC";

		ResultSet rs = null;
		String id = "";
		try {
			rs = this.sqlExecuteSelect(strSQL);
			while (rs.next()) {
				id = rs.getString("id");				
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}		
			rs.close();
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		if(!(id.equalsIgnoreCase(""))){
			fjsm = new FrozenJobSpecificModule(id);
		}
		return fjsm;
	}
	public ArrayList<FrozenJobSpecificModule> getFrozenJSMs(String studyId)
			throws Exception {
		ArrayList<FrozenJobSpecificModule> fjsms = new ArrayList<FrozenJobSpecificModule>();
		String strSQL = "SELECT id FROM frozenjsm WHERE originaljsmid = "
				+ this.getId() + " AND studyid = " + studyId;

		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule();
					fjsm.setId(rs.getString("id"));
					fjsms.add(fjsm);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		for(FrozenJobSpecificModule fjsm: fjsms){
			fjsm.getPersistentObject();
		}
		return fjsms;
	}
	public FrozenJobSpecificModule freeze(Study study) throws Exception {		
		this.getFullQuestions();
		String originalJsmId = this.getId();
		FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(originalJsmId);
		fjsm.setStudyId(study.getId());
		fjsm.setOriginalJsmId(originalJsmId);
		fjsm.setName(this.getName());
		fjsm.save();
		Integer displayOrder = new Integer(1);		
		Integer indentLevel = new Integer(1);		
		for (Question q : this.getMjsmsQuestions(study.getAgentIDs())) {
			
			displayOrder = q.createFrozenJSMQuestionsAndAnswers(fjsm.getId(), study.hasOption(Study.Option.GLOBALDONTKNOW),displayOrder,indentLevel);			
			
			//ArrayList<Agent> agents = q.getAgents();
			//q.linkToFrozenJSM(fjsm.getId(), study.hasOption(Study.Option.GLOBALDONTKNOW));
			//for (Agent agent : agents) {
			//	q.addFrozenAgent(agent);
			//}
		}		
		return this.getFrozenJSM(study.getId());
	}
	public int compareTo(JobSpecificModule o) {
		return this.getName().compareTo(o.getName());
	}
	public ArrayList<PossibleAnswer> getPossibleAnswers() throws Exception {
		if (this.possibleAnswers == null) {
			this.possibleAnswers = this.getPossibleAnswersList();
		}
		return possibleAnswers;
	}
//	private void getPersistentPossibleAnswers() throws Exception {
//		ResultSet rs = null;
//		ArrayList<PossibleAnswer> pas = new ArrayList<PossibleAnswer>();
//		String strSQL = "SELECT DISTINCT jsmquestionpossibleanswerstructure.possibleanswerid"
//				+ " FROM jsmquestionstructure INNER JOIN"
//				+ " jsmquestionpossibleanswerstructure ON jsmquestionstructure.id = jsmquestionpossibleanswerstructure.jsmquestionstructureid"
//				+ " WHERE (jsmquestionstructure.jsmid = " + this.getId() + ")";
//		rs = this.sqlExecuteSelect(strSQL);
//		if (rs != null) {
//			while (rs.next()) {
//				String id = rs.getString("possibleanswerid");
//				PossibleAnswer pa = new PossibleAnswer();
//				pa.setId(id);
//				pas.add(pa);
//			}
//			if (rs.getStatement() != null) {
//				rs.getStatement().close();
//			}
//			rs.close();
//		}
//		this.closeConnection();
//		for(PossibleAnswer pa:pas){
//			pa.getPersistentObject();
//		}
//		this.setPossibleAnswers(pas);
//	}
	public void setPossibleAnswers(ArrayList<PossibleAnswer> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}
	/*
	public int getMjsmsQuestionsCount(String strChemID) throws Exception {
		int iRetValue = 0;
		String strSQL = "SELECT COUNT(jsmquestionstructure.id) AS questionCount FROM jsmquestionstructureagent "
				+ " INNER JOIN jsmquestionstructure ON jsmquestionstructureagent.jsmquestionstructureid = jsmquestionstructure.id "
				+ " INNER JOIN jsm ON jsmquestionstructure.jsmid = jsm.id "
				+ " WHERE (jsm.id = "
				+ this.getId()
				+ ") "
				+ " AND (jsmquestionstructureagent.agentid = ("
				+ strChemID
				+ ")) "
				+ " AND (jsmquestionstructure.parentid = "
				+ Question.ROOTPARENTID + ")";

		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					iRetValue = rs.getInt("questionCount");
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		return iRetValue;
	}*/
	public ArrayList<Question> getMjsmsQuestionsList(String agentId) throws Exception {
		ArrayList<Question> questions = new ArrayList<Question>();				
		for (Question q : this.getQuestions(agentId)) {
			if (!(q.isAssociateJSM())) {
				q.filterChildQuestionsList(agentId);
				questions.addAll(this.listChildQuestions(q));
			}
		}
		return questions;
	}
	private ArrayList<Question> listChildQuestions(Question rootQ)
			throws Exception {
		ArrayList<Question> questions = new ArrayList<Question>();
		questions.add(rootQ);
		for (Question q : rootQ.getChildQuestions()) {
			questions.addAll(this.listChildQuestions(q));
		}
		return questions;
	}
	public boolean isAssociatedJSM(String aJSMId) {
		return (this.id.equals(aJSMId));
	}
	public JobSpecificModule copy(String userId,Study study) throws Exception {
		JobSpecificModule jsm = new JobSpecificModule();
		jsm.setName(this.getName()+" Copy");
		int i = 1;
		while (jsm.exists()) {
			jsm.setId("");
			jsm.setName(this.getName()+" Copy[" + i + "]");
			if (i == 30) {
				throw new Exception("Copy JSM Failed: Max copy exceeded");
			}
			i++;
		}
		if(study==null){
			jsm.setJsmTypeId(JobSpecificModule.TEMPLATE);
		}else{
			jsm.setJsmTypeId(JobSpecificModule.STUDY);
		}		
		jsm.setDescription(this.getDescription());
		jsm.setAssociateModule(this.isAssociateModule());
		jsm.setReadOnly(this.isReadOnly());
		jsm.setParentJSMId(this.getId());
		jsm.setUserId(userId);
		jsm.save();

		ArrayList<Question> qs = new ArrayList<Question>();
		if(study==null){
			qs = this.getQuestions();
		}else{
			qs = this.getMjsmsQuestions(study.getAgentIDs());
		}
		for (Question q : qs) {
			Question qTemp = new Question();
			qTemp.setName("New Question");
			qTemp.setDescription("New Question");
			qTemp.insert();
			qTemp.linkToJSM(jsm.getId());
			qTemp.setOldQuestionID(q.getJsmQuestionStructureID());
			qTemp.updateOldQuestionId();
			PossibleAnswer pa = new PossibleAnswer();
			pa.setName("New Possible Answer");
			pa.setDescription("New Possible Answer");
			if(!(pa.exists())){
				pa.insert();
			}
			pa.linkToQuestion(qTemp.getId(), qTemp.getJsmQuestionStructureID());
			String jsmlqpaID = pa.getJsmQuestionPossibleAnswerStructureID();
			String lqid = q.getJsmQuestionStructureID();
			Question newQ = new Question("", lqid);
			newQ.getFullPossibleAnswers();
			newQ.copyTo(jsmlqpaID,study);			
			newQ.moveUp();
			qTemp = new Question("", qTemp.getJsmQuestionStructureID());
			qTemp.unLink();
			
			newQ.setAgents(null);
		}
		return jsm;
	}
	public JobSpecificModule copy() throws Exception {
		return this.copy(null,null);
	}
	/**Gets a list of AJSMs that is used by this JSM
	 * @return - an array of JSMs
	 * @throws Exception
	 */
	public ArrayList<JobSpecificModule> getJSMAssociatedAJSMs() throws Exception {
		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();
		ResultSet rs = null;
		if(!this.isAssociateModule()){		
			try {
				String sql = "SELECT jsmquestionstructure.ajsmid FROM jsmquestionstructure " +
				" WHERE jsmquestionstructure.jsmid = " + this.getId() +
				" AND jsmquestionstructure.ajsmid IS NOT NULL";
				rs = this.sqlExecuteSelect(sql);	
				while (rs.next()) {
					JobSpecificModule jsm = new JobSpecificModule();
					jsm.setId(rs.getString("ajsmid"));
					jsms.add(jsm);
				}	
			}catch (Exception e){
				this.setErrorMessage(e.getMessage());
			} finally {
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();	
				this.closeConnection();
			}
		}
		for(JobSpecificModule jsm:jsms){
			jsm.getPersistentObject();
		}
		return jsms;
	}	
	/**Gets a list of JSMs associated with an AJSM
	 * @return - an array of JSMs
	 * @throws Exception
	 */
//	public ArrayList<JobSpecificModule> getAJSMAssociatedJSMs() throws Exception {
//		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();
//		ResultSet rs = null;
//		if(this.isAssociateModule()){		
//			try {
//					String sql = "SELECT jsm.id, jsmquestionstructure.name" +" FROM jsm " +
//					"INNER JOIN jsmquestionstructure " +
//					"ON jsm.id = jsmid " +
//					"WHERE jsmquestionstructure.name = 'JSM: " + this.getName() + "'";
//					rs = this.sqlExecuteSelect(sql);	
//					while (rs.next()) {
//						JobSpecificModule jsm = new JobSpecificModule(rs.getString("id"));
//						jsms.add(jsm);
//					}	
//			}catch (Exception e){
//				this.setErrorMessage(e.getMessage());
//			} finally {
//				if (rs.getStatement() != null) {
//					rs.getStatement().close();
//				}
//				rs.close();	
//			}
//		}
//		return jsms;
//	}
	public boolean isNameValid(String strName) throws Exception {
		boolean retValue = true;
		if (!(this.getName().equalsIgnoreCase(strName))) {
			String sql = "SELECT id FROM jsm WHERE name = '"
					+ this.escapeSpecialCharacters(strName) + "'";
			if (this.getJobSpecificModules(sql).size() > 0) {
				this.setErrorMessage("A Module with the name " + strName
						+ " already exists. Please choose a different name.");
				retValue = false;
			}
		}
		return retValue;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getParentJSMId() {
		return parentJSMId;
	}
	public void setParentJSMId(String parentId) {
		this.parentJSMId = parentId;
	}
	public Question getQuestion(String id,Connection conn) throws Exception {	
		Question question = new Question();
		try{
			ResultSet rs = null;
			String strSQL = "SELECT id, questionid, name" + " FROM jsmquestionstructure"
			+ " WHERE (jsmid = " + this.getId() + ") AND (questionid = "
			+ id + ")";
			rs = this.sqlExecuteSelect(strSQL,conn);
			if (rs != null) {
				while (rs.next()) {
					String qid = rs.getString("questionid");
					String linkedqid = rs.getString("id");
					question.setId(qid);
					question.setJsmStructureQuestionID(linkedqid);
					question.setName(rs.getString("name"));
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}		
		return question;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public ArrayList<Question> getDuplicateQuestions() throws Exception {
		ArrayList<Question> questions = new ArrayList<Question>();
		try{
			String strSQL = "SELECT     jsmquestionstructure.questionid, question.name ";
			strSQL += " FROM         question INNER JOIN";
			strSQL += " jsmquestionstructure ON question.id = jsmquestionstructure.questionid";
			strSQL += " WHERE     (question.questiontypeid = 1) AND (jsmquestionstructure.jsmid = "
					+ this.getId() + ")";
			strSQL += " GROUP BY jsmquestionstructure.name, jsmquestionstructure.questionid";
			strSQL += " HAVING      (COUNT(jsmquestionstructure.id) > 1)";
			strSQL += " ORDER BY jsmquestionstructure.name";
			ResultSet rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String name = rs.getString("name");
					Question question = new Question();
					question.setName(name);
					questions.add(question);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}				
		return questions;
	}
	public void setSearchCount(int count) {
		this.searchCount = count;
	}
	public int getSearchCount() throws Exception {
		return searchCount;
	}
	public ArrayList<User> getSharedUsers() throws Exception {
		if (this.users == null) {
			this.getPersistentUsers();
		}
		return users;
	}
	private void getPersistentUsers() throws Exception {
		ResultSet rs = null;
		try {
			this.users = new ArrayList<User>();
			String strSQL = "SELECT users.id, users.username, userjsms.jsmid" +
					" FROM users INNER JOIN userjsms ON users.id = userjsms.userid" +
					" WHERE (userjsms.jsmid = "+this.getId()+")";
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					User user = new User();
					user.setId(id);
					user.setName(rs.getString("username"));
					this.users.add(user);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void shareWithUser(String userId) throws Exception {
		String strSQL = "INSERT INTO userjsms (userid,jsmid) VALUES(" + userId + "," + this.getId() + ")";
        this.sqlExecuteInsert(strSQL);                        
	}
	public void removeSharedUsers() throws Exception {
		String strSQL = "DELETE FROM userjsms WHERE jsmid = " + this.getId() + "";
		this.sqlExecuteInsert(strSQL);     
	}
	public String getJsmAssociates() {
		return jsmAssociates;
	}
	public void setJsmAssociates(String jsmAssociates) {
		this.jsmAssociates = jsmAssociates;
	}
	public ArrayList<PossibleAnswer> getPossibleAnswersList() throws Exception {
		ResultSet rs = null;
		ArrayList<PossibleAnswer> pas = new ArrayList<PossibleAnswer>();
		String strSQL = "SELECT jsmquestionpossibleanswerstructure.possibleanswerid, jsmquestionpossibleanswerstructure.id, " +
				" jsmquestionstructure.jsmid, possibleanswer.name " +
				" FROM (jsmquestionpossibleanswerstructure " +
				" INNER JOIN jsmquestionstructure ON jsmquestionpossibleanswerstructure.jsmquestionstructureid = jsmquestionstructure.id) " +
				" INNER JOIN possibleanswer ON jsmquestionpossibleanswerstructure.possibleanswerid = possibleanswer.id " +
				" WHERE (((jsmquestionstructure.jsmid)="+this.getId()+"))";
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String id = rs.getString("possibleanswerid");
				String paid = rs.getString("id");
				String name = rs.getString("name");
				PossibleAnswer pa = new PossibleAnswer();
				pa.setId(id);
				pa.setJsmQuestionPossibleAnswerStructureID(paid);
				pa.setName(name);
				pas.add(pa);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return pas;
	}
	public void setShowHideQuestionsAnswers(ArrayList minimisedQuestionIds) throws Exception {
		ArrayList<Question> qs = this.getQuestions();
		//begin minimise questions/answers iteration
		setQuestionsToMinimised(minimisedQuestionIds, qs);
	}
	private void setQuestionsToMinimised(ArrayList minimisedQuestionIds, ArrayList<Question> qs) throws Exception {
		ArrayList<PossibleAnswer> possAns = new ArrayList<PossibleAnswer>();

		for (Question q : qs) {
			//get a list of attached answers for each question and store in array
			possAns = getQuestionAnswers(possAns, q);
			//go through list of questions and if any are in the list of minimised questions
			//set these to minimised
			if (minimisedQuestionIds.contains(q.getJsmQuestionStructureID())) {
				q.setMinimised(true);
			}	
		}
		if (possAns.size() != 0) {
			//if there are attached answers then continue iteration
			setAnswersToMinimised(minimisedQuestionIds, possAns);
		}
	}
	private void setAnswersToMinimised(ArrayList minimisedQuestionIds, ArrayList<PossibleAnswer> possAns) throws Exception {
		ArrayList<Question> qs = new ArrayList<Question>();

		for (PossibleAnswer pA : possAns) {
			//get a list of attached questions for each answer and store in array
			qs = getAnswerQuestions(qs, pA);
			//go through list of answers and if any are in the list of minimised answers
			//set these to minimised
			if (minimisedQuestionIds.contains(pA.getJsmQuestionPossibleAnswerStructureID())) {
				pA.setShowChildQuestions(false);
				}	
		}
		if (qs.size() != 0) {
			//if there are attached questions then continue iteration
			setQuestionsToMinimised(minimisedQuestionIds, qs);	
		}
	}		
	private ArrayList<PossibleAnswer> getQuestionAnswers(ArrayList<PossibleAnswer> possAnswers, Question q) throws Exception {
		ArrayList<PossibleAnswer> pAs = new ArrayList<PossibleAnswer>();
		// if the question has answers
		if (q.getPossibleAnswers().size()!= 0) {
			// put them in array				
			pAs = q.getPossibleAnswers();
			//and add these to the array of answers for this level
			for (PossibleAnswer a :pAs) {
				possAnswers.add(a);
			}
		}
		return possAnswers;
	}	
	private ArrayList<Question> getAnswerQuestions(ArrayList<Question> Questions, PossibleAnswer pA) throws Exception {
		ArrayList<Question> qs = new ArrayList<Question>();
		// if the answer has attached questions
		if (pA.getChildQuestions().size() != 0) {
			//put them in an array
			qs = pA.getChildQuestions();
			//and add these to the array of questions for this level
			for (Question q :qs) {
				Questions.add(q);
			}
		}
		return Questions;
	}
	public boolean isEvaluationModule() {
		if(this.getJsmTypeId() == JobSpecificModule.EVALUATION){
			return true;
		}else{
			return false;
		}
	}
	public boolean isEnvironmentalAsbestosModule() {
		if(this.getName().equalsIgnoreCase("EnviroAsbestos_AMR_AMRLive")){
			return true;
		}else{
			return false;
		}
	}
	public void importAssociateJSM(JobSpecificModule ajsm) throws Exception {
		for(Question q:ajsm.getQuestions()){
			this.importQuestion(q.getJsmQuestionStructureID());
		}
		for(Agent agent: ajsm.getAgents()){
			ajsm.copyRulesToJSM(agent,this);
			
		}
	}
	public void importQuestion(String lqid) throws Exception {
		Question qTemp = new Question();
		qTemp.setName("New Question");
		qTemp.setDescription("New Question");
		if(!(qTemp.exists())){
			qTemp.insert();			
		}
		qTemp.linkToJSM(this.getId());
		PossibleAnswer pa = new PossibleAnswer();
		pa.setName("New Possible Answer");
		pa.setDescription("New Possible Answer");
		if(!(pa.exists())){
			pa.insert();
		}	
		
		pa.linkToQuestion(qTemp.getId(), qTemp.getJsmQuestionStructureID());
		String jsmlqpaID = pa.getJsmQuestionPossibleAnswerStructureID();			
		Question q = new Question("", lqid);
		q.getFullPossibleAnswers();
		q.copyTo(jsmlqpaID);
				
		q.moveUp();		
		qTemp = new Question("", qTemp.getJsmQuestionStructureID());
		qTemp.unLink();
		
		
		
	}
	public void importToPossibleAnswer(PossibleAnswer pa) throws Exception {
		for(Question q:this.getQuestions()){
			q.getFullPossibleAnswers();
			q.copyTo(pa.getJsmQuestionPossibleAnswerStructureID());
		}
		//get parent question for jsmid and to set agents
		Question pq = new Question("",pa.getJsmQuestionStructureID());
		String newjsmId = pq.getJsmID();
		JobSpecificModule jsm = new JobSpecificModule(newjsmId);
		for(Agent agent: this.getAgents()){
			pq.addAgent(agent);
			
			this.copyRulesToJSM(agent,jsm);
			
		}	
	}
	public void copyRulesToJSM(Agent agent, JobSpecificModule jsm) throws Exception {
		for(ExpertRule rule: this.getRules(agent)){
			if(!(rule.isValid(this))){
				continue;
			}
			if(rule.getTypeId().equalsIgnoreCase(ExpertRule.TYPEPROBABILITY)){
    			String ruleId = rule.copy();
    			ExpertRule er = new ExpertRule(ruleId);
    			er.setJsmId(jsm.getId());
    			er.save();
    			if(!(rule.getFrequencyHoursRule().getId().equalsIgnoreCase(""))){       				
    				ExpertRule erFreqHours = rule.getFrequencyHoursRule();
    				Question qOld = new Question("",erFreqHours.getFrequencyHoursQId());
    				if(!(qOld.getId().equalsIgnoreCase(""))){  //check if freq q hasn't been removed
    					Question pQ = new Question("",qOld.getParentQuestionID());
        				PossibleAnswer pa1 = new PossibleAnswer("",pQ.getParentID());
        				Question ppQ = new Question("",pQ.getParentQuestionID()); 
        				  
        				Question qNew = jsm.getQuestion(ppQ.getId(),null); 
        				if(qNew.getName().equalsIgnoreCase(ppQ.getName())){
        					Question qFreqHours = qNew.getChildQuestionFrequencyHours(pa1.getId(),null);				
        				
        					String cid = erFreqHours.copy();
                			ExpertRule cer = new ExpertRule(cid);
                		 	cer.setParentId(er.getId());
                			cer.setJsmId(jsm.getId());
                			cer.setFrequencyHoursQId(qFreqHours.getJsmQuestionStructureID());
                			cer.save();
        				}	
    				}
    					
    			}  
    			if(!(rule.getFrequencyWeeksRule().getId().equalsIgnoreCase(""))){
					ExpertRule erFreqWeeks = rule.getFrequencyWeeksRule();
					Question qOld = new Question("",erFreqWeeks.getFrequencyWeeksQId());
					if(!(qOld.getId().equalsIgnoreCase(""))){ //check if freq q hasn't been removed
						PossibleAnswer pa1 = new PossibleAnswer("",qOld.getParentID());
						Question pQ = new Question("",qOld.getParentQuestionID());							

						Question qNew = jsm.getQuestion(pQ.getId(),null);
						if(qNew.getName().equalsIgnoreCase(pQ.getName())){							
							Question qFreqWeeks = qNew.getChildQuestionFrequencyWeeks(pa1.getId(),null);	
							
							String cid = erFreqWeeks.copy();
	            			ExpertRule cer = new ExpertRule(cid);
	            		 	cer.setParentId(er.getId());
	            			cer.setJsmId(jsm.getId());
	            			cer.setFrequencyWeeksQId(qFreqWeeks.getJsmQuestionStructureID());
	            			cer.save();
						}
					}
				}
    		}				
		}
	}
	public void updateTimeStamp() throws Exception {
		this.updateTimeStamp(null);    
	}
	public void updateTimeStamp(Connection conn) throws Exception {
		String strSQL = "UPDATE jsm SET dateupdated=GETDATE() WHERE id = " + this.getId();       
        this.sqlExecuteUpdate(strSQL,conn);    
	}
	public String getDateUpdated() {
		if(dateUpdated==null){
			dateUpdated = "";
		}
		return dateUpdated;
	}
	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
//	public ArrayList<String> getJSMQAndAList() throws Exception{
//		ArrayList<String> allQAs = new ArrayList<String>();
//		
//		ArrayList<Question> qs= this.getQuestions();
//		ArrayList<PossibleAnswer> pas = this.getPossibleAnswers();
//		for (Question q : qs) {
//			allQAs.add(q.getId());
//		}
//		for (PossibleAnswer pa : pas) {
//			allQAs.add(pa.getId());
//		}		
//		return allQAs;
//	}
	public ArrayList<String> getJsmQuestionsAnswersIDList() throws Exception {		
		ArrayList<Question> qs = this.getQuestions();
		ArrayList<String> qandAIDs = new ArrayList<String>();
		//begin questions/answers iteration
		return getJsmQuestionsIDList(qandAIDs, qs);
	}
	private ArrayList<String> getJsmQuestionsIDList(ArrayList<String> questionAnswerIDs, ArrayList<Question> qs) throws Exception {
		ArrayList<PossibleAnswer> possAns = new ArrayList<PossibleAnswer>();

		for (Question q : qs) {
			//get a list of attached answers for each question and store in array
			possAns = getQuestionAnswers(possAns, q);
			//go through list of questions and add the id to the list
			questionAnswerIDs.add(q.getJsmQuestionStructureID());
		}
		if (possAns.size() != 0) {
			//if there are attached answers then continue iteration
			questionAnswerIDs = (getJsmAnswersIDList(questionAnswerIDs, possAns));
		}
		return questionAnswerIDs;
	}
	private ArrayList<String> getJsmAnswersIDList(ArrayList<String> questionAnswerIDs, ArrayList<PossibleAnswer> possAns) throws Exception {
		ArrayList<Question> qs = new ArrayList<Question>();

		for (PossibleAnswer pA : possAns) {
			//get a list of attached questions for each answer and store in array
			qs = getAnswerQuestions(qs, pA);
			//go through list of answers and add the ids to the list
			questionAnswerIDs.add(pA.getJsmQuestionPossibleAnswerStructureID());
		}
		if (qs.size() != 0) {
			//if there are attached questions then continue iteration
			questionAnswerIDs = (getJsmQuestionsIDList(questionAnswerIDs, qs));	
		}
		return questionAnswerIDs;
	}
	public boolean isReadOnly() {
		return readOnly;
	}
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	
	public void getPersistentRules() throws Exception {
		ResultSet rs = null;		
		rs = this.sqlExecuteSelect("SELECT * from rule WHERE jsmid = " + this.getId());
		try {
		this.rules = new ArrayList<ExpertRule>();
		if (rs != null) {
			while (rs.next()) {
				ExpertRule er = new ExpertRule();
				er.setId(rs.getString("id"));
				er.setTypeId(rs.getString("ruletypeid"));
				er.setLevelTypeId(rs.getString("ruleleveltypeid"));
				er.setWeight(rs.getInt("weight"));
				er.setAgentId(rs.getString("agentid"));
				er.setFrequencyWeeksQId(rs.getString("frequencyweeksquestionid"));
				er.setFrequencyHoursQId(rs.getString("frequencyhoursquestionid"));
				er.setParentId(rs.getString("parentruleid"));
				er.setSequence(rs.getInt("sequence"));
				er.setJsmId(rs.getString("jsmid"));
				this.rules.add(er);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	
	public ArrayList<ExpertRule> getRules(Agent agent) throws Exception {
		ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
		String jsmId = "";
		//if(this.getJsmTypeId() == JobSpecificModule.TEMPLATE){
			jsmId = this.getId();
		//}else if(this.getJsmTypeId() == JobSpecificModule.STUDY){
		//	jsmId = this.getParentJSMId();
		//}
		String strSQL = "SELECT id FROM rule WHERE agentid="+agent.getId()+" AND jsmid="+jsmId+" ORDER BY ruleleveltypeid DESC";
		try {
			ResultSet rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					ExpertRule er = new ExpertRule();
					er.setId(id);
					rules.add(er);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		for(ExpertRule er: rules){
			er.getPersistentObject();
		}		
		return rules;
	}
	public boolean hasFrequencyQuestion(String frequencyQId) throws Exception {
		boolean retValue = false;
		ResultSet rs = null;
		try {
			String strSQL = "SELECT id " +
					" FROM jsmquestionstructure" +
					" WHERE (jsmid = "+this.getId()+") AND id="+frequencyQId;
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					retValue = true;
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		return retValue;
	}
	public boolean hasFiredRules() throws Exception {
		boolean retValue = false;
		Study study = new Study(this.getStudyId());
		for(Agent agent: study.getAgents()){
			ExpertAgent es = new ExpertAgent(agent.getId());
			if(es.getCountFiredRules(study,this.getId())!=0){
				retValue = true;
				break;
			}			
		}		
		return retValue;
	}
//	private String getStudyId() throws Exception {
//		String retValue = "0";
//		ResultSet rs = null;
//		try {
//			String strSQL = "SELECT studyid " +
//					" FROM studyjsms " +
//					" WHERE (jsmid = "+this.getId()+")";
//			rs = this.sqlExecuteSelect(strSQL);
//			if (rs != null) {
//				if (rs.next()) {
//					retValue = rs.getString("studyid");
//				}
//				if (rs.getStatement() != null) {
//					rs.getStatement().close();
//				}
//				rs.close();
//			}
//		} catch (SQLException e) {
//			throw new Exception(e.getMessage());
//		} finally {
//			this.closeConnection();
//		}
//		return retValue;
//	}
	public ArrayList<JobSpecificModule> getJSMsThatShareQuestions() throws Exception {
		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();
		ResultSet rs = null;
			
		try {
			String sql = "SELECT DISTINCT jsm.id " +
					" FROM ((jsmquestionstructure INNER JOIN question ON jsmquestionstructure.questionid = question.id) INNER JOIN jsmquestionstructure AS jsmquestionstructure_1 ON question.id = jsmquestionstructure_1.questionid) INNER JOIN jsm ON jsmquestionstructure_1.jsmid = jsm.id " +
					" WHERE (((jsmquestionstructure.jsmid)="+this.getId()+") AND ((question.questiontypeid)=1) AND ((jsm.jsmtypeid)=0));";
			rs = this.sqlExecuteSelect(sql);	
			while (rs.next()) {
				JobSpecificModule jsm = new JobSpecificModule();
				jsm.setId(rs.getString("id"));
				jsms.add(jsm);
			}	
		}catch (Exception e){
			throw new Exception(e.getMessage());
		} finally {
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();	
			this.closeConnection();
		}
		
		for(JobSpecificModule jsm:jsms){
			jsm.getPersistentObject();
		}
		return jsms;
	}
	public ArrayList<ExpertRule> getRules() throws Exception{
		if (this.rules == null) {
			this.getPersistentRules();
		}
		return rules;
	}
	public void setRules(ArrayList<ExpertRule> rules) {
		this.rules = rules;
	}
	public int getJobHistoryCount() throws Exception {
		int jobHistoryCount = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT COUNT(jobhistory.id) AS CountOfid FROM jobhistory" +
		" INNER JOIN (participant INNER JOIN study ON participant.studyid = study.id)" +
		" ON jobhistory.participantid = participant.id" +
		" WHERE (jobhistory.jobhistorystatusid = 7) AND jobhistory.finaljsmid = "+this.getId()+" AND study.id="+this.getStudyId();					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				jobHistoryCount = rs.getInt("CountOfid");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return jobHistoryCount;
	}		
	public String getCountAssessmentReadyAutoAssessed() throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid" +
				" FROM (participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid) INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid" +
				" GROUP BY participant.studyid, agentassessments.assessorusername, jobhistory.finaljsmid" +
				" HAVING (((participant.studyid)="+this.getStudyId()+") AND ((agentassessments.assessorusername)=\"OccIDEAS\") AND ((jobhistory.finaljsmid)="+this.getId()+"));";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				retValue = rs.getString("CountOfid");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	public String getCountAssessmentManualDone() throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid" +
		" FROM (participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid) INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid" +
		" GROUP BY participant.studyid, agentassessments.assessorusername, jobhistory.finaljsmid" +
		" HAVING (((participant.studyid)="+this.getStudyId()+") AND ((agentassessments.assessorusername)<>\"OccIDEAS\") AND ((jobhistory.finaljsmid)="+this.getId()+"));";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				retValue = rs.getString("CountOfid");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	public String getCountAssessmentReadyAutoAssessed(Agent agent) throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid" +
				" FROM (participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid) INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid" +
				" GROUP BY participant.studyid, agentassessments.assessorusername, jobhistory.finaljsmid,agentassessments.agentid" +
				" HAVING (((participant.studyid)="+this.getStudyId()+") AND ((agentassessments.assessorusername)=\"OccIDEAS\") AND ((agentassessments.agentid)="+agent.getId()+") AND ((jobhistory.finaljsmid)="+this.getId()+"));";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				retValue = rs.getString("CountOfid");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	public String getCountAssessmentManualDone(Agent agent) throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid" +
		" FROM (participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid) INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid" +
		" GROUP BY participant.studyid, agentassessments.assessorusername, jobhistory.finaljsmid,agentassessments.agentid" +
		" HAVING (((participant.studyid)="+this.getStudyId()+") AND ((agentassessments.assessorusername)<>\"OccIDEAS\") AND ((agentassessments.agentid)="+agent.getId()+") AND ((jobhistory.finaljsmid)="+this.getId()+"));";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				retValue = rs.getString("CountOfid");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
	public String getStudyId() {
		return studyId;
	}
	public ArrayList<Question> getRootQuestions() throws Exception{
		ResultSet rs = null;
		ArrayList<Question> rootQuestions = new ArrayList<Question>();
		String strSQL = "SELECT *"
				+ " FROM jsmquestionstructure "
				+ " WHERE jsmid = "
				+ this.getId()
				+ " AND parentid = 100 ";
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String qid = rs.getString("questionid");
				String linkedqid = rs.getString("id");
				Question question = new Question();
				question.setId(qid);
				question.setJsmStructureQuestionID(linkedqid);
				question.setSequence(rs.getString("sequence"));
				rootQuestions.add(question);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(Question q: rootQuestions){
			q.getPersistentStructureObject();
		}
		return rootQuestions;
	}
}