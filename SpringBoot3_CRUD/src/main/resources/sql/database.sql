drop schema if exists spring_boot_3_crud;
create schema if not exists spring_boot_3_crud;

use spring_boot_3_crud;

create table employee
(
	id int primary key auto_increment not null,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255)
);

insert into employee values
(1, 'ubaid', 'rehman', 'urehman.bese16seecs@seecs.edu.pk'),
(2, 'attiq', 'rehman', 'rehman.attiq.123@gmail.com'),
(3, 'hajra', 'noor', 'noor@yahoo.com'),
(4, 'attif', 'ayub', 'ayub@yahoo.com');

select * from employee;