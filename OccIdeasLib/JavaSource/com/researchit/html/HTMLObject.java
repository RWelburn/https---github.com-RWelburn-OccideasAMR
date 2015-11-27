/**
 * Version:
 *     $Id: HTMLObject.java,v 1.288 2009/05/31 03:14:42 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: HTMLObject.java,v $
 *     Revision 1.288  2009/05/31 03:14:42  ray.welburn
 *     make numberpad visible until mouseout
 *
 *     Revision 1.287  2009/05/27 02:00:44  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.286  2009/05/06 08:25:12  troy.sadkowsky
 *     occideas new version updates
 *
 *     Revision 1.285  2009/05/01 02:23:54  troy.sadkowsky
 *     updates for more error handles on export and import
 *
 *     Revision 1.284  2009/04/11 11:39:32  ray.welburn
 *     implement numberpad
 *
 *     Revision 1.283  2009/04/02 22:52:11  ray.welburn
 *     import and export of controls from excel
 *
 *     Revision 1.282  2009/03/09 06:57:21  troy.sadkowsky
 *     bug fixes from demo testing
 *
 *     Revision 1.281  2009/02/23 06:00:37  troy.sadkowsky
 *     update reports
 *
 *     Revision 1.280  2009/02/04 22:45:48  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.279  2009/01/12 03:02:24  troy.sadkowsky
 *     bug 619 rename twd to twa
 *
 *     Revision 1.278  2009/01/07 07:04:07  troy.sadkowsky
 *     fix for displaying interviews to do
 *
 *     Revision 1.277  2009/01/07 05:51:08  troy.sadkowsky
 *     more v2 updates
 *
 *     Revision 1.276  2009/01/05 06:54:24  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.275  2008/12/30 00:11:38  troy.sadkowsky
 *     paging and speed enhancements
 *
 *     Revision 1.274  2008/12/29 02:44:05  troy.sadkowsky
 *     increased speed of participant lists
 *
 *     Revision 1.273  2008/12/23 10:32:24  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.272  2008/12/22 08:18:48  troy.sadkowsky
 *     fix for halt and starting interview again
 *
 *     Revision 1.271  2008/12/22 04:06:21  troy.sadkowsky
 *     various updates
 *
 *     Revision 1.270  2008/12/21 23:29:08  troy.sadkowsky
 *     highlight if agent not on parent
 *
 *     Revision 1.269  2008/12/20 02:07:08  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.268  2008/12/18 03:17:28  ray.welburn
 *     Added AJAX scripts for updating progress of java processes on freeze jsms
 *
 *     Revision 1.267  2008/12/17 03:57:23  ray.welburn
 *     New title bars and coles buttons added
 *
 *     Revision 1.266  2008/12/14 22:37:18  troy.sadkowsky
 *     fixed highlight bug and extra user infor with mouse over
 *
 *     Revision 1.265  2008/12/11 15:32:08  ray.welburn
 *     Add cookies for login
 *
 *     Revision 1.264  2008/12/07 05:18:43  ray.welburn
 *     Change to use only one showcombobox method
 *
 *     Revision 1.263  2008/11/25 23:29:44  troy.sadkowsky
 *     minor layout updates
 *
 *     Revision 1.262  2008/11/25 22:58:50  ray.welburn
 *     add edit view to rules
 *
 *     Revision 1.261  2008/11/19 06:42:08  ray.welburn
 *     ad javascript to move to first box of freq q's in interview
 *
 *     Revision 1.260  2008/11/19 02:19:51  ray.welburn
 *     Show study description in lhs menu
 *
 *     Revision 1.259  2008/11/14 09:14:39  troy.sadkowsky
 *     usability updates
 *
 *     Revision 1.258  2008/11/06 07:42:38  troy.sadkowsky
 *     removed user type from log in page, system now takes user to first system they have permission to in the order of questionniare, studies and assessment
 *
 *     Revision 1.257  2008/11/06 06:27:07  ray.welburn
 *     Set fixed width for combo boxes and add tooltips
 *
 *     Revision 1.256  2008/11/05 05:32:22  ray.welburn
 *     Add Job moved to action button and errors to text boxes
 *
 *     Revision 1.255  2008/11/04 06:26:22  ray.welburn
 *     Remove check box from assessment/studies
 *
 *     Revision 1.254  2008/11/03 06:33:22  ray.welburn
 *     Add JH Started changed to Starting year(YYYY)
 *
 *     Revision 1.253  2008/11/03 06:18:08  ray.welburn
 *     On add rule answers not showing correctly
 *
 *     Revision 1.252  2008/11/03 04:31:18  ray.welburn
 *     On adding agent examples screen levels were in wrong order
 *
 *     Revision 1.251  2008/10/28 01:06:08  troy.sadkowsky
 *     removed extra s from title study specific jsmss
 *
 *     Revision 1.250  2008/10/27 22:57:32  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.249  2008/10/23 05:36:51  troy.sadkowsky
 *     bug fixes
 *
 *     Revision 1.248  2008/10/17 03:40:08  troy.sadkowsky
 *     bug fixes
 *
 *     Revision 1.247  2008/10/10 06:26:06  troy.sadkowsky
 *     update log text
 *
 *     Revision 1.246  2008/10/10 05:53:12  troy.sadkowsky
 *     permission level update
 *
 *     Revision 1.245  2008/09/24 12:16:59  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.244  2008/09/20 08:59:30  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.243  2008/09/10 09:11:35  troy.sadkowsky
 *     ASsessment updates
 *
 *     Revision 1.242  2008/09/02 23:30:43  Troy.Sadkowsky
 *     removed old code and enhanced jsm exporter
 *
 *     Revision 1.241  2008/08/25 01:37:26  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.240  2008/08/20 03:36:34  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.239  2008/08/13 04:35:06  ray.welburn
 *     modifications to add/edit agentexamples
 *
 *     Revision 1.238  2008/08/12 04:04:19  ray.welburn
 *     Change index.jsp to main.jsp
 *
 *     Revision 1.237  2008/08/11 01:50:04  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.236  2008/08/11 00:46:19  troy.sadkowsky
 *     rule conversion from ajsms
 *
 *     Revision 1.235  2008/08/06 01:08:30  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.234  2008/08/05 00:35:34  ray.welburn
 *     Use session for progress bar
 *
 *     Revision 1.233  2008/08/05 00:29:12  ray.welburn
 *     Use session for progress bar
 *
 *     Revision 1.232  2008/08/02 06:16:57  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.231  2008/07/31 01:56:54  ray.welburn
 *     MainDB removed
 *
 *     Revision 1.230  2008/07/24 12:06:49  ray.welburn
 *     Studies now selected where study option useoccideas set
 *
 *     Revision 1.229  2008/07/23 05:07:42  ray.welburn
 *     Allow add studymgrlogin to user/role
 *
 *     Revision 1.228  2008/07/22 06:55:07  ray.welburn
 *     integration changes for new interface
 *
 *     Revision 1.227  2008/07/08 11:46:34  ray.welburn
 *     Rolepermissions update causes database corruption
 *
 *     Revision 1.226  2008/07/07 23:26:53  ray.welburn
 *     grey out question text during interview
 *
 *     Revision 1.225  2008/07/05 03:31:13  troy.sadkowsky
 *     fix for adding users to studies in admin section
 *
 *     Revision 1.224  2008/06/29 23:25:45  troy.sadkowsky
 *     new front page images
 *
 *     Revision 1.223  2008/06/01 09:36:58  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.222  2008/05/30 01:19:28  ray.welburn
 *     Add date stamp to participant changes
 *
 *     Revision 1.221  2008/05/26 08:23:26  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.220  2008/05/25 23:48:05  ray.welburn
 *     Add paging and user search for studies user management
 *
 *     Revision 1.219  2008/05/18 12:15:36  troy.sadkowsky
 *     added a showflashanimation to html object
 *
 *     Revision 1.218  2008/05/10 07:40:26  troy.sadkowsky
 *     updates for export JSMs
 *
 *     Revision 1.217  2008/04/28 04:25:18  troy.sadkowsky
 *     fix login style on memeber login page
 *
 *     Revision 1.216  2008/04/22 23:21:17  troy.sadkowsky
 *     new assessment requirements
 *
 *     Revision 1.215  2008/04/15 22:58:05  troy.sadkowsky
 *     melb updates
 *
 *     Revision 1.214  2008/04/09 05:35:46  ray.welburn
 *     LHS tab top close gap to lower table and set height
 *
 *     Revision 1.213  2008/04/09 02:20:40  ray.welburn
 *     Study names not truncating properly fix
 *
 *     Revision 1.212  2008/04/09 02:18:54  ray.welburn
 *     LHS tabs can now include an object name eg study name
 *
 *     Revision 1.211  2008/04/09 00:59:11  ray.welburn
 *     Make title edit buttons consistant
 *
 *     Revision 1.210  2008/04/07 03:26:55  Troy.Sadkowsky
 *     removed hard coded username and password
 *
 *     Revision 1.209  2008/04/05 23:50:09  ray.welburn
 *     repair broken html in studyjsms
 *
 *     Revision 1.208  2008/04/04 06:15:30  ray.welburn
 *     Misc page style changes
 *
 *     Revision 1.207  2008/04/04 02:01:10  ray.welburn
 *     LHS single tabs now showing as selected
 *
 *     Revision 1.206  2008/04/04 01:06:36  ray.welburn
 *     New LHS tabs added to home admin
 *
 *     Revision 1.205  2008/04/04 00:19:54  ray.welburn
 *     New LHS tabs added
 *
 *     Revision 1.204  2008/03/28 00:42:19  troy.sadkowsky
 *     fix link from agent ajsm
 *
 *     Revision 1.203  2008/03/26 12:36:25  troy.sadkowsky
 *     fix nav bar
 *
 *     Revision 1.202  2008/03/24 23:43:39  ray.welburn
 *     Revamping Admin pages to make consistant look
 *
 *     Revision 1.201  2008/03/22 04:44:19  ray.welburn
 *     images from database applied to alll images
 *
 *     Revision 1.200  2008/03/19 10:06:56  ray.welburn
 *     Update minmax to use gif files and modify globalminmax to stop unusual behaviour in Firefox
 *
 *     Revision 1.199  2008/03/18 10:43:30  ray.welburn
 *     swap bmp images for gif
 *
 *     Revision 1.198  2008/03/16 03:47:31  ray.welburn
 *     Add Global min max button
 *
 *     Revision 1.197  2008/03/13 06:11:36  ray.welburn
 *     Put back version method
 *
 *     Revision 1.196  2008/03/13 06:08:37  ray.welburn
 *     Images from database now used
 *
 *     Revision 1.195  2008/03/13 05:33:45  ray.welburn
 *     Unused methods commented out
 *
 *     Revision 1.194  2008/03/13 02:20:53  troy.sadkowsky
 *     progress bar for save study
 *
 *     Revision 1.193  2008/03/12 07:43:20  troy.sadkowsky
 *     modification to admin log in from occideas home
 *
 *     Revision 1.192  2008/03/10 03:27:07  troy.sadkowsky
 *     fix for navigating from structure aJSM link
 *
 *     Revision 1.191  2008/03/05 05:05:53  troy.sadkowsky
 *     import aJSMs
 *
 *     Revision 1.190  2008/03/05 02:37:22  troy.sadkowsky
 *     validation of jsm
 *
 *     Revision 1.189  2008/02/25 04:21:55  troy.sadkowsky
 *     new export function
 *
 *     Revision 1.188  2008/02/15 04:00:24  troy.sadkowsky
 *     removed olf code, added data cleaning functions and ui updates
 *
 *     Revision 1.187  2008/02/13 02:36:56  ray.welburn
 *     Remove User manual references
 *
 *     Revision 1.186  2008/02/08 07:37:40  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.185  2008/01/29 12:28:48  troy.sadkowsky
 *     validate possible answer number and free text special characters
 *
 *     Revision 1.184  2008/01/26 02:58:33  troy.sadkowsky
 *     fix for room of child qs
 *
 *     Revision 1.183  2008/01/24 22:44:28  troy.sadkowsky
 *     edititem gif
 *
 *     Revision 1.182  2008/01/24 11:20:15  troy.sadkowsky
 *     rett participant interview status
 *
 *     Revision 1.181  2008/01/24 03:59:00  troy.sadkowsky
 *     review interveiw
 *
 *     Revision 1.180  2008/01/14 12:57:19  troy.sadkowsky
 *     rules view updates
 *
 *     Revision 1.179  2008/01/13 21:13:25  troy.sadkowsky
 *     show with parent
 *
 *     Revision 1.178  2008/01/11 04:04:04  troy.sadkowsky
 *     show with parent
 *
 *     Revision 1.177  2007/12/21 01:24:27  troy.sadkowsky
 *     fix for rule numbers
 *
 *     Revision 1.176  2007/12/16 22:47:54  troy.sadkowsky
 *     fix for notes and dates
 *
 *     Revision 1.175  2007/12/11 14:08:06  troy.sadkowsky
 *     new view with parent option at interview
 *
 *     Revision 1.174  2007/12/08 06:38:21  ray.welburn
 *     Added warning when a study has no participants
 *
 *     Revision 1.173  2007/12/06 02:27:53  ray.welburn
 *     Added ability of users to change page size
 *
 *     Revision 1.172  2007/11/27 03:46:39  ray.welburn
 *     Modified for new agentexamples object
 *
 *     Revision 1.171  2007/11/24 03:58:56  troy.sadkowsky
 *     filter by participant status
 *
 *     Revision 1.170  2007/11/23 06:30:12  troy.sadkowsky
 *     misc runner
 *
 *     Revision 1.169  2007/11/21 03:38:53  troy.sadkowsky
 *     rett study test participants
 *
 *     Revision 1.168  2007/11/21 02:19:51  ray.welburn
 *     Show page numbers in LHS menu and centre align headers in list
 *
 *     Revision 1.167  2007/11/18 02:25:37  troy.sadkowsky
 *     bug fix for interview and new search participant function
 *
 *     Revision 1.166  2007/11/16 04:10:47  troy.sadkowsky
 *     bug fix for showing number drop down
 *
 *     Revision 1.165  2007/11/16 03:04:47  ray.welburn
 *     changes to search and paging functions
 *
 *     Revision 1.164  2007/11/14 22:35:46  troy.sadkowsky
 *     jh statuses
 *
 *     Revision 1.163  2007/11/14 08:12:07  troy.sadkowsky
 *     jh statuses
 *
 *     Revision 1.162  2007/11/08 11:39:56  troy.sadkowsky
 *     show final assessment with colours
 *
 *     Revision 1.161  2007/11/08 06:48:43  troy.sadkowsky
 *     progress bar
 *
 *     Revision 1.160  2007/11/07 09:39:33  ray.welburn
 *     Fixes for paging of participants
 *
 *     Revision 1.159  2007/11/06 11:26:40  ray.welburn
 *     Bugs in search facility
 *
 *     Revision 1.158  2007/11/06 02:10:01  Troy.Sadkowsky
 *     fix for hours question not child
 *
 *     Revision 1.157  2007/11/05 23:00:06  troy.sadkowsky
 *     new sanity check for empty facts
 *
 *     Revision 1.156  2007/11/03 04:58:24  troy.sadkowsky
 *     statuses and next participants
 *
 *     Revision 1.155  2007/11/03 02:31:48  troy.sadkowsky
 *     move calendar class to own file
 *
 *     Revision 1.154  2007/11/03 00:52:55  troy.sadkowsky
 *     bug fix for more than 10 pages of participants
 *
 *     Revision 1.153  2007/11/02 01:38:09  troy.sadkowsky
 *     searches and showing participant lists
 *
 *     Revision 1.152  2007/10/30 13:15:04  ray.welburn
 *     add warning that question has no possible answers
 *
 *     Revision 1.151  2007/10/29 09:43:46  ray.welburn
 *     Search filter added to LHS  participants menu
 *
 *     Revision 1.150  2007/10/29 08:58:54  troy.sadkowsky
 *     enhanced connections speed for showing rules
 *
 *     Revision 1.149  2007/10/27 06:36:52  ray.welburn
 *     Paging for participants
 *
 *     Revision 1.148  2007/10/25 03:48:11  troy.sadkowsky
 *     fix frequency rules
 *
 *     Revision 1.147  2007/10/24 05:11:47  ray.welburn
 *     truncate name method applied to study options fjsms & tjsms
 *
 *     Revision 1.146  2007/10/22 04:04:09  troy.sadkowsky
 *     changed truncateName function from private to protected
 *
 *     Revision 1.145  2007/10/18 23:10:20  troy.sadkowsky
 *     new import functions
 *
 *     Revision 1.144  2007/10/16 02:48:14  troy.sadkowsky
 *     reports and single rules
 *
 *     Revision 1.143  2007/10/15 05:56:06  troy.sadkowsky
 *     sanity check functions and warning for missing values
 *
 *     Revision 1.142  2007/10/10 05:32:49  ray.welburn
 *     LHS menu items truncated with mouseover for full name
 *
 *     Revision 1.141  2007/10/09 23:47:12  ray.welburn
 *     Login now shows error message correctly
 *
 *     Revision 1.140  2007/10/09 07:17:57  troy.sadkowsky
 *     sanity check updates
 *
 *     Revision 1.139  2007/10/08 12:31:46  troy.sadkowsky
 *     small style update for agent view
 *
 *     Revision 1.138  2007/10/08 11:45:51  troy.sadkowsky
 *     small style update and fix for showing template jsms only
 *
 *     Revision 1.137  2007/10/08 07:20:54  troy.sadkowsky
 *     rule management
 *
 *     Revision 1.136  2007/10/04 01:59:31  ray.welburn
 *     Update to font styles of several text items
 *
 *     Revision 1.135  2007/10/03 07:11:19  ray.welburn
 *     Images moved to Occideaslib and links used for project access to images
 *
 *     Revision 1.134  2007/09/29 02:22:09  ray.welburn
 *     Reorganise roles and permissions & remove redundant code
 *
 *     Revision 1.133  2007/09/27 07:05:00  ray.welburn
 *     Reorganise roles and permissions & remove redundant code
 *
 *     Revision 1.132  2007/09/25 13:44:12  troy.sadkowsky
 *     restructure sys admin pages
 *
 *     Revision 1.131  2007/09/25 12:30:27  ray.welburn
 *     Interviews project changed to Studies
 *
 *     Revision 1.130  2007/09/24 22:56:19  troy.sadkowsky
 *     fix for javascript in firefox autoselect
 *
 *     Revision 1.129  2007/09/24 07:56:02  ray.welburn
 *     pre - text for disabled icons changed to dis_
 *
 *     Revision 1.128  2007/09/24 07:50:43  ray.welburn
 *     Role permissions now grouped and now show icon for permission
 *
 *     Revision 1.127  2007/09/23 22:55:02  troy.sadkowsky
 *     show rules fired
 *
 *     Revision 1.126  2007/09/22 03:20:32  troy.sadkowsky
 *     participant and job history statuses
 *
 *     Revision 1.125  2007/09/15 06:28:20  ray.welburn
 *     Return key disabled when entering data in job Histories
 *
 *     Revision 1.124  2007/09/15 02:03:34  ray.welburn
 *     Selection button added to disallow autogeneration of participant numbers
 *
 *     Revision 1.123  2007/09/11 23:04:17  troy.sadkowsky
 *     changes for sharing jsms
 *
 *     Revision 1.122  2007/09/05 09:01:51  troy.sadkowsky
 *     self admin updates
 *
 *     Revision 1.121  2007/09/04 23:44:41  troy.sadkowsky
 *     bug fix agent structure view rules minmax
 *
 *     Revision 1.120  2007/09/04 23:35:12  troy.sadkowsky
 *     build 1.42
 *
 *     Revision 1.119  2007/09/04 22:39:24  troy.sadkowsky
 *     nr smoked bug
 *
 *     Revision 1.118  2007/09/03 00:39:24  troy.sadkowsky
 *     updates for aug 24th meeting
 *
 *     Revision 1.117  2007/08/29 07:19:07  ray.welburn
 *     Modified maxmin to always scroll to correct position amendments
 *
 *     Revision 1.116  2007/08/29 07:02:12  ray.welburn
 *     Modified maxmin to always scroll to correct position
 *
 *     Revision 1.115  2007/08/29 01:35:37  troy.sadkowsky
 *     moved warning style to input tag from td tag
 *
 *     Revision 1.114  2007/08/23 23:38:11  ray.welburn
 *     Modified for add new user
 *
 *     Revision 1.113  2007/08/23 02:26:11  ray.welburn
 *     Apply "loading..." timer onclick  to all hrefs
 *
 *     Revision 1.112  2007/08/22 06:42:06  ray.welburn
 *     Header style on Jobs page change to match JSM page
 *
 *     Revision 1.111  2007/08/20 11:55:31  troy.sadkowsky
 *     auto minimize freq questions on agent rule view
 *
 *     Revision 1.110  2007/08/19 13:05:36  troy.sadkowsky
 *     share study with users
 *
 *     Revision 1.109  2007/08/19 06:44:36  troy.sadkowsky
 *     style updates
 *
 *     Revision 1.108  2007/08/19 03:39:27  troy.sadkowsky
 *     style updates
 *
 *     Revision 1.107  2007/08/17 13:52:11  troy.sadkowsky
 *     style updates
 *
 *     Revision 1.106  2007/08/17 13:29:41  ray.welburn
 *     Inserts prefix into frequency questions composed of origanal question and its answer
 *
 *     Revision 1.105  2007/08/17 02:02:56  ray.welburn
 *     Now adds red box around empty job history entry boxes
 *
 *     Revision 1.104  2007/08/17 00:59:58  troy.sadkowsky
 *     validation run when drawing each jh
 *
 *     Revision 1.103  2007/08/16 23:46:44  ray.welburn
 *     Changes made to allow question and answer child items to be shown
 *
 *     Revision 1.102  2007/08/13 04:00:53  troy.sadkowsky
 *     correct fix for hours per week bug 294
 *
 *     Revision 1.101  2007/08/13 03:15:44  troy.sadkowsky
 *     version number bug and reword self admin q
 *
 *     Revision 1.100  2007/08/13 00:32:47  troy.sadkowsky
 *     version 1_40
 *
 *     Revision 1.99  2007/08/13 00:19:39  troy.sadkowsky
 *     new jobhistory field requirements and sharing ability
 *
 *     Revision 1.98  2007/08/08 23:53:53  troy.sadkowsky
 *     db and objects for share jsms feature
 *
 *     Revision 1.97  2007/08/06 02:25:27  troy.sadkowsky
 *     moved version number to library
 *
 *     Revision 1.96  2007/08/06 02:04:44  troy.sadkowsky
 *     enhanced show rules
 *
 *     Revision 1.95  2007/08/02 09:09:33  troy.sadkowsky
 *     separate rule creation from viewing mjsm
 *
 *     Revision 1.94  2007/08/01 07:01:47  ray.welburn
 *     Update to show AJSMs in LHS menu when clicking on ajsm hyperlink in structure view
 *
 *     Revision 1.93  2007/07/28 01:32:53  troy.sadkowsky
 *     agent description updates and clean mql
 *
 *     Revision 1.92  2007/07/19 05:25:50  troy.sadkowsky
 *     tidy up code removed warnings
 *
 *     Revision 1.91  2007/07/13 05:38:28  Jeff.Keys
 *     case sensitive search count
 *
 *     Revision 1.90  2007/07/10 22:39:01  troy.sadkowsky
 *     self admin changes
 *
 *     Revision 1.89  2007/07/04 07:11:58  Jeff.Keys
 *     questionnaire searches on q keywords only
 *
 *     Revision 1.88  2007/06/30 05:47:38  Jeff.Keys
 *     questionnaire searches -agents
 *
 *     Revision 1.87  2007/06/30 02:57:00  Jeff.Keys
 *     questionnaire searches -agents
 *
 *     Revision 1.86  2007/06/28 14:40:09  Jeff.Keys
 *     questionnaire searches -structure
 *
 *     Revision 1.85  2007/06/28 08:26:10  Jeff.Keys
 *     loading prompt for search
 *
 *     Revision 1.84  2007/06/21 09:04:42  Troy.Sadkowsky
 *     search function
 *
 *     Revision 1.83  2007/06/09 01:33:03  Jeff.Keys
 *     clean up some highlighting
 *
 *     Revision 1.82  2007/06/09 00:01:37  Troy.Sadkowsky
 *     date jsm froze
 *
 *     Revision 1.81  2007/06/08 00:34:25  Troy.Sadkowsky
 *     attempt to increase speed of rules display
 *
 *     Revision 1.80  2007/06/07 06:27:42  Troy.Sadkowsky
 *     agents showing which jsms have questions with this agent
 *
 *     Revision 1.79  2007/06/03 23:19:52  Troy.Sadkowsky
 *     build 1.30 updates
 *
 *     Revision 1.78  2007/05/30 04:17:04  Jeff.Keys
 *     *** empty log message ***
 *
 *     Revision 1.76  2007/05/27 23:21:07  Troy.Sadkowsky
 *     restructured rule types
 *
 *     Revision 1.75  2007/05/20 22:05:07  Troy.Sadkowsky
 *     keep correct order of questions in edit mode
 *
 *     Revision 1.74  2007/05/20 01:40:04  jeff.keys
 *     online user manual
 *
 *     Revision 1.73  2007/05/19 02:02:07  jeff.keys
 *     online user manual
 *
 *     Revision 1.72  2007/05/08 23:17:38  Troy.Sadkowsky
 *     fix for new rules display
 *
 *     Revision 1.71  2007/05/08 22:32:50  Troy.Sadkowsky
 *     minor changes for self admin pages from Alison Anderson
 *
 *     Revision 1.70  2007/05/03 13:52:52  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.69  2007/05/01 23:42:29  Troy.Sadkowsky
 *     changed agents view, add and edit
 *
 *     Revision 1.68  2007/04/30 07:11:27  jeff.keys
 *     module specific permissions
 *
 *     Revision 1.67  2007/04/29 22:37:55  jeff.keys
 *     module specific permissions
 *
 *     Revision 1.66  2007/04/26 23:16:55  Troy.Sadkowsky
 *     fix for long jsm names and cahnged participant login labels
 *
 *     Revision 1.65  2007/04/26 22:38:13  Troy.Sadkowsky
 *     bug fix for updating rule without a rule selected
 *
 *     Revision 1.64  2007/04/26 06:58:44  troy.sadkowsky
 *     self admin updates
 *
 *     Revision 1.63  2007/04/26 03:08:05  jeff.keys
 *     Warning on free text character limits for self-administered studies
 *
 *     Revision 1.62  2007/04/25 21:56:27  Troy.Sadkowsky
 *     made dbobject sortable and removed old objects and functions
 *
 *     Revision 1.61  2007/04/22 11:55:58  Troy.Sadkowsky
 *     build v1.24
 *
 *     Revision 1.60  2007/04/18 13:26:28  Troy.Sadkowsky
 *     New navigational links code
 *
 *     Revision 1.59  2007/04/18 02:46:47  jeff.keys
 *     Role associations and edit role permissions
 *
 *     Revision 1.58  2007/04/17 05:00:55  jeff.keys
 *     fix showRolesLocation conflict
 *
 *     Revision 1.57  2007/04/16 04:35:42  Troy.Sadkowsky
 *     bug fix in nav links
 *
 *     Revision 1.56  2007/04/16 00:26:17  Troy.Sadkowsky
 *     reset passwords
 *
 *     Revision 1.55  2007/04/15 11:45:00  jeff.keys
 *     encrypt password
 *
 *     Revision 1.54  2007/04/15 10:56:10  jeff.keys
 *     create/edit/remove user
 *
 *     Revision 1.53  2007/04/12 11:07:29  jeff.keys
 *     breadcrumbs
 *
 *     Revision 1.52  2007/04/04 12:02:06  Troy.Sadkowsky
 *     linking jobs through template jsms
 *
 *     Revision 1.51  2007/03/30 04:54:51  Troy.Sadkowsky
 *     mods for user-study relationships
 *
 *     Revision 1.50  2007/03/30 03:12:12  jeff.keys
 *     user/roles tabs
 *
 *     Revision 1.49  2007/03/29 03:13:42  jeff.keys
 *     add style to agents
 *
 *     Revision 1.48  2007/03/28 02:23:24  troy.sadkowsky
 *     bug fix for unselecting radio buttons
 *
 *     Revision 1.47  2007/03/27 06:04:02  Troy.Sadkowsky
 *     minor fixes for task 2015
 *
 *     Revision 1.46  2007/03/25 12:00:51  jeff.keys
 *     check boxes ids and labels
 *
 *     Revision 1.45  2007/03/25 05:46:28  jeff.keys
 *     add style to close window link
 *     and radio buttons ids and labels
 *
 *     Revision 1.44  2007/03/21 13:46:04  Troy.Sadkowsky
 *     bug fix on copy template, datetime field, new add permission code, print view
 *
 *     Revision 1.43  2007/03/19 10:02:18  jeff.keys
 *     Interview possible answers styles
 *
 *     Revision 1.42  2007/03/15 04:56:37  Troy.Sadkowsky
 *     self admin changes
 *
 *     Revision 1.41  2007/03/15 00:16:47  Troy.Sadkowsky
 *     bug fixes for build v1.18
 *
 *     Revision 1.40  2007/03/13 11:54:29  troy.sadkowsky
 *     fixes for bugs introduced by no frames
 *
 *     Revision 1.39  2007/03/12 12:47:42  Troy.Sadkowsky
 *     removed frames
 *
 *     Revision 1.38  2007/03/12 02:45:54  Troy.Sadkowsky
 *     removed frames
 *
 *     Revision 1.37  2007/03/11 11:30:37  Troy.Sadkowsky
 *     removed frames
 *
 *     Revision 1.36  2007/03/11 11:12:33  troy.sadkowsky
 *     changed method of add and edit studies to not use popups
 *
 *     Revision 1.35  2007/03/06 05:03:02  Troy.Sadkowsky
 *     new progress bar
 *
 *     Revision 1.34  2007/03/02 06:22:08  jeff.keys
 *     Participant and Job History Validation v2
 *
 *     Revision 1.33  2007/03/01 12:21:35  Troy.Sadkowsky
 *     removed extra functions that came from conflicts
 *
 *     Revision 1.32  2007/03/01 04:37:08  jeff.keys
 *     Participant and Job History Validation
 *
 *     Revision 1.31  2007/02/28 12:04:04  Troy.Sadkowsky
 *     first phase of roles and permissions
 *
 *     Revision 1.30  2007/02/28 05:28:24  Troy.Sadkowsky
 *     build v1.16 updates
 *
 *     Revision 1.29  2007/02/28 00:38:36  troy.sadkowsky
 *     restructured show participant for self administer requirement
 *
 *     Revision 1.28  2007/02/25 23:15:24  troy.sadkowsky
 *     rules are now study specific
 *
 *     Revision 1.27  2007/02/18 11:07:21  troy
 *     new dynamic rule creation
 *
 *     Revision 1.26  2007/02/13 20:45:13  troy
 *     put key phrase in structure view
 *
 *     Revision 1.25  2007/02/08 06:37:23  troy
 *     number possible answers combo box index error
 *
 *     Revision 1.24  2007/02/07 23:21:24  troy
 *     further development on level rules
 *
 *     Revision 1.23  2007/02/02 07:44:23  troy
 *     further dynamic rule implementation
 *
 *     Revision 1.22  2007/02/01 12:18:57  troy
 *     more changes for dynamic rules
 *
 *     Revision 1.21  2007/01/08 12:45:47  Administrator
 *     version 14 updates
 *
 *     Revision 1.20  2006/12/12 13:44:00  admin
 *     build v1.13
 *
 *     Revision 1.19  2006/11/20 12:26:37  admin
 *     build v1.11 changes
 *
 *     Revision 1.18  2006/10/31 21:09:31  admin
 *     build v1.08
 *
 *     Revision 1.17  2006/10/10 23:52:58  admin
 *     worked on jobs
 *
 *     Revision 1.16  2006/10/04 02:14:05  admin
 *     enhanced rules
 *
 *     Revision 1.15  2006/09/25 12:45:56  admin
 *     Iteration 28 changes
 *
 *     Revision 1.14  2006/08/27 10:48:31  admin
 *     update status of assessments
 *
 *     Revision 1.13  2006/08/24 10:41:58  admin
 *     assessment system updates
 *
 *     Revision 1.12  2006/08/09 04:19:28  admin
 *     new feature, ability to update answers at assesment level
 *
 *     Revision 1.11  2006/08/03 22:25:04  admin
 *     reports
 *
 *     Revision 1.10  2006/07/27 23:19:45  admin
 *     version 1.02
 *
 *     Revision 1.9  2006/07/25 05:32:31  admin
 *     assessment updates
 *
 *     Revision 1.8  2006/07/22 04:56:35  admin
 *     new jobhistory changes
 *
 *     Revision 1.7  2006/07/19 00:45:21  admin
 *     fixed search and associate jsm link
 *
 *     Revision 1.6  2006/06/29 05:49:00  administrator
 *     updates for rework
 *
 *     Revision 1.5  2006/06/28 08:30:31  administrator
 *     updates for rework
 *
 *     Revision 1.4  2006/06/16 02:10:21  administrator
 *     updates for rework
 *
 *     Revision 1.3  2006/06/16 00:19:51  administrator
 *     restructure progress
 *
 *     Revision 1.2  2006/06/13 23:28:52  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.7  2006/06/05 07:01:12  administrator
 *     updates for rework
 *
 *     Revision 1.6  2006/05/30 23:45:44  administrator
 *     restructure progress
 *
 *     Revision 1.5  2006/05/26 06:57:37  administrator
 *     updates for rework
 *
 *     Revision 1.4  2006/05/26 02:33:32  administrator
 *     restructure progress
 *
 *     Revision 1.3  2006/05/24 06:01:22  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/05/23 23:22:13  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/05/22 06:06:01  administrator
 *     Version 2
 *
 *     Revision 1.4  2006/02/01 06:48:58  administrator
 *     moved functions from base object
 *
 *     Revision 1.3  2006/01/24 23:28:17  administrator
 *     restructure to remove needless interface and added new mql object
 *
 *     Revision 1.2  2005/12/07 04:28:49  administrator
 *     Job History implementation
 *
 *     Revision 1.1  2005/11/16 05:28:39  administrator
 *     new library to share amongst mql, ims and ams
 *
 *     Revision 1.13  2005/10/21 03:58:17  administrator
 *     user logins and permissions
 *
 *     Revision 1.12  2005/10/20 05:48:54  administrator
 *     Login functions
 *
 *     Revision 1.11  2005/10/11 22:11:36  administrator
 *     Floating action buttons, multiple chemicals and import function
 *
 *     Revision 1.10  2005/10/10 07:10:21  administrator
 *     implemented sequence change functionality
 *
 *     Revision 1.9  2005/09/30 06:50:24  administrator
 *     edit text functions
 *
 *     Revision 1.8  2005/09/30 00:26:00  administrator
 *     unify the interface and enhancement on action buttons
 *
 *     Revision 1.7  2005/09/14 04:29:13  administrator
 *     feature for creating rules
 *
 *     Revision 1.6  2005/09/13 23:17:49  administrator
 *     main action buttons
 *
 *     Revision 1.5  2005/09/09 07:09:36  administrator
 *     Tidy up interface
 *
 *     Revision 1.4  2005/08/24 03:42:08  administrator
 *     Connection is static and stays open
 *
 *     Revision 1.3  2005/08/24 03:04:14  administrator
 *     tidy up before conn bug fix
 *
 *     Revision 1.2  2005/08/12 00:58:23  administrator
 *     show all answers and questions
 *
 *     Revision 1.1  2005/08/04 04:22:57  administrator
 *     half implemented tab feature
 *
 *     
 */
