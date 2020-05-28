create table alergias (
    id_alergia int not null auto_increment primary key ,
    alergia varchar (20)
);

create table cirugias (
    id_cirugia int not null auto_increment primary key ,
    cirugia varchar (20)
);

create table enfermedades_cronicas(
    id_cronica int not null auto_increment primary key ,
    enf_cronica varchar (20)
);

create table antecendentes (
    id_persona int not null,
    apellidos varchar (60),
    direccion varchar (40),
    id_alergia int not null,
    id_cirugia int not null,
    id_cronica int not null,
    CONSTRAINT antecedentesPK primary key  (id_persona,id_alergia,id_cirugia,id_cronica),
    CONSTRAINT antecedentesFK1 foreign key (id_persona) references pacientes (id_persona) ON UPDATE CASCADE ON DELETE CASCADE ,
    CONSTRAINT antecedentesFK2 foreign key (id_alergia) references alergias (id_alergia) ON UPDATE CASCADE ON DELETE CASCADE ,
    CONSTRAINT antecedentesFK3 foreign key (id_cirugia) references cirugias (id_cirugia) ON UPDATE CASCADE ON DELETE CASCADE ,
    CONSTRAINT antecedentesFK4 foreign key (id_cronica) references enfermedades_cronicas (id_cronica) ON UPDATE CASCADE ON DELETE CASCADE
);

create table consultas (
    id_persona int not null,
    cve_consulta varchar(10) not null,
    fecha_consulta date,
    sintomas text,
    id_medico int,
    CONSTRAINT consultasPK primary key (id_persona,cve_consulta),
    CONSTRAINT consultaFK1 FOREIGN KEY (id_persona) references pacientes (id_persona) ON UPDATE CASCADE ON DELETE CASCADE ,
    CONSTRAINT consultaFK2 FOREIGN KEY (id_medico) references  medicos (id_persona) ON UPDATE CASCADE ON DELETE SET NULL
);
create table evidencias (
    id_persona int not null,
    cve_consulta varchar(10) not null,
    cve_evidencia varchar(10) not null,
    evidencia varchar (50),
    CONSTRAINT evidenciasPK primary key (id_persona,cve_consulta,cve_evidencia),
    CONSTRAINT evidenciasFK1 foreign key (id_persona,cve_consulta) references  consultas (id_persona,cve_consulta) ON UPDATE CASCADE ON DELETE CASCADE
);
create table consulta_especialidad (
    id_persona int not null ,
    cve_consulta varchar(10) not null ,
    id_especilaidad int not null,
    CONSTRAINT consulta_especialidadPK primary key  (id_persona,cve_consulta,id_especilaidad),
    CONSTRAINT consulta_especialidadFK1 foreign key (id_persona,cve_consulta) references consultas (id_persona,cve_consulta) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT consulta_especialidadFK2 foreign key  (id_especilaidad) references especialidades (id_especialidad) ON UPDATE CASCADE ON DELETE CASCADE
);
create table servicios_consulta(
    id_persona int not null ,
    cve_consulta varchar(10) not null ,
    id_servicio int not null,
    CONSTRAINT servicios_consultaPK primary key (id_persona,cve_consulta,id_servicio),
    CONSTRAINT servicios_consultaFK1 foreign key (id_persona,cve_consulta) references  consultas (id_persona,cve_consulta) ON UPDATE CASCADE ON DELETE CASCADE ,
    CONSTRAINT servicios_consultaFK2 foreign key (id_servicio) references  servicios (id_servicio) ON UPDATE CASCADE ON DELETE CASCADE
);
create table metodos_pago(
    id_metodo int not null auto_increment primary key ,
    descripcion varchar (40)
);
create table pagos_tarjetas(
    id_metodo int not null,
    no_tarjeta int not null,
    nombre_responsable varchar (40) not null,
    vigencia varchar(5) not null,
    cvc varchar (4) not null,
    CONSTRAINT pagos_tarjetasPK primary key (id_metodo),
    CONSTRAINT pagos_tarjetasFK1 foreign key (id_metodo) references metodos_pago (id_metodo) ON UPDATE CASCADE ON DELETE CASCADE
);

create table pagos_paypal(
    id_metodo int not null,
    cuenta_paypal varchar (20),
    password varchar (20),
    CONSTRAINT pagos_paypalPK primary key (id_metodo),
    CONSTRAINT pagos_paypalFK1 foreign key (id_metodo) references metodos_pago (id_metodo) ON UPDATE CASCADE ON DELETE CASCADE
);

create table pagos (
    id_pago int not null auto_increment primary key ,
    id_metodo int,
    monto int,
    CONSTRAINT pagosFK1 foreign key (id_metodo) references metodos_pago (id_metodo) ON UPDATE SET NULL ON DELETE SET NULL
);

create table recetas (
    id_persona int not null,
    cve_consulta varchar(10) not null,
    indicaciones text,
    fecha_receta date,
    CONSTRAINT recetasPK primary key (id_persona,cve_consulta),
    CONSTRAINT recetasFK1 foreign key (id_persona,cve_consulta) references  consultas(id_persona, cve_consulta) ON UPDATE CASCADE ON DELETE CASCADE
);

create table medicamentos (
    id_medicamento int not null auto_increment primary key ,
    nombre_medicamento varchar (40),
    costo int
);

CREATE table medicamentos_recetas(
    id_medicamento int not null,
    id_persona int not null,
    cve_consulta varchar(10) not null,
    CONSTRAINT medicamentos_recetasPK primary key (id_medicamento,id_persona,cve_consulta),
    CONSTRAINT medicamentos_recetasFK1 foreign key (id_medicamento) references medicamentos (id_medicamento) ON UPDATE CASCADE ON DELETE CASCADE ,
    CONSTRAINT medicamentos_recetasFK2 foreign key (id_persona,cve_consulta) references recetas (id_persona,cve_consulta) ON UPDATE CASCADE ON DELETE CASCADE
);

