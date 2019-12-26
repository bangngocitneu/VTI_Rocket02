-- xoa csdl neu ton tai
DROP DATABASE IF EXISTS Employee; 	
-- tao csdl moi		
CREATE DATABASE IF NOT EXISTS Employee;		
-- su dung csdl moi tao
USE Employee;												
-- xoa bang neu ton tai
DROP TABLE IF EXISTS 	Department ;
-- tao bang					
CREATE TABLE 			Department 							
(
	DepartmentNumber 	TINYINT AUTO_INCREMENT PRIMARY KEY,
    DepartmentName		VARCHAR(30) NOT NULL
);
INSERT INTO Department	(DepartmentName)
VALUES 					("Hanh Chinh"),
						("Tong Hop"),
                        ("Ke Toan"),
                        ("An Ninh"),
                        ("Nhan Su"),
                        ("An"),
                        ("Hoc Tap"),
                        ("Gym"),
                        ("Su Kien"),
                        ("Bao Hiem");

DROP TABLE IF EXISTS 	Employee_Table  ;						
CREATE TABLE 			Employee_Table 
(
	EmployeeNumber		TINYINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeName		VARCHAR(30) NOT NULL,
    DepartmentNumber	TINYINT,
    FOREIGN KEY (DepartmentNumber) REFERENCES Department(DepartmentNumber)
); 
INSERT INTO 	Employee_Table  (EmployeeName,			DepartmentNumber)
VALUES							("Nguyen Thi Ngoc",				1		),
								("Nguyen Thi Van",				2		),
                                ("Nguyen Thi Linh",				2		),
                                ("Nguyen Thi Hoa",				4		),
                                ("Nguyen Van Nam",				4		),
                                ("Nguyen Van Chien",			6		),
                                ("Nguyen Van Tuan",				4		),
                                ("Nguyen Thuy Linh",			4		),
                                ("Nguyen Thuy Ngoc",			2		),
                                ("Nguyen Hong Ngoc",			2		);


DROP TABLE IF EXISTS 		Employee_Skill_Table  ;						
CREATE TABLE 				Employee_Skill_Table  
(
	EmployeeNumber		TINYINT,
    SkillCode			VARCHAR(10),
	DateRegistered		DATE,
    FOREIGN KEY (EmployeeNumber) REFERENCES Employee_Table(EmployeeNumber)
);
INSERT INTO 	Employee_Skill_Table (EmployeeNumber,	SkillCode,	DateRegistered)
VALUES								 (		5		,	"JAVA"	 ,	'2005-01-20'),
									 (		1		,	"PHP"	 ,	'2006-02-21'),
									 (		2		,	"C"	 	 ,	'2004-01-21'),
                                     (		3		,	"JAVA"	 ,	'2005-08-20'),
                                     (		3		,	"PHP"	 ,	'2004-10-18'),
									 (		5		,	"C"	 	 ,	'2003-12-22'),
                                     (		1		,	"C"	 	 ,	'2005-03-25'),
									 (		2		,	"PHP"	 ,	'2005-01-26'),
                                     (		4		,	"PHP"	 ,	'2005-11-28');
                                    
	-- CAU 3
SELECT		E.EmployeeNumber,EmployeeName, SkillCode AS Skill
FROM		Employee_Table AS E 
JOIN 		Employee_Skill_Table AS S 	ON		E.EmployeeNumber = S.EmployeeNumber 
WHERE 		SkillCode = "JAVA";
-- CAU 4
SELECT 		D.DepartmentNumber,DepartmentName
FROM		Department AS D
JOIN		Employee_Table AS E ON D.DepartmentNumber = E.DepartmentNumber
GROUP BY(D.DepartmentNumber)
HAVING 		COUNT(E.DepartmentNumber) > 3;
-- CAU 5
SELECT		D.DepartmentNumber,DepartmentName, GROUP_CONCAT(EmployeeName) 
FROM		Department AS D
JOIN		Employee_Table AS E	ON D.DepartmentNumber = E.DepartmentNumber
GROUP BY(D.DepartmentNumber);
-- CAU 6
SELECT		E.EmployeeNumber,EmployeeName,GROUP_CONCAT(SkillCode) AS Skill 
FROM		Employee_Table  AS E
JOIN		Employee_Skill_Table AS S ON E.EmployeeNumber = S.EmployeeNumber
GROUP BY(S.EmployeeNumber)
HAVING		COUNT(S.SkillCode) > 1;


