DROP DATABASE IF EXISTS FinalExam;
CREATE DATABASE IF NOT EXISTS FinalExam;
USE FinalExam;

DROP TABLE IF EXISTS `User`  ;
CREATE TABLE IF NOT EXISTS `User` 
(
	Uid				TINYINT AUTO_INCREMENT PRIMARY KEY,
    firstName		NVARCHAR(30) NOT NULL,
    lastName		NVARCHAR(20) NOT NULL,
    phone			CHAR(15) NOT NULL,
    email			VARCHAR(100) NOT NULL UNIQUE,
    `password`		VARCHAR(12)	NOT NULL		
);

DROP TABLE IF EXISTS Manager  ;
CREATE TABLE IF NOT EXISTS Manager 
(
	`Mid` 			TINYINT AUTO_INCREMENT PRIMARY KEY,
    Uid				TINYINT,
    expInYear 		TINYINT NOT NULL,
    FOREIGN KEY 	(Uid) REFERENCES User(Uid)
);


DROP TABLE IF EXISTS Employee ;
CREATE TABLE IF NOT EXISTS Employee 
(
	Eid 			TINYINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Uid				TINYINT,
    projectName 	VARCHAR(255) NOT NULL,
    proSkill		VARCHAR(100) NOT NULL,
    FOREIGN KEY 	(Uid) REFERENCES User(Uid)
);

INSERT INTO User(firstName   ,lastName,	phone		,email					, `password`)
VALUES 			('Nguyễn Thị','Ngọc'  ,	'0345119480 ' ,'ngocmapb1@gmail.com', "Abc123"	),
				('Nguyễn Thị','Vân'   , '0987468196'  ,'nguyenvan2401@gmail.com',"Bcd123"),
                ('Vũ Tuấn'   ,'Anh'   , '0987468123'  ,'vutuananh2010@gmail.com',"Cde123");


select * from `User`;

 
 