/**
 * Version:
 *     $Id: InterviewManagementSystem.java,v 1.199 2009/05/27 02:00:44 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: InterviewManagementSystem.java,v $
 *     Revision 1.199  2009/05/27 02:00:44  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.198  2009/03/17 01:03:55  ray.welburn
 *     studymgr reports
 *
 *     Revision 1.197  2009/03/09 06:57:20  troy.sadkowsky
 *     bug fixes from demo testing
 *
 *     Revision 1.196  2009/02/23 06:00:37  troy.sadkowsky
 *     update reports
 *
 *     Revision 1.195  2009/02/19 03:37:36  troy.sadkowsky
 *     archive report functions
 *
 *     Revision 1.194  2009/02/04 22:45:48  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.193  2009/02/01 12:27:02  ray.welburn
 *     email now saved to residential address
 *
 *     Revision 1.192  2009/01/21 08:45:34  troy.sadkowsky
 *     bug fix for review link
 *
 *     Revision 1.191  2009/01/07 07:04:34  troy.sadkowsky
 *     fix for close edit window
 *
 *     Revision 1.190  2009/01/07 05:51:08  troy.sadkowsky
 *     more v2 updates
 *
 *     Revision 1.189  2009/01/06 07:40:51  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.188  2009/01/05 06:54:23  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.187  2008/12/23 10:32:24  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.186  2008/12/22 04:06:21  troy.sadkowsky
 *     various updates
 *
 *     Revision 1.185  2008/12/20 02:07:08  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.184  2008/12/17 03:57:26  ray.welburn
 *     New title bars and coles buttons added
 *
 *     Revision 1.183  2008/12/14 22:38:07  troy.sadkowsky
 *     fix highligh bug
 *
 *     Revision 1.182  2008/12/13 04:43:43  ray.welburn
 *     add alert when study name is duplicate
 *
 *     Revision 1.181  2008/12/10 09:05:07  Randal.Anderson
 *     Removed decimal precision on age in participants that is output because of the float value.
 *
 *     Revision 1.180  2008/12/10 03:46:42  ray.welburn
 *     Add formatting to dob date and more validation and update halt on interview
 *
 *     Revision 1.179  2008/12/07 05:18:44  ray.welburn
 *     Change to use only one showcombobox method
 *
 *     Revision 1.178  2008/11/25 23:29:44  troy.sadkowsky
 *     minor layout updates
 *
 *     Revision 1.177  2008/11/24 06:34:15  ray.welburn
 *     Change style on edit interview question
 *
 *     Revision 1.176  2008/11/21 06:11:09  ray.welburn
 *     updates to interview
 *
 *     Revision 1.175  2008/11/19 02:19:52  ray.welburn
 *     Show study description in lhs menu
 *
 *     Revision 1.174  2008/11/14 09:14:39  troy.sadkowsky
 *     usability updates
 *
 *     Revision 1.173  2008/11/06 02:23:15  ray.welburn
 *     Add comment when no users found
 *
 *     Revision 1.172  2008/11/05 06:15:45  ray.welburn
 *     Study acronym now study name
 *
 *     Revision 1.171  2008/11/05 05:32:24  ray.welburn
 *     Add Job moved to action button and errors to text boxes
 *
 *     Revision 1.170  2008/11/04 06:42:59  ray.welburn
 *     End/start nots showing incorrectly
 *
 *     Revision 1.169  2008/10/30 10:32:17  ray.welburn
 *     Change to allow multiple study statuses
 *
 *     Revision 1.168  2008/09/21 06:50:56  ray.welburn
 *     Changes to text
 *
 *     Revision 1.167  2008/09/20 08:59:30  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.166  2008/09/12 02:40:17  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.165  2008/09/11 04:12:50  ray.welburn
 *     study headline
 *
 *     Revision 1.164  2008/09/03 05:01:43  ray.welburn
 *     Add PT statuses
 *
 *     Revision 1.163  2008/08/25 01:37:24  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.162  2008/08/20 03:36:34  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.161  2008/08/13 04:31:13  troy.sadkowsky
 *     added other studies header in lhsm
 *
 *     Revision 1.160  2008/08/11 01:50:07  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.159  2008/08/11 00:46:19  troy.sadkowsky
 *     rule conversion from ajsms
 *
 *     Revision 1.158  2008/07/31 01:56:55  ray.welburn
 *     MainDB removed
 *
 *     Revision 1.157  2008/07/31 00:43:56  ray.welburn
 *     Fix navbar for StudyMgr
 *
 *     Revision 1.156  2008/07/28 04:08:58  ray.welburn
 *     Showing Study Module options now conditional on source
 *
 *     Revision 1.155  2008/07/23 00:16:07  troy.sadkowsky
 *     new updates
 *
 *     Revision 1.154  2008/07/22 06:55:07  ray.welburn
 *     integration changes for new interface
 *
 *     Revision 1.153  2008/07/18 06:06:02  troy.sadkowsky
 *     new flat frozen jsm
 *
 *     Revision 1.152  2008/06/04 00:56:54  ray.welburn
 *     Admin breadcrumbs set to correct path
 *
 *     Revision 1.151  2008/06/01 09:37:00  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.150  2008/05/30 01:19:30  ray.welburn
 *     Add date stamp to participant changes
 *
 *     Revision 1.149  2008/05/26 08:23:31  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.148  2008/05/25 23:48:07  ray.welburn
 *     Add paging and user search for studies user management
 *
 *     Revision 1.147  2008/05/18 12:16:19  troy.sadkowsky
 *     condensed publishing page and study details page
 *
 *     Revision 1.146  2008/04/22 10:28:29  ray.welburn
 *     Start and end notes moved to studynotes as well
 *
 *     Revision 1.145  2008/04/15 22:58:10  troy.sadkowsky
 *     melb updates
 *
 *     Revision 1.144  2008/04/11 00:17:57  ray.welburn
 *     Add comment to JSM in study interview if jsm not frozen
 *
 *     Revision 1.143  2008/04/09 00:59:15  ray.welburn
 *     Make title edit buttons consistant
 *
 *     Revision 1.142  2008/04/08 23:44:38  ray.welburn
 *     Edit button on editpublished study implemented
 *
 *     Revision 1.141  2008/04/08 23:26:32  ray.welburn
 *     description field can now be seen
 *
 *     Revision 1.140  2008/04/08 22:28:09  ray.welburn
 *     warning when invalid answers or skipped questions
 *
 *     Revision 1.139  2008/03/27 23:03:17  ray.welburn
 *     Remove onclick from wiki button
 *
 *     Revision 1.138  2008/03/26 12:36:31  troy.sadkowsky
 *     fix nav bar
 *
 *     Revision 1.137  2008/03/22 04:44:23  ray.welburn
 *     images from database applied to alll images
 *
 *     Revision 1.136  2008/03/21 03:55:43  ray.welburn
 *     complete edit page for published study projects
 *
 *     Revision 1.135  2008/03/18 10:46:00  ray.welburn
 *     Add ability to view and create studies project info for home page
 *
 *     Revision 1.134  2008/03/18 06:12:35  troy.sadkowsky
 *     quick fix to make room for action buttons
 *
 *     Revision 1.133  2008/03/18 01:28:50  ray.welburn
 *     wiki.gif added to page and study projects option added
 *
 *     Revision 1.132  2008/03/17 03:32:15  Troy.Sadkowsky
 *     put showParticipantJSMSurvey back
 *
 *     Revision 1.131  2008/03/16 22:00:49  Troy.Sadkowsky
 *     put showParticipantJSMSurvey back
 *
 *     Revision 1.130  2008/03/13 07:26:03  ray.welburn
 *     change help icon to wiki
 *
 *     Revision 1.129  2008/03/13 06:08:41  ray.welburn
 *     Images from database now used
 *
 *     Revision 1.128  2008/03/13 05:33:49  ray.welburn
 *     Unused methods commented out
 *
 *     Revision 1.127  2008/03/12 07:44:01  troy.sadkowsky
 *     ability to remove frozen JSMs
 *
 *     Revision 1.126  2008/03/11 06:44:39  troy.sadkowsky
 *     update to stop url appearing in nav bar
 *
 *     Revision 1.125  2008/03/05 07:47:32  troy.sadkowsky
 *     replaced - with _ to be consistent with wiki naming convention
 *
 *     Revision 1.124  2008/03/01 07:35:23  ray.welburn
 *     Modify how help navigaes to wiki
 *
 *     Revision 1.123  2008/02/25 04:21:59  troy.sadkowsky
 *     new export function
 *
 *     Revision 1.122  2008/02/15 04:00:31  troy.sadkowsky
 *     removed olf code, added data cleaning functions and ui updates
 *
 *     Revision 1.121  2008/02/15 00:20:47  ray.welburn
 *     toExcel icon added
 *
 *     Revision 1.120  2008/02/14 02:37:48  ray.welburn
 *     Modify help button to go to appropriate page in help wiki
 *
 *     Revision 1.119  2008/02/13 02:37:00  ray.welburn
 *     Remove User manual references
 *
 *     Revision 1.118  2008/02/10 04:26:54  troy.sadkowsky
 *     minor wording updates
 *
 *     Revision 1.117  2008/02/08 07:37:44  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.116  2008/02/03 23:29:52  troy.sadkowsky
 *     only show started interviews
 *
 *     Revision 1.115  2008/01/24 11:20:18  troy.sadkowsky
 *     rett participant interview status
 *
 *     Revision 1.114  2008/01/24 03:59:06  troy.sadkowsky
 *     review interveiw
 *
 *     Revision 1.113  2008/01/14 12:57:27  troy.sadkowsky
 *     rules view updates
 *
 *     Revision 1.112  2008/01/11 04:04:08  troy.sadkowsky
 *     show with parent
 *
 *     Revision 1.111  2007/12/16 22:47:59  troy.sadkowsky
 *     fix for notes and dates
 *
 *     Revision 1.110  2007/12/11 14:08:12  troy.sadkowsky
 *     new view with parent option at interview
 *
 *     Revision 1.109  2007/12/09 23:42:32  troy.sadkowsky
 *     survey for JSM section
 *
 *     Revision 1.108  2007/12/04 01:42:48  troy.sadkowsky
 *     bug fix for self admin message
 *
 *     Revision 1.107  2007/11/24 03:58:59  troy.sadkowsky
 *     filter by participant status
 *
 *     Revision 1.106  2007/11/23 07:24:07  troy.sadkowsky
 *     mapping fix
 *
 *     Revision 1.105  2007/11/23 06:29:47  troy.sadkowsky
 *     minor fomratting
 *
 *     Revision 1.104  2007/11/21 02:46:10  ray.welburn
 *     Show count for participants not included in other statuses
 *
 *     Revision 1.103  2007/11/16 04:20:14  troy.sadkowsky
 *     bug fix for jh statuses
 *
 *     Revision 1.102  2007/11/15 04:11:32  troy.sadkowsky
 *     self administered interview
 *
 *     Revision 1.101  2007/11/14 08:12:11  troy.sadkowsky
 *     jh statuses
 *
 *     Revision 1.100  2007/11/14 05:14:17  troy.sadkowsky
 *     jh statuses
 *
 *     Revision 1.99  2007/11/09 05:16:47  troy.sadkowsky
 *     updated jh statuses
 *
 *     Revision 1.98  2007/11/06 11:52:43  troy.sadkowsky
 *     next participant
 *
 *     Revision 1.97  2007/11/03 04:58:27  troy.sadkowsky
 *     statuses and next participants
 *
 *     Revision 1.96  2007/11/03 02:31:51  troy.sadkowsky
 *     move calendar class to own file
 *
 *     Revision 1.95  2007/10/30 04:15:21  ray.welburn
 *     DateTime entry for next interview date
 *
 *     Revision 1.94  2007/10/24 05:11:50  ray.welburn
 *     truncate name method applied to study options fjsms & tjsms
 *
 *     Revision 1.93  2007/10/15 05:56:50  troy.sadkowsky
 *     remove border from help image link
 *
 *     Revision 1.92  2007/10/12 07:48:11  ray.welburn
 *     Display format changes
 *
 *     Revision 1.91  2007/10/09 07:18:31  troy.sadkowsky
 *     new statuses for job history
 *
 *     Revision 1.90  2007/10/08 07:20:59  troy.sadkowsky
 *     rule management
 *
 *     Revision 1.89  2007/10/04 01:59:52  ray.welburn
 *     Update to font styles of several text items
 *
 *     Revision 1.88  2007/10/03 07:11:17  ray.welburn
 *     Images moved to Occideaslib and links used for project access to images
 *
 *     Revision 1.87  2007/09/29 02:21:03  ray.welburn
 *     Study User Management moved to the administration area studies tab
 *
 *     Revision 1.86  2007/09/27 13:29:18  ray.welburn
 *     Study User Management moved to the administration area studies tab
 *
 *     Revision 1.85  2007/09/26 05:13:47  ray.welburn
 *     studies startnote, endnote, an ''incomplete' warning now working
 *
 *     Revision 1.84  2007/09/24 05:17:25  Troy.Sadkowsky
 *     small layout change to study options page
 *
 *     Revision 1.83  2007/09/22 03:20:37  troy.sadkowsky
 *     participant and job history statuses
 *
 *     Revision 1.82  2007/09/15 05:38:41  ray.welburn
 *     Selection button added to disallow autogeneration of participant numbers
 *
 *     Revision 1.81  2007/09/15 02:03:40  ray.welburn
 *     Selection button added to disallow autogeneration of participant numbers
 *
 *     Revision 1.80  2007/09/11 23:04:14  troy.sadkowsky
 *     changes for sharing jsms
 *
 *     Revision 1.79  2007/09/05 09:01:48  troy.sadkowsky
 *     self admin updates
 *
 *     Revision 1.78  2007/09/03 00:39:22  troy.sadkowsky
 *     updates for aug 24th meeting
 *
 *     Revision 1.77  2007/08/29 01:35:35  troy.sadkowsky
 *     moved warning style to input tag from td tag
 *
 *     Revision 1.76  2007/08/23 02:28:26  ray.welburn
 *     Apply "loading..." timer onclick  to all hrefs
 *
 *     Revision 1.75  2007/08/22 22:17:58  troy.sadkowsky
 *     scrollable diz for report and minor style update
 *
 *     Revision 1.74  2007/08/20 11:26:10  ray.welburn
 *     Participant view now validates phone number
 *
 *     Revision 1.73  2007/08/19 13:05:34  troy.sadkowsky
 *     share study with users
 *
 *     Revision 1.72  2007/08/19 03:39:24  troy.sadkowsky
 *     style updates
 *
 *     Revision 1.71  2007/08/13 00:19:37  troy.sadkowsky
 *     new jobhistory field requirements and sharing ability
 *
 *     Revision 1.70  2007/07/05 03:19:05  troy.sadkowsky
 *     nav bar code that got lost
 *
 *     Revision 1.69  2007/07/01 10:34:25  Jeff.Keys
 *     nav bar
 *
 *     Revision 1.68  2007/06/09 00:02:12  Troy.Sadkowsky
 *     skipped qs
 *
 *     Revision 1.67  2007/06/03 23:08:43  Troy.Sadkowsky
 *     multiple jsms
 *
 *     Revision 1.66  2007/05/30 04:17:02  Jeff.Keys
 *     *** empty log message ***
 *
 *     Revision 1.64  2007/05/22 11:19:04  Troy.Sadkowsky
 *     study options
 *
 *     Revision 1.63  2007/05/16 05:41:39  jeff.keys
 *     study notes
 *
 *     Revision 1.62  2007/05/01 11:40:20  jeff.keys
 *     study notes
 *
 *     Revision 1.61  2007/05/01 03:21:51  jeff.keys
 *     study notes
 *
 *     Revision 1.60  2007/04/26 22:37:02  Troy.Sadkowsky
 *     added new status is interview not required
 *
 *     Revision 1.59  2007/04/26 06:58:42  troy.sadkowsky
 *     self admin updates
 *
 *     Revision 1.58  2007/04/22 11:55:56  Troy.Sadkowsky
 *     build v1.24
 *
 *     Revision 1.57  2007/04/18 13:26:26  Troy.Sadkowsky
 *     New navigational links code
 *
 *     Revision 1.56  2007/04/16 00:26:15  Troy.Sadkowsky
 *     reset passwords
 *
 *     Revision 1.55  2007/04/12 11:08:34  jeff.keys
 *     breadcrumbs
 *
 *     Revision 1.54  2007/04/10 13:05:59  Troy.Sadkowsky
 *     attached files
 *
 *     Revision 1.53  2007/04/09 07:35:12  jeff.keys
 *     Study Notes
 *
 *     Revision 1.52  2007/04/08 09:19:20  jeff.keys
 *     Study Notes
 *
 *     Revision 1.51  2007/04/04 12:57:48  jeff.keys
 *     Study Notes
 *
 *     Revision 1.50  2007/04/04 12:02:02  Troy.Sadkowsky
 *     linking jobs through template jsms
 *
 *     Revision 1.49  2007/03/30 04:54:47  Troy.Sadkowsky
 *     mods for user-study relationships
 *
 *     Revision 1.48  2007/03/28 02:23:24  troy.sadkowsky
 *     bug fix for unselecting radio buttons
 *
 *     Revision 1.47  2007/03/27 06:32:26  jeff.keys
 *     remove remarked code
 *
 *     Revision 1.46  2007/03/25 05:46:54  jeff.keys
 *     add style to close window link
 *     and radio buttons ids and labels
 *
 *     Revision 1.45  2007/03/24 05:27:22  jeff.keys
 *     add style to close window link
 *
 *     Revision 1.44  2007/03/24 01:31:35  jeff.keys
 *     *** empty log message ***
 *
 *     Revision 1.43  2007/03/21 13:46:01  Troy.Sadkowsky
 *     bug fix on copy template, datetime field, new add permission code, print view
 *
 *     Revision 1.42  2007/03/19 10:02:58  jeff.keys
 *     Interview possible answers styles
 *
 *     Revision 1.41  2007/03/18 20:55:11  Troy.Sadkowsky
 *     bug 109 record participants contact details
 *
 *     Revision 1.40  2007/03/18 11:29:03  jeff.keys
 *     Making it look pretty
 *
 *     Revision 1.39  2007/03/16 04:37:05  jeff.keys
 *     Making it look pretty
 *
 *     Revision 1.38  2007/03/15 12:56:11  Troy.Sadkowsky
 *     minor updates for self administered interview
 *
 *     Revision 1.37  2007/03/15 04:56:36  Troy.Sadkowsky
 *     self admin changes
 *
 *     Revision 1.36  2007/03/15 00:16:44  Troy.Sadkowsky
 *     bug fixes for build v1.18
 *
 *     Revision 1.35  2007/03/13 11:54:26  troy.sadkowsky
 *     fixes for bugs introduced by no frames
 *
 *     Revision 1.34  2007/03/12 12:47:39  Troy.Sadkowsky
 *     removed frames
 *
 *     Revision 1.33  2007/03/12 02:45:50  Troy.Sadkowsky
 *     removed frames
 *
 *     Revision 1.32  2007/03/11 11:12:32  troy.sadkowsky
 *     changed method of add and edit studies to not use popups
 *
 *     Revision 1.31  2007/03/06 05:03:44  Troy.Sadkowsky
 *     new progress bar
 *
 *     Revision 1.30  2007/03/05 16:11:41  Troy.Sadkowsky
 *     finalized validation
 *
 *     Revision 1.29  2007/03/05 04:56:52  troy.sadkowsky
 *     self administered interview
 *
 *     Revision 1.28  2007/03/02 06:23:13  jeff.keys
 *     Participant and Job History Validation v2
 *
 *     Revision 1.27  2007/02/28 05:28:21  Troy.Sadkowsky
 *     build v1.16 updates
 *
 *     Revision 1.26  2007/02/28 00:31:01  troy.sadkowsky
 *     rett syndrom requirements of new login
 *
 *     Revision 1.25  2007/02/25 23:15:22  troy.sadkowsky
 *     rules are now study specific
 *
 *     Revision 1.24  2007/02/07 23:21:20  troy
 *     further development on level rules
 *
 *     Revision 1.23  2007/02/02 07:44:22  troy
 *     further dynamic rule implementation
 *
 *     Revision 1.22  2007/02/01 12:18:56  troy
 *     more changes for dynamic rules
 *
 *     Revision 1.21  2007/01/08 12:45:46  Administrator
 *     version 14 updates
 *
 *     Revision 1.20  2006/12/12 23:29:15  admin
 *     interview start and end notes
 *
 *     Revision 1.19  2006/12/12 13:43:58  admin
 *     build v1.13
 *
 *     Revision 1.18  2006/11/03 07:24:06  admin
 *     display updates
 *
 *     Revision 1.17  2006/10/31 21:09:30  admin
 *     build v1.08
 *
 *     Revision 1.16  2006/10/17 00:15:30  admin
 *     mapping
 *
 *     Revision 1.15  2006/10/03 22:38:53  admin
 *     enhancements to expert system
 *
 *     Revision 1.14  2006/08/09 04:19:27  admin
 *     new feature, ability to update answers at assesment level
 *
 *     Revision 1.13  2006/07/27 23:19:43  admin
 *     version 1.02
 *
 *     Revision 1.12  2006/07/22 04:56:32  admin
 *     new jobhistory changes
 *
 *     Revision 1.11  2006/06/29 05:49:00  administrator
 *     updates for rework
 *
 *     Revision 1.10  2006/06/28 08:30:31  administrator
 *     updates for rework
 *
 *     Revision 1.9  2006/06/16 03:26:54  administrator
 *     updates for rework
 *
 *     Revision 1.8  2006/06/16 02:10:21  administrator
 *     updates for rework
 *
 *     Revision 1.7  2006/06/16 00:19:51  administrator
 *     restructure progress
 *
 *     Revision 1.6  2006/06/15 05:16:23  administrator
 *     restructure progress
 *
 *     Revision 1.5  2006/06/14 06:59:08  administrator
 *     updates for rework
 *
 *     Revision 1.4  2006/06/13 23:28:52  administrator
 *     restructure progress
 *
 *     Revision 1.3  2006/06/12 06:58:32  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/06/12 04:10:02  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.14  2006/04/27 02:06:30  administrator
 *     removed chemical list from summary
 *
 *     Revision 1.13  2006/03/02 23:19:34  administrator
 *     changed objects to throw excpetions not throwables
 *
 *     Revision 1.12  2006/02/24 06:28:49  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.11  2006/02/23 07:11:59  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.10  2006/02/22 09:09:36  administrator
 *     converted throwable to exception
 *
 *     Revision 1.9  2006/02/22 02:39:47  administrator
 *     new layout of study summary
 *
 *     Revision 1.8  2006/02/16 22:44:06  administrator
 *     new connection pool
 *
 *     Revision 1.7  2006/01/31 23:18:31  administrator
 *     change display look
 *
 *     Revision 1.6  2006/01/13 06:57:34  administrator
 *     new interview section objects
 *
 *     Revision 1.5  2005/12/14 04:17:05  administrator
 *     Job history management
 *
 *     Revision 1.4  2005/12/07 04:28:49  administrator
 *     Job History implementation
 *
 *     Revision 1.3  2005/11/29 05:23:07  administrator
 *     managed imports
 *
 *     Revision 1.2  2005/11/17 22:54:39  administrator
 *     interview functionality
 *
 *     Revision 1.1  2005/11/16 05:28:39  administrator
 *     new library to share amongst mql, ims and ams
 *
 */
