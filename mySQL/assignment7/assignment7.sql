DROP DATABASE IF EXISTS	Project;
CREATE DATABASE IF NOT EXISTS Project;
USE	Project;

DROP TABLE IF EXISTS Employee  ;
CREATE TABLE IF NOT EXISTS Employee 
(
	EmployeeID					CHAR(10) NOT NULL PRIMARY KEY,
    EmployeeLastName			VARCHAR(20) NOT NULL,
    EmployeeFistName 			VARCHAR(10) NOT NULL,
    EmployeeHireDate 			DATE NOT NULL,
    EmployeeStatus 				BIT,
    SupervisorID				CHAR(10),
    SocialSecurityNumber		CHAR(15) NOT NULL,
	FOREIGN KEY	(SupervisorID)	REFERENCES	Employee(EmployeeID)
); 
INSERT INTO Employee(EmployeeID, EmployeeLastName, EmployeeFistName, EmployeeHireDate, EmployeeStatus,SupervisorID, SocialSecurityNumber)
VALUES				(	'NV1'  , 'THI NGOC'	     , 'NGUYEN'        , '2003-12-12'	 , 	0            ,	NULL	  , 'AB12334567890'	 ),
					(	'NV2'  , 'THU HUONG'	 , 'LE'            , '2002-12-25'	 , 	1            ,	'NV1' 	  , 'AD12334567890'	 ),
                    (	'NV3'  , 'LE MINH'	     , 'NGUYEN'        , '2005-12-15'	 , 	0            ,  'NV1'	  , 'AC12334567890'	 );
DROP TABLE IF EXISTS Projects ;
CREATE TABLE IF NOT EXISTS Projects 
(
	ProjectID 					CHAR(10) NOT NULL PRIMARY KEY,
    EmployeeID 					CHAR(10) NOT NULL,
    ProjectName 				VARCHAR(50) NOT NULL,
    ProjectStartDate			DATE NOT NULL,
    ProjectDescription			TEXT NOT NULL,
    ProjectDetailt				TEXT NOT NULL,
    ProjectCompletedOn			DATE NOT NULL,
	FOREIGN KEY (EmployeeID)	REFERENCES	 Employee(EmployeeID)
);
INSERT INTO Projects(ProjectID, EmployeeID ,ProjectName ,ProjectStartDate ,ProjectDescription, ProjectDetailt,		 ProjectCompletedOn)
VALUES				(	'PR1' , 'NV1'	   , 'JAVA'     ,'2018-01-10'	  ,'CHUA HOAN THANH' ,'CHI TIET PROJECT 1',  '2020-12-27'),
					(	'PR2' , 'NV2'	   , 'PHP'      ,'2017-02-20'	  ,'HOAN THANH'      ,'CHI TIET PROJECT 2',  '2017-03-20'),
					(	'PR3' , 'NV3'	   , 'PYTHON'   ,'2016-03-15'	  ,'HOAN THANH'      ,'CHI TIET PROJECT 3',  '2017-12-10');
                    
DROP TABLE IF EXISTS Project_Modules;
CREATE TABLE IF NOT EXISTS Project_Modules
(
	ModuleID					TINYINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    ProjectID					CHAR(10) NOT NULL,
    EmployeeID 					CHAR(10) NOT NULL,
    ProjectModulesDate 			DATE NOT NULL,
    ProjectModulesCompledOn		DATE NOT NULL,
    ProjectModulesDescription	TEXT NOT NULL,
	FOREIGN KEY (ProjectID)		REFERENCES  	Projects(ProjectID),
	FOREIGN KEY (EmployeeID)	REFERENCES	    Employee(EmployeeID)
);
INSERT INTO Project_Modules	(	ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompledOn, ProjectModulesDescription)
VALUES						(		'PR1'    , 'NV1'     , '2019-12-28'		 , '2020-12-27'			  , 'hoan thanh truoc ke hoach'),
							(		'PR1'    , 'NV1'     , '2019-10-20'		 , '2020-12-15'			  , 'hoan thanh truoc ke hoach'),
                            (		'PR2'    , 'NV2'     , '2017-03-15'		 , '2017-03-20'			  , 'hoan thanh sau ke hoach'),
                            (		'PR2'    , 'NV2'     , '2017-03-05'		 , '2017-03-10'			  , 'hoan thanh sau ke hoach'),
                            (		'PR3'    , 'NV3'     , '2017-12-05'		 , '2017-12-05'			  , 'hoan thanh dung ke hoach'),
                            (		'PR3'    , 'NV3'     , '2017-12-10'		 , '2017-12-10'			  , 'hoan thanh dung ke hoach');
DROP TABLE IF EXISTS Work_Done;
CREATE TABLE IF NOT EXISTS Work_Done
(
	WorkDoneID 					TINYINT	AUTO_INCREMENT NOT NULL PRIMARY KEY,
    EmployeeID 					CHAR(10) NOT NULL,
    ModuleID 					TINYINT NOT NULL,
    WorkDoneDate 				DATE ,
    WorkDoneDescription			TEXT NOT NULL,
    WorkDoneStatus				BIT NOT NULL,
	FOREIGN KEY (ModuleID)		REFERENCES	 Project_Modules(ModuleID),
    FOREIGN KEY (EmployeeID)	REFERENCES	 Employee(EmployeeID)
);
INSERT INTO Work_Done(EmployeeID, ModuleID, WorkDoneDate ,WorkDoneDescription, WorkDoneStatus)
VALUES				 ('NV1'		,  1      , NULL         ,'CHUA HOAN THANH'  ,	0),
					 ('NV2'		,  2      , '2017-03-20' ,'HOAN THANH'       ,	1),
					 ('NV3'		,  3      , '2017-12-10' ,'HOAN THANH     '  ,	1);