create table tipo_dom(
    id_tipo_dom int not null auto_increment primary key ,
    tipo varchar (2)
);

create table domicilios (
    id_persona int not null,
    cve_domicilio varchar(5) not null,
    direccion varchar (30),
    id_tipo_dom int,
    CONSTRAINT domiciliosPK primary key (id_persona,cve_domicilio),
    CONSTRAINT domiciliosFK1 foreign key (id_persona) references pacientes (id_persona) ON UPDATE CASCADE ON DELETE CASCADE
);

create table compras (
    id_compra int not null auto_increment primary key ,
    id_persona int ,
    fecha_compra date,
    id_pago int,
    cve_domicilio_entrega varchar(5),
    CONSTRAINT comprasFK1 foreign key (id_persona) references pacientes(id_persona) ON UPDATE CASCADE ON DELETE CASCADE ,
    CONSTRAINT comprasFK2 foreign key (id_pago) references pagos (id_pago) ON UPDATE CASCADE ON DELETE SET NULL ,
    CONSTRAINT comprasFK3 foreign key (id_persona,cve_domicilio_entrega) references domicilios (id_persona,cve_domicilio) ON UPDATE CASCADE ON DELETE SET NULL
);

create table carrito (
    id_compra int not null,
    id_medicamento int not null,
    cantidad int,
    CONSTRAINT carritoPK primary key  (id_compra,id_medicamento),
    CONSTRAINT carritoFK1 foreign key (id_compra) references compras (id_compra) ON UPDATE CASCADE ON DELETE CASCADE ,
    CONSTRAINT carritoFK2 foreign key (id_medicamento) references medicamentos (id_medicamento) ON UPDATE CASCADE ON DELETE CASCADE
);

create table paciente_metodos(
    id_persona int not null ,
    id_metodo int not null ,
    CONSTRAINT paciente_metodosPK primary key (id_persona,id_metodo),
    CONSTRAINT paciente_metodosFK1 foreign key (id_persona) references pacientes (id_persona) ON UPDATE CASCADE  ON DELETE CASCADE ,
    CONSTRAINT paciente_metodosFK2 foreign key (id_metodo) references metodos_pago (id_metodo) ON UPDATE CASCADE ON DELETE CASCADE
);

create table facturas (
    id_persona int not null,
    cve_consulta varchar(10) not null ,
    RFC varchar (12),
    id_pago int,
    cve_domicilio varchar(5),
    CONSTRAINT facturasPK primary key (id_persona,cve_consulta),
    CONSTRAINT facturasFK1 foreign key (id_persona,cve_consulta) references  consultas (id_persona,cve_consulta) ON UPDATE CASCADE ON DELETE CASCADE ,
    CONSTRAINT facturasFK2 foreign key (id_pago) references pagos (id_pago) ON UPDATE CASCADE ON DELETE SET NULL ,
    CONSTRAINT facturasFK3 foreign key (id_persona,cve_domicilio) references domicilios (id_persona,cve_domicilio) ON UPDATE CASCADE ON DELETE CASCADE
);

create table covid19(
    id_perosna int not null,
    status char (10),
    CONSTRAINT covid19PK primary key (id_perosna),
    CONSTRAINT covid19FK1 foreign key (id_perosna) references pacientes(id_persona) ON UPDATE CASCADE ON DELETE CASCADE
);

insert into personas (nombre, estado, pais, municipio, telefono)
values  ('Juan1' ,'Perez1','México','Michoacan','03146111123'),
        ('Juan2' ,'Perez2','México','Guerrero','03146111124'),
        ('Juan3' ,'Perez3','México','Nuevo Leon','03146111125'),
        ('Juan4' ,'Perez4','México','Jalisco','03146111126')
;
create table alergias_paciente ( id_persona int not null,
                                 id_alergia int not null,
                                 constraint alergias_pacientePK primary key (id_persona,id_alergia),
                                 CONSTRAINT alegias_pacienteFK1 foreign key (id_persona) references pacientes(id_persona) ON UPDATE CASCADE ON DELETE CASCADE ,
                                 CONSTRAINT alergias_pacienteFK2 foreign key (id_alergia) references alergias(id_alergia) ON UPDATE CASCADE ON DELETE CASCADE
);
create table cronicas_paciente ( id_persona int not null,
                                 id_cronica int not null,
                                 constraint cronicas_pacientePK primary key (id_persona,id_cronica),
                                 CONSTRAINT cronicas_pacienteFK1 foreign key (id_persona) references pacientes(id_persona) ON UPDATE CASCADE ON DELETE CASCADE ,
                                 CONSTRAINT cronicas_pacienteFK2 foreign key (id_cronica) references enfermedades_cronicas(id_cronica) ON UPDATE CASCADE ON DELETE CASCADE
);

create table cirugias_paciente ( id_persona int not null,
                                 id_cirugia int not null,
                                 constraint cirugias_pacientePK primary key (id_persona,id_cirugia),
                                 CONSTRAINT cirugias_pacienteFK1 foreign key (id_persona) references pacientes(id_persona) ON UPDATE CASCADE ON DELETE CASCADE ,
                                 CONSTRAINT cirugias_pacienteFK2 foreign key (id_cirugia) references cirugias(id_cirugia) ON UPDATE CASCADE ON DELETE CASCADE
);
alter table personas add apellidos varchar (50);
alter table personas add direccion varchar (50);

alter table antecendentes drop direccion;
alter table antecendentes drop apellidos;
drop  table antecendentes;

