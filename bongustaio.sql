
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
insert into proveedor(nombre,direccion,telefono,correo)
values('Mario','Calle aledaña condomino #4','2290-2317','Mario9078@gmail.com');
select*from proveedor;

create table producto(
idproducto int(11) not null primary key auto_increment,
nombre varchar(50) not null,
precio decimal(10,2) not null,
cantidad int(11) not null,
fechavenc date not null,
estado int(1) not null default 1
)ENGINE InnoDB;
insert into producto(nombre,precio,cantidad,fechavenc)
values('Pollo',3.20,12,'2017-09-09');
select*from producto;

create table inventario(
idinventario int(11) not null primary key auto_increment,
idproducto int(11) not null,
cant_entrada int(11) not null,
cant_disponible int(11) not null,
fecha date not null,
estado int(1) not null default 1,
constraint foreign key (idproducto) references producto(idproducto)
on delete cascade on update cascade
)ENGINE InnoDB;

select*from inventario;

/*TIPO SUCURSAL DEBE ESTAR RELACIONADA CON SUCURSAL */
CREATE TABLE tiposucursal(
idtiposucursal int(11) not null primary key auto_increment,
nombre varchar(50) not null,
estado int(1) not null default 1
)ENGINE InnoDB;
insert into tiposucursal(nombre) values('restaurante');
select * from tiposucursal; 


CREATE TABLE sucursal(
idsucursal int(11) not null primary key auto_increment,
idtiposucursal int(11) not null,
nombre varchar(60) not null,
telefono varchar(10) not null,
direccion varchar(100) not null,
estado int(1) not null default 1,
CONSTRAINT FOREIGN KEY (idtiposucursal) REFERENCES tiposucursal(idtiposucursal)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE InnoDB;
insert into sucursal(idtiposucursal,nombre,telefono,direccion)
values(1,'bongustaio_Soyapango','2256-7890','bulevar del ejercito');
select *from sucursal;

create table orden_compra(
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
select*from orden_compra;



create table tipoempleado(
idtipoempleado int(11) not null primary key auto_increment,
tipoempleado varchar(25) not null,
estado int(1) not null default 1
)ENGINE InnoDB;
insert into  tipoempleado(tipoempleado) values ('Administrador'),('Cajero'),('Cocinero'),('Mesero');
select * from tipoempleado;

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
values('Alexander','Vasquez','3490102-5','bongustaio@gmail.com','7689-2345',1,1);
select * from empleado;

select e.nombres,s.nombre from empleado as e inner join sucursal as s
on e.idsucursal = s.idsucursal;

CREATE TABLE roles(
idrol int(11) not null primary key auto_increment,
rol varchar(50) not null,
estado int(1) not null default 1
)ENGINE InnoDB;
insert into roles(rol) value('Administrador'),('TI'),('Gerente'),('Vendedor');
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
insert into usuarios(usuario,clave,idtipo,idempleado, estado)
values('Josue','123',1,2,1);
select*from empleado;

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
select * from plato_completo;


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
codigo varchar(10) not null,
cantidad int(11) not null,
estado int(1) not null default 1,
constraint foreign key (idplato_completo) references plato_completo(idplato_completo) on delete cascade on update cascade
)ENGINE InnoDB;
select * from venta_detalle;

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