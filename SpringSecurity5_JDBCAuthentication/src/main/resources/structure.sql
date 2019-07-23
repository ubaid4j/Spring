drop database if exists hello1;
create database if not exists hello1;
use hello1;
create table users
(
	username varchar(50) primary key,
    password char(50),
    enabled tinyint(1)
);

create table authorities
(
	username varchar(50),
    authority varchar(50),
    constraint unique_key_authority unique(username, authority),
    constraint fk_authority_users foreign key(username) references users(username)
);


insert into users values
		('ubaid', '{noop}test123', 1),
        ('attiq', '{noop}test1234', 1),
        ('hajra', '{noop}test123', 1);
        
        
insert into authorities values
		('ubaid', 'ROLE_EMPLOYEE'),
        ('ubaid', 'ROLE_MANAGER'),
        ('ubaid', 'ROLE_ADMIN'),
        ('hajra', 'ROLE_EMPLOYEE'),
        ('attiq', 'ROLE_ADMIN');