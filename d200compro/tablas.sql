/* TABLAS DE LA APLICACIÓN COMPRO.
Correr este archivo seleccionando la conexión llamada sample.
 */
/* Simple */
CREATE TABLE CATEGORIA (
  CAT_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
  CAT_NOMBRE VARCHAR(255) NOT NULL,
  VERSION INT, /* Requerido para transacciones de JPA. */
  UPPER_NOMBRE VARCHAR(255), /* Requerido para ORDER BY de JPA. */
  CONSTRAINT CAT_PK PRIMARY KEY (CAT_ID),
  CONSTRAINT CAT_NOUN UNIQUE (CAT_NOMBRE),
  CONSTRAINT CAT_NOCH CHECK (CAT_NOMBRE <> '')
);
/* Muchos a Muchos, Seguridad */
CREATE TABLE USUARIO (
  USU_ID VARCHAR(16) NOT NULL,
  USU_CONTRA VARCHAR(100) NOT NULL,
  USU_NOMBRE VARCHAR(255)NOT NULL,
  VERSION INT, /* Requerido para transacciones de JPA. */
  UPPER_ID VARCHAR(255), /* Requerido para ORDER BY de JPA. */
  CONSTRAINT USU_PK PRIMARY KEY (USU_ID),
  CONSTRAINT USU_IDCH CHECK (LENGTH(USU_ID) >= 5),
  CONSTRAINT USU_COCH CHECK (USU_CONTRA <> ''),
  CONSTRAINT USU_NOCH CHECK (USU_NOMBRE <> '')
);
CREATE TABLE ROL (
  ROL_ID VARCHAR(255) NOT NULL,
  ROL_DESCRIPCION VARCHAR(255) NOT NULL,
  VERSION INT, /* Requerido para transacciones de JPA. */
  UPPER_ID VARCHAR(255), /* Requerido para ORDER BY de JPA. */
  CONSTRAINT ROL_PK PRIMARY KEY (ROL_ID)
);
CREATE TABLE USUARIO_ROL (
  USU_ID VARCHAR(16) NOT NULL,
  ROL_ID VARCHAR(255) NOT NULL,
  CONSTRAINT UR_PK PRIMARY KEY (USU_ID, ROL_ID),
  CONSTRAINT UR_USU FOREIGN KEY (USU_ID) REFERENCES USUARIO(USU_ID),
  CONSTRAINT UR_ROL FOREIGN KEY (ROL_ID) REFERENCES ROL(ROL_ID)
);
/* Herencia, A Uno, Fechas */
CREATE TABLE CLIENTE (
  USU_ID VARCHAR(16),
  CLI_NACIMIENTO TIMESTAMP NOT NULL, /* Pregunta de rescate. */
  CLI_HORA_FAV TIMESTAMP NOT NULL, /* Pregunta de rescate. */
  VNT_ACT_ID BIGINT NOT NULL,
  VERSION INT, /* Requerido para transacciones de JPA. */
  UPPER_ID VARCHAR(255), /* Requerido para ORDER BY de JPA. */
  CONSTRAINT CLI_PK PRIMARY KEY (USU_ID),
  CONSTRAINT CLI_VAUN UNIQUE (VNT_ACT_ID),
  CONSTRAINT CLI_USU FOREIGN KEY (USU_ID) REFERENCES USUARIO(USU_ID)
);
/* Multimedia */
CREATE TABLE ARCHIVO (
  ARCH_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
  ARCH_BYTES BLOB NOT NULL,
  VERSION INT, /* Requerido para transacciones de JPA. */
  CONSTRAINT ARC_PK PRIMARY KEY (ARCH_ID)
);
/* Muchos a una Categoria, Uno a un archivo */
CREATE TABLE PRODUCTO (
  PRD_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
  PRD_NOMBRE VARCHAR(255) NOT NULL,
  PRD_EXISTENCIAS BIGINT NOT NULL,
  PRD_PRECIO DECIMAL(11,2) NOT NULL,
  CAT_ID BIGINT NOT NULL,
  IMAGEN_ID BIGINT NOT NULL,
  VERSION INT, /* Requerido para transacciones de JPA. */
  UPPER_NOMBRE VARCHAR(255), /* Requerido para ORDER BY de JPA. */
  CONSTRAINT PRD_PK PRIMARY KEY (PRD_ID),
  CONSTRAINT PRD_NOCH CHECK (PRD_NOMBRE <> ''),
  CONSTRAINT PRD_NOUN UNIQUE (PRD_NOMBRE),
  CONSTRAINT PRD_CAT FOREIGN KEY (CAT_ID) REFERENCES CATEGORIA(CAT_ID),
  CONSTRAINT PRD_IMUN UNIQUE (IMAGEN_ID),
  CONSTRAINT PRD_IMG FOREIGN KEY (IMAGEN_ID) REFERENCES ARCHIVO(ARCH_ID)
);
CREATE TABLE VENTA (
  VNT_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
  VNT_REGISTRO TIMESTAMP,
  VNT_ENT_TS TIMESTAMP,
  VNT_ENT_DIR VARCHAR(255),
  USU_ID VARCHAR(16),
  VERSION INT, /* Requerido para transacciones de JPA. */
  CONSTRAINT VNT_PK PRIMARY KEY (VNT_ID),
  CONSTRAINT VNT_DICH CHECK (VNT_ENT_DIR <> ''),
  CONSTRAINT VNT_CLI FOREIGN KEY (USU_ID) REFERENCES CLIENTE(USU_ID)
);
/* Entidad Asociativa */
CREATE TABLE DETALLE_VENTA (
  VNT_ID BIGINT NOT NULL,
  PRD_ID BIGINT NOT NULL,
  DVT_CANTIDAD BIGINT NOT NULL,
  DVT_PRECIO DECIMAL(11,2) NOT NULL,
  VERSION INT, /* Requerido para transacciones de JPA. */
  CONSTRAINT DVT_PK PRIMARY KEY (VNT_ID, PRD_ID),
  CONSTRAINT DVT_VNT FOREIGN KEY (VNT_ID) REFERENCES VENTA(VNT_ID),
  CONSTRAINT DVT_PRD FOREIGN KEY (PRD_ID) REFERENCES PRODUCTO(PRD_ID)
);
ALTER TABLE CLIENTE ADD CONSTRAINT CLI_VAC
  FOREIGN KEY (VNT_ACT_ID) REFERENCES VENTA(VNT_ID);
--ALTER TABLE CLIENTE DROP CONSTRAINT CLI_VAC