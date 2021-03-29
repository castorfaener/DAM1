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
        RAISE_APPLICATION_ERROR(-20203, 'Hay que introducir un valor para oficina');-- Lanza una excepción
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
        RAISE_APPLICATION_ERROR(-20203, 'Hay que introducir un valor para familia');-- Lanza una excepción
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
     	RAISE_APPLICATION_ERROR(-20203, 'Si no existe valor para familia introduce un valor para oficina');-- Lanza una excepción
    ELSE IF (:new.familia = NOT NULL) THEN
    	:new.oficina = NULL;
        RAISE_APPLICATION_ERROR(-20203, 'Si ya existe valor para familia no puedes introducir un valor para oficina');-- Lanza una excepción
     END IF;
END;