DROP TABLE IF EXISTS Course;
CREATE TABLE Course(
courseId VARCHAR(200) PRIMARY KEY,
courseName VARCHAR(200),
description VARCHAR(250),
startDate DATE,
endDate DATE
);