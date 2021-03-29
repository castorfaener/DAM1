


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





