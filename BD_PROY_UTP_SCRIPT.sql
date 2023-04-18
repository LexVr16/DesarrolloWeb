CREATE DATABASE sys_venta;

use sys_venta;

-- Tabla categoría
create table categoria(
       idcategoria integer primary key AUTO_INCREMENT,
       descripcion varchar(256) null,
       estado bit
);
insert into categoria (descripcion,estado) values ('Cereales',1);
select * from categoria;

-- Tabla artículo
create table articulo(
       idarticulo integer primary key AUTO_INCREMENT,
       idcategoria integer not null,
       descripcion varchar(256) null,
       precio_venta decimal(11,2) not null,
       stock integer not null,       
       estado bit,
       FOREIGN KEY (idcategoria) REFERENCES categoria(idcategoria)
);
insert into articulo (idcategoria,descripcion,precio_venta,stock,estado) values (1,'Decripción Articulo 1',12,5,0);
select * from articulo;

-- --Tabla cliente 
create table cliente(
       idcliente integer primary key AUTO_INCREMENT,
       tipo_cliente varchar(20) not null,
       nombres varchar(50) not null,
       apellidos varchar (50) not null,
       tipo_documento varchar(20) null,
       num_documento varchar(20) null,
       direccion varchar(70) null,
       telefono varchar(20) null,
       email varchar(50) null
);

insert into cliente(tipo_cliente,nombres,apellidos,tipo_documento,num_documento,direccion,telefono,email) values ('Natural','Cesar','Valdiviezo','DNI','48135445','Av Angamos 123','946123456','cesar@gmail.com');
select * from cliente;

-- --Tabla rol
create table rol(
       idrol integer primary key AUTO_INCREMENT,
       nombre varchar(30) not null,
       descripcion varchar(100) null,
       estado bit
);

insert into rol(nombre,descripcion,estado) values ('Administrador','Rol que gestiona el sistema',1);
insert into rol(nombre,descripcion,estado) values ('Vendedor','Rol que se encarga de Vender',1);
select * from rol;



-- --Tabla usuario
create table usuario(
       idusuario integer primary key AUTO_INCREMENT,
       idrol integer not null,
       nombres varchar(50) not null,
       apellidos varchar (50) not null,
       tipo_documento varchar(20) null,
       num_documento varchar(20) null,
       direccion varchar(70) null,
       telefono varchar(20) null,
       email varchar(50) not null,
       password varbinary(12) NOT NULL,
       estado bit,
       FOREIGN KEY (idrol) REFERENCES rol (idrol)
);
insert into usuario (idrol,nombres,apellidos,tipo_documento,num_documento,direccion,telefono,email,password,estado) values (1,'Alex','Rosas','DNI','123','Av Alfonso Ugarte','946334466','alex@gmail.com',123,1);
select * from usuario;


-- --Tabla venta
create table venta(
       idventa integer primary key AUTO_INCREMENT,	
	   ruc varchar(11) null,
       tipo_comprobante varchar(20) not null, 
       num_comprobante varchar (10) not null,
       idcliente integer not null,                          
       fecha_hora datetime not null,
       impuesto decimal (4,2) not null,
       descuento decimal(11,2) not null,
       total decimal (11,2) not null,
       estado bit,
       idusuario integer not null,
       FOREIGN KEY (idcliente) REFERENCES cliente (idcliente),
       FOREIGN KEY (idusuario) REFERENCES usuario (idusuario)
);
select * from cliente;
select * from usuario;
insert into venta (ruc, tipo_comprobante, num_comprobante, idcliente, fecha_hora, impuesto, descuento, total, estado, idusuario) values('12345678901','Boleta Electronica','0001',1,'2022-04-05',0.18,0.40,100,0,1);
select * from venta;

-- --Tabla detalle_venta
create table detalle_venta(
       iddetalle_venta integer primary key AUTO_INCREMENT,
       idventa integer not null,
       idarticulo integer not null,
       cantidad integer not null,
       precio decimal(11,2) not null,       
       FOREIGN KEY (idventa) REFERENCES venta (idventa) ON DELETE CASCADE,
       FOREIGN KEY (idarticulo) REFERENCES articulo (idarticulo)
);

insert into detalle_venta (idventa,idarticulo,cantidad,precio) values(1,1,2,12.5);
select * from detalle_venta;

create table entrega_producto (
		identrega integer primary key AUTO_INCREMENT,
        idventa integer not null,
        fecha_hora datetime not null,
        estado bit,
        FOREIGN KEY (idventa) REFERENCES venta (idventa)
);

insert into entrega_producto (idventa,fecha_hora,estado) values (1,"2022-09-25",1);
select * from entrega_producto;


select * from venta;
select * from detalle_venta;

select entrega_producto.identrega, venta.idventa, cliente.nombres as Cliente, venta.estado as Estado
from entrega_producto 
	inner join venta
on entrega_producto.idventa = venta.idventa
	inner join cliente
on venta.idcliente = cliente.idcliente
 where venta.estado = 0
order by identrega DESC;

select * from entrega_producto;
-- id | idVenta | Cliente | Descripcion | Cantidad | Estado | fecha