package com.researchit.html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.researchit.Agent;
import com.researchit.AgentExample;
import com.researchit.AgentGroup;
import com.researchit.common.Address;
import com.researchit.common.DBBaseObject;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobSpecificModule;
//import com.researchit.JobTitle;
import com.researchit.common.Participant;
import com.researchit.FrozenQA;
import com.researchit.ParticipantStatus;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.Role;
import com.researchit.User;
import com.researchit.Util;
import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertRule;

public class HTMLObject {

	protected final int FJSMLENGTH = 20;
	protected final int AJSMLENGTH = 20;
	protected final int STUDYLENGTH = 18;
	private final int AGENTLENGTH = 10;
	protected final int JSMLENGTH = 12;
	public HTMLObject() {

	}	
	public static String getSystemVersion() {
		return "V.AMR.2.0.25";			
	}
	public String showLHSMTabs(String jsmType, boolean agents, Study study) throws Exception {
		return this.showLHSMTabs(jsmType,agents,study,null);
	}
	public String showLHSMTabs(String jsmType, boolean agents, Study study,User user) throws Exception {
		ArrayList<String> types = new ArrayList<String>(Arrays.asList("TJSMs", "TAJSMs", "JSMs", "AJSMs", "Agents", "Home", "Users", "Roles", "Study", "Check", "StudyJSM", "Misc"));
		String strRetValue = "";

		strRetValue += "<table class=LHSMenuTop>";
		strRetValue += "<tr valign=bottom><td>";
		strRetValue += "<div id='LHSTabheader'>";
		strRetValue += "<ul>";

		switch (types.indexOf(jsmType)) {
		case 0: 
			strRetValue += "<li><a href=main.jsp?jsmType=JSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=jsm.gif' alt='SSJSMs' title='Study Specific JSMs'></img></a></li>";
			strRetValue += "<li id='current'><a href=main.jsp?jsmType=TJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tjsm.gif' alt='TJSMs' title='Template JSMs'></img></a></li>";
			strRetValue += "<li><a href=main.jsp?jsmType=TAJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tajsm.gif' alt='TAJSMs' title='Template Associate JSMs'></img></a></li>";
			if (agents){strRetValue += "<li><a href=main.jsp?jsmType=Agents onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=agent.gif' alt='Agents' title='Agents'></img></a></li>";}				


			break;
		case 1:
			strRetValue += "<li><a href=main.jsp?jsmType=JSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=jsm.gif' alt='SSJSMs' title='Study Specific JSMs'></img></a></li>";
			strRetValue += "<li><a href=main.jsp?jsmType=TJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tjsm.gif' alt='TJSMs' title='Template JSMs'></img></a></li>";
			strRetValue += "<li id='current'><a href=main.jsp?jsmType=TAJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tajsm.gif' alt='TAJSMs' title='Template Associate JSMs'></img></a></li>";
			if (agents){strRetValue += "<li><a href=main.jsp?jsmType=Agents onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=agent.gif' alt='Agents' title='Agents'></img></a></li>";}

			break;
		case 2:
			strRetValue += "<li id='current'><a href=main.jsp?jsmType=JSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=jsm.gif' alt='SSJSMs' title='Study Specific JSMs'></img></a></li>";
			if(user!=null){
				if(user.hasPermission(User.Permission.VIEWTEMPLATEJSMS)){
					strRetValue += "<li><a href=main.jsp?jsmType=TJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tjsm.gif' alt='TJSMs' title='Template JSMs'></img></a></li>";
					strRetValue += "<li><a href=main.jsp?jsmType=TAJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tajsm.gif' alt='TAJSMs' title='Template Associate JSMs'></img></a></li>";
					if (agents){strRetValue += "<li><a href=main.jsp?jsmType=Agents onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=agent.gif' alt='Agents' title='Agents'></img></a></li>";}				
				}				
			}
			break;
		case 3:
			strRetValue += "<li><a href=main.jsp?jsmType=JSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=jsm.gif' alt='SSJSMs' title='Study Specific JSMs'></img></a></li>";
			strRetValue += "<li><a href=main.jsp?jsmType=TJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tjsm.gif' alt='TJSMs' title='Template JSMs'></img></a></li>";
			strRetValue += "<li><a href=main.jsp?jsmType=TAJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tajsm.gif' alt='TAJSMs' title='Template Associate JSMs'></img></a></li>";
			if (agents){strRetValue += "<li><a href=main.jsp?jsmType=Agents onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=agent.gif' alt='Agents' title='Agents'></img></a></li>";}

			break;
		case 4:
			strRetValue += "<li><a href=main.jsp?jsmType=JSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=jsm.gif' alt='SSJSMs' title='Study Specific JSMs'></img></a></li>";
			strRetValue += "<li><a href=main.jsp?jsmType=TJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tjsm.gif' alt='TJSMs' title='Template JSMs'></img></a></li>";
			strRetValue += "<li><a href=main.jsp?jsmType=TAJSMs onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=tajsm.gif' alt='TAJSMs' title='Template Associate JSMs'></img></a></li>";
			if (agents){strRetValue += "<li id='current'><a href=main.jsp?jsmType=Agents onclick=\"showProgress()\" ><img border=0 src='ImageStream?ImageName=agent.gif' alt='Agents' title='Agents'></img></a></li>";}
			break;
		case 5://Home page quick links
			strRetValue += "<li id='current'><a><b>Quick Links</b></a></li>";
			break;
		case 6://Users
			strRetValue += "<li id='current'><a href=main.jsp?BlueTabLocation=Admin&userTab=Users onclick=\"return showProgress()\"><b>Users</b></img></a></li>";
			strRetValue += "<li><a href=main.jsp?BlueTabLocation=Admin&userTab=Roles onclick=\"return showProgress()\"><b>Roles</b></img></a></li>";
			break;
		case 7://Roles
			strRetValue += "<li><a href=main.jsp?BlueTabLocation=Admin&userTab=Users onclick=\"return showProgress()\"><b>Users</b></img></a></li>";
			strRetValue += "<li id='current'><a href=main.jsp?BlueTabLocation=Admin&userTab=Roles onclick=\"return showProgress()\"><b>Roles</b></a></li>";
			break;
		case 8://Study
			if (study == null) {
				strRetValue += "<li id='current'><a><b>Study</b></a></li>";
			}else{
				strRetValue += "<li id='current'><a href=main.jsp?studyID="
					+ study.getId()
					+ " onclick=\"return showProgress()\">"
					+ "<b>" + this.truncateName(study.getName(),18) + "</b></a></li>";
			}
			break;
		case 9://Check
			strRetValue += "<li id='current'><a><b>Check</b></a></li>";
			break;
		case 10://StudyJSM
			strRetValue += "<li id='current'><a><b>StudyJSM</b></a></li>";
			break;
		case 11://Misc
			strRetValue += "<li id='current'><a><b>Task</b></a></li>";
			break;

		default:
			strRetValue += "<li id='current'><a><b>Menu</b></a></li>";
		}

		strRetValue += "</ul>";
		strRetValue += "</div>";
		strRetValue += "</td></tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showStudyJsms(Study study) throws Exception {
		String retValue = "";
		retValue += showTitleBarAndCloseButton("JSM Management","closeEdit");
		retValue += "<table class=EditView cellpadding=0 cellspacing=0>";		
		retValue +="<tr>";
		retValue +="<td>";
		retValue +="<table width=100%>";       	
		retValue +="<tr>";
		retValue +="<td valign=top>";
		retValue += this.showFrozenJSMsList(study);
		retValue +="</td>";
		retValue +="</tr>";
		retValue +="</table>";
		retValue +="</td>";
		retValue +="</tr>"; 
		retValue += "</table>";
		return retValue;	
	}
	public String showTitleBarAndCloseButton(String title, String closeParameterName) {
		String retValue = "<table width=100% cellpadding=0 cellspacing=0 style='border-top: 1px solid #47aade;border-left: 1px solid #47aade;border-right: 1px solid #47aade;'><tr class=windowTop><td align=center width=100%>" + title + "</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=" + closeParameterName + " title='Close Edit Mode' height=16 width=16/></td></tr><table>";
		return retValue;
	}
	private String showFrozenJSMsList(Study study) throws Exception {
		String retVal = "";			
		ArrayList<JobSpecificModule> studyJSMs = study.getStudySpecificJsms();
		retVal += "<table class=ContentList>";
		retVal +="<tr class=ListHeader><td valign=top style='padding-left:10px'><img alt='Select All' id=selectAllImage name=selectAllImage src='ImageStream?ImageName=unchecked.gif' onclick=swapSelectAllImage(this);></img></td><td>Study Specific JSMs</td><td align=center>Time Stamp</td><td align=center>Usage Count</td></tr>";
		//retVal +="<tr><td style='align:left;'><input id=selectall type=checkbox title='Select All' onclick='removeCheckIfChecked(selectall), checkAllCheckboxes();'></input></td></tr>";

		String dateUpdated = "";

		for(JobSpecificModule jsm: studyJSMs){
			dateUpdated = jsm.getDateUpdated();
			retVal += "<tr>";
			retVal += "<td valign=top style='padding-left:10px'><input id="
				+ jsm.getId()+" type=checkbox name=jsmsCheckBox_"
				+ jsm.getId()
				+ "></input></td><td>"+jsm.getName()+"</td><td align=center>"+dateUpdated+"</td><td></td>";
			retVal += "</tr>";			
			int i=1;
			String dateCreated = "";
			for(FrozenJobSpecificModule fjsm: jsm.getFrozenJSMs(study.getId())){
				String outOfDate = "";
				dateCreated = fjsm.getDateCreated();
				if(dateUpdated.compareTo(dateCreated)>0){
					outOfDate = "<image src='ImageStream?ImageName=warning.gif' alt='Out of date' title='Out of date' border=0 />";
				}
				retVal += "<tr><td style='padding-left:20px'><input id="
					+ fjsm.getId()+" type=checkbox name=jsmsCheckBox_"
					+ fjsm.getId()
					+ "></input></td><td>Frozen Version "+i+" of "+jsm.getName()+"</td><td align=center>"+fjsm.getDateCreated()+outOfDate+"</td><td align=center>"+fjsm.getInterviews(study.getId()).size()+"</td></tr>";
				i++;
			}		
		}
		retVal += "</table>";		
		return retVal;
	}
	public String showStudies(String selId, ArrayList<Study> array) {
		String strRetValue = "<table class=LHSMenuContent>";
		if(array.size()>0){
			for (Study study : array) {
				if (study.getId().equalsIgnoreCase(selId)) {
					strRetValue += "<tr><td title='" + study.getDescription() + "'><a href=main.jsp?studyID="
					+ study.getId()
					+ " onclick=\"return showProgress()\">"
					+ this.truncateName(study.getName(), STUDYLENGTH)
					+ "</a></td></tr>";
				} else {
					strRetValue += "<tr><td class=studies title='" + study.getDescription() + "'><a class=LHSMenu href=main.jsp?studyID="
					+ study.getId()
					+ " onclick=\"return showProgress()\">"
					+ this.truncateName(study.getName(), STUDYLENGTH)
					+ "</a></td></tr>";
				}
			}
		}else{       	
			strRetValue += "<tr ><td class=studies>No Studies Found</td></tr>";               
		}       
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showStudyWithParticipants(Study study,List<Participant> participants, Long selParticipantId, int participantPage, int pageSize) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";       
		ArrayList<String> participantNames = new ArrayList<String>();
		for (Participant participant : participants) {
			participant.getPersistantObject();
			String strClass= "";
			if (participant.getParticipantId().equals(selParticipantId)) {
				strClass= "class=Highlight";
			} else {
				strClass= "";
			}   
			String strTitle = "";
			if(!(this.getClass().equals(AssessmentSystem.class))){
				strTitle = "title='" + participant.getFullName() + "'";
			}
			String txt = "<tr><td>&nbsp;</td><td " + strClass + " "+strTitle+"><a class=LHSMenu href=main.jsp?participantID="
			+ participant.getParticipantId()
			+ " onclick=\"return showProgress()\">"
			+ participant.getAmrRefId()
			//+ participant.getReferenceNumber()
			+ "</a></td></tr>";
			participantNames.add(txt);   
		}
		int itemsOnPage = pageSize;
		int totalPages = Util.getTotalPagesFromPagedItems(participantNames.size(), itemsOnPage);    
		Object[] pageList = Util.getPageFromPagedItems(participantNames, itemsOnPage, participantPage);
		for (Object item : pageList) {
			strRetValue += (String)item; 
		}
		//If a user is on the last page then selects search,'participantPage' should be returned to 1
		if (participantPage > totalPages){participantPage = 1;}
		int prevPage = participantPage - 1;
		if (prevPage < 1){prevPage = 1;}      
		int nextPage = participantPage + 1;
		if (nextPage > totalPages){nextPage = totalPages;}

		strRetValue += "</table>";
		//show 'page x of y' text
		strRetValue += showPaging(prevPage,participantPage, totalPages, nextPage, false);
		//show box for changing page size 
		strRetValue += showPageSize(pageSize);
		return strRetValue;
	}
	public String showStudyWithAgents(Study study, String agentId) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";
		strRetValue += "\n<tr><td class=\"Highlight\" colspan=2 title='" + study.getName() + "'><a href=main.jsp?studyID="
		+ study.getId()
		+ " onclick=\"return showProgress()\">"
		+ this.truncateName(study.getName(), STUDYLENGTH)
		+ "</a></td></tr>";
		for (Agent agent : study.getAgents()) {
			String strClass= "";
			if (agent.getId().equalsIgnoreCase(agentId)) {
				strClass= "class=\"Highlight\"";
			} 
			strRetValue += "\n<tr><td>&nbsp;</td><td "+strClass+" title='" + agent.getName() + "'><a href=main.jsp?agentID="
			+ agent.getId()
			+ " onclick=\"return showProgress()\">"
			+ this.truncateName(agent.getName(), AGENTLENGTH)
			+ "</a></td></tr>";
		}
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showSearchedFullQuestions(List<Question> questions,String search, boolean bAgentOn) throws Exception {
		return this.showFullQuestions(questions,search ,bAgentOn,true,true,"");
	}    
	public String showFullQuestions(List<Question> questions, boolean bAgentOn) throws Exception {
		return this.showFullQuestions(questions,"",bAgentOn,false);
	}
	public String showFullQuestions(List<Question> questions,String search, boolean bAgentOn, boolean bShowKeyPhrases) throws Exception {
		return this.showFullQuestions(questions,search,bAgentOn,bShowKeyPhrases,true,"");
	}
	public String showFullQuestions(List<Question> questions,String search, boolean bAgentOn, boolean bShowKeyPhrases, boolean bShowCheckBoxes, String agentSearch) throws Exception {
		String strRetValue = "";
		strRetValue += "\n<table class=questions >";
		int i = 1;
		String questionPrefix = "";
		for (Question q : questions) {         	
			if(q.getTypeID().equals(Question.FREQUENCY)) {
				if(q.getName().contains("weeks")){	
					if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
						Question pq = new Question("",q.getParentQuestionID());	
						PossibleAnswer pa = new PossibleAnswer("",q.getParentID());
						questionPrefix = pq.getName()+"="+pa.getName()+"_";	
					}
				}
				else if (q.getName().contains("hours")){
					if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
						Question pq = new Question("",q.getParentQuestionID());
						if(!(pq.getParentQuestionID().equalsIgnoreCase(""))){
							Question ppq = new Question("",pq.getParentQuestionID());
							PossibleAnswer pa = new PossibleAnswer("",pq.getParentID());
							questionPrefix = ppq.getName()+"="+pa.getName()+"_";
						}       								
					}
				}  
			}
			String strAnswers = "";
			if(!(q.isMinimised())){
				strAnswers = this.showFullPossibleAnswers(q.getPossibleAnswers(), search, bAgentOn,bShowKeyPhrases,bShowCheckBoxes,agentSearch);
			}
			String strAgents = "";
			// if agent is on show agents
			if (bAgentOn) {
				ArrayList<Agent> missingAgentsFromParent = new ArrayList<Agent>();
				if(!(q.isRootQ())){
					String pQId = q.getParentQuestionID();
					if(!(pQId.equalsIgnoreCase(""))){
						Question parentQuestion = new Question("",pQId);
						ArrayList<Agent> parentAgents = parentQuestion.getAgents();           		
						for(Agent agent: q.getAgents()){
							if(!(parentAgents.contains(agent))){
								missingAgentsFromParent.add(agent);
							}
						}
					} 
				}           	
				if(agentSearch==null){
					agentSearch = "";
				}
				strAgents = "<tr><td colspan=4 class=questionagents title='All Agents associated to this question'>" + this.showListAgents(q.getAgents(),missingAgentsFromParent,agentSearch) + "&nbsp;</td></tr>";            		           	
				//            	if(agentSearch.equals("")){
				//            		strAgents = "<tr><td colspan=4 class=questionagents title='All Agents associated to this question'>" + this.showList(q.getAgents()) + "&nbsp;</td></tr>";
				//            	}else{
				//            		strAgents = "<tr><td colspan=4 class=questionagents title='All Agents associated to this question'>" + this.showList(q.getAgents(),agentSearch) + "&nbsp;</td></tr>";            		
				//            	}
			}
			// show notes and isMultiple
			String strNotes = "";
			if (!(q.getNotes().equalsIgnoreCase("NULL"))) {
				if (!(q.getNotes().equalsIgnoreCase(""))) {
					String strMultiple = "";
					if (q.isMultiple()) {
						strMultiple = "Allow Multiple";
					}
					strNotes = "<tr><td colspan=2></td><td colspan=2><font color=orange>Note: "
						+ q.getNotes()
						+ "</font>&nbsp;&nbsp;<font color=gray>"
						+ strMultiple
						+ "</font></td></tr>";
				}
			}
			String strMultiple = "";
			if (q.isMultiple()) {
				strMultiple = "Allow Multiple";
				if (strNotes.equalsIgnoreCase("")) {
					strNotes = "<tr><td colspan=2></td><td colspan=2><font color=gray>"
						+ strMultiple
						+ "</font></td></tr>";
				}
			}
			String showWithParent = "";
			if(q.isViewWithParent()){
				showWithParent = "<image src='ImageStream?ImageName=withParent.gif' alt='Will be shown with parent question' />";
			}
			// check for linked associate jsm
			if (q.isAssociateJSM()) {
				strRetValue += "\n<tr>";
				strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
				int iSeq = Integer.parseInt(q.getSequence())+1;
				strRetValue += "\n <td nowrap>("+ iSeq+ ")";
				if(bShowCheckBoxes){
					strRetValue += "\n <input type=checkbox name=questionsCheckBox_"+ q.getJsmQuestionStructureID()+ "></input>";
				}
				String type = " ";
				//Get the JSM id and find its type
				String ajsmid = q.getAssociateJSMID();
				if(!(ajsmid.equalsIgnoreCase(""))){
					JobSpecificModule jsm = new JobSpecificModule(ajsmid);                   
					switch(jsm.getJsmTypeId()) {
					case JobSpecificModule.TEMPLATE: type = "TAJSMs";
					break;
					case JobSpecificModule.STUDY: type = "AJSMs";
					}
				}
				String location = "Structure";
				if (bAgentOn) {
					location = "Agents";
				}
				//Create the href, passing the jsmType and jsmID to main.jsp
				strRetValue += "\n </td>";
				strRetValue += "\n <td><a href=./main.jsp?Location="+location+"&jsmType="
				+ type 
				+ "&jsmID="
				+ q.getAssociateJSMID()
				+ " onclick=\"return showProgress()\">"
				+ q.getDescription()
				+ "</a></td>";
				strRetValue += "\n <td valign=top><a name=lqAnchor"
					+ q.getJsmQuestionStructureID()
					+ "></a><a name=qAnchor"
					+ q.getId()
					+ "></a></td>";
				strRetValue += "\n</tr>";               
			} else {
				String strDescription = q.getDescription();
				String strKeyPhrase = "";
				if(bShowKeyPhrases){
					if(q.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
						strKeyPhrase = "<font class=KeyPhrase>"+questionPrefix+"</font><font class=KeyPhraseFreq>"+q.getName()+"</font>&nbsp;";
					}else{
						strKeyPhrase = "<font class=KeyPhrase>"+q.getName()+"</font>&nbsp;";
					}
				}
				if(!(search.equalsIgnoreCase(""))){
					strKeyPhrase = this.highlightSearch(strKeyPhrase,search); 
					strDescription = this.highlightSearch(strDescription,search); 
				}
				String strMinMaxLink = "";
				String image = "minus.gif";
				if(q.isMinimised()){
					image = "plus.gif";
				}
				if (q.getAllPossibleAnswers().size()==0){
					strMinMaxLink = "";
				}else {
					strMinMaxLink = "<input type=image src='ImageStream?ImageName=" + image + "' height=10 width=10  name=" + q.getJsmQuestionStructureID() + "_MinMax alt=\"MinMax\"</input>";
				}
				strRetValue += strAgents;
				strRetValue += "\n<tr>";
				strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >"+strMinMaxLink+"</td>";
				int iSeq = Integer.parseInt(q.getSequence())+1;
				strRetValue += "\n <td nowrap>("+ iSeq+ ")";               
				if(bShowCheckBoxes){
					strRetValue += "\n <input id="+q.getJsmQuestionStructureID()+" type=checkbox name=questionsCheckBox_"+ q.getJsmQuestionStructureID()+ "></input>";
				}               
				strRetValue += "\n </td>";
				strRetValue += "\n <td width=98% ><label for="+q.getJsmQuestionStructureID()+">";
				strRetValue += strKeyPhrase + " " + strDescription + "</label></td>";
				strRetValue += "\n <td valign=top><a name=lAnchor"
					+ q.getJsmQuestionStructureID()
					+ "></a><a name=anchor"
					+ q.getId()
					+ "></a>"+showWithParent+"&nbsp;</td>";
				strRetValue += "\n</tr>";
				strRetValue += strNotes;
				strRetValue += "\n<tr>";
				strRetValue += "\n <td>&nbsp;</td>";
				strRetValue += "\n <td colspan=3>" + strAnswers + "</td>";
				strRetValue += "\n</tr>";
			}
			i++;
		}
		strRetValue += "\n</td></tr></table>";
		return strRetValue;
	}
	public String showFullQuestionsAgentView(List<Question> questions,ExpertAgent agent,boolean bShowRules) throws Exception {
		String strRetValue = "";
		strRetValue += "\n<table class=questions >";
		int i = 1;
		String strAgents= "";   
		String questionPrefix = "";
		for (Question q : questions) {       
			if(q.getTypeID().equals(Question.FREQUENCY)) {
				if(q.getName().contains("weeks")){	
					if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
						Question pq = new Question("",q.getParentQuestionID());	
						PossibleAnswer pa = new PossibleAnswer("",q.getParentID());
						questionPrefix = pq.getName()+"="+pa.getName()+"_";	
					}
				}
				else if (q.getName().contains("hours")){
					if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
						Question pq = new Question("",q.getParentQuestionID());
						Question ppq = new Question("",pq.getParentQuestionID());
						PossibleAnswer pa = new PossibleAnswer("",pq.getParentID());
						questionPrefix = ppq.getName()+"="+pa.getName()+"_";				
					}
				}  
			}       	
			strAgents = "<tr><td colspan=4 class=questionagents>" 
				+ agent.getName() 
				+ "&nbsp;</td></tr>";            	            
			// show notes and isMultiple
			String strNotes = "";
			if (q.getNotes() != null) {
				if (!(q.getNotes().equalsIgnoreCase(""))) {
					String strMultiple = "";
					if (q.isMultiple()) {
						strMultiple = "Allow Multiple";
					}
					strNotes = "<tr><td colspan=2></td><td colspan=2><font color=gray>"
						+ strMultiple
						+ "</font></td></tr>";
				}
			}
			String strMultiple = "";
			if (q.isMultiple()) {
				strMultiple = "Allow Multiple";
				if (strNotes.equalsIgnoreCase("")) {
					strNotes = "<tr><td colspan=2></td><td colspan=2><font color=gray>"
						+ strMultiple
						+ "</font></td></tr>";
				}
			}           
			String strDescription = q.getDescription();
			String strKeyPhrase = "";      	
			if(q.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				strKeyPhrase = "<font class=KeyPhrase>"+questionPrefix+"</font><font class=KeyPhraseFreq>"+q.getName()+"</font> | ";
			}else{
				strKeyPhrase = "<font class=KeyPhrase>"+q.getName()+"</font> | ";
			}       	
			String strMinMaxLink = "";
			String image = "minus.gif";
			if(q.isMinimised()){
				image = "plus.gif";
			}
			if (q.getAllPossibleAnswers().size()==0){
				strMinMaxLink = "";
			}else {
				strMinMaxLink = "<input type=image src='ImageStream?ImageName=" + image + "' height=10 width=10  name=" + q.getJsmQuestionStructureID() + "_MinMax alt=\"MinMax\"</input>";
			}
			String strAnswers = "";
			if(!(q.isMinimised())){
				strAnswers = this.showFullPossibleAnswersAgentView(q.getPossibleAnswers(), agent, bShowRules);
			}
			strRetValue += strAgents;
			strRetValue += "\n<tr>";
			strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >"+strMinMaxLink+"</td>";
			int iSeq = Integer.parseInt(q.getSequence())+1;
			strRetValue += "\n <td nowrap>("+ i+ ")["+ iSeq+ "]";                            
			strRetValue += "\n </td>";
			strRetValue += "\n <td width=98% ><label for="+q.getJsmQuestionStructureID()+">" +strKeyPhrase + " " + strDescription + "</label></td>";
			strRetValue += "\n <td valign=top><a name=lAnchor"
				+ q.getJsmQuestionStructureID()
				+ "></a><a name=anchor"
				+ q.getId()
				+ "></a>&nbsp;</td>";
			strRetValue += "\n</tr>";
			strRetValue += strNotes;
			strRetValue += "\n<tr>";
			strRetValue += "\n <td>&nbsp;</td>";
			strRetValue += "\n <td colspan=3>" + strAnswers + "</td>";
			strRetValue += "\n</tr>";           
			i++;
		}
		strRetValue += "\n</td></tr></table>";
		return strRetValue;
	}
	public String showFullQuestionsPrintView(List<Question> questions,String search, boolean bAgentOn, boolean bShowKeyPhrases, boolean bShowCheckBoxes) throws Exception {
		String strRetValue = "";
		strRetValue += "\n<table style=\"border-right: gray thin solid; padding-right: 0px; border-top: gray thin solid; padding-left: 0px; padding-bottom: 0px; margin: 1px; border-left: gray thin solid; padding-top: 0px; border-bottom: gray thin solid; font-family: Arial\" >";
		int i = 1;
		for (Question q : questions) {
			String strAnswers = "";
			if(!(q.isMinimised())){
				strAnswers = this.showFullPossibleAnswersPrintView(q.getPossibleAnswers(), "", false,false,true);
			}
			String strAgents = "";
			// if agent is on show agents
			if (bAgentOn) {              
				strAgents = "<tr><td colspan=4 class=agents>" + this.showList(q.getAgents()) + "&nbsp;</td></tr>";
			}
			// show notes and isMultiple
			String strNotes = "";
			if (q.getNotes() != null) {
				if (!(q.getNotes().equalsIgnoreCase(""))) {
					String strMultiple = "";
					if (q.isMultiple()) {
						strMultiple = "Allow Multiple";
					}
					strNotes = "<tr><td colspan=2></td><td colspan=2><font color=orange>Note: "
						+ q.getNotes()
						+ "</font>&nbsp;&nbsp;<font color=gray>"
						+ strMultiple
						+ "</font></td></tr>";
				}
			}
			String strMultiple = "";
			if (q.isMultiple()) {
				strMultiple = "Allow Multiple";
				if (strNotes.equalsIgnoreCase("")) {
					strNotes = "<tr><td colspan=2></td><td colspan=2><font color=gray>"
						+ strMultiple
						+ "</font></td></tr>";
				}
			}
			// check for linked associate jsm
			if (q.isAssociateJSM()) {
				strRetValue += "\n<tr>";
				strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
				strRetValue += "\n <td nowrap>("+ i+ ")";
				if(bShowCheckBoxes){
					strRetValue += "\n <input type=checkbox name=questionsCheckBox_"+ q.getJsmQuestionStructureID()+ "></input>";
				}
				strRetValue += "\n </td>";
				strRetValue += "\n <td><a href=./main.jsp?jsmID="
					+ q.getAssociateJSMID()
					+ " onclick=\"return showProgress()\">"
					+ q.getDescription()
					+ "</a></td>";
				strRetValue += "\n <td valign=top><a name=lqAnchor"
					+ q.getJsmQuestionStructureID()
					+ "></a><a name=qAnchor"
					+ q.getId()
					+ "></a></td>";
				strRetValue += "\n</tr>";               
			} else {
				String strDescription = q.getDescription();
				String strKeyPhrase = "";
				if(bShowKeyPhrases){
					strKeyPhrase = "<font class=question>"+q.getName()+"</font> | ";
				}
				if(!(search.equalsIgnoreCase(""))){
					strKeyPhrase = this.highlightSearch(strKeyPhrase,search); 
					strDescription = this.highlightSearch(strDescription,search); 
				}
				String strMinMaxLink = "";
				if(q.isRootQ()){
					String image = "-";
					if(q.isMinimised()){
						image = "+";
					}
					strMinMaxLink = "<a href=ControllerServlet?Action=MinMax&questionId="+q.getJsmQuestionStructureID()+">"+image+"</a>";
				}

				strRetValue += strAgents;
				strRetValue += "\n<tr>";
				strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >"+strMinMaxLink+"</td>";
				strRetValue += "\n <td nowrap>("+ i+ ")";               
				if(bShowCheckBoxes){
					strRetValue += "\n <input id="+q.getId()+" type=checkbox name=questionsCheckBox_"+ q.getJsmQuestionStructureID()+ "></input>";
				}               
				strRetValue += "\n </td>";
				strRetValue += "\n <td width=98% ><label for="+q.getId()+">" +strKeyPhrase + " " + strDescription + "</label></td>";
				strRetValue += "\n <td valign=top><a name=lAnchor"
					+ q.getJsmQuestionStructureID()
					+ "></a><a name=anchor"
					+ q.getId()
					+ "></a>&nbsp;</td>";
				strRetValue += "\n</tr>";
				strRetValue += strNotes;
				strRetValue += "\n<tr>";
				strRetValue += "\n <td>&nbsp;</td>";
				strRetValue += "\n <td colspan=3>" + strAnswers + "</td>";
				strRetValue += "\n</tr>";
			}
			i++;
		}
		strRetValue += "\n</td></tr></table>";
		return strRetValue;
	} 
	public String showNavTitle(ArrayList<Object> arrayL) {
		String strNavTitle = "<table class=navtitle><tr><td>";
		String strClassName = "";  
		int pos = 0;
		int count = 1;

		for(Object obj: arrayL) {
			if(obj!=null){
				if (obj instanceof String) {
					strNavTitle +=(String)obj;
				}else{
					DBBaseObject dbobj = (DBBaseObject)obj;
					strClassName = dbobj.getClass().toString().replace(" ",".");
					pos = dbobj.getClass().toString().lastIndexOf(".")+1;
					strClassName = dbobj.getClass().toString().substring(pos);
					if (count == arrayL.size()) {
						strNavTitle += strClassName;
					}else{
						strNavTitle += " <a href=main.jsp?"+strClassName.toLowerCase()+"ID="+dbobj.getId()+" onclick=\"return showProgress()\">"+strClassName+"-></a>";        		
					}	        	
				}
			}       	
			++count;
		}       	
		strNavTitle += "</td></tr></table>";
		return strNavTitle;
	}
	private String showFullPossibleAnswers(List<PossibleAnswer> answers, String search, boolean bAgentOn, boolean bShowKeyPhrase,boolean bShowCheckBoxes,String agentSearch) throws Exception {
		String strRetValue = "";
		if (answers.size() != 0) {
			strRetValue = "\n<table width=100% border=0><tr ><td><table border=0 class=possibleanswers>";
			int i = 1;           
			for (PossibleAnswer answer : answers) {
				String strDescription = this.highlightSearch(answer.getDescription(), search);
				if(!(this.validatePossibleAnswer(strDescription))){
					strDescription = "<span class=warning>"+strDescription+"</span>";
				}
				//add minmax tag to line
				String strMinMaxLink = "";           	
				String image = "plus.gif";
				if (answer.isShowChildQuestions()) {
					image = "minus.gif";
				}
				if(answer.getChildQuestions().size()==0){
					strMinMaxLink = "";
				}else{
					strMinMaxLink = "<input type=image src='ImageStream?ImageName=" + image + "' height=10 width=10  name=" + answer.getJsmQuestionPossibleAnswerStructureID() + "_MinMax alt=\"MinMax\"</input>";
				}
				strRetValue += "\n<tr>";
				strRetValue += "\n <td class=possibleanswers title='"
					+ answer.getId()
					+ " "
					+ answer.getJsmQuestionPossibleAnswerStructureID()
					+ "' >"
					+ strMinMaxLink
					+ "</td>";
				int iSeq = Integer.parseInt(answer.getSequence())+1;
				strRetValue += "\n <td class=possibleanswers nowrap>("+ iSeq+ ")";
				if(bShowCheckBoxes){
					strRetValue += "\n <input id="+answer.getJsmQuestionPossibleAnswerStructureID()+" type=checkbox name=possibleAnswersCheckBox_"+ answer.getJsmQuestionPossibleAnswerStructureID()+ "></input>";               	
				}
				strRetValue += "\n </td>";
				strRetValue += "\n <td class=possibleanswers width=98%><label for="+answer.getJsmQuestionPossibleAnswerStructureID()+">" + strDescription + "</label></td>";
				strRetValue += "\n <td class=possibleanswers valign=top><a name=lAnchor"
					+ answer.getJsmQuestionPossibleAnswerStructureID()
					+ "></a><a name=anchor"
					+ answer.getId()
					+ "></a>&nbsp;</td>";
				strRetValue += "\n</tr>";
				if (answer.getChildQuestions().size() > 0 && answer.isShowChildQuestions()) {
					String childqs = this.showFullQuestions(answer.getChildQuestions(), search, bAgentOn,bShowKeyPhrase,bShowCheckBoxes,agentSearch);
					strRetValue += "<tr><td class=possibleanswers></td><td colspan=3>" + childqs + "</td></tr>";
				}
				i++;
			}
			strRetValue += "</table></td></tr></table>";
		}else{
			strRetValue = "\n<table width=100% border=0><tr><td><table border=0 class=possibleanswers><td class='warning'>Question has no possible answers</td>";
			strRetValue += "</table></td></tr></table>";
		}
		return strRetValue;
	}  
	private boolean validatePossibleAnswer(String strDescription) {
		boolean retValue = true;
		if((strDescription.contains("["))&&(!strDescription.contains("]"))){
			retValue = false;
		}
		if((!strDescription.contains("["))&&(strDescription.contains("]"))){
			retValue = false;
		}
		if((strDescription.contains("["))&&(strDescription.contains("]"))){
			if (strDescription.contains("[number")) {
				try{
					int i1 = strDescription.indexOf("[number ") + 8;
					int i2 = strDescription.lastIndexOf("-");
					String strI = strDescription.substring(i1, i2);
					i1 = i2 + 1;
					i2 = strDescription.indexOf("]");
					String strJ = strDescription.substring(i1, i2);
					Integer.valueOf(strI);
					Integer.valueOf(strJ);
				}catch(Exception ex){
					retValue = false;
				}
			}
		}
		return retValue;
	}
	private String showFullPossibleAnswersAgentView(List<PossibleAnswer> answers, ExpertAgent agent,boolean bShowRules) throws Exception {
		String strRetValue = "";
		if (answers.size() != 0) {
			strRetValue = "\n<table width=100% border=0><tr ><td><table border=0 class=possibleanswers>";
			int i = 1;           
			for (PossibleAnswer answer : answers) {
				String strDescription = answer.getDescription();
				String rule = "";
				if(bShowRules){
					Question q = new Question("",answer.getJsmQuestionStructureID());
					for(ExpertRule er: agent.getRulesWithQuestionAndPossibleAnswer(q,answer)){
						String typeId = er.getOutCome().toString();
						//String childTypeId = "";
						//            			if(er.getOutCome() == ExpertRule.RuleOutcome.PROBABLEHIGH){
						//            				typeId = ExpertRule.LEVELPROBABLE;
						//            				childTypeId = ExpertRule.LEVELHIGH;
						//            			}else if(er.getOutCome() == ExpertRule.RuleOutcome.PROBABLEMEDIUM){
						//            				typeId = ExpertRule.LEVELPROBABLE;
						//            				childTypeId = ExpertRule.LEVELMEDIUM;
						//            			}else if(er.getOutCome() == ExpertRule.RuleOutcome.PROBABLELOW){
						//            				typeId = ExpertRule.LEVELPROBABLE;
						//            				childTypeId = ExpertRule.LEVELLOW;
						//            			}else if(er.getOutCome() == ExpertRule.RuleOutcome.PROBABLEUNKNOWN){
						//            				typeId = ExpertRule.LEVELPROBABLE;
						//            				childTypeId = ExpertRule.LEVELUNKNOWN;
						//            			}else if(er.getOutCome() == ExpertRule.RuleOutcome.POSSIBLEUNKNOWN){
						//            				typeId = ExpertRule.LEVELPOSSIBLE;
						//            				childTypeId = ExpertRule.LEVELUNKNOWN;
						//            			}
						String ruleId = "";
						ruleId = er.getId();
						rule += "<td title='click to view rule' class="+er.getOutCome()+" align=center><a href=main.jsp?outcome="+typeId+"&ruleId="+ruleId+" onclick=\"return showProgress()\">"+er.getSequence()+"</a></td>";
					}
				}                              
				//              add minmax tag to line
				String strMinMaxLink = "";
				String image = "plus.gif";
				if (answer.isShowChildQuestions()) {
					image = "minus.gif";
				}           	
				if(answer.getChildQuestions().size()==0){
					image = "";
				}
				if(answer.getChildQuestions().size()==0){
					strMinMaxLink = "";
				}else{
					strMinMaxLink = "<input type=image src='ImageStream?ImageName=" + image + "' height=10 width=10  name=" + answer.getJsmQuestionPossibleAnswerStructureID() + "_MinMax alt=\"MinMax\"</input>";
				}
				strRetValue += "\n<tr>";
				strRetValue += "\n <td class=possibleanswers title='"
					+ answer.getId()
					+ " "
					+ answer.getJsmQuestionPossibleAnswerStructureID()
					+ "' >"
					+ strMinMaxLink
					+ "</td>";
				strRetValue += "\n <td class=possibleanswers nowrap>("+ i+ ")";
				if(bShowRules){
					strRetValue += "\n <input id="+answer.getJsmQuestionPossibleAnswerStructureID()+" type=checkbox name=possibleAnswersCheckBox_"+ answer.getJsmQuestionPossibleAnswerStructureID()+ "></input>";
				}               
				strRetValue += "\n </td>";
				strRetValue += "\n <td class=possibleanswers width=98%><label for="+answer.getJsmQuestionPossibleAnswerStructureID()+">" + strDescription + "</label></td>";
				strRetValue += "\n <td class=possibleanswers valign=top><a name=lAnchor"
					+ answer.getJsmQuestionPossibleAnswerStructureID()
					+ "></a><a name=anchor"
					+ answer.getId()
					+ "></a>&nbsp;</td>"+rule;
				strRetValue += "\n</tr>";
				if (answer.getChildQuestions().size() > 0 && answer.isShowChildQuestions()) {
					String childqs = this.showFullQuestionsAgentView(answer.getChildQuestions(), agent,bShowRules);
					strRetValue += "<tr><td class=possibleanswers></td><td colspan=3>" + childqs + "</td></tr>";
				}
				i++;
			}
			strRetValue += "</table></td></tr></table>";
		}
		return strRetValue;
	}     
	private String showFullPossibleAnswersPrintView(List<PossibleAnswer> answers, String search, boolean bAgentOn, boolean bShowKeyPhrase,boolean bShowCheckBoxes) throws Exception {
		String strRetValue = "";        
		if (answers.size() != 0) {
			strRetValue = "\n<table style=\"border-right: blue thin solid; padding-right: 0px; border-top: blue thin solid; padding-left: 0px; padding-bottom: 0px; margin: 1px; border-left: blue thin solid; color: blue; padding-top: 0px; border-bottom: blue thin solid; font-family: Arial\">";
			int i = 1;           
			for (PossibleAnswer answer : answers) {          	
				String strDescription = answer.getDescription();
				if(!(search.equalsIgnoreCase(""))){
					if(strDescription.toUpperCase().contains(search.toUpperCase())){
						String highlight = "<span class=searchHighlight>"+search+"</span>";
						strDescription = strDescription.replaceAll(search,highlight);
					}
				}
				String childqs = this.showFullQuestionsPrintView(answer.getChildQuestions(), "", false,false,false);
				strRetValue += "\n<tr>";
				strRetValue += "\n <td class=possibleanswers nowrap>("+ i+ ")";
				if(bShowCheckBoxes){
					strRetValue += "\n <input id="+answer.getJsmQuestionPossibleAnswerStructureID()+" type=checkbox name=possibleAnswersCheckBox_"+ answer.getJsmQuestionPossibleAnswerStructureID()+ "></input>";               	
				}
				strRetValue += "\n </td>";
				strRetValue += "\n <td class=possibleanswers width=98%><label for="+answer.getJsmQuestionPossibleAnswerStructureID()+">" + strDescription + "</label></td>";
				strRetValue += "\n </tr>";
				if (answer.getChildQuestions().size() > 0) {
					strRetValue += "<tr><td class=possibleanswers></td><td colspan=3>" + childqs + "</td></tr>";
				}
				i++;
			}
			strRetValue += "</table>";
		}
		return strRetValue;
	}
	public String showCombowithClass(String selId, String name, List<Role> array, String cssClass) throws Exception {
		String strRetValue = "<select  name=" + name + " id=" + name + " class=" + cssClass + " onchange=autoPost();>";
		for (Iterator<Role> it = array.iterator(); it.hasNext();) {
			Object o = it.next();
			if (o instanceof DBBaseObject) {
				DBBaseObject obj = (DBBaseObject) o;
				String strText = obj.getName();
				if(strText.length()>100){
					strText = strText.substring(0,97)+"...";
				}
				if (obj.getId().equalsIgnoreCase(selId)) {
					strRetValue += "<option selected value=" + obj.getId() + ">" + strText + "</option>";
				} else {
					strRetValue += "<option value=" + obj.getId() + ">" + strText + "</option>";
				}
			}
		}
		strRetValue += "</select>";
		return strRetValue;
	}
	//    public String showCombo(String selId, String name, List array) throws Exception {
	//    	return this.showCombo(selId,name,array,false,false, false);
	//    }
	//    public String showCombo(String selId, String name, List array,boolean autoPost) throws Exception {
	//    	return this.showCombo(selId,name,array,autoPost,false, false);
	//    }
	//    public String showCombo(String selId, String name, List array,boolean autoPost,boolean bNoneOption) throws Exception {
	//    	return this.showCombo(selId,name,array,autoPost,false, false);
	//    }
	@SuppressWarnings("rawtypes")
	public String showCombo(String selId, String name, List array,boolean autoPost,boolean bNoneOption,boolean bDisabled) throws Exception {
		String strRetValue = "\n<table cellpadding=1 cellspacing=1>";
		String autoPostScript = "";
		String disabled = "";
		if (bDisabled){disabled = "disabled";}
		if(autoPost){
			autoPostScript = " onchange=\"autoPost();\"";
		}
		String options = "";
		boolean found = false;
		//String firstItemId = "";
		// String firstItemName = "";
		for (Iterator it = array.iterator(); it.hasNext();) {
			DBBaseObject obj = (DBBaseObject) it.next();
			String strText = obj.getName();
			if(strText.length()>100){
				strText = strText.substring(0,97)+"...";
			}
			
			if (obj.getId().equalsIgnoreCase(selId)) {
				options += "<option selected title='" + strText + "' value=" + obj.getId() + ">" + strText + "</option>";
				found = true;
			} else {
				options += "<option title='" + strText + "' value=" + obj.getId() + ">" + strText + "</option>";
			}            
		}       
		String warningStyle = "";
		String rightBorderStyle = "";
		if(!found){
			if(bNoneOption){
				if((selId.equalsIgnoreCase("None"))||(selId.equalsIgnoreCase("NULL"))){
					options += "<option value=None selected>None</option>";
				}else{
					options += "<option value=None>None</option>";
				}	
			}else{
				if(!(selId.equalsIgnoreCase("NULL"))){
					warningStyle = "class=warning";
					rightBorderStyle = "style='border-right: red 1px solid;'";
				} 
				options.replaceFirst("<option", "<option selected");
				//        	options += "<option selected value=" + firstItemId + ">" + firstItemName + "</option>";
			}
		}else{
			if(bNoneOption){
				options += "<option value=None>None</option>";	
			}
		}
		strRetValue += "<tr><td "+warningStyle+" "+rightBorderStyle+" ><select " + disabled + " "+warningStyle+" style='width:200px;' name=" + name + autoPostScript+">";
		strRetValue += options;
		strRetValue += "</select></td></tr></table>";
		return strRetValue;
	}
	@SuppressWarnings("rawtypes")
	public String showTable(String selId, List array, boolean showCheckBox, String className) throws Exception {
		return this.showTable(selId, array, showCheckBox, className, false);
	}
	@SuppressWarnings("rawtypes")
	public String showTable(List selectArray, List array, boolean showCheckBox, String className,boolean showDescription) throws Exception { 
		String strRetValue = "<table class=ContentList>";
		String strHeaderCheckBox = "";
		//if (showCheckBox) {
		strHeaderCheckBox = "<td width=5% ></td>";
		//}
		if(showDescription){
			strRetValue += "<tr class=ListHeader>" + strHeaderCheckBox + "<td>Name</td><td>Description</td></tr>";
		}
		for (Iterator it = array.iterator(); it.hasNext();) {
			Object o = it.next();

			DBBaseObject obj = (DBBaseObject) o;
			String strChecked = "";
			String strHighlighted = "";
			if (selectArray.contains(obj)) {
				strHighlighted = "class=Highlight";
				strChecked = "checked";
			}
			String strCheckBox = "";
			if (showCheckBox) {
				strCheckBox = "<td width=5% align=center><input id="+obj.getId()+" type=checkbox "
				+ strChecked
				+ " name="
				+ className
				+ "CheckBox_"
				+ obj.getId()
				+ "></input></td>";
			}else{
				strCheckBox = "<td width=5% ></td>";
			}
			String strDescription = "";
			if (showDescription) {
				strDescription = "<td "+ strHighlighted+ ">" + obj.getDescription() + "</td>";
			}

			strRetValue += "<tr>"
				+ strCheckBox
				+ "<td "+ strHighlighted+ "><label for="+obj.getId()+">"
				+ obj.getName()
				+ "</label></td>"
				+ strDescription
				+ "</tr>";

		}
		strRetValue += "</table>";
		return strRetValue;
	}
	@SuppressWarnings("rawtypes")
	public String showTable(String selId, List array, boolean showCheckBox, String className, boolean showDescription)
	throws Exception {

		DBBaseObject obj = new DBBaseObject();
		obj.setId(selId);
		ArrayList<DBBaseObject> selectArray = new ArrayList<DBBaseObject>();
		selectArray.add(obj);
		return this.showTable(selectArray, array, showCheckBox, className, showDescription);
	}
	@SuppressWarnings("rawtypes")
	public String showList(ArrayList array) {
		return this.showList(array,"");
	}
	public String showListAgents(ArrayList<Agent> agents,ArrayList<Agent> missingFromParent,String search) {
		String strHTML = "";
		for(Agent agent: agents){
			String name = agent.getName();
			if(!(search.equalsIgnoreCase(""))){
				name = this.highlightSearch(name,search);
			}
			if(missingFromParent.contains(agent)){
				name = "<span class=warning title='This agent is not associated with parent question'>"+name+"</span>";
			}
			strHTML += name + ", ";
		}
		if (!(strHTML.equalsIgnoreCase(""))) {
			strHTML = strHTML.substring(0, strHTML.lastIndexOf(","));
		}
		return strHTML;
	}   
	@SuppressWarnings("rawtypes")
	public String showList(ArrayList array,String search) {
		String strHTML = "";
		for (Iterator it = array.iterator(); it.hasNext();) {
			Object o = it.next();

			DBBaseObject obj = (DBBaseObject) o;
			String name = obj.getName();
			name = this.highlightSearch(name,search);
			strHTML += name + ", ";
		}
		if (!(strHTML.equalsIgnoreCase(""))) {
			strHTML = strHTML.substring(0, strHTML.lastIndexOf(","));
		}
		return strHTML;
	}   
	protected String highlightSearch(String strName,String search) {
		if(!(search.equalsIgnoreCase(""))){
			if(strName.toUpperCase().contains(search.toUpperCase())){

				search = search.toLowerCase();
				String foundText = strName.substring(strName.toLowerCase().indexOf(search), strName.toLowerCase().indexOf(search) + search.length());

				String highlight = "<span class=searchHighlight>"+foundText+"</span>";
				strName = strName.toLowerCase();
				strName = strName.replaceAll(search,highlight);
			}
		}
		return strName;
	}
	public String showAgentGroups(List<AgentGroup> array) throws Exception {
		List<Agent> agents = new ArrayList<Agent>();
		return this.showAgentGroups(array, agents,"");
	}
	public String showAgentGroups(List<AgentGroup> array,List<Agent> agents) throws Exception {
		return this.showAgentGroups(array, agents,"");
	}
	public String showAgentGroupsList(List<AgentGroup> array, String search) throws Exception {

		String strHTML = "";
		strHTML += this.showTitleBarAndCloseButton("Agent List View", "closeEdit");
		strHTML += "\n<table class=ContentList cellspacing=0>";        
		boolean bShowJsms = true;
		String jsmHeader = "";
		if(array.size()>1){
			bShowJsms = false;      	
		}
		if(bShowJsms){
			jsmHeader = "<td >JSMs</td>";
		}
		strHTML += "\n<tr class=ListHeader><td colspan=2>Main Group<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Subgroup</td><td >Definitions</td>"+jsmHeader+"</tr>";
		for (AgentGroup ag : array) {
			if(!(search.equals(""))){
				strHTML += "<tr class=ListHeader ><td colspan=4 width=100%>Search Count: " 
					+ag.getSearchMatches()
					+"</td></tr>";
			}
			String strGroupName = this.highlightSearch(ag.getName(), search);            
			strHTML += "<tr ><td class=agentGroup><input type=checkbox name=agentsCheckBox_" + ag.getId() + " value="+ag.getId()+"/>"+strGroupName+"</td><td class=agentGroup></td><td class=agentGroup>"
			+ ag.getDescription()
			+ "</td><td class=agentGroup>&nbsp;</td>"
			+ "</tr>";
			for (Agent agent : ag.getAgents()) { 
				String strName = this.highlightSearch(agent.getName(), search);            	                                
				strHTML += "<tr><td colspan=2 valign=top class=agent style='padding-left: 40px'><input type=checkbox name=agentsCheckBox_" + agent.getId() + " value="+agent.getId()+"/>"
				+ strName
				+ "</td><td class='agent' valign='top' align='center'>" 
				+ "<table class='agent'>"
				+ "<tr><td colspan='4' align='center'>TLV-TWA Exposure Levels</td></tr>"
				+ "<tr><td width='20%'>Example Name</td><td width='20%'>High</td><td width='20%'>Medium</td><td width='20%'>Low</td></tr>";
				for (AgentExample ae : agent.getExamples()){
					strHTML += "<tr><td>" + ae.getExamplename() + "</td><td>" + ae.getTlvHigh() + "</td><td>" + ae.getTlvMed() + "</td><td>" + ae.getTlvLow() + "</td></tr>";
				}
				strHTML += "<tr><td colspan='4'>&nbsp;</td></tr>";
				strHTML += "<tr><td>Description</td><td colspan='3'>";
				strHTML += agent.getDescription()
				+ "</tr></table></td>";
				if(bShowJsms){
					strHTML +="<td class=agent valign=top>"+this.showAllJSMs("",agent.getJSMs())+"</td>";                    	
				}
				strHTML +="</tr>";
			}
		}
		strHTML += "\n</td></tr></table>";
		return strHTML; 
	}
	public String showAllJSMs(String selId, ArrayList<JobSpecificModule> array) throws Exception {
		String strRetValue = "<table class=jsms>";
		for (JobSpecificModule jsm : array) {
			String strClass = "";
			if (jsm.getId().equalsIgnoreCase(selId)) {
				strClass = " class=\"Highlight\"";
			} else {
				strClass = " class=\"jsms\"";
			}		
			strRetValue += "<tr><td colspan=2 "+strClass+" nowrap><a class=jsmlink href=main.jsp?jsmID=" + jsm.getId() + " onclick=\"return showProgress()\">" + jsm.getName()
			+ "</a></td></tr>";
		}
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showUserJSMsSelect(List<User> array, List<User> selected) throws Exception {
		String strHTML = "\n<table><tr><td><div class=agentGroups><table>";
		for (User user : array) {
			strHTML += "<tr><td valign=top>";
			String strChecked = "";
			String strCheckedClass = "UserSelectUnchecked";			
			if ((selected!=null)&&(selected.contains(user))) {
				strChecked = "checked";
				strCheckedClass = "UserSelectChecked";
			}
			strHTML += "<div class=\"" + strCheckedClass + "\" id="
			+ user.getId() + "><input id=" + user.getId()
			+ "  type=checkbox " + strChecked + " name=usersCheckBox_"
			+ user.getId() + " onfocus=toggleClass('" + user.getId()
			+ "','UserSelectChecked','UserSelectUnchecked');></input><label for="
			+ user.getId() + ">" + user.getUserName() + "</label></div>\n";

			//strHTML += "</div>";
			strHTML += "</td></tr>";
		}
		strHTML += "</table>\n";
		strHTML += "</div>\n";
		strHTML += "</td></tr></table>\n";
		return strHTML;
	}
	public String showUserJSMsSelect(List<User> selected) throws Exception {
		String strHTML = "\n<table><tr><td><div><table>";
		for (User user : selected) {
			strHTML += "<tr><td valign=top>";
			String strChecked = "";
			String strCheckedClass = "UserSelectUnchecked";			
			if (selected!=null) {
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
	public String showAgentGroups(List<AgentGroup> array, List<Agent> agents,String search) throws Exception {
		String strHTML = "\n<table><tr><td class=agents valign=top>\n";
		int i = 0;
		strHTML += "<table cellspacing=0><tr>";
		for (AgentGroup ag : array) {           
			String strGroupName = ag.getName();
			if(!(search.equalsIgnoreCase(""))){
				if(strGroupName.toUpperCase().contains(search.toUpperCase())){
					search = search.toUpperCase();
					String highlight = "<span class=searchHighlight>"+search+"</span>";
					strGroupName = strGroupName.replaceFirst(search,highlight);
				}
			}           
			strHTML += "<td valign=top>";
			strHTML += "<div class=agentGroups>"+strGroupName+"";
			strHTML += "";
			for (Agent agent : ag.getAgents()) {       
				String strChecked = "";
				String strCheckedClass = "uncheckedAgent";
				if(agents.contains(agent)){
					strChecked = "checked";
					strCheckedClass = "checkedAgent";
				}
				String strName = agent.getName();
				if(!(search.equalsIgnoreCase(""))){
					if(strName.toUpperCase().contains(search.toUpperCase())){
						strName = strName.toLowerCase();
						String highlight = "<span class=searchHighlight>"+search+"</span>";
						search = search.toLowerCase();
						strName = strName.replaceFirst(search,highlight);
					}
				}
				strHTML += "<div class=\""+strCheckedClass+"\" id="+agent.getId()+"><input id="+agent.getId()+"  type=checkbox "+strChecked+" name=agentsCheckBox_"
				+ agent.getId()
				+ " onfocus=toggleClass('" + agent.getId()
				+ "','checkedAgent','uncheckedAgent');></input><label for="+agent.getId()+">"
				+ strName
				+ "</label></div>\n";
			}       
			strHTML += "</div>";
			strHTML += "</td>";

			if(++i==4){
				strHTML += "</tr><tr>";
				i = 0;
			}            
		}
		strHTML += "<td></td></tr></table>\n";
		strHTML += "</td></tr></table>\n";

		return strHTML;
	}
	public String showAgentGroup(AgentGroup ag,String search) throws Exception {
		ArrayList<AgentGroup> ags = new ArrayList<AgentGroup>();
		ags.add(ag);
		return this.showAgentGroupsList(ags,search);
	}
	public String showAgentGroupView(AgentGroup ag,String search) throws Exception {
		List<AgentGroup> ags = new ArrayList<AgentGroup>();
		ags.add(ag);
		List<Agent> as = new ArrayList<Agent>();
		String retValue = "";
		retValue += this.showTitleBarAndCloseButton("Agent Group and Agents", "closeEdit");
		retValue += "<table class=EditView cellpadding=0 cellspacing=0>";       
		retValue += "<tr>";
		retValue += "<td>";
		retValue += this.showAgentGroups(ags,as,search);
		retValue += "<tr>";
		retValue += "<td>";
		retValue += "</table>";
		return retValue;
	}
	public String showAgentGroupEdit(AgentGroup agent, Boolean addExample) throws Exception {
		String strHTML = "\n<table cellpadding=0 cellspacing=0 width=100% class=EditView>";
		String groupTxt = "";
		if((agent.getParentID().equalsIgnoreCase("NULL"))){
			groupTxt = "Group";
		}
		strHTML += "<tr class=windowTop><td align=center colspan=2>Edit Agent "+groupTxt+"</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";						
		strHTML += "<tr>";						
		strHTML += "<td>&nbsp;Name</td><td align='left'><input type=text name=agentName_"+agent.getId()+" value=\""+agent.getName()+"\"></input></td>";						
		strHTML += "</tr>";						
		strHTML += "<tr><td></td><td>";	
		if(!(agent.getParentID().equalsIgnoreCase("NULL"))){
			strHTML += "<table class='jsms'>";
			strHTML += "<tr><td>&nbsp;</td><td align='center' colspan='4'>TLV-TWA Exposure Levels</td></tr>";
			strHTML += "<tr><td></td><td align='center'>Examples</td><td align='center'>High</td><td align='center'>Medium</td><td align='center'>Low</td></tr>";
			for (AgentExample ae : agent.getExamples()){
				strHTML += "<tr><td>&nbsp;<a href=main.jsp?removeexample=" + agent.getId() 
				+ "&exampleid=" + ae.getId()
				+ ">remove</a>&nbsp;</td><td><input name='exampleid_" + ae.getId() + "' value='" + ae.getExamplename() 
				+ "' type='text'></input></td><td><input name='TLVHigh_" + ae.getId() + "' value='" + ae.getTlvHigh() 
				+ "' type='text'></input></td><td><input name='TLVMed_" + ae.getId() + "' value='" + ae.getTlvMed() 
				+ "' type='text'></input></td><td><input name='TLVLow_" + ae.getId() + "' value='" + ae.getTlvLow() 
				+ "' type='text'></input></td>";
			}
			if (addExample){
				strHTML += "<tr><td>&nbsp;"
					+ "</td><td><input name='exampleid' type='text'></input></td>" +
					"<td><input name='TLVHigh' type='text'></input></td>" +
					"<td><input name='TLVMed' type='text'></input></td>" +
					"<td><input name='TLVLow' type='text'></input></td>";
			}
			strHTML += "<tr><td>&nbsp;<a href=main.jsp?addexample=true>add</a></td></tr>";
			strHTML += "</td></tr>";       
			strHTML += "</table>";
		}
		strHTML += "</tr>";						       						      
		strHTML += "<tr>";						       						      
		strHTML += "<td>&nbsp;Description</td><td><textarea name='description' rows='5' cols='30'>" + agent.getDescription() + "</textarea></td>";						       						      
		strHTML += "</tr>";						       						      
		strHTML += "</table>";
		strHTML +="<script language=javascript type='text/javascript'>setFocus('agentName_"+agent.getId()+"');</script>";   
		return strHTML;
	}
	public String showParticipants(List<Participant> participants,User user,int participantPage,String statusId, int pageSize) throws Exception {
		String strHTML = "<table class=ContentList >";
		String studyId = "";
		strHTML += "<tr class=ListHeader><td class=small width=5%>Count:" + participants.size() + "</td><td >Ref number</td><td style='border-bottom: 1px solid #b2b2b2'>Status</td><td>Contact</td><td >Last updated</td><td style='text-align:center'> Transcript</td></tr>";
		ParticipantStatus ps = new ParticipantStatus();
		if (participants.size() != 0) {
			studyId = participants.get(0).getStudyId();
		}
		strHTML += "<tr class=ListHeader><td></td><td ></td><td>"+this.showCombo(statusId,"participantStatus",ps.getParticipantStatuses(),true,true,false)+"</td><td><input type='hidden' name='StudyId' value='" + studyId + "'><input type='hidden' name='StatusFilter' value='" + statusId + "'></td><td></td><td style='text-align:left'> Sent <img src='ImageStream?ImageName=in.gif' title='Transcript Sent' onclick= \"document.location.href = './main.jsp?searchTxt=transcript-on';\"> <img src='ImageStream?ImageName=out.gif' title='Transcript Not Sent'onclick= \"document.location.href = './main.jsp?searchTxt=transcript-off';\"></td></tr>";        
		ArrayList<String> participantTxt = new ArrayList<String>();
		int itemsOnPage = pageSize;
		if (participantPage > Util.getTotalPagesFromPagedItems(participants.size(), itemsOnPage)){
			participantPage = Util.getTotalPagesFromPagedItems(participants.size(), itemsOnPage);
		}  
		boolean bHasDeletePermission = false;
		if (user.hasPermission(User.Permission.DELETEPARTICIPANT)) {
			bHasDeletePermission = true;
		}
		for (Participant p : participants) {
			p.getPersistantObject();
			String transcriptSent = "";
			transcriptSent = p.isTranscriptSent() == true?"<img src='ImageStream?ImageName=in.gif' title='Transcript Sent' />":"<img src='ImageStream?ImageName=out.gif' title='Transcript Not Sent' />";
			String strAdminCheckBox = "";
			if (bHasDeletePermission) {
				strAdminCheckBox = "<td class=participants><input id="+p.getParticipantId()+" type=checkbox name=participantCheckBox_" + p.getParticipantId() + "></input></td>";
			}else{
				strAdminCheckBox = "<td class=participants></td>";
			}
			String toBeInterviewedCount = "";
			if(statusId.equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW)){
				toBeInterviewedCount = ""+p.getInterviewsToDoCount()+" JSMs To Do";
			}
			String strJhInfo = "";
			if(user.getRoleId().equalsIgnoreCase("4")){
				//interviewer
				strJhInfo = "["+toBeInterviewedCount+"]";
			}else{
				if(!(toBeInterviewedCount.equalsIgnoreCase(""))){
					strJhInfo = "["+p.getJobHistoriesCount()+" Job Histories,&nbsp;"+toBeInterviewedCount+"]";
				}else{
					strJhInfo = "["+p.getJobHistoriesCount()+" Job Histories]";
				}
			}
			String htmlLine = "<tr>"
				+ strAdminCheckBox
				+ "<td class=participants><a href=main.jsp?participantID="
				+ p.getParticipantId()
				+ " onclick=\"return showProgress()\">"
				+ p.getAmrRefId()
				//+ p.getReferenceNumber()
				+ "</a></td><td class=participants><label for="+p.getParticipantId()+">"
				+ p.getStatusName()+" "+strJhInfo
				+ "</label></td><td>"+p.getOccContactNo()+"</td><td><label for="+p.getParticipantId()+">"
				+ p.getLastUpdated()+" </label></td><td  style='text-align:center' >" + transcriptSent + "</td></tr>";
			participantTxt.add(htmlLine);
		}
		Object[] pageList = Util.getPageFromPagedItems(participantTxt, itemsOnPage, participantPage);
		for (Object item : pageList) {
			strHTML += (String)item;
		}
		if (pageList.length == 0) {
			strHTML += "<tr><td align='center' colspan='4' class='Warning'>No participants found within current filters</td></tr>";
		}
		strHTML += "</table>";
		return strHTML;
	}
	public String showParticipantDetails(Participant participant) {
		String strHTML = "";
		strHTML += this.showTitleBarAndCloseButton("Participant Interviews", "closeEdit");
		strHTML += "\n<table class=EditView>";    
		strHTML += "\n<tr><td width=25%><b>Participant Name:</b></td><td>"
			+ participant.getFullName()
			+ "</td><td width=25%><b>Participant YOB:</b></td><td>"
			+ participant.getDobYear()
			+ "</td></tr>";
		strHTML += "\n</table>";
		return strHTML;
	}
	/*	public String showJobHistories(List<JobHistory> jhs) throws Exception {
		String strHTML = "";
		String warningText = "";
		String strHTMLdeleteLink = "";
		strHTML += "<table class=tableborder bgcolor= #e7f4fc width=100%>";       
		if (jhs.size() == 0) {
			JobHistory jh = new JobHistory();
			jhs.add(jh);
		}
		int i = 0;
		for (JobHistory jh : jhs) {
			String strAge = "";
			if (jh.getAge() > 0) {
				strAge = String.valueOf((int)jh.getAge());
			}
			String strYearStarted = "";
			if (jh.getYearStarted() > 0) {
				strYearStarted = String.valueOf(jh.getYearStarted());
			}
			String strDurationYears = "";
			if (jh.getDurationYears() > 0) {
				strDurationYears = String.valueOf((int)jh.getDurationYears());
			}
			String strWeeksPerYear = "";
			if (jh.getWeeksPerYear() > 0) {
				strWeeksPerYear = String.valueOf((int)jh.getWeeksPerYear());
			}
			String strHoursPerWeek = "";
			if (jh.getHoursPerWeek() > 0) {
				strHoursPerWeek = String.valueOf((int)jh.getHoursPerWeek());
			}
			if (i > 0) {
				strHTMLdeleteLink = "<a href=ControllerServlet?Action=removeJobHistory&jobHistoryId="
					+ jh.getId()
					+ " onclick=\"return showProgress()\">delete</a>";
			}
			//refresh errors in job history so they are current
			jh.isValid();
			String[] errors = jh.getErrorMessage().split(", ");

			//Build Job History Section           
			strHTML += "<tr><td>"
				+ strHTMLdeleteLink
				+ "</td></tr><tr>"
				+ "<td width=30%><b>OccHistory ID</b></td>"
				+ "<td nowrap>";
			String warningClass = findErrorsInJobHistory(errors, "OccHisID");
			if (warningClass.equals(" class=warning ")){
				warningText="<td><span style='color:red;font-size:8pt'>Please enter an OccIDEAS history reference ID</span></td>";
			}else{
				warningText="";
			}
			strHTML += "<input "+warningClass+" type=text size=20 name=jobOccHisRefID_"
			+ jh.getId()
			+ " value=\""
			+ jh.getReferenceNumber()
			+ "\"></input><span class=isMandatory>*</span></td>" + warningText + "</tr>"
			+ "<tr><td><b>Job Description</b></td><td nowrap>";
			warningClass = findErrorsInJobHistory(errors, "job");
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter a job description</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=jobDescription_"
			+ jh.getId()
			+ " value=\""
			+ jh.getJobDescription()
			+ "\"></input><span class=isMandatory>*</span></td>" + warningText + "</tr>"
			+ "<tr><td><b>Job Tasks</b></td><td nowrap>";
			//warningClass = findErrorsInJobHistory(errors, "Task");
			warningClass = "";
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter the name of the task</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=jobTasks_"
			+ jh.getId()
			+ " value=\""
			//+ jh.getDuties()
			+ "\"></input></td>" + warningText + "</tr>"
			+ "<tr><td><b>Age</b></td><td>";
			//warningClass = findErrorsInJobHistory(errors, "Age");
			warningClass = "";
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter the age at the start of the task</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=age_"
			+ jh.getId()
			+ " value=\""
			+ strAge
			+ "\"></input></td>" + warningText + "</tr>"
			+ "<tr><td><b>Starting Year(YYYY)</b></td><td nowrap>";
			warningClass = findErrorsInJobHistory(errors, "Started");
			if (warningClass.equals(" class=warning ")){
				warningText="<td><span style='color:red;font-size:8pt'>Please enter the year started</span></td>";
			}else{
				warningText="";
			}
			strHTML += "<input "+warningClass+" type=text size=20 name=yearstarted_"
			+ jh.getId()
			+ " value=\""
			+ strYearStarted
			+ "\"></input><span class=isMandatory>*</span></td>" + warningText + "</tr>"
			+ "<tr><td><b>Duration in years</b></td><td nowrap>";
			warningClass = findErrorsInJobHistory(errors, "Years");
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter the period of the task in years</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=durationyears_"
			+ jh.getId()
			+ " value=\""
			+ strDurationYears
			+ "\"></input><span class=isMandatory>*</span></td>" + warningText + "</tr>"
			+ "<tr><td><b>Week per Year</b></td><td>";
			warningClass = findErrorsInJobHistory(errors, "Weeks");
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter the number of weeks per year the task was undertaken</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=weeksperyear_"
			+ jh.getId()
			+ " value=\""
			+ strWeeksPerYear
			+ "\"></input><span class=isMandatory>*</span></td>" + warningText + "</tr>"
			+ "<tr><td><b>Hours per Week</b></td><td>";
			warningClass = findErrorsInJobHistory(errors, "Hours");
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter the number of hours per week worked</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=hoursperweek_"
			+ jh.getId()
			+ " value=\""
			+ strHoursPerWeek
			+ "\"></input><span class=isMandatory>*</span></td>" + warningText + "</tr>"
			+ "<tr><td><b>Employer</b></td><td>";
			//warningClass = findErrorsInJobHistory(errors, "Employer");
			warningClass = "";
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter the name of the employer</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=employer_"
			+ jh.getId()
			+ " value=\""
			+ jh.getEmployer()
			+ "\"></input></td>" + warningText + "</tr>"
			+ "<tr><td><b>Suburb</b></td><td>";
			//warningClass = findErrorsInJobHistory(errors, "Suburb");
			warningClass = "";
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter the suburb where the work took place</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=suburb_"
			+ jh.getId()
			+ " value=\""
			+ jh.getSuburb()
			+ "\"></input></td>" + warningText + "</tr>"
			+ "<tr><td><b>State</b></td><td>";
			// warningClass = findErrorsInJobHistory(errors, "State");
			warningClass = "";
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter the State</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=state_"
			+ jh.getId()
			+ " value=\""
			+ jh.getState()
			+ "\"></input></td>" + warningText + "</tr>"
			+ "<tr><td><b>Country</b></td><td>";
			//warningClass = findErrorsInJobHistory(errors, "Country");
			warningClass = "";
			if (warningClass.equals(" class=warning ")){warningText="<td><span style='color:red;font-size:8pt'>Please enter the country</span></td>";}else{warningText="";}
			strHTML += "<input "+warningClass+" type=text size=20 name=country_"
			+ jh.getId()
			+ " value=\""
			+ jh.getCountry()
			+ "\"></input></td>" + warningText
			+ "</tr>";
			i++;
		}
		strHTML += "</table>";
		return strHTML;
	}*/

	public String showJobHistory(JobHistory jh) throws Exception {
		String strHTML = "";
		String jobDescError = jh.getErrorMessage().contains("JobDesc-Blank")?"Job description cannot be blank":"";
		String hrsPerWeekError = jh.getErrorMessage().contains("HrsPerWeek-Blank")?"Hours per week cannot be zero":"";
		strHTML += "<table class=tableborder bgcolor= #e7f4fc width=100%>";       
		strHTML += "<tr><td width=30%><b>RefID</b></td><td nowrap>" + jh.getReferenceNumber() + "";
		strHTML += "<input type=hidden size=20 name=jobOccHisRefID value=\"" + jh.getReferenceNumber() + "\"></input></td><td><span id='unused' class='isMandatory'></span></td></tr>";
		
		strHTML += "<tr><td><b>From (month/year)</b></td><td>";
		strHTML += this.showDatePickerNoDay(1800, 2051, jh.getStartYearInt(), jh.getStartMonthInt(),1 , "from");
		strHTML += "</td></tr>";
		strHTML += "<tr><td><b>Until (month/year)</b></td><td>";
		strHTML += this.showDatePickerNoDay(1800, 2051, jh.getFinishYearInt(), jh.getFinishMonthInt(),1 , "to");
		strHTML += "</td></tr>";
		
		strHTML += "<tr><td><b>Name of Company</b></td><td>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=employer value=\"" + jh.getEmployer() + "\"></input></td><td><span id='unused' class='isMandatory'></span></td></tr>";
		strHTML += "<tr><td style='padding-left:10px'><b>Number and Street</b></td><td style='padding-left:10px'>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=street value=\"" + jh.getStreet() + "\"></input></td><td><span id='unused' class='isMandatory'></span></td></tr>";
		strHTML += "<tr><td style='padding-left:10px'><b>Suburb</b></td><td style='padding-left:10px'>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=suburb value=\"" + jh.getSuburb() + "\"></input></td><td><span id='unused' class='isMandatory'></span></td></tr>";
		strHTML += "<tr><td style='padding-left:10px'><b>State</b></td><td style='padding-left:10px'>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=state value=\"" + jh.getState() + "\"></input></td style='padding-left:10px'><td><span id='unused' class='isMandatory'></span></td></tr>";
		strHTML += "<tr><td style='padding-left:10px'><b>Country</b></td><td style='padding-left:10px'>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=country value=\"" + jh.getCountry() + "\"></input></td><td><span id='unused' class='isMandatory'></span></td></tr>";
		
		
		strHTML += "<tr><td><b>Job Title/Description</b></td><td nowrap>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=jobDescription value=\"" + jh.getJobDescription() + "\"></input><span class=isMandatory>*</span></td><td><span id='jobdescerr' class='isMandatory'>" + jobDescError + "</span></td></tr>";
		strHTML += "<tr><td><b>Main Product/Activity</b></td><td nowrap>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=jobTasks value=\"" + jh.getJobTitle() + "\"></input></td><td><span id='unused' class='isMandatory'></span></td></tr>";
//		strHTML += "<tr><td><b>Age</b></td><td>";
//		strHTML += "<input type=text size=20 name=age value=\""	+ jh.getAge() + "\"></input></td></tr>";
//		strHTML += "<tr><td><b>Starting Year(YYYY)</b></td><td nowrap>";
//		strHTML += "<input type=text size=20 name=yearStarted value=\""	+ jh.getYearStarted() + "\"></input><span class=isMandatory>*</span></td></tr>";
//		strHTML += "<tr><td><b>Duration in years</b></td><td nowrap>";
//		strHTML += "<input type=text size=20 name=durationYears value=\"" + jh.getDurationYears() + "\"></input><span class=isMandatory>*</span></td></tr>";
//		strHTML += "<tr><td><b>Week per Year</b></td><td>";
//		strHTML += "<input type=text size=20 name=weeksPerYear value=\"" + jh.getWeeksPerYear() + "\"></input><span class=isMandatory>*</span></td></tr>";
		strHTML += "<tr><td><b>Hours per Week</b></td><td>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=20 name=hoursPerWeek value=\"" + jh.getHoursPerWeek() + "\"></input><span class=isMandatory>*</span></td><td><span id='hrsperweekerr' class='isMandatory'>" + hrsPerWeekError + "</span></td></tr>";
		
		strHTML += "</table>";
		return strHTML;
	}
	
	public String showResidentialHistory(Address address) throws Exception {
		String strHTML = "";
		strHTML += "<table class=tableborder bgcolor= #e7f4fc width=100%>";       
		strHTML += "<tr><td><b>RefID</b></td><td nowrap>" + address.getArea() + "";
		strHTML += "<input onchange='MarkPageDirty()' type=hidden size=50 name=area value=\"" + address.getArea() + "\"></input></td></tr>";

		strHTML += "<tr><td><b>Country</b></td><td nowrap>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=country value=\"" + address.getCountry() + "\"></input></td></tr>";

		strHTML += "<tr><td width=30%><b>Number and Street</b></td><td nowrap>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=address value=\"" + address.getAddress() + "\"></input></td></tr>";
		strHTML += "<tr><td><b>Suburb/Town</b></td><td nowrap>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=suburb value=\"" + address.getSuburb() + "\"></input></td></tr>";
		strHTML += "<tr><td><b>State/Province</b></td><td>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=80 name=state value=\""	+ address.getState() + "\"></input></td></tr>";
		strHTML += "<tr><td><b>Postcode</b></td><td nowrap>";
		strHTML += "<input onchange='MarkPageDirty()' type=text size=40 name=postcode value=\""	+ address.getPostCode() + "\"></input></td></tr>";
		strHTML += "<tr><td><b>From (month/year)</b></td><td>";
		strHTML += this.showDatePickerNoDay(1800, 2051, address.getFromYearInt(), address.getFromMonthInt(),1 , "from");
		strHTML += "</td></tr>";
		//strHTML += "<input type=text size=20 name=dateFrom value=\"" + address.getFrom() + "\"></input><span class=isMandatory>*</span></td></tr>"
		strHTML += "<tr><td><b>Until (month/year)</b></td><td>";
		strHTML += this.showDatePickerNoDay(1800, 2051, address.getToYearInt(), address.getToMonthInt(),1 , "to");
		strHTML += "</td></tr>";
		//strHTML += "<input type=text size=20 name=dateTo value=\"" + address.getTo() + "\"></input><span class=isMandatory>*</span></td></tr>"
		strHTML += "</table>";
		return strHTML;
	}
	
	public String showJobHistorySummary(Participant participant) throws Exception {
		String strHTML = "";
		strHTML += "<table class=tableborder bgcolor= #e7f4fc width=100%>";       
		strHTML += "<tr><th>&nbsp;</th><th>&nbsp;</th><th>From (month/year)</th><th>Until (month/year)</th><th>Employer</th><th>Address</th><th>Title/Description</th><th>Main Product</th><th>Average hours per week</th></tr>";
		int iCount = 1;
		for (JobHistory job:participant.getJobHistories()) {
			
			String enviroJSMID = "";
        	try{
        		Context initCtx = new InitialContext();
        		Context ctx = (Context) initCtx.lookup("java:comp/env"); 
        		enviroJSMID = (String) ctx.lookup("environmentalJSMID");                 		
        	}catch(Exception e){
        		//System.out.println(e.getMessage());
        	}
			if(job.getFinalJSMId().equalsIgnoreCase(enviroJSMID)){// don't show the environmental Job
				continue;
			}
			strHTML += "<tr>";
			strHTML += "<td>" + job.getReferenceNumber() + "</td>";
			strHTML += "<td><input type=checkbox name=job_" + job.getId() + "></input></td>";//" + job.getReferenceNumber() + "
			strHTML += "<td>" + job.getStartMonth() + "/" + job.getStartYear() + "</td>";
			strHTML += "<td>" + job.getFinishMonth() + "/" + job.getFinishYear() + "</td>";
//			strHTML += "<td>" + job.getYearStarted() + "</td>";
//			strHTML += "<td>" + job.getDurationYears() + "</td>";
//			strHTML += "<td>" + job.getWeeksPerYear() + "</td>";
			strHTML += "<td>" + job.getEmployer() + "</td>";
			
			strHTML += "<td>" + job.getStreet() + ", " + job.getSuburb() + ", " + job.getState() + ", " + job.getCountry() + "</td>";
			strHTML += "<td>" + job.getJobDescription() + "</td>";
			strHTML += "<td>" + job.getJobTitle() + "</td>";
			strHTML += "<td>" + job.getHoursPerWeek() + "</td>";
			
//			strHTML += "<td>" + job.getSuburb() + "</td>";
//			strHTML += "<td>" + job.getState() + "</td>";
//			strHTML += "<td>" + job.getCountry() + "</td>";
			strHTML += "</tr>";
			iCount++;
		}
		strHTML += "</table>";
		return strHTML;
	}
	
	public String showResidentialHistorySummary(Participant participant,boolean showCheckbox) throws Exception {
		String strHTML = "";
		strHTML += "<table class=tableborder bgcolor= #e7f4fc width=100%>";       
		if(showCheckbox){
			strHTML += "<tr><th>&nbsp;</th><th>&nbsp;</th><th>Country</th><th>Address</th><th>From (month/year)</th><th>Until (month/year)</th></tr>";
		}else{
			strHTML += "<tr><th>&nbsp;</th><th>Country</th><th>Address</th><th>From (month/year)</th><th>Until (month/year)</th></tr>";	
		}
		int iCount = 1;
		for (Address address:participant.getAddresses()) {
			strHTML += "<tr>";
			strHTML += "<th>R" + iCount + "</th>";
			if(showCheckbox){
				strHTML += "<td><input type=checkbox name=address_" + address.getId() + "></input>";				
			}
			strHTML += "<td>" + address.getCountry() + "</td>";
			strHTML += "<td>" + address.getAddress() + ", " + address.getSuburb() + ", " + address.getState() + ", " + address.getPostCode() + "</td>";

			strHTML += "<td>" + address.getFromMonth() + "/" + address.getFromYear() + "</td>";
			strHTML += "<td>" + address.getToMonth() + "/" + address.getToYear() + "</td>";
			strHTML += "</tr>";
			iCount++;
		}
		strHTML += "</table>";
		return strHTML;
	}

	public String showSelfAdministeredJobHistories(List<JobHistory> jhs) throws Exception {
		String strHTML = "";
		strHTML += "";
		if (jhs.size() == 0) {
			JobHistory jh = new JobHistory();
			jhs.add(jh);
		}
		int i = 0;
		for (JobHistory jh : jhs) {
			String strAge = "";
			if (jh.getAge() > 0) {
				strAge = String.valueOf(jh.getAge());
			}
			String strYearStarted = "";
			if (jh.getYearStarted() > 0) {
				strYearStarted = String.valueOf(jh.getYearStarted());
			}
			String strDurationYears = "";
			if (jh.getDurationYears() > 0) {
				strDurationYears = String.valueOf(jh.getDurationYears());
			}
			String strWeeksPerYear = "";
			if (jh.getWeeksPerYear() > 0) {
				strWeeksPerYear = String.valueOf(jh.getWeeksPerYear());
			}
			String strHoursPerWeek = "";
			if (jh.getHoursPerWeek() > 0) {
				strHoursPerWeek = String.valueOf(jh.getHoursPerWeek());
			}
			//            String strNrSmokedDay = "";
			//            if (jh.getNrsmokedday() >= 0) {
			//            	strNrSmokedDay = String.valueOf(jh.getNrsmokedday());
			//            }            
			strHTML += "<table class=tableborder>";
			strHTML += "<tr><td colspan=3><div class=jobHistoryCalendar>Please enter details of job number "+(i+1)+" below</div></td></tr>";
			strHTML += "<tr><td><span class=isMandatory>*</span></td><td><b>Job Title</b></td><td><input type=text name=jobDescription_"
				+ jh.getId()
				+ " value=\""
				+ jh.getJobDescription()
				+ "\"></input>"
				+ "</td></tr>";
			strHTML += "<tr><td valign=top><span class=isMandatory>*</span></td><td valign=top><b>Tasks that you performed</b>(eg laying bricks, computer work, teaching primary students art)</td><td valign=top><textarea cols=40 rows=4 name=jobTasks_"
				+ jh.getId()
				+ " >"
				//+ this.showList(jh.getJobTitle())
				+ jh.getJobTitle()
				+ "</textarea></td></tr>";

			strHTML += "<tr><td><span class=isMandatory>*</span></td><td><b>Age when you started</b></td><td><input onkeyup=validateNumber('age_"
				+ jh.getId()
				+ "'); type=text name=age_"
				+ jh.getId()
				+ " value=\""
				+ strAge
				+ "\"></input></td>";
			strHTML += "</tr>";
			strHTML += "<tr><td><span class=isMandatory>*</span></td><td><b>The year you started</b></td><td><input onkeyup=validateNumber('yearstarted_"
				+ jh.getId()
				+ "'); type=text name=yearstarted_"
				+ jh.getId()
				+ " value=\""
				+ strYearStarted
				+ "\"></input></td></tr>";
			strHTML += "</tr>";
			strHTML += "<tr><td><span class=isMandatory>*</span></td><td><b>The number of years you worked</b></td><td><input onkeyup=validateNumber('durationyears_"
				+ jh.getId()
				+ "'); type=text name=durationyears_"
				+ jh.getId()
				+ " value=\""
				+ strDurationYears
				+ "\"></input></td></tr>";
			strHTML += "<tr><td><span class=isMandatory>*</span></td><td><b>The number of weeks a year you worked</b></td><td><input onkeyup=validateNumber('weeksperyear_"
				+ jh.getId()
				+ "'); type=text name=weeksperyear_"
				+ jh.getId()
				+ " value=\""
				+ strWeeksPerYear
				+ "\"></input></td></tr>";         
			strHTML += "<tr><td><span class=isMandatory>*</span></td><td><b>The number of hours a week you worked</b></td><td><input onkeyup=validateNumber('hoursperweek_"
				+ jh.getId()
				+ "'); type=text name=hoursperweek_"
				+ jh.getId()
				+ " value=\""
				+ strHoursPerWeek
				+ "\"></input></td></tr>";
			/*// nr smoked a day
            strHTML += "<tr><td><span class=isMandatory>*</span></td><td><b>Number of cigarettes smoked a day</b></td><td><input onkeyup=validateNumber('nrsmokedday_"
                + jh.getId()
                + "'); type=text name=nrsmokedday_"
                    + jh.getId()
                    + " value=\""
                    + strNrSmokedDay
                    + "\"></input></td></tr>";*/
			strHTML += "<tr><td><span class=isMandatory>*</span></td><td><b>The company that you worked for</b></td><td><input type=text name=employer_"
				+ jh.getId()
				+ " value=\""
				+ jh.getEmployer()
				+ "\"></input></td></tr>";
			strHTML += "<tr><td></td><td><b>The town you worked in</b></td><td><input type=text name=suburb_"
				+ jh.getId()
				+ " value=\""
				+ jh.getSuburb()
				+ "\"></input></td></tr>";
			strHTML += "<tr><td></td><td><b>The state/province you worked in</b></td><td><input type=text name=state_"
				+ jh.getId()
				+ " value=\""
				+ jh.getState()
				+ "\"></input></td></tr>";
			strHTML += "<tr><td><span class=isMandatory>*</span></td><td><b>The country you worked in</b></td><td><input type=text name=country_"
				+ jh.getId()
				+ " value=\""
				+ jh.getCountry()
				+ "\"></input></td></tr>";
			strHTML += "<tr><td></td><td valign=top><b>Additional comments</b></td><td valign=top><textarea cols=40 rows=4 name=comments_"
				+ jh.getId()
				+ " >"
				+ jh.getComments()
				+ "</textarea></td></tr>";

			i++;
		}
		strHTML += "</table>";
		return strHTML;
	}
	public String showFrequencyAnswersAsComboBox3Cat(String selected, PossibleAnswer pa,String colapseIt) {
		String strRetValue = "\n<select onChange=\"autoCheck('"
			+ pa.getJsmQuestionStructureID()
			+ "0','0')\" onmouseover=\"document.getElementById('selectAnswer_" + pa.getJsmQuestionStructureID() + "numberpad').style.visibility='none'\"  "+colapseIt+" name=selectAnswer_"
			+ pa.getJsmQuestionStructureID()
			+ ">";
		/*

		 */
		String strAnswerDescription = pa.getDescription();
		String strSelected = "";
		if (strAnswerDescription.toLowerCase().contains("[number")) {           
			strRetValue += "<option></option>";           
			if (selected.equalsIgnoreCase(String.valueOf(1111))) {
				strSelected = "selected";
			}
			strRetValue += "<option value=1111 " + strSelected + ">&lt;5 hours per week</option>";
			strSelected = "";
			if (selected.equalsIgnoreCase(String.valueOf(2222))) {
				strSelected = "selected";
			}
			strRetValue += "<option value=2222 " + strSelected + ">5-30 hours per week</option>";
			strSelected = "";
			if (selected.equalsIgnoreCase(String.valueOf(3333))) {
				strSelected = "selected";
			}
			strRetValue += "<option value=3333 " + strSelected + ">&gt;30 hours per week</option>";
		}
		strRetValue += "</select>";
		return strRetValue;
	}
	public String showAllAnswersInterview(List<PossibleAnswer> possibleAnswers, List<PossibleAnswer> answers,
			boolean isMultiple,boolean bShowAll,String interviewId, boolean bShowAddToRuleButton,ExpertAgent agent,Study study) throws Exception {
		String strRetValue = "";       
		Integer cnt = 0;
		String idNumber = "";
		if (possibleAnswers.size() != 0) {
			strRetValue = "\n<tr ><td><table class=InterviewPossibleAnswer>";
			for (PossibleAnswer pa : possibleAnswers) {
				strRetValue += "\n<tr>";
				strRetValue += "\n <td width=2px class=possibleanswerinput valign=center title='"
					+ pa.getId()
					+ " "
					+ pa.getJsmQuestionPossibleAnswerStructureID()
					+ "' >&nbsp;";
				String strChecked = "";
				String strSavedAnswer = "";
				String colapseState = "contract";
				if (answers.contains(pa)) {
					strChecked = " checked ";
					colapseState = "block";
					if (pa.isFreeText()) {
						if(answers.size()>cnt){
							strSavedAnswer = answers.get(cnt).getActualAnswer();                    				
						}else{
							strChecked = " ";
						}                 	
					} else if (pa.isNumber()) {
						strSavedAnswer = answers.get(answers.indexOf(pa)).getActualAnswer();
					}
				}
				//String autoCheckName = "0";
				String autoCheckValue = "0";
				String inputIdName = pa.getJsmQuestionStructureID()+ cnt.toString();
				idNumber = inputIdName;
				String colapsItRadio = "";
				String colapsItCheckBox = "";
				String freqAnswer = "";
				if(pa.hasFrequencyQuestions()){
					for (Question q  : pa.getChildQuestions()){
						if (q.getDescription().contains("weeks")){
							freqAnswer = q.getPossibleAnswers().get(0).getJsmQuestionStructureID();
							freqAnswer += "0";
						}
					}
					if(!bShowAll){
						colapsItRadio = "collapse"+pa.getJsmQuestionPossibleAnswerStructureID()+".slideit();";
						colapsItCheckBox = "onclick=\"collapse"+pa.getJsmQuestionPossibleAnswerStructureID()+".slideit();\"";
						//                   		colapsItCheckBox = "onclick='collapse"+pa.getJsmQuestionPossibleAnswerStructureID()+".slideit(); setFocus(selectAnswer_" + freqAnswer + ");'";
					}
				}
				//String setFocus = "";
				//if(cnt==0){
				//	setFocus = "tabindex=100";
				//}
				if (isMultiple) {
					//                	autoCheckName = "name="+pa.getJsmQuestionStructureID()+"possibleAnswer_"
					//                    + pa.getJsmQuestionPossibleAnswerStructureID();
					strRetValue += "<input  "+colapsItCheckBox+" type=checkbox name="+pa.getJsmQuestionStructureID()+"possibleAnswer_"
					+ pa.getJsmQuestionPossibleAnswerStructureID()
					+ strChecked
					+ " id="+pa.getJsmQuestionPossibleAnswerStructureID()+inputIdName+" ></input>";

				} else {  

					strRetValue += "<input id="+inputIdName + " type=radio name=radio"+pa.getJsmQuestionStructureID()+"possibleAnswer_"+pa.getJsmQuestionStructureID()+" value="
					+ pa.getJsmQuestionPossibleAnswerStructureID()
					+ strChecked
					+ " onClick='removeCheckIfChecked("+inputIdName+"), onChange=changeRBStyle("+inputIdName+"); "+colapsItRadio+"'  ></input>";
					// autoCheckName = "radio"+pa.getJsmQuestionStructureID()+"possibleAnswer_"+pa.getJsmQuestionStructureID();
					autoCheckValue = pa.getJsmQuestionPossibleAnswerStructureID();
				}
				strRetValue += "</td>";               
				String paDescription = pa.getDescription();
				if (paDescription.toLowerCase().contains("[number")) {
					String dropDown = "";

					if((study.hasOption(Study.Option.CAT3FREQ))&&(pa.isOnFrequencyQuestion())&&(paDescription.contains("100"))){
						dropDown = this.showFrequencyAnswersAsComboBox3Cat(strSavedAnswer, pa,colapsItRadio);
					}else{
						if(paDescription.contains("100")){
							dropDown = this.showFrequencyAnswersAsComboBoxRes(strSavedAnswer, pa,colapsItRadio,cnt.toString(),isMultiple);
						}else{
							dropDown = this.showFrequencyAnswersAsComboBox(strSavedAnswer, pa,colapsItRadio);						
						}
						int endNumber = 100;
						int numberPerLine = 10;
						if(paDescription.contains("52")){
							endNumber = 52;
							numberPerLine = 5;
						}
						if(paDescription.contains("99")){
							
						}
						dropDown += this.showNumberpad("controllerpost", ("selectAnswer_" + pa.getJsmQuestionStructureID()), 1, endNumber, numberPerLine,pa.getJsmQuestionStructureID(),colapsItRadio);                   	
					}              	
					paDescription = paDescription.substring(0,paDescription.indexOf('['))+dropDown;
					inputIdName = inputIdName+"nr";

				} else if (pa.getDescription().contains("[free text")) {
					String idTag = "";
					if(isMultiple){
						idTag = pa.getJsmQuestionPossibleAnswerStructureID()+pa.getJsmQuestionStructureID()+cnt;
					}else{
						idTag = pa.getJsmQuestionStructureID()+cnt;
					}
					String strFreeTextBox = "\n <textarea onfocus=\"autoCheck('"
						+ idTag
						+ "','"
						+ autoCheckValue
						+ "'), changeRBStyle("+inputIdName+"); "+colapsItRadio+"\"" //"+colapsItRadio+"
						+ " onkeypress=checkMaxLength(this); maxlength=1024 size=50 type=text name="+pa.getJsmQuestionPossibleAnswerStructureID()+"_freeText_"
						+ pa.getJsmQuestionStructureID()
						+ "  cols='30' rows='3'>"+strSavedAnswer+"</textarea>";
					paDescription = paDescription.replace("[free text]",strFreeTextBox);
					inputIdName = inputIdName+"ft";
				}
				strRetValue += "\n <td class=possibleanswers ><div id="+ idNumber + "div style='color:black;'><label for="+inputIdName+">" + paDescription +"</label></div>"+ "</td>";
				if(bShowAll){
					strRetValue += "\n <td valign=top class=small><a href=\"./main.jsp?Location=Agents&answerReport=true&questionId="+pa.getJsmQuestionStructureID()+"&answerId="+pa.getId()+"&answerDescription='"+pa.getDescription()+"'\" class=agents onclick=\"return showProgress()\">report</a></td>";               	
				}
				strRetValue += "\n</tr>";
				if(bShowAll){
					if(strChecked.equalsIgnoreCase(" checked ")){
						if(pa.getChildQuestions().size()>0){
							strRetValue += this.showAllChildQuestions(pa,interviewId,bShowAddToRuleButton,agent,study);
						}
					}     	
				}else if(pa.hasFrequencyQuestions()){
					strRetValue += "\n<tr style='background-color: #d3e6ee;'><td></td><td >";
					strRetValue += "\n<div id="+pa.getJsmQuestionPossibleAnswerStructureID()+" class=parentDiv>";
					strRetValue += this.showAllChildQuestions(pa,interviewId,bShowAddToRuleButton,agent,study);                	
					strRetValue += "\n</div>";
					if((isMultiple)){
						strRetValue += "<script type='text/javascript'> var collapse"+pa.getJsmQuestionPossibleAnswerStructureID()+"=new animatedcollapse(\""+pa.getJsmQuestionPossibleAnswerStructureID()+"\", 800, false,\""+colapseState+"\",\""+pa.getJsmQuestionPossibleAnswerStructureID()+pa.getJsmQuestionStructureID()+ cnt.toString()+"\",\"" + freqAnswer + "\");</script>";						
					} else {
						strRetValue += "<script type='text/javascript'> var collapse"+pa.getJsmQuestionPossibleAnswerStructureID()+"=new animatedcollapse(\""+pa.getJsmQuestionPossibleAnswerStructureID()+"\", 800, false,\""+colapseState+"\",\""+pa.getJsmQuestionStructureID()+ cnt.toString()+"\",\"" + freqAnswer + "\");</script>";					
					}
					strRetValue += "\n</td></tr>";               	  
				}
				cnt++;
			}            
			strRetValue += "</table></td></tr>";
		}else{
			strRetValue += "<tr><td></td></tr>";
		}
		return strRetValue;
	}
	public String showFrequencyAnswersAsComboBox(String selected, PossibleAnswer pa,String colapseIt) {
		String strRetValue = "\n<select onChange=\"autoCheck('"
			+ pa.getJsmQuestionStructureID()
			+ "0','0'); "+colapseIt+"\" onmouseover=\"document.getElementById('selectAnswer_" + pa.getJsmQuestionStructureID() + "numberpad').style.visibility='none'\"  name="+pa.getJsmQuestionPossibleAnswerStructureID()+"selectAnswer_"
			+ pa.getJsmQuestionStructureID()
			+ " id="+pa.getJsmQuestionPossibleAnswerStructureID()+"selectAnswer_"
			+ pa.getJsmQuestionStructureID()
			+ ">";
		String strAnswerDescription = pa.getDescription();
		String strSelected = "";
		int i, j = 0;
		if (strAnswerDescription.toLowerCase().contains("[number")) {
			int i1 = strAnswerDescription.toLowerCase().indexOf("[number ") + 8;
			int i2 = strAnswerDescription.lastIndexOf("-");
			String strI = strAnswerDescription.substring(i1, i2);
			i1 = i2 + 1;
			i2 = strAnswerDescription.indexOf("]");
			String strJ = strAnswerDescription.substring(i1, i2);
			i = Integer.valueOf(strI);
			j = Integer.valueOf(strJ);
			strRetValue += "<option></option>";
			for (i = Integer.valueOf(strI); i <= j; i++) {
				strSelected = "";
				if (selected.equalsIgnoreCase(String.valueOf(i))) {
					strSelected = "selected";
				}
				strRetValue += "<option value=" + i + " " + strSelected + ">" + i + "</option>";
			}
		}
		strRetValue += "</select>";
		return strRetValue;
	}
	public String showFrequencyAnswersAsComboBoxRes(String selected, PossibleAnswer pa,String colapseIt,String checkNumber,boolean isMultiple) {
		String idTag = "";
		if(isMultiple){
			idTag = pa.getJsmQuestionPossibleAnswerStructureID()+ pa.getJsmQuestionStructureID()+checkNumber;
		}else{
			idTag = pa.getJsmQuestionStructureID()+"0";
		}
		String strRetValue = "\n<select onChange=\"autoCheck('"
			+ idTag
			+ "','45392possibleAnswer_72888'); "+colapseIt+"\" onmouseover=\"document.getElementById('selectAnswer_" + pa.getJsmQuestionStructureID() + "numberpad').style.visibility='none'\"  name="+pa.getJsmQuestionPossibleAnswerStructureID()+"selectAnswer_"
			+ pa.getJsmQuestionStructureID()
			+ " id="+pa.getJsmQuestionPossibleAnswerStructureID()+"selectAnswer_"
			+ pa.getJsmQuestionStructureID()
			+ ">";
		String strAnswerDescription = pa.getDescription();
		String strSelected = "";
		int i, j = 0;
		if (strAnswerDescription.toLowerCase().contains("[number")) {
			int i1 = strAnswerDescription.toLowerCase().indexOf("[number ") + 8;
			int i2 = strAnswerDescription.lastIndexOf("-");
			String strI = strAnswerDescription.substring(i1, i2);
			i1 = i2 + 1;
			i2 = strAnswerDescription.indexOf("]");
			String strJ = strAnswerDescription.substring(i1, i2);
			i = Integer.valueOf(strI);
			j = Integer.valueOf(strJ);
			strRetValue += "<option></option>";
			for (i = Integer.valueOf(strI); i <= j; i++) {
				strSelected = "";
				if (selected.equalsIgnoreCase(String.valueOf(i))) {
					strSelected = "selected";
				}
				strRetValue += "<option value=" + i + " " + strSelected + ">R" + i + "</option>";
			}
		}
		strRetValue += "</select>";
		return strRetValue;
	}
	public String showAllChildQuestions(PossibleAnswer pa,String strInterviewID,boolean bShowAddToRuleButton,ExpertAgent agent,Study study) throws Exception {
		String strRetValue = "";
		strRetValue += "\n<table class=questions id=table"+pa.getJsmQuestionPossibleAnswerStructureID()+">";
		int i = 1;
		for (Question q: pa.getChildQuestions()) {   
			if(!(q.isViewWithParent())){
				continue;
			}
			q.setInterviewID(strInterviewID);

			String strAllAnswers = this.showAllAnswersInterview(q.getPossibleAnswers(),q.getAnswers(),q.isMultiple(),bShowAddToRuleButton,strInterviewID,bShowAddToRuleButton,agent,study);        
			strRetValue += "\n<tr>";
			strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
			strRetValue += "\n <td nowrap>(" + i + ")</td>";
			String addButton = "";
			String strKeyPhrase = "";
			if(bShowAddToRuleButton){


				addButton = "<input type=image src='ImageStream?ImageName=add.gif' name="+q.getJsmQuestionStructureID()+"_addToRule height=8 width=8 title='Add To Rule' onclick=\"return validateOnlyOneRuleChecked('Please choose a rule to update');\"></input>";
				strKeyPhrase = "<font class=KeyPhrase>"+q.getName()+"</font> | ";          	
			}
			String interviewerNote = "";
			if(!(q.getNotes().equalsIgnoreCase("NULL"))){
				interviewerNote = "<font color=green>Note: "+q.getNotes()+ "</font>";
			}
			if(q.isMultiple()){
				interviewerNote += "<font color=green>&nbsp;&nbsp;Allow Multiple</font>";
			}
			strRetValue += "\n <td >" + strKeyPhrase + q.getDescription() + " " + addButton + interviewerNote+"</td>";  
			strRetValue += "\n</tr>";
			strRetValue += "\n<tr>";
			strRetValue += "\n <td>&nbsp;</td>";
			strRetValue += "\n <td colspan=3><table class=possibleanswers>" + strAllAnswers + "</table></td>";
			strRetValue += "\n</tr>";  
			i++;
		}     
		strRetValue += "\n</table>";
		strRetValue += "\n<input type=hidden name=InterviewID value="+strInterviewID+" />";
		strRetValue += "\n<input type=hidden id=radioChangeFlag value=0 />";
		return strRetValue;
	}
	public String showAllQuestionsEdit(List<Question> qs,String strInterviewID,boolean bShowAddToRuleButton,ExpertAgent agent,Study study) throws Exception {
		String strRetValue = "";
		int i = 1;
		for (Question q: qs) {       
			q.setInterviewID(strInterviewID);       	
			String strAllAnswers = this.showAllAnswersInterview(q.getPossibleAnswers(),q.getAnswers(),q.isMultiple(),bShowAddToRuleButton,strInterviewID,bShowAddToRuleButton,agent,study);        
			strRetValue += "\n<tr>";
			strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
			strRetValue += "\n <td nowrap>(" + i + ")</td>";
			String addButton = "";
			String strKeyPhrase = "";
			if(bShowAddToRuleButton){
				addButton = "<input type=image src='ImageStream?ImageName=add.gif' name="+q.getJsmQuestionStructureID()+"_addToRule height=8 width=8 title='Add To Rule' onclick=\"return validateOnlyOneRuleChecked('Please choose a rule to update');\"></input>";
				strKeyPhrase = "<font class=KeyPhrase>"+q.getName()+"</font> | ";          	
			}
			strRetValue += "\n <td >" + strKeyPhrase + q.getDescription() + " " + addButton + "</td>";  
			strRetValue += "\n</tr>";
			strRetValue += "\n<tr>";
			strRetValue += "\n <td>&nbsp;</td>";
			strRetValue += "\n <td colspan=3><table class=possibleanswers>" + strAllAnswers + "</table></td>";
			strRetValue += "\n</tr>";  
			i++;
		}              
		return strRetValue;
	}
	public String showLogin(String strUsername,String strPassword,String checked, String strError) {
		String retValue = "";
		retValue += "<table cellpadding=0 cellspacing=0 >";                    
		retValue += "<tr>";
		retValue += "<td align=center>";       
		retValue += "<table><tr><td>&nbsp;</td></tr></table>";       
		retValue += "<table cellpadding=2 cellspacing=0 class=Login>";              
		retValue += "<tr class=windowTop>";
		retValue += "<td colspan=4 align=center>Log in to OccIDEAS</td>";       
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";       
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";       
		retValue += "<tr>";
		retValue += "<td>&nbsp;</td><td align=right >Username:</td>";
		retValue += "<td><input type=text name=username value='" + strUsername + "' class=button></input></td><td>&nbsp;</td>";
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";             
		retValue += "<tr>";
		retValue += "<td>&nbsp;</td><td align=right>Password:</td>";
		retValue += "<td><input type=password name=password value='" + strPassword + "' class=button></input></td><td>&nbsp;</td>";
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";
		retValue += "<tr>";
		retValue += "<td colspan=4><input type=checkbox name=rememberme value=yes " + checked + ">Remember Me</input></td>";
		retValue += "</tr>";
		retValue += "<tr>";
		retValue += "<td colspan=4 align=right>";
		retValue += "<input type=submit name=login value=login class=button></input>";
		retValue += "</td>";
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>" + strError + "</td></tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";                 
		retValue += "</table>";
		retValue += "<table><tr><td>&nbsp;</td></tr></table>";       
		retValue += "</td>";
		retValue += "</tr>";
		retValue += "</table>";

		return retValue;
	}
	public String showParticipantLogin(String strUsername,String strPassword,String strError) {
		String retValue = "";
		retValue += "<table cellpadding=0 cellspacing=0>";                    
		retValue += "<tr><td><br>Welcome to the self administered data entry web site for the <b>InterRett work practices pilot study.</b><p> To begin entering your job history information please login below using your username and password.<td></tr>";
		retValue += "<tr>";
		retValue += "<td align=center>";       
		retValue += "<table><tr><td>&nbsp;</td></tr></table>";       
		retValue += "<table cellpadding=2 cellspacing=0 class=login>";              
		retValue += "<tr class=windowTop>";
		retValue += "<td colspan=4 align=center>Log in</td>";       
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";       
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";       
		retValue += "<tr>";
		retValue += "<td>&nbsp;</td><td align=right >Reference Number:</td>";
		retValue += "<td><input type=text name=username value='" + strUsername + "' class=button></input></td><td>&nbsp;</td>";
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";             
		retValue += "<tr>";
		retValue += "<td>&nbsp;</td><td align=right>Date of Birth:</td>";
		retValue += "<td><input type=text name=password value='" + strPassword + "' class=button></input></td><td>&nbsp;</td>";
		retValue += "</tr>";
		retValue += "<tr>";
		retValue += "<td>&nbsp;</td><td align=right>&nbsp;</td>";
		retValue += "<td><small>dd/mm/yyyy (e.g. 26/07/1951)</small></td>";
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";       
		retValue += "<tr>";
		retValue += "<td colspan=3 align=right>";
		retValue += "<input type=submit name=login value=login class=button></input>";
		retValue += "</td>";
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>" + strError + "</td></tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";                   
		retValue += "</table>";
		retValue += "<table><tr><td>&nbsp;</td></tr></table>";       
		retValue += "</td>";
		retValue += "</tr>";
		retValue += "</table>";

		return retValue;
	}
/*	public String showJobsWithJSM(ArrayList<JobTitle> jobs, String search) throws Exception{
		String strHTML = "";
		if(jobs!=null){
			strHTML = "<table class=ContentList cellspacing=0 cellpadding=0>";
			strHTML += "<tr class=ListHeader><td align=center class=small>"+jobs.size()+"</td><td align=center><b>Job Title</b></td><td align=center><b>JSM</b></td><td align=center><b>Keywords</b></td></tr>";
			for (Iterator<JobTitle> it = jobs.iterator(); it.hasNext();) {
				JobTitle jt = (JobTitle) it.next();
				strHTML += "<tr><td width=5% align=center class=jobs><input id="+jt.getId()+" type=checkbox name=jobsCheckBox_"
				+ jt.getId()
				+ "></input></td><td class=jobs><label for="+jt.getId()+">"
				+ this.highlightSearch(jt.getName(),search)
				+"</label></td><td class=jobs>"
				+this.highlightSearch(jt.getJsmName(),search)
				+"</td><td class=jobs>"
				+this.showList(jt.getKeywords(),search)
				+"</td></tr>";
			}
			strHTML += "</table>";
		}		
		return strHTML;
	}	*/	
	public String showMyPermissions(User u) throws Exception {
		String retVal = "";
		//create five scripts for the login permissions
		String questionnaireHeader = "";
		String studiesHeader = "";
		String assessmentHeader = "";
		String participantHeader = "";
		String biospecimenHeader = "";
		String studymgrHeader = "";
		//create three scripts for the permission types and enclose them in fieldsets
		String retValQuestionnaire = "\n<fieldset class=\"permissions\"><Legend><b>Questionnaire</b></legend>";
		String retValInterview = "\n<fieldset class=\"permissions\"><Legend><b>Studies</b></legend>";
		String retValAssessment = "\n<fieldset class=\"permissions\"><Legend><b>Assessment</b></legend>";
		String retValParticipant = "\n<fieldset class=\"permissions\"><Legend><b>Participant</b></legend>";
		String retValBiospecimen = "\n<fieldset class=\"permissions\"><Legend><b>Biospecimen</b></legend>";
		String retValStudymgr = "\n<fieldset class=\"permissions\"><Legend><b>Study Manager</b></legend>";

		//for each type of permission..
		for(User.Permission p: User.Permission.values()) {
			//if permission is a questionnaire permission
			if (p.isQuestionnairePermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("QUESTIONNAIRELOGIN")){
					questionnaireHeader = showUserPermission(u, p);
				}else{
					//add to questionnaire script
					retValQuestionnaire += showUserPermission(u, p);
				}
			}
			//if permission is an interview permission
			if (p.isInterviewPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("STUDIESLOGIN")){
					studiesHeader = showUserPermission(u, p);
				}else{
					//add to interview script
					retValInterview += showUserPermission(u, p);
				}
			}
			//if permission is an assessment permission
			if (p.isAssessmentPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("ASSESSMENTLOGIN")){
					assessmentHeader = showUserPermission(u, p);
				}else{
					//add to assessment script
					retValAssessment += showUserPermission(u, p);
				}
			}
			//			if permission is a Participant permission
			if (p.isParticipantPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("PARTICIPANTLOGIN")){
					participantHeader = showUserPermission(u, p);
				}else{
					//add to participant script
					retValParticipant += showUserPermission(u, p);
				}
			}
			//			if permission is a Biospecimen permission
			if (p.isBiospecimenPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("BIOSPECIMENLOGIN")){
					biospecimenHeader = showUserPermission(u, p);
				}else{
					//add to assessment script
					retValBiospecimen += showUserPermission(u, p);
				}
			}
			//			if permission is a Study Manager permission
			if (p.isStudymgrPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("STUDYMGRLOGIN")){
					studymgrHeader = showUserPermission(u, p);
				}else{
					//add to assessment script
					retValStudymgr += showUserPermission(u, p);
				}
			}
		}
		//combine the scripts, close the fieldsets, and return them
		retVal += "<table >";
		retVal += "<tr>";		
		retVal += "<td valign=top>" + questionnaireHeader + "</td>";
		retVal += "<td valign=top>" + studiesHeader + "</td>";
		retVal += "<td valign=top>" + assessmentHeader + "</td>";
		retVal += "</tr>";	
		retVal += "<tr>";
		retVal += "<td valign=top rowspan=7>";
		retVal += retValQuestionnaire + "</fieldset>";
		retVal += "</td>";
		retVal += "<td valign=top rowspan=7>";
		retVal += retValInterview +  "</fieldset>";
		retVal += "</td>";
		retVal += "<td valign=top>";
		retVal += retValAssessment +  "</fieldset></td></tr>";
		retVal += "<tr><td valign=bottom>" + studymgrHeader + "</td></tr><tr><td valign=top>";
		retVal += retValStudymgr +  "</fieldset></td></tr>";
		retVal += "<tr><td valign=bottom>" + participantHeader + "</td></tr><tr><td valign=top>";
		retVal += retValParticipant +  "</fieldset></td></tr>";
		retVal += "<td valign=bottom>" + biospecimenHeader + "</td></tr><tr><td valign=top>";
		retVal += retValBiospecimen +  "</fieldset>";
		retVal += "</td>";
		retVal += "</tr>";
		retVal += "</table>";
		return retVal ;
	}
	private String showUserPermission(User u, User.Permission p) throws Exception {
		String checked;
		String divClass;
		String retVal = "";
		if( u.hasPermission(p)) {
			checked = " checked ";
			divClass = "class=\"RolePermissionChecked\""; 
		}else{
			checked = "";
			divClass = "class=\"RolePermissionUnchecked\""; 
		}
		String pId = p.toString();
		retVal += "\n<div " + divClass + " id="+pId+">";
		retVal += "\n";		
		ActionButton ab = p.getAssociateActionButton();
		String iconName = ab.getIconName();
		if (!checked.equals(" checked ")) {
			iconName = "dis_" + ab.getIconName();
		}
		retVal += "<img src='ImageStream?ImageName=" + iconName + "'"; 
		retVal += "  height=32 width=32/>"
			+ "<input type=checkbox onfocus=toggleClass('" + pId
			+ "','RolePermissionChecked','RolePermissionUnchecked');"
			+ checked 
			+ " name=userPermission_id"
			+ u.getId().toString() + "_p" + pId 
			+ " id=" + ((User)u).getId().toString() + pId
			+ "></input>" 
			+ "\n<label for=" 
			+ u.getId().toString() + pId + ">"
			+ p.toString()
			+ "</label>"
			+ "</div>";
		return retVal;
	}	
	private String showMyPermissions(Role r) throws Exception {
		String retVal = "";
		//create three scripts for the login permissions
		String questionnaireHeader = "";
		String studiesHeader = "";
		String assessmentHeader = "";
		String participantHeader = "";
		String biospecimenHeader = "";
		String studymgrHeader = "";
		//create three scripts for the permission types and enclose them in fieldsets
		String retValQuestionnaire = "\n<fieldset class=\"permissions\"><Legend><b>Questionnaire</b></legend>";
		String retValInterview = "\n<fieldset class=\"permissions\"><Legend><b>Studies</b></legend>";
		String retValAssessment = "\n<fieldset class=\"permissions\"><Legend><b>Assessment</b></legend>";
		String retValParticipant = "\n<fieldset class=\"permissions\"><Legend><b>Participant</b></legend>";
		String retValBiospecimen = "\n<fieldset class=\"permissions\"><Legend><b>Biospecimen</b></legend>";
		String retValStudymgr = "\n<fieldset class=\"permissions\"><Legend><b>Study Manager</b></legend>";

		//for each type of permission..
		for(User.Permission p: User.Permission.values()) {
			//if permission is a questionnaire permission
			if (p.isQuestionnairePermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("QUESTIONNAIRELOGIN")){
					questionnaireHeader = showRolePermission(r, p);
				}else{
					//add to questionnaire script
					retValQuestionnaire += showRolePermission(r, p);
				}
			}
			//if permission is an interview permission
			if (p.isInterviewPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("STUDIESLOGIN")){
					studiesHeader = showRolePermission(r, p);
				}else{
					//add to interview script
					retValInterview += showRolePermission(r, p);
				}
			}
			//if permission is an assessment permission
			if (p.isAssessmentPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("ASSESSMENTLOGIN")){
					assessmentHeader = showRolePermission(r, p);
				}else{
					//add to assessment script
					retValAssessment += showRolePermission(r, p);
				}
			}
			//			if permission is a Participant permission
			if (p.isParticipantPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("PARTICIPANTLOGIN")){
					participantHeader = showRolePermission(r, p);
				}else{
					//add to participant script
					retValParticipant += showRolePermission(r, p);
				}
			}
			//			if permission is a Biospecimen permission
			if (p.isBiospecimenPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("BIOSPECIMENLOGIN")){
					biospecimenHeader = showRolePermission(r, p);
				}else{
					//add to assessment script
					retValBiospecimen += showRolePermission(r, p);
				}
			}
			//			if permission is a Study Manager permission
			if (p.isStudymgrPermission()) {
				//if this is the login permission, place in the header script
				if (p.name().equals("STUDYMGRLOGIN")){
					studymgrHeader = showRolePermission(r, p);
				}else{
					//add to assessment script
					retValStudymgr += showRolePermission(r, p);
				}
			}
		}
		//combine the scripts, close the fieldsets, and return them
		retVal += "<table >";
		retVal += "<tr>";		
		retVal += "<td valign=top>" + questionnaireHeader + "</td>";
		retVal += "<td valign=top>" + studiesHeader + "</td>";
		retVal += "<td valign=top>" + assessmentHeader + "</td>";
		retVal += "</tr>";	
		retVal += "<tr>";
		retVal += "<td valign=top rowspan=7>";
		retVal += retValQuestionnaire + "</fieldset>";
		retVal += "</td>";
		retVal += "<td valign=top rowspan=7>";
		retVal += retValInterview +  "</fieldset>";
		retVal += "</td>";
		retVal += "<td valign=top>";
		retVal += retValAssessment +  "</fieldset></td></tr>";
		retVal += "<tr><td valign=bottom>" + studymgrHeader + "</td></tr><tr><td valign=top>";
		retVal += retValStudymgr +  "</fieldset></td></tr>";
		retVal += "<tr><td valign=bottom>" + participantHeader + "</td></tr><tr><td valign=top>";
		retVal += retValParticipant +  "</fieldset></td></tr>";
		retVal += "<td valign=bottom>" + biospecimenHeader + "</td></tr><tr><td valign=top>";
		retVal += retValBiospecimen +  "</fieldset>";
		retVal += "</td>";
		retVal += "</tr>";
		retVal += "</table>";
		return retVal ;
	}	
	private String showRolePermission(Role r, User.Permission p) throws Exception {
		String checked;
		String divClass;
		String retVal = "";
		if( r.hasPermission(p)) {
			checked = " checked ";
			divClass = "class=\"RolePermissionChecked\""; 
		}else{
			checked = "";
			divClass = "class=\"RolePermissionUnchecked\""; 
		}
		String pId = p.toString();
		retVal += "\n<div " + divClass + " id="+pId+">";
		retVal += "\n";		
		ActionButton ab = p.getAssociateActionButton();
		String iconName = ab.getIconName();
		if (!checked.equals(" checked ")) {
			iconName = "dis_" + ab.getIconName();
		}
		retVal += "<img src='ImageStream?ImageName=" + iconName + "'"; 
		retVal += "  height=32 width=32/>"
			+ "<input type=checkbox onfocus=toggleClass('" + pId
			+ "','RolePermissionChecked','RolePermissionUnchecked');"
			+ checked 
			+ " name=userPermission_id"
			+ r.getId().toString() + "_p" + pId 
			+ " id=" + ((Role)r).getId().toString() + pId
			+ "></input>" 
			+ "\n<label for=" 
			+ r.getId().toString() + pId + ">"
			+ p.toString()
			+ "</label>"
			+ "</div>";
		return retVal;
	}  
	public String showEditUserDetails(User user) throws Exception {
		String strRetValue = "<table class=\"RolePermissions\" >";		
		strRetValue += "<tr>";
		strRetValue += "<td align=right><label class=\"userdetails\" for=\"userName\">User name:</label></td>";
		strRetValue += "<td><input class=\"userdetails\" type=\"text\" name=\"userName\"  id=\"userName\" value=\"";
		strRetValue += user.getUserName() +"\">";		
		strRetValue += "</td>";		
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td align=right><label class=\"userdetails\" for=\"userPassword\">New Password:</label></td>";
		strRetValue += "<td><input class=\"userdetails\" type=\"password\" name=\"userPassword\"  id=\"userPassword\" value=\"";
		strRetValue += "\">";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td align=right><label class=\"userdetails\" for=\"confirmPassword\">Confirm Password:</label></td>";
		strRetValue += "<td><input class=\"userdetails\" type=\"password\" name=\"confirmPassword\"  id=\"confirmPassword\" value=\"";
		strRetValue += "\">";
		strRetValue += "</td>";		
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td align=right><label class=\"userRoles\" for=\"userRoles\">Role:</label></td><td>";
		Role role = new Role();
		strRetValue += this.showCombowithClass(user.getRoleId(),"userRoles",role.getAllRoles(),"userRoles");
		strRetValue += "</td>";		
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td width=100% colspan=2>";
		strRetValue += this.showMyPermissions(user);
		strRetValue += "</td>";		
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showRolePermissions(Role role) throws Exception {
		String strRetValue = "";
		strRetValue += "<table class=\"RolePermissions\">";		
		strRetValue += "<tr>";
		strRetValue += "<td width=100%>Role name: <b>";
		strRetValue += role.getName();
		strRetValue += "</b></td>";		
		strRetValue += "</tr><tr></tr>";
		strRetValue += "<tr>";
		strRetValue += "<td width=100%>";
		strRetValue += this.showMyPermissions(role);
		strRetValue += "</td>";		
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td width=100%>";
		strRetValue += "</td>";		
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}	
	public String showUserTabs(String userTab) {
		String strRetValue = "";
		strRetValue += "<table class=jsms>";
		strRetValue += "<tr>";
		String highlight = "";
		if(userTab.equalsIgnoreCase("Users")){
			highlight = "class=Highlight";
		}
		strRetValue += "<td "+highlight+"><a href=main.jsp?userTab=Users onclick=\"return showProgress()\">Users</a></td>";	
		highlight = "";
		if(userTab.equalsIgnoreCase("Roles")){
			highlight = "class=Highlight";
		}
		strRetValue += "<td "+highlight+"><a href=main.jsp?userTab=Roles onclick=\"return showProgress()\">Roles</a></td>";		
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showUserStudies(User user) throws Exception {
		String retVal = "";
		retVal += "<fieldset> <legend>Study Allocations</legend> \n ";						
		retVal += "<table> \n ";						
		retVal += "<tr> \n ";						
		retVal += "<td> \n ";						
		retVal += this.showLinkedUsers(user); 					
		retVal += "</td> \n ";						
		retVal += "<td> \n ";						
		retVal += this.showUnlinkedUsers(user);		
		retVal += "</td> \n ";						
		retVal += "</tr> \n ";						
		retVal += "</table> \n ";						
		retVal += "</fieldset> \n ";			
		return retVal;
	}
	private String showUnlinkedUsers(User user) throws Exception {
		String retVal = "";	
		retVal += "<fieldset> <legend>Unlinked Studies</legend> \n ";
		retVal += "<div > \n ";
		retVal += "<select class=studies multiple size=8 name=unlinkedStudies > \n ";
		Study study = new Study();
		ArrayList<Study> allStudies = study.getStudies(Study.Option.USEOCCIDEAS);												
		for (Study study1: allStudies){
			if(!(user.getStudies().contains(study1))){
				retVal += " <option value=" 
					+ study1.getId() 
					+  " >" 
					+ study1.getName()
					+  "</option> \n ";
			}			
		}	
		retVal += "</select> \n ";
		retVal += "<div> <input type=submit name=addStudyToUser_" 
			+ user.getId() 
			+ " value=\"Link Study\"> </div> \n ";

		retVal += "</div> </fieldset> \n ";
		return retVal;
	}
	private String showLinkedUsers(User user) throws Exception {
		String retVal = "";	
		retVal += "<fieldset> <legend>Linked Studies</legend> \n ";
		retVal += "<div > \n "; 
		retVal += "<select class=studies multiple size=8 name=linkedStudies > \n ";
		ArrayList<Study> linkedStudies = user.getStudies();										
		for (Study study: linkedStudies){
			retVal += " <option value=" 
				+ study.getId() 
				+  " >" 
				+ study.getName()
				+  "</option> \n ";
		}	
		retVal += "</select> \n ";
		retVal += "<div> <input type=submit name=removeStudyFromUser_" 
			+ user.getId() 
			+ " value=\"Unlink Study\"> </div> \n ";		
		retVal += "</div> </fieldset> \n ";
		return retVal;
	}   	
	public String showAdminMiscellaneous() {
		String strRetValue = "";		
		//show random data generator button
		strRetValue += "<table class=dbrule cellpadding=2 cellspacing=0>";		
		strRetValue += "<tr class=windowTop><td align=center>Auto Generate Data</td></tr>";						
		strRetValue += "<tr>";
		strRetValue += "<td align=center>";
		strRetValue += "<table>";
		strRetValue += "<tr><td><input type=submit name=Action value=AutoGen></input></td></tr>";
		strRetValue += "<tr><td><input type=submit name=Action value=AutoGenRettInt></input></td></tr>";
		strRetValue += "<tr><td><input type=submit name=Action value=RunMisc></input></td></tr>";
		strRetValue += "<tr><td><input type=submit name=Action value=RefreshImages></input></td></tr>";
		strRetValue += "</table>";
		strRetValue += "</td>";			
		strRetValue += "</tr>";
		strRetValue += "</table>";		
		strRetValue += "</td>";			
		strRetValue += "</tr>";
		strRetValue += "<tr height=100>";			
		strRetValue += "<td align=center>";
		//show random data generator button
		strRetValue += "<table class=dbrule cellpadding=2 cellspacing=0>";		
		strRetValue += "<tr class=windowTop><td align=center>Auto Set Frequency Rules</td></tr>";						
		strRetValue += "<tr>";
		strRetValue += "<td align=center>";
		strRetValue += "<table>";
		strRetValue += "<tr><td><input type=submit name=Action value=AutoSetAJSMsAndRules></input></td></tr>";
		strRetValue += "</table>";
		strRetValue += "</td>";			
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showAllQuestions(List<Question> qs,String strInterviewID,boolean bShowReport) throws Exception {
		return this.showAllQuestions(qs,strInterviewID,bShowReport,null);
	}
	public String showAllQuestions(List<Question> qs,String strInterviewID,boolean bShowReport,ExpertRule er) throws Exception {
		String strRetValue = "";
		strRetValue += "\n<table class=EditView width=100% border=0>";
		int i = 1;
		for (Question q: qs) {          	 
			q.setInterviewID(strInterviewID);
			String strAnswers = this.showAllAnswers(q.getAnswers(),bShowReport,er);                    
			strRetValue += "\n<tr>";            
			strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
			strRetValue += "\n <td nowrap>(" + i + ")</td>";
			strRetValue += "\n <td width=98% title='"+this.showList(q.getAgents())+"'>" + q.getDescription() + "</td>";              
			strRetValue += "\n</tr>";
			strRetValue += "\n<tr>";
			strRetValue += "\n <td>&nbsp;</td>";
			strRetValue += "\n <td colspan=3>" + strAnswers + "</td>";
			strRetValue += "\n</tr>";  
			i++;
		}      
		strRetValue += "\n</table>";
		return strRetValue;
	}
	//	public String showAllQuestionsInterviewReview(List<Question> qs,String strInterviewID,boolean readOnly) throws Exception {
	//        String strRetValue = "";
	//        strRetValue += "\n<table class=EditView width=100% border=0>";
	//        int i = 1;
	//        for (Question q: qs) {        	
	//        	ActionButton editActionButton = new ActionButton(q.getJsmQuestionStructureID()+"_editInterviewQuestion","Edit Question", "edititem.gif");
	//        	editActionButton.setIconHeight("16");
	//        	editActionButton.setIconWidth("16");
	//        	editActionButton.setOnClick("onclick=\"return showProgress()\"");
	//        	if(readOnly){
	//        		editActionButton.setEnabled(false);
	//        	}else{
	//        		editActionButton.setEnabled(true);
	//        	}       	
	//        	boolean isFrequency = false;
	//        	if(q.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
	//        		isFrequency = true;
	//        	}
	//			q.setInterviewID(strInterviewID);
	//			String skippedWarning = "";
	//	        if(q.isSkipped()){
	//	        	skippedWarning = "class=skippedWarning";
	//	        }
	//			String strAnswers = this.showAllAnswersInterviewReview(q.getAnswers(),readOnly,isFrequency);                    
	//			strRetValue += "\n<tr>";            
	//			strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >"+editActionButton.toString()+"</td>";
	//			strRetValue += "\n <td nowrap>(" + i + ")</td>";
	//			strRetValue += "\n <td width=98% title='"+this.showList(q.getAgents())+"'>" + q.getDescription() + "</td>";              
	//			strRetValue += "\n</tr>";
	//			strRetValue += "\n<tr>";
	//			strRetValue += "\n <td>&nbsp;</td>";
	//			strRetValue += "\n <td colspan=3 "+skippedWarning+">" + strAnswers + "</td>";
	//			strRetValue += "\n</tr>";  
	//			i++;
	//        }      
	//        strRetValue += "\n<tr><td colspan=3><input type=hidden name=Action value=ActionButton></td></tr>";
	//        strRetValue += "\n</table>";
	//        return strRetValue;
	//    }
	public String showAllQuestionsInterviewReviewAgent(FrozenJobSpecificModule fjsm,String strInterviewID,Agent agent,Study study) throws Exception {
		String strRetValue = "";      
		strRetValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		strRetValue +="<tr>";
		strRetValue +="<td>";
		strRetValue +="<table width=100%>";       	
		Interview interview = new Interview(strInterviewID);
		int iQuestionCount = 1;
		int iPossibleAnswer = 1;      
		for(FrozenQA fqa:fjsm.getFrozenQuestionsAndAnswers()){
			if(fqa.isQuestion()){
				Question q = new Question(fqa.getQuestionId(),fqa.getJsmQuestionStructureId());   
				if(q.getId().equalsIgnoreCase("")){
					continue; //Question has been removed;
				}
				q.setFrozenQuestion(fqa);
				if(!(q.isNext(interview))){
					if(!(q.getAgents().contains(agent))){
						continue;
					} 
				}
				Integer indentLevel;
				if(!(q.isRootQ())){
					indentLevel = fqa.getIndentLevel()+2;
				}else{
					indentLevel = fqa.getIndentLevel();
				}
				strRetValue += "\n<tr>";            
				strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
				strRetValue += "\n <td title='"+this.showList(q.getAgents())+"' style='padding-left:"+indentLevel+"0px;'>(" + iQuestionCount + ")";
				strRetValue += "\n " + q.getFrozenQuestion().getQuestionDescription() + "</td>";              
				strRetValue += "\n</tr>";
				strRetValue += "\n<tr>";

				q.setInterviewID(strInterviewID);
				String skippedWarning = "";
				if(q.isSkipped()){
					skippedWarning = "class=skippedWarning";
					strRetValue += "\n <td>&nbsp;</td>";
					strRetValue += "\n <td "+skippedWarning+">&nbsp;</td>";     			
				}
				strRetValue += "\n</tr>";
				iQuestionCount++;
				iPossibleAnswer = 1;
			}else{       		
				PossibleAnswer pa = new PossibleAnswer(fqa.getPossibleAnswerId(),fqa.getJsmQuestionPossibleAnswerStructureId());
				if(pa.getJsmQuestionStructureID().equalsIgnoreCase("")){
					continue; //Possible Answer has been removed;
				}
				Question parentQ = new Question("",pa.getJsmQuestionStructureID());
				parentQ.setInterviewID(interview.getId());      			
				for(PossibleAnswer actualAnswer:parentQ.getAnswers()){
					if(actualAnswer.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase(pa.getJsmQuestionPossibleAnswerStructureID())){
						strRetValue += "\n<tr>";
						strRetValue += "\n<td></td><td style='padding-left:"+fqa.getIndentLevel()+"0px'><table border=0 class=possibleanswers>";
						String cssClass = "";                            
						strRetValue += "\n<tr "+cssClass+">";
						strRetValue += "\n <td title='" + actualAnswer.getId() + " "
						+ actualAnswer.getJsmQuestionPossibleAnswerStructureID()
						+ "' "+cssClass+">&nbsp;</td>";
						strRetValue += "\n <td nowrap "+cssClass+">(" + iPossibleAnswer + ")</td>";
						String theAnswer = actualAnswer.getActualAnswer();
						if(study.hasOption(Study.Option.CAT3FREQ)){
							if(theAnswer.equalsIgnoreCase("1111")){
								theAnswer = "&lt;5 hours per week";
							}else if(theAnswer.equalsIgnoreCase("2222")){
								theAnswer = "5-30 hours per week";
							}else if(theAnswer.equalsIgnoreCase("3333")){
								theAnswer = "&gt;30 hours per week";
							}
						}
						strRetValue += "\n <td width=98% "+cssClass+">" + theAnswer + "</td>";         
						String answerDescription = actualAnswer.getDescription().replace("'","''");
						answerDescription = answerDescription.replace("\"","''");
						strRetValue += "\n <td valign=top "+cssClass+"><a href=\"./main.jsp?Location=Agents&questionId="+actualAnswer.getJsmQuestionStructureID()+"&answerId="+actualAnswer.getId()+"&answerDescription='"+answerDescription+"'\" >report</a></td>";                	

						strRetValue += "\n</tr>";
						iPossibleAnswer++;
						strRetValue += "\n</table></td>";
						strRetValue += "\n</tr>";
					}
				}
			}	
		}  
		strRetValue +="</table>";
		strRetValue +="</td>";
		strRetValue +="</tr>"; 
		strRetValue += "\n<tr><td ><input type=hidden name=Action value=ActionButton></td></tr>";
		strRetValue += "</table>";

		return strRetValue;
	}

	public String showAllQuestionsInterviewReviewFull(FrozenJobSpecificModule fjsm,String strInterviewID) throws Exception {
		String strRetValue = "";      
		strRetValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		strRetValue +="<tr>";
		strRetValue +="<td>";
		strRetValue +="<table width=100%>";       	
		Interview interview = new Interview(strInterviewID);
		int iQuestionCount = 1;
		int iPossibleAnswer = 1;      
		for(FrozenQA fqa:fjsm.getFrozenQuestionsAndAnswers()){
			if(fqa.isQuestion()){
				Question q = new Question(fqa.getQuestionId(),fqa.getJsmQuestionStructureId());    		
				q.setFrozenQuestion(fqa);
				if(!(q.isNext(interview))){
					continue; 
				}
				Integer indentLevel;
				if(!(q.isRootQ())){
					indentLevel = fqa.getIndentLevel()+2;
				}else{
					indentLevel = fqa.getIndentLevel();
				}
				strRetValue += "\n<tr>";            
				strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
				strRetValue += "\n <td title='"+this.showList(q.getAgents())+"' style='padding-left:"+indentLevel+"0px;'>(" + iQuestionCount + ")";
				strRetValue += "\n " + q.getFrozenQuestion().getQuestionDescription() + "</td>";              
				strRetValue += "\n</tr>";
				strRetValue += "\n<tr>";

				q.setInterviewID(strInterviewID);
				String skippedWarning = "";
				if(q.isSkipped()){
					skippedWarning = "class=skippedWarning";
					strRetValue += "\n <td>&nbsp;</td>";
					strRetValue += "\n <td "+skippedWarning+">&nbsp;</td>";     			
				}
				strRetValue += "\n</tr>";
				iQuestionCount++;
				iPossibleAnswer = 1;
			}else{       		
				PossibleAnswer pa = new PossibleAnswer(fqa.getPossibleAnswerId(),fqa.getJsmQuestionPossibleAnswerStructureId());
				Question parentQ = new Question("",pa.getJsmQuestionStructureID());
				parentQ.setInterviewID(interview.getId());      			
				for(PossibleAnswer actualAnswer:parentQ.getAnswers()){
					if(actualAnswer.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase(pa.getJsmQuestionPossibleAnswerStructureID())){
						strRetValue += "\n<tr>";
						strRetValue += "\n<td></td><td style='padding-left:"+fqa.getIndentLevel()+"0px'><table border=0 class=possibleanswers>";
						String cssClass = "";                            
						strRetValue += "\n<tr "+cssClass+">";
						strRetValue += "\n <td title='" + actualAnswer.getId() + " "
						+ actualAnswer.getJsmQuestionPossibleAnswerStructureID()
						+ "' "+cssClass+">&nbsp;</td>";
						strRetValue += "\n <td nowrap "+cssClass+">(" + iPossibleAnswer
						+ ")</td>";
						strRetValue += "\n <td width=98% "+cssClass+">" + actualAnswer.getActualAnswer()
						+ "</td>";     
						//if(bShowReport){
						//String answerDescription = actualAnswer.getDescription().replace("'","''");
						//answerDescription = answerDescription.replace("\"","''");
						//strRetValue += "\n <td valign=top "+cssClass+"><a href=\"./main.jsp?Location=Agents&questionId="+actualAnswer.getJsmQuestionStructureID()+"&answerId="+actualAnswer.getId()+"&answerDescription='"+answerDescription+"'\" >report</a></td>";                	
						// }

						strRetValue += "\n</tr>";
						iPossibleAnswer++;
						strRetValue += "\n</table></td>";
						strRetValue += "\n</tr>";
					}
				}
			}	
		}        
		strRetValue +="</table>";
		strRetValue +="</td>";
		strRetValue +="</tr>"; 
		strRetValue += "\n<tr><td ><input type=hidden name=Action value=ActionButton></td></tr>";
		strRetValue += "</table>";

		return strRetValue;
	}
	public String showAllQuestionsInterviewReviewRule(FrozenJobSpecificModule fjsm,String strInterviewID,Agent agent,ExpertRule rule,Study study) throws Exception {
		String strRetValue = "";      
		strRetValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		strRetValue +="<tr>";
		strRetValue +="<td>";
		strRetValue +="<table width=100%>";       	
		Interview interview = new Interview(strInterviewID);
		int iQuestionCount = 1;
		int iPossibleAnswer = 1;

		for(FrozenQA fqa:fjsm.getFrozenQuestionsAndAnswers()){
			if(fqa.isQuestion()){
				Question q = new Question(fqa.getQuestionId(),fqa.getJsmQuestionStructureId());    	
				if(q.getId().equalsIgnoreCase("")){
					continue; //Question has been removed;
				}
				q.setFrozenQuestion(fqa);
				if(!(q.isNext(interview))){
					if(!(q.getAgents().contains(agent))){
						continue;
					} 
				}
				Integer indentLevel;
				if(!(q.isRootQ())){
					indentLevel = fqa.getIndentLevel()+2;
				}else{
					indentLevel = fqa.getIndentLevel();
				}
				strRetValue += "\n<tr>";            
				strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >&nbsp;</td>";
				strRetValue += "\n <td title='"+this.showList(q.getAgents())+"' style='padding-left:"+indentLevel+"0px;'>(" + iQuestionCount + ")";
				strRetValue += "\n " + q.getFrozenQuestion().getQuestionDescription() + "</td>";              
				strRetValue += "\n</tr>";
				strRetValue += "\n<tr>";

				q.setInterviewID(strInterviewID);
				String skippedWarning = "";
				if(q.isSkipped()){
					skippedWarning = "class=skippedWarning";
					strRetValue += "\n <td>&nbsp;</td>";
					strRetValue += "\n <td "+skippedWarning+">&nbsp;</td>";     			
				}
				strRetValue += "\n</tr>";
				iQuestionCount++;
				iPossibleAnswer = 1;
			}else{       		
				PossibleAnswer pa = new PossibleAnswer(fqa.getPossibleAnswerId(),fqa.getJsmQuestionPossibleAnswerStructureId());
				if(pa.getJsmQuestionStructureID().equalsIgnoreCase("")){
					continue; //Possible Answer has been removed;
				}
				Question parentQ = new Question("",pa.getJsmQuestionStructureID());
				parentQ.setInterviewID(interview.getId());      			
				for(PossibleAnswer actualAnswer:parentQ.getAnswers()){
					if(actualAnswer.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase(pa.getJsmQuestionPossibleAnswerStructureID())){
						strRetValue += "\n<tr>";
						strRetValue += "\n<td></td><td style='padding-left:"+fqa.getIndentLevel()+"0px'><table border=0 class=possibleanswers>";

						String cssClass = "";
						String anchor = "";
						if(rule!=null){
							//check if has rule  
							if(actualAnswer.isInRule(rule)){
								cssClass = "class='Highlight'";
								anchor = "<a id="+rule.getId()+">&nbsp;</a>";
							}else{
								cssClass = "class='possibleanswers'";
							}                 	
						}                              
						strRetValue += "\n<tr "+cssClass+">";
						strRetValue += "\n <td title='" + actualAnswer.getId() + " "
						+ actualAnswer.getJsmQuestionPossibleAnswerStructureID()
						+ "' "+cssClass+">"+anchor+"&nbsp;</td>";
						strRetValue += "\n <td nowrap "+cssClass+">(" + iPossibleAnswer
						+ ")</td>";
						String theAnswer = actualAnswer.getActualAnswer();
						if(study.hasOption(Study.Option.CAT3FREQ)){
							if(theAnswer.equalsIgnoreCase("1111")){
								theAnswer = "&lt;5 hours per week";
							}else if(theAnswer.equalsIgnoreCase("2222")){
								theAnswer = "5-30 hours per week";
							}else if(theAnswer.equalsIgnoreCase("3333")){
								theAnswer = "&gt;30 hours per week";
							}
						}
						strRetValue += "\n <td width=98% "+cssClass+">" + theAnswer + "</td>";   
						String answerDescription = actualAnswer.getDescription().replace("'","''");
						answerDescription = answerDescription.replace("\"","''");
						strRetValue += "\n <td valign=top "+cssClass+"><a href=\"./main.jsp?jobhistoryID="+interview.getJobHistoryId()+"&jsmID="+fjsm.getId()+"&agentID="+agent.getId()+"&Location=Agents&questionId="+actualAnswer.getJsmQuestionStructureID()+"&answerId="+actualAnswer.getId()+"&answerDescription='"+answerDescription+"'\" >report</a></td>";                	

						strRetValue += "\n</tr>";
						iPossibleAnswer++;
						strRetValue += "\n</table></td>";
						strRetValue += "\n</tr>";
					}
				}
			}	
		} 
		strRetValue +="</table>";
		strRetValue +="</td>";
		strRetValue +="</tr>"; 
		strRetValue += "\n<tr><td ><input type=hidden name=Action value=ActionButton></td></tr>";
		strRetValue += "</table>";

		return strRetValue;
	}

	public String showAllQuestionsInterviewReview1(FrozenJobSpecificModule fjsm,String strInterviewID,boolean readOnly,Study study) throws Exception {
		String strRetValue = "";      
		strRetValue += "<table class=EditView cellpadding=0 cellspacing=0>";
		strRetValue +="<tr>";
		strRetValue +="<td>";
		strRetValue +="<table width=100%>";       	
		Interview interview = new Interview(strInterviewID);
		int iQuestionCount = 1;
		int iPossibleAnswer = 1;  
		for(FrozenQA fqa:fjsm.getFrozenQuestionsAndAnswers()){
			if(fqa.isQuestion()){
				Question q = new Question(fqa.getQuestionId(),fqa.getJsmQuestionStructureId());
				if(q.getId().equalsIgnoreCase("")){
					continue; //Question has been removed;
				}
				q.setFrozenQuestion(fqa);
				if(!(q.isNext(interview))){
					continue;
				}
				ActionButton editActionButton = new ActionButton(fqa.getId()+"_editInterviewQuestion","Edit Question", "edititem.gif");
				editActionButton.setIconHeight("16");
				editActionButton.setIconWidth("16");
				editActionButton.setOnClick("onclick=\"return showProgress()\"");
				if(readOnly){
					editActionButton.setEnabled(false);
				}else{
					editActionButton.setEnabled(true);
				}       	 			
				strRetValue += "\n<tr>";            
				strRetValue += "\n <td title='" + q.getId() + " " + q.getJsmQuestionStructureID() + "' >"+editActionButton.toString()+"</td>";
				Integer indentLevel;
				if(!(q.isRootQ())){
					indentLevel = fqa.getIndentLevel()+2;
				}else{
					indentLevel = fqa.getIndentLevel();
				}
				strRetValue += "\n <td title='"+this.showList(q.getAgents())+"' style='padding-left:"+indentLevel+"0px;'>(" + q.getLevel() + ")";
				strRetValue += "\n " + fqa.getQuestionDescription() + "</td>";              
				strRetValue += "\n</tr>";
				strRetValue += "\n<tr>";

				q.setInterviewID(strInterviewID);
				String skippedWarning = "";
				if(q.isSkipped()){
					skippedWarning = "class=skippedWarning";
					strRetValue += "\n <td>&nbsp;</td>";
					strRetValue += "\n <td "+skippedWarning+">&nbsp;</td>";     			
				}
				strRetValue += "\n</tr>";
				iQuestionCount++;
				iPossibleAnswer = 1;
			}else{

				PossibleAnswer pa = new PossibleAnswer(fqa.getPossibleAnswerId(),fqa.getJsmQuestionPossibleAnswerStructureId());
				if(pa.getJsmQuestionStructureID().equalsIgnoreCase("")){
					continue; //Possible Answer has been removed;
				}
				Question parentQ = new Question("",pa.getJsmQuestionStructureID());
				parentQ.setInterviewID(interview.getId());      			
				for(PossibleAnswer actualAnswer:parentQ.getAnswers()){
					if(actualAnswer.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase(pa.getJsmQuestionPossibleAnswerStructureID())){
						strRetValue += "\n<tr>";
						strRetValue += "\n<td></td><td style='padding-left:"+fqa.getIndentLevel()+"0px'><table border=0 class=possibleanswers>";

						String strValidFrequency = "";
						if(!(study.hasOption(Study.Option.CAT3FREQ))){
							if(parentQ.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
								if(!(actualAnswer.isValidFrequency())){
									ActionButton updateJHActionButton = new ActionButton(actualAnswer.getJsmQuestionStructureID()+"_editJHFrequencyValues","Edit Job History Frequency Values", "edititem.gif");
									updateJHActionButton.setIconHeight("16");
									updateJHActionButton.setIconWidth("16");
									updateJHActionButton.setEnabled(true); 
									strValidFrequency = "<span style='padding-left:10px' class=isMandatory>This answer has a value higher than the reported Job History value.  To increase the reported Job History value to "
										+actualAnswer.getActualAnswer()
										+" click here "+updateJHActionButton.toString()+"<span>";
								}
							}
						}
						String cssClass = "";                              
						strRetValue += "\n<tr "+cssClass+">";
						strRetValue += "\n <td title='" + actualAnswer.getId() + " "
						+ actualAnswer.getJsmQuestionPossibleAnswerStructureID()
						+ "' "+cssClass+">&nbsp;</td>";
						strRetValue += "\n <td nowrap "+cssClass+">(" + iPossibleAnswer
						+ ")</td>";
						String theAnswer = actualAnswer.getActualAnswer();
						if(study.hasOption(Study.Option.CAT3FREQ)){
							if(theAnswer.equalsIgnoreCase("1111")){
								theAnswer = "&lt;5 hours per week";
							}else if(theAnswer.equalsIgnoreCase("2222")){
								theAnswer = "5-30 hours per week";
							}else if(theAnswer.equalsIgnoreCase("3333")){
								theAnswer = "&gt;30 hours per week";
							}
						}

						strRetValue += "\n <td width=98% "+cssClass+">" + theAnswer
						+ strValidFrequency+"</td>";               
						strRetValue += "\n</tr>";
						iPossibleAnswer++;
						strRetValue += "\n</table></td>";
						strRetValue += "\n</tr>";
					}
				}
			}	
		}  
		strRetValue +="</table>";
		strRetValue +="</td>";
		strRetValue +="</tr>"; 
		strRetValue += "\n<tr><td ><input type=hidden name=Action value=ActionButton></td></tr>";
		strRetValue += "</table>";

		return strRetValue;
	}
	public String showAllAnswers(List<PossibleAnswer> answers,boolean bShowReport,ExpertRule er) throws Exception {
		String strRetValue = "";
		if (answers.size() != 0) {
			strRetValue = "\n<table width=100% border=0><tr ><td><table border=0 class=possibleanswers>";
			int i = 1;
			for (PossibleAnswer answer: answers) {                              
				String cssClass = "";
				if(er!=null){
					//check if has rule  
					if(answer.isInRule(er)){
						cssClass = "class='Highlight'";
					}else{
						cssClass = "class='possibleanswers'";
					}                 	
				}               
				strRetValue += "\n<tr "+cssClass+">";
				strRetValue += "\n <td title='" + answer.getId() + " "
				+ answer.getJsmQuestionPossibleAnswerStructureID()
				+ "' "+cssClass+">&nbsp;</td>";
				strRetValue += "\n <td nowrap "+cssClass+">(" + i
				+ ")</td>";
				strRetValue += "\n <td width=98% "+cssClass+">" + answer.getActualAnswer()
				+ "</td>";
				if(bShowReport){
					String answerDescription = answer.getDescription().replace("'","''");
					answerDescription = answerDescription.replace("\"","''");
					strRetValue += "\n <td valign=top "+cssClass+"><a href=\"./main.jsp?Location=Agents&questionId="+answer.getJsmQuestionStructureID()+"&answerId="+answer.getId()+"&answerDescription='"+answerDescription+"'\" >report</a></td>";                	
				}
				strRetValue += "\n</tr>";

				if (answer.getChildQuestions().size() > 0) {
					String childqs = this.showAllQuestions(answer.getChildQuestions(),answer.getInterviewID(),bShowReport,er);
					strRetValue += "<tr><td "+cssClass+"></td><td colspan=3>" + childqs
					+ "</td></tr>";
				}
				i++;
			}
			strRetValue += "</table></td></tr></table>";
		}
		return strRetValue;
	}	
	//	public String showAllAnswersInterviewReview(List<PossibleAnswer> answers,boolean readOnly,boolean validateFrequency) throws Exception {
	//        String strRetValue = "";
	//        if (answers.size() != 0) {        	
	//            strRetValue = "\n<table width=100% border=0><tr ><td><table border=0 class=possibleanswers>";
	//            int i = 1;
	//            for (PossibleAnswer answer: answers) {   
	//            	String strValidFrequency = "";
	//            	if(validateFrequency){
	//            		if(!(answer.isValidFrequency())){
	//            			ActionButton updateJHActionButton = new ActionButton(answer.getJsmQuestionStructureID()+"_editJHFrequencyValues","Edit Job History Frequency Values", "edititem.gif");
	//                    	updateJHActionButton.setIconHeight("16");
	//                    	updateJHActionButton.setIconWidth("16");
	//                    	updateJHActionButton.setEnabled(true); 
	//            			strValidFrequency = "<span style='padding-left:10px' class=isMandatory>This answer has a value higher than the reported Job History value.  To increase the reported Job History value to "
	//            				+answer.getActualAnswer()
	//            				+" click here "+updateJHActionButton.toString()+"<span>";
	//            		}
	//            	}
	//            	ActionButton editActionButton = new ActionButton(answer.getJsmQuestionStructureID()+"_editInterviewQuestion","Edit Question", "edititem.gif");
	//            	editActionButton.setIconHeight("16");
	//            	editActionButton.setIconWidth("16");
	//            	if(readOnly){
	//            		editActionButton.setEnabled(false);
	//            	}else{
	//            		editActionButton.setEnabled(true);
	//            	} 
	//                String cssClass = "";                              
	//                strRetValue += "\n<tr "+cssClass+">";
	//                strRetValue += "\n <td title='" + answer.getId() + " "
	//                        + answer.getJsmQuestionPossibleAnswerStructureID()
	//                        + "' "+cssClass+">&nbsp;"+editActionButton.toString()+"</td>";
	//                strRetValue += "\n <td nowrap "+cssClass+">(" + i
	//                        + ")</td>";
	//                strRetValue += "\n <td width=98% "+cssClass+">" + answer.getActualAnswer()
	//                        + strValidFrequency+"</td>";               
	//                strRetValue += "\n</tr>";
	//                
	//                if (answer.getChildQuestions().size() > 0) {
	//                	String childqs = this.showAllQuestionsInterviewReview(answer.getChildQuestions(),answer.getInterviewID(),readOnly);
	//                    strRetValue += "<tr><td "+cssClass+"></td><td colspan=3>" + childqs
	//                            + "</td></tr>";
	//                }
	//                i++;
	//            }
	//            strRetValue += "</table></td></tr></table>";
	//        }
	//        return strRetValue;
	//    }	
	public String showAllUsers(String selId, ArrayList<User> users, int userPage, int pageSize) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";
		ArrayList<String> userNames = new ArrayList<String>();
		for (User u: users) {
			String strClass = "";
			if (u.getId().equalsIgnoreCase(selId)) {
				strClass = " class=Highlight";
			} else {
				strClass = " class=LHSMenuContent";
			}		
			String txt = "<tr><td colspan=2 "+strClass+"><a href=main.jsp?BlueTabLocation=Admin&userID=" + u.getId() + " onclick=\"return showProgress()\">" + u.getUserName()
			+ "</a></td></tr>";
			userNames.add(txt);
		}		
		int itemsOnPage = pageSize;
		int totalPages = Util.getTotalPagesFromPagedItems(userNames.size(), itemsOnPage);    
		Object[] pageList = Util.getPageFromPagedItems(userNames, itemsOnPage, userPage);
		for (Object item : pageList) {
			strRetValue += (String)item; 
		}
		//If a user is on the last page then selects search,'participantPage' should be returned to 1
		if (userPage > totalPages){userPage = 1;}
		int prevPage = userPage - 1;
		if (prevPage < 1){prevPage = 1;}      
		int nextPage = userPage + 1;
		if (nextPage > totalPages){nextPage = totalPages;}

		strRetValue += "</table>";
		//show 'page x of y' text
		strRetValue += showPaging(prevPage,userPage, totalPages, nextPage, true);
		//show box for changing page size 
		strRetValue += showPageSize(pageSize);
		return strRetValue;
	}
	public String showSanityCheckName(String checkname) {
		String retValue = "<table class=LHSMenuContent cellpadding=0 cellspacing=0>";		
		String highlight = "";
		if(checkname.equalsIgnoreCase("orphanQuestions")){
			highlight = "class=Highlight";
		}		
		retValue += "<tr "+highlight+"><td class=studies><a href=main.jsp?sanitycheck=orphanQuestions>Orphan Questions</a></td></tr>";
		highlight = "";
		if(checkname.equalsIgnoreCase("orphanPossibleAnswers")){
			highlight = "class=Highlight";
		}		
		retValue += "<tr "+highlight+"><td class=studies><a href=main.jsp?sanitycheck=orphanPossibleAnswers>Orphan Possible Answers</a></td></tr>";
		highlight = "";
		if(checkname.equalsIgnoreCase("orphanStructuresPA")){
			highlight = "class=Highlight";
		}		
		retValue += "<tr "+highlight+"><td class=studies><a href=main.jsp?sanitycheck=orphanStructuresPA>Orphan Structures Possible Answers</a></td></tr>";
		highlight = "";
		if(checkname.equalsIgnoreCase("orphanStructuresQ")){
			highlight = "class=Highlight";
		}		
		retValue += "<tr "+highlight+"><td class=studies><a href=main.jsp?sanitycheck=orphanStructuresQ>Orphan Structures Questions</a></td></tr>";
		highlight = "";
		if(checkname.equalsIgnoreCase("noFactRules")){
			highlight = "class=Highlight";
		}		
		retValue += "<tr "+highlight+"><td class=studies><a href=main.jsp?sanitycheck=noFactRules>No Fact Rules</a></td></tr>";
		highlight = "";
		if(checkname.equalsIgnoreCase("emptyFacts")){
			highlight = "class=Highlight";
		}		
		retValue += "<tr "+highlight+"><td class=studies><a href=main.jsp?sanitycheck=emptyFacts>Empty Facts</a></td></tr>";
		highlight = "";
		if(checkname.equalsIgnoreCase("lostStudySpecificJSMs")){
			highlight = "class=Highlight";
		}		
		retValue += "<tr "+highlight+"><td class=studies><a href=main.jsp?sanitycheck=lostStudySpecificJSMs>Lost Frozen JSMs</a></td></tr>";

		retValue += "</table>";

		return retValue;
	}
	protected String truncateName(String name, int length){
		String shortName = name;
		if(shortName.length()>length){
			shortName = shortName.substring(0,(length-3))+"...";
		}
		return shortName;
	}
	public String showPaging(int prevPage,int page, int pages,int nextPage,boolean homePage) {
		String searchHTML = "";
		if (homePage) {
			searchHTML = "<table class=LHSMenuContent><tr><td class=small><a href=index.jsp?userPage=" + prevPage + ">&lt;&lt;back</a></td><td class=small align='center'>Page " + page + " of " + pages + "</td><td class=small><a href=index.jsp?userPage=" + nextPage + ">next&gt;&gt;</a></td></tr></table>";
		}else{
			searchHTML = "<table class=LHSMenuContent><tr><td class=small><a href=main.jsp?participantPage=" + prevPage + ">&lt;&lt;back</a></td><td class=small align='center'>Page " + page + " of " + pages + "</td><td class=small><a href=main.jsp?participantPage=" + nextPage + ">next&gt;&gt;</a></td></tr></table>";
		}
		return searchHTML;
	}	
	public String showPageSize(int pageSize) {
		String searchHTML = "";
		searchHTML = "<table class=LHSMenuContent><tr><td>&nbsp;</td><td class=small>Page Size</td><td colspan=2><input type='text' size='4' maxlength='4' name='pagesize' value='" + pageSize + "'></input></td><td><input type='submit' value='Set'></input></td></tr></table>";
		return searchHTML;
	}

	public String showProgressBar(String message) {

		String strHTML = "";
		strHTML += "\n<table cellpadding=0 cellspacing=0 width=100% >";		
		strHTML += "<tr ><td align=center><div id=studyprogress></div></td></tr>";  
		strHTML += "<tr ><td align=center>Thank you for your patience</td></tr>";
		strHTML += "</div>";
		strHTML += "<tr ><td align=center>"+message+"</td></tr>";  
		strHTML += "<tr ><td align=center>"+this.showFlashAnimationRepeat()+"</td></tr>";  
		strHTML += "</table>";

		return strHTML;
	}
	public String showFlashAnimation() {
		String strHTML = "";
		strHTML += "<table>";
		strHTML += "<tr>";
		strHTML += "<td height=400 align=center>";		
		strHTML += "<object classid='clsid:d27cdb6e-ae6d-11cf-96b8-444553540000' codebase='http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,0,0' width='400' height='120' id='OccIDEASheaderv1' align='middle'>";
		strHTML += "<param name='allowScriptAccess' value='sameDomain' />";
		strHTML += "<param name='movie' value='ImageStream?ImageName=flashheader.swf' />";
		strHTML += "<param name='loop' value='false' />";
		strHTML += "<param name='quality' value='high' />";
		strHTML += "<param name='wmode' value='transparent' />";
		strHTML += "<param name='bgcolor' value='#ffffff' />";
		strHTML += "<embed src='ImageStream?ImageName=flashheader.swf' loop='false' quality='high' wmode='transparent' bgcolor='#ffffff' width='400' height='120' name='OccIDEASheaderv1' align='middle' allowScriptAccess='sameDomain' type='application/x-shockwave-flash' pluginspage='http://www.macromedia.com/go/getflashplayer' />";
		strHTML += "</object>"; 
		strHTML += "</td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showFlashImagesAnimation() {
		String strHTML = "";
		strHTML += "<object classid=\"clsid:d27cdb6e-ae6d-11cf-96b8-444553540000\" codebase=\"http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,0,0\" width=\"200\" height=\"240\" id=\"OccIDEASImages\" align=\"middle\">";
		strHTML += "<param name=\"allowScriptAccess\" value=\"sameDomain\" />";
		strHTML += "<param name=\"movie\" value=\"ImageStream?ImageName=OccIDEASImages.swf\" />";
		strHTML += "<param name=\"quality\" value=\"high\" />";
		strHTML += "<param name=\"bgcolor\" value=\"#ffffff\" />";
		strHTML += "<embed src=\"ImageStream?ImageName=OccIDEASImages.swf\" quality=\"high\" bgcolor=\"#ffffff\" width=\"200\" height=\"240\" name=\"OccIDEASImages\" align=\"middle\" allowScriptAccess=\"sameDomain\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" />";
		strHTML += "</object>"; 
		return strHTML;
	}
	public String showFlashAnimationRepeat() {
		String strHTML = "";
		strHTML += "<table>";
		strHTML += "<tr>";
		strHTML += "<td height=400 align=center>";		
		strHTML += "<object classid='clsid:d27cdb6e-ae6d-11cf-96b8-444553540000' codebase='http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,0,0' width='400' height='120' id='OccIDEASheaderv1' align='middle'>";
		strHTML += "<param name='allowScriptAccess' value='sameDomain' />";
		strHTML += "<param name='movie' value='ImageStream?ImageName=flashheaderRepeat.swf' />";
		strHTML += "<param name='loop' value='false' />";
		strHTML += "<param name='quality' value='high' />";
		strHTML += "<param name='wmode' value='transparent' />";
		strHTML += "<param name='bgcolor' value='#ffffff' />";
		strHTML += "<embed src='ImageStream?ImageName=flashheaderRepeat.swf' loop='false' quality='high' wmode='transparent' bgcolor='#ffffff' width='400' height='120' name='OccIDEASheaderv1' align='middle' allowScriptAccess='sameDomain' type='application/x-shockwave-flash' pluginspage='http://www.macromedia.com/go/getflashplayer' />";
		strHTML += "</object>"; 
		strHTML += "</td>";
		strHTML += "</tr>";
		strHTML += "</table>";
		return strHTML;
	}
	public String showQuestion(Question question,Study study) throws Exception {        
		String strRetValue = "<table class=InterviewQuestion>";
		boolean viewWithParent = false;       
		if(study.hasOption(Study.Option.PARENTQWITHFREQQS)){  //can remove this if no freq qs in rett study
			if(question.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				viewWithParent = true;        	
			}
		}
		if(question.isViewWithParent()){
			viewWithParent = true;
		}      
		if(viewWithParent){      	
			strRetValue += "\n<tr>";
			strRetValue += "\n<td colspan=2 >Regarding the question: ";
			Question parentQ = new Question("",question.getParentQuestionID());
			parentQ.setInterviewID(question.getInterviewID());
			if(parentQ.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				Question pParentQ = new Question("",parentQ.getParentQuestionID());
				PossibleAnswer pa = new PossibleAnswer("",parentQ.getParentID());
				strRetValue += pParentQ.getDescription()+"-"+pa.getActualAnswer();
			}else{
				PossibleAnswer pa = new PossibleAnswer();
				for(PossibleAnswer paTemp:parentQ.getAnswers()){
					if(paTemp.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase(question.getParentID())){
						pa = paTemp;
						break;
					}
				}            	
				strRetValue += parentQ.getDescription()+"-"+pa.getActualAnswer();
			}           
			strRetValue += "\n</td>";
			strRetValue += "\n</tr>";           
		}
		strRetValue += "\n<tr>";
		strRetValue += "\n <td width=20px title='"
			+ question.getId()
			+ " "
			+ question.getJsmQuestionStructureID()
			+ "' >("
			+ question.getLevel()
			+ ")</td>";
		String interviewerNote = "";
		if(!(question.getNotes().equalsIgnoreCase("NULL"))){
			interviewerNote = "<font color=green>Note: "+question.getNotes()+ "</font>";
		}
		if(question.isMultiple()){
			interviewerNote += "<font color=green>&nbsp;&nbsp;Allow Multiple</font>";
		}
		strRetValue += "\n <td><div tabindex=0 name=fullQ"+question.getJsmQuestionStructureID()+" style='color: blue;'>"
		+ question.getDescription()
		+ "</div> "
		+ interviewerNote
		+ "</td>";
		strRetValue += "\n</tr>";
		strRetValue += "\n<tr>";
		strRetValue += "\n ";
		String skippedWarning = "";
		if(question.isSkipped()){
			skippedWarning = "class=skippedWarning";
		}
		String strAnswers = this.showAllAnswersInterview(question.getPossibleAnswers(), question.getAnswers(), question.isMultiple(),false,question.getInterviewID(),false,null,study);
		strRetValue += "\n <td colspan=4 class=InterviewPossibleAnswer><table width=100% "+skippedWarning+">" + strAnswers + "</table></td>";
		strRetValue += "\n</tr>";
		strRetValue += "\n</table>";
		strRetValue += "\n<script language=javascript type='text/javascript'>setFocus('fullQ"+question.getJsmQuestionStructureID()+"');</script>";
		return strRetValue;
	}
	public String showLoginRedirector(String strUsername,String strPassword,String checked,String strError) {
		String retValue = "";

		//Print out login screen			   
		retValue += "<table class=Login>";              
		retValue += "<tr class=windowTop>";
		retValue += "<td colspan=4 align=center><b>Log in to OccIDEAS</b></td>";       
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";
		//show user details
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";       
		retValue += "<tr>";
		retValue += "<td>&nbsp;</td><td align=right >Username:</td>";
		retValue += "<td><input type=text name=username value='" + strUsername + "' class=button></input></td><td>&nbsp;</td>";
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";             
		retValue += "<tr>";
		retValue += "<td>&nbsp;</td><td align=right>Password:</td>";
		retValue += "<td><input type=password name=password value='" + strPassword + "' class=button></input></td><td>&nbsp;</td>";
		retValue += "</tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";
		retValue += "<tr>";
		retValue += "<td colspan=4><input type=checkbox name=rememberme value=yes " + checked + ">Remember Me</input></td>";
		retValue += "</tr>";
		retValue += "<tr>";
		retValue += "<td colspan=4 align=right>";
		retValue += "<input type=submit name=login value=login class=button></input>";
		retValue += "</td>";
		retValue += "</tr>";
		retValue += "<tr><td colspan=4 align=center width=350><font style=\"color:red\">" + strError + "</font></td></tr>";
		retValue += "<tr><td colspan=4>&nbsp;</td></tr>";                   
		retValue += "</table>";     

		return retValue;
	}   
	public String showGlobalMinMax(String globalMinMax) {
		String strRetValue = "";
		String image = "";
		if (globalMinMax.equals("minimise")){
			image = "plus.gif";
			globalMinMax = "maximise";
		}else {
			image = "minus.gif";
			globalMinMax = "minimise";
		}
		strRetValue += "<table class=questions width=100%><tr><td>";       
		strRetValue += "<table><tr>";       
		strRetValue += "<td><input type=image src='ImageStream?ImageName=" + image + "' height=10 width=10  name=GlobalMinMaximise alt='Toggle All Open/Closed'></input></td><td><input type=hidden name=GlobalMinMaxState value='" + globalMinMax + "'></input></td>";       
		strRetValue += "<td><div title='Sequence Number'>()</div></td>";       
		strRetValue += "<td><img alt='Select All' id=selectAllImage name=selectAllImage src='ImageStream?ImageName=unchecked.gif' onclick=swapSelectAllImage(this); /></td>";       
		strRetValue += "<td title='Small desciptive of Question to be used in rule creation and reports'><font class=KeyPhrase>Question Key Phrase</font></td>";       
		strRetValue += "<td title='The Question itself to be displayed in the interviews'>Question Description</td>";                         
		strRetValue += "</tr></table>";       
		strRetValue += "</td></tr>";       
		strRetValue += "<tr><td><hr></td></tr></table>";       
		return strRetValue;
	}

	public String showGenderCombo(String gender) {
		String strRetValue = "<select onchange='MarkPageDirty()' name=gender>";
		strRetValue += "<option></option>";
		strRetValue += gender.equalsIgnoreCase("Male")?"<option value=Male selected>Male</option>":"<option value=Male>Male</option>";
		strRetValue += gender.equalsIgnoreCase("Female")?"<option value=Female selected>Female</option>":"<option value=Female>Female</option>";
		/*if (!(gender.equalsIgnoreCase("Male"))) {
			selected = "";
		}
		strRetValue += "<option value=Male selected>Male</option>";
		selected = "";
		if (gender.equalsIgnoreCase("Female")) {
			selected = "selected";
		}
		strRetValue += "<option value=Female " + selected + ">Female</option>";
		strRetValue += "</select>";*/
		return strRetValue;
	}
	public String showSearchBoxUsers(String strSearch) {
		String strRetValue = "<table>";
		strRetValue += "<tr><td width=400px align=center class=SearchButton>Search users to add: <input type=text size=20 name=userSearchString value=\""
			+ strSearch
			+ "\"></input><input type=submit name=Search value='Search' onclick=\"showProgress()\" ></input><input type=submit name=Clear value='Clear'></input></td></tr></table>";
		return strRetValue;
	}
	public String showSearchBoxKeyPhrases(String strSearch) {
		String strRetValue = "<table>";
		strRetValue += "<tr><td width=400px align=center class=SearchButton>Search Key Phrases: <input type=text size=20 name=keyPhraseSearchString value=\""
			+ strSearch
			+ "\"></input><input type=submit name=Search value='Search' onclick=\"showProgress()\" ></input><input type=submit name=Clear value='Clear'></input></td></tr></table>";
		return strRetValue;
	}
	public String showRenameBoxKeyPhrases() {
		String strRetValue = "<table>";
		strRetValue += "<tr><td width=400px align=center class=SearchButton>Rename Key Phrases: <input type=text size=20 name=keyPhraseRenameString ></input><input type=submit name=Rename value='Rename' onclick=\"showProgress()\" ></input></td></tr>";
		strRetValue += "</table>";   	
		return strRetValue;
	}

	public String showSearchedUsersBox(List<User> searchedUsers)  throws Exception{
		String strHTML = "<table>";
		String strChecked = "";
		String strCheckedClass = "UserSelectUnchecked";	

		for (Object o : searchedUsers) {
			User user = (User)o;
			strHTML += "<tr class=SearchboxRow><td width=30%></td><td width=200 align=left>";
			strHTML += "<div class=\"" + strCheckedClass + "\" id="
			+ user.getId() + "><input id=" + user.getId()
			+ "  type=checkbox " + strChecked + " name=usersCheckBox_"
			+ user.getId() + " onfocus=toggleClass('" + user.getId()
			+ "','UserSelectChecked','UserSelectUnchecked');></input><label for="
			+ user.getId() + ">" + user.getUserName() + "</label>";

			strHTML += "</div>";
			strHTML += "</td></tr>";
		}
		strHTML += "</table>";
		return strHTML;
	}
	public String showParticipantStatuses(String selId, String name, List<ParticipantStatus> array) throws Exception {
		String strRetValue = "<table>";
		strRetValue += "<tr><td><select  name=" + name + " >";
		boolean bFound = false;
		for (Iterator<ParticipantStatus> it = array.iterator(); it.hasNext();) {
			Object o = it.next();
			if (o instanceof DBBaseObject) {
				DBBaseObject obj = (DBBaseObject) o;          
				if (obj.getId().equalsIgnoreCase(selId)) {
					strRetValue += "<option selected value=" + obj.getId() + ">" + obj.getName() + "</option>";
					bFound = true;
				} else {
					strRetValue += "<option value=" + obj.getId() + ">" + obj.getName() + "</option>";
				}
			}
		}
		if(!(bFound)){
			ParticipantStatus ps = new ParticipantStatus(selId);
			strRetValue += "<option selected value=" + ps.getId() + ">" + ps.getName() + "</option>";
		}
		strRetValue += "</select></td></tr></table>";
		return strRetValue;
	}
	public String showNumberpad(String formName, String selectName, int startNo, int endNo, int noInRow,String paJsmQuestionStructureID, String colapseIt){
		String strReturn = "";
		noInRow++;
		endNo ++;
		strReturn += "<DIV id='" + selectName + "numberpad' style='position:absolute;visibility:hidden;z-index:1001;' onmouseout=\"style.visibility='hidden'\" onmouseover=\"style.visibility='visible'\">";
		strReturn += "<TABLE BORDER=4><TR><TD>";
		for (int i=startNo;i<endNo;i++) {
			strReturn += "<INPUT STYLE='width:25px' TYPE='button' VALUE=' " + i + "  ' OnClick=\"setFromNumberPad('"+formName+"','"+selectName+"',"+i+"); autoCheck('"
			+ paJsmQuestionStructureID
			+ "0','0'); "+colapseIt+"\"></input>";
			if ((double)(i/noInRow) == ((double)i/(double)noInRow)) {
				strReturn += "<br>";
			}
		}
		strReturn += "<INPUT STYLE='width:25px' TYPE='button' Value=' *  ' OnClick='document.getElementById(\"" + selectName + "numberpad\").style.visibility=\"hidden\"'></input>";
		strReturn += "<br></TD></TR></TABLE></DIV>";

		return strReturn;
	}

	public String showDatePicker(int startYear, int endYear, int year, int month, int day, String controlName) {
		String[] months = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] days = {"Day", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};
		if (startYear == 0) {
			startYear = 1950;//default
		}
		if (endYear == 0) {
			endYear = 2005;//default
		}
		String html = "<select onchange='MarkPageDirty()' id='" + controlName + "-dd' name='" + controlName + "-dd'>";
		for (int i=0;i<32;i++) {
			String selected = (day == i)?" selected='yes' ":"";
			html += "<option " + selected + "value='" + i+ "'>" + days[i]+ "</option>";
		}
		html += "</select>";

		html += "<select onchange='MarkPageDirty()' id='" + controlName + "-mm' name='" + controlName + "-mm'>";
		for (int i=0;i<13;i++) {
			String selected = (month == i)?" selected='yes' ":"";
			html += "<option " + selected + "value='" + i+ "'>" + months[i]+ "</option>";
		}
		html += "</select>";
		html += "<select onchange='MarkPageDirty()' class='split-date range-low-19000101' id='" + controlName + "' name='" + controlName + "'>";
		html += "<option value='-1'>Year</option>";
		for (int i =startYear;i<endYear;i++) {
			String selected = (year == i)?" selected='yes' ":"";
			html += "<option " + selected + "value='" + i + "'>" + i + "</option>";
		}
		html += "</select>";
		return html;
	}
	public String showDatePickerNoDay(int startYear, int endYear, int year, int month, int day, String controlName) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] days = {"Day", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};
		if (startYear == 0) {
			startYear = 1950;//default
		}
		if (endYear == 0) {
			endYear = 2005;//default
		}
		String html = "<div style='display:none;visibility:hidden;'><select id='" + controlName + "-dd' name='" + controlName + "-dd'>";
		for (int i=0;i<32;i++) {
			String selected = (day == i)?" selected='yes' ":"";
			html += "<option " + selected + "value='" + i+ "'>" + days[i]+ "</option>";
		}
		html += "</select></div>";

		html += "<select onchange='MarkPageDirty()' id='" + controlName + "-mm' name='" + controlName + "-mm'>";
		html += month == -1?"<option selected='yes value='-1'>Unknown</option>":"<option value='-1'>Unknown</option>";
		html += month == 0?"<option selected='yes value='0'></option>":"<option value='0'></option>";
		for (int i=0;i<12;i++) {
			String selected = (month == (i+1))?" selected='yes' ":"";
			html += "<option " + selected + "value='" + (i+1)+ "'>" + months[i]+ "</option>";
		}
		html += "</select>";
		html += "<select onchange='MarkPageDirty()' class='split-date range-low-19000101' id='" + controlName + "' name='" + controlName + "'>";
		html += year == -1?"<option selected='yes value='-1'>Unknown</option>":"<option value='-1'>Unknown</option>";
		html += year == 0?"<option selected='yes value='0'></option>":"<option value='0'></option>";
		for (int i =startYear;i<endYear;i++) {
			String selected = (year == i)?" selected='yes' ":"";
			html += "<option " + selected + "value='" + i + "'>" + i + "</option>";
		}
		html += "</select>";
		return html;
	}
	public String showDatePickerYearOnly(int startYear, int endYear, int year, int month, int day, String controlName) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] days = {"Day", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};
		if (startYear == 0) {
			startYear = 1950;//default
		}
		if (endYear == 0) {
			endYear = 2005;//default
		}
		String html = "<div style='display:none;visibility:hidden;'><select id='" + controlName + "-dd' name='" + controlName + "-dd'>";
		for (int i=0;i<32;i++) {
			String selected = (day == i)?" selected='yes' ":"";
			html += "<option " + selected + "value='" + i+ "'>" + days[i]+ "</option>";
		}
		html += "</select></div>";

		html += "<div style='display:none;visibility:hidden;'><select onchange='MarkPageDirty()' id='" + controlName + "-mm' name='" + controlName + "-mm'>";
		html += month == -1?"<option selected='yes value='-1'>Unknown</option>":"<option value='-1'>Unknown</option>";
		html += month == 0?"<option selected='yes value='0'></option>":"<option value='0'></option>";
		for (int i=0;i<12;i++) {
			String selected = (month == (i+1))?" selected='yes' ":"";
			html += "<option " + selected + "value='" + (i+1)+ "'>" + months[i]+ "</option>";
		}
		html += "</select></div>";
		html += "<select onchange='MarkPageDirty()' class='split-date range-low-19000101' id='" + controlName + "' name='" + controlName + "'>";
		html += year == -1?"<option selected='yes value='-1'>Unknown</option>":"<option value='-1'>Unknown</option>";
		html += year == 0?"<option selected='yes value='0'></option>":"<option value='0'></option>";
		for (int i =startYear;i<endYear;i++) {
			String selected = (year == i)?" selected='yes' ":"";
			html += "<option " + selected + "value='" + i + "'>" + i + "</option>";
		}
		html += "</select>";
		return html;
	}
}
