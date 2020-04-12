DROP DATABASE IF EXISTS FinalExam;
CREATE DATABASE IF NOT EXISTS FinalExam;
USE FinalExam;

DROP TABLE IF EXISTS User  ;
CREATE TABLE IF NOT EXISTS User 
(
	id				TINYINT AUTO_INCREMENT PRIMARY KEY,
    firstName		NVARCHAR(30) NOT NULL,
    lastName		NVARCHAR(20) NOT NULL,
    phone			CHAR(15) NOT NULL,
    email			VARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS Manager  ;
CREATE TABLE IF NOT EXISTS Manager 
(
    expInYear 		TINYINT NOT NULL
);


DROP TABLE IF EXISTS Employee ;
CREATE TABLE IF NOT EXISTS Employee 
(
    projectName 	VARCHAR(100) NOT NULL,
    proSkil			VARCHAR(100) NOT NULL
);
USE FinalExam;
INSERT INTO User(firstName   ,lastName,	phone		,email					)
VALUES 			('Nguyễn Thị','Ngọc'  ,	'0345119480 ' ,'ngocmapb1@gmail.com'	),
				('Nguyễn Thị','Vân'   , '0987468196'  ,'nguyenvan2401@gmail.com'),
                ('Vũ Tuấn'   ,'Anh'   , '0987468123'  ,'vutuananh2010@gmail.com');

INSERT INTO Manager(expInYear)  
VALUES	(3),(4);

INSERT INTO Employee(projectName  ,proSkil)
VALUES				('Quản lí User', 'Java'),
					('Quản lí giảng đường','PHP');
-- select * from User;
-- select * from Manager;
-- select * from Employee;
 
 