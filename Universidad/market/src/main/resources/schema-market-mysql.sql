-- Ejecutar en MySQL (Workbench o cliente mysql). Base: market
CREATE DATABASE IF NOT EXISTS market;
USE market;

CREATE TABLE categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(45) NOT NULL,
    estado TINYINT(1) NOT NULL
);

CREATE TABLE productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    id_categoria INT NOT NULL,
    codigo_barras VARCHAR(150),
    precio_venta DECIMAL(10, 2) NOT NULL,
    cantidad_stock INT NOT NULL,
    estado TINYINT(1) NOT NULL,
    CONSTRAINT fk_producto_categoria FOREIGN KEY (id_categoria) REFERENCES categorias (id_categoria)
);

CREATE TABLE clientes (
    id_cliente VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    celular VARCHAR(20),
    direccion VARCHAR(80),
    correo_electronico VARCHAR(70)
);
