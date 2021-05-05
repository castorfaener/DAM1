
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

CREATE OR REPLACE TYPE BODY Responsable AS
	CONSTRUCTOR FUNCTION Responsable(codigo INTEGER, nombre VARCHAR2(30), primerApellido VARCHAR2(15), segundoApellido VARCHAR2(15), tipo CHAR) 
		RETURN SELF AS RESULT
	IS
		BEGIN
			SELF.codigo := codigo;
			SELF.nombre := nombre;
			SELF.apellidos := primerApellido || " " || segundoApellido;
			SELF.tipo := tipo;
			RETURN;
		END;
END;


--Ejercicio 3

CREATE OR REPLACE TYPE BODY Responsable AS
	MEMBER PROCEDURE getNombreCompleto IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE(SELF.apellidos || ' ' || SELF.nombre);
	END getNombreCompleto;
END;	


-- Ejercicio 4

CREATE TABLE TablaResponsables (unResponsable Responsable);

DECLARE 
	r2 Responsable;

BEGIN
	INSERT INTO TablaResponsables VALUES (Responsable(5,'51083099F', 'ELENA', 'POSTA LLANOS', 'F', '31/03/1975', 'N', 4));
	r2 := NEW Responsable(6, 'JAVIER', 'JARAMILLO HERNANDEZ', 'C');
	INSERT INTO TablaResponsables VALUES (r2);
END;

-- Ejercicio 5

DECLARE
	TYPE ListaZonas IS VARRAY (10) OF Zonas;
	ListaZonas1 ListaZonas;

BEGIN
	

