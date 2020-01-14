create database a;
create database germano_kazembe;

create table usuario(
codigo int auto_increment,
nome varchar(35),
usuario varchar(30),
senha varchar(30),
primary key(codigo)
);

create table gravadora(
codigo int auto_increment,
nome varchar(45),
numerodemusicas int,
esatado varchar(45),
primary key(codigo)
);

create table musico(
codigo int auto_increment,
nomes varchar(45),
apelido varchar(45),
estilomusical varchar(45),
numerodemusicas int,
primary key(codigo)

);

create table musica(
codigo int auto_increment,
estilo varchar(45),
titulo varchar(45),
generomusical varchar(45),
gravadora_codigo int,
musico_codigo int,
primary key(codigo),
foreign key(gravadora_codigo) references gravadora(codigo),
foreign key(musico_codigo) references musico(codigo)
);

