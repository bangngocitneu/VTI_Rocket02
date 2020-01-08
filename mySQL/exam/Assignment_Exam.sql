DROP DATABASE IF EXISTS	Exam;
CREATE DATABASE IF NOT EXISTS Exam;
USE	Exam;

DROP TABLE IF EXISTS CUSTOMER  ;
CREATE TABLE IF NOT EXISTS CUSTOMER 
(
	CustomerID		TINYINT		AUTO_INCREMENT	NOT NULL PRIMARY KEY,
    Name			VARCHAR(30) NOT NULL,
    Phone			CHAR(10) 	NOT NULL,
    Email			VARCHAR(15)	NOT NULL,
    Address			VARCHAR(50)	NOT NULL,
    Note			TEXT		NOT NULL
);
INSERT INTO CUSTOMER(	Name,			Phone,	Email,	Address,	Note)
VALUES				('NGUYEN THI NGOC', )
