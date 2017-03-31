// initializing administration records

INSERT INTO Admin(id, password, passwordDate, studentAccess, siteAccess, volunteerAccess, adminAccess, changeDate, changeId)  VALUES('ToddisGod', 'godaccess', '03/30/2017', 'C', 'C', 'C', 'C', '03/30/2017', 'ToddisGod')
INSERT INTO Admin(id, password, passwordDate, studentAccess, siteAccess, volunteerAccess, adminAccess, changeDate, changeId)  VALUES('ToddisNotGod', 'toddaccess', '03/31/2017', 'V', 'V', 'V', 'V', '03/31/2017', 'ToddisGod')
INSERT INTO Admin(id, password, passwordDate, studentAccess, siteAccess, volunteerAccess, adminAccess, changeDate, changeId)  VALUES('ToddisSite', 'siteaccess', '03/31/2017', 'V', 'C', 'C', 'V', '03/31/2017', 'ToddisGod')
INSERT INTO Admin(id, password, passwordDate, studentAccess, siteAccess, volunteerAccess, adminAccess, changeDate, changeId)  VALUES('ToddisStudent', 'studentaccess', '03/31/2017', 'C', 'V', 'V', 'V', '03/31/2017', 'ToddisGod')
INSERT INTO Admin(id, password, passwordDate, studentAccess, siteAccess, volunteerAccess, adminAccess, changeDate, changeId)  VALUES('ToddisVolunteer', 'volunteeraccess', '03/31/2017', 'V', 'V', 'C', 'V', '03/31/2017', 'ToddisGod')
INSERT INTO Admin(id, password, passwordDate, studentAccess, siteAccess, volunteerAccess, adminAccess, changeDate, changeId)  VALUES('ToddisAdmin', 'adminaccess', '03/31/2017', 'V', 'V', 'V', 'C', '03/31/2017', 'ToddisGod')

// Foodsite SQL

INSERT INTO FOODSITE(ID, PROGRAM_NAME, SITE_COORDINATOR_FIRST_NAME, SITE_COORDINATOR_LAST_NAME, PHONE_NUMBER, E_MAIL, EXECUTIVE_DIRECTOR_FIRST, EXECUTIVE_DIRECTOR_LAST, COUNTY_OF_PROGRAM, SCHOOL_DISTRICT, MID_OHIO_PRIMARY_CONTACT_FIRST, MID_OHIO_PRIMARY_CONTACT_LAST, ADDRESS, ACTIVE, START_DATE, CALENDER_ID, NUMBER_OF_KIDS_SERVED, NUMBER_OF_VOLUNTEERS_ENLISTED, SITE_WITH_ALLERGIES, DROP_OFF_AREA_DESCRIPTION, DISTRIBUTION_AREA_DESCRIPTION) VALUES(1, 'Westerville North', 'Jill', 'Thompson', '614-888-8828', 'wecouldcodeot@gmail.com', 'Phil', 'Stevenson', 'Franklin County', 'Westerville School District','Reuben', 'Redman','123 Fake St.', true, '3/28/2017', 5, 12, 5, false, 'Drop of area is near the gymnasisum doors in the back of the building', 'We will pack the food in the office room next to the nurses office and hand them out there')

INSERT INTO FOODSITE(ID, PROGRAM_NAME, SITE_COORDINATOR_FIRST_NAME, SITE_COORDINATOR_LAST_NAME, PHONE_NUMBER, E_MAIL, EXECUTIVE_DIRECTOR_FIRST, EXECUTIVE_DIRECTOR_LAST, COUNTY_OF_PROGRAM, SCHOOL_DISTRICT, MID_OHIO_PRIMARY_CONTACT_FIRST, MID_OHIO_PRIMARY_CONTACT_LAST, ADDRESS, ACTIVE, START_DATE, CALENDER_ID, NUMBER_OF_KIDS_SERVED, NUMBER_OF_VOLUNTEERS_ENLISTED, SITE_WITH_ALLERGIES, DROP_OFF_AREA_DESCRIPTION, DISTRIBUTION_AREA_DESCRIPTION) VALUES(1, 'Westerville South', 'Bill', 'Stevens', '614-222-8828', 'microsoft@gmail.com', 'Lil', 'Clarkson', 'Delaware County' , 'Westerville School District', 'Chester', 'Smith', '321 Real St.', false, '1/2/2011', 2, 1, 2, true, 'Drop off is near the principals office in the front', 'Food will be packed and distributed at the front office')

//Student SQL

INSERT INTO STUDENT(student_id, first_name, last_name, age, grade, teacher_name, ppl_in_house, age_0to5, age_6to11, age_12to17, age_18to59, age_60up, allergies, frl, parent_permission, status) VALUES(123456,'John', 'Smith', 7, 2, 'Mrs. Clark', 4, 1, 1, 0, 2, 0, 'peanut', 'yes', 'yes', 'enrolled' )

//Volunteer SQL

INSERT INTO VOLUNTEER (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,GENDER,AGE_RANGE,STREET_ADDRESS,CITY,STATE,ZIP,HOME_PHONE_NUMBER,WORK_PHONE_NUMBER,E_MAIL,) VALUES (1.'Tom', 'King', '01/01/1980','Male','Under 21','12 main st','columbus'.'OH','43213','614-222-9999','614-537-0000','Tom@yahoo.com');

INSERT INTO VOLUNTEER (ID,FIRST_NAME,LAST_NAME,DATE_OF_BIRTH,GENDER,AGE_RANGE,STREET_ADDRESS,CITY,STATE,ZIP,HOME_PHONE_NUMBER,WORK_PHONE_NUMBER,E_MAIL,) VALUES (2.'Mary', 'love', '01/01/1959','Male','21-61','199 main st','columbus'.'OH','43213','614-222-2222','614-337-0000','Tom@yahoo.com');
