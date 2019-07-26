drop schema if exists rest2crud;
create schema if not exists rest2crud;
use rest2crud;

create table users
(
	username varchar(50) primary key,
    password char(68),
    enabled tinyint(1)
);

create table authorities
(
	username varchar(50),
    authority varchar(50),
    constraint authorities_unique unique(username, authority),
    constraint authority_users_fk foreign key(username) references users(username)
);

insert into users values
('ubaid', '{bcrypt}$2a$10$TTeq3Bsesf3VVIq6s/CWHO8gZySAdfOPyC9RR3tmZ6ir2/68jpXF.', 1),
('attiq', '{bcrypt}$2a$10$VBUQCFRFWcts7dnlAUhrW.GvkVtbI3CwXpz/xhIFTXECg5rCZeFM6', 1),
('hajra', '{bcrypt}$2a$10$X0iAuY9o0h5cFtdFMw2CsuVgKEUSG7sOOCZNPlb8sqwM7KTAiSYBC', 1);

insert into authorities values
('ubaid', 'ROLE_ADMIN'),
('ubaid', 'ROLE_MANAGER'),
('attiq', 'ROLE_ADMIN'),
('hajra', 'ROLE_EMPLOYEE');



create table customer 
(
	id int not null auto_increment primary key,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255)
);

insert into customer values
(1, 'ubaid', 'rehman', 'urehman.bese16seecs@seecs.edu.pk'),
(2, 'attiq', 'rehman', 'arehman.bese16seecs@seecs.edu.pk'),
(3, 'saqib', 'rehman', 'srehman.bese16seecs@seecs.edu.pk'),
(4, 'shafiq', 'rehman', 'sfrehman.bese16seecs@seecs.edu.pk');


select * from users;