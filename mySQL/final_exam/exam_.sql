DROP DATABASE IF EXISTS	FExam;
CREATE DATABASE IF NOT EXISTS FExam;
USE	FExam;
DROP TABLE IF EXISTS STUDENT  ;
CREATE TABLE IF NOT EXISTS STUDENT 
(
	RN		CHAR(10) NOT NULL PRIMARY KEY,
    Name	VARCHAR(30) NOT NULL,
    Age		TINYINT NOT NULL,
    Gender	ENUM('NAM','NU','KXD') NOT NULL,
    CONSTRAINT fk_RN
    FOREIGN KEY (RN)
    REFERENCES StudentSubject (RN) 
    ON DELETE CASCADE 
    
);
INSERT INTO STUDENT(	RN		,Name				,Age	 ,Gender)
VALUES			   (	'SV1'	,'NGUYEN THI NGOC'	,21		 ,'NU'),
				   (	'SV2'	,'NGUYEN THI HUYEN'	,18		 ,'KXD'),
                   (	'SV3'	,'NGUYEN DUY DAT'	,20 	 ,'NAM');
DROP TABLE IF EXISTS SUBJECT  ;
CREATE TABLE IF NOT EXISTS SUBJECT
(
	sID		CHAR(10) NOT NULL PRIMARY KEY, 
    sName	VARCHAR(30) NOT NULL
);
INSERT INTO SUBJECT(	sID		,		sName  )
VALUES			   (	'TH'	,	'TOAN HOC' ),
				   (	'VL'	,	'VAT LY' ),
                   (	'VH'	,	'VAN HOC' ),
                   (	'SH'	,	'SINH HOC' ),
				   (	'HH'	,	'HOA HOC' );
DROP TABLE IF EXISTS StudentSubject  ;
CREATE TABLE IF NOT EXISTS StudentSubject
(
	RN		CHAR(10) NOT NULL ,
    sID		CHAR(10) NOT NULL ,
    Mark	TINYINT  NOT NULL,
    Date	DATE	 NOT NULL,
    PRIMARY KEY (RN, sID)
);
INSERT INTO StudentSubject(	RN		,sID	,Mark	,Date )
VALUES					  (	'SV1'	,'TH'	,9		,'2019-08-10' ),
						  (	'SV1'	,'VL'	,8		,'2019-08-15' ),
						  (	'SV1'	,'HH'	,7		,'2019-08-20' ),
						  (	'SV2'	,'TH'	,9		,'2019-08-10' ),
						  ( 'SV2'	,'VL'	,9		,'2019-08-15' ),
						  (	'SV2'	,'HH'	,10		,'2019-08-20' ),
						  (	'SV3'	,'TH'	,7		,'2019-08-10' ),
						  (	'SV3'	,'VL'	,6		,'2019-08-15' ),
						  (	'SV3'	,'SH'	,9		,'2019-08-20' );
                          
-- CAU B 
-- a
SELECT	sID, sName
FROM	SUBJECT 
WHERE	sID		NOT IN 		( SELECT	sID
							  FROM		StudentSubject);
-- b
SELECT	sID, COUNT(Mark)
FROM	StudentSubject
GROUP BY sID
HAVING	COUNT(Mark) >=2 ;
-- CAU c 
CREATE VIEW StudentInfo
AS	
SELECT	S.RN,SB.sID,Name, Age, Gender, GROUP_CONCAT(sName,',', Mark,',', Date)
FROM	STUDENT AS S
JOIN	StudentSubject AS SS 	ON S.RN   = SS.RN
JOIN	SUBJECT 	   AS SB	ON SS.sID = SB.sID
GROUP BY S.RN;
SELECT	* FROM StudentInfo;
-- CAU D 
-- a
DROP	TRIGGER	IF	EXISTS	CasUpdate;
DELIMITER $$
CREATE	TRIGGER	CasUpdate
BEFORE UPDATE ON	STUDENT
FOR	EACH ROW
BEGIN
	
END $$
DELIMITER ;	
-- b
DROP	TRIGGER	IF	EXISTS	casDel;
DELIMITER $$
CREATE	TRIGGER	casDel
AFTER DELETE ON	STUDENT
FOR	EACH ROW
BEGIN
	
END $$
DELIMITER ;	
-- CAU E 
DELIMITER $$
CREATE	PROCEDURE	Delete_Student	
( 
	Student_name	VARCHAR(30),
	Mark TINYINT
)
BEGIN
	
END
DELIMITER ;
