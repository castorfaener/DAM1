
--Creamos la tabla FAMILIA
CREATE TABLE FAMILIA (
	Codfamilia NUMBER(3) CONSTRAINT fa_co_pk PRIMARY KEY,
	Denofamilia VARCHAR(50) CONSTRAINT fa_de_nn NOT NULL CONSTRAINT fa_de_un UNIQUE);

--Creamos la tabla PRODUCTO
CREATE TABLE PRODUCTO (
	Codproducto NUMBER(5) CONSTRAINT pr_co_pk PRIMARY KEY,
	Denoproducto VARCHAR(20) CONSTRAINT pr_de_nn NOT NULL,
	Descripcion VARCHAR(100),
	Preciobase NUMBER(8,2) CONSTRAINT pr_pr_nn NOT NULL CONSTRAINT pr_pr_ch CHECK (Preciobase > 0),
	Porcreposicion NUMBER(3) CONSTRAINT pr_po_ch CHECK (Porcreposicion > 0),
	UnidadesMinimas NUMBER(4) CONSTRAINT pr_un_nn NOT NULL CONSTRAINT pr_un_ch CHECK (UnidadesMinimas >0),
	Codfamilia NUMBER(3) CONSTRAINT pr_co_nn NOT NULL CONSTRAINT pr_co_fk REFERENCES FAMILIA(Codfamilia));

-- Creamos la tabla TIENDA
CREATE TABLE TIENDA (
	Codtienda NUMBER(3) CONSTRAINT ti_co_pk PRIMARY KEY,
	Denotienda VARCHAR(20) CONSTRAINT ti_co_nn NOT NULL,
	Telefono VARCHAR(11),
	Codigopostal VARCHAR(5) CONSTRAINT ti_cod_nn NOT NULL,
	Provincia VARCHAR(5) CONSTRAINT ti_pr_nn NOT NULL);
