 /**
 * Version:
 *     $Id: MasterQuestionList.java,v 1.230 2009/05/01 02:23:55 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: MasterQuestionList.java,v $
 *     Revision 1.230  2009/05/01 02:23:55  troy.sadkowsky
 *     updates for more error handles on export and import
 *
 *     Revision 1.229  2009/02/23 06:00:37  troy.sadkowsky
 *     update reports
 *
 *     Revision 1.228  2009/02/22 23:12:04  Troy.Sadkowsky
 *     new demo message
 *
 *     Revision 1.227  2009/02/19 04:24:08  troy.sadkowsky
 *     import from xml
 *
 *     Revision 1.226  2009/02/15 06:04:20  ray.welburn
 *     Add export XML
 *
 *     Revision 1.225  2009/02/04 22:45:48  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.224  2009/01/06 07:40:51  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.223  2009/01/06 01:17:35  troy.sadkowsky
 *     report to excel functions
 *
 *     Revision 1.222  2009/01/05 09:05:19  troy.sadkowsky
 *     new rule display functionality
 *
 *     Revision 1.221  2009/01/05 06:54:24  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.220  2008/12/23 10:32:24  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.219  2008/12/22 04:06:21  troy.sadkowsky
 *     various updates
 *
 *     Revision 1.218  2008/12/20 02:07:08  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.217  2008/12/14 22:39:01  troy.sadkowsky
 *     show keyphrase function
 *
 *     Revision 1.216  2008/12/10 11:36:51  ray.welburn
 *     Updates to view rule
 *
 *     Revision 1.215  2008/12/08 10:06:16  Randal.Anderson
 *     Added tooltip for the questionnaire possible questions attached
 *
 *     Revision 1.214  2008/12/07 05:18:46  ray.welburn
 *     Change to use only one showcombobox method
 *
 *     Revision 1.213  2008/11/25 23:29:44  troy.sadkowsky
 *     minor layout updates
 *
 *     Revision 1.212  2008/11/25 22:58:48  ray.welburn
 *     add edit view to rules
 *
 *     Revision 1.211  2008/11/14 09:14:39  troy.sadkowsky
 *     usability updates
 *
 *     Revision 1.210  2008/11/06 06:27:06  ray.welburn
 *     Set fixed width for combo boxes and add tooltips
 *
 *     Revision 1.209  2008/11/03 03:50:18  ray.welburn
 *     Explanitory text added when rule has no frequency questions
 *
 *     Revision 1.208  2008/10/23 05:36:51  troy.sadkowsky
 *     bug fixes
 *
 *     Revision 1.207  2008/10/22 01:25:19  troy.sadkowsky
 *     updates for excel report
 *
 *     Revision 1.206  2008/10/20 05:26:55  Troy.Sadkowsky
 *     validation updates speed enhancement
 *
 *     Revision 1.205  2008/10/20 00:37:50  troy.sadkowsky
 *     to excel show rules
 *
 *     Revision 1.204  2008/10/17 03:40:08  troy.sadkowsky
 *     bug fixes
 *
 *     Revision 1.203  2008/10/08 01:45:24  troy.sadkowsky
 *     fix frequency rules
 *
 *     Revision 1.202  2008/09/24 12:16:59  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.201  2008/09/20 08:59:29  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.200  2008/09/02 23:30:43  Troy.Sadkowsky
 *     removed old code and enhanced jsm exporter
 *
 *     Revision 1.199  2008/08/25 01:37:24  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.198  2008/08/20 03:36:34  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.197  2008/08/18 07:10:07  troy.sadkowsky
 *     connection close error
 *
 *     Revision 1.196  2008/08/13 04:31:39  troy.sadkowsky
 *     removed abiliyt to update keyphrases on ssjsm
 *
 *     Revision 1.195  2008/08/11 00:46:19  troy.sadkowsky
 *     rule conversion from ajsms
 *
 *     Revision 1.194  2008/08/02 06:16:56  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.193  2008/07/31 01:56:56  ray.welburn
 *     MainDB removed
 *
 *     Revision 1.192  2008/07/23 00:16:07  troy.sadkowsky
 *     new updates
 *
 *     Revision 1.191  2008/07/22 06:55:08  ray.welburn
 *     integration changes for new interface
 *
 *     Revision 1.190  2008/07/18 06:06:02  troy.sadkowsky
 *     new flat frozen jsm
 *
 *     Revision 1.189  2008/06/04 01:08:17  ray.welburn
 *     Style changes to search user and fixes for admin navigation paths
 *
 *     Revision 1.188  2008/06/04 00:51:17  troy.sadkowsky
 *     removed jsmid pa attribute
 *
 *     Revision 1.187  2008/06/01 09:36:58  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.186  2008/05/26 08:23:29  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.185  2008/05/10 07:40:29  troy.sadkowsky
 *     updates for export JSMs
 *
 *     Revision 1.184  2008/04/22 23:21:21  troy.sadkowsky
 *     new assessment requirements
 *
 *     Revision 1.183  2008/04/09 00:59:20  ray.welburn
 *     Make title edit buttons consistant
 *
 *     Revision 1.182  2008/04/04 00:21:44  ray.welburn
 *     LHS Tabs method moved to superclass
 *
 *     Revision 1.181  2008/03/30 23:59:53  ray.welburn
 *     Modified showJSMTabs and remove showJSMTabsAndAgents
 *
 *     Revision 1.180  2008/03/27 23:03:21  ray.welburn
 *     Remove onclick from wiki button
 *
 *     Revision 1.179  2008/03/26 12:36:29  troy.sadkowsky
 *     fix nav bar
 *
 *     Revision 1.178  2008/03/22 04:44:28  ray.welburn
 *     images from database applied to alll images
 *
 *     Revision 1.177  2008/03/18 01:27:57  ray.welburn
 *     wiki.gif added to page
 *
 *     Revision 1.176  2008/03/13 07:26:08  ray.welburn
 *     change help icon to wiki
 *
 *     Revision 1.175  2008/03/13 06:08:46  ray.welburn
 *     Images from database now used
 *
 *     Revision 1.174  2008/03/13 05:33:53  ray.welburn
 *     Unused methods commented out
 *
 *     Revision 1.173  2008/03/12 07:46:50  troy.sadkowsky
 *     minor update of a space
 *
 *     Revision 1.172  2008/03/06 06:26:20  ray.welburn
 *     NavBar was showing URL
 *
 *     Revision 1.171  2008/03/05 07:47:29  troy.sadkowsky
 *     replaced - with _ to be consistent with wiki naming convention
 *
 *     Revision 1.170  2008/03/05 05:05:57  troy.sadkowsky
 *     import aJSMs
 *
 *     Revision 1.169  2008/03/05 02:37:26  troy.sadkowsky
 *     validation of jsm
 *
 *     Revision 1.168  2008/03/01 07:35:27  ray.welburn
 *     Modify how help navigaes to wiki
 *
 *     Revision 1.167  2008/03/01 04:25:21  troy.sadkowsky
 *     no crossed facts
 *
 *     Revision 1.166  2008/02/25 04:21:53  troy.sadkowsky
 *     new export function
 *
 *     Revision 1.165  2008/02/15 08:49:26  troy.sadkowsky
 *     copy jsms function
 *
 *     Revision 1.164  2008/02/15 04:00:28  troy.sadkowsky
 *     removed olf code, added data cleaning functions and ui updates
 *
 *     Revision 1.163  2008/02/14 02:37:52  ray.welburn
 *     Modify help button to go to appropriate page in help wiki
 *
 *     Revision 1.162  2008/02/13 02:37:05  ray.welburn
 *     Remove User manual references
 *
 *     Revision 1.161  2008/02/12 15:03:04  troy.sadkowsky
 *     shared questions and answers
 *
 *     Revision 1.160  2008/01/31 00:09:58  troy.sadkowsky
 *     fixed search highlight
 *
 *     Revision 1.159  2008/01/24 03:59:04  troy.sadkowsky
 *     review interveiw
 *
 *     Revision 1.158  2008/01/21 14:03:03  troy.sadkowsky
 *     clean old code
 *
 *     Revision 1.157  2008/01/15 13:50:20  troy.sadkowsky
 *     connection problem and ajsm links
 *
 *     Revision 1.156  2008/01/15 12:14:50  troy.sadkowsky
 *     speed up rule view
 *
 *     Revision 1.155  2008/01/14 12:57:24  troy.sadkowsky
 *     rules view updates
 *
 *     Revision 1.154  2008/01/13 21:13:29  troy.sadkowsky
 *     show with parent
 *
 *     Revision 1.153  2007/12/17 01:36:04  troy.sadkowsky
 *     frequency rules bug
 *
 *     Revision 1.152  2007/12/11 14:08:10  troy.sadkowsky
 *     new view with parent option at interview
 *
 *     Revision 1.151  2007/12/08 05:45:42  ray.welburn
 *     Change Associated JSMS to list Uses AJSMS list and Used By JSM list
 *
 *     Revision 1.150  2007/12/06 22:34:51  troy.sadkowsky
 *     ability to change frequency rules
 *
 *     Revision 1.149  2007/11/25 22:30:02  troy.sadkowsky
 *     read only rules
 *
 *     Revision 1.148  2007/11/21 02:04:26  ray.welburn
 *     Truncate rule name in navigation and remove groupname from LHS menu
 *
 *     Revision 1.147  2007/11/06 11:26:44  ray.welburn
 *     Bugs in search facility
 *
 *     Revision 1.146  2007/11/02 01:38:13  troy.sadkowsky
 *     searches and showing participant lists
 *
 *     Revision 1.145  2007/10/24 11:51:02  ray.welburn
 *     Group agents in LHS menu
 *
 *     Revision 1.144  2007/10/22 04:05:04  troy.sadkowsky
 *     enhancement for auto setting frequency rules
 *
 *     Revision 1.143  2007/10/15 05:57:18  troy.sadkowsky
 *     sanity check functions
 *
 *     Revision 1.142  2007/10/12 07:48:12  ray.welburn
 *     Display format changes
 *
 *     Revision 1.141  2007/10/10 05:33:15  ray.welburn
 *     LHS menu items truncated with mouseover for full name
 *
 *     Revision 1.140  2007/10/09 07:19:01  troy.sadkowsky
 *     sanity check updates
 *
 *     Revision 1.139  2007/10/05 06:05:35  ray.welburn
 *     Updating rules - now saves changes when adding new conditions
 *
 *     Revision 1.138  2007/10/03 07:11:14  ray.welburn
 *     Images moved to Occideaslib and links used for project access to images
 *
 *     Revision 1.137  2007/09/25 13:44:16  troy.sadkowsky
 *     restructure sys admin pages
 *
 *     Revision 1.136  2007/09/24 22:56:52  troy.sadkowsky
 *     allow for rule not having freq rules
 *
 *     Revision 1.135  2007/09/23 22:55:07  troy.sadkowsky
 *     show rules fired
 *
 *     Revision 1.134  2007/09/20 12:11:53  ray.welburn
 *     Cleaning up rules page
 *
 *     Revision 1.133  2007/09/11 23:04:21  troy.sadkowsky
 *     changes for sharing jsms
 *
 *     Revision 1.132  2007/09/03 00:39:29  troy.sadkowsky
 *     updates for aug 24th meeting
 *
 *     Revision 1.131  2007/08/23 02:26:55  ray.welburn
 *     Apply "loading..." timer onclick  to all hrefs
 *
 *     Revision 1.130  2007/08/19 03:39:30  troy.sadkowsky
 *     style updates
 *
 *     Revision 1.129  2007/08/19 00:29:02  ray.welburn
 *     Update to Validation of AJSM linked JSMs
 *
 *     Revision 1.128  2007/08/17 13:53:38  troy.sadkowsky
 *     style updates
 *
 *     Revision 1.127  2007/08/13 00:24:49  troy.sadkowsky
 *     share jsms
 *
 *     Revision 1.126  2007/08/13 00:19:42  troy.sadkowsky
 *     new jobhistory field requirements and sharing ability
 *
 *     Revision 1.125  2007/08/09 03:08:08  ray.welburn
 *     Now hightlights searchstring in description as well as name
 *
 *     Revision 1.124  2007/08/08 23:53:56  troy.sadkowsky
 *     db and objects for share jsms feature
 *
 *     Revision 1.123  2007/08/07 22:28:47  ray.welburn
 *     Remove update button from centre of edit AJSM page
 *
 *     Revision 1.122  2007/08/06 02:05:38  troy.sadkowsky
 *     removed tobtitle descriptions
 *
 *     Revision 1.121  2007/08/04 03:11:35  troy.sadkowsky
 *     clear text on new possible answer
 *
 *     Revision 1.120  2007/08/03 01:20:32  ray.welburn
 *      import button removed from main body of import screen
 *
 *     Revision 1.119  2007/08/02 09:09:37  troy.sadkowsky
 *     separate rule creation from viewing mjsm
 *
 *     Revision 1.118  2007/08/01 07:01:41  ray.welburn
 *     Update to show AJSMs in LHS menu when clicking on ajsm hyperlink in structure view
 *
 *     Revision 1.117  2007/07/28 01:39:16  ray.welburn
 *     update 28/07/07
 *
 *     Revision 1.116  2007/07/28 01:32:57  troy.sadkowsky
 *     agent description updates and clean mql
 *
 *     Revision 1.115  2007/07/19 05:25:54  troy.sadkowsky
 *     tidy up code removed warnings
 *
 *     Revision 1.114  2007/07/13 05:39:27  Jeff.Keys
 *     case sensitive search count
 *     show search count
 *
 *     Revision 1.113  2007/07/10 22:39:46  troy.sadkowsky
 *     moved or case to keep logic consistant
 *
 *     Revision 1.112  2007/07/04 07:16:17  Jeff.Keys
 *     questionnaire searches on q keywords only
 *     delete possible answers
 *
 *     Revision 1.111  2007/07/04 01:37:28  Jeff.Keys
 *     answer delete warnings
 *
 *     Revision 1.110  2007/07/03 03:30:56  troy.sadkowsky
 *     show duplicate keyphrases
 *
 *     Revision 1.109  2007/07/01 04:43:34  Jeff.Keys
 *     answer delete warnings
 *
 *     Revision 1.108  2007/07/01 02:32:37  Jeff.Keys
 *     jsm comments field
 *
 *     Revision 1.107  2007/06/30 08:11:47  Jeff.Keys
 *     edit jsms
 *
 *     Revision 1.106  2007/06/28 14:40:32  Jeff.Keys
 *     questionnaire searches -structure
 *
 *     Revision 1.105  2007/06/28 11:32:04  Jeff.Keys
 *     loading prompt for search
 *
 *     Revision 1.104  2007/06/28 08:26:30  Jeff.Keys
 *     loading prompt for search
 *
 *     Revision 1.103  2007/06/28 07:30:18  Jeff.Keys
 *     fix search bug
 *
 *     Revision 1.102  2007/06/21 09:20:44  Troy.Sadkowsky
 *     rename and imports fix
 *
 *     Revision 1.101  2007/06/19 23:59:20  Troy.Sadkowsky
 *     moved copy button
 *
 *     Revision 1.100  2007/06/19 23:42:11  Troy.Sadkowsky
 *     moved copy button
 *
 *     Revision 1.99  2007/06/17 03:47:42  Jeff.Keys
 *     questionnaire searches -agents
 *
 *     Revision 1.98  2007/06/17 00:23:53  Jeff.Keys
 *     questionnaire searches -agents
 *
 *     Revision 1.97  2007/06/16 01:10:22  Jeff.Keys
 *     questionnaire searches
 *
 *     Revision 1.96  2007/06/09 01:34:28  Jeff.Keys
 *     clean up some highlighting
 *
 *     Revision 1.95  2007/06/09 00:03:33  Troy.Sadkowsky
 *     bug fix with mulitple keyphrase warnings
 *
 *     Revision 1.94  2007/06/08 00:34:29  Troy.Sadkowsky
 *     attempt to increase speed of rules display
 *
 *     Revision 1.93  2007/06/07 08:11:43  Jeff.Keys
 *     Changes to search results format
 *
 *     Revision 1.92  2007/06/03 23:45:26  Troy.Sadkowsky
 *     conflict fixes
 *
 *     Revision 1.91  2007/06/03 23:06:11  Troy.Sadkowsky
 *     rule creation more efficient
 *
 *     Revision 1.90  2007/06/03 02:49:34  Jeff.Keys
 *     JSM Search
 *     Add new job
 *
 *     Revision 1.89  2007/06/02 07:24:02  Jeff.Keys
 *     Online User Manual
 *
 *     Revision 1.88  2007/05/30 04:17:08  Jeff.Keys
 *     *** empty log message ***
 *
 *     Revision 1.86  2007/05/27 23:21:10  Troy.Sadkowsky
 *     restructured rule types
 *
 *     Revision 1.85  2007/05/20 22:05:10  Troy.Sadkowsky
 *     keep correct order of questions in edit mode
 *
 *     Revision 1.84  2007/05/19 02:02:34  jeff.keys
 *     online user manual
 *
 *     Revision 1.83  2007/05/18 02:13:08  jeff.keys
 *     jsm highlight
 *
 *     Revision 1.82  2007/05/16 05:42:16  jeff.keys
 *     study notes
 *
 *     Revision 1.81  2007/05/14 22:45:17  Troy.Sadkowsky
 *     prob unknown and jh facts at questionnaire
 *
 *     Revision 1.80  2007/05/13 05:49:13  jeff.keys
 *     save Question action button
 *
 *     Revision 1.79  2007/05/12 14:11:46  jeff.keys
 *     Q->Structure->Search on keyphrase/Clear search
 *
 *     Revision 1.78  2007/05/11 03:13:24  jeff.keys
 *     save/edit jobs
 *
 *     Revision 1.77  2007/05/03 13:52:55  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.76  2007/05/03 10:23:03  jeff.keys
 *     jsm keyword highlight
 *
 *     Revision 1.75  2007/05/01 23:42:32  Troy.Sadkowsky
 *     changed agents view, add and edit
 *
 *     Revision 1.74  2007/04/30 23:43:47  Troy.Sadkowsky
 *     fix for fire fox javascript problems
 *
 *     Revision 1.73  2007/04/30 23:36:07  Troy.Sadkowsky
 *     fix for fire fox javascript problems
 *
 *     Revision 1.72  2007/04/25 21:56:30  Troy.Sadkowsky
 *     made dbobject sortable and removed old objects and functions
 *
 *     Revision 1.71  2007/04/24 07:25:53  troy.sadkowsky
 *     question update
 *
 *     Revision 1.70  2007/04/22 11:56:01  Troy.Sadkowsky
 *     build v1.24
 *
 *     Revision 1.69  2007/04/13 04:17:15  Troy.Sadkowsky
 *     further rule creation updates and bug fix for adding new jsm
 *
 *     Revision 1.68  2007/04/12 13:27:02  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.67  2007/04/10 13:06:00  Troy.Sadkowsky
 *     attached files
 *
 *     Revision 1.66  2007/04/04 12:02:04  Troy.Sadkowsky
 *     linking jobs through template jsms
 *
 *     Revision 1.65  2007/04/01 21:20:44  Troy.Sadkowsky
 *     new rule management page
 *
 *     Revision 1.64  2007/03/30 04:54:49  Troy.Sadkowsky
 *     mods for user-study relationships
 *
 *     Revision 1.63  2007/03/30 03:11:36  jeff.keys
 *     user/roles tabs
 *
 *     Revision 1.62  2007/03/29 03:14:01  jeff.keys
 *     add style to agents
 *
 *     Revision 1.61  2007/03/28 14:36:13  jeff.keys
 *     removed edit jobs popup and displayed it on the main page
 *
 *     Revision 1.60  2007/03/28 10:10:23  jeff.keys
 *     removed edit agents popup and displayed it on the main page
 *
 *     Revision 1.59  2007/03/27 06:32:48  jeff.keys
 *     remove remarked code
 *
 *     Revision 1.58  2007/03/25 12:00:22  jeff.keys
 *     check boxes ids and labels
 *
 *     Revision 1.57  2007/03/25 05:47:22  jeff.keys
 *     add style to close window link
 *     and radio buttons ids and labels
 *
 *     Revision 1.56  2007/03/24 05:27:44  jeff.keys
 *     add style to close window link
 *
 *     Revision 1.55  2007/03/24 01:30:48  jeff.keys
 *     removed add/edit question popup and displayed it on the main page
 *
 *     Revision 1.54  2007/03/21 13:46:02  Troy.Sadkowsky
 *     bug fix on copy template, datetime field, new add permission code, print view
 *
 *     Revision 1.53  2007/03/20 07:54:29  jeff.keys
 *     Role Permission page styles
 *
 *     Revision 1.52  2007/03/20 07:33:53  Troy.Sadkowsky
 *     attempt to fix bug 88
 *
 *     Revision 1.51  2007/03/18 13:40:42  troy.sadkowsky
 *     new copy template jsm feature
 *
 *     Revision 1.50  2007/03/16 04:37:22  jeff.keys
 *     Making it look pretty
 *
 *     Revision 1.49  2007/03/15 13:47:24  jeff.keys
 *     Questionnaire Roles Tab
 *
 *     Revision 1.48  2007/03/15 05:05:42  jeff.keys
 *     Questionnaire Roles Tab
 *
 *     Revision 1.47  2007/03/15 00:16:45  Troy.Sadkowsky
 *     bug fixes for build v1.18
 *
 *     Revision 1.46  2007/03/14 02:59:53  Troy.Sadkowsky
 *     modifications for showing user roles and setting a user a roleid
 *
 *     Revision 1.45  2007/03/13 15:06:48  jeff.keys
 *     Questionnaire User Roles
 *
 *     Revision 1.43  2007/03/12 12:47:40  Troy.Sadkowsky
 *     removed frames
 *
 *     Revision 1.42  2007/03/12 02:45:52  Troy.Sadkowsky
 *     removed frames
 *
 *     Revision 1.41  2007/03/11 11:30:35  Troy.Sadkowsky
 *     removed frames
 *
 *     Revision 1.40  2007/03/11 07:38:14  jeff.keys
 *     Questionnaire User Roles
 *
 *     Revision 1.39  2007/03/08 23:23:52  jeff.keys
 *     User Permission Admin Form
 *
 *     Revision 1.38  2007/03/06 04:41:54  troy.sadkowsky
 *     user permissions
 *
 *     Revision 1.37  2007/03/05 05:34:02  Troy.Sadkowsky
 *     bug fix for highlighting jsm name
 *
 *     Revision 1.36  2007/02/28 12:04:02  Troy.Sadkowsky
 *     first phase of roles and permissions
 *
 *     Revision 1.35  2007/02/28 05:28:22  Troy.Sadkowsky
 *     build v1.16 updates
 *
 *     Revision 1.34  2007/02/23 07:47:22  jeff.keys
 *     disable jsm interview start and end fields
 *
 *     Revision 1.33  2007/02/22 08:41:16  jeff.keys
 *     bug 105: Search highlights and title keyword form display
 *
 *     Revision 1.32  2007/02/22 01:51:04  jeff.keys
 *     Implement credits attribute
 *
 *     Revision 1.31  2007/02/20 03:14:47  troy
 *     set values for frequency
 *
 *     Revision 1.30  2007/02/20 02:16:07  Jeff
 *     Implement credits attribute
 *
 *     Revision 1.29  2007/02/19 21:52:42  troy
 *     Decision tree view
 *
 *     Revision 1.28  2007/02/18 23:01:18  troy
 *     colour decision tree
 *
 *     Revision 1.27  2007/02/18 11:07:19  troy
 *     new dynamic rule creation
 *
 *     Revision 1.26  2007/02/15 13:20:45  Jeff
 *     Enhancement 88: from editjsm form allow users to add and remove ajsms
 *
 *     Revision 1.25  2007/02/13 07:42:17  Jeff
 *     Enhancement 88: from editjsm form allow users to add and remove ajsms
 *
 *     Revision 1.24  2007/02/12 00:43:04  Jeff
 *     Add and remove AJSMs
 *
 *     Revision 1.23  2007/02/08 03:53:11  troy
 *     Bug 81 Possible Answer add and remove preserves changes made to the question
 *
 *     Revision 1.22  2007/02/07 23:22:18  troy
 *     further development on level rules
 *
 *     Revision 1.21  2007/02/07 14:39:12  Jeff
 *     Bug 81: changes made to a question are preserved when adding possible answers
 *
 *     Revision 1.20  2007/02/07 02:42:08  troy
 *     changed hrefs to buttons form maintaining changes made to questions on the edite question page
 *
 *     Revision 1.19  2007/02/06 01:19:46  Jeff
 *     Bug 75
 *     Implements automatic adding of possible answer types:
 *     [number m-n]
 *     [free-text]
 *
 *     Revision 1.18  2007/02/02 06:24:40  troy
 *     Bug fix 119 and 118
 *
 *     Revision 1.17  2006/12/12 13:43:59  admin
 *     build v1.13
 *
 *     Revision 1.16  2006/11/24 23:03:10  admin
 *     updates before demo
 *
 *     Revision 1.15  2006/11/20 12:26:36  admin
 *     build v1.11 changes
 *
 *     Revision 1.14  2006/11/15 07:30:41  admin
 *     build v1.10
 *
 *     Revision 1.13  2006/11/03 07:24:06  admin
 *     display updates
 *
 *     Revision 1.12  2006/10/31 21:09:30  admin
 *     build v1.08
 *
 *     Revision 1.11  2006/10/17 00:15:30  admin
 *     mapping
 *
 *     Revision 1.10  2006/10/10 23:52:57  admin
 *     worked on jobs
 *
 *     Revision 1.9  2006/09/25 12:45:55  admin
 *     Iteration 28 changes
 *
 *     Revision 1.8  2006/07/27 23:19:44  admin
 *     version 1.02
 *
 *     Revision 1.7  2006/07/22 04:56:34  admin
 *     new jobhistory changes
 *
 *     Revision 1.6  2006/07/19 00:45:19  admin
 *     fixed search and associate jsm link
 *
 *     Revision 1.5  2006/06/30 05:55:14  administrator
 *     updates for rework
 *
 *     Revision 1.4  2006/06/29 05:49:00  administrator
 *     updates for rework
 *
 *     Revision 1.3  2006/06/16 00:19:51  administrator
 *     restructure progress
 *
 *     Revision 1.2  2006/06/12 04:10:02  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.11  2006/06/06 23:22:31  administrator
 *     restructure progress
 *
 *     Revision 1.10  2006/06/05 07:01:12  administrator
 *     updates for rework
 *
 *     Revision 1.9  2006/06/05 02:22:08  administrator
 *     restructure progress
 *
 *     Revision 1.8  2006/05/31 07:15:34  administrator
 *     updates for rework
 *
 *     Revision 1.7  2006/05/30 23:45:44  administrator
 *     restructure progress
 *
 *     Revision 1.6  2006/05/26 06:57:37  administrator
 *     updates for rework
 *
 *     Revision 1.5  2006/05/26 02:33:32  administrator
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
 *     Revision 1.16  2006/03/21 22:11:30  administrator
 *     fixed return type of get questions
 *
 *     Revision 1.15  2006/03/13 04:02:48  administrator
 *     tidied code
 *
 *     Revision 1.14  2006/03/02 23:19:34  administrator
 *     changed objects to throw excpetions not throwables
 *
 *     Revision 1.13  2006/03/01 03:37:55  administrator
 *     new job structure and more on connections
 *
 *     Revision 1.12  2006/02/27 04:03:54  administrator
 *     new job description field
 *
 *     Revision 1.11  2006/02/24 06:28:49  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.10  2006/02/23 07:11:59  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.9  2006/02/22 02:40:13  administrator
 *     renamed id for sort table
 *
 *     Revision 1.8  2006/02/16 22:44:06  administrator
 *     new connection pool
 *
 *     Revision 1.7  2006/02/07 23:07:25  administrator
 *     reworked interface for chemical allocation
 *
 *     Revision 1.6  2006/02/02 08:51:13  administrator
 *     moved function from base object
 *
 *     Revision 1.5  2006/02/01 23:24:46  administrator
 *     removed deprecated addJSM function
 *
 *     Revision 1.4  2006/02/01 06:50:18  administrator
 *     moved functions from base object
 *
 *     Revision 1.3  2006/01/31 23:18:43  administrator
 *     change display look
 *
 *     Revision 1.2  2006/01/30 06:34:13  administrator
 *     interface work
 *
 *     Revision 1.1  2006/01/24 23:28:17  administrator
 *     restructure to remove needless interface and added new mql object
 *
 *     Revision 1.8  2006/01/13 06:57:34  administrator
 *     new interview section objects
 *
 *     Revision 1.7  2005/12/21 02:53:37  administrator
 *     job task display
 *
 *     Revision 1.6  2005/12/20 23:21:27  administrator
 *     add update to jsm
 *
 *     Revision 1.5  2005/12/14 04:17:05  administrator
 *     Job history management
 *
 *     Revision 1.4  2005/12/07 04:28:49  administrator
 *     Job History implementation
 *
 *     Revision 1.3  2005/11/29 05:24:29  administrator
 *     view tidy up
 *
 *     Revision 1.2  2005/11/25 06:33:18  administrator
 *     chemical full view
 *
 *     Revision 1.1  2005/11/16 05:28:39  administrator
 *     new library to share amongst mql, ims and ams
 *
 *     Revision 1.19  2005/11/09 06:13:29  administrator
 *     toggle colours on rows
 *
 *     Revision 1.18  2005/11/02 02:41:44  administrator
 *     Implemented Toggle feature for chemicals and rules
 *
 *     Revision 1.17  2005/11/01 22:42:46  administrator
 *     prep for M1
 *
 *     Revision 1.16  2005/10/21 03:58:17  administrator
 *     user logins and permissions
 *
 *     Revision 1.15  2005/10/20 05:47:46  administrator
 *     better error message on failed import
 *
 *     Revision 1.14  2005/10/11 22:11:36  administrator
 *     Floating action buttons, multiple chemicals and import function
 *
 *     Revision 1.13  2005/10/10 07:10:21  administrator
 *     implemented sequence change functionality
 *
 *     Revision 1.12  2005/09/30 06:50:25  administrator
 *     edit text functions
 *
 *     Revision 1.11  2005/09/30 00:26:00  administrator
 *     unify the interface and enhancement on action buttons
 *
 *     Revision 1.10  2005/09/13 23:19:44  administrator
 *     main action buttons
 *
 *     Revision 1.9  2005/09/09 07:09:36  administrator
 *     Tidy up interface
 *
 *     Revision 1.8  2005/09/08 22:45:06  administrator
 *     reworked objects for job association
 *
 *     Revision 1.7  2005/08/24 03:42:08  administrator
 *     Connection is static and stays open
 *
 *     Revision 1.6  2005/08/22 05:55:53  administrator
 *     reworked connection method to close on overridden finalize
 *
 *     Revision 1.5  2005/08/22 03:55:26  administrator
 *     importer and furhter restructure with frames
 *
 *     Revision 1.4  2005/08/12 06:54:25  administrator
 *     import function
 *
 *     Revision 1.3  2005/08/04 04:22:57  administrator
 *     half implemented tab feature
 *
 *     Revision 1.2  2005/07/29 02:20:23  administrator
 *     fixed tree closing bug
 *
 *     Revision 1.1  2005/07/29 01:10:15  administrator
 *     table format of questions and answers
 *
 *     
 */
