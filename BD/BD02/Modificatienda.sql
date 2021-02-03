/* 	Ejercicio 2 BD02
	Apartado A



    Añadir a la tabla STOCK

        Una columna de tipo fecha llamada FechaUltimaEntrada que por defecto tome el valor de la fecha actual.

        Una columna llamada Beneficio que contendrá el tipo de porcentaje de beneficio que esa tienda aplica en ese producto. Se debe controlar que el valor que almacene sea 1,2, 3, 4 o 5.

*/

ALTER TABLE STOCK ADD(
	FechaUltimaEntrada DATE DEFAULT SYSDATE,
	Beneficio NUMBER(1) CONSTRAINT st_ben_ch CHECK(Beneficio BETWEEN 1 AND 5));    


/*	 

    En la tabla PRODUCTO

        Eliminar de la tabla producto la columna Descripción.

        Añadir una columna llamada perecedero que únicamente acepte los valores: S o N.

        Modificar el tamaño de la columna Denoproducto a 50.
*/

ALTER TABLE PRODUCTO DROP COLUMN Descripcion;																-- ERROR No deja eliminarla por permisos de usuario SYS

ALTER TABLE PRODUCTO ADD 
	perecedero CHAR(1) CONSTRAINT pro_per_ch CHECK(perecedero IN('S','N'));

ALTER TABLE PRODUCTO MODIFY
	Denoproducto VARCHAR(50);


/*

    En la tabla FAMILIA

        Añadir una columna llamada IVA, que represente el porcentaje de IVA y únicamente pueda contener los valores 21,10,ó 4.
*/

ALTER TABLE FAMILIA ADD 
	IVA NUMBER(2) CONSTRAINT fam_iva_ch CHECK(IVA IN ('4','10','21'));

/*	

    En la tabla tienda

        La empresa desea restringir el número de tiendas con las que trabaja, de forma que no pueda haber más de una tienda en una misma zona (la zona se identifica por el código postal). Definir mediante DDL las restricciones necesarias para que se cumpla en el campo correspondiente..
*/

ALTER TABLE TIENDA ADD CONSTRAINT tie_pos_un UNIQUE(Codigopostal);				


/*	
	Apartado B: Renombra la tabla STOCK por PRODXTIENDAS.
*/

RENAME STOCK TO PRODXTIENDAS;

/*
	Apartado C: Elimina la tabla FAMILIA y su contenido si lo tuviera.
*/

DROP TABLE FAMILIA CASCADE CONSTRAINTS;

/*
	Apartado D: Crea un usuario llamado C##INVITADO siguiendo los pasos de la unidad 1 y dale todos los privilegios sobre la tabla PRODUCTO.
*/

CREATE USER C##INVITADO IDENTIFIED BY MyPassword;
GRANT ALL PRIVILEGES ON PRODUCTO TO C##INVITADO;


/*
	Apartado E: Retira los permisos de modificar la estructura de la tabla y borrar contenido de la tabla PRODUCTO al usuario anterior.
*/

REVOKE DELETE, ALTER ON PRODUCTO FROM C##INVITADO;

