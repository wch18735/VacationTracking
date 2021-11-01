ALTER TABLE "notification$notification_vacationrequest" DROP CONSTRAINT "uniq_notification$notification_vacationrequest_notification$notificationid";
DROP INDEX "idx_notification$notification_vacationrequest_vacationmanagement$vacationrequest_notification$notification";
DROP INDEX "idx_notification$notification_account_administration$account_notification$notification";
ALTER TABLE "notification$notification" RENAME TO "notifications$notification";
ALTER TABLE "notification$notification_vacationrequest" RENAME TO "notifications$notification_vacationrequest";
ALTER TABLE "notification$notification_account" RENAME TO "notifications$notification_account";
UPDATE "mendixsystem$entity"
 SET "entity_name" = 'Notifications.Notification', 
"table_name" = 'notifications$notification', 
"superentity_id" = NULL, 
"remote" = false, 
"remote_primary_key" = false
 WHERE "id" = '819d48df-f5fb-4161-8958-80f3ca83ca3a';
ALTER TABLE "notifications$notification_vacationrequest" ALTER COLUMN "notification$notificationid" RENAME TO "notifications$notificationid";
CREATE INDEX "idx_notifications$notification_vacationrequest_vacationmanagement$vacationrequest_notifications$notification" ON "notifications$notification_vacationrequest" ("vacationmanagement$vacationrequestid" ASC,"notifications$notificationid" ASC);
ALTER TABLE "notifications$notification_vacationrequest" ADD CONSTRAINT "uniq_notifications$notification_vacationrequest_notifications$notificationid" UNIQUE ("notifications$notificationid");
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_notification$notification_vacationrequest_notification$notificationid' AND "column_id" = 'f4a70179-5b02-3150-b616-95ef291fef9e';
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_notifications$notification_vacationrequest_notifications$notificationid', 
'1a3180f3-05f0-4f3b-8af2-132601daeac5', 
'f4a70179-5b02-3150-b616-95ef291fef9e');
UPDATE "mendixsystem$association"
 SET "association_name" = 'Notifications.Notification_VacationRequest', 
"table_name" = 'notifications$notification_vacationrequest', 
"parent_entity_id" = '819d48df-f5fb-4161-8958-80f3ca83ca3a', 
"child_entity_id" = 'b7b8e7de-742b-49aa-acb2-6223acb009b7', 
"parent_column_name" = 'notifications$notificationid', 
"child_column_name" = 'vacationmanagement$vacationrequestid', 
"pk_index_name" = NULL, 
"index_name" = 'idx_notifications$notification_vacationrequest_vacationmanagement$vacationrequest_notifications$notification'
 WHERE "id" = '1a3180f3-05f0-4f3b-8af2-132601daeac5';
ALTER TABLE "notifications$notification_account" ALTER COLUMN "notification$notificationid" RENAME TO "notifications$notificationid";
CREATE INDEX "idx_notifications$notification_account_administration$account_notifications$notification" ON "notifications$notification_account" ("administration$accountid" ASC,"notifications$notificationid" ASC);
UPDATE "mendixsystem$association"
 SET "association_name" = 'Notifications.Notification_Account', 
"table_name" = 'notifications$notification_account', 
"parent_entity_id" = '819d48df-f5fb-4161-8958-80f3ca83ca3a', 
"child_entity_id" = '3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
"parent_column_name" = 'notifications$notificationid', 
"child_column_name" = 'administration$accountid', 
"pk_index_name" = NULL, 
"index_name" = 'idx_notifications$notification_account_administration$account_notifications$notification'
 WHERE "id" = '763a440e-60c6-490b-a52e-d5a3906264ab';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211101 22:44:44';
