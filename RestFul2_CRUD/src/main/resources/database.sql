drop schema if exists rest2crud;
create schema if not exists rest2crud;
use rest2crud;

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


select * from customer;