DROP VIEW participantnamesview;
CREATE VIEW participantnamesview AS 
SELECT participant.id AS id,
participant.referencenumber AS referencenumber,
people.first_name AS first_name,
people.middle_name AS middle_name,
people.last_name AS last_name,
participant.studyid AS studyid,
participant.nextcontactdatetime AS nextcontactdatetime,
participant.phonenumber AS phonenumber,
participant.participantstatusid AS participantstatusid,
participant.lastupdated AS lastupdated, Count(jobhistory.id) AS jobhistorycount
FROM jobhistory RIGHT JOIN (people INNER JOIN participant ON people.id = participant.person_id) ON jobhistory.participantid = participant.id
GROUP BY participant.id ,
participant.referencenumber ,
people.first_name ,
people.middle_name ,
people.last_name,
participant.studyid ,
participant.participantstatusid ,
participant.nextcontactdatetime ,
participant.lastupdated,
participant.phonenumber
ORDER BY participant.referencenumber;