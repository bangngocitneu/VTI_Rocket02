USE adventureworks;
-- cau 1
SELECT 	P.Name
FROM 	product AS P
WHERE 	ProductSubcategoryID	IN (	SELECT 	ProductSubcategoryID	
										FROM	productSubcategory AS PS
										WHERE	PS.Name = 'Saddles');
-- DUNG JOIN
SELECT	P.Name
FROM	product AS P
JOIN	productSubcategory AS PS ON P.ProductSubcategoryID = PS.ProductSubcategoryID
WHERE	PRC.Name = "Saddles";

-- CAU 2
SELECT 	P.Name
FROM 	product AS P
WHERE 	ProductSubcategoryID	IN (	SELECT 	ProductSubcategoryID	
								FROM	productSubcategory AS PS
								WHERE	PS.Name LIKE "%Bo%");

-- CAU 3
SELECT	P.Name 
FROM	product	AS P
WHERE	ProductSubcategoryID   IN 	(	SELECT 	ProductSubcategoryID
										FROM	productSubcategory AS PS
                                        WHERE	PS.Name = "Touring Bikes" )
							   AND	ListPrice	= (	SELECT	MIN(ListPrice)	
													FROM	product
													WHERE	ProductSubcategoryID   IN 	(	SELECT 	ProductSubcategoryID
																							FROM	productSubcategory AS PS
																							WHERE	PS.Name = "Touring Bikes" ));	
-- 