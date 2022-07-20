DROP TABLE IF EXISTS Course;
CREATE TABLE Course(
courseId VARCHAR(200) PRIMARY KEY,
courseName VARCHAR(200),
description VARCHAR(255),
startDate DATE,
endDate DATE
);