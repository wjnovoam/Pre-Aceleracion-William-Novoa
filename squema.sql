create database dbdisney;
use dbdisney;

create table personaje(
	id_personaje bigint primary key not null auto_increment,
	url_imagen varchar(255),
	nombre varchar(100) not null,
	edad int,
	peso int,
	historia varchar(255)
);

create table movie(
	id_movie bigint primary key not null auto_increment,
	url_imagen varchar(255),
	titulo varchar(255) not null,
	fecha_creacion date not null,
	calificacion double not null check (calificacion > 0 and calificacion <=5)
);

create table genero(
	id_genero bigint primary key not null auto_increment,
	nombre varchar(100) not null,
	url_imagen varchar(255)
);

create table movie_personaje(
	id_personaje_movie int primary key not null auto_increment,
	id_movie bigint not null,
	id_personaje bigint not null,
	foreign key(id_movie) references movie(id_movie),
	foreign key(id_personaje) references personaje(id_personaje),
    unique(id_movie, id_personaje)
);

create table movie_genero(
	id_movie_genero int primary key not null auto_increment,
	id_movie bigint not null,
	id_genero bigint not null,
	foreign key(id_movie) references movie(id_movie),
	foreign key(id_genero) references genero(id_genero),
    	unique(id_movie, id_genero)
);

create table usuario(
	id_usuario bigint primary key not null auto_increment,
	nombre varchar(50),
	apellido varchar(50),
	telefono varchar(50),
	email varchar(100) unique not null,
	contrasena varchar(255)
);


insert into personaje 
values
(1, "https://es.web.img2.acsta.net/r_1920_1080/pictures/15/07/27/12/24/137619.jpg", "samuel Leroy jackson", 70, 85, "Nacido en Washington DC, Samuel L. Jackson ingresó en el Morehouse College de Atlanta para comenzar a estudiar arquitectura. Hizo su debut en el cine en 1972 con 'Together for days'. Fue en Nueva York, donde Samuel "),
(2, "https://es.web.img3.acsta.net/r_1920_1080/medias/nmedia/18/35/19/45/20528617.jpg", "jude law", 48, 75, "Después de una breve carrera en televisión y en el teatro, Jude Law se inicia en la gran pantalla en 1994 con el filme de ciencia ficción 'Shopping."),
(3, "https://es.web.img3.acsta.net/r_1920_1080/pictures/19/10/11/03/20/0442824.jpg", "gemma chan", 38, 65, "Gemma Chan nació en el distrito de Southwark, en Londres. Su padre se crio en Hong Kong y era ingeniero, mientras que su madre, farmacéutica, era originaria de la China continental"),
(4, "https://es.web.img2.acsta.net/r_1920_1080/pictures/16/12/16/11/40/348536.jpg", "ryan reynolds", 44, 84, "Ryan Reynolds comenzó su carrera como actor de televisión en 1991. El joven canadiense se da a conocer en Hollywood en 1997 con la comedia 'Life during wartime"),
(5, "https://es.web.img3.acsta.net/r_1920_1080/pictures/20/01/06/23/00/4845147.jpg", "jodie comer", 28, 60, "Jodie Marie Comer (Liverpool; 11 de marzo de 1993), conocida artísticamente como Jodie Comer, es una actriz británica.");

insert into movie
values
(1, "https://es.web.img2.acsta.net/r_1920_1080/img/35/ca/35ca03a8520c42c999c1d01ae1598b1b.jpg", "capitana marvel", "2019-03-08", 5),
(2, "https://es.web.img3.acsta.net/r_1920_1080/pictures/21/06/10/17/59/2662839.jpg", "free cuy", "2021-08-18", 4.6),
(3, "https://es.web.img3.acsta.net/r_1920_1080/medias/nmedia/18/68/51/20/19095268.jpg", "la proposicion", "2009-07-10", 3.4);

insert into genero
values
(1, "accion", "url"),
(2, "fantasia", "url"),
(3, "ciencia ficcion", "url"),
(4, "aventura", "url"),
(5, "suspense", "url"),
(6, "espionaje", "url");

insert into movie_genero
values
(1, 1, 1),
(2, 1, 3),
(3, 1, 2),
(4, 2, 3),
(5, 2, 4),
(6, 3, 6),
(7, 3, 5);

insert into movie_personaje
values
(1, 1, 1),
(2, 1, 2),
(3, 1, 3),
(4, 2, 2),
(5, 2, 4),
(6, 3, 4),
(7, 3, 5);

insert into usuario
values
(1, "william", "novoa", "3162471460", "prueba1@gmail.com", "1234"),
(2, "johan", "melendrez", "3182233060", "prueba2@gmail.com", "1234");



	