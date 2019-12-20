DROP DATABASE IF EXISTS Employee; 							-- xoa csdl neu ton tai
CREATE DATABASE IF NOT EXISTS Employee;						-- tao csdl moi

USE Employee;		
										-- su dung csdl moi tao
DROP TABLE IF EXISTS 		Department ;						-- xoa bang neu ton tai
CREATE TABLE 				Department 
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

DROP TABLE IF EXISTS 		Employee_Table  ;						-- xoa bang neu ton tai
CREATE TABLE 				Employee_Table 
(
	EmployeeNumber		TINYINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeName		VARCHAR(30) NOT NULL,
    DepartmentNumber	TINYINT,
    FOREIGN KEY (DepartmentNumber) REFERENCES Department(DepartmentNumber)
); 
INSERT INTO 	Employee_Table (EmployeeName,			DepartmentNumber)
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
	

DROP TABLE IF EXISTS 		Employee_Skill_Table  ;						-- xoa bang neu ton tai
CREATE TABLE 				Employee_Skill_Table  
(
	EmployeeNumber		TINYINT,
    SkillCode			VARCHAR(10),
	DateRegistered		VARCHAR(20),
    FOREIGN KEY (EmployeeNumber) REFERENCES Employee_Table(EmployeeNumber)
);
INSERT INTO 	Employee_Skill_Table (EmployeeNumber,	SkillCode,	DateRegistered)
VALUES								 (		1		,	"SK01"	 ,	"JAVA"),
									 (		2		,	"SK02"	 ,	"PHP"),
                                     (		3		,	"SK03"	 ,	"PYTHON"),
                                     (		1		,	"SK01"	 ,	"PHP"),
									 (		2		,	"SK02"	 ,	"JAVA"),
                                     (		1		,	"SK01"	 ,	"PYTHON"),
									 (		2		,	"SK02"	 ,	"C"),
                                     (		4		,	"SK04"	 ,	"C");
	-- CAU 3
SELECT		EmployeeName
FROM		Employee_Table AS E 
JOIN 		Employee_Skill_Table AS S 	ON		E.EmployeeNumber = S.EmployeeNumber 
WHERE 		DateRegistered = "JAVA";
-- CAU 4
SELECT 		DepartmentName
FROM		Department AS D
JOIN		Employee_Table AS E ON D.DepartmentNumber = E.DepartmentNumber
GROUP BY(D.DepartmentNumber)
HAVING 		COUNT(E.DepartmentNumber) > 3;
-- CAU 5
SELECT		DepartmentName, EmployeeName 
FROM		Department AS D
JOIN		Employee_Table AS E	ON D.DepartmentNumber = E.DepartmentNumber
GROUP BY(D.DepartmentNumber);
-- CAU 6
SELECT		EmployeeName,JSON_ARRAYAGG(DateRegistered) AS Skill 
FROM		Employee_Table  AS E
JOIN		Employee_Skill_Table AS S ON E.EmployeeNumber = S.EmployeeNumber
GROUP BY(S.SkillCode)
HAVING		COUNT(S.SkillCode) > 1;