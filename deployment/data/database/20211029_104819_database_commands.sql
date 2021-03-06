CREATE TABLE "vacationmanagement$vacationrequestday" (
	"id" BIGINT NOT NULL,
	"date" TIMESTAMP NULL,
	"hours" INT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('49fdf579-4314-4d6d-a7a4-374ef1e2fc9d', 
'VacationManagement.VacationRequestDay', 
'vacationmanagement$vacationrequestday', 
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
 VALUES ('98f1e80a-4b53-40e4-8339-40b0be0d1b39', 
'49fdf579-4314-4d6d-a7a4-374ef1e2fc9d', 
'Date', 
'date', 
20, 
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
 VALUES ('8b557bba-8f04-4c7b-b24b-31c78bbaa53e', 
'49fdf579-4314-4d6d-a7a4-374ef1e2fc9d', 
'Hours', 
'hours', 
3, 
0, 
'0', 
false);
CREATE TABLE "vacationmanagement$vacationrequestday_vacationrequest" (
	"vacationmanagement$vacationrequestdayid" BIGINT NOT NULL,
	"vacationmanagement$vacationrequestid" BIGINT NOT NULL,
	PRIMARY KEY("vacationmanagement$vacationrequestdayid","vacationmanagement$vacationrequestid"),
	CONSTRAINT "uniq_vacationmanagement$vacationrequestday_vacationrequest_vacationmanagement$vacationrequestdayid" UNIQUE ("vacationmanagement$vacationrequestdayid"));
CREATE INDEX "idx_vacationmanagement$vacationrequestday_vacationrequest" ON "vacationmanagement$vacationrequestday_vacationrequest" ("vacationmanagement$vacationrequestid" ASC,"vacationmanagement$vacationrequestdayid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('9de8bdf3-407d-46be-a6ad-970edc589582', 
'VacationManagement.VacationRequestDay_VacationRequest', 
'vacationmanagement$vacationrequestday_vacationrequest', 
'49fdf579-4314-4d6d-a7a4-374ef1e2fc9d', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'vacationmanagement$vacationrequestdayid', 
'vacationmanagement$vacationrequestid', 
'idx_vacationmanagement$vacationrequestday_vacationrequest');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_vacationmanagement$vacationrequestday_vacationrequest_vacationmanagement$vacationrequestdayid', 
'9de8bdf3-407d-46be-a6ad-970edc589582', 
'5bea4d9d-d9bc-3cf4-903e-e364c13e9fab');
CREATE TABLE "vacationmanagement$vacationrequest" (
	"id" BIGINT NOT NULL,
	"startdate" TIMESTAMP NULL,
	"enddate" TIMESTAMP NULL,
	"requesttype" VARCHAR_IGNORECASE(39) NULL,
	"vacationrequeststatus" VARCHAR_IGNORECASE(9) NULL,
	"description" VARCHAR_IGNORECASE(2147483647) NULL,
	"createddate" TIMESTAMP NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'VacationManagement.VacationRequest', 
'vacationmanagement$vacationrequest', 
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
 VALUES ('1cea095a-4416-4b44-b8dd-4b2d84a8b0d8', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'StartDate', 
'startdate', 
20, 
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
 VALUES ('788d6133-e0de-443b-b8e7-a0b86b392f29', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'EndDate', 
'enddate', 
20, 
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
 VALUES ('d9e7b5bb-24dc-460b-9814-3a8c68b74169', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'RequestType', 
'requesttype', 
40, 
39, 
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
 VALUES ('323ee8c6-8533-48da-ae10-7e7784c24ec6', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'VacationRequestStatus', 
'vacationrequeststatus', 
40, 
9, 
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
 VALUES ('bc9a630a-cce3-4073-8263-4e2f94f20a02', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'Description', 
'description', 
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
 VALUES ('dffda50c-fdbe-3524-adff-20504e0ab472', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'createdDate', 
'createddate', 
20, 
0, 
'', 
false);
CREATE TABLE "vacationmanagement$vacationrequest_approver" (
	"vacationmanagement$vacationrequestid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("vacationmanagement$vacationrequestid","administration$accountid"),
	CONSTRAINT "uniq_vacationmanagement$vacationrequest_approver_vacationmanagement$vacationrequestid" UNIQUE ("vacationmanagement$vacationrequestid"));
CREATE INDEX "idx_vacationmanagement$vacationrequest_approver_administration$account_vacationmanagement$vacationrequest" ON "vacationmanagement$vacationrequest_approver" ("administration$accountid" ASC,"vacationmanagement$vacationrequestid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('38f43aae-1307-4dd9-ab92-e51fd1be349b', 
'VacationManagement.VacationRequest_Approver', 
'vacationmanagement$vacationrequest_approver', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'vacationmanagement$vacationrequestid', 
'administration$accountid', 
'idx_vacationmanagement$vacationrequest_approver_administration$account_vacationmanagement$vacationrequest');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_vacationmanagement$vacationrequest_approver_vacationmanagement$vacationrequestid', 
'38f43aae-1307-4dd9-ab92-e51fd1be349b', 
'65abf130-cbad-3fb1-b491-3700ce1c680f');
CREATE TABLE "vacationmanagement$vacationrequest_submitter" (
	"vacationmanagement$vacationrequestid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("vacationmanagement$vacationrequestid","administration$accountid"),
	CONSTRAINT "uniq_vacationmanagement$vacationrequest_submitter_vacationmanagement$vacationrequestid" UNIQUE ("vacationmanagement$vacationrequestid"));
CREATE INDEX "idx_vacationmanagement$vacationrequest_submitter_administration$account_vacationmanagement$vacationrequest" ON "vacationmanagement$vacationrequest_submitter" ("administration$accountid" ASC,"vacationmanagement$vacationrequestid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('26212ecf-96a8-4504-8d66-ee9e18bf97eb', 
'VacationManagement.VacationRequest_Submitter', 
'vacationmanagement$vacationrequest_submitter', 
'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'vacationmanagement$vacationrequestid', 
'administration$accountid', 
'idx_vacationmanagement$vacationrequest_submitter_administration$account_vacationmanagement$vacationrequest');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_vacationmanagement$vacationrequest_submitter_vacationmanagement$vacationrequestid', 
'26212ecf-96a8-4504-8d66-ee9e18bf97eb', 
'd685c723-1780-351e-a418-43ea51fb420b');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211029 10:48:19';
