CREATE DATABASE bongustaio;
USE bongustaio;

CREATE TABLE roles(
idrol int(11) not null primary key auto_increment,
rol varchar(50) not null,
estado int(1) not null default 1
)ENGINE InnoDB;
insert into roles(rol) value('Administrador');
select * from roles;

create table tipoempleado(
idtipoempleado int(11) not null primary key auto_increment,
tipoempleado varchar(25) not null,
estado int(1) not null default 1
)ENGINE InnoDB;
insert into  tipoempleado(tipoempleado) values ('Administrador');
select * from tipoempleado;

CREATE TABLE tiposucursal(
idtiposucursal int(11) not null primary key auto_increment,
tipo varchar(50) not null,
estado int(1) not null default 1
)ENGINE InnoDB;
insert into tiposucursal(tipo) values('restaurante');
select * from tiposucursal; 

CREATE TABLE sucursal(
idsucursal int(11) not null primary key auto_increment,
idtipo int(11) not null,
nombre varchar(60) not null,
telefono varchar(10) not null,
direccion varchar(100) not null,
estado int(1) not null default 0,
CONSTRAINT FOREIGN KEY (idtipo) REFERENCES tiposucursal(idtiposucursal)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE InnoDB;
insert into sucursal(idtipo,nombre,telefono,direccion)
values(1,'Tio Juanito','7845-0943','Ave. Constitucional');
select *from sucursal;

create table empleado(
idempleado int(11) not null primary key auto_increment,
nombres varchar(60) not null,
apellidos varchar(60) not null,
dui varchar(10) not null unique,
correo varchar(70) not null,
telefono varchar(10) not null,
idtipoempleado int(11) not null,
idsucursal int(11) not null,
estado int(1) not null default 1,
constraint foreign key (idtipoempleado) references tipoempleado(idtipoempleado) on delete cascade on update cascade,
constraint foreign key (idsucursal) references sucursal(idsucursal) on delete cascade on update cascade
)ENGINE InnoDB;
insert into empleado(nombres,apellidos,dui,correo,telefono,idtipoempleado,idsucursal)
values('Maria','Vasquez','3490102-5','bongustaio@gmail.com','7689-2345',1,1);
select * from empleado;

CREATE TABLE usuarios(
idusuario int(11) not null primary key auto_increment,
usuario varchar(60) not null,
clave varchar(60) not null,
idtipo int(11) not null,
idempleado int(11) not null,
Estado int(1) not null default 0,
CONSTRAINT FOREIGN KEY (idtipo) REFERENCES roles(idrol) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY (idempleado) REFERENCES empleado(idempleado) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE InnoDB;
insert into usuarios(usuario,clave,idtipo,idempleado) values ('josue','123',1,1);
select*from usuarios;

CREATE TABLE proveedor(
idproveedor int(11) not null primary key auto_increment,
nombre varchar(70) not null,
direccion varchar(100) not null,
telefono varchar(10) not null,
correo varchar(50),
estado int(1) not null default 1
)ENGINE InnoDB;

CREATE TABLE tipoproducto(
idtipoproducto int(11) not null primary key auto_increment,
tipoproducto varchar(60) not null,
estado int(1) not null default 1
)ENGINE InnoDB;

CREATE TABLE catalogo(
idcatalogo int(11) not null primary key auto_increment,
nombre varchar(50) not null,
preciounit decimal(10,2) not null,
cantidad int(11) not null,
idtipoproduc int(11) not null,
CONSTRAINT FOREIGN KEY (idtipoproduc) REFERENCES tipoproducto(idtipoproducto)
ON DELETE CASCADE ON UPDATE CASCADE 
)ENGINE InnoDB;

create table menu_del_dia(
idmenu int(11) not null primary key auto_increment,
descuento decimal(10,2) not null,
idcatalogo int(11) not null,
estado int(1) not null default 1,
constraint foreign key (idcatalogo) references catalogo(idcatalogo) 
on delete cascade on update cascade
)ENGINE InnoDB;

CREATE TABLE especialidad(
idespecialidad int(11) not null primary key auto_increment,
nombre varchar(50) not null,
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

create table catalogo_especialidad(
id_cat_esp int(11) not null primary key auto_increment,
idcatalogo int(11) not null,
idespecialidad int(11) not null,
estado int(1) not null default 1,
constraint foreign key (idcatalogo) references catalogo(idcatalogo) on delete cascade on update cascade,
constraint foreign key (idespecialidad) references especialidad(idespecialidad) on delete cascade on update cascade
)ENGINE InnoDB;

create table producto_proveedor(
idprod_prov int(11) not null primary key auto_increment,
idproveedor int(11) not null,
idsucursal int(11) not null,
idproducto int(11) not null,
estado int(1) not null default 1,
CONSTRAINT FOREIGN KEY  (idproveedor) REFERENCES proveedor(idproveedor)ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT  FOREIGN KEY (idsucursal) REFERENCES sucursal(idsucursal) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY  (idproducto) REFERENCES producto(idproducto) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE InnoDB;

create table inventario(
idinventario int(11) not null primary key auto_increment,
idprod_prov int(11) not null,
cant_entrada int(11) not null,
cant_disponible int(11) not null,
estado int(11) not null,
constraint foreign key (idprod_prov) references producto_proveedor(idprod_prov)
on delete cascade on update cascade
)ENGINE InnoDB;

create table venta(
idventa int(11) not null primary key auto_increment,
idempleado int(11) not null,
fecha timestamp not null,
subtotal decimal(10,2) not null,
total decimal(10,2) not null,
estado int(1) not null default 1,
constraint foreign key (idempleado) references empleado(idempleado) on delete cascade on update cascade
)ENGINE InnoDB;

create table venta_detalle(
idventa_detalle int(11) not null primary key auto_increment,
idventa int(11) not null,
idcatalogo int(11) not null,
cantidad int(11) not null,
estado int(1) not null default 1,
constraint foreign key (idventa) references venta(idventa) on delete cascade on update cascade,
constraint foreign key (idcatalogo) references catalogo(idcatalogo) on delete cascade on update cascade
)ENGINE InnoDB;

create table bitacora(
idbitacora int(11) not null primary key auto_increment,
fecha timestamp not null,
usuario int(11) not null,
accion varchar(200) not null,
estado int(1) not null default 1,
constraint foreign key (usuario) references usuarios(idusuario) on delete cascade on update cascade
)ENGINE InnoDB;
