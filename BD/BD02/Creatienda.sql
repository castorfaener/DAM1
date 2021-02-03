
--Creamos la tabla FAMILIA
CREATE TABLE FAMILIA (
	Codfamilia NUMBER(3) CONSTRAINT fam_co_pk PRIMARY KEY,
	Denofamilia VARCHAR(50) CONSTRAINT fam_de_nn NOT NULL CONSTRAINT fam_de_un UNIQUE);

--Creamos la tabla PRODUCTO
CREATE TABLE PRODUCTO (
	Codproducto NUMBER(5) CONSTRAINT pro_co_pk PRIMARY KEY,
	Denoproducto VARCHAR(20) CONSTRAINT pro_de_nn NOT NULL,
	Descripcion VARCHAR(100),
	PrecioBase NUMBER(8,2) CONSTRAINT pro_pr_nn NOT NULL CONSTRAINT pro_pr_ch CHECK (PrecioBase > 0),
	PorcReposicion NUMBER(3) CONSTRAINT pro_po_ch CHECK (PorcReposicion > 0),
	UnidadesMinimas NUMBER(4) CONSTRAINT pr_un_nn NOT NULL CONSTRAINT pr_un_ch CHECK (UnidadesMinimas >0),
	Codfamilia NUMBER(3) CONSTRAINT pro_co_nn NOT NULL CONSTRAINT pro_co_fk REFERENCES FAMILIA(Codfamilia));

-- Creamos la tabla TIENDA
CREATE TABLE TIENDA (
	Codtienda NUMBER(3) CONSTRAINT tie_co_pk PRIMARY KEY,
	Denotienda VARCHAR(20) CONSTRAINT tie_co_nn NOT NULL,
	Telefono VARCHAR(11),
	Codigopostal VARCHAR(5) CONSTRAINT tie_cod_nn NOT NULL,
	Provincia VARCHAR(5) CONSTRAINT tie_pr_nn NOT NULL);

-- Creamos la tabla STOCK
CREATE TABLE STOCK (
	Codtienda NUMBER(3) CONSTRAINT sto_co_nn NOT NULL CONSTRAINT st_co_fk REFERENCES TIENDA,
	Codproducto NUMBER(5) CONSTRAINT sto_codp_nn NOT NULL CONSTRAINT sto_codp_fk REFERENCES PRODUCTO,
	CONSTRAINT sto_co_pk PRIMARY KEY (Codtienda, Codproducto),
	Unidades NUMBER(6) CONSTRAINT sto_un_nn NOT NULL CONSTRAINT sto_un_ch CHECK(Unidades >= 0));