package com.researchit.html;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

import com.researchit.Agent;
import com.researchit.AgentGroup;
import com.researchit.common.DBBaseObject;
import com.researchit.JobSpecificModule;
//import com.researchit.JobTitle;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.User;
import com.researchit.Util;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertFact;
import com.researchit.expert.ExpertFactRequirement;
import com.researchit.expert.ExpertRule;

public class MasterQuestionList extends HTMLObject {

	private final int JSMLENGTH = 15;
	private final int AGENTLENGTH = 13;
	public MasterQuestionList() throws Exception {
		super();
	}
	public String showAllJSMs(String selId, ArrayList<JobSpecificModule> array) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";
		for (JobSpecificModule jsm : array) {
			String strClass = "";
			if (jsm.getId().equalsIgnoreCase(selId)) {
            	strClass = " class=Highlight";
            } else {
            	strClass = " class=LHSMenuContent";
            }		
			strRetValue += "<tr><td colspan=2 "+strClass+" title='" + jsm.getName() 
				+ "'><a class=LHSMenu href=main.jsp?jsmID=" + jsm.getId() 
				+ " onclick=\"return showProgress()\">" + this.truncateName(jsm.getName(),JSMLENGTH)
				+ "</a></td></tr>";
		}
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showEditQuestions(String questionIDs, User user) throws Exception {
		String ids[] = questionIDs.split(",");
		String strRetValue = "<table class=EditView cellpadding=0 cellspacing=0>";
		if(ids.length==1){
			Question q = new Question("",ids[0]);
			if(q.getId().equalsIgnoreCase("")){
				strRetValue += "<tr class=windowTop><td align=center>New Question</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";										
			}else{
				strRetValue += "<tr class=windowTop><td align=center>Edit Questions</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";								
			}
		}else{
			strRetValue += "<tr class=windowTop><td align=center>Edit Questions</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";								
		}
		strRetValue += "<tr><td><table >";
		int iCount = 0;
		for (String id : ids) {
			Question q = new Question("",id);			
			//if user has permission and the question type is not 3 (Frequency type) then allow edits and if not ssJSM
			JobSpecificModule jsm = new JobSpecificModule(q.getJsmID());
			if ((user.hasPermission(User.Permission.EDITKEYPHRASE) && (jsm.getJsmTypeId()!=JobSpecificModule.STUDY) && !(q.getTypeID().equalsIgnoreCase(Question.FREQUENCY)))) {
				String strDisabled = "";
				String strNewButton = "";
				if(q.isKeyPhaseUsed()){
					strDisabled = "disabled";
					strNewButton += "<td class=warning>";
					strNewButton += "Shared Key Phrase<input style='border-left: 1px solid black; border-bottom: 1px solid black; border-top: 1px solid gray; border-right: 1px solid gray; padding-bottom: 5px' type=image src='ImageStream?ImageName=newitem.gif' name=newKeyPhrase height=12 width=10 title=\"Click to create new keyphrase\" alt=\"Click to create new keyphrase\" />";
					strNewButton += "<image title=\"Click to override\" alt=\"Click to override\" height=12 width=10 style='border-left: 1px solid black; border-bottom: 1px solid black; border-top: 1px solid gray; border-right: 1px solid gray; padding-bottom: 5px;' src='ImageStream?ImageName=edititem.gif' onclick=enableControl('qName_"
					+ q.getJsmQuestionStructureID()
					+ "'); />";
					strNewButton += "</td>";
				}
				strRetValue += "\n<tr><td>Question Key Phrase</td><td><input size=50 type=text id=qName_"
					+ q.getJsmQuestionStructureID()
					+ " name=qName_"
					+ q.getJsmQuestionStructureID()
					+ " value=\""
					+ q.getName()
					+ "\"  "+strDisabled+"></input></td>"+strNewButton+"</tr>";
								
				strRetValue += "\n<tr><td>JSM Question Description</td><td colspan=2><input type=text name=qDescription_"
					+ q.getJsmQuestionStructureID()
					+ " value=\""
					+ q.getDescription() + "\" size=60 ></input></td></tr>";
				if(user.hasPermission(User.Permission.EDITKEYPHRASE)){
					strRetValue += "\n<tr><td>Type</td><td colspan=2>"
						+ this.showQuestionTypeComboBox(q) + "</td></tr>";
				}
				//if user does not have permissions and/or the question is a frequency type then write uneditable text
			} else {
				strRetValue += "\n<tr><td>Question Key Phrase</td><td>"
					+ q.getName()
					+ "</td>"
					+ "</tr>";
				strRetValue += "\n<tr><td>JSM Question Description</td><td colspan=2><input type=text name=qDescription_"
					+ q.getJsmQuestionStructureID()
					+ " value=\""
					+ q.getDescription() + "\" size=60 ></input></td></tr>";
				if(user.hasPermission(User.Permission.EDITKEYPHRASE)){
					strRetValue += "\n<tr><td>Type</td><td colspan=2>"
						+ this.showQuestionTypeComboBox(q) + "</td></tr>";
				}				
			}
			if (!(q.isAssociateJSM())) {
				
				String checked = "";
				if (q.isViewWithParent()) {
					checked = "checked";
				}
				String strViewWithParentHTML = "<input id=isviewWithParent"+q.getId()+ " " +checked
				+ " type=checkbox name=viewWithParent"
				+ q.getJsmQuestionStructureID() + "></input>";
				strRetValue += "\n<tr><td valign=top align=right><label for=isviewWithParent"
						+ q.getId()
						+ ">View With Parent</label></td><td colspan=2>"
						+ strViewWithParentHTML
						+ "</td></tr>";
				checked = "";
				if (q.isMultiple()) {
					checked = "checked";
				}
				String strIsMultipleHTML = "<input id=isMultiple" + q.getId()
						+ " " + checked + " type=checkbox name=qIsMultiple"
						+ q.getJsmQuestionStructureID() + "></input>";
				strRetValue += "\n<tr><td valign=top align=right><label for=isMultiple"
						+ q.getId()
						+ ">Allow Multiple Answers</label></td><td colspan=2>"
						+ strIsMultipleHTML + "</td></tr>";
				strRetValue += "\n<tr><td>Notes</td><td colspan=2><input type=text name=qNotes_"
					+ q.getJsmQuestionStructureID()
					+ " value=\""
					+ q.getNotes() + "\" size=60 ></input></td></tr>";
				String strAnswers = this.showRemoveAddTable(q.getPossibleAnswers(), q.getJsmQuestionStructureID(),"possibleAnswers");
				strRetValue += "\n<tr><td colspan=3>";
				strRetValue += "\n<table class=possibleanswers>";
				strRetValue += "<tr><td >Possible Answers Attached</td><td>Add Possible Answer</td></tr>";
				strRetValue += "\n<tr><td>"
						+ strAnswers		
						+ "</td>";

				String strPAButtons = this.showOtherPossibleAnswersButtons(q.getJsmQuestionStructureID());
				strRetValue += "<td>";
				strRetValue += strPAButtons;
				strRetValue += "</td>";
				
				strRetValue += "</tr></table>";
				strRetValue += "</td></tr>";
			}
			if(iCount==0){
				strRetValue += "<tr><td colspan=4><hr /><script language=javascript type='text/javascript'>setFocus('qDescription_"
					+ q.getJsmQuestionStructureID()
					+ "');</script></td></tr>";
			}
			iCount++;
		}
		strRetValue += "\n</table>";
		strRetValue += "\n</td></tr>";
		strRetValue += "\n</table>";
		
		return strRetValue;
	}	
	public String showOtherPossibleAnswersButtons(String strParentQid) {
		String strRetValue = "<table>";
		strRetValue += "<tr><td><input type=submit name=addPossibleAnswer_"+strParentQid+" value='simple' style='width:10em'/></td></tr>";
		strRetValue += "<tr><td><input type=submit name=addYesNoPossibleAnswers_"+strParentQid+" value='yes/no' style='width:10em' /></td></tr>";
		strRetValue += "<tr><td><input type=submit name=addNumberedAnswer_"+strParentQid+" value='number' style='width:10em'/></td></tr>";
		strRetValue += "<tr><td><input type=submit name=addFreeTextAnswer_"+strParentQid+" value='free-text' style='width:10em' onclick='return checkExistingFreetext();'/></td></tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showEditJSMs(ArrayList<JobSpecificModule> jsmArray) throws Exception {
		String strRetValue = "";
		strRetValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		strRetValue += "<tr class=windowTop><td align=center colspan=3>Edit JSM</td><td>Close</td><td style=\"text-align: right;\">"
			+"<input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";
		int iCount = 0;
		for(JobSpecificModule jsm:jsmArray){
			strRetValue += "<tr>";
			strRetValue += "<td>Name</td>";
			strRetValue += "<td ><input type=text name=jsmName_"
					+ jsm.getId() + " value=\"" + jsm.getName()
					+ "\" size=50></td>";
			if(jsm.getName().contains("NEWJSM")){
				strRetValue += "<td><input id=jsmIsAssociate type=checkbox name=jsmIsAssociate />"
					+"<label for=jsmIsAssociate>Is Associate Module</label></td>";
			}				
			strRetValue += "</tr>";
			strRetValue += "<tr>";
			strRetValue += "<td>Description</td>";
			strRetValue += "<td ><input type=text name=jsmDescription_"
					+ jsm.getId() + " value=\"" + jsm.getDescription()
					+ "\" size=50></td>";
			strRetValue += "</tr>";
			strRetValue += "<tr>";
			strRetValue += "<td>Forum Link</td>";
			strRetValue += "<td ><input type=text name=jsmForumLink_"
					+ jsm.getId() + " value=\"" + jsm.getForumLink()
					+ "\" size=50></td>";
			strRetValue += "</tr>";
			strRetValue += "<tr>";
			strRetValue += "<td>Credits</td>";
			strRetValue += "<td ><input type=text name=jsmCredits_"
					+ jsm.getId() + " value=\"" + jsm.getCredits()
					+ "\" size=50></td>";
			strRetValue += "</tr>";
			strRetValue += "<tr>";
			strRetValue += "<td>Comments</td>";
			strRetValue += "<td ><input type=text name=jsmComments_"
					+ jsm.getId() + " value=\"" + jsm.getComments()
					+ "\" size=50></td>";
			strRetValue += "</tr>";
			
			if(iCount==0){
				strRetValue += "<tr><td colspan=4><hr /><script language=javascript type='text/javascript'>setFocus('jsmName_"
					+ jsm.getId() + "');</script></td></tr>";  
			}else{
				strRetValue += "<tr><td colspan=4><hr /></td></tr>";
			}
			iCount++;
		}
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showJSMDescription(JobSpecificModule jsm) throws Exception {
		//jsm.getFullQuestions();
		String strRetValue = "<table class=EditView cellspacing=0  >";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs width=200px>Name</td>";
		String readOnly = "";
		if(jsm.isReadOnly()){
			readOnly = "[Read Only]";
		}
		strRetValue += "<td class=jobs>" + jsm.getName() + " "+readOnly+"</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs>Description</td>";
		strRetValue += "<td class=jobs>" + jsm.getDescription() + "</td>";
		strRetValue += "</tr>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs>Forum Link</td>";
		String strForumLink = "";
		if(!(jsm.getForumLink().equalsIgnoreCase(""))){
			strForumLink = "<a href=\""+jsm.getForumLink()+"\">Click for "+jsm.getName()+" forum</a>";
		}
		
		strRetValue += "<td class=jobs>" + strForumLink + "</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs>Credits</td>";
		strRetValue += "<td class=jobs>" + jsm.getCredits() + "</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs>Comments</td>";
		strRetValue += "<td class=jobs>" + jsm.getComments() + "</td>";
		strRetValue += "</tr>";	
		strRetValue += "<tr>";
		if(jsm.getJsmTypeId()==JobSpecificModule.STUDY){		
			strRetValue += "<td class=jobs>Uses Questions From</td>";
			String usesAJSMs = "";
			for(JobSpecificModule ajsm:jsm.getJSMsThatShareQuestions()){
				if(ajsm.getName().equalsIgnoreCase("")){
					usesAJSMs += "&lt;AJSM Not Found&gt;, ";
				}else{
					usesAJSMs += ajsm.getName()+", ";
				}
				
			}
			if (!usesAJSMs.equalsIgnoreCase("")){
				usesAJSMs = usesAJSMs.substring(0, usesAJSMs.length() - 2);
			}
			strRetValue += "<td class=jobs>" + usesAJSMs + "</td>";
		}
		strRetValue += "</tr>";	
		strRetValue += "<tr class=jobs>";
		strRetValue += "<td class=jobs valign=top>Agents</td>";
		strRetValue += "<td class=jobs>" + this.showList(jsm.getAgentGroups())+ "</td>";
		strRetValue += "</tr>";
		if(!(jsm.isAssociateModule())){
			strRetValue += "<tr class=jobs>";
			strRetValue += "<td class=jobs valign=top>Jobs</td>";
			//strRetValue += "<td class=jobs>" + this.showList(jsm.getJobs()) + "</td>";
			strRetValue += "</tr>";
		}
		ArrayList<Question> dupQuestions = jsm.getDuplicateQuestions();
		if(dupQuestions.size()>0){
			strRetValue += "<tr>";
			strRetValue += "<td class=warning valign=top>Duplicate Question List</td>";
			strRetValue += "<td class=warning>" + this.showList(dupQuestions)+ "</td>";
			strRetValue += "</tr>";
		}		
		
		if(jsm.getJsmTypeId() != JobSpecificModule.TEMPLATE){
			strRetValue += "<tr >";
			strRetValue += "<td class=jobs valign=top>Owner</td>";
			User owner = new User();
			owner.setId(jsm.getUserId());		
			strRetValue += "<td class=jobs>" + owner.getUserName()+ "</td>";
			strRetValue += "</tr>";
			strRetValue += "<tr >";
			strRetValue += "<td class=jobs valign=top>Shared users</td>";
			strRetValue += "<td class=jobs>"+ this.showList(jsm.getSharedUsers())+ "</td>";
			strRetValue += "</tr>";
		}
		strRetValue += "</table>";		
		return strRetValue;
	}
	public String showSearchedCount(JobSpecificModule jsm) throws Exception	{
		String retVal = "<table cellspacing=0><tr class=ListHeader ><td width=100%>Search Count: " 
			+jsm.getSearchCount()
			+"</td></tr></table>";
		return retVal;
	}	
	public String showSearchedJSMDescription(JobSpecificModule jsm, String search) throws Exception {
		jsm.getFullQuestions();
		String strRetValue = "<table class=ContentList cellspacing=0>";
		strRetValue += "<tr>";
		strRetValue += "<td width=200px>Name</td>";
		strRetValue += "<td >" + jsm.getName() + "</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td >Decription</td>";
		strRetValue += "<td >" + jsm.getDescription() + "</td>";
		strRetValue += "</tr>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td>Credits</td>";
		strRetValue += "<td >" + jsm.getCredits() + "</td>";
		strRetValue += "</tr>";	
		strRetValue += "<tr>";
		strRetValue += "<td>Comments</td>";
		strRetValue += "<td >" + jsm.getComments() + "</td>";
		strRetValue += "</tr>";	
		strRetValue += "<tr class=agents>";
		strRetValue += "<td class=agents valign=top>Agents</td>";
		strRetValue += "<td class=agents >" + this.showList(jsm.getAgents())+ "</td>";
		strRetValue += "</tr>";
		if(!(jsm.isAssociateModule())){
			strRetValue += "<tr class=jobs>";
			strRetValue += "<td class=jobs valign=top>Jobs</td>";
			//strRetValue += "<td class=jobs>" + this.showList(jsm.getJobs()) + "</td>";
			strRetValue += "</tr>";
		}		
		if(jsm.getDuplicateQuestions().size()>0){
			strRetValue += "<tr>";
			strRetValue += "<td class=warning valign=top>Duplicate Question List</td>";
			strRetValue += "<td class=warning>"
				+ this.showList(jsm.getDuplicateQuestions()).toLowerCase().replace(search.toLowerCase(),"<span class=searchHighlight>" 
						+ search + "</span>")
						+ "</td>";
			strRetValue += "</tr>";
		}		
		strRetValue += "<tr>";
		strRetValue += "<td class=questions valign=top>Question List</td>";
		strRetValue += "<td class=questions>" 
			+ this.showJSMQuestions(jsm.getQuestions(),search)+ "</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td class=possibleanswers valign=top>Possible Answer List</td>";
		strRetValue += "<td>" 
			+ this.showJSMPossibleAnswersList(jsm.getPossibleAnswersList(), search)
			+ "</td>";
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showJSMPossibleAnswersList(ArrayList<PossibleAnswer> possibleAnswers, String search) throws Exception {
		String strRetValue = "<table class=possibleanswers>";
		for (PossibleAnswer pa : possibleAnswers) {
			strRetValue += "<tr><td>";
				strRetValue += this.highlightSearch(pa.getName(), search);
		}
		strRetValue += "</td></tr></table>";

		return strRetValue;
	}
	private String showQuestionTypeComboBox(Question q) {
		String selected = "";
		String strAssociateJSMTypeOption = "";
		
		if (q != null) {
			selected = q.getTypeID();
			if (q.isAssociateJSM()) {
				q.setTypeID(Question.ASSOCIATEJSMLINK);
				strAssociateJSMTypeOption = "<option selected value=4>Associate JSM</option>";
			}
		}
		String strHTML = "<select name=qType_" + q.getJsmQuestionStructureID()
				+ "><option></option>";
		if (selected.equalsIgnoreCase("1")) {
			strHTML += "<option selected value=1>Probability</option>";
		} else {
			strHTML += "<option value=1>Probability</option>";
		}
		if (selected.equalsIgnoreCase("2")) {
			strHTML += "<option selected value=2>Level</option>";
		} else {
			strHTML += "<option value=2>Level</option>";
		}
		if (selected.equalsIgnoreCase("5")) {
			strHTML += "<option selected value=5>Prob/Level</option>";
		} else {
			strHTML += "<option value=5>Prob/Level</option>";
		}
		if (selected.equalsIgnoreCase("3")) {
			strHTML += "<option selected value=3>Frequency</option>";
		} else {
			strHTML += "<option value=3>Frequency</option>";
		}
		strHTML += strAssociateJSMTypeOption;
		strHTML += "</select>";
		return strHTML;
	}	
	public String showJSMQuestions(ArrayList<Question> questions, String search)
			throws Exception {
		String strRetValue = "";
		strRetValue += "\n<table class=questions>";
		int i = 1;
		for (Question q : questions) {
			if (q.isAssociateJSM()) {
				strRetValue += "\n<tr>";
				strRetValue += "\n <td title='" + q.getId() + " "
						+ q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
				strRetValue += "\n <td nowrap>(" + i + ")</td>";
				strRetValue += "\n <td><a href=./main.jsp?jsmID="
						+ q.getAssociateJSMID() + " onclick=\"return showProgress()\">" + "<font class=question>"+q.getName()+"</font>"
						+ "</a></td>";
				strRetValue += "\n <td valign=top><a name=lqAnchor"
						+ q.getJsmQuestionStructureID()
						+ "></a><a name=qAnchor" + q.getId() + "></a></td>";
				strRetValue += "\n</tr>";
				strRetValue += "\n<tr>";
				strRetValue += "\n <td>&nbsp;</td>";
				strRetValue += "\n</tr>";
			} else {
				ArrayList<Question> childQuestions = q.getChildQuestions();
				String strQuestions = this.showJSMQuestions(q.getChildQuestions(), search);
				strRetValue += "\n<tr>";
				strRetValue += "\n <td title='" + q.getId() + " "
						+ q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
				strRetValue += "\n <td nowrap>(" + i + ")</td>";
				strRetValue += "\n <td nowrap class=KeyPhrase>" + "<font class=question>"
				//Show the string being searched for in highlighted text in the name and description
					+ this.highlightSearch(q.getName(), search)
					+"</font>" + "</td>";
				strRetValue += "\n <td >"
					+ this.highlightSearch(q.getDescription(), search)
					+"</font>" + "</td>";				
				strRetValue += "\n</tr>";
				if (childQuestions.size() > 0) {
					strRetValue += "\n<tr>";
					strRetValue += "\n <td>&nbsp;</td>";
					strRetValue += "\n <td colspan=3>" + strQuestions + "</td>";
					strRetValue += "\n</tr>";
				}
			}
			i++;
		}
		strRetValue += "\n</td></tr></table>";
		return strRetValue;
	}
	public String showRemoveAddTable(List<PossibleAnswer> array, String parentQid, String className) throws Exception {
		String cssClassName = "";
		if (!(className.equalsIgnoreCase(""))) {
			cssClassName = "class=" + className;
		} 
		String strRetValue = "<table " + cssClassName + ">";
		if (array != null) {
			for (PossibleAnswer obj : array) {
				int iSize = obj.getChildQuestions().size();
				String strExclamation = "";
				if(iSize>0){
					String strChildQs = "Has "+iSize+" child questions";
					strExclamation = "<image src='ImageStream?ImageName=warning.gif' alt='"+strChildQs+"' title='"+strChildQs+"' border=0 />";
				}
				//Confirm answer deletion
				String warningText = "Are you sure you wish to remove this answer?";
				//Has child questions
				if(!obj.getChildQuestions().isEmpty()){
					warningText += " This answer has dependent questions. They will also be removed. ";
				}
				Question pq = new Question("",parentQid);
				JobSpecificModule jsm = new JobSpecificModule(pq.getJsmID());
				//Has associated rules
				PossibleAnswer pa = (PossibleAnswer)obj;
				ExpertAgent ex = new ExpertAgent( );
				if(ex.hasRule(pq.getId(),pa.getId(),jsm.getId())){
					warningText += " This answer has associated assessment rules. These may be invalidated if this answer is removed. ";					
				}
				String strDisabled = "";
				String strNewButton = "";
				
				if(obj.isShared()){
					strDisabled = "disabled";
					if(jsm.getJsmTypeId()!=JobSpecificModule.STUDY){
						//show ability to override disabled status
						strNewButton += "<span class=warning>";
						strNewButton += "";
						strNewButton += "<image title=\"Click to edit " +obj.getName() +" system wide\" alt=\"edit\" height=12 width=10 style='border-left: 1px solid black; border-bottom: 1px solid black; border-top: 1px solid gray; border-right: 1px solid gray; padding-bottom: 5px; background-color: papayawhip;' src='ImageStream?ImageName=edititem.gif' onclick=enableControl('paName_"
							+ obj.getJsmQuestionPossibleAnswerStructureID()
							+ "'); />";
						strNewButton += "</span>";
						
						strRetValue += "<tr ><td title=\""
							+obj.getName()
							+"\" " + cssClassName
							+ " ><input type=text id=paName_"
							+ obj.getJsmQuestionPossibleAnswerStructureID()
							+ " name=paName_"
							+ obj.getJsmQuestionPossibleAnswerStructureID()
							+ "  value=\"" 
							+ obj.getDescription() 
							+ "\" onfocus=\"clearText(this);\" "+strDisabled+"></input></td><td "
							+ cssClassName 
							+ " >"+strNewButton+"<input type=submit name=removePossibleAnswer_"
							+ obj.getJsmQuestionPossibleAnswerStructureID()
							+" value='Remove' " 
							+ " onclick=\"return confirm('"
							+ warningText 
							+"');\"  />"
							+strExclamation
							+"</td></tr>";
						
					}else{
						//show answer as text
						strRetValue += "<tr ><td " + cssClassName
							+ " ><div style='width: 250px'><b>" 
							+ obj.getName() 
							+ "</div></b></td><td "
							+ cssClassName 
							+ " ><input type=submit name=removePossibleAnswer_"
							+ obj.getJsmQuestionPossibleAnswerStructureID()
							+" value='Remove' " 
							+ " onclick=\"return confirm('"
							+ warningText 
							+"');\"  />"
							+strExclamation
							+"</td></tr>";
					}
				}else{
					//show answer as editable text box
					String answerType = "";
					if (obj.getDescription().contains("[free text]")) {
						answerType = "freetext";
					}
					strRetValue += "<tr ><td title=\""
						+obj.getName()
						+"\" " + cssClassName
						+ " ><input size=40 type=text id=" + answerType + "paName_"
						+ obj.getJsmQuestionPossibleAnswerStructureID()
						+ " name=paName_"
						+ obj.getJsmQuestionPossibleAnswerStructureID()
						+ "  value=\"" 
						+ obj.getDescription() 
						+ "\" onfocus=\"clearText(this);\" "+strDisabled+"></input></td><td "
						+ cssClassName 
						+ " >"+strNewButton+"<input type=submit name=removePossibleAnswer_"
						+ obj.getJsmQuestionPossibleAnswerStructureID()
						+" value='Remove' " 
						+ " onclick=\"return confirm('"
						+ warningText 
						+"');\"  />"
						+strExclamation
						+"</td></tr>";
				}
				
			}
		}
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showSearchResults(ArrayList<JobSpecificModule> jsms, String search) throws Exception{
		String retVal = "";
		for(JobSpecificModule jsm: jsms){
			retVal += this.showSearchedCount(jsm);
			retVal += this.showSearchedJSMDescription(jsm, search);
		}
		return retVal;
	}
	public String showJSMHeaderStructure(JobSpecificModule jsm) {
		String strRetValue = "<table class=jsms>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jsm><a href=main.jsp?Location=Structure&jsmID="
				+ jsm.getId() + " onclick=\"return showProgress()\">" + jsm.getName()
				+ "</a>" + "</td>";
		strRetValue += "</tr>";
		strRetValue += "</table>";

		return strRetValue;
	}
/*	public String showJobTitleDetails(JobTitle jt) throws Exception{
		String strHTML = "<table class=jobs>";
		JobSpecificModule jsm = new JobSpecificModule();
		strHTML += "<tr><td>JSM</td><td>"+this.showCombo(jt.getJsmId(), "jobJSM_" + jt.getId(), jsm.getTemplateJSMs(), false,true,false)+"</td></tr>";
		strHTML += "<tr><td>Job Title</td><td><input type=text name=jobTitle_"
            + jt.getId()
            + " value=\""+jt.getName()+"\" onfocus=\"clearText(this);\" ></input></td></tr>";
		strHTML += "<tr><td>Keywords</td><td><textarea cols=50 rows=5 name=jobKeywords_"
            + jt.getId()
            + " >"
            +this.showList(jt.getKeywords())
            +"</textarea></td></tr>";
		strHTML += "</table>";
		return strHTML;
	}*/
	public String showLHSAgentsRules(JobSpecificModule jsm, ExpertAgent agent,ExpertRule.RuleOutcome selOutcome,boolean validate)throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";
		strRetValue += "\n<tr ><td><a href=main.jsp?jsmID="
				+ jsm.getId()
				+ " onclick=\"return showProgress()\">"
				+ jsm.getName()
				+ "</a></td></tr>";
		String highlight = "";
			
		strRetValue += "\n<tr><td class=Highlight><a name=anchor_"
				+ agent.getId()
				+ "></a><a href=main.jsp?agentID=" + agent.getId()
				+ " onclick=\"return showProgress()\">" + agent.getName()
				+ "</a></td></tr>";
		highlight = "";
		if(selOutcome == ExpertRule.RuleOutcome.PROBABLEHIGH){
			highlight = "class=Highlight";
		}		
		String count = "["+agent.getValidRules(ExpertRule.RuleOutcome.PROBABLEHIGH,jsm.getId()).size()+"]";
		strRetValue += "\n<tr><td "+highlight+">&nbsp;&nbsp;<a href=main.jsp?outcome="+ExpertRule.RuleOutcome.PROBABLEHIGH+" onclick=\"return showProgress()\">ProbHigh</a>"+count+"</td></tr>";
		highlight = "";
		if(selOutcome == ExpertRule.RuleOutcome.PROBABLEMEDIUM){
			highlight = "class=Highlight";
		}
		count = "["+agent.getValidRules(ExpertRule.RuleOutcome.PROBABLEMEDIUM,jsm.getId()).size()+"]";
		strRetValue += "\n<tr><td "+highlight+">&nbsp;&nbsp;<a href=main.jsp?outcome="+ExpertRule.RuleOutcome.PROBABLEMEDIUM+" onclick=\"return showProgress()\">ProbMedium</a>"+count+"</td></tr>";
		highlight = "";
		if(selOutcome == ExpertRule.RuleOutcome.PROBABLELOW){
			highlight = "class=Highlight";
		}
		count = "["+agent.getValidRules(ExpertRule.RuleOutcome.PROBABLELOW,jsm.getId()).size()+"]";
		strRetValue += "\n<tr><td "+highlight+">&nbsp;&nbsp;<a href=main.jsp?outcome="+ExpertRule.RuleOutcome.PROBABLELOW+" onclick=\"return showProgress()\">ProbLow</a>"+count+"</td></tr>";
		highlight = "";
		if(selOutcome == ExpertRule.RuleOutcome.PROBABLEUNKNOWN){
			highlight = "class=Highlight";
		}
		count = "["+agent.getValidRules(ExpertRule.RuleOutcome.PROBABLEUNKNOWN,jsm.getId()).size()+"]";
		strRetValue += "\n<tr><td "+highlight+">&nbsp;&nbsp;<a href=main.jsp?outcome="+ExpertRule.RuleOutcome.PROBABLEUNKNOWN+" onclick=\"return showProgress()\">ProbUnknown</a>"+count+"</td></tr>";
		highlight = "";
		if(selOutcome == ExpertRule.RuleOutcome.POSSIBLEUNKNOWN){
			highlight = "class=Highlight";
		}
		count = "["+agent.getValidRules(ExpertRule.RuleOutcome.POSSIBLEUNKNOWN,jsm.getId()).size()+"]";
		strRetValue += "\n<tr><td "+highlight+">&nbsp;&nbsp;<a href=main.jsp?outcome="+ExpertRule.RuleOutcome.POSSIBLEUNKNOWN+" onclick=\"return showProgress()\">PossUnknown</a>"+count+"</td></tr>";
				
		if(validate){
			highlight = "";
			if(selOutcome == ExpertRule.RuleOutcome.INVALID){
				highlight = "class=Highlight";
			}
			if(agent.hasInvalideRules(jsm.getId())){
				count = "["+agent.getInvalidRules(jsm.getId()).size()+"]";
				strRetValue += "\n<tr><td "+highlight+"><span class=warning>&nbsp;&nbsp;<a href=main.jsp?invalidRules="+ExpertRule.RuleOutcome.INVALID+" onclick=\"return showProgress()\">Invalid</a>"+count+"</span></td></tr>";				
			}
		}		
		strRetValue += "\n<tr><td><hr/></td></tr>";
		strRetValue += "\n<tr class=ListHeader><td>Other Agents</td></tr>";
		
		AgentGroup ag = new AgentGroup();
		for (AgentGroup agentGroup : ag.getAgentGroups()){
			String groupHeader = "";
			boolean firstAgent = true;
			for (Agent agent1 : jsm.getAgents()) {
				if (agent1.getId().equalsIgnoreCase(agent.getId())) {
					continue;
				}
				if(agentGroup.getAgents().contains(agent1)) {				
					if(firstAgent == true){
						groupHeader = "\n<tr><td>" + agentGroup.getName() + "</td></tr>";
					}else{
						groupHeader = "";
					}
					firstAgent = false;
					strRetValue += groupHeader;				
					strRetValue += "\n<tr><td title='" + agent1.getName() + "'><a name=anchor_"
						+ agent1.getId()
						+ "></a><a href=main.jsp?agentID=" + agent1.getId()
						+ " onclick=\"return showProgress()\">" + this.truncateName(agent1.getName(),AGENTLENGTH)
						+ "</a></td></tr>";
				}
			}
		}
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showJSMWithAgents(JobSpecificModule jsm, String selAgentId)throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";		
		strRetValue += "\n<tr ><td class=Highlight title='" + jsm.getName() + "'>JSM: <a href=main.jsp?jsmID="
				+ jsm.getId()
				+ " onclick=\"return showProgress()\">"
				+ this.truncateName(jsm.getName(),JSMLENGTH)
				+ "</a></td></tr>";
		
		AgentGroup ag = new AgentGroup();
		for (AgentGroup agentGroup : ag.getAgentGroups()){
			String groupHeader = "";
			boolean firstAgent = true;
			for (Agent agent : jsm.getAgents()) {				
				if(agentGroup.getAgents().contains(agent)) {
					String highlight = "";
					if(firstAgent == true){
						groupHeader = "\n<tr><td>" + agentGroup.getName() + "</td></tr>";
					}else{
						groupHeader = "";
					}
					firstAgent = false;
					strRetValue += groupHeader;
					if (agent.getId().equalsIgnoreCase(selAgentId)) {
						highlight = "class=Highlight";			
					} else{
						highlight = "class=LHSMenuAgents";
					}
					strRetValue += "\n<tr><td "+highlight+" title='" + agent.getName() + "'><a name=anchor_"
						+ agent.getId()
						+ "></a><a href=main.jsp?agentID=" + agent.getId()
						+ " onclick=\"return showProgress()\">" + this.truncateName(agent.getName(),AGENTLENGTH)
						+ "</a></td></tr>";
				}
			}
		}
		strRetValue += "</table>";
		return strRetValue;
	}	
	public String showEditAJSM(PossibleAnswer pa,String userId,String jsmId) throws Exception {									
		String retVal = "";
		retVal += "<table cellpadding=0 cellspacing=0> \n  ";
		retVal += "<tr><td> ";	
		String strLinkName = "";
		//String strRemoveName = "";
		if(pa.getId().equalsIgnoreCase("")){
			JobSpecificModule jsm = new JobSpecificModule(jsmId);
		//	retVal += this.showLinkedAJSMs(jsm,userId); 
			strLinkName = "linkAJSMToJSM_"+ jsm.getId();
		//	strRemoveName = "removeAJSMFromJSM_"+ jsm.getId();
		}else{
		//	retVal += this.showLinkedAJSMs(pa); 
			strLinkName = "linkAJSMToAnswer_" + pa.getJsmQuestionPossibleAnswerStructureID();
		//	strRemoveName = "removeAJSMFromAnswer_"+ pa.getJsmQuestionPossibleAnswerStructureID() ;
		}
		retVal += "</td> ";						
		//retVal += "<td width=50px align=center> <input type=submit name="+strLinkName+" value=\"<<\" /><input type=submit name="+strRemoveName+" value=\">>\" />";						
		//retVal += "</td> ";						
		retVal += "<td> ";						
		retVal += this.showUnlinkedAJSMs(userId);	 
		retVal += "<input type=submit name="+strLinkName+" value=\"Import\" /> ";		
		retVal += "</td> ";		
		retVal += "</tr>";						
		retVal += "</table>";						
		
		return retVal;		
	}
//	private String showLinkedAJSMs(PossibleAnswer pa) throws Exception {		
//		try{
//			String retVal = "";				
//			retVal += "<select class=aJSM multiple size=8 name=linkedAJSMs > \n ";											
//			for (JobSpecificModule ajsm : pa.getAssociateModules()){				
//				retVal += " <option value=" 
//					+ ajsm.getId() 
//					+  " >" 
//					+ ajsm.getName()
//					+  "</option> \n ";				
//			}	
//			retVal += "</select> \n ";
//			retVal += "";
//			return retVal;
//		}
//		catch (Exception e){
//			throw new Exception(e.getMessage());
//		}
//	}	
//	private String showLinkedAJSMs(JobSpecificModule jsm,String userId) throws Exception {				
//		String retVal = "";				
//		retVal += "<select class=aJSM multiple size=8 name=linkedAJSMs > \n ";
//		ArrayList<JobSpecificModule> linkedaJSMs = jsm.getStudySpecificAJSMs(userId);											
//		for (JobSpecificModule ajsm: linkedaJSMs){
//			retVal += " <option value=" 
//				+ ajsm.getId() 
//				+  " >" 
//				+ ajsm.getName()
//				+  "</option> \n ";
//		}	
//		retVal += "</select> \n ";			
//		return retVal;		
//	}
	private String showUnlinkedAJSMs(String userId) throws Exception {	
		String retVal = "";
		retVal += "<select class=aJSM multiple size=8 name=unlinkedAJSMs> \n ";		
		JobSpecificModule jsm = new JobSpecificModule();
		ArrayList<JobSpecificModule> allaJSMs = jsm.getTemplateAJSMs();	
		//allaJSMs.addAll();
		for (JobSpecificModule jsm1: allaJSMs){								
			retVal += " <option value=" 
				+ jsm1.getId() 
				+  " >" 
				+ jsm1.getName()
				+  "</option> \n ";			
		}
		retVal += "</select> \n ";			
		return retVal;							
	}
	public String showRulesView(ExpertAgent ea,ExpertRule rule,JobSpecificModule jsm,boolean bValid) throws Exception {		
		String strRetValue = "";
		strRetValue += "<table width=100%><tr class=windowTop><td align=center>Edit Rule</td><td>Close</td><td style='width:14px;text-align:right;'><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr></table>";
		strRetValue += "<table width=750px style='border: 1px solid #2484ab; background-color: #ffffff;'>";			
		strRetValue += "<tr>";
		int iRuleCount=0;     	
    	strRetValue += "<td bgcolor=#e5eff3><table ><tr class=ListHeader>";      	
    	String toCopyRuleId = "";
    	
    	ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
    	if(bValid){
    		rules = ea.getValidRules(rule.getOutCome(),jsm.getId());
    	}else{
    		rules = ea.getInvalidRules(jsm.getId());
    	}
		for(ExpertRule er: rules){			
			iRuleCount++; 
    		String number = String.valueOf(er.getSequence());        		
    		if(er.equals(rule)){
    			strRetValue += "<td align=center class=Highlight><a href=main.jsp?ruleId="+er.getId()+ " onclick=\"return showProgress()\">"+number+" </a></td>";
    			toCopyRuleId = er.getId();
    		}else{
    			strRetValue += "<td align=center ><a href=main.jsp?ruleId="+er.getId()+ " onclick=\"return showProgress()\">"+number+" </a></td>";
    		}  							                	
		}
		if(iRuleCount!=0){
			//Show copy rule if at least one fact
	    	strRetValue += "<td ><a href=ControllerServlet?Action=true&addLevelRule="+toCopyRuleId+"&levelTypeId="+ExpertRule.TYPEPROBABILITY+ " onclick=\"return showProgress()\"><img border=0 src='ImageStream?ImageName=copyRule.gif' height=16px width=32px/></a></td>";				
		}
		strRetValue += "</tr></table>";		
		strRetValue += "</td></tr>";
	
		if(!(rule.getId().equalsIgnoreCase(""))){
			strRetValue += "<tr ><td valign=top><b>IF</b></td></tr>";		
			strRetValue += "<tr class=probability>";		
	    	strRetValue += "<td><table cellpadding=0 cellspacing=0 >";       
	    	int iFactCount = 1;
	    	int iFactSize = rule.getFacts().size();
	    	ArrayList<Question> questions = ea.getProbLevelQuestions(jsm.getId());
	    	for(ExpertFact ef: rule.getFacts()){
	    		int iEfrSize = ef.getFactRequirements().size();
	    		int iEfrCount = 1;
	    		if(iFactCount>1){
	    			strRetValue += "<tr>";
					strRetValue += "<td align=center onmouseover=changeImage('"+ef.getId()+"','ImageStream?ImageName=minusand.gif'); onmouseout=changeImage('"+ef.getId()+"','ImageStream?ImageName=and.gif'); class=andFact><a href=ControllerServlet?Action=true&removeFact="+ef.getId()+"&removeFromRuleId="+rule.getId()+ " onclick=\"return showProgress()\"><img id="+ef.getId()+" border=0 src='ImageStream?ImageName=and.gif' height=16px width=32px/></a></td>";								
					strRetValue += "</tr>";
	    		}
				strRetValue += "<tr>";
				int indent = 0;
				for(ExpertFactRequirement efr: ef.getFactRequirements()){	    			
	    			if(iEfrCount>1){	    				
						strRetValue += "<td onmouseover=changeImage('"+efr.getId()+"','ImageStream?ImageName=minusor.gif'); onmouseout=changeImage('"+efr.getId()+"','ImageStream?ImageName=or.gif'); class=andFact><a href=ControllerServlet?Action=true&removeFactRequirement="+efr.getId()+"&removeFromFactId="+ef.getId()+ " onclick=\"return showProgress()\"><img id="+efr.getId()+" border=0 src='ImageStream?ImageName=or.gif' height=16px width=32px/></a></td>";								
					}	    				    			
	    			if(efr.getType().equalsIgnoreCase("JH")){
	    				//show job startdate condition
	    				strRetValue = this.showJobStartdateOption(strRetValue, ef, efr);
	    			}else{
	    				//show fact details
	    				strRetValue = this.showFactRequirement(ea, jsm, strRetValue, efr, indent,questions,rule);
	    			}
	    			if(iEfrCount==iEfrSize){
	    				strRetValue += "<td><input name=" +  ef.getId() + "_addORRequirementL1 type=image src='ImageStream?ImageName=plusor.gif' /></td>";
					}else{
						indent ++;
					}
					iEfrCount++;
	    		}
	    		strRetValue += "</tr>";	
	    		if(iFactCount==iFactSize){						
	    			strRetValue += "<tr>";
					strRetValue += "<td>";
					strRetValue += "<input name=addANDFactL1 type=image src='ImageStream?ImageName=plusand.gif'></input></input><input type=hidden name=ruleid value=" +  rule.getId() + "></input> or ";
					strRetValue += "<input name=addANDJHFactL1 type=image src='ImageStream?ImageName=andjh.gif'></input><input type=hidden name=ruleid value=" +  rule.getId() + "></input>";					
					strRetValue += "</td>";								
					strRetValue += "</tr>";
				}  
	    		iFactCount++;
	    	}
	    	strRetValue += "</table>";	
    		strRetValue += "</td>";	 
    		strRetValue += "</tr>";	
	    		    		
			strRetValue += "<tr><td>";//start of then table
			strRetValue += "<table>";
			strRetValue += "<tr><td><b>THEN AUTO ASSESSMENT IS </b></td>";
			strRetValue += showRuleTypeCombo(rule, false);
/*			
	    	strRetValue += "<td><select name=singleTypeRule onchange=autoPost();>";   
	    	
    		String selected = "";
	    	if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEHIGH)){
	    		selected = "selected";
	    	}	    		    	
	        strRetValue += "<option "+selected+" value="+ExpertRule.PROBABLEHIGH+">Probable High</option>";   
	        selected = "";
	        if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEMEDIUM)){
	    		selected = "selected";
	    	}	        
	    	strRetValue += "<option "+selected+" value="+ExpertRule.PROBABLEMEDIUM+">Probable Medium</option>";    
	    	selected = "";
	    	if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLELOW)){
	    		selected = "selected";
	    	}
	    	strRetValue += "<option "+selected+" value="+ExpertRule.PROBABLELOW+">Probable Low</option>"; 
	    	selected = "";
	    	if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEUNKNOWN)){
	    		selected = "selected";
	    	}
	    	strRetValue += "<option "+selected+" value="+ExpertRule.PROBABLEUNKNOWN+">Probable Unknown</option>";  
	    	selected = "";
	    	if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.POSSIBLEUNKNOWN)){
	    		selected = "selected";
	    	}
	    	strRetValue += "<option "+selected+" value="+ExpertRule.POSSIBLEUNKNOWN+">Possible Unknown</option>";  
	    		    	    	 	    	    	
	        strRetValue += "</select></td>";			    		*/
  	        strRetValue += "<td class="+rule.getOutCome()+">&nbsp;</td>";			    		
  	        strRetValue += "<td ><b>FOR AGENT </b></td><td>"+this.showCombo(ea.getId(),"ruleagent",jsm.getAgents(),false,false, false)+"</td>";			    		
  	        strRetValue += "</tr>"; 
			strRetValue += "</table>";
			strRetValue += "</td></tr>";//end of then table 
			
			//start of frequency rules row
			strRetValue += "<tr class=frequency>";
			strRetValue += "<td >";
			strRetValue += "<table cellpadding=0 cellspacing=2>";
			strRetValue += "<tr>";		
			String warning = "";
			ExpertRule erwk = rule.getFrequencyWeeksRule();	 
			String freqWksQId = "";
			if(!(erwk.getFrequencyWeeksQId().equalsIgnoreCase("0"))){
				Question q = new Question("",erwk.getFrequencyWeeksQId());
				if(q.getId().equalsIgnoreCase("")){
					warning = "<span class=warning>deleted:"+erwk.getFrequencyWeeksQId()+"</span>";
				}
				freqWksQId = q.getJsmQuestionStructureID();					
			}
			strRetValue += "<td >Frequency Wks/yr";					
			strRetValue += "</td>";
			strRetValue += "<td nowrap>";
			strRetValue += this.showComboFrequencyWksQs(freqWksQId,"freqQuestionWks_"+rule.getId(),ea.getFreqQuestions(jsm.getId()), false);
			strRetValue += warning;
			strRetValue += "</td>";
			if (ea.getFreqQuestions(jsm.getId()).size() == 0){
				strRetValue += "<td rowspan=2>";
				strRetValue += "<span style='font-size:6pt;'>None of the facts (question/answer) used in this rule have been given frequency questions. This rule will use Job History (JH) values.</span>";
				strRetValue += "</td>";
			}
			strRetValue += "</tr>";
			strRetValue += "<tr>";
			warning = "";
			ExpertRule erhr = rule.getFrequencyHoursRule();	
			String freqHrsQId = "";
			if(!(erhr.getFrequencyHoursQId().equalsIgnoreCase("0"))){
				Question q = new Question("",erhr.getFrequencyHoursQId());
				if(q.getId().equalsIgnoreCase("")){
					warning = "<span class=warning>deleted:"+erhr.getFrequencyHoursQId()+"</span>";
				}
				
				freqHrsQId = q.getJsmQuestionStructureID();					
			}
			strRetValue += "<td >Frequency Hrs/wk";
			strRetValue += "</td>";
			strRetValue += "<td nowrap >";
			strRetValue += this.showComboFrequencyHrsQs(freqHrsQId,"freqQuestionHrs_"+rule.getId(),ea.getFreqQuestions(jsm.getId()) , false);
			strRetValue += warning;
			strRetValue += "</td>";
			//strRetValue += "<td></td>";
			strRetValue += "</tr>";  
			strRetValue += "</table>";
			strRetValue += "</td>";
			strRetValue += "</tr>"; //end of frequency rules row   								
		}	
		strRetValue += "<tr><td>&nbsp;<input type=hidden name=updateRule value="+rule.getId()+" /></td></tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showRulesViewReadOnly(ExpertAgent ea,ExpertRule rule,JobSpecificModule jsm) throws Exception {		
		String strRetValue = "";
		strRetValue += "<table width=100%><tr class=windowTop><td align=center>View Rule</td><td>Close</td><td style='width:14px;text-align:right;'><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr></table>";
		strRetValue += "<table width=750px style='border: 1px solid #2484ab; background-color: #ffffff;'>";			
		strRetValue += "<tr>";
		int iRuleCount=0;     	
    	strRetValue += "<td bgcolor=#e5eff3><table ><tr class=ListHeader>";      	
		for(ExpertRule er: ea.getValidRules(rule.getOutCome(),jsm.getId())){
			String notValid = "";
			if(!(er.isValid())){
				notValid = "<img src='ImageStream?ImageName=warning.gif' alt='Needs Attention' title='This rule may be invalid' border=0 />";
			}
			iRuleCount++; 
    		String number = String.valueOf(er.getSequence());        		
    		if(er.equals(rule)){
    			strRetValue += "<td align=center class=Highlight><a href=main.jsp?ruleId="+er.getId()+ " onclick=\"return showProgress()\">"+number+" "+notValid+"</a></td>";
    		}else{
    			strRetValue += "<td align=center ><a href=main.jsp?ruleId="+er.getId()+ " onclick=\"return showProgress()\">"+number+" "+notValid+"</a></td>";
    		}  		                	
		}
		strRetValue += "</tr></table>";		
		strRetValue += "</td></tr>";	
			
		
		if(!(rule.getId().equalsIgnoreCase(""))){
			strRetValue += "<tr><td valign=top>";
			strRetValue += this.showRuleAsText(rule);
			strRetValue += "</td></tr>";
			/*
			strRetValue += "<tr><td valign=top><b>IF</b></td></tr>";		
			strRetValue += "<tr class=probability>";		
	    	strRetValue += "<td><table cellpadding=0 cellspacing=0 >";       
	    	int iFactCount = 1;
	    	int iFactSize = rule.getFacts().size();
	    	ArrayList<Question> questions = ea.getProbLevelQuestions(jsm.getId());
	    	for(ExpertFact ef: rule.getFacts()){
	    		int iEfrSize = ef.getFactRequirements().size();
	    		int iEfrCount = 1;
	    		if(iFactCount>1){
	    			strRetValue += "</td></tr><tr>";
					strRetValue += "<td style='color:orange;'>AND</td>";								
					strRetValue += "</tr>";
	    		}
				strRetValue += "</td><tr><td>";
				int indent = 0;
				for(ExpertFactRequirement efr: ef.getFactRequirements()){	    			
	    			if(iEfrCount>1){	    				
						strRetValue += " <span style='color:orange;'>OR</span> ";								
					}	    				    			
	    			if(efr.getType().equalsIgnoreCase("JH")){
	    				//show job startdate condition
	    				strRetValue = this.showJobStartdateOption(strRetValue, ef, efr);
	    			}else{
	    				//show fact details
	    				strRetValue += this.showFactRequirementReadOnly(ea, jsm, efr, indent,questions,rule);
	    			}
	    			if(iEfrCount==iEfrSize){
	    				//strRetValue += " plus ";
					}else{
						indent ++;
					}
					iEfrCount++;
	    		}
	    		//strRetValue += "</tr>";	
	    		if(iFactCount==iFactSize){						
	    			//strRetValue += "\nl";
					//strRetValue += "<td>";
					//strRetValue += " and ";
					//strRetValue += "<img src='ImageStream?ImageName=andjh.gif' />";					
					//strRetValue += "</td>";								
					//strRetValue += "</tr>";
				}  
	    		iFactCount++;
	    	}
	    	strRetValue += "</table>";	
    		strRetValue += "</td>";	 
    		strRetValue += "</tr>";	
	    	*/	    		
			strRetValue += "<tr><td>";//start of then table
			strRetValue += "<table>";
			strRetValue += "<tr><td><span style='color:blue'>THEN </span>";
			strRetValue += "<span class="+rule.getOutCome()+">"+rule.getCommonName().toUpperCase()+"</span>";		
	    	//strRetValue += showRuleTypeCombo(rule, true);			    		
  	        //strRetValue += "<span class="+rule.getOutCome()+"></span>";			    		
  	        strRetValue += " <span style='color:blue'>FOR AGENT </span>"+this.showFactText(ea.getId(),jsm.getAgents())+"</td>";			    		
  	        strRetValue += "</tr>"; 
			strRetValue += "</table>";
			strRetValue += "</td></tr>";//end of then table 
			
			//start of frequency rules row
			strRetValue += "<tr class=frequency>";
			strRetValue += "<td >";
			strRetValue += "<table cellpadding=0 cellspacing=2>";
			strRetValue += "<tr>";				
			ExpertRule erwk = rule.getFrequencyWeeksRule();	 
			String freqWksQId = "";
			if(!(erwk.getFrequencyWeeksQId().equalsIgnoreCase(""))){
				Question q = new Question("",erwk.getFrequencyWeeksQId());
				freqWksQId = q.getJsmQuestionStructureID();					
			}
			strRetValue += "<td >Frequency Wks/yr";					
			//strRetValue += "</td>";
			//strRetValue += "<td nowrap>";
			strRetValue += this.showFactText(freqWksQId,ea.getFreqQuestions(jsm.getId()));
			strRetValue += "</td>";
			if (ea.getFreqQuestions(jsm.getId()).size() == 0){
			strRetValue += "<td>";
			strRetValue += "<span style='font-size:6pt;'>None of the facts (question/answer) used in this rule have been given frequency questions. This rule will use Job History (JH) values.</span>";
			strRetValue += "</td>";
			}
			strRetValue += "</tr>";
			strRetValue += "<tr>";
			ExpertRule erhr = rule.getFrequencyHoursRule();	
			String freqHrsQId = "";
			if(!(erhr.getFrequencyHoursQId().equalsIgnoreCase(""))){
				Question q = new Question("",erhr.getFrequencyHoursQId());					
				freqHrsQId = q.getJsmQuestionStructureID();					
			}
			strRetValue += "<td >Frequency Hrs/wk";
			//strRetValue += "</td>";
			//strRetValue += "<td nowrap >";
			strRetValue += this.showFactText(freqHrsQId,ea.getFreqQuestions(jsm.getId()));
			strRetValue += "</td>";
			strRetValue += "</tr>";  
			strRetValue += "</table>";
			strRetValue += "</td>";
			strRetValue += "</tr>"; //end of frequency rules row   								
		}	
		strRetValue += "</table>";
		return strRetValue;
	}
	private String showRuleAsText(ExpertRule rule) throws Exception {
		String strRetValue = "";		
				
		String allFacts = "<table cellpadding=0 cellspacing=0>";
		int iFCount = 1;
		for(ExpertFact ef:rule.getFacts()){
			String andString = "";
			if(iFCount>1){
				andString = "<tr><td style='color:blue;'>AND</td></tr>";		
			}
			allFacts += andString;			
			int iRCount = 1;
			int iRCountSize = ef.getFactRequirements().size();
			String allRequirements = "<table cellpadding=0 cellspacing=0>";
			for(ExpertFactRequirement efr: ef.getFactRequirements()){
				String orString = "";
				String openBracket = "";
				String closeBracket = "";
				if(iRCount>1){
					orString = "<tr><td colspan=3 style='color:blue;'>OR</td></tr>";
				}else{
					openBracket = "<span style='color:blue;'>(</span>";
				}
				if(iRCount==iRCountSize){
					closeBracket = "<span style='color:blue;'>)</span>";
				}
				allRequirements += orString;
				if(efr.getType().equalsIgnoreCase("JH")){
					allRequirements += "<tr><td><table cellpadding=0 cellspacing=0><tr><td>"+openBracket+efr.getJobHistoryAttribute()+"</td><td style='color:blue;'>"+efr.getCondition().toUpperCase()+"</td><td>"+efr.getJobHistoryValue()+closeBracket+"</td></tr></table></td></tr>";
				}else{
					Question q = new Question(efr.getQuestionId());
					PossibleAnswer pa = new PossibleAnswer(efr.getAnswerId());
					allRequirements += "<tr><td>";
					allRequirements += "<table cellpadding=0 cellspacing=0><tr><td>"+openBracket+q.getName()+"</td><td style='color:blue;'>EQUALS</td><td>"+pa.getName()+closeBracket+"</td></tr></table>";
					allRequirements += "</td></tr>";
				}
				iRCount++;
			}
			allRequirements += "</table>";
			//allRequirements = "";
			
			allFacts += "<tr><td>"+allRequirements+"</td></tr>";						
			iFCount++;
		}
		allFacts += "</table>";
		
		strRetValue += "<table cellpadding=0 cellspacing=0 border=0>";
		strRetValue += "<tr><td valign=top style='color:blue;'>IF</td><td>"+allFacts+"</td></tr>";		
		strRetValue += "</table>";
		return strRetValue;
	}
	private String showRuleTypeCombo(ExpertRule rule, boolean bDisabled) {
		String ruleCombo ="";
		String disabled ="";
		if (bDisabled){disabled = "disabled";}
		ruleCombo += "<td><select "+ disabled + " name=singleTypeRule onchange=autoPost();>";   
		
		String selected = "";
		if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEHIGH)){
			selected = "selected";
		}	    		    	
		ruleCombo += "<option "+selected+" value="+ExpertRule.PROBABLEHIGH+">Probable High</option>";   
		selected = "";
		if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEMEDIUM)){
			selected = "selected";
		}	        
		ruleCombo += "<option "+selected+" value="+ExpertRule.PROBABLEMEDIUM+">Probable Medium</option>";    
		selected = "";
		if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLELOW)){
			selected = "selected";
		}
		ruleCombo += "<option "+selected+" value="+ExpertRule.PROBABLELOW+">Probable Low</option>"; 
		selected = "";
		if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEUNKNOWN)){
			selected = "selected";
		}
		ruleCombo += "<option "+selected+" value="+ExpertRule.PROBABLEUNKNOWN+">Probable Unknown</option>";  
		selected = "";
		if(rule.getLevelTypeId().equalsIgnoreCase(ExpertRule.POSSIBLEUNKNOWN)){
			selected = "selected";
		}
		ruleCombo += "<option "+selected+" value="+ExpertRule.POSSIBLEUNKNOWN+">Possible Unknown</option>";  
			    	    	 	    	    	
		ruleCombo += "</select></td>";
		return ruleCombo;
	}
	private String showJobStartdateOption(String strRetValue,ExpertFact ef, ExpertFactRequirement efr) throws Exception {
		String leadingText = "";
		if (efr.getJobHistoryAttribute().equals("yearStarted")){
			leadingText = "Job Started ";
		}
		strRetValue += "<td align=right>";
		strRetValue += "<select name=condition_"+efr.getId()+">";
		String sel = "";
		if(ef.getCondition().equalsIgnoreCase("Before")){
			sel = "selected";
		}			
		strRetValue += "<option value=Before "+sel+">"+ leadingText +"Before</option>";
		sel = "";
		if(ef.getCondition().equalsIgnoreCase("Equals")){
			sel = "selected";
		}
		strRetValue += "<option value=Equals "+sel+">"+ leadingText +"During</option>";
		sel = "";
		if(ef.getCondition().equalsIgnoreCase("After")){
			sel = "selected";
		}
		strRetValue += "<option value=After "+sel+">"+ leadingText +"After</option>";
		strRetValue += "</select>";
		strRetValue += "</td>";
		strRetValue += "<td></td><td>";
		strRetValue += "<input type=text size=5 name=jhValue_"+efr.getId()+" value='"+efr.getJobHistoryValue()+"'></input>";
		strRetValue += "</td>";
		return strRetValue;
	}	
	private String showFactRequirement(ExpertAgent ea, JobSpecificModule jsm, String strRetValue,ExpertFactRequirement efr, int indent,ArrayList<Question> questions,ExpertRule rule) throws Exception {
		strRetValue += "<td>";
		if (indent > 1){
			strRetValue += "</tr><tr></td><td></td><td></td><td></td><td></td><td>";
		}
		strRetValue += this.showCombo(efr.getQuestionId(),"frQuestion_"+efr.getId(),questions,true,false,false);
		strRetValue += "</td>";
		strRetValue += "<td>=</td>";	
		Question lq = new Question ();
		for(Question q: questions){
			if(q.getId().equalsIgnoreCase(efr.getQuestionId())){
				lq = q;
				break;
			}
		}
		String isValid = "";
		String invalidFact = "";

		if(!(efr.isValid(jsm))){
			PossibleAnswer pa = new PossibleAnswer(efr.getAnswerId());
			Question q = new Question(efr.getQuestionId());
			invalidFact = "title=\""+q.getName()+":"+pa.getName()+"\"";			
			isValid = "<a href=ControllerServlet?Action=true&removeFact="+efr.getFactId()+"&removeFromRuleId="+rule.getId()+ " onclick=\"return showProgress()\"><img src='ImageStream?ImageName=deletex.gif' alt='delete' title='Click to remove' border=0/></a>";
		}
		strRetValue += "<td "+invalidFact+">";
		strRetValue += this.showCombo(efr.getAnswerId(),"frAnswer_"+efr.getId(),lq.getPossibleAnswers(),false,false, false);			
		strRetValue += isValid;		
		strRetValue += "</td>";	
		return strRetValue;
	}
	/*
	private String showFactRequirementReadOnly(ExpertAgent ea, JobSpecificModule jsm,ExpertFactRequirement efr, int indent,ArrayList<Question> questions,ExpertRule rule) throws Exception {
		String retString = "";
		String factText = "";
		//retString += "<td>";
		if (indent > 1){
			retString += "<span style='width:20px;'</span>";
		}

		//Show question text
		factText += this.showFactText(efr.getQuestionId(),questions);
		factText += " <span style='color:blue;'>EQUALS</span> ";
		
		Question lq = new Question ();
		for(Question q: questions){
			if(q.getId().equalsIgnoreCase(efr.getQuestionId())){
				lq = q;
				break;
			}
		}

		factText += this.showFactText(efr.getAnswerId(),lq.getPossibleAnswers());
		
		retString += factText;	
		//retString += "</td>";	
		return retString;
	}
	*/
	@SuppressWarnings("rawtypes")
	public String showFactText(String selId, ArrayList array) throws Exception {
		String factText = "";
		for (Object item : array){
			if (item instanceof Question){
				Question q = (Question)item;
				//If it is a weekly frequency question
				if(q.getName().contains("weeks") && q.getJsmQuestionStructureID().equalsIgnoreCase(selId)){
					if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
						Question pq = new Question("",q.getParentQuestionID());	
						PossibleAnswer pa = new PossibleAnswer("",q.getParentID());
						factText = " - " + pq.getName()+"="+pa.getName()+"_Weeks";	
					}
//					If it is an hourly frequency question
				}else if(q.getName().contains("hours") && q.getJsmQuestionStructureID().equalsIgnoreCase(selId)){
					if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
	    				Question pq = new Question("",q.getParentQuestionID());
	    				Question ppq = new Question("",pq.getParentQuestionID());
	    				PossibleAnswer pa = new PossibleAnswer("",pq.getParentID());
	    				factText = " - " + ppq.getName()+"="+pa.getName()+"_Hours";
					}
				}else{   
					if (selId.equals(q.getId())) {
						factText += q.getName();
					}
				}
			}else if (item instanceof PossibleAnswer){
				PossibleAnswer p = (PossibleAnswer)item;
				if (selId.equals(p.getId())) {
					factText += p.getName();
				}
			}else{
				Agent a = (Agent)item;
				if (selId.equals(a.getId())) {
					factText += a.getName();
				}
			}
		}

		return factText;
	}
	
	private String showComboFrequencyWksQs(String freqWksQId, String name, ArrayList<Question> freqQuestions, boolean bDisabled) throws Exception {
		String disabled = "";
		if (bDisabled){disabled = "disabled";}
		String strRetValue = "<table cellpadding=1 cellspacing=0>";
        strRetValue += "<tr><td><select " + disabled + " style='width:600px;' name=" + name + " >";
        boolean found = false;
        for (Question q: freqQuestions) {    
        	String strName = "";
        	if(q.getName().contains("weeks")){
        		if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
    				Question pq = new Question("",q.getParentQuestionID());	
    				PossibleAnswer pa = new PossibleAnswer("",q.getParentID());
    				strName = pq.getName()+"="+pa.getName()+"_Weeks";	
    				
    			}
                if (q.getJsmQuestionStructureID().equalsIgnoreCase(freqWksQId)) {
                    strRetValue += "<option selected title='" + strName + "' value=" + q.getJsmQuestionStructureID() + ">" + strName + "</option>";
                    found = true;
                } else {
                    strRetValue += "<option title='" + strName + "' value=" + q.getJsmQuestionStructureID() + ">" + strName + "</option>";
                }
        	}    
        }
        if(!found){
        	strRetValue += "<option selected value=JH>JH</option>";
        }else{
        	strRetValue += "<option value=JH>JH</option>";
        }
        strRetValue += "</select></td></tr></table>";
        return strRetValue;
	}
	private String showComboFrequencyHrsQs(String freqWksQId, String name, ArrayList<Question> freqQuestions, boolean bDisabled) throws Exception {
		String disabled = "";
		if (bDisabled) {disabled = "disabled";}
		String strRetValue = "<table cellpadding=1 cellspacing=0>";
        strRetValue += "<tr><td><select " + disabled + " style='width:600px;' name=" + name + " >";
        boolean found = false;
        for (Question q: freqQuestions) {    
        	String strName = "";
        	if(q.getName().contains("hours")){
        		if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
    				Question pq = new Question("",q.getParentQuestionID());
    				Question ppq = new Question("",pq.getParentQuestionID());
    				PossibleAnswer pa = new PossibleAnswer("",pq.getParentID());
    				strName = ppq.getName()+"="+pa.getName()+"_Hours";				
    			}
                if (q.getJsmQuestionStructureID().equalsIgnoreCase(freqWksQId)) {
                    strRetValue += "<option selected title='" + strName + "' value=" + q.getJsmQuestionStructureID() + ">" + strName + "</option>";
                    found = true;
                } else {
                    strRetValue += "<option title='" + strName + "' value=" + q.getJsmQuestionStructureID() + ">" + strName + "</option>";
                }
        	}  
        }
        if(!found){
        	strRetValue += "<option selected value=JH>JH</option>";
        }else{
        	strRetValue += "<option value=JH>JH</option>";
        }
        strRetValue += "</select></td></tr></table>";
        return strRetValue;
	}
	public String showAllAgentGroups(String strAgentId, ArrayList<AgentGroup> agentGroups) {
		String strRetValue = "<table class=LHSMenuContent>";
		for (Agent agent : agentGroups) {
			String strClass = "";
			if (agent.getId().equalsIgnoreCase(strAgentId)) {
            	strClass = " class=\"Highlight\"";
            } else {
            	strClass = " class=\"jsms\"";
            }
			strRetValue += "<tr><td colspan=2 "+strClass+" title='" + agent.getName() + "'><a href=main.jsp?agentID=" + agent.getId() + " onclick=\"return showProgress()\">" + this.truncateName(agent.getName(),AGENTLENGTH)
					+ "</a></td></tr>";
		}
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showImport() {
		String strRetValue = "<table class=EditView cellpadding=0 cellspacing=0>";		
		strRetValue += "<tr class=windowTop><td align=center>Import JSM from xml format</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";						
		strRetValue += "<tr>";
		strRetValue += "<td align=center>";
		strRetValue += "<table>";
		strRetValue += "<tr><td >Browse for JSM in xml format.</td></tr>";
		strRetValue += "<tr><td><input type=file name=jsmFileName></input></td></tr>";
		strRetValue += "</table>";
		strRetValue += "</td>";			
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}	
	public String showEditAgents(String questionIds)throws Exception {
		String retVal = "";				
		if(questionIds != null) {
			 String ids[] = questionIds.split(",");
			 if(ids.length>0){	
	            AgentGroup ag = new AgentGroup();
				retVal += "<table class=EditView cellpadding=0 cellspacing=0>";			            
				retVal += "<tr class=windowTop><td align=center>Associate Agents to Questions</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";								            
				retVal += "<tr><td><table>";			            
				if(ids.length>1){
	                for(String id: ids){
	    				Question q = new Question("",id);		        		        
	    				retVal += "<tr><td align=center class=questions>"+q.getDescription() +"</td></tr>"; 					
	    				retVal += "<tr><td align=center class=agents>"+this.showList(q.getAgents())+"</td></tr>"; 					 
	 	   		    }
	                retVal += "<tr><td >"+this.showAgentGroups(ag.getAgentGroups())+"</td></tr>";	            
	            }else{
	                for(String id: ids){
	    				Question q = new Question("",id);		        		        
	    				retVal += "<tr><td align=center class=questions>"+q.getDescription() +"</td></tr>"; 					
	    				retVal += "<tr><td align=center class=agents>"+this.showList(q.getAgents())+"</td></tr>"; 					
	    				retVal += "<tr><td >"+this.showAgentGroups(ag.getAgentGroups(),q.getAgents())+"</td></tr>";	            
	    		    } 
	            }			
	            retVal +="</table></tr></table>";	
			}
		}      		      				
		return retVal;
	}	
/*	public String showEditJobs(ArrayList<JobTitle> jobs, String jsmId) throws Exception{		
		String retVal = "";		
		try { 	
			 MasterQuestionList mql = new MasterQuestionList();
			 if(jobs != null){	 
				 if(jobs.size()>0){	
					 String strHeader = "Selected Jobs to Update";
					String strHTML = "";
					int iCount = 0;
			 	    for(Iterator<JobTitle> it = jobs.iterator();it.hasNext();){	
						JobTitle job = (JobTitle)it.next();			
						if(jobs.size() == 1){
							if(job.getName().equalsIgnoreCase("New Job")){
								strHeader = "Add a new job";
								job.setJsmId(jsmId);
							}		
						}
						strHTML += mql.showJobTitleDetails(job);
						if(iCount==0){
							strHTML += "<hr /><script language=javascript type='text/javascript'>setFocus('jobTitle_"
								+ job.getId()
								+ "');</script>";
						}
						iCount++;
			 	    }			 	    
			 	    retVal += "<table class=jobs cellpadding=0 cellspacing=0>";	
					retVal += "<tr class=windowTop><td align=center>"+strHeader+"</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12/></td></tr>";								            
			 	    retVal += "<tr><td>";	
			 	    retVal += strHTML;		
			 	    retVal += "</td></tr>";
			 	    retVal += "<tr><td><input type=hidden name=Action value=\"0\"></input></td><td></td></tr>";
			 	    retVal += "</table>";
				 }
		 	 }	
		 } catch (Throwable ex) {			 
		     //To Do deal with exception(ex.getMessage());
		 }		
		return retVal;
	}*/
	public String showNavTitle(ArrayList<Object> arrayL) {
        String strNavTitle = "<table class=NavTitle cellspacing=0><tr><td style='width:90%;text-align:left;'>";
        String strClassName = "";
        String navPath = "";
        String wikiPage = "";
        int pos = 0;
        int count = 1;
        
        for(Object obj: arrayL) {
        	if(obj!=null){
        		if (obj instanceof String) {
        			String strLocation =(String)obj;
        			navPath += strLocation + "_";
    				if(strLocation.equalsIgnoreCase("Job Specific Modules")){
    					strNavTitle += "<a href=main.jsp?Location=JSMs onclick=\"return showProgress()\">"+strLocation+":</a>>";  
    				}else if(strLocation.contains("JSMs")){
    					strNavTitle += strLocation+">";
    				}else if(strLocation.contains("</span>")){
    					strNavTitle += strLocation+">";
    				}else if(strLocation.contains("Questionnaire")||strLocation.contains("Studies")||strLocation.contains("Assessment")||strLocation.contains("OccIDEASHome")){
//      					do nothing
  					}else if(strLocation.toLowerCase().contains("misc")){
  						strNavTitle += "<a href=main.jsp?Location=Misc onclick=\"return showProgress()\">"+strLocation+":</a>>";
  					}else if(strLocation.toLowerCase().contains("study specific")){
  						strNavTitle += "<a href=main.jsp?Location=StudyJSMs onclick=\"return showProgress()\">"+strLocation+":</a>>";   
  					}else if(strLocation.toLowerCase().contains("database")){
  						strNavTitle += "<a href=main.jsp?Location=SanityCheck onclick=\"return showProgress()\">"+strLocation+":</a>>";   
    				}else{
    					strNavTitle += "<a href=main.jsp?Location="+strLocation+ " onclick=\"return showProgress()\">"+strLocation+":</a>>";  
    				}   	            	      		
        		}else if (obj instanceof DBBaseObject){
        			DBBaseObject dbobj = (DBBaseObject)obj;
        			strClassName = dbobj.getClass().toString().replace(" ",".");
        			pos = dbobj.getClass().toString().lastIndexOf(".")+1;
        			strClassName = dbobj.getClass().toString().substring(pos);
        			if(strClassName.equalsIgnoreCase("JobSpecificModule")){
        				strClassName = "JSM";
        			}else if(strClassName.equalsIgnoreCase("ExpertAgent")){
        				strClassName = "Agent";
        			}else if(strClassName.equalsIgnoreCase("ExpertRule")){
        				strClassName = "Rule";
        			}
        			if (count == arrayL.size()) {
        				strNavTitle += strClassName+":" +  this.truncateName(dbobj.getName(), 30) + ">";
        			}else{
        				strNavTitle += "<a href=main.jsp?"+strClassName.toLowerCase()+"ID="+dbobj.getId()+ " onclick=\"return showProgress()\">" +strClassName+":</a>" + dbobj.getName() + ">";        		
        			}	        	
        		}
        	}       	
        	++count;
        } 
        wikiPage = Util.getWikiPage(navPath);

        strNavTitle += "</td><td style='width:10%;text-align:right;' title='OccIDEAS Wiki Help'>" +
        "<a href='http://wiki.occideas.org/JSPWiki/Wiki.jsp";
        if (!wikiPage.equals("")) {
        	strNavTitle += "?page=" + wikiPage;
        }
        strNavTitle += "' target='_blank'>Help</a>" +
        "</td></tr></table>";
        return strNavTitle;
    }
	public String showLinkAJSM(PossibleAnswer pa,String userID,String jsmId) throws Exception {
		String strRetValue = "<table class=EditView cellpadding=0 cellspacing=0>";		
		strRetValue += "<tr class=windowTop><td align=center>Manage A-JSMs</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12/></td></tr>";						
		strRetValue += "<tr>";
		strRetValue += "<td align=center>";
		strRetValue += "<table >";
		strRetValue += "<tr>";
		if(pa.getId().equalsIgnoreCase("")){
			strRetValue += "<td >At End of JSM</td><td>";			
		}else{
			Question q = new Question("",pa.getJsmQuestionStructureID());
			strRetValue += "<td class=questions>"+q.getDescription()+"</td><td class=possibleanswers>"+pa.getName()+"</td>";			
		}	
		strRetValue += "</tr>";	
		strRetValue += "<tr><td></td>";	
		strRetValue += "<td>";	
		strRetValue += this.showEditAJSM(pa,userID,jsmId);
		strRetValue += "</td>";	
		strRetValue += "</tr>";
		strRetValue += "</table>";
		strRetValue += "</td>";			
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showUserJSMs(String jsmIds, String strSearch, ArrayList<User> searchedUsers) throws Exception {
		String retVal = "";
		JobSpecificModule jsm = null;
		String ids[] = jsmIds.split(",");
		if (ids.length > 0) {
			retVal += "<table class=EditView cellpadding=0 cellspacing=0>";
			retVal += "<tr class=windowTop><td align=center>Shared JSMs</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";
			retVal += "<tr><td colspan=2><table class=ContentUserList>";
			if (ids.length > 1) {
				for (String id : ids) {
					jsm = new JobSpecificModule(id);
					retVal += "<tr><td align=center >JSMs: "
							+ jsm.getName() + "</td></tr>";
					retVal += "<tr><td align=center >Current Users: "
							+ this.showList(jsm.getSharedUsers())
							+ "</td></tr>";
				}

				retVal += "<tr><td></td><td class=small>"
						+ this.showUserJSMsSelect(jsm.getSharedUsers()) + "</td></tr>";//user.getAllUsers(),

				retVal += "<tr class=SearchboxRow><td align=center>";
				retVal += this.showSearchBoxUsers(strSearch);
		        retVal += "</td></tr>";
				retVal += "<tr class=SearchboxRow><td width=100% align=center>";
				
				if (searchedUsers != null) {
					retVal += this.showSearchedUsersBox(searchedUsers);
				}
			} else {
				
				for (String id : ids) {
					jsm = new JobSpecificModule(id);
					retVal += "<tr><td align=center class=questions>JSMs: "
							+ jsm.getName() + "</td></tr>";
					retVal += "<tr><td align=center class=agents>Current Users: "
							+ this.showList(jsm.getSharedUsers())
							+ "</td></tr>";
				}
				//User user = new User();
				retVal += "<tr><td class=small>"
						+ this.showUserJSMsSelect(jsm.getSharedUsers()) + "</td></tr>";//user.getAllUsers(),
				
				retVal += "<tr class=SearchboxRow><td align=center>";
				retVal += this.showSearchBoxUsers(strSearch);
				retVal += "<tr class=SearchboxRow><td width=100% align=center>";
				
				if (searchedUsers != null) {
					//ArrayList searchedUsers = (ArrayList)request.getSession().getAttribute("searchedusers");
					retVal += this.showSearchedUsersBox(searchedUsers);
				}
			}
			retVal += "</table></tr></table>";
		}
		return retVal;
	}
	public String showExport(ArrayList<JobSpecificModule> jsmArray) {
		String strRetValue = "<table class=EditView cellpadding=0 cellspacing=0>";		
		strRetValue += "<tr class=windowTop><td align=center colspan=2>Export the following JSMs</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";						
		strRetValue += "<tr class=ListHeader>";
		strRetValue += "<td align=center colspan=2>";
		for(JobSpecificModule jsm:jsmArray){
			strRetValue += "<div>"+jsm.getName()+" <input type=hidden name=JSM_"+jsm.getId()+" value=true></input></div>";
		}
		strRetValue += "</td>";			
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td align=right >";
		strRetValue += "<input type=radio name=exportType value=exportToText />";		
		strRetValue += "</td>";			
		strRetValue += "<td >";
		strRetValue += "Export to text file";		
		strRetValue += "</td>";			
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<tr>";
		strRetValue += "<td align=right >";
		strRetValue += "<input type=radio checked name=exportType value=exportToXML />";		
		strRetValue += "</td>";			
		strRetValue += "<td >";
		strRetValue += "Export to XML file";		
		strRetValue += "</td>";			
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td align=right >";
		strRetValue += "<input type=radio name=exportType value=exportToDB />";		
		strRetValue += "</td>";			
		strRetValue += "<td>";
		strRetValue += "Export to Database";		
		strRetValue += "</td>";			
		strRetValue += "</tr>";
    	strRetValue += "\n<tr>";
        strRetValue += "<td align=right >Connection String:</td>";
 //   	strRetValue += "\n<td><input type=text size=50 name=constring value='jdbc:mysql://localhost/ritostudymanagercom' />";
    	strRetValue += "\n<td><input type=text size=50 name=constring />";
    	strRetValue += "\n</tr>";     
        strRetValue += "<tr>";
        strRetValue += "<td align=right >Username:</td>";
        strRetValue += "<td><input type=text name=username ></input></td>";
        strRetValue += "</tr>";  
        strRetValue += "<tr>";
        strRetValue += "<td align=right>Password:</td>";
        strRetValue += "<td><input type=password name=password ></input></td>";
        strRetValue += "</tr>";                         
        strRetValue += "<tr>";
        strRetValue += "<td ></td>";
        strRetValue += "<td><input type=hidden name=Export value=true></input></td>";
        strRetValue += "</tr>";                         
        strRetValue += "</table>";
		return strRetValue;
	}
	public String showValidationReport(JobSpecificModule jsm) throws Exception {
		String strRetValue = "\n";		
		strRetValue += "<table class=ContentList >";       
		strRetValue += "<tr class=ListHeader><td colspan=4>Validation Report</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";   
		strRetValue += "<tr class=ListHeader><td >Status</td><td >Agent</td><td >Rule</td><td >JSM</td><td style=\"text-align: right;\"></td></tr>";   
		for(Agent agent: jsm.getAgents()){
			ExpertAgent ea = new ExpertAgent(agent.getId());
			ArrayList<ExpertRule> rules = ea.getJSMRules(jsm.getId());
			//ArrayList<ExpertRule> rules = jsm.getRules(agent);
			if(rules.size()>0){
				for(ExpertRule er: rules){
					String jsmName = "";
					if(!(er.getJsmId().equalsIgnoreCase(""))){
						JobSpecificModule jsm1 = new JobSpecificModule(er.getJsmId());
						jsmName = jsm1.getName();
					}
					if(er.getJsmId().equalsIgnoreCase(jsm.getId())){
						if(!(er.isValid())){	
							strRetValue += "<tr><td class=warning><a href=main.jsp?agentID="+agent.getId()+"&outcome="+er.getOutCome()+"&ruleId="+er.getId()+">Invalid</a></td><td class=warning>"+agent.getName()+"</td><td class=warning>"+er.getFullDescription()+"</td><td class=warning>"+jsmName+"</td></tr>";
						}else{
							strRetValue += "<tr><td></td><td class="+er.getOutCome()+">"+agent.getName()+"</td><td>"+this.showRuleAsText(er)+"</td><td >"+jsmName+"</td></tr>";
						}
					}
				}
			}else{
				strRetValue += "<tr><td class=warning>No Rules</td><td class=warning>"+agent.getName()+"</td><td class=warning></td></tr>";
			}
			
		}
		strRetValue += "</table>";       
		return strRetValue;
	}
	public String showRulesReportExcel(JobSpecificModule jsm) throws Exception {
		String retValue = "";
		retValue += "Questions,";
		ArrayList<Agent> agents = jsm.getAgents();
		for(Agent agent:agents){
			retValue += agent.getName()+",";
		}
		ArrayList<Question> questions = jsm.getQuestionList();
		for(Question question: questions){
			if(question.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				continue;
			}
			retValue += "\n";
			String sequenceNumber = question.getSequenceFull();
			retValue += sequenceNumber+" "+question.getDescription().replace(",","");
			for(Agent agent: agents){
				retValue += ","+String.valueOf(question.hasAgent(agent.getId())).toUpperCase().substring(0,1);
			}
			for(PossibleAnswer pa: question.getPossibleAnswers()){
				retValue += "\n";
				retValue += " ~"+pa.getDescription().replace(",","");
				for(Agent agent: agents){
					retValue += ",";
					ExpertAgent ea = new ExpertAgent(agent.getId());
					for(ExpertRule er: ea.getRulesWithQuestionAndPossibleAnswer(question,pa)){
            			String typeId = er.getOutCome().toString();
            			if(typeId.equalsIgnoreCase(ExpertRule.RuleOutcome.PROBABLEHIGH.toString())){
            				retValue +="H"+er.getSequence();
            			}else if(typeId.equalsIgnoreCase(ExpertRule.RuleOutcome.PROBABLEMEDIUM.toString())){
            				retValue +="M"+er.getSequence();
            			}else if(typeId.equalsIgnoreCase(ExpertRule.RuleOutcome.PROBABLELOW.toString())){
            				retValue +="L"+er.getSequence();
            			}else if(typeId.equalsIgnoreCase(ExpertRule.RuleOutcome.PROBABLEUNKNOWN.toString())){
            				retValue +="Y"+er.getSequence();
            			}else if(typeId.equalsIgnoreCase(ExpertRule.RuleOutcome.POSSIBLEUNKNOWN.toString())){
            				retValue +="P"+er.getSequence();
            			}
            			
            		}
				}
			}
			
		}
		retValue += "\n";		
		return retValue;
	}
	public String showAgentGroupsView(ArrayList<AgentGroup> agentGroups, String strSearch) throws Exception {
		List<Agent> agents = new ArrayList<Agent>();
		String retValue = "<table class=EditView cellpadding=0 cellspacing=0>";	
		retValue += "<tr>";
		retValue += "<td>";
		retValue += this.showAgentGroups(agentGroups,agents);	
		retValue += "</td>";
		retValue += "</tr>";
		retValue += "</table>";
		return retValue;
	}
	public String showKeyPhrases(JobSpecificModule jsm, String strSearch, String selId) throws Exception {
		String strRetValue = "\n";		
		strRetValue += "<table class=ContentList >";       
		strRetValue += "<tr class=ListHeader><td colspan=7>Key Phrases Report</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";   
		strRetValue += "<tr class=ListHeader><td ></td><td >id</td><td >sid</td><td >Name</td><td >JSMID</td><td >JSM</td><td >Rules</td></tr>";   
		Question questionShell = new Question();
		for(Question question: questionShell.getQuestionListSearch(jsm, strSearch)){
			strRetValue += "<tr >"; 
			strRetValue += "<td><input type=checkbox name=questionsCheckBox_"+ question.getJsmQuestionStructureID()+ "></input></td>";
			strRetValue += "<td><a href=main.jsp?questionID="+question.getId()+">"+question.getId()+"</a></td>";
			strRetValue += "<td>"+question.getJsmQuestionStructureID()+"</td>";
			strRetValue += "<td title='"+question.getDescription()+"'>"+question.getName()+"</td>";
			strRetValue += "<td>"+question.getJsmID()+"</td>";
			if(!(question.getJsmID().equalsIgnoreCase(""))){
				JobSpecificModule qjsm = new JobSpecificModule(question.getJsmID());
				strRetValue += "<td>"+qjsm.getName()+"</td>";
			}	
			if(question.getId().equalsIgnoreCase(selId)){
				ArrayList<Agent> agents = question.getAgents();
				//strRetValue += "<td>"+this.showList(agents)+"</td>";
				strRetValue += "<td>";
				for(Agent agent : agents){
					ExpertAgent ea = new ExpertAgent(agent.getId());
					for(ExpertRule er: ea.getRulesWithQuestion(question)){
						strRetValue += er.getId()+":"+er.getOutCome().toString()+":"+agent.getName()+"<br/>";
					}					
				}
				strRetValue += "</td>";
			}			
			strRetValue += "</tr>"; 			
		}		  
		strRetValue += "</table>";       
		return strRetValue;
	}
	public String showDemoIntro() {
		String strRetValue = "\n";		
		strRetValue += "<table class=ContentList >";       
		strRetValue += "<tr class=ListHeader><td >Welcome to our demonstration of OccIDEAS</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";
		String demoMessage = "";
		demoMessage += "<br>You have entered the system in Demo Mode.";
		demoMessage += "<br>";
		demoMessage += "<br>If you would like to take a tour through the many aspects of OccIDEAS, <b><a target=_new href=http://wiki.occideas.org/JSPWiki/Wiki.jsp?page=Demo_Script>click here for a script</a></b> which you can follow.";
		demoMessage += "<br>";
		demoMessage += "<br>Alternatively, to explore the functions of OccIDEAS, click on each of the blue tabs at the top in turn.  ";
		demoMessage += "For each of the blue tabs, you can then click on the yellow tabs that you want to look at.  ";
		demoMessage += "You can click on the left hand side menu for more options within each yellowtab.";
		demoMessage += "<br>";
		demoMessage += "<br>Most of the action buttons at the bottom of the screen are greyed out, but you can experiment with those which are available.";
		demoMessage += "<br>";
		demoMessage += "<br>Please feel free to try out OccIDEAS as much as you like.  <b><a href=main.jsp?Location=JSMs>Click here to get started</a></b>.";
		demoMessage += "<br>";
		demoMessage += "<br>";
		demoMessage += "<br>Examples of scenarios where you might like to use OccIDEAS can be found by clicking";
		demoMessage += "<br><b><a href=http://wiki.occideas.org/JSPWiki/Wiki.jsp?page=Case_Control>Case control studies</a></b>";
		demoMessage += "<br><b><a href=http://wiki.occideas.org/JSPWiki/Wiki.jsp?page=Cohort>Cohort studies</a></b>";
		demoMessage += "<br>";
		demoMessage += "<br>";
		demoMessage += "<br>This demonstration website has been established to show you the functions of OccIDEAS. The contents of the website are not the complete scope of what is available within OccIDEAS and may have been changed by other users so should not be considered to be definitive, nor used in any scientific study.";
		demoMessage += "<br>The demo database gets reset every 30 minutes of every hour of every day on the hour and half hour.";
		demoMessage += "<br>";
		demoMessage += "<br>";
		demoMessage += "<br>For more information on OccIDEAS contact <a href=mailto:troy.sadkowsky@researchit.com.au>Troy Sadkowsky</a> or <a href=mailto:fritschi@waimr.uwa.edu.au>Lin Fritschi</a>";
		demoMessage += "<br>";
		demoMessage += "<br>";
		demoMessage += "<br>";
		demoMessage += "<br>";
		demoMessage += "<br>";
		demoMessage += "<br>";
		demoMessage += "<br>";
		strRetValue += "<tr><td><table><tr><td>"+demoMessage+"</td></tr></table><td></tr>";
		strRetValue += "</table>";       
		return strRetValue;
	}	
}
