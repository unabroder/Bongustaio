create database restaurante;
use restaurante;

-- tablas para login y sesion

create table usuario(
	id_usuario int primary key auto_increment,
    usuario varchar(50),
    clave varchar(50),
    estado int(1) not null default 0
);
-- perfil cambia a roles
create table roles(
	id_perfil int primary key auto_increment,
    nombre varchar(50),
    estado int(1) not null default 0
);

create table usuario_roles(
	id_usu_per int primary key auto_increment,
    id_usuario int,
    id_perfil int,
    estado int(1) not null default 0,
    constraint fk_up_usu foreign key (id_usuario) references usuario(id_usuario),
    constraint fk_up_per foreign key (id_perfil) references roles(id_perfil)
);

-- tablas para sucursales y empleados

create table tipo_sucursal(
	id_tipo_sucursal int primary key auto_increment,
    nombre varchar(50),
    estado int(1) not null default 0
);

create table sucursal(
	id_sucursal int primary key auto_increment,
	nombre varchar(50),
    direccion varchar(50),
    telefono varchar(10),
    id_tipo_sucursal int,
    estado int(1) not null default 0,
    constraint fk_suc_tipsuc foreign key (id_tipo_sucursal) references tipo_sucursal(id_tipo_sucursal)
);

create table tipo_empleado(
	id_tipo_empleado int primary key auto_increment,
    nombre varchar(50),
    estado int(1) not null default 0
);

create table empleado(
	id_empleado int primary key auto_increment,
    nombres varchar(50),
    apellidos varchar(50),
    direccion varchar(100),
    telefono varchar(10),
    id_tipo_empleado int,
    id_sucursal int,
    estado int(1) not null default 0,
    constraint fk_emp_tem foreign key (id_tipo_empleado) references tipo_empleado(id_tipo_empleado),
    constraint fk_emp_suc foreign key (id_sucursal) references sucursal(id_sucursal)
);

-- eliminar la tabla crencial empleado
create table credenciales_empleado(
	id_cre_emp int primary key auto_increment, 
    id_empleado int,
    id_usu_per int,
    estado int(1) not null default 0,
    constraint fk_ce_emp foreign key (id_empleado) references empleado(id_empleado),
    constraint fk_ce_usuper foreign key (id_usu_per) references usuario_perfil(id_usu_per)
);

-- tablas de proveedores y productos

create table proveedor(
	id_proveedor int primary key auto_increment,
    	nombre varchar(50),
    	direccion varchar(100),
    	telefono varchar(10),
        estado int(1) not null default 0
);

-- ejem: desayuno, almuerzo, cena, entradas, tipicos, bebida fria, bebida caliente
create table tipo_producto(
	id_tipo_producto int primary key auto_increment,
    	nombre varchar(50),
        estado int(1) not null default 0
);

-- ejem: huevos, carne, tamal pisque, sopa esparrago, empanada, soda, cafe, chocolate
create table producto(
	id_producto int primary key auto_increment,
    	nombre varchar(50),
    	id_tipo_producto int,
        estado int(1) not null default 0,
    	constraint fk_pro_tp foreign key (id_tipo_producto) references tipo_producto(id_tipo_producto)
);

-- ejem: tomatada, guisada, salsita, frijol,  
create table especialidad(
	id_especialidad int primary key auto_increment,
    	nombre varchar(50),
        estado int(1) not null default 0
);

create table producto_especialidad(
	id_pro_esp int primary key auto_increment,
    	id_producto int,
    	id_especialidad int,
        estado int(1) not null default 0,
    	constraint fk_pe_pro foreign key (id_producto) references producto(id_producto),
    	constraint fk_pe_esp foreign key (id_especialidad) references especialidad(id_especialidad)
);

create table proveedor_producto_sucursal(
	id_prov_prod_suc int primary key auto_increment,
    	id_proveedor int, 
    	id_producto int,
    	id_sucursal int,
    	cantidad int,
    	precio_proveedor decimal(12,5),
        estado int(1) not null default 0,
    	constraint fk_pps_prov foreign key (id_proveedor) references proveedor(id_proveedor),
    	constraint fk_pps_prod foreign key (id_producto) references producto(id_producto),
    	constraint fk_pps_suc foreign key (id_sucursal) references sucursal(id_sucursal)
);

-- tablas para realizar la venta
-- inventario
create table inventario (
	id_stock int primary key auto_increment,
   --  id_pro_esp int, 
    id_sucursal int,
    cant_disponible int, 
    cant_entrada int,
    precio_unitario decimal(12,5),
    estado int(1) not null default 0,
    -- constraint fk_sto_proesp foreign key (id_pro_esp) references producto_especialidad(id_pro_esp),
    constraint fk_sto_suc foreign key (id_sucursal) references sucursal(id_sucursal)
);

create table venta(
	id_venta int primary key auto_increment,
    id_empleado int,
    -- id_sucursal int,
    venta_total decimal(12,5),
    fecha_venta date,
    subtotal decimal(10,2),
    venta_hora time,
    estado int(1) not null default 0,
    constraint fk_ven_emp foreign key (id_empleado) references empleado(id_empleado)
   --  constraint fk_ven_suc foreign key (id_sucursal) references sucursal(id_sucursal)
);

create table venta_detalle(
	id_venta_detalle int primary key auto_increment,
    id_venta int,
    id_pro_esp int, 
    cantidad int,
    estado int(1) not null default 0,
    constraint fk_vd_proesp foreign key (id_pro_esp) references producto_especialidad(id_pro_esp),
    constraint fk_vd_ven foreign key (id_venta) references venta(id_venta)
);

create table menu_del_dia(
	id_menu_del_dia int primary key auto_increment,
    id_pro_esp int,
    descuento int,
    estado int(1) not null default 0,
    constraint fk_mdd_proesp foreign key (id_pro_esp) references producto_especialidad(id_pro_esp)
);





















