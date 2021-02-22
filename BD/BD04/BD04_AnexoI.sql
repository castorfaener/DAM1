CREATE TABLE USUARIOS (
         login         VARCHAR2(15) PRIMARY KEY NOT NULL,  
         password      VARCHAR2(9) NOT NULL, 
         nombre        VARCHAR2(25) NOT NULL,
         apellidos     VARCHAR2(30) NOT NULL,
         direccion     VARCHAR2(30) NOT NULL,
         cp            VARCHAR2(5) NOT NULL, 
         localidad     VARCHAR2(25) NOT NULL,
         provincia     VARCHAR2(25) NOT NULL,
         pais          VARCHAR2(15) NOT NULL, 
         f_nac      DATE,
         f_ing      DATE DEFAULT (sysdate),
         correo     VARCHAR2(25) NOT NULL,
         credito    NUMBER,
         sexo       VARCHAR2(1));

CREATE TABLE JUEGOS(
         codigo        VARCHAR2(15) PRIMARY KEY NOT NULL,  
         nombre        VARCHAR2(15) NOT NULL,
         descripcion   VARCHAR2(200) NOT NULL);

CREATE TABLE PARTIDAS(
         codigo        VARCHAR2(15) PRIMARY KEY NOT NULL,  
         nombre        VARCHAR2(25) NOT NULL,
         estado        VARCHAR2(1) NOT NULL,
         cod_juego     VARCHAR2(15) NOT NULL
                       CONSTRAINT CA_cod_juego REFERENCES JUEGOS(codigo),
         fecha_inicio  DATE, 
         hora_inicio   TIMESTAMP,
         cod_creador   VARCHAR2(15) 
                       CONSTRAINT CA_cod_creador REFERENCES USUARIOS(login));

CREATE TABLE UNEN(
        codigo_partida VARCHAR2(15) NOT NULL
                       CONSTRAINT CA_codigo_partida REFERENCES PARTIDAS(codigo),  
        codigo_usuario VARCHAR2(15) NOT NULL
                       CONSTRAINT CA_codigo_usuario REFERENCES USUARIOS(login),
        CONSTRAINT PK_UNEN primary key (codigo_partida, codigo_usuario));

