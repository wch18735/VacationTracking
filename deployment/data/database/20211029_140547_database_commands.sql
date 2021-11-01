ALTER TABLE "vacationmanagement$vacationrequest" ADD "totalhoursrequested" INT NULL;
UPDATE "vacationmanagement$vacationrequest"
 SET "totalhoursrequested" = 0;
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
"attribute_name" = 'VacationRequestStatus', 
"column_name" = 'vacationrequeststatus', 
"type" = 40, 
"length" = 9, 
"default_value" = 'Draft', 
"is_auto_number" = false
 WHERE "id" = '323ee8c6-8533-48da-ae10-7e7784c24ec6';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('11a6ef54-f5ec-423d-9bfe-bc873f9be415', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'TotalHoursRequested', 
'totalhoursrequested', 
3, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211029 14:05:47';
