
--Ejercicio 1


CREATE OR REPLACE TYPE Personal AS OBJECT(
	codigo INTEGER,
	dni VARCHAR2(10),
	nombre VARCHAR2(30),
	apellidos VARCHAR2(30),
	sexo VARCHAR2(1),
	fecha_nac DATE
	) NOT FINAL;

CREATE OR REPLACE TYPE Responsable AS OBJETC UNDER Personal(
	tipo CHAR,
	antiguedad INTEGER
);

CREATE OR REPLACE TYPE Zonas AS OBJECT(
	codigo INTEGER,
	nombre VARCHAR2(20),
	refRespon REF Responsable,
	codigoPostal CHAR(5)
); 

CREATE OR REPLACE TYPE Comercial AS OBJETC UNDER Personal(
	zonaComercial Zonas
);


--Ejercicio 2

CONSTRUCTOR FUNCTION Responsable () RETURN SELF AS RETURN