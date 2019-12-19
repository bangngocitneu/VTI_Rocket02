-- E1 
DROP DATABASE IF EXISTS fresher; 							-- xoa csdl neu ton tai
CREATE DATABASE IF NOT EXISTS fresher;						-- tao csdl moi
USE fresher;												-- su dung csdl moi tao
DROP TABLE IF EXISTS 		trainee;						-- xoa bang neu ton tai
CREATE TABLE 				trainee							-- tao bang moi
(
		TraineeID 			TINYINT AUTO_INCREMENT PRIMARY KEY,
		Full_Name 			VARCHAR(30) NOT NULL,
		Birth_Date 			DATE		NOT NULL,
		Gender 				ENUM("Male","Female","Unknown"),
		ET_IQ 				TINYINT 	NOT NULL,
		ET_Gmath			TINYINT 	NOT NULL,
		Training_Class		CHAR(10) 	NOT NULL,
		ET_English			TINYINT 	NOT NULL
);		
ALTER TABLE TRAINEE ADD VTI_Account CHAR(10) NOT NULL UNIQUE;

-- Assignment3 add 10 records 
INSERT INTO trainee (TraineeID, Full_Name,		 Birth_Date, 	Gender, 	ET_IQ, ET_Gmath, Training_Class, ET_English 	, VTI_Account) 
VALUES			
					(1,		"Nguyen Thi Ngoc",   '1998-09-01',	"Female",	8,		7,		"RK01",			 20,			"ngocnguyen"),
					(		"Nguyen Le Minh",	 '1999-12-16',	"Male",		20,		18,		"RK01",			 40,			"minhle"),
					(		"Nguyen Van Anh",	 '1997-11-23',	"Female",	9,		9,		"RK02",			 30,			"vananh"),
					(		"Nguyen Khanh Ngoc", '1998-10-24',	"Female",	10,		10,		"RK01",			 35,			"khanhngoc"),
					(		"Nguyen Dang Khoa",  '1998-10-25',	"Male",		9,		7,		"RK01",			 25,			"dangkhoa"),
					(		"Nguyen Thi Van",    '1999-01-26',	"Female",	8,		8,		"RK01",			 10,			"van"),
					(		"Nguyen Thi Thuong", '1998-02-20',	"Female",	25,		20,		"RK02",			 30,			"thuong"),
					(		"Nguyen Thuy Linh",  '1997-12-15',	"Female",	9,		10,		"RK01",	 		 15,			"linh"),
					(		"Nguyen Quoc Dat",   '1998-12-13',	"Male",		9,		8,		"RK02",			 17,			"dat"),
					(		"Nguyen Tuan Vu",    '1999-04-12',	"Male",		6,		8,		"RK01",			 18,		 		"tuanvu");
-- E2
-- lay ra tat ca thuc tap sinh vuot qua bai test dau vao nhom theo thang sinh khac nhau
SELECT 		TraineeID,Full_Name,Birth_Date,Gender,ET_IQ, ET_Gmath, Training_Class 
FROM   		trainee 
GROUP BY	TraineeID			-- PHAI SUA LAI NHA
HAVING 		MONTH(Birth_Date) ;

-- thuc tap sinh co ten dai nhat
SELECT 		TraineeID,Full_Name,Birth_Date,Gender,ET_IQ, ET_Gmath, Training_Class, LENGTH(Full_Name)
FROM		trainee 
WHERE		
			LENGTH(Full_Name) =  (SELECT MAX(LENGTH(Full_Name)) FROM trainee );

-- thuc tap sinh pass test dau vao thoa man dieu kien
SELECT 		TraineeID,Full_Name,Birth_Date,Gender,ET_IQ, ET_Gmath, Training_Class
FROM   		trainee 
WHERE  		ET_IQ + ET_Gmath >=20 AND 
			ET_IQ>=8 AND
            ET_Gmath>=8 AND
            ET_English>=18;
            
-- xoa tts
DELETE		
FROM 	trainee
WHERE	TraineeID = 3;

-- update
UPDATE  trainee
SET 
		Training_Class = "RK02"
WHERE 	TraineeID = 5;
            
            
            
            
            
            
            
DROP TABLE IF EXISTS 		exercise2;
CREATE TABLE 		 		exercise2
(
		ID 					MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
		Name_				VARCHAR(30) NOT NULL,
		Code_				CHAR(5)     NOT NULL,
		ModifiedDate		DATETIME    NOT NULL
);
-- E3
DROP TABLE IF EXISTS 		exercise3;
CREATE TABLE 		 		exercise3
(
		ID 					MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
		Name_				VARCHAR(30) NOT NULL,
		BirthDate			DATE NOT NULL,
		Gender				BIT NULL,
		IsDeletedFlag		BIT 
);

