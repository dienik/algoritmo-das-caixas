create database cadastro;
use cadastro;
create table titulacao(
pk_codtit serial primary key,
nometit varchar(50)
);
create table departamento (
pk_departamento serial primary key,
nomedepto varchar (50)
);
create table professor (
pk_professor serial primary key,
fk_departamento integer references nomedepto (pk_departamento),
fk_codtit integer references titulacao (pk_codtit),
nomeprof varchar (50)
);
insert into professor (nomeprof) values
('prof1'),
('prof2'),
('prof3');
create table disciplina(
pk_disciplina serial primary key,

nomedisc varchar (50),
creditosdisc varchar (50)
);
insert into disciplina (nomedisc) values
('Matematica'),
('Portugues'),
('Ingles');

select * from disciplina;
create table banco(
pk_banco serial primary key,
fk_departamento integer references nomedepto (pk_departamento),
fk_codtit integer references titulacao (pk_codtit),
fk_professor integer references nomeprof (pk_professor),
fk_disciplina integer references disciplina (pk_disciplina)

);
insert into banco (fk_departamento, fk_codtit, fk_professor, fk_disciplina) values
('dep1','cod1','prof1',1),
(2,2,2,2),
(3,3,3,3);
select * from banco