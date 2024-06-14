CREATE DATABASE automovilAPI;
USE automovilAPI;


CREATE TABLE marca ( 
id_marca CHAR(100) PRIMARY KEY, 
nombre VARCHAR(100)
) ENGINE=InnoDB;

CREATE TABLE automovil ( 
matricula CHAR(100) PRIMARY KEY, 
marca CHAR(100),
modelo VARCHAR(30),
color VARCHAR(50),
precio FLOAT(10,2),
FOREIGN KEY (marca) REFERENCES marca(id_marca)
) ENGINE=InnoDB;