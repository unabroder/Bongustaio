insert into producto values(0, 'producto1', 1.5, 35, now(), 1);
insert into proveedor values(0, 'proveedor1', 'direccion1', '25252525','pro1@gmail.com',1);
insert into tiposucursal values(0, 'restaurante',1);
insert into tiposucursal values(0, 'snack',1);
insert into sucursal values(0,1,'restaurante1', '26262626', 'direccion1', 1);
insert into orden_compra values(0,1,1,1,100,now(),1);
<<<<<<< HEAD
insert into inventario values(0, 1,100,100, now(), 1);
=======
insert into inventario values(0, 1,100,100,now(),1);
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
insert into roles values(0, 'rol1', 1);
insert into tipoempleado values(0,'tipoempleado1',1);
insert into empleado values(0,'josue','escobar','000252647', 'josue@gmail.com', '77777777', 1, 1, 1);
insert into empleado values(0,'nathalia','flores','05264798', 'natha@gmail.com', '85858585', 1, 1, 1);
insert into usuarios values(0,'josue','123',1,1,1);
insert into usuarios values(0,'natha','123',1,2,1);
insert into bitacora values(0,now(), 1, 'INSERT', 1);
insert into tipoproducto values(0,1,'Desayuno',1);
insert into tipoproducto values(0,1,'Almuerzo',1);
insert into tipoproducto values(0,1,'Cena',1);
insert into tipoproducto values(0,1,'Snack',1);
insert into catalogo values(0,'Huevos', 1);
insert into catalogo values(0,'Carne', 2);
insert into catalogo values(0,'Sopa', 3);
insert into catalogo values(0,'Nachos', 4);
insert into especialidad values(0,'Salteados',1);
insert into especialidad values(0,'Asada',1);
insert into especialidad values(0,'De Pollo',1);
insert into especialidad values(0,'Rancheros',1);
insert into plato_completo values(0,'Huevos Omelete', 2.5, 1,1,1);
insert into plato_completo values(0,'Carne de la Casa', 3.5, 2,2,1);
insert into plato_completo values(0,'Sopa de la Casa', 1.5, 3,3,1);
insert into plato_completo values(0,'Nachos Mexicanos', 1.5, 4,4,1);
insert into complemento values(0,'Casamiento', 1.00, 1);
insert into menu_del_dia values(0, 0.25, 1,1);
<<<<<<< HEAD
insert into venta values(0,1,4,1,1, 10.0,now(), 1);

select * from roles;
insert into roles(rol) values('Administrador','TI','Gerente','Vendedor');
select * from usuarios;
=======
insert into venta values(0,1,4,1,1, 10.0,now(), 1);
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