-- CAU b
DELIMITER $$
CREATE	PROCEDURE	Proc_Remove()
BEGIN
	DROP TABLE IF EXISTS Id_project_rm;
	CREATE	TEMPORARY TABLE	Id_project_rm
    (
		ProjectID	CHAR(10)	PRIMARY	KEY
	);
    INSERT INTO	Id_project_rm 
	SELECT	ProjectID
    FROM	Projects
    WHERE	ProjectID IN	(	SELECT	ProjectID
								WHERE	SUBDATE(CURDATE(),INTERVAL 90 DAY) >= ProjectCompletedOn);
    SELECT	* FROM Id_project_rm;
    
    DROP TABLE IF EXISTS Id_module_rm;
	CREATE	TEMPORARY TABLE	Id_module_rm
    (
		ModuleID	CHAR(10)	PRIMARY	KEY
	);
    INSERT INTO	Id_module_rm 
	SELECT	ModuleID
    FROM	Project_Modules
    WHERE	ProjectID IN	(	SELECT	ProjectID 
								FROM	Id_project_rm);
    SELECT	* FROM Id_module_rm;

    DROP TABLE IF EXISTS Id_workdone_rm;
	CREATE	TEMPORARY TABLE	Id_workdone_rm
    (
		WorkDoneID	CHAR(10)	PRIMARY	KEY
	);
    INSERT INTO	Id_workdone_rm 
	SELECT	WorkDoneID
    FROM	Work_Done
    WHERE	ModuleID IN	(	SELECT	ModuleID 
							FROM	Id_module_rm);
    SELECT	* FROM Id_workdone_rm;
    SELECT 
	(SELECT	COUNT(WorkDoneID)	 FROM	Id_workdone_rm	)	AS Number_workdoneId_rm ,
	(SELECT	COUNT(ModuleID)		 FROM	Id_module_rm	)	AS Number_module_rm ,
	(SELECT	COUNT(ProjectID)	 FROM	Id_project_rm	)	AS Number_project_rm ;
    DELETE	FROM	WorkDoneID	WHERE	WorkDoneID	IN	(	SELECT	*	FROM	Id_workdone_rm);
	DELETE	FROM	ModuleID	WHERE	ModuleID	IN	(	SELECT	*	FROM	Id_module_rm);
    DELETE	FROM	ProjectID	WHERE	ProjectID	IN	(	SELECT	*	FROM	Id_project_rm);
    
END
DELIMITER ;
-- cau c 
DELIMITER $$
CREATE	PROCEDURE	Module_Active()
BEGIN
	SELECT	 ModuleID
	FROM	 Project_Modules
	WHERE	 ProjectModulesCompledOn IS NULL;
END
DELIMITER ;
-- cau d 
DELIMITER $$
CREATE	PROCEDURE	Employee_not_work()
BEGIN
	SELECT	E.EmployeeID 
	FROM	Employee	AS E
	JOIN	Work_Done 	AS WD	ON	 E.EmployeeID = WD.EmployeeID
	WHERE	E.EmployeeID	NOT IN (	SELECT	EmployeeID FROM Work_Done);
END
DELIMITER ;
--  assignment 7 
-- cau 1
DROP	TRIGGER	IF	EXISTS	before_ProjectModules_insert;
DELIMITER $$
CREATE	TRIGGER	before_ProjectModules_insert
BEFORE	INSERT	ON	Project_Modules
FOR	EACH ROW
BEGIN
	DECLARE	Trigger_ProjectStartDate, Trigger_ProjectCompletedOn	DATE;
    SELECT	ProjectStartDate ,ProjectCompletedOn
	INTO	Trigger_ProjectStartDate, Trigger_ProjectCompletedOn
    FROM	Projects
    WHERE	ProjectID = NEW.ProjectID ;
	IF	NEW.ProjectModulesDate  < Trigger_ProjectStartDate
	OR	NEW.ProjectModulesCompledOn  > Trigger_ProjectCompletedOn
    THEN SIGNAL SQLSTATE '45000' 
    SET	MESSAGE_TEXT =' Du lieu khong hop le!';
    END IF;
END $$
DELIMITER ;	

INSERT INTO Projects(ProjectID, EmployeeID ,ProjectName ,ProjectStartDate ,ProjectDescription, ProjectDetailt,		 ProjectCompletedOn)
VALUES				(	'PR4' , 'NV1'	   , 'JAVA'     ,'2017-01-10'	  ,'CHUA HOAN THANH' ,'CHI TIET PROJECT 1',  '2016-12-27');
INSERT INTO Project_Modules	(	ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompledOn, ProjectModulesDescription)
VALUES						(		'PR4'    , 'NV1'     , '2016-12-28'		 , '2020-12-27'			  , 'hoan thanh truoc ke hoach');
INSERT INTO Projects(ProjectID, EmployeeID ,ProjectName ,ProjectStartDate ,ProjectDescription, ProjectDetailt,		 ProjectCompletedOn)
VALUES				(	'PR5' , 'NV1'	   , 'JAVA'     ,'2015-01-10'	  ,'CHUA HOAN THANH' ,'CHI TIET PROJECT 1',  '2016-12-27');
INSERT INTO Project_Modules	(	ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompledOn, ProjectModulesDescription)
VALUES						(		'PR5'    , 'NV1'     , '2016-12-28'		 , '2020-12-27'			  , 'hoan thanh truoc ke hoach');

