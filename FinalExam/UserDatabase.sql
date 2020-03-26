DROP DATABASE IF EXISTS user;
CREATE DATABASE IF NOT EXISTS user;
USE user;

DROP TABLE IF EXISTS Manager ;
CREATE TABLE IF NOT EXISTS Manager 
(
	id				TINYINT AUTO_INCREMENT PRIMARY KEY,
    firstName		NVARCHAR(30) NOT NULL,
    lastName		NVARCHAR(20) NOT NULL,
    phone			CHAR(15) NOT NULL,
    email			VARCHAR(100) NOT NULL,
    expInYear 		TINYINT		 NOT NULL
);

DROP TABLE IF EXISTS Employee ;
CREATE TABLE IF NOT EXISTS Employee 
(
	id				TINYINT AUTO_INCREMENT PRIMARY KEY,
    firstName		NVARCHAR(30) NOT NULL,
    lastName		NVARCHAR(20) NOT NULL,
    phone			CHAR(15) NOT NULL,
    email			VARCHAR(100) NOT NULL,
    projectName 	VARCHAR(100) NOT NULL,
    proSkil			VARCHAR(100) NOT NULL
);

INSERT INTO Manager(firstName   ,lastName,	phone		,email					,expInYear)
VALUES 			   ("Nguyễn Thị","Ngọc"  ,	0345119480  ,"ngocmapb1@gmail.com"	,3       );
INSERT INTO Employee(firstName   ,lastName,	phone		,email					,projectName  ,proSkil)
VALUES				("Nguyễn Thị","Vân"  , 0987468196	,"nguyenvan2401@gmail.com", "Quản lí User", "Lập trình");
 -- select * from Manager;
 -- select * from Employee;
 
 