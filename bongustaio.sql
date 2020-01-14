<<<<<<< HEAD
create database bongustaio;
=======
<<<<<<< HEAD

CREATE DATABASE bongustaio;
=======
create database bongustaio;
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
USE bongustaio;

CREATE TABLE proveedor(
	idproveedor int(11) not null primary key auto_increment,
	nombre varchar(70) not null,
	direccion varchar(100) not null,
	telefono varchar(10) not null,
	correo varchar(50),
	estado int(1) not null default 1
);
<<<<<<< HEAD
=======
insert into proveedor(nombre,direccion,telefono,correo)
values('Mario','Calle aledaña condomino #4','2290-2317','Mario9078@gmail.com');
select*from proveedor;
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9

create table producto(
	idproducto int(11) not null primary key auto_increment,
	nombre varchar(50) not null,
	precio decimal(10,2) not null,
	cantidad int(11) not null,
	fechavenc date not null,
	estado int(1) not null default 1
);
<<<<<<< HEAD

create table inventario(
=======
insert into producto(nombre,precio,cantidad,fechavenc)
values('Pollo',3.20,12,'2017-09-09');
insert into producto(nombre,precio,cantidad,fechavenc)
values('Carne',6.40,14,'2019-09-09'),('Tomates',1.10,54,'2019-10-09'),('Arroz',0.90,18,'2019-11-09');
select*from producto;

create table inventario(
<<<<<<< HEAD
idinventario int(11) not null primary key auto_increment,
idproducto int(11) not null,
cant_entrada int(11) not null,
cant_disponible int(11) not null,
fecha date not null,
estado int(1) not null default 1,
constraint foreign key (idproducto) references producto(idproducto)
on delete cascade on update cascade
)ENGINE InnoDB;

=======
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
	idinventario int(11) not null primary key auto_increment,
	idproducto int(11) not null,
	cant_entrada int(11) not null,
	cant_disponible int(11) not null,
	fecha date not null,
	estado int(1) not null default 1,
	constraint foreign key (idproducto) references producto(idproducto)
	on delete cascade on update cascade
);
<<<<<<< HEAD
=======
insert into inventario(idproducto,cant_entrada,cant_disponible,fecha)
values(1,2,6,'2019-08-08'),(2,3,3,'2019-08-08'),(3,5,7,'2019-08-08'),(1,2,6,'2019-08-08');
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
select*from inventario;
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9

/*TIPO SUCURSAL DEBE ESTAR RELACIONADA CON SUCURSAL */
CREATE TABLE tiposucursal(
	idtiposucursal int(11) not null primary key auto_increment,
	nombre varchar(50) not null,
	estado int(1) not null default 1
);
<<<<<<< HEAD
=======
insert into tiposucursal(nombre) values('restaurante'),('snack');
select * from tiposucursal; 
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9

CREATE TABLE sucursal(
	idsucursal int(11) not null primary key auto_increment,
	idtiposucursal int(11) not null,
	nombre varchar(60) not null,
	telefono varchar(10) not null,
	direccion varchar(100) not null,
	estado int(1) not null default 1,
	CONSTRAINT FOREIGN KEY (idtiposucursal) REFERENCES tiposucursal(idtiposucursal)
	ON DELETE CASCADE ON UPDATE CASCADE
);
<<<<<<< HEAD
=======
insert into sucursal(idtiposucursal,nombre,telefono,direccion)
values(1,'bongustaio_Soyapango','2256-7890','bulevar del ejercito');
select *from sucursal;
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9


create table orden_compra(
<<<<<<< HEAD
=======
<<<<<<< HEAD
idorden_compra int(11) not null primary key auto_increment,
idproveedor int(11) not null,
idproducto int(11) not null,
idsucursal int(11) not null,
cantidad int(11) not null,
fecha date not null,	
estado int(1) not null default 1,
CONSTRAINT FOREIGN KEY  (idproveedor) REFERENCES proveedor(idproveedor)ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY  (idproducto) REFERENCES producto(idproducto) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY (idsucursal) REFERENCES sucursal(idsucursal)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE InnoDB;
=======
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
	idorden_compra int(11) not null primary key auto_increment,
	idproveedor int(11) not null,
	idproducto int(11) not null,
	idsucursal int(11) not null,
	cantidad int(11) not null,
	fecha date not null,	
	estado int(1) not null default 1,
	CONSTRAINT FOREIGN KEY  (idproveedor) REFERENCES proveedor(idproveedor)ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT FOREIGN KEY  (idproducto) REFERENCES producto(idproducto) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT FOREIGN KEY (idsucursal) REFERENCES sucursal(idsucursal)
	ON DELETE CASCADE ON UPDATE CASCADE
);
<<<<<<< HEAD
=======
insert into orden_compra(idproveedor,idproducto,idsucursal,cantidad,fecha)
values(1,1,1,12,'2019-08-05');
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
select*from orden_compra;
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9

create table tipoempleado(
	idtipoempleado int(11) not null primary key auto_increment,
	tipoempleado varchar(25) not null,
	estado int(1) not null default 1
);
<<<<<<< HEAD
=======
insert into  tipoempleado(tipoempleado) values ('Administrador'),('Cajero'),('Cocinero'),('Mesero');
select * from tipoempleado;
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9


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
);
<<<<<<< HEAD
=======
insert into empleado(nombres,apellidos,dui,correo,telefono,idtipoempleado,idsucursal)
values('Alexander','Vasquez','3490102-5','bongustaio@gmail.com','7689-2345',1,1);
insert into empleado(nombres,apellidos,dui,correo,telefono,idtipoempleado,idsucursal)
values('Juan','Martinez','3490102-4','bongustaio2@gmail.com','7689-2345',2,1);
insert into empleado(nombres,apellidos,dui,correo,telefono,idtipoempleado,idsucursal)
values('Claudia','Flores','3490102-3','bongustai3@gmail.com','7689-2345',3,1);
insert into empleado(nombres,apellidos,dui,correo,telefono,idtipoempleado,idsucursal)
<<<<<<< HEAD
values('Alexander','Vasquez','3490102-5','bongustaio@gmail.com','7689-2345',1,1);
=======
values('Rene','Hernandez','3490102-2','bongustai4@gmail.com','7689-2345',4,1);
insert into empleado(nombres,apellidos,dui,correo,telefono,idtipoempleado,idsucursal)
values('Isacc','Cruz','3490102-1','bongustai4@gmail.com','7689-2345',4,1);
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
select * from empleado;
select*from empleado;
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9

CREATE TABLE roles(
	idrol int(11) not null primary key auto_increment,
	rol varchar(50) not null,
	estado int(1) not null default 1
);
<<<<<<< HEAD

CREATE TABLE usuarios(
=======
insert into roles(rol) value('Administrador'),('TI'),('Gerente'),('Vendedor');
insert into roles(rol) value('Cocinero');
select * from roles;

CREATE TABLE usuarios(
<<<<<<< HEAD
idusuario int(11) not null primary key auto_increment,
usuario varchar(60) not null,
clave varchar(60) not null,
idtipo int(11) not null,
idempleado int(11) not null,
Estado int(1) not null default 1,
CONSTRAINT FOREIGN KEY (idtipo) REFERENCES roles(idrol) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY (idempleado) REFERENCES empleado(idempleado) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE InnoDB;
insert into usuarios(usuario,clave,idtipo,idempleado, estado)
values('Josue','123',1,2,1);
select*from empleado;
=======
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
	idusuario int(11) not null primary key auto_increment,
	usuario varchar(60) not null,
	clave varchar(60) not null,
	idtipo int(11) not null,
	idempleado int(11) not null,
	Estado int(1) not null default 1,
	CONSTRAINT FOREIGN KEY (idtipo) REFERENCES roles(idrol) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT FOREIGN KEY (idempleado) REFERENCES empleado(idempleado) ON DELETE CASCADE ON UPDATE CASCADE
);
<<<<<<< HEAD
=======
insert into usuarios(usuario,clave,idtipo,idempleado) values('Josue','123',1,1);
insert into usuarios(usuario,clave,idtipo,idempleado) values ('Juan','123',2,2);
insert into usuarios(usuario,clave,idtipo,idempleado) values ('Claudia','123',3,3);
insert into usuarios(usuario,clave,idtipo,idempleado) values ('Rene','123',4,4);
insert into usuarios(usuario,clave,idtipo,idempleado) values ('Issac','123',5,5);
/*update usuarios set idtipo=5 where idusuario=5;*/
select*from usuarios;
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8

>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9

create table bitacora(
	idbitacora int(11) not null primary key auto_increment,
	fecha timestamp not null,
	usuario int(11) not null,
	accion varchar(200) not null,
	estado int(1) not null default 1,
	constraint foreign key (usuario) references usuarios(idusuario) on delete cascade on update cascade
);

CREATE TABLE especialidad(
<<<<<<< HEAD
	idespecialidad int(11) not null primary key auto_increment,
	nombre varchar(50) not null,
	estado int(1) not null default 1
);

CREATE TABLE tipoproducto(
	idtipoproducto int(11) not null primary key auto_increment,
	idtiposucursal int(11) not null,
	nombre varchar(50) not null,
	estado int(1) not null default 1,
	constraint foreign key (idtiposucursal) references tiposucursal(idtiposucursal) on delete cascade on update cascade
);

CREATE TABLE catalogo(
	idcatalogo int(11) not null primary key auto_increment,
	nombre varchar(50) not null,
	idtipoproduc int(11) not null,
	CONSTRAINT FOREIGN KEY (idtipoproduc) REFERENCES tipoproducto(idtipoproducto)
	ON DELETE CASCADE ON UPDATE CASCADE 
);

create table plato_completo(
	idplato_completo int(11) not null primary key auto_increment,
	nombre varchar(150) not null,
	precio double,
	idcatalogo int(11) not null,
	idespecialidad int(11) not null,
	estado int(1)not null default 1,
	constraint foreign key(idcatalogo) references catalogo(idcatalogo) on delete cascade on update cascade,
	constraint foreign key(idespecialidad) references especialidad(idespecialidad) on delete cascade on update cascade
);

=======
<<<<<<< HEAD
idespecialidad int(11) not null primary key auto_increment,
nombre varchar(50) not null,
estado int(1) not null default 1
)ENGINE InnoDB;

/*Se agrego el nombre*/
CREATE TABLE tipoproducto(
idtipoproducto int(11) not null primary key auto_increment,
idtiposucursal int(11) not null,
nombre varchar(50) not null,
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

=======
	idespecialidad int(11) not null primary key auto_increment,
	nombre varchar(50) not null,
	estado int(1) not null default 1
);

CREATE TABLE tipoproducto(
	idtipoproducto int(11) not null primary key auto_increment,
	idtiposucursal int(11) not null,
	nombre varchar(50) not null,
	estado int(1) not null default 1,
	constraint foreign key (idtiposucursal) references tiposucursal(idtiposucursal) on delete cascade on update cascade
);

CREATE TABLE catalogo(
	idcatalogo int(11) not null primary key auto_increment,
	nombre varchar(50) not null,
	idtipoproduc int(11) not null,
	CONSTRAINT FOREIGN KEY (idtipoproduc) REFERENCES tipoproducto(idtipoproducto)
	ON DELETE CASCADE ON UPDATE CASCADE 
);
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8

create table plato_completo(
	idplato_completo int(11) not null primary key auto_increment,
	nombre varchar(150) not null,
	precio double,
	idcatalogo int(11) not null,
	idespecialidad int(11) not null,
	estado int(1)not null default 1,
	constraint foreign key(idcatalogo) references catalogo(idcatalogo) on delete cascade on update cascade,
	constraint foreign key(idespecialidad) references especialidad(idespecialidad) on delete cascade on update cascade
);

>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
create table menu_del_dia(
	idmenu int(11) not null primary key auto_increment,
	descuento decimal(10,2) not null,
	idplato_completo int(11) not null,
	estado int(1) not null default 1,
	constraint foreign key (idplato_completo) references plato_completo(idplato_completo) 
	on delete cascade on update cascade
);

create table complemento(
<<<<<<< HEAD
	idcomplemento int not null primary key auto_increment,
	nombre varchar(150) not null,
	precio double not null,
	estado int(1) not null default 1
);

create table venta(
=======
<<<<<<< HEAD
idcomplemento int not null primary key auto_increment,
nombre varchar(150) not null,
precio double not null,
estado int(1) not null default 1
)engine InnoDB;

create table ventaDetalle_complemento(
idventaDetalle_complemento int(11) not null primary key auto_increment,
cantidad int not null,
idventa_detalle int not null,
idcomplemento int(11),
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
select * from empleado;
select * from usuarios as u
inner join empleado as e on e.idempleado = u.idempleado
inner join roles as r on r.idrol = u.idtipo;

select * from tiposucursal;
select * from tipoproducto;
insert into tipoproducto values(0,1,'Cena',1);
select * from catalogo;
select * from plato_completo;
=======
	idcomplemento int not null primary key auto_increment,
	nombre varchar(150) not null,
	precio double not null,
	estado int(1) not null default 1
);

create table venta(
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
	idventa int(11) not null primary key auto_increment,
	idplato_completo int (11),
	cantidad int(11) not null,
	idcomplemento int,
	idempleado int,
    total decimal(7,2),
    fecha timestamp not null,
    estado int(1) not null default 1,
	constraint foreign key (idplato_completo) references plato_completo(idplato_completo) on delete cascade on update cascade,
    constraint foreign key (idcomplemento) references complemento(idcomplemento) on delete cascade on update cascade,
    constraint foreign key (idempleado) references empleado(idempleado) on delete cascade on update cascade
<<<<<<< HEAD
);
=======
);
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
