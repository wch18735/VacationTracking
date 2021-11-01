CREATE TABLE "notification$notification" (
	"id" BIGINT NOT NULL,
	"title" VARCHAR_IGNORECASE(200) NULL,
	"message" VARCHAR_IGNORECASE(2147483647) NULL,
	"read" BOOLEAN NULL,
	"associatedobject" BIGINT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('819d48df-f5fb-4161-8958-80f3ca83ca3a', 
'Notification.Notification', 
'notification$notification', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e2716f37-94c1-40ba-b23d-598ff1eb3718', 
'819d48df-f5fb-4161-8958-80f3ca83ca3a', 
'Title', 
'title', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('8ed768f9-dcf0-4c22-9eed-0b73272468ff', 
'819d48df-f5fb-4161-8958-80f3ca83ca3a', 
'Message', 
'message', 
30, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('5657929e-3c14-4f55-8631-b7a649f683fe', 
'819d48df-f5fb-4161-8958-80f3ca83ca3a', 
'Read', 
'read', 
10, 
0, 
'false', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('768cbbe0-73f4-4821-84ce-ef4e4067081a', 
'819d48df-f5fb-4161-8958-80f3ca83ca3a', 
'AssociatedObject', 
'associatedobject', 
4, 
0, 
'0', 
false);
CREATE TABLE "notification$notification_account" (
	"notification$notificationid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("notification$notificationid","administration$accountid"));
CREATE INDEX "idx_notification$notification_account_administration$account_notification$notification" ON "notification$notification_account" ("administration$accountid" ASC,"notification$notificationid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('763a440e-60c6-490b-a52e-d5a3906264ab', 
'Notification.Notification_Account', 
'notification$notification_account', 
'819d48df-f5fb-4161-8958-80f3ca83ca3a', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'notification$notificationid', 
'administration$accountid', 
'idx_notification$notification_account_administration$account_notification$notification');
CREATE TABLE "notification$notification_vacationrequest" (
	"notification$notificationid" BIGINT NOT NULL,
	"vacationmanagement$vacationrequestid" BIGINT NOT NULL,
	PRIMARY KEY("notification$notificationid","vacationmanagement$vacationrequestid"),
	CONSTRAINT "uniq_notification$notification_vacationrequest_notification$notificationid" UNIQUE ("notification$notificationid"));
CREATE INDEX "idx_notification$notification_vacationrequest_vacationmanagement$vacationrequest_notification$notification" ON "notification$notification_vacationrequest" ("vacationmanagement$vacationrequestid" ASC,"notification$notificationid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('1a3180f3-05f0-4f3b-8af2-132601daeac5', 
'Notification.Notification_VacationRequest', 
'notification$notification_vacationrequest', 
'819d48df-f5fb-4161-8958-80f3ca83ca3a', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'notification$notificationid', 
'vacationmanagement$vacationrequestid', 
'idx_notification$notification_vacationrequest_vacationmanagement$vacationrequest_notification$notification');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_notification$notification_vacationrequest_notification$notificationid', 
'1a3180f3-05f0-4f3b-8af2-132601daeac5', 
'f4a70179-5b02-3150-b616-95ef291fef9e');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211031 22:44:10';
