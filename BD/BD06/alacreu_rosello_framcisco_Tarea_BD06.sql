
--ACTIVIDAD 1

CREATE OR REPLACE PROCEDURE CambiarAgentesFamilia(id_FamiliaOrigen agentes.familia%TYPE, id_FamiliaDestino agentes.familia%TYPE)

AS 

--declaramos el cursor explicito
	CURSOR c_Agentes IS SELECT * FROM Agentes WHERE familia = id_FamiliaOrigen;			
	reg_Agentes c_Agentes%ROWTYPE;

--definimos los dos errores
	no_id_FamiliaOrigen EXCEPTION;
	PRAGMA exception_init(no_id_FamiliaOrigen, -20111);					

	Origen_equals_Destino EXCEPTION;
	PRAGMA exception_init(Origen_equals_Destino, -20112);


	Id_FamiliaOrigen agentes.familia%TYPE;
	Id_FamiliaDestino agentes.familia%TYPE;

	AgentesCambiados number(2);


BEGIN


	--verificamos que los codigos origen y destino sean diferentes
	IF Id_FamiliaOrigen = Id_FamiliaDestino THEN

		raise_application_error(-20112, 'El Origen y el destino es el mismo');

	END IF;



	-- verificamos que existan registros con el id_familiaOrigen elegido
	SELECT COUNT (*) INTO AgentesCambiados FROM Agentes WHERE familia = id_FamiliaOrigen;

	IF AgentesCambiados = 0 THEN

		raise_application_error(-20111, 'El Id Familia Origen no coincide con ningun registro');

	END IF;


	--Abrimos el cursor y lo recorremos para cambiar el campo Familia 
	OPEN c_Agentes;

	FETCH c_Agentes INTO reg_Agentes;

	WHILE c_Agentes%FOUND LOOP
		
		c_Agentes.familia := id_FamiliaDestino;

		FETCH c_Agentes INTO reg_Agentes;

	END LOOP;

	CLOSE c_Agentes;

	--Cerramos el cursor y `mostramos por pantalla el resultado

	DBMS_OUTPUT.PUT_LINE('Se han trasladado' || AgentesCambiados || 'agentes de la familia' || id_FamiliaOrigen || 'a la familia' || id_FamiliaDestino);


	END;





-- ACTIVIDAD 2

/*
La longitud de la clave de un agente no puede ser inferior a 6.
*/

CREATE OR REPLACE TRIGGER longitud_clave_agente
BEFORE INSERT OR UPDATE ON agentes
FOR EACH ROW
BEGIN
     IF (LENGHT(:new.familia) < 6) THEN -- Si la longitud de la clave es inferior a 6
          RAISE_APPLICATION_ERROR(-20201, 'La clave tiene que tener al menos 6 carácteres');-- Lanza una excepción
     
     END IF;
END;


/*
La habilidad de un agente debe estar comprendida entre 0 y 9 (ambos inclusive).
Se puede implementar con una restriccion del tipo Check en la creacion de la tabla
*/

CREATE OR REPLACE TRIGGER rango_habilidad_agente				
BEFORE INSERT OR UPDATE ON agentes
FOR EACH ROW
BEGIN
     IF (:new.habilidad < 0 or :new.habilidad > 9) THEN -- Si los dos valores estan fuera del rango
          RAISE_APPLICATION_ERROR(-20202, 'El id de habilidad tiene que estar entre 0 y 9');-- Lanza una excepción
     END IF;
END;

/*
La categoría de un agente sólo puede ser igual a 0, 1 o 2.
Se puede implementar con una restriccion del tipo Check en la creacion de la tabla
*/


CREATE OR REPLACE TRIGGER rango_categoria_agente			
BEFORE INSERT OR UPDATE ON agentes
FOR EACH ROW
BEGIN
     IF (:new.categoria < 0 or :new.categoria > 2) THEN -- Si los dos valores estan fuera del rango
          RAISE_APPLICATION_ERROR(-20203, 'La categoria tiene que estar entre 0 y 2');-- Lanza una excepción
     END IF;
END;


/*
Si un agente tiene categoría 2 no puede pertenecer a ninguna familia y debe pertenecer a una oficina.  

*/


CREATE OR REPLACE TRIGGER agente_categoria2			
BEFORE INSERT OR UPDATE ON agentes
FOR EACH ROW
BEGIN
     IF (:new.categoria = 2) THEN -- Si la categoria es 2
     	:new.familia = NULL;
     	:new.oficina = NOT NULL;
        RAISE_APPLICATION_ERROR(-20204, 'Hay que introducir un valor para oficina');-- Lanza una excepción
     END IF;
END;


/*
Si un agente tiene categoría 1 no puede pertenecer a ninguna oficina y debe pertenecer  a una familia.  

*/


CREATE OR REPLACE TRIGGER agente_categoria2			
BEFORE INSERT OR UPDATE ON agentes
FOR EACH ROW
BEGIN
     IF (:new.categoria = 1) THEN -- Si la categoria es 1
     	:new.familia = NOT NULL;
     	:new.oficina = NULL;
        RAISE_APPLICATION_ERROR(-20205, 'Hay que introducir un valor para familia');-- Lanza una excepción
     END IF;
END;

/*
Todos los agentes deben pertenecer  a una oficina o a una familia pero nunca a ambas a la vez.

*/


CREATE OR REPLACE TRIGGER agente_categoria2			
BEFORE INSERT OR UPDATE ON agentes
FOR EACH ROW
BEGIN
     IF (:new.familia = NULL) THEN -- Si la categoria es 1
     	:new.oficina = NOT NULL;
     	RAISE_APPLICATION_ERROR(-20206, 'Si no existe valor para familia introduce un valor para oficina');-- Lanza una excepción
    ELSE IF (:new.familia = NOT NULL) THEN
    	:new.oficina = NULL;
        RAISE_APPLICATION_ERROR(-20207, 'Si ya existe valor para familia no puedes introducir un valor para oficina');-- Lanza una excepción
     END IF;
END;