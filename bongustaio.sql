CREATE DATABASE bongustaio;
USE bongustaio;

CREATE TABLE proveedor(
idproveedor int(11) not null primary key auto_increment,
nombre varchar(70) not null,
direccion varchar(100) not null,
telefono varchar(10) not null,
correo varchar(50),
estado int(1) not null default 1
)ENGINE InnoDB;

create table producto(
idproducto int(11) not null primary key auto_increment,
nombre varchar(50) not null,
precio decimal(10,2) not null,
cantidad int(11) not null,
fechavenc date not null,
estado int(1) not null default 1
)ENGINE InnoDB;


create table inventario(
idinventario int(11) not null primary key auto_increment,
idproducto int(11) not null,
cant_entrada int(11) not null,
cant_disponible int(11) not null,
estado int(11) not null,
constraint foreign key (idproducto) references producto(idproducto)
on delete cascade on update cascade
)ENGINE InnoDB;

create table producto_proveedor(
idprod_prov int(11) not null primary key auto_increment,
idproveedor int(11) not null,
idproducto int(11) not null,
estado int(1) not null default 1,
CONSTRAINT FOREIGN KEY  (idproveedor) REFERENCES proveedor(idproveedor)ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY  (idproducto) REFERENCES producto(idproducto) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE InnoDB;

CREATE TABLE sucursal(
idsucursal int(11) not null primary key auto_increment,
idprod_prov int(11) not null,
nombre varchar(60) not null,
telefono varchar(10) not null,
direccion varchar(100) not null,
estado int(1) not null default 1,
CONSTRAINT FOREIGN KEY (idprod_prov) REFERENCES producto_proveedor(idprod_prov)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE InnoDB;
select *from sucursal;

CREATE TABLE tiposucursal(
idtiposucursal int(11) not null primary key auto_increment,
idsucursal int(11) not null,
estado int(1) not null default 1,
CONSTRAINT FOREIGN KEY (idsucursal) REFERENCES sucursal(idsucursal)
)ENGINE InnoDB;
select * from tiposucursal; 

create table tipoempleado(
idtipoempleado int(11) not null primary key auto_increment,
tipoempleado varchar(25) not null,
estado int(1) not null default 1
)ENGINE InnoDB;
insert into  tipoempleado(tipoempleado) values ('Administrador');
insert into  tipoempleado(tipoempleado) values ('Cajero');
insert into  tipoempleado(tipoempleado) values ('Cocinero');
insert into  tipoempleado(tipoempleado) values ('Mesero');
select * from tipoempleado;

create table empleado(
idempleado int(11) not null primary key auto_increment,
nombres varchar(60) not null,
apellidos varchar(60) not null,
dui varchar(10) not null unique,
correo varchar(70) not null,
telefono varchar(10) not null,
idtipoempleado int(11) not null,
idtiposucursal int(11) not null,
estado int(1) not null default 1,
constraint foreign key (idtipoempleado) references tipoempleado(idtipoempleado) on delete cascade on update cascade,
constraint foreign key (idtiposucursal) references tiposucursal(idtiposucursal) on delete cascade on update cascade
)ENGINE InnoDB;
select * from empleado;

CREATE TABLE roles(
idrol int(11) not null primary key auto_increment,
rol varchar(50) not null,
estado int(1) not null default 1
)ENGINE InnoDB;
insert into roles(rol) value('Administrador');
insert into roles(rol) value('TI');
insert into roles(rol) value('Gerente');
insert into roles(rol) value('Vendedor');
select * from roles;


CREATE TABLE usuarios(
idusuario int(11) not null primary key auto_increment,
usuario varchar(60) not null,
clave varchar(60) not null,
idtipo int(11) not null,
idempleado int(11) not null,
Estado int(1) not null default 1,
CONSTRAINT FOREIGN KEY (idtipo) REFERENCES roles(idrol) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY (idempleado) REFERENCES empleado(idempleado) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE InnoDB;
select*from usuarios;

create table bitacora(
idbitacora int(11) not null primary key auto_increment,
fecha timestamp not null,
usuario int(11) not null,
accion varchar(200) not null,
estado int(1) not null default 1,
constraint foreign key (usuario) references usuarios(idusuario) on delete cascade on update cascade
)ENGINE InnoDB;

CREATE TABLE especialidad(
idespecialidad int(11) not null primary key auto_increment,
nombre varchar(50) not null,
estado int(1) not null default 1
)ENGINE InnoDB;

CREATE TABLE tipoproducto(
idtipoproducto int(11) not null primary key auto_increment,
idtiposucursal int(11) not null,
estado int(1) not null default 1,
constraint foreign key (idtiposucursal) references tiposucursal(idtiposucursal) on delete cascade on update cascade
)ENGINE InnoDB;

CREATE TABLE catalogo(
idcatalogo int(11) not null primary key auto_increment,
nombre varchar(50) not null,
idtipoproduc int(11) not null,
CONSTRAINT FOREIGN KEY (idtipoproduc) REFERENCES tipoproducto(idtipoproducto)
ON DELETE CASCADE ON UPDATE CASCADE 
)ENGINE InnoDB;

create table plato_completo(
idplato_completo int(11) not null primary key auto_increment,
nombre varchar(150) not null,
precio double,
idcatalogo int(11) not null,
idespecialidad int(11) not null,
estado int(1)not null default 1,
constraint foreign key(idcatalogo) references catalogo(idcatalogo) on delete cascade on update cascade,
constraint foreign key(idespecialidad) references especialidad(idespecialidad) on delete cascade on update cascade
)engine InnoDB;


create table menu_del_dia(
idmenu int(11) not null primary key auto_increment,
descuento decimal(10,2) not null,
idplato_completo int(11) not null,
estado int(1) not null default 1,
constraint foreign key (idplato_completo) references plato_completo(idplato_completo) 
on delete cascade on update cascade
)ENGINE InnoDB;


create table venta_detalle(
idventa_detalle int(11) not null primary key auto_increment,
idplato_completo int (11) not null,
cantidad int(11) not null,
estado int(1) not null default 1,
constraint foreign key (idplato_completo) references plato_completo(idplato_completo) on delete cascade on update cascade
)ENGINE InnoDB;

create table complemento(
idcomplemento int not null primary key auto_increment,
nombre varchar(150) not null,
precio double not null,
estado int(1) not null default 1
)engine InnoDB;

create table ventaDetalle_complemento(
idventaDetalle_complemento int(11) not null primary key auto_increment,
cantidad int not null,
idventa_detalle int not null,
idcomplemento int(11) not null,
constraint foreign key (idventa_detalle) references venta_detalle(idventa_detalle) on delete cascade on update cascade,
constraint foreign key (idcomplemento) references complemento(idcomplemento) on delete cascade on update cascade
)engine InnoDB;

create table venta(
idventa int(11) not null primary key auto_increment,
idempleado int(11) not null,
fecha timestamp not null,
subtotal decimal(10,2) not null,
total decimal(10,2) not null,
idventaDetalle_complemento int not null,
estado int(1) not null default 1,
constraint foreign key (idempleado) references empleado(idempleado) on delete cascade on update cascade,
constraint foreign key (idventaDetalle_complemento) references ventaDetalle_complemento(idventaDetalle_complemento) on delete cascade on update cascade
)ENGINE InnoDB;