package com.researchit.html;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.researchit.Agent;
import com.researchit.AgentGroup;
import com.researchit.Assessment;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.FrozenQA;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
import com.researchit.JobSpecificModule;
import com.researchit.ParticipantStatus;
import com.researchit.Question;
import com.researchit.QuestionAssessment;
import com.researchit.StudyNote;
import com.researchit.StudyStatus;
import com.researchit.User;
import com.researchit.Util;
import com.researchit.common.Address;
import com.researchit.common.DBBaseObject;
import com.researchit.common.Participant;
import com.researchit.common.Study;
import com.researchit.io.Report;
import com.researchit.reports.BiospecimensReport;
import com.researchit.reports.OccIdeasReport;
import com.researchit.reports.ParticipantTrackingReport;

public class InterviewManagementSystem extends HTMLObject {

	public InterviewManagementSystem() {
		super();
	}
	public String showJobHistoryDetails(List<JobHistory> jobHistories) throws Exception {
		String strHTML = "";
		int iCount = 1;
		strHTML += this.showTitleBarAndCloseButton("Job History Details","closeEdit");
		strHTML += "<table class=EditView>";      
		strHTML += "</table>";
		for (JobHistory jh : jobHistories) {
			strHTML += "<table width=100% cellpadding=0 cellspacing=0 style='border: 2px solid #e4f0f5;'>";
			strHTML += "<tr>";
			strHTML += "<td><a name="+jh.getId()+"></a>";
			strHTML += "<table class=EditView>";
			strHTML += "<tr>";
			strHTML += "<td valign=top align=center nowrap><input type=checkbox name=jobHistoriesCheckBox_"
					+ jh.getId()
					+ "></input></td>";
			strHTML += "<td valign=top>";
			strHTML += "<table cellpadding=0 cellspacing=0 >";
			strHTML += "<tr><td width=100px><b>Job Reference Number</b></td><td >" + jh.getReferenceNumber() + "</td></tr>";
			strHTML += "<tr><td width=100px><b>Job Title</b></td><td >" + jh.getJobDescription() + "</td></tr>";
			String searchJobsLink = "<a href=../Questionnaire/main.jsp?cookieconnect=true&search="+jh.getJobDescription()+"&Location=Jobs&jobHistoryId="+jh.getId()+">Browse Jobs</a>";

			strHTML += "<tr><td width=100px><b>Final JSM</b><br>"+searchJobsLink+"</td><td nowrap >" + this.showCombo(jh.getFinalJSMId(), "finalJSMs_" + jh.getId(), jh.getJsms(),false,true,false) + "</td></tr>";
			strHTML += "<tr><td width=100px><b>Priority</b></td><td style='padding-left: 2.5px;'><input type=text size=4 name=priority_" + jh.getId() + " value='" + jh.getPriority() + "'></input></td></tr>";
			JobHistoryStatus jhs = new JobHistoryStatus();
			List<JobHistoryStatus> statuses = jhs.getJobHistoryStatuses();
			strHTML += "<tr><td width=100px><b>Job History Status</b></td><td >" + this.showCombo(jh.getStatusId(), "status_" + jh.getId(), statuses,false,true,false) + "</td></tr>";
			boolean conflictStatus = false;
			if(jh.getFinalJSMId().equalsIgnoreCase("NULL")){
				if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDTIME)){
					//conflictStatus = true;
				}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEINTERVIEWED)){
					conflictStatus = true;
				}
			}else{
				if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM)){
					conflictStatus = true;
				}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE)){
					conflictStatus = true;
				}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.UNEXPOSEDJOB)){
					conflictStatus = true;
				}
			}
			if(conflictStatus){
				strHTML += "<tr><td width=100px class=warning><b>Warning:</b></td><td  class=warning>Conflict between mapped JSM and Job History Status</td></tr>";

			}
			String nextJHid = "";
			int iSize = jobHistories.size();
			if(iCount<iSize){
				nextJHid = jobHistories.get(iCount).getId();
				strHTML += "<tr><td>&nbsp;</td><td>&nbsp;</td></tr>";
				strHTML += "<tr><td>&nbsp;</td><td>&nbsp;</td></tr>";
				strHTML += "<tr><td>&nbsp;</td><td><a href=#"+nextJHid+">Next JH</a></td></tr>";
			}
			strHTML += "</table>";
			strHTML += "</td>";
			strHTML += "<td>";
			strHTML += "<table >";
			strHTML += "<tr ><td width=100px><b>From</b></td><td width=100px>" + jh.getStartMonth() + "/"+jh.getStartYear()+"</td></tr>";
			strHTML += "<tr ><td ><b>Until</b></td><td >" + jh.getFinishMonth() + "/"+jh.getFinishYear()+"</td></tr>";
			strHTML += "<tr><td ><b>Employer Address</b></td><td >" + jh.getEmployer() + ", " + jh.getStreet() + ", " + jh.getSuburb() + ", " + jh.getState() + ", " + jh.getCountry() + "</td></tr>";
			strHTML += "<tr ><td><b>Title</b></td><td >" + jh.getJobDescription() + "</td></tr>";
			strHTML += "<tr ><td ><b>Main Product</b></td><td >" + jh.getJobTitle() + "</td></tr>";
			strHTML += "<tr ><td ><b>Avg hrs week</b></td><td >" + jh.getHoursPerWeek() + "</td></tr>";
			strHTML += "</table>";
			strHTML += "</td>";
			//String addFfImg = "";
			/*String fFStatus = jh.frequentFlyerStatus();
            if (fFStatus.equals("True")){
            	addFfImg = "<img src='ImageStream?ImageName=warning.gif' name=fFlyer title='Frequent Flyer Job' height=16 width=16/>";
            }else if (fFStatus.equals("No Job Number!")){
            	addFfImg = "<img src='ImageStream?ImageName=warning.gif' name=fFlyer title='Warning: Frequent Flying status unresolved please review hard copy questionnaire' height=16 width=16/>";
            }else if (fFStatus.equals("HighValue")){
            	addFfImg = "<img src='ImageStream?ImageName=warning.gif' name=fFlyer title='Warning: Frequent Flying status contains value out of range, please review hard copy questionnaire' height=16 width=16/>";
            }*/
			//String highlight = false?"orange":"lightblue";//set condition to highlight
			//strHTML += "<td valign=top><span style='width:30px;background-color:" + highlight + ";' onmouseover=\"document.getElementById('bceesJh" + jh.getId() + "').style.visibility='visible'\";'>Show Additional Info</span>" + addFfImg + "";//</a>
			//strHTML += "<div id='additionalJh" + jh.getId() + "' style='position:absolute;background-color:lightgrey;visibility:hidden;z-index:1001;' onmouseout=\"style.visibility='hidden'\" onmouseover=\"style.visibility='visible'\">";
			//strHTML += showAdditionalJobHistoryData(jh);
			//strHTML += "</div>";
			strHTML += "</td>";
			strHTML += "</tr>";
			strHTML += "</table>";
			strHTML += "</td>";
			strHTML += "</tr>";
			strHTML += "</table>";
			iCount++;
		}
		strHTML += "<br/>";
		return strHTML;
	}

	public String showEditStudyNotes(ArrayList<StudyNote> notes) throws Exception {
		String strHTML = "\n<table class=EditView cellspacing=0>";
		strHTML += "<tr class=windowTop><td colspan=2 align=center>Edit Notes</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";					
		for (StudyNote sn : notes) {       	
			String strName = sn.getName();
			strHTML += "<tr><td  class=studynotes width=5% align=center><input id="+sn.getId()+" type=checkbox name=studyNotesCheckBox_"
					+ sn.getId()
					+ "></input></td><td><label for="+sn.getId()+">"
					+ strName
					+ "</label></td>"
					+ "</tr>";
		}
		strHTML += "</table>";
		return strHTML;
	} 

	/*    @SuppressWarnings("unchecked")
    private List<BCEESJobHistory> getJobHistoryData(Participant participant) {
 		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
 		session.beginTransaction();
 		List<BCEESJobHistory> jobHistories = session.createSQLQuery("SELECT * FROM jobhistory WHERE referencenumber = '" + participant.getReferenceNumber() + "'").addEntity(BCEESJobHistory.class).list();
 		session.getTransaction().commit();

 		return jobHistories;
    }*/

	public String showAdditionalJobHistoryData(JobHistory jobHistory) throws Exception {//List<JobHistoryColumn> jobHistories, String jobRefNumber) {

		String strHTML = "";
		strHTML += "<table><tr><td colspan=2>Additional Job History</td></tr>";
		//    	for (JobHistoryColumn jhc : jobHistory.getColumn()){
		strHTML += "<tr><td width=170>" + "name" + "</td><td>" + "value" + "</td></tr>";
		//    	}
		strHTML += "<tr><td>------------------</td><td>----------------</td></tr>";
		strHTML += "</td></tr></table>";

		return strHTML;
	}    
	//  public String showParticipantSurvey(String participantId) throws Exception{
	//    	String strHTML = "\n<table class=EditView>";
	//        strHTML += "\n<tr>";
	//        strHTML += "\n<td>";
	//        String evalJSMId = "10181";
	//        JobSpecificModule jsm = new JobSpecificModule(evalJSMId);
	//        strHTML += this.showAllQuestionsEdit(jsm.getQuestions(),"",false,null);
	//        strHTML += "\n<input type=hidden name=JSMID value="+evalJSMId+" />";
	//        strHTML += "\n<input type=hidden name=participantID value="+participantId+" />";
	//        strHTML += "\n</td>";
	//        strHTML += "\n</tr>";
	//        strHTML += "\n</table>";
	//        return strHTML;
	//    }
	//    public String showParticipantJSMSurvey(String participantId) throws Exception{
	//    	String strHTML = "\n<table class=EditView>";
	//        strHTML += "\n<tr>";
	//        strHTML += "\n<td>";
	//        String evalJSMId = "10234";
	//        JobSpecificModule jsm = new JobSpecificModule(evalJSMId);
	//        strHTML += this.showAllQuestionsEdit(jsm.getQuestions(),"",false,null);
	//        strHTML += "\n<input type=hidden name=JSMID value="+evalJSMId+" />";
	//        strHTML += "\n<input type=hidden name=participantID value="+participantId+" />";
	//        strHTML += "\n</td>";
	//        strHTML += "\n</tr>";
	//        strHTML += "\n</table>";
	//        return strHTML;
	//    }   
	public String showParticipantCommentsStatus(Participant participant, List<ParticipantStatus> statuses) throws Exception {
		OccCalendar nextInterviewDate = new OccCalendar();
		String strHTML = "";
		if (!participant.getNextContactDateTime().contains("1900-01-01")){
			nextInterviewDate.setDateTime(participant.getNextContactDateTime().toString());      	
		}
		strHTML += "<table width=100% cellpadding=0 cellspacing=0 style='border: 2px solid #e4f0f5;'>";
		if (participant.getJobHistories().size() == 0){
			strHTML += "<tr><td>No Job Histories Found</td></tr>";
		}
		strHTML += "<tr>";
		strHTML += "<td>";
		strHTML += "\n<table class=EditView>";
		strHTML += "\n<tr><td >Comments about Participant</td><td ><textarea cols=40 rows=4 name=comments>"+ participant.getComments() + "</textarea></td></tr>";
		String warning = "";
		if(participant.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORASSESSMENT)){
			if(participant.getJobHistories(JobHistoryStatus.TOBEREVIEWED,"").size()>0){
				warning = "<td><span class=warning>Warning: One or more Job Histories are still to be reviewed</span></td>";
			}else if(participant.getJobHistories(JobHistoryStatus.TOBEINTERVIEWED,"").size()>0){
				warning = "<td><span class=warning>Warning: One or more Job Histories are still to be interviewed</span></td>";
			}
		}
		strHTML += "\n<tr><td >Participant Status</td><td>" + this.showParticipantStatuses(participant.getStatusId(), "participantStatus", statuses) + "</td>" +warning+ "</tr>";
		//if(participant.getStatusId().equalsIgnoreCase(ParticipantStatus.INTERVIEWINCOMPLETE)){
		//   strHTML += "\n<tr><td class=participants>Next Contact Date/Time</td><td>" +nextInterviewDate.showDayCombo() + nextInterviewDate.showMonthCombo() +  nextInterviewDate.showYearCombo() + " / " + nextInterviewDate.showHourCombo() + ":" + nextInterviewDate.showMinuteCombo() + "ddmmyyyy/hh:mm<input type=hidden name=nextContactDateTime value=\""+participant.getNextContactDateTime()+"\"></input></td>" + "</tr>";        	
		//}
		strHTML += "\n</table>";
		strHTML += "\n</td>";
		strHTML += "\n</tr>";
		strHTML += "\n</table>";
		return strHTML;
	}
	public String showParticipantJobHistoryCalendar(Participant participant) throws Exception {
		String strHTML = "";
		String lastNameError = participant.getErrorMessage().contains("LastName-Blank")?"Name cannot be blank":"";
		String phoneError = participant.getErrorMessage().contains("Phone-FormatError")?"Phone number is in incorrect format":"";
		String dobError = participant.getErrorMessage().contains("Dob-FormatError")?"Please check the date of birth":"";

		boolean newParticipant = participant.getParticipantId()==0;
		String disabled = newParticipant?"":"disabled";//If it is a new participant then don't disable the Reference number input
		String duplicateWarning = "";
		String title = (newParticipant)?"New Participant":"Edit Participant "+participant.getFullName();
		strHTML += "<table class=EditView cellspacing=0 bgcolor=#f9faff>";
		strHTML += "<tr class=windowTop ><td align=center>" + title + "</td><td id='dirtyflag'>Close</td><td style='text-align:right;'><input type=image src='ImageStream?ImageName=close.gif' name=closeEditI title='Close Edit Mode' height=16 width=16 onclick='return CheckDirtyPage()'/></td></tr>";			
		strHTML += "<tr><td>";
		strHTML += "<fieldset class=\"participant\">";
		strHTML += "<Legend>Personal Details</legend>";
		strHTML += "<table bgcolor= #e7f4fc width=100%>";
		strHTML += "<tr><td width=300px>AMR Ref ID</td><td style=width:300px;><input type=text name=amrRefId id=amrRefId value=\""+participant.getAmrRefId()+"\" ></input><input type=hidden name=newRefNumber id=newRefNumber "+disabled+ " value=\""+participant.getReferenceNumber()+"\" >";
		strHTML += "</input><span class=isMandatory>*</span></td><td><span class=isMandatory>"+duplicateWarning+"</span></td></tr>";	        				
		strHTML += "<tr><td>First two letters of first name and last name</td><td><input type=text name=lastName value='"
				+ participant.getLastName() + "' onchange='MarkPageDirty()'></input><span class=isMandatory>*</span></td><td><span id='nameerr' class='isMandatory'>" + lastNameError + "</span></td></tr>";
		strHTML += "<tr><td>Year of Birth</td><td>";
		strHTML += this.showDatePickerYearOnly(1900, 2051, participant.getDobYearInt(), participant.getDobMonthInt(), participant.getDobDayInt(), "date-sel");
		strHTML += "<span class=isMandatory>*</span></td><td><span id='doberr' class='isMandatory'>" + dobError + "</span></td></tr>";
		strHTML += "<tr><td>Gender</td><td>"+this.showGenderCombo(participant.getGender())+"</td></tr>";//"+genderText+"
		strHTML += "<tr><td>Last Four Digits of Phone Number</td;><td>";
		strHTML += "<input type=text name=phoneNumber value='" + participant.getOccContactNo() + "' onchange='MarkPageDirty()'></input></td><td><span id='phoneerr' class='isMandatory'>" + phoneError + "</span></td></tr>";//"+phoneText+"
		strHTML += "<tr><td >Comments about Participant</td><td ><textarea cols=40 rows=4 name=comments>"+ participant.getComments() + "</textarea></td></tr>";
		ParticipantStatus status = new ParticipantStatus();
		List<ParticipantStatus> statuses = status.getParticipantJobHistoryStatuses();

		strHTML += "\n<tr><td >Participant Status</td><td>" + this.showParticipantStatuses(participant.getStatusId(), "participantStatus", statuses) + "</td></tr>";

		strHTML += "<tr><td>Transcript Sent</td;><td>";
		strHTML += "<input type=checkbox name=transcriptSent " + (participant.isTranscriptSent() == false?"":"checked") + " value='Yes' onchange='MarkPageDirty()'></input></td><td></td></tr>";


		strHTML += "<tr><td><span class=isMandatory>* These fields must be completed</span></td></tr>";
		strHTML += "</table>";
		strHTML += "</fieldset>";
		if (!newParticipant) {		
			strHTML += "<fieldset class=\"participant\">";
			strHTML += "<Legend>Residential History</legend>";
			strHTML += this.showResidentialHistorySummary(participant,true);
			strHTML += "<table>";	
			strHTML += "<tr><td><input type=hidden name=ParticipantID value="+participant.getParticipantId()+"</td></tr>";	
			strHTML += "</table>";	
			strHTML += "</fieldset>";

			strHTML += "<fieldset class=\"participant\">";
			strHTML += "<Legend>Occupational History</legend>";
			strHTML += this.showJobHistorySummary(participant);
			strHTML += "<table>";	
			strHTML += "<tr><td><input type=hidden name=ParticipantID value='"+participant.getParticipantId()+"' /></td></tr>";	
			strHTML += "</table>";	
			strHTML += "</fieldset>";			
		}
		strHTML += "</td>";
		strHTML += "</tr>";
		strHTML += "<tr><td colspan=4><script language=javascript type='text/javascript'>setFocus('newTitle');</script></td></tr>";
		strHTML += "</table>";

		//}
		return strHTML;
	}

	public String showSelfAdministeredNavTitle(Participant p, int step){
		String strHTML = "\n";				
		strHTML += "<table height=25px width=100% cellpadding=0 cellspacing=0 style='border: 1px solid #87B3D0;'>";	
		strHTML += "<tr class=ListHeader>";
		String highlight = "";
		if(step==1){
			highlight = "class=Highlight";
		}
		strHTML += "<td align=center "+highlight+"><a href=selfadminpage1.jsp>Welcome</a></td>";
		strHTML += "<td bgcolor=#87B3D0 width=1></td>";
		highlight = "";
		if(step==3){
			highlight = "class=Highlight";
		}
		strHTML += "<td align=center "+highlight+"><a href=selfadminpage3.jsp>Contact Information</a></td>";
		strHTML += "<td bgcolor=#87B3D0 width=1></td>";
		highlight = "";
		if(p!=null){
			if(p.getStatusId().equalsIgnoreCase(ParticipantStatus.TOBEUPDATED)){
				if(step==4){
					highlight = "class=Highlight";
				}
				strHTML += "<td align=center "+highlight+"><a href=selfadminpage4.jsp>Job History Instructions</a></td>";
				strHTML += "<td bgcolor=#87B3D0 width=1></td>";
				highlight = "";
			}else if (p.getStatusId().equalsIgnoreCase(ParticipantStatus.TOBEREVIEWED)){
				if(step==4){
					highlight = "class=Highlight";
				}
				strHTML += "<td align=center "+highlight+"><a href=selfadminpage4.jsp>JobHistory</a></td>";
				strHTML += "<td bgcolor=#87B3D0 width=1></td>";
				highlight = "";
			}else{
				strHTML += "<td align=center bgcolor=#e0e0f1>JobHistory</td>";
				strHTML += "<td bgcolor=#87B3D0 width=1></td>";
				highlight = "";
			}
		}else{
			strHTML += "<td align=center bgcolor=#e0e0f1 title='Completed'>JobHistory</td>";
			strHTML += "<td bgcolor=#87B3D0 width=1></td>";
			highlight = "";
		}   	
		if(p!=null){
			if (p.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW)){
				if(step==5){
					highlight = "class=Highlight";
				}
				strHTML += "<td align=center "+highlight+"><a href=selfadminpage5.jsp>Job Modules</a></td>";
				strHTML += "<td bgcolor=#87B3D0 width=1></td>";
				highlight = "";
			}else{
				strHTML += "<td align=center bgcolor=#e0e0f1>Job Modules</td>";
				strHTML += "<td bgcolor=#87B3D0 width=1></td>";
				highlight = "";
			}
		}else{
			strHTML += "<td align=center bgcolor=#e0e0f1 title='Must complete Job Histories First'>Job Modules</td>";
			strHTML += "<td bgcolor=#87B3D0 width=1></td>";
			highlight = "";
		}   
		if(step==6){
			highlight = "class=Highlight";
		}   	
		if(p!=null){
			if (p.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW)){
				strHTML += "<td align=center "+highlight+"><a href=selfadminpagejsmsurvey.jsp?PID="+p.getParticipantId()+">Feedback</a></td>";
			}else{
				strHTML += "<td align=center "+highlight+"><a href=selfadminpagesurvey.jsp?PID="+p.getParticipantId()+">Feedback</a></td>";
			}

		}else{
			strHTML += "<td align=center "+highlight+">Feedback</td>";
		}  	
		highlight = "";
		strHTML += "</tr>";	
		strHTML += "</table>";	

		return strHTML;
	}
	public String showSelfAdministeredJobHistoryCalendar(Participant participant) throws Exception {
		String strHTML = "\n";				
		strHTML += "<table>";	
		strHTML += "<tr><td><div class=jobHistoryCalendar>Please enter your job history calendar</div></td></tr>";	
		strHTML += "<tr><td>To save your information as you go click the 'Save' button at the bottom of the page. If you want to save your work and come back and complete it later click 'Save' and then 'Log out'. If you have finished entering all your job information click the 'Mark Complete' button.</td></tr>";
		strHTML += "<tr><td><span class=isMandatory>* Indicates required field</span></td></tr>";	
		strHTML += "</table>";	
		strHTML += "";
		strHTML += this.showSelfAdministeredJobHistories(participant.getJobHistories());
		strHTML += "<table>";	
		strHTML += "<tr><td><input type=submit name=Action value='Save'></input></td><td><input type=submit name=Action value='Add Job' /></td><td><input type=submit name=Action value='Mark Complete' /></td></tr>";		
		strHTML += "<tr><td><input type=hidden name=ParticipantID value="+participant.getParticipantId()+" /></td></tr>";	
		strHTML += "</table>";		    
		return strHTML;
	}
	public String showReadyJobHistories(String selId, String studyId,Participant p) throws Exception {
		String strHTML = "\n<table class=ContentList>";
		strHTML += "<tr class=ListHeader><td>Priority</td><td>OccHisID</td><td >Job Title</td><td>Job History Status</td><td>JSM</td><td></td></tr>";      
		for (JobHistory jh : p.getJobHistories("ORDER BY priority")) {
			String styleclass = "class=Disabled";
			if (selId.equals("")){
				styleclass = "class=jobhistories";
			}
			if (selId.equalsIgnoreCase(jh.getId())) {
				styleclass = " class=HighlightSubtle ";
			}
			//Make the status the job history status if no interview status
			String status = jh.getStatusName(); 
			String interviewStatusTable = "";     
			boolean bHasInterveiewData = false;
			if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEINTERVIEWED)){
				bHasInterveiewData = true;
			}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.INTERVIEWED)){
				bHasInterveiewData = true;
			}
			if(bHasInterveiewData){
				if(!(jh.getFinalJSMId().equalsIgnoreCase(""))){           	
					JobSpecificModule jsm = new JobSpecificModule(jh.getFinalJSMId());
					int i=1;
					interviewStatusTable += "<table>";
					ArrayList<FrozenJobSpecificModule> frozenJSMs = jsm.getFrozenJSMs(studyId);
					int iSize = frozenJSMs.size();
					boolean bHasStarted = false;
					for(FrozenJobSpecificModule fjsm: frozenJSMs){                                  		
						String interviewStatus = "";
						String strReviewStatus = "";
						if(fjsm.getFrozenQuestions().size()!=0){
							Interview interview = jh.getCurrentInterview(fjsm.getId());
							if(interview==null){
								//if not started the show start button
								interviewStatus = "<a href=ControllerServlet?Action=StartInterview&frozenJSMID="+fjsm.getId()+"&jobhistoryID=" + jh.getId() + " onclick=\"return showProgress()\">Start</a>";
							}else{
								bHasStarted = true;
								Integer iSkippedCount = interview.skipppedCount();
								if(iSkippedCount>0){
									strReviewStatus = "Please Find Skipped Questions";
								}else{
									if (selId.equals("")) {
										strReviewStatus = "Review";
									}
								}
								interviewStatus = "<a href=main.jsp?interviewId=" 
										+ interview.getId() 
										+ "&jsmID=" 
										+ fjsm.getId() + "&isFrozen=True&jobhistoryID="
										+jh.getId()+"&review=true title='"
										+fjsm.getDateCreated()
										+"' onclick=\"return showProgress()\">"+strReviewStatus+"</a>";
								//If the interview has been started or run then make the status the interview status
								status = interview.getStatusName();            
							}
						}else{
							interviewStatus = "<span class=warning>Warning: This JSM has no questions</span>";
						}
						if(bHasStarted){
							interviewStatusTable += "<tr><td title='"+fjsm.getDateCreated()+"'>"+this.truncateName(fjsm.getName(),this.JSMLENGTH)+"V"+i+"</td><td>"+interviewStatus+"</td></tr>";
							break;
						}else{
							if(i==iSize){
								interviewStatusTable += "<tr><td title='"+fjsm.getDateCreated()+"'>"+this.truncateName(fjsm.getName(),this.JSMLENGTH)+"V"+i+"</td><td>"+interviewStatus+"</td></tr>";                    		                   			
							}
						}
						i++;
					}               	
					interviewStatusTable += "</table>";
					if (interviewStatusTable.equals("<table></table>")) {//If JSM is not yet frozen
						interviewStatusTable = "<table><tr><td>No frozen JSM</td></tr></table>";
					}
				}
			}          	
			strHTML += "<tr "
					+ styleclass
					+ "><td >"
					+ jh.getPriority()
					+ "</td><td >"
					+ jh.getReferenceNumber()
					+ "</td><td >"
					+ jh.getJobDescription()
					+ "</td><td >"
					+ status
					+ "</td><td >"
					+ interviewStatusTable
					+ "</td></tr>";
		}
		strHTML += "</table>";
		return strHTML;
	}
	public String showSelfAdministeredReadyJobHistories(String selId, String studyId,Participant p) throws Exception {
		String strHTML = "\n<table class=ContentList >";
		strHTML += "<tr class=ListHeader><td align=center>Title</td><td align=center>Age</td><td align=center>Status</td><td></td></tr>";    
		boolean bShowNextStart = true;
		for (JobHistory jh : p.getJobHistories("")) {
			String styleclass = "class=jobhistories";
			if (selId.equalsIgnoreCase(jh.getId())) {
				styleclass = " class=Highlight ";
			}
			String status = "No Interview Required";    

			String interviewStatusTable = "";   

			if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEINTERVIEWED)){
				status = "Not Started";  
				if(!(jh.getFinalJSMId().equalsIgnoreCase(""))){           	
					JobSpecificModule jsm = new JobSpecificModule(jh.getFinalJSMId());
					int i=1;
					interviewStatusTable += "<table >";
					FrozenJobSpecificModule latestFrozenJSM = jsm.getFrozenJSM(studyId);
					boolean showHistory = false;
					boolean bFound = false;               	
					for(FrozenJobSpecificModule fjsm: jsm.getFrozenJSMs(studyId)){                                  		
						if(fjsm.getId().equalsIgnoreCase(latestFrozenJSM.getId())){
							String interviewStatus = "";                   	
							Interview interview = jh.getCurrentInterview(fjsm.getId());
							if(interview==null){
								if(bShowNextStart){
									interviewStatus = "<a href=ControllerServlet?Action=StartInterview&frozenJSMID="+fjsm.getId()+"&jobhistoryID=" + jh.getId() + " onclick=\"return showProgress()\">Start</a>";
									bFound = true;
								}
							}else{
								String strReviewStatus = "";
								Integer iSkippedCount = interview.skipppedCount();
								if(iSkippedCount>0){
									strReviewStatus = "Please Review ["+iSkippedCount+"]";
								}else{
									strReviewStatus = "Review";
								}
								interviewStatus = "<a href=main.jsp?interviewId=" 
										+ interview.getId() 
										+ "&jsmID=" 
										+ fjsm.getId() + "&isFrozen=True&jobhistoryID="
										+jh.getId()+"&review=true title='"
										+fjsm.getDateCreated()
										+"' onclick=\"return showProgress()\">"+strReviewStatus+"</a>";
								status = interview.getStatusName();            
							}
							if(showHistory){
								interviewStatusTable += "<tr><td title='"+fjsm.getDateCreated()+"'>V"+i+"</td><td>"+interviewStatus+"</td></tr>";
							}else{
								interviewStatusTable += "<tr><td>&nbsp;</td><td>"+interviewStatus+"</td></tr>";
							} 
						}else{
							String interviewStatus = "";                   	
							Interview interview = jh.getCurrentInterview(fjsm.getId());
							if(interview!=null){
								String strReviewStatus = "";
								Integer iSkippedCount = interview.skipppedCount();
								if(iSkippedCount>0){
									strReviewStatus = "Please Review ["+iSkippedCount+"]";
								}else{
									strReviewStatus = "Review";
								}
								interviewStatus = "<a href=main.jsp?interviewId=" 
										+ interview.getId() 
										+ "&jsmID=" 
										+ fjsm.getId() + "&isFrozen=True&jobhistoryID="
										+jh.getId()+"&review=true title='"
										+fjsm.getDateCreated()
										+"' onclick=\"return showProgress()\">"+strReviewStatus+"</a>";
								status = interview.getStatusName();
								interviewStatusTable += "<tr><td title='"+fjsm.getDateCreated()+"'>V"+i+"</td><td>"+interviewStatus+"</td></tr>";
								showHistory = true;
							}

						}
						i++;
					}
					if(bFound){
						bShowNextStart = false;
					}
					interviewStatusTable += "</table>";
				} 
			}          	                       
			strHTML += "<tr "
					+ styleclass
					+ "><td align=center>"
					+ jh.getJobDescription()
					+ "</td><td align=center>"
					+ jh.getAge()
					+ "</td><td align=center>"
					+ status
					+ "</td><td align=center>"
					+ interviewStatusTable
					+ "</td></tr>";
		}
		strHTML += "</table>";
		return strHTML;
	}
	public String showJobHistoryInterview(JobHistory jh, Question question,Study study,boolean isReview) throws Exception {
		String strHTML = "<table cellspacing=0 class=EditView>";
		strHTML += "<tr>";
		strHTML += "<td valign=top width=200px>";
		strHTML += "<table class=tableborder bgcolor=#f5deb3><tr><td valign=top><a href='javascript:this.location.reload();'>"
				+ jh.getPriority()
				+ "</a></td><td valign=top >";
		String enviroJSMID = "";
		try{
			Context initCtx = new InitialContext();
			Context ctx = (Context) initCtx.lookup("java:comp/env"); 
			enviroJSMID = (String) ctx.lookup("environmentalJSMID");                 		
		}catch(Exception e){
			//System.out.println(e.getMessage());
		}
		if(jh.getFinalJSMId().equalsIgnoreCase(enviroJSMID)){
			Participant participant = new Participant(Long.valueOf(jh.getParticipantId()));
			strHTML += this.showResidentialHistorySummary(participant,false);
		}else{
			strHTML += "<table bgcolor=#ffefd5>";
			strHTML += "<tr ><td width=100px><b>From</b></td><td width=100px>" + jh.getStartMonth() + "/"+jh.getStartYear()+"</td></tr>";
			strHTML += "<tr ><td ><b>Until</b></td><td >" + jh.getFinishMonth() + "/"+jh.getFinishYear()+"</td></tr>";
			strHTML += "<tr><td ><b>Employer Address</b></td><td >" + jh.getEmployer() + ", " + jh.getStreet() + ", " + jh.getSuburb() + ", " + jh.getState() + ", " + jh.getCountry() + "</td></tr>";
			strHTML += "<tr ><td><b>Title</b></td><td >" + jh.getJobDescription() + "</td></tr>";
			strHTML += "<tr ><td ><b>Main Product</b></td><td >" + jh.getJobTitle() + "</td></tr>";
			strHTML += "<tr ><td ><b>Avg hrs week/b></td><td >" + jh.getHoursPerWeek() + "</td></tr>";
			strHTML += "</table>";
		}
		strHTML += "</td></tr></table>";
		strHTML += "</td>";
		strHTML += "<td valign=top class=InterviewQuestion>";
		strHTML += this.showInterviewQuestion(question, study, isReview);
		strHTML += "<input type=hidden id=radioChangeFlag value=0 /></td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showSelfAdministeredInterviewQuestion(Question question,Study study) throws Exception {
		String strHTML = "";
		strHTML += this.showQuestion(question,study);
		strHTML += "<table>";
		strHTML += "<tr>";
		strHTML += "<td><input type=button onclick=javascript:history.back(1) name='Previous' value='Previous'></input></td>";
		strHTML += "<td><input type=submit name='Save + Next' value='Save + Next' onclick=\"return showProgress()\"></input></td>";
		strHTML += "<td><input type=hidden name=linkedQID value="
				+ question.getJsmQuestionStructureID()
				+ "></input></td>";
		strHTML += "<td><input type=hidden name=Action value=interviewSaveAnswer></input></td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showInterviewQuestion(Question question,Study study,boolean isReview) throws Exception {
		//Interview interview = new Interview(question.getInterviewID());
		String strHTML = this.showQuestion(question,study);
		strHTML += "<table>";
		strHTML += "<tr>";
		if (isReview) {
			strHTML += "<td><input type=submit name='updateInterviewQuestion' value='Update'></input></td>";
		}else{
			strHTML += "<td><input type=button onclick=javascript:history.back(1) name='Previous' value='Previous'></input></td>";
			strHTML += "<td><input type=submit name='Save + Next' value='Save + Next'></input></td>";
			strHTML += "<td title='Use Halt if you wish to stop the interview indefinitely'><a href=ControllerServlet?Action=setStatusInterview&status=halt&interviewId="
					+ question.getInterviewID()
					+ " onclick=\"return showProgress()\">Halt</a></td>";
		}

		strHTML += "<td><input type=hidden name=linkedQID value="
				+ question.getJsmQuestionStructureID()
				+ "></input></td>";
		strHTML += "<td><input type=hidden name=Action value=interviewSaveAnswer></input></td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}

	public String showInterviewsStartNote(Study study) throws Exception {
		String strHTML = "";
		strHTML += "<table class=EditView width=100%>";
		strHTML += "<tr class=ListHeader>";
		strHTML += "<td>" + study.getStartNote() + "</td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showInterviewsEndNote(Study study) throws Exception {
		String strHTML = "";
		strHTML += "<table class=EditView>";
		strHTML += "<tr class=ListHeader>";
		strHTML += "<td>" + study.getEndNote() + "</td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showSurveyLink(Participant p) throws Exception {
		String strHTML = "";
		strHTML += "<table class=EditView>";
		strHTML += "<tr class=ListHeader>";
		strHTML += "<td align=center><br/><br/>You have now completed all interviews.<br/></td>";
		strHTML += "</tr>";
		strHTML += "<tr class=ListHeader>";
		strHTML += "<td align=center>Please provide feedback on the OccIDEAS Self Administered Interview by completing our online feedback form below</td>";
		strHTML += "</tr>";
		strHTML += "<tr class=ListHeader>";
		strHTML += "<td align=center><a href=selfadminpagejsmsurvey.jsp?PID="+p.getParticipantId()+"><img border=0 src='ImageStream?ImageName=nextbutton.gif' /></a></td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showInterviewsIncompleteNote() throws Exception {
		String strHTML = "";
		strHTML += "<table class=EditView>";
		strHTML += "<tr class=ListHeader>";
		strHTML += "<td>One or more Interview has missing answers, please return to the incomplete interview and supply an answer for all the skipped questions</td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showJSMStartNote(FrozenJobSpecificModule fjsm,JobHistory jh) throws Exception {
		String strHTML = "";
		strHTML += "<table class=EditView width=100%>";
		strHTML += "<tr class=ListHeader>";
		String message = "The next set of questions refer to when you were working as a "+jh.getJobDescription()+" with "+jh.getEmployer()+".  That job started in "+jh.getStartYear()+".";
		strHTML += "<td>" + message + "</td>";
		strHTML += "</tr>";
		strHTML += "<tr>";
		strHTML += "<td><a href=ControllerServlet?Action=beginInterview&interviewId="
				+ fjsm.getInterviewId()
				+ " onclick=\"return showProgress()\">Begin Interview</a><input type=hidden name=Action value=ActionButton /></td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showJSMEndNote(JobHistory jh) throws Exception {
		Interview interview = jh.getCurrentInterview();
		String strHTML = "";
		strHTML += "<table class=EditView width=100%>";
		strHTML += "<tr class=ListHeader>";        
		String message = "That completes the set of questions referring to when you were working as a <span style='color: #17698B'>"+jh.getJobDescription()+"</span> with <span style='color: #17698B'>"+jh.getEmployer()+"</span> in <span style='color: #17698B'>"+jh.getStartYear()+"</span>.";
		strHTML += "<td align=center>" + message + "</td>";
		strHTML += "</tr>";
		if (interview.invalidFrequencyAnswers().size() > 0) {
			Participant p = new Participant(Long.valueOf(jh.getParticipantId()));
			Study study = new Study(p.getStudyId());
			if(!(study.hasOption(Study.Option.CAT3FREQ))){
				strHTML += "<tr><td align=center><span class=warning>There are " + interview.invalidFrequencyAnswers().size() + " invalid frequency answers, please <a href=main.jsp?interviewId="+interview.getId()+"&jsmID="+interview.getFrozenJsmId()+"&isFrozen=True&jobhistoryID="+jh.getId()+"&review=true>here to review</a>.</td></tr>";        		
			}
		}
		if (interview.skipppedCount() > 0) {
			strHTML += "<tr><td align=center><span class=warning>There are skipped questions, please <a href=main.jsp?interviewId="+interview.getId()+"&jsmID="+interview.getFrozenJsmId()+"&isFrozen=True&jobhistoryID="+jh.getId()+"&review=true>here to review</a>.</td></tr>";
		}
		strHTML += "</table>";
		return strHTML;
	}
	public String showImport(String type, String result) {
		String title = "";
		String browse = "";
		String name = "";
		if (type.equalsIgnoreCase("")){
			title = "New Study Note";
			browse = "Browse for Study Notes, then click the Attach File button";
			name = "StudyNotesFileName";
		}
		if (type.equalsIgnoreCase("importJHs")){
			title = "Import Job Histories";
			browse = "Browse for Excel File, then click the Upload File button";
			name = "jHFileName";
		}
		String strRetValue = "<table class=EditView>";
		strRetValue += "<tr class=windowTop><td colspan=1 align=center>" + title + "</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";			
		strRetValue += "<tr>";
		strRetValue += "<td>";
		strRetValue += "<table>";
		if (result.equalsIgnoreCase("")) {
			strRetValue += "<tr><td >" + browse + "</td></tr>";
			strRetValue += "<tr><td><input type=file name=" + name + " size=40></input></td></tr>";
		}else{
			strRetValue += "<tr><td><b>" + result;
			strRetValue += "</b></td></tr>";
		}
		strRetValue += "</table>";
		strRetValue += "</td>";
		strRetValue += "<td></td>";
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	/**
	 * @param study The study object
	 * @param showAll Show view for just Occideas or all modules
	 * @return HTML string
	 * @throws Exception
	 */
	public String showStudy(Study study, Boolean showAll) throws Exception {
		String retValue = "";
		retValue +="<table class=EditView>";
		retValue +="<tr>";
		retValue +="<td style='padding-left:5px'>Name</td>";
		retValue +="<td style='padding-left:5px'>" + study.getName() + "</td>";
		retValue +="</tr>";
		retValue +="<tr>";
		retValue +="<td style='padding-left:5px'>Description</td>";
		retValue +="<td style='padding-left:5px'>" + study.getDescription() + "</td>";
		retValue +="</tr>";
		retValue +="<tr >";
		if (!showAll){
			retValue +="<td style='padding-left:5px'>Interview Start Note</td>";
			retValue +="<td style='padding-left:5px'>" + study.getStartNote() + "</td>";
			retValue +="</tr>";
			retValue +="<tr>";
			retValue +="<tr >";
			retValue +="<td style='padding-left:5px'>Interview End Note</td>";
			retValue +="<td style='padding-left:5px'>" + study.getEndNote() + "</td>";
			retValue +="</tr>";
			retValue +="<tr >";
			retValue +="<td style='padding-left:5px'>Status</td>";
			retValue +="<td style='padding-left:5px'>" + study.getOccStatusName() + "</td>";
			retValue +="</tr>";
			retValue +="<tr>";
			retValue +="<td style='padding-left:5px'>Agents</td>";
			retValue +="<td style='padding-left:5px'>" + this.showList(study.getAgents()) + "</td>";
			retValue +="</tr>";       
		}else{
			if (study.hasOption(Study.Option.USEOCCIDEAS)) {
				retValue +="<tr >";
				retValue +="<td style='padding-left:5px'>OccIDEAS Status</td>";
				retValue +="<td style='padding-left:5px'>" + study.getOccStatusName() + "</td>";
				retValue +="</tr>";
			}
			if (study.hasOption(Study.Option.USEPARTICIPANT)){
				retValue +="<tr >";
				retValue +="<td style='padding-left:5px'>Participant Tracking Status</td>";
				retValue +="<td style='padding-left:5px'>" + study.getPtStatusName() + "</td>";
				retValue +="</tr>";
			}
		}
		retValue +="<tr >";
		retValue +="<td style='padding-left:5px'>Participant Count</td>";
		String duplicateWarning = "";
		List<Participant> duplicateParticipants = study.getParticipantsDuplicate();
		if(duplicateParticipants.size()>0){
			duplicateWarning = "<span class=warning title='Use the search function to find and remove duplicates'>&nbsp;&nbsp;Warning: "+duplicateParticipants.size()+" duplicate found: ";
			for(Participant p: duplicateParticipants){
				duplicateWarning += p.getReferenceNumber()+"<br/>";
			}
			duplicateWarning += "</span>";
		}
		retValue +="<td style='padding-left:5px'>" + study.getParticipantCount(ParticipantStatus.NONE) + duplicateWarning + "</td>";
		retValue +="</tr>";
		retValue +="<tr>";    

		String indent = "5";
		if (showAll) {
			indent ="15";
			retValue +="<td colspan=2 style='padding-left:5px'>OccIDEAS Status Count</td>";
			retValue +="</tr><tr>";
		}
		retValue +="<tr>";
		retValue +="<td style='padding-left:" + indent + "px'>To Be Reviewed</td>";
		retValue +="<td style='padding-left:5px'>" + study.getParticipantCount(ParticipantStatus.TOBEREVIEWED) + "</td>";
		retValue +="</tr>";
		retValue +="<tr>";
		retValue +="<td style='padding-left:" + indent + "px'>Ready Intervew</td>";
		retValue +="<td style='padding-left:5px'>" + study.getParticipantCount(ParticipantStatus.READYFORINTERVIEW) + "</td>";
		retValue +="</tr>";
		retValue +="<tr>";
		retValue +="<td style='padding-left:" + indent + "px'>Complete Interview</td>";
		retValue +="<td style='padding-left:5px'>" + study.getParticipantCount(ParticipantStatus.READYFORASSESSMENT) + "</td>";
		retValue +="</tr>";
		//retValue +="<tr>";
		//retValue +="<td style='padding-left:" + indent + "px'>At Assessment Count</td>";
		//String[] atAssessmentStatuses = { ParticipantStatus.ASSESSMENTCOMPLETE,ParticipantStatus.ASSESSMENTINCOMPLETE }; 
		//retValue +="<td style='padding-left:5px'>" + study.getParticipantCount(atAssessmentStatuses) + "</td>";
		//retValue +="</tr>";
		String nonUpdatedParticipants = String.valueOf(study.getParticipantCount(ParticipantStatus.NONE) 
				- study.getParticipantCount(ParticipantStatus.TOBEREVIEWED) 
				- study.getParticipantCount(ParticipantStatus.READYFORINTERVIEW) 
				- study.getParticipantCount(ParticipantStatus.READYFORASSESSMENT));
		retValue +="<tr>";
		retValue +="<td style='padding-left:" + indent + "px'>Not Yet Updated</td>";
		retValue +="<td style='padding-left:5px'>" + nonUpdatedParticipants  + "</td>";
		retValue +="</tr>";
		//        if (showAll) {
		//        	retValue +="<tr>";
		//        	retValue +="<td colspan=2 style='padding-left:5px'>Participant Tracking Statuses Count</td>";
		//        	retValue +="</tr><tr>";
		//        	retValue +="<td style='padding-left:" + indent + "px'>Active</td>";
		//            retValue +="<td style='padding-left:5px'>" + study.getParticipantCount(Status.ACTIVE)  + "</td>";
		//            retValue +="</tr>";
		//            retValue +="</tr><tr>";
		//        	retValue +="<td style='padding-left:" + indent + "px'>Ineligible</td>";
		//            retValue +="<td style='padding-left:5px'>" + study.getParticipantCount(Status.INELIGIBLE)  + "</td>";
		//            retValue +="</tr>";
		//            retValue +="</tr><tr>";
		//        	retValue +="<td style='padding-left:" + indent + "px'>Eligible</td>";
		//            retValue +="<td style='padding-left:5px'>" + study.getParticipantCount(Status.ELIGIBLE)  + "</td>";
		//            retValue +="</tr>";
		//            retValue +="</tr><tr>";
		//        	retValue +="<td style='padding-left:" + indent + "px'>Excluded</td>";
		//            retValue +="<td style='padding-left:5px'>" + study.getParticipantCount(Status.EXCLUDED)  + "</td>";
		//            retValue +="</tr>";
		//        }
		//               
		retValue +="</table>";
		return retValue;
	}

	public String showStudyOptions(Study study, String strSearch, ArrayList<User> searchedUsers, Boolean showModuleOptions) throws Exception {
		String retValue = "";
		String checked = "";

		retValue +="<table class=EditView cellspacing=0>";
		retValue += "<tr class=windowTop><td colspan=3 align=center>Study Options</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";			
		retValue +="<tr>";
		retValue +="<td class=studies>Status</td>";
		StudyStatus studyStatus = new StudyStatus(study.getStatusId());
		List<StudyStatus> statuses = studyStatus.getStudyStatuses("Occ");
		if(studyStatus.getId().equalsIgnoreCase(StudyStatus.INPROGRESS)){
			int i=0;
			for (Iterator<StudyStatus> it = statuses.iterator(); it.hasNext();) {
				DBBaseObject obj = (DBBaseObject) it.next();
				if(obj.getId().equalsIgnoreCase(StudyStatus.INITIALPHASE)){
					break;
				}
				i++;
			}
			statuses.remove(i);
		}
		retValue +="<td class=studies>" + this.showCombo(studyStatus.getId(),"studyStatus",statuses,false,false, false) + "</td>";

		retValue +="</tr>";
		retValue +="<tr>";
		retValue +="<td class=studynotes>Study Notes</td>";
		retValue +="<td class=studynotes>" + this.showStudyNotesList(study.getStudyNotes()) + "</td>";
		retValue +="</tr>";

		if (showModuleOptions) {
			retValue +="<tr>";
			//Module options
			retValue +="<td class=studies>Module Options</td>";
			retValue +="<td class=studies>";
			retValue +="<table>";
			checked = "";
			if(study.hasOption(Study.Option.USEOCCIDEAS)){
				checked = "checked";
			}
			retValue +="<tr><td>Use OccIDEAS Modules</td><td><input type=checkbox name=useoccideas "+checked+"></input></td></tr>";
			checked = "";
			if(study.hasOption(Study.Option.USEPARTICIPANT)){
				checked = "checked";
			}
			retValue +="<tr><td>Use Participant Tracking Module</td><td><input type=checkbox name=useparticipant "+checked+"></input></td></tr>";
			checked = "";
			if(study.hasOption(Study.Option.USEBIOSPECIMENS)){
				checked = "checked";
			}
			retValue +="<tr><td>Use Biospecimens Module</td><td><input type=checkbox name=usebiospecimens "+checked+"></input></td></tr>";

			retValue +="</table>";
			retValue +="</td>";
			retValue +="</tr>";			
		}
		//Begin study options
		retValue +="<tr>";
		retValue +="<td class=studies>Interview Options</td>";

		retValue +="<td class=studies>";
		retValue +="<table>";
		//checked = "";
		//if(study.hasOption(Study.Option.GLOBALDONTKNOW)){
		//	checked = "checked";
		//}
		//retValue +="<tr><td>Show global \"Don't know\" option</td><td><input type=checkbox name=globalDontKnow "+checked+"></input></td></tr>";
		checked = "";
		if (study.hasOption(Study.Option.AUTOGENERATEID)) {
			checked = "checked=true";}else{checked = "";
			}
		retValue += "<tr><td>Select to Auto Generate Ref Number</td><td align=left><input type=checkbox name=autoselect " + checked + "></input></td>";
		checked = "";
		if (study.hasOption(Study.Option.CAT3FREQ)) {
			checked = "checked=true";
		}else{
			checked = "";
		}
		retValue += "<tr><td>Set Hour Frequency Questions to 3-category answer</td><td align=left><input type=checkbox name=cat3freq " + checked + "></input></td>";
		retValue +="<tr><td>Interview Start Note</td><td><input type=text name=startNote size=40 value='" + study.getStartNote() + "'></input></td></tr>";
		retValue +="<tr><td>Interview End Note</td><td><input type=text name=endNote size=40 value='" + study.getEndNote() + "'></input></td></tr>";
		retValue +="</table>";

		retValue +="</td>";
		retValue +="</tr>";

		retValue +="<tr>";
		retValue +="<td valign=top>User Management</td><td>";
		retValue +="<table class=ContentUserList>";       	
		retValue +="<tr>";
		retValue +="<td valign=top>";
		//User user = new User();
		retValue += this.showUserJSMsSelect(study.getUsers());//user.getAllUsers(),
		retValue +="</td>";
		retValue +="</tr>";

		retValue += "<tr class=SearchboxRow><td align=center>";
		retValue += this.showSearchBoxUsers(strSearch);
		retValue += "</td></tr>";
		retValue += "<tr class=SearchboxRow><td width=100% align=center>";
		if (searchedUsers != null) {
			if (searchedUsers.size() != 0) {
				retValue += this.showSearchedUsersBox(searchedUsers);
			}else{
				retValue += "<tr class=SearchboxRow><td style='text-align:center;width:30%;color:orange;font-size:8pt'>No user names containing string \"" + strSearch + "\" found</td><tr>";
			}
		}
		retValue +="</td>";
		retValue +="</tr>";
		retValue +="</table>";
		retValue +="<input type=hidden name=optionsMode value=true />";
		retValue +="</td>";
		retValue +="</tr>"; 
		retValue +="</table>";
		return retValue;
	}
	public String showStudyUserManagement(Study study) throws Exception{
		String retValue = "";

		retValue +="<table>";
		retValue +="<tr><td width=60%></td><td>";
		retValue +="<table>";
		retValue +="<tr><td valign=top><b>User Management</b></td></tr>";
		retValue +="<tr><td>" + study.getName() + "</td></tr>";
		retValue +="<tr><input type=hidden name=studyID value=" + study.getId() + "></tr>";
		retValue +="<tr><td>";
		retValue +="<table>";       	
		retValue +="<tr>";
		retValue +="<td valign=top>";
		retValue += this.showUserJSMsSelect(study.getUsers());
		retValue +="</td>";
		retValue +="</tr>";
		retValue +="</table>";
		retValue +="</td>";
		retValue +="</tr>"; 
		retValue +="</table>";
		retValue +="</td>";
		retValue +="</tr>";
		retValue +="</table>";
		return retValue;
	}
	public String showUserJSMsSelect(List<User> array, List<User> selected) throws Exception {
		String strHTML = "\n<table><tr><td><div><table>";
		for (User user : array) {
			strHTML += "<tr><td valign=top>";
			String strChecked = "";
			String strCheckedClass = "UserSelectUnchecked";			
			if ((selected!=null) &&(selected.contains(user))) {
				strChecked = "checked";
				strCheckedClass = "UserSelectChecked";
				strHTML += "<div class=\"" + strCheckedClass + "\" id="
						+ user.getId() + "><input id=" + user.getId()
						+ "  type=checkbox " + strChecked + " name=usersCheckBox_"
						+ user.getId() + " onfocus=toggleClass('" + user.getId()
						+ "','UserSelectChecked','UserSelectUnchecked');></input><label for="
						+ user.getId() + ">" + user.getUserName() + "</label></div>\n";

				strHTML += "</div>";
				strHTML += "</td></tr>";
			}else{
				strHTML += "No users Selected";
				strHTML += "</td></tr>";
			}
		}
		strHTML += "</table>\n";
		strHTML += "</div>\n";
		strHTML += "</td></tr></table>\n";

		return strHTML;
	}	

	public String showNavTitle(ArrayList<Object> arrayL) {
		String strNavTitle = "<table width=100% class=NavTitle cellspacing=0><tr><td style='width:90%;text-align:left;'>";
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
					if(strLocation.equalsIgnoreCase("Next")){
						strNavTitle += "<a href=ControllerServlet?Action=Next onclick=\"return showProgress()\"><img border=0 src='ImageStream?ImageName=moveright.gif' alt=next /></a>";   	                    
					}else if(strLocation.equalsIgnoreCase("To Excel")){
						strNavTitle += "<a href=ControllerServlet?Action=ShowReportExcel onclick=\"return showProgress()\"><img border=0 width=16px height=16px src='ImageStream?ImageName=toExcel.jpg' alt='To Excel' /></a>";
					}else if(strLocation.contains("Questionnaire/")||strLocation.contains("Studies/")||strLocation.contains("Assessment/")||strLocation.contains("StudyMgr/")){
						//do nothing
					}else if(strLocation.toLowerCase().contains("study maintenance")){
						strNavTitle += "<a href=main.jsp?Location=Studies onclick=\"return showProgress()\">"+strLocation+":</a>>";

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
						strNavTitle += strClassName+":"+dbobj.getName()+">";
					}else{
						if (dbobj instanceof Participant){
							Participant p = (Participant)dbobj;
							strNavTitle += "<a href=main.jsp?"+strClassName.toLowerCase()+"ID="+p.getParticipantId()+ " onclick=\"return showProgress()\">"+strClassName+":</a>"+dbobj.getName()+">";
						}else{
							strNavTitle += "<a href=main.jsp?"+strClassName.toLowerCase()+"ID="+dbobj.getId()+ " onclick=\"return showProgress()\">"+strClassName+":</a>"+dbobj.getName()+">";
						}
					}	        	
				}   	       		
			}       	
			++count;
		}
		wikiPage = Util.getWikiPage(navPath);

		strNavTitle += "</td><td style='width:10%;text-align:right;' title='OccIDEAS Wiki Help'> <a href='http://wiki.occideas.org/JSPWiki/Wiki.jsp";
		if (!wikiPage.equals("")) {
			strNavTitle += "?page=" + wikiPage;
		}
		strNavTitle += "' target='_blank'>Help</a> </td></tr></table>";
		return strNavTitle;
	}
	public String showStudyEdit(Study study,String error) throws Exception {
		String retValue = ""; 
		retValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		if(study.getId().equalsIgnoreCase("")){
			retValue += "<tr class=windowTop><td colspan=2 align=center>New Study</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";			
		}else{
			retValue += "<tr class=windowTop><td colspan=2 align=center>Edit Study "+study.getName()+"</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";					
		}
		retValue += "<tr><td>Name</td><td><input type=text name=studyname value=\""+study.getName() +"\"></input>";
		if (!error.equalsIgnoreCase("")){
			retValue += "<div style='color:red;'>" + error + "</div>";	
		}
		retValue +="</td></tr>";
		retValue +="<tr>";
		retValue +="<td>Description: </td><td><input type=text name=description size=100 value='" + study.getDescription() + "'></input></td>";
		retValue +="</tr>";
		retValue += "<script language=javascript type='text/javascript'>setFocus('studyname');</script>";  				
		retValue += "</table>";
		return retValue;
	}
	/*	public String showMappingJob(JobHistory jh,ArrayList<JobTitle> jobs) throws Exception{
		String strHTML = "";		
		strHTML += "<table class=EditView cellspacing=0>";
		strHTML += "<tr class=windowTop ><td align=center>Mapping Jobs to JSMs</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12/></td></tr>";
		strHTML += "<tr ><td>";
		strHTML += "<fieldset>";
		strHTML += "<Legend>Current Job Mappings</legend>";
		strHTML += "<table class=jobs>";
		strHTML += "<tr><td class=jobs><b>Reference</b></td><td class=jobs><b>Job Title</b></td><td class=jobs><b>Tasks</b></td><td class=jobs><b>Mapped</b></td><td class=jobs><b>OccIDEAS Job</b></td><td class=jobs><b>keywords</b></td></tr>";		
		strHTML += "<tr><td class=jobs>"+jh.getReferenceNumber()+"</td><td class=jobs>"+jh.getJobDescription()+"</td><td class=jobs>"+this.showList(jh.getJobHistorytasks())+"</td><td class=jobs>"+jh.getMappedJSMName()+"</td><td class=jobs>"+jh.getMappedJobName()+"</td><td class=jobs>";
		if(jh.getMappedJob()!=null){
			strHTML += this.showList(jh.getMappedJob().getKeywords());
		}
		strHTML += "</td></tr>";		
		strHTML += "</table>";
		strHTML += "</fieldset>";
		strHTML += "</td></tr>";		
		strHTML += "<tr><td valign=top>";	
		strHTML += "<fieldset>";
		strHTML += "<Legend>Suggestions</legend>";
		strHTML += this.showJobSuggections(jh); 	
		strHTML += "</fieldset>";
		strHTML += "</td></tr>";				
		strHTML += "<tr><td valign=top>";		
		strHTML += "<fieldset>";
		strHTML += "<Legend>Search for more options</legend>";
		strHTML += "<table>";
		strHTML += "<tr>";
		strHTML += "<td></td><td></input><input type=text name=keyword></input></td>";
		strHTML += "<td><input type=submit name=Action value='Search For Job'></input></td>";
		strHTML += "</tr>";
		strHTML += "</table>";					
		strHTML += this.showJobsWithJSM(jobs,"");		
		strHTML += "</fieldset>";
		strHTML += "<input type=hidden id=radioChangeFlag value=0 /></td></tr></table>";

		return strHTML;
	}*/
	/*	public String showJobSuggections(JobHistory jh) throws Exception{
		String strHTML = "";
		ArrayList<JobTitle> jobs = jh.getJobMappingSuggestions();
		if(jobs!=null){
			strHTML = "<table class=jobs cellspacing=0 cellpadding=0>";
			strHTML += "<tr><td class=jobs></td><td class=jobs><b>Job Title</b></td><td class=jobs><b>JSM</b></td><td class=jobs align=center><b>Keywords</b></td></tr>";
			for (JobTitle jt:jobs) {
				String strHiglightedKeywords = "";
				for(Keyword kw: jt.getKeywords()){
					strHiglightedKeywords += kw.getName()+",";
					for(JobHistoryTask jht:jh.getJobHistorytasks()){
						if(jht.getName().contains(kw.getName())){
							strHiglightedKeywords = this.highlightSearch(strHiglightedKeywords,kw.getName());
						}
					}
				}
				strHTML += "<tr><td width=5% align=center class=jobs><input id="+jt.getId()+" type=radio name=jobsRadio value="+jt.getId()+" onclick=removeCheckIfChecked("+jt.getId()+");></input></td>"
				+"<td class=jobs>"
				+ "<label for="+jt.getId()+" >" + jt.getName() + "</label>"
				+"</td><td class=jobs>"
				+jt.getJsmName()
				+"</td><td class=jobs>"
				+strHiglightedKeywords
				+"</td></tr>";
			}
			if(! jobs.isEmpty()) {
				strHTML += "<tr><td colspan=4></td></tr>";
			}
			strHTML += "</table>";
		}		
		return strHTML;
	}*/
	/*	public String showJobsWithJSM(ArrayList<JobTitle> jobs, String search) throws Exception{
		String strHTML = "";
		if(jobs!=null){
			strHTML = "<table class=jobs cellspacing=0 cellpadding=0>";
			strHTML += "<tr><td class=jobs></td><td class=jobs><b>Job Title</b></td><td class=jobs><b>JSM</b></td><td class=jobs align=center><b>Keywords</b></td></tr>";
			for (Iterator<JobTitle> it = jobs.iterator(); it.hasNext();) {
				JobTitle jt = (JobTitle) it.next();
				strHTML += "<tr><td width=5% align=center class=jobs><input id="+jt.getId()+" type=radio name=jobsRadio value="+jt.getId()+" onclick=removeCheckIfChecked("+jt.getId()+");></input></td>"
				+"<td class=jobs>"
				+ "<label for="+jt.getId()+" >" + this.highlightSearch(jt.getName(),search) + "</label>"
				+"</td><td class=jobs>"
				+this.highlightSearch(jt.getJsmName(),search)
				+"</td><td class=jobs>"
				+this.showList(jt.getKeywords(),search)
				+"</td></tr>";
			}
			if(! jobs.isEmpty()) {
				strHTML += "<tr><td colspan=4></td></tr>";
			}
			strHTML += "</table>";
		}

		return strHTML;
	}*/	
	@SuppressWarnings("rawtypes")
	public String showStudyNotesList(ArrayList array) {
		String strHTML = "";
		if (! array.isEmpty()) {
			for (Iterator it = array.iterator(); it.hasNext();) {
				Object o = it.next();
				if (o instanceof DBBaseObject) {
					strHTML += "<a href=ImportStudyNotesServlet?sNoteID=";
					DBBaseObject obj = (DBBaseObject) o;
					String id = obj.getId();
					String name = obj.getName();
					strHTML += id + " onclick=\"return showProgress()\">";
					strHTML += name + "</a>";
					if (it.hasNext()) {
						strHTML += ",";
					}
				}
			}
		}
		return strHTML;
	}	
	public String showStudyAgents(Study study,boolean bPreviewMode,ArrayList<JobSpecificModule> excludedJSMs) throws Exception {
		String retValue = "";
		retValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		retValue += "<tr class=windowTop><td align=center>Study Agents</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";			
		if(bPreviewMode){
			ArrayList<JobSpecificModule> studyJSMs = study.getStudySpecificJsmsPreview();
			retValue += "<tr><td >";
			retValue += "<table class=ContentList>";
			retValue += "<tr class=ListHeader><td>Study Specific JSMs</td><td align=center>Full Question Count</td><td align=center>Max time to generate</td></tr>";
			for(JobSpecificModule jsm: studyJSMs){
				String highlight = "";
				if(excludedJSMs.contains(jsm)){
					highlight = "class=warning";					
				}
				retValue += "<tr>";
				int qCount = jsm.getQuestionCount();
				long estTime = Math.round(((double)qCount/(double)60)*(double)10);
				retValue += "<td valign=top "+highlight+"><input id="
						+ jsm.getId()+" type=checkbox name=jsmsCheckBox_"
						+ jsm.getId()
						+ "></input>"+jsm.getName()+"</td><td align=center "+highlight+">"+qCount+"</td><td align=center "+highlight+">"+estTime+" seconds</td>";
				retValue += "</tr>";					
			}
			retValue += "</table>";	
			retValue += "</td></tr>";
		}
		AgentGroup ag = new AgentGroup();
		retValue += "<tr><td>"+this.showAgentGroups(ag.getAgentGroups(),study.getAgents())+"</td></tr>";
		retValue += "</table>";
		return retValue;
	}

	public String showStructuredJSM(FrozenJobSpecificModule fjsm,Study study) throws Exception {
		String retValue = "";
		retValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		retValue += "<tr class=windowTop><td colspan=2 align=center>Archived reports</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";			
		retValue +="<tr><td><input type=checkbox name=ArchiveData />Click to archive the next report generated</td></tr>";
		retValue +="<tr>";
		retValue +="<td>";
		retValue +="<table width=100%>";       	
		retValue +="<tr>";
		retValue +="<td valign=top>";
		retValue += this.showReportsInterviews(study,fjsm);
		retValue +="</td>";
		retValue +="</tr>";
		retValue +="</table>";
		retValue +="</td>";
		retValue +="</tr>"; 
		retValue += "</table>";

		retValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		retValue += "<tr class=windowTop><td colspan=2 align=center>Structured Frozen JSM</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";			
		retValue +="<tr>";
		retValue +="<td>";
		retValue +="<table width=100%>";       	
		retValue +="<tr>";
		retValue +="<td valign=top>";
		retValue += this.showFrozenJSM(fjsm);
		retValue +="</td>";
		retValue +="</tr>";
		retValue +="</table>";
		retValue +="</td>";
		retValue +="</tr>"; 
		retValue += "</table>";
		return retValue;
	}
	public String showFrozenJSM(FrozenJobSpecificModule fjsm) throws Exception {
		String retValue = "";
		retValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		//retValue += "<tr class=windowTop><td colspan=2 align=center>Structured Frozen JSM</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12/></td></tr>";			
		retValue +="<tr>";
		retValue +="<td>";
		retValue +="<table width=100%>";       	
		retValue +="\n<tr class=ListHeader><td align=center>FullText</td><td align=center>KeyPhrase</td><td align=center>LookUpID</td></tr>";
		int iSequence = 1;
		String prefix = fjsm.getName();
		for(FrozenQA qa:fjsm.getFrozenQuestionsAndAnswers()){
			String description = "";
			String keyphrase = "";
			String lookupid = "";
			if(qa.getQuestionId()!=null){
				description = "<b>"+qa.getQuestionDescription()+"</b>";
				keyphrase = qa.getQuestionName();
				lookupid = prefix+iSequence;
				iSequence++;
			}else{
				description = qa.getAnswerDescription();
				keyphrase = "";
			}
			retValue +="\n<tr><td style='padding-left:"+qa.getIndentLevel()+"0px'>"+description+"</td><td>"+keyphrase+"</td><td>"+lookupid+"</td></tr>";    	
		}       
		retValue +="</table>";
		retValue +="</td>";
		retValue +="</tr>"; 
		retValue += "</table>";
		return retValue;
	}
	public String showStructuredJSM(JobSpecificModule jsm) throws Exception {
		String retValue = "";
		retValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		retValue += "<tr class=windowTop><td colspan=2 align=center>Structured Study Specific JSM</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";			
		retValue +="<tr>";
		retValue +="<td>";
		retValue +="<table width=100%>";       	
		retValue +="<tr>";
		retValue +="<td valign=top>";
		retValue += this.showFullQuestions(jsm.getQuestions(),"",false,false,true,"");
		retValue +="</td>";
		retValue +="</tr>";
		retValue +="</table>";
		retValue +="</td>";
		retValue +="</tr>"; 
		retValue += "</table>";
		return retValue;
	}

	public String showStudyWithJSMs(Study study, String selJSMId) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";
		ArrayList<JobSpecificModule> ssJSMs = study.getStudySpecificJsms();      
		if(ssJSMs.size()==0){
			strRetValue += "\n<tr><td style='padding-left:5px'>No Study Specific JSMs</td></tr>";
		}else{
			for (JobSpecificModule jsm : ssJSMs) {
				if(jsm.isAssociateModule()){
					continue;
				}
				String strClass = "";
				if (jsm.getId().equalsIgnoreCase(selJSMId)) {
					strClass = " class=lhsJSM";
				} else {
					strClass = " class=lhsStudyJSM";
				}
				String frozenJSMLinks = "";
				int i=1;
				for(FrozenJobSpecificModule fjsm: jsm.getFrozenJSMs(study.getId())){
					frozenJSMLinks += "<a class=LHSMenu href=main.jsp?jsmID="
							+ fjsm.getId()
							+ "&isFrozen=True onclick=\"return showProgress()\" title='"+fjsm.getDateCreated()+"'>"
							+ i
							+ "</a>";
					i++;
				}          
				strRetValue += "\n<tr><td "+strClass+" title='" + jsm.getDescription() + "' style='padding-left:5px'><a href=main.jsp?jsmID="
						+ jsm.getId()
						+ " onclick=\"return showProgress()\">"
						+ this.truncateName(jsm.getName(), JSMLENGTH)
						+ "</a> "+frozenJSMLinks+"</td></tr>";
			}
		}
		ArrayList<Study> otherStudies = study.getStudies(Study.Option.USEOCCIDEAS);
		if(otherStudies.size()>1){

			strRetValue += "\n<tr><td><hr/><b>Other Studies</b></td></tr>";
			for(Study otherStudy: otherStudies){
				if(!(otherStudy.getId().equalsIgnoreCase(study.getId()))){
					strRetValue += "\n<tr><td class=studies title='" + otherStudy.getDescription() + "'><a class=LHSMenu href=main.jsp?studyID="
							+ otherStudy.getId()
							+ " onclick=\"return showProgress()\">"
							+ this.truncateName(otherStudy.getName(), STUDYLENGTH)
							+ "</a></td></tr>";
				}       	
			}
		}       
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showParticipantReportHTML(Study study) throws Exception {
		String strRetValue = "<table border=1>";
		strRetValue += "<tr><td>ParticipantReferenceNumber</td>" +
				"<td>JobHistoryReferenceNumber</td>" +
				"<td>JobHistoryStatus</td>" +
				"<td>JobDescription</td>" +
				"<td>JobTasks</td>" +
				"<td>Age</td>" +
				"<td>StartingYear</td>" +
				"<td>DurationInYears</td>" +
				"<td>WeekPerYear</td>" +
				"<td>HoursPerWeek</td>" +
				"<td>Employer</td>" +
				"<td>Suburb</td>" +
				"<td>State</td>" +
				"<td>Country</td></tr>";
		for(JobHistory jh: study.getJobHistories()){
			strRetValue += "<tr>";
			strRetValue += "<td>"+jh.getParticipantReferenceNumber()+"</td>";
			strRetValue += "<td>"+jh.getStatusId()+"</td>";
			strRetValue += "<td>"+jh.getReferenceNumber()+"</td>";
			strRetValue += "<td>"+jh.getJobDescription()+"</td>";
			strRetValue += "<td>"+ jh.getJobTitle();//+this.showList(jh.getJobHistorytasks())+"</td>";
			strRetValue += "<td>"+jh.getAge()+"</td>";
			strRetValue += "<td>"+jh.getYearStarted()+"</td>";
			strRetValue += "<td>"+jh.getDurationYears()+"</td>";
			strRetValue += "<td>"+jh.getWeeksPerYear()+"</td>";
			strRetValue += "<td>"+jh.getHoursPerWeek()+"</td>";
			strRetValue += "<td>"+jh.getEmployer()+"</td>";
			strRetValue += "<td>"+jh.getSuburb()+"</td>";
			strRetValue += "<td>"+jh.getState()+"</td>";
			strRetValue += "<td>"+jh.getCountry()+"</td>";
			strRetValue += "</tr>";
		}		
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showReportsJobHistories(Study study) throws Exception {
		String strRetValue = "";
		strRetValue += "<table class=EditView cellspacing=0 bgcolor=#f9faff>";
		strRetValue += "<tr class=windowTop ><td align=right>Archived Reports</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEditI title='Close Edit Mode' height=16 width=16/></td></tr>";
		strRetValue += "<tr class=ListHeader><td>Name</td><td>Time Stamp</td></tr>";
		int i=1;
		for(Report report: study.getReportsJobHistories()){
			strRetValue += "<tr>";
			String name = report.getName();
			if(name.equalsIgnoreCase("")){
				name = study.getName()+"JobHistoryReport"+i;
			}
			strRetValue += "<td>"+name+"</td><td><a href=ControllerServlet?Action=ActionButton&Report=JobHistory&ReportId="+report.getId()+">"+report.getDateCreated()+"</a></td>";
			strRetValue += "</tr>";
			i++;
		}		
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showReportsInterviews(Study study,FrozenJobSpecificModule fjsm) throws Exception {
		String strRetValue = "";
		strRetValue += "<table class=EditView cellspacing=0 bgcolor=#f9faff>";
		strRetValue += "<tr class=ListHeader><td>Name</td><td>Time Stamp</td></tr>";
		int i=1;
		for(Report report: study.getReportsInterviews(fjsm)){
			strRetValue += "<tr>";
			String name = report.getName();
			if(name.equalsIgnoreCase("")){
				name = fjsm.getName()+"Report"+i;
			}
			strRetValue += "<td>"+name+"</td><td><a href=ControllerServlet?Action=ActionButton&Report=JobHistory&ReportId="+report.getId()+">"+report.getDateCreated()+"</a></td>";
			strRetValue += "</tr>";
			i++;
		}		
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showOccIdeasReport(OccIdeasReport occRpt) throws Exception {
		String retValue = "";
		retValue +="<table class=EditView><tr>";
		retValue +="<td style='font-weight:bold;'>Status</td><td style='font-weight:bold;'>Count</td></tr><tr>";
		for (int x=0;x<7;x++){
			retValue += "<tr><td>" + occRpt.getReportData()[x][0] + "</td><td style='Text-Align:right;'>" + occRpt.getReportData()[x][1] + "</td></tr>";
		}
		retValue +="</tr>";
		retValue +="</table>";
		return retValue;
	}
	public String showParticipantTrackingReport(ParticipantTrackingReport occRpt) throws Exception {
		String retValue = "";
		retValue +="<table class=EditView><tr>";
		retValue +="<td style='font-weight:bold;'>Status</td><td style='font-weight:bold;'>Count</td></tr><tr>";
		for (int x=0;x<4;x++){
			retValue += "<tr><td>" + occRpt.getReportData()[x][0] + "</td><td style='Text-Align:right;'>" + occRpt.getReportData()[x][1] + "</td></tr>";
		}
		retValue +="</tr>";
		retValue +="</table>";
		return retValue;
	}
	public String showBiospecimensReport(BiospecimensReport occRpt) throws Exception {
		String retValue = "";
		retValue +="<table class=EditView><tr>";
		retValue +="<td style='font-weight:bold;'>Status</td><td style='font-weight:bold;'>Count</td></tr><tr>";
		for (int x=0;x<19;x++){
			retValue += "<tr><td>" + occRpt.getReportData()[x][0] + "</td><td style='Text-Align:right;'>" + occRpt.getReportData()[x][1] + "</td></tr>";
		}
		retValue +="</tr>";
		retValue +="</table>";
		return retValue;
	}
	public String showInterviewersReport(List<Participant> participants) throws Exception {
		String retValue = "";

		String bodyRows = "";
		//int iMax = 0;
		for(Participant p: participants){
			List<JobHistory> jhs = p.getJobHistories(JobHistoryStatus.TOBEINTERVIEWED, "order by priority");
			for(JobHistory jh:jhs){	
				bodyRows += "<tr>";		
				bodyRows += "<td>"+p.getOccContactNo()+"</td>";	
				bodyRows += "<td>"+p.getReferenceNumber()+"</td>";
				bodyRows += "<td>"+jh.getPriority()+"</td>";
				bodyRows += "<td>"+p.getReferenceNumber()+"_"+jh.getReferenceNumber()+"</td>";
				bodyRows += "<td>"+p.getFirstName()+"</td>";
				bodyRows += "<td>"+p.getLastName()+"</td>";
				bodyRows += "<td>"+jh.getDurationYears()+"</td>";
				bodyRows += "<td>"+jh.getYearStarted()+"</td>";
				bodyRows += "<td>"+jh.getJobDescription()+"</td>";
				bodyRows += "<td>"+jh.getEmployer()+"</td>";
				//bodyRows += "<td>"+jh.getStaticTasks()+"</td>";
				bodyRows += "<td>"+jh.getCountry()+"</td>";
				bodyRows += "<td>"+jh.getFinalJSMName()+"</td>";
				bodyRows += "</tr>";
			}							
		}

		String headerRow = "<tr>";
		headerRow += "<td>Phone Number</td>";
		headerRow += "<td>ID</td>";		
		headerRow += "<td>Job Priority #</td>";		
		headerRow += "<td>Person_Job_ID</td>";		
		headerRow += "<td>Firstname</td>";		
		headerRow += "<td>Surname</td>";		
		headerRow += "<td>Duration of Job</td>";		
		headerRow += "<td>Year Started</td>";	
		headerRow += "<td>Job Title</td>";	
		headerRow += "<td>Employer</td>";	
		//headerRow += "<td>Tasks</td>";	
		headerRow += "<td>Country (if not Australia)</td>";	
		headerRow += "<td>JSM</td>";	
		headerRow += "</tr>";
		retValue = "<table border=1>";
		retValue += headerRow;
		retValue += bodyRows;
		retValue += "</table>";
		return retValue;
	}



	public String showAmrReport(List<Participant> participants) throws Exception {
		String retValue = "";
		String bodyRows = "";

		Agent agent = new Agent("146");//asbestos
		//int iMax = 0;
		for(Participant p: participants){
			List<JobHistory> jhs = p.getJobHistories();
			for(JobHistory jh:jhs){	//assessments

				Assessment assessmentAuto = jh.getAutoAssessment(agent.getId()).getId().equals("")?null:jh.getAutoAssessment(agent.getId());
				Assessment assessmentManual = jh.getManualAssessment(agent.getId()).getId().equals("")?null:jh.getManualAssessment(agent.getId());

				bodyRows += "<tr>";		
				bodyRows += "<td>"+p.getReferenceNumber()+"</td>";
				bodyRows += "<td>"+jh.getReferenceNumber()+"</td>";
				bodyRows += "<td>"+jh.getStatusId()+"</td>";
				bodyRows += "<td>"+jh.getStatusName()+"</td>";
				bodyRows += "<td>"+jh.getFinalJSMId()+"</td>";
				if (assessmentManual != null) {
					//bodyRows += "<td> - </td>";
					bodyRows += "<td>"+assessmentManual.getExposure()+"</td>";
					bodyRows += "<td>"+assessmentManual.getLevel()+"</td>";
					bodyRows += "<td>"+assessmentManual.getFrequencyweeks()+"</td>";
					bodyRows += "<td>"+assessmentManual.getFrequencyhours()+"</td>";
				}else{
					//bodyRows += "<td> - </td>";
					bodyRows += "<td>No Manual</td>";
					bodyRows += "<td>No Manual</td>";
					bodyRows += "<td>No Manual</td>";
					bodyRows += "<td>No Manual</td>";
				}
				if (assessmentAuto != null) {
					bodyRows += "<td>"+assessmentAuto.getExposure()+"</td>";
					bodyRows += "<td>"+assessmentAuto.getLevel()+"</td>";
					bodyRows += "<td>"+assessmentAuto.getFrequencyhours()+"</td>";
					bodyRows += "<td>"+assessmentAuto.getFrequencyweeks()+"</td>";
				}else{
					bodyRows += "<td>No Auto</td>";
					bodyRows += "<td>No Auto</td>";
					bodyRows += "<td>No Auto</td>";
					bodyRows += "<td>No Auto</td>";
				}
				bodyRows += "<td>"+jh.getFinalJSMName()+"</td>";
				bodyRows += "<td>"+p.getReferenceNumber()+"_"+jh.getReferenceNumber()+"</td>";			
				bodyRows += "<td>"+p.getAmrRefId()+"</td>";
				bodyRows += "<td>"+jh.getEmployer()+"</td>";
				bodyRows += "<td>"+jh.getJobDescription()+"</td>";
				bodyRows += "<td>"+jh.getJobTitle()+"</td>";
				bodyRows += "<td>"+p.getGender()+"</td>";
				bodyRows += "<td>"+p.getStatusName()+"</td>";
				bodyRows += "</tr>";
/*
				//If jhref number = 1(i.e. it is the enviro asbestos jsm) then write lines for 'by root question' assessment 
				if (jh.getReferenceNumber().equals("1") && assessmentAuto != null) {
					ArrayList<QuestionAssessment> rootQuestionAssessments = assessmentAuto.getRootQuestionAssessments();
					for (QuestionAssessment questionAssessment : rootQuestionAssessments) {
						Question question = new Question("",questionAssessment.getJsmquestionstructureid());
						bodyRows += "<tr>";	
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>"+jh.getFinalJSMId() + "</td>";
						bodyRows += "<td>" + question.getName() + "</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>" + questionAssessment.getExposure() + "</td>";
						bodyRows += "<td>" + questionAssessment.getLevel() + "</td>";
						bodyRows += "<td>" + questionAssessment.getFrequencyhours() + "</td>";
						bodyRows += "<td>" + questionAssessment.getFrequencyweeks() + "</td>";
						bodyRows += "</tr>";
					}
				}
				*/
			}							
		}

		String headerRow = "<tr>";
		headerRow += "<td>PaticipantRefNo</td>";		
		headerRow += "<td>JobHistoryReferenceNumber</td>";		
		headerRow += "<td>JobHistoryStatusId</td>";	
		headerRow += "<td>JobHistoryStatus</td>";
		headerRow += "<td>JSM No</td>";
//		headerRow += "<td>Question</td>";	
		headerRow += "<td>Asbestos_Probable_Manual</td>";		
		headerRow += "<td>Asbestos_Level_Manual</td>";		
		headerRow += "<td> Asbestos_Weeks_Manual</td>";	
		headerRow += "<td> Asbestos_Hours_Manual</td>";	
		headerRow += "<td> Asbestos_Probable_Auto</td>";	
		headerRow += "<td> Asbestos_Level_Auto</td>";
		headerRow += "<td>Asbestos_Weeks_Auto</td>";
		headerRow += "<td>Asbestos_Hours_Auto</td>";
		headerRow += "<td>JSMName</td>";	
		headerRow += "<td>NewKey</td>";	
		headerRow += "<td>AMRID</td>";	
		headerRow += "<td>Employer</td>";	
		headerRow += "<td>Jobdescription</td>";
		headerRow += "<td>JobTitle</td>";
		headerRow += "<td>Sex</td>";
		headerRow += "<td>Status of participant</td>";
		headerRow += "</tr>";
		retValue = "<table border=1>";
		retValue += headerRow;
		retValue += bodyRows;
		retValue += "</table>";
		return retValue;
	}
	
	public String showAmrReportAsCsv(List<Participant> participants) throws Exception {
		String retValue = "";
		String bodyRows = "";

		Agent agent = new Agent("146");//asbestos
		//int iMax = 0;
		for(Participant p: participants){
			List<JobHistory> jhs = p.getJobHistories();
			for(JobHistory jh:jhs){	//assessments

				Assessment assessmentAuto = jh.getAutoAssessment(agent.getId()).getId().equals("")?null:jh.getAutoAssessment(agent.getId());
				Assessment assessmentManual = jh.getManualAssessment(agent.getId()).getId().equals("")?null:jh.getManualAssessment(agent.getId());

				//bodyRows += "<tr>";		
				bodyRows += "\""+p.getReferenceNumber()+"\",";
				bodyRows += "\""+jh.getReferenceNumber()+"\",";
				bodyRows += "\""+jh.getStatusId()+"\",";
				bodyRows += "\""+jh.getStatusName()+"\",";
				bodyRows += "\""+jh.getFinalJSMId()+"\",";
				if (assessmentManual != null) {
					//bodyRows += "<td> - </td>";
					bodyRows += "\""+assessmentManual.getExposure()+"\",";
					bodyRows += "\""+assessmentManual.getLevel()+"\",";
					bodyRows += "\""+assessmentManual.getFrequencyweeks()+"\",";
					bodyRows += "\""+assessmentManual.getFrequencyhours()+"\",";
				}else{
					//bodyRows += "<td> - </td>";
					bodyRows += "\"No Manual\",";
					bodyRows += "\"No Manual\",";
					bodyRows += "\"No Manual\",";
					bodyRows += "\"No Manual\",";
				}
				if (assessmentAuto != null) {
					bodyRows += "\""+assessmentAuto.getExposure()+"\",";
					bodyRows += "\""+assessmentAuto.getLevel()+"\",";
					bodyRows += "\""+assessmentAuto.getFrequencyhours()+"\",";
					bodyRows += "\""+assessmentAuto.getFrequencyweeks()+"\",";
				}else{
					bodyRows += "\"No Auto\",";
					bodyRows += "\"No Auto\",";
					bodyRows += "\"No Auto\",";
					bodyRows += "\"No Auto\",";
				}
				bodyRows += "\""+jh.getFinalJSMName()+"\",";
				bodyRows += "\""+p.getReferenceNumber()+"_"+jh.getReferenceNumber()+"\",";			
				bodyRows += "\""+p.getAmrRefId()+"\",";
				bodyRows += "\""+jh.getEmployer()+"\",";
				bodyRows += "\""+jh.getJobDescription()+"\",";
				bodyRows += "\""+jh.getJobTitle()+"\",";
				bodyRows += "\""+p.getGender()+"\",";
				bodyRows += "\""+p.getStatusName()+"\",";
				bodyRows += "\n";
/*
				//If jhref number = 1(i.e. it is the enviro asbestos jsm) then write lines for 'by root question' assessment 
				if (jh.getReferenceNumber().equals("1") && assessmentAuto != null) {
					ArrayList<QuestionAssessment> rootQuestionAssessments = assessmentAuto.getRootQuestionAssessments();
					for (QuestionAssessment questionAssessment : rootQuestionAssessments) {
						Question question = new Question("",questionAssessment.getJsmquestionstructureid());
						bodyRows += "<tr>";	
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>"+jh.getFinalJSMId() + "</td>";
						bodyRows += "<td>" + question.getName() + "</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>" + questionAssessment.getExposure() + "</td>";
						bodyRows += "<td>" + questionAssessment.getLevel() + "</td>";
						bodyRows += "<td>" + questionAssessment.getFrequencyhours() + "</td>";
						bodyRows += "<td>" + questionAssessment.getFrequencyweeks() + "</td>";
						bodyRows += "</tr>";
					}
				}
				*/
			}							
		}

		String headerRow = "";
		headerRow += "\"PaticipantRefNo\",";		
		headerRow += "\"JobHistoryReferenceNumber\",";		
		headerRow += "\"JobHistoryStatusId\",";	
		headerRow += "\"JobHistoryStatus\",";
		headerRow += "\"JSM_No\",";
//		headerRow += "<td>Question</td>";	
		headerRow += "\"Asbestos_Probable_Manual\",";		
		headerRow += "\"Asbestos_Level_Manual\",";		
		headerRow += "\"Asbestos_Weeks_Manual\",";	
		headerRow += "\"Asbestos_Hours_Manual\",";	
		headerRow += "\"Asbestos_Probable_Auto\",";	
		headerRow += "\"Asbestos_Level_Auto\",";
		headerRow += "\"Asbestos_Weeks_Auto\",";
		headerRow += "\"Asbestos_Hours_Auto\",";
		headerRow += "\"JSMName\",";	
		headerRow += "\"NewKey\",";	
		headerRow += "\"AMRID\",";	
		headerRow += "\"Employer\",";	
		headerRow += "\"Jobdescription\",";
		headerRow += "\"JobTitle\",";
		headerRow += "\"Sex\",";
		headerRow += "\"Status_of_participant\",";
		headerRow += "\n";
		retValue = "";
		retValue += headerRow;
		retValue += bodyRows;
		//retValue += "</table>";
		return retValue;
	}
	
	public String showAmrReportQAss(List<Participant> participants) throws Exception {
		String retValue = "";
		String bodyRows = "";

		Agent agent = new Agent("146");//asbestos
		//int iMax = 0;
		for(Participant p: participants){
			List<JobHistory> jhs = p.getJobHistories();
			for(JobHistory jh:jhs){	//assessments

				Assessment assessmentAuto = jh.getAutoAssessment(agent.getId()).getId().equals("")?null:jh.getAutoAssessment(agent.getId());
				//Assessment assessmentManual = jh.getManualAssessment(agent.getId()).getId().equals("")?null:jh.getManualAssessment(agent.getId());

/*				bodyRows += "<tr>";		
				bodyRows += "<td>"+p.getReferenceNumber()+"</td>";
				bodyRows += "<td>"+jh.getReferenceNumber()+"</td>";
				bodyRows += "<td>"+jh.getStatusId()+"</td>";
				bodyRows += "<td>"+jh.getStatusName()+"</td>";
				bodyRows += "<td>"+jh.getFinalJSMId()+"</td>";
				if (assessmentManual != null) {
					bodyRows += "<td> - </td>";
					bodyRows += "<td>"+assessmentManual.getExposure()+"</td>";
					bodyRows += "<td>"+assessmentManual.getLevel()+"</td>";
					bodyRows += "<td>"+assessmentManual.getFrequencyweeks()+"</td>";
					bodyRows += "<td>"+assessmentManual.getFrequencyhours()+"</td>";
				}else{
					bodyRows += "<td> - </td>";
					bodyRows += "<td>No Manual</td>";
					bodyRows += "<td>No Manual</td>";
					bodyRows += "<td>No Manual</td>";
					bodyRows += "<td>No Manual</td>";
				}
				if (assessmentAuto != null) {
					bodyRows += "<td>"+assessmentAuto.getExposure()+"</td>";
					bodyRows += "<td>"+assessmentAuto.getLevel()+"</td>";
					bodyRows += "<td>"+assessmentAuto.getFrequencyhours()+"</td>";
					bodyRows += "<td>"+assessmentAuto.getFrequencyweeks()+"</td>";
				}else{
					bodyRows += "<td>No Auto</td>";
					bodyRows += "<td>No Auto</td>";
					bodyRows += "<td>No Auto</td>";
					bodyRows += "<td>No Auto</td>";
				}
				bodyRows += "<td>"+jh.getFinalJSMName()+"</td>";
				bodyRows += "<td>"+p.getReferenceNumber()+"_"+jh.getReferenceNumber()+"</td>";			
				bodyRows += "<td>"+p.getAmrRefId()+"</td>";
				bodyRows += "<td>"+jh.getEmployer()+"</td>";
				bodyRows += "<td>"+jh.getJobDescription()+"</td>";
				bodyRows += "<td>"+jh.getJobTitle()+"</td>";
				bodyRows += "<td>"+p.getGender()+"</td>";
				bodyRows += "<td>"+p.getStatusName()+"</td>";
				bodyRows += "</tr>";*/

				//If jhref number = 1(i.e. it is the enviro asbestos jsm) then write lines for 'by root question' assessment 
				if (jh.getReferenceNumber().equals("1") && assessmentAuto != null) {
					ArrayList<QuestionAssessment> rootQuestionAssessments = assessmentAuto.getRootQuestionAssessments();
					for (QuestionAssessment questionAssessment : rootQuestionAssessments) {
						Question question = new Question("",questionAssessment.getJsmquestionstructureid());
						bodyRows += "<tr>";		
						bodyRows += "<td>"+p.getReferenceNumber()+"</td>";
						bodyRows += "<td>"+p.getAmrRefId()+"</td>";
						bodyRows += "<td>"+jh.getReferenceNumber()+"</td>";
						bodyRows += "<td>"+jh.getStatusId()+"</td>";
						bodyRows += "<td>"+jh.getStatusName()+"</td>";
						bodyRows += "<td>"+jh.getFinalJSMId() + "</td>";
						bodyRows += "<td>" + question.getName() + "</td>";
/*						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";*/
						bodyRows += "<td>" + questionAssessment.getExposure() + "</td>";
						bodyRows += "<td>" + questionAssessment.getLevel() + "</td>";
						bodyRows += "<td>" + questionAssessment.getFrequencyhours() + "</td>";
						bodyRows += "<td>" + questionAssessment.getFrequencyweeks() + "</td>";
						bodyRows += "</tr>";
					}
				}
				
			}							
		}

		String headerRow = "<tr>";
		headerRow += "<td>PaticipantRefNo</td>";		
		headerRow += "<td>JobHistoryReferenceNumber</td>";	
		headerRow += "<td>AMRID</td>";	
		headerRow += "<td>JobHistoryStatusId</td>";	
		headerRow += "<td>JobHistoryStatus</td>";
		headerRow += "<td>JSM_No</td>";
		headerRow += "<td>Question</td>";	
/*		headerRow += "<td>Asbestos_Probable_Manual</td>";		
		headerRow += "<td>Asbestos_Level_Manual</td>";		
		headerRow += "<td> Asbestos_Weeks_Manual</td>";	
		headerRow += "<td> Asbestos_Hours_Manual</td>";	*/
		headerRow += "<td> Asbestos_Probable_Auto</td>";	
		headerRow += "<td> Asbestos_Level_Auto</td>";
		headerRow += "<td>Asbestos_Weeks_Auto</td>";
		headerRow += "<td>Asbestos_Hours_Auto</td>";
/*		headerRow += "<td>JSMName</td>";	
		headerRow += "<td>NewKey</td>";
		headerRow += "<td>Employer</td>";	
		headerRow += "<td>Jobdescription</td>";
		headerRow += "<td>JobTitle</td>";
		headerRow += "<td>Sex</td>";
		headerRow += "<td>Status of participant</td>";*/
		headerRow += "</tr>";
		retValue = "<table border=1>";
		retValue += headerRow;
		retValue += bodyRows;
		retValue += "</table>";
		return retValue;
	}
	
	public String showAmrReportQAssAsCsv(List<Participant> participants) throws Exception {
		String retValue = "";
		String bodyRows = "";

		Agent agent = new Agent("146");//asbestos
		//int iMax = 0;
		for(Participant p: participants){
			List<JobHistory> jhs = p.getJobHistories();
			for(JobHistory jh:jhs){	//assessments

				Assessment assessmentAuto = jh.getAutoAssessment(agent.getId()).getId().equals("")?null:jh.getAutoAssessment(agent.getId());
				//Assessment assessmentManual = jh.getManualAssessment(agent.getId()).getId().equals("")?null:jh.getManualAssessment(agent.getId());

/*				bodyRows += "<tr>";		
				bodyRows += "<td>"+p.getReferenceNumber()+"</td>";
				bodyRows += "<td>"+jh.getReferenceNumber()+"</td>";
				bodyRows += "<td>"+jh.getStatusId()+"</td>";
				bodyRows += "<td>"+jh.getStatusName()+"</td>";
				bodyRows += "<td>"+jh.getFinalJSMId()+"</td>";
				if (assessmentManual != null) {
					bodyRows += "<td> - </td>";
					bodyRows += "<td>"+assessmentManual.getExposure()+"</td>";
					bodyRows += "<td>"+assessmentManual.getLevel()+"</td>";
					bodyRows += "<td>"+assessmentManual.getFrequencyweeks()+"</td>";
					bodyRows += "<td>"+assessmentManual.getFrequencyhours()+"</td>";
				}else{
					bodyRows += "<td> - </td>";
					bodyRows += "<td>No Manual</td>";
					bodyRows += "<td>No Manual</td>";
					bodyRows += "<td>No Manual</td>";
					bodyRows += "<td>No Manual</td>";
				}
				if (assessmentAuto != null) {
					bodyRows += "<td>"+assessmentAuto.getExposure()+"</td>";
					bodyRows += "<td>"+assessmentAuto.getLevel()+"</td>";
					bodyRows += "<td>"+assessmentAuto.getFrequencyhours()+"</td>";
					bodyRows += "<td>"+assessmentAuto.getFrequencyweeks()+"</td>";
				}else{
					bodyRows += "<td>No Auto</td>";
					bodyRows += "<td>No Auto</td>";
					bodyRows += "<td>No Auto</td>";
					bodyRows += "<td>No Auto</td>";
				}
				bodyRows += "<td>"+jh.getFinalJSMName()+"</td>";
				bodyRows += "<td>"+p.getReferenceNumber()+"_"+jh.getReferenceNumber()+"</td>";			
				bodyRows += "<td>"+p.getAmrRefId()+"</td>";
				bodyRows += "<td>"+jh.getEmployer()+"</td>";
				bodyRows += "<td>"+jh.getJobDescription()+"</td>";
				bodyRows += "<td>"+jh.getJobTitle()+"</td>";
				bodyRows += "<td>"+p.getGender()+"</td>";
				bodyRows += "<td>"+p.getStatusName()+"</td>";
				bodyRows += "</tr>";*/

				//If jhref number = 1(i.e. it is the enviro asbestos jsm) then write lines for 'by root question' assessment 
				if (jh.getReferenceNumber().equals("1") && assessmentAuto != null) {
					ArrayList<QuestionAssessment> rootQuestionAssessments = assessmentAuto.getRootQuestionAssessments();
					for (QuestionAssessment questionAssessment : rootQuestionAssessments) {
						Question question = new Question("",questionAssessment.getJsmquestionstructureid());
						bodyRows += "";		
						bodyRows += "\""+p.getReferenceNumber()+"\",";
						bodyRows += "\""+p.getAmrRefId()+"\",";
						bodyRows += "\""+jh.getReferenceNumber()+"\",";
						bodyRows += "\""+jh.getStatusId()+"\",";
						bodyRows += "\""+jh.getStatusName()+"\",";
						bodyRows += "\""+jh.getFinalJSMId() + "\",";
						bodyRows += "\"" + question.getName() + "\",";
/*						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";
						bodyRows += "<td>&nbsp;</td>";*/
						bodyRows += "\"" + questionAssessment.getExposure() + "\",";
						bodyRows += "\"" + questionAssessment.getLevel() + "\",";
						bodyRows += "\"" + questionAssessment.getFrequencyhours() + "\",";
						bodyRows += "\"" + questionAssessment.getFrequencyweeks() + "\",";
						bodyRows += "\n";
					}
				}
				
			}							
		}

		String headerRow = "";
		headerRow += "\"PaticipantRefNo\",";	
		headerRow += "\"AMRID\",";
		headerRow += "\"JobHistoryReferenceNumber\",";		
		headerRow += "\"JobHistoryStatusId\",";	
		headerRow += "\"JobHistoryStatus\",";
		headerRow += "\"JSM_No\",";
		headerRow += "\"Question\",";	
/*		headerRow += "<td>Asbestos_Probable_Manual</td>";		
		headerRow += "<td>Asbestos_Level_Manual</td>";		
		headerRow += "<td> Asbestos_Weeks_Manual</td>";	
		headerRow += "<td> Asbestos_Hours_Manual</td>";	*/
		headerRow += "\"Asbestos_Probable_Auto\",";	
		headerRow += "\"Asbestos_Level_Auto\",";
		headerRow += "\"Asbestos_Weeks_Auto\",";
		headerRow += "\"Asbestos_Hours_Auto\",";
/*		headerRow += "<td>JSMName</td>";	
		headerRow += "<td>NewKey</td>";	
			
		headerRow += "<td>Employer</td>";	
		headerRow += "<td>Jobdescription</td>";
		headerRow += "<td>JobTitle</td>";
		headerRow += "<td>Sex</td>";
		headerRow += "<td>Status of participant</td>";*/
		headerRow += "\n";
		retValue = "";
		retValue += headerRow;
		retValue += bodyRows;
		//retValue += "</table>";
		return retValue;
	}

	public String showAddJob(Participant p, JobHistory jh) throws Exception{
		String title = (jh.getId() == "")?"New Job":"Edit Job " + jh.getJobDescription();
		String strHTML = "";
		strHTML += "<table class=EditView cellspacing=0 bgcolor=#f9faff>";
		strHTML += "<tr class=windowTop><td align=center>" + title + "</td><td style='text-align:right;' id='dirtyflag'>Close</td><td style='text-align: right;width:20px'><input type=image src='ImageStream?ImageName=close.gif' name=closeEditI title='Close Edit Mode' height=16 width=16 onclick='return CheckDirtyPage()'/></td></tr>";
		strHTML += "<tr><td>";
		strHTML += "<fieldset class=\"participant\">";
		strHTML += "<Legend>Job History</legend>";
		//strHTML += "<table bgcolor= #e7f4fc width=100%>";
		strHTML += this.showJobHistory(jh);
		strHTML += "</td></tr>";
		strHTML += "<tr><td>";
		strHTML += "<table>";	
		strHTML += "<tr><td><input type=hidden name=ParticipantID value="+p.getParticipantId()+"</td></tr>";	
		strHTML += "</table>";
		strHTML += "<table>";
		strHTML += "<tr><td ><span class=isMandatory>* These fields must be completed</span></td></tr>";	        					        				
		strHTML += "</table>";
		strHTML += "</fieldset>";
		strHTML += "</td></tr>";
		strHTML += "</table>";
		return strHTML;
	}

	public String showAddAddress(Participant p, Address address) throws Exception{
		String title = (address.getId() == "")?"New Address":"Edit Address " + address.getAddress();
		String strHTML = "";
		strHTML += "<table class=EditView cellspacing=0 bgcolor=#f9faff>";
		strHTML += "<tr class=windowTop ><td align=center>" + title + "</td><td style='text-align:right;' id='dirtyflag'>Close</td><td style='text-align:right;width:20px'><input type=image src='ImageStream?ImageName=close.gif' name=closeEditI title='Close Edit Mode' height=16 width=16 onclick='return CheckDirtyPage()'/></td></tr>";
		strHTML += "<tr><td>";
		strHTML += "<fieldset class=\"participant\">";
		strHTML += "<Legend>Residential History</legend>";
		strHTML += this.showResidentialHistory(address);
		strHTML += "</td></tr>";
		strHTML += "<tr><td>";
		strHTML += "<table>";	
		strHTML += "<tr><td><input type=hidden name=ParticipantID value="+p.getParticipantId()+"</td></tr>";	
		strHTML += "</table>";
		strHTML += "<table>";
		strHTML += "<tr><td ><span class=isMandatory>* These fields must be completed</span></td></tr>";	        					        				
		strHTML += "</table>";
		strHTML += "</fieldset>";
		strHTML += "</td></tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showInterviewsPreviewEndNote() throws Exception {
		String strHTML = "";
		strHTML += "<table class=EditView>";
		strHTML += "<tr class=ListHeader>";
		strHTML += "<td>End of Preview</td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
}

