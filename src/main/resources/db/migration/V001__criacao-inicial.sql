create table book (
	id bigint not null auto_increment,
    author varchar(255) not null,
    launch_date datetime not null,
    price decimal(10,2) not null,
    title varchar(255) not null,
    
    primary key(id) 
) engine=InnoDB default charset=utf8;

create table permission (
	id bigint not null auto_increment,
    description varchar(255) not null,
    
    primary key(id) 
) engine=InnoDB default charset=utf8;

create table person (
	id bigint not null auto_increment,
    first_name varchar(80) not null,
    last_name varchar(80) not null,
    address varchar(80) not null,
    gender varchar(16) not null,
    
    primary key(id) 
) engine=InnoDB default charset=utf8;

create table user (
	id bigint not null auto_increment,
    user_name varchar(80) not null,
    full_name varchar(80) not null,
    password varchar(80) not null,
    account_non_expired boolean not null,
    account_non_locked boolean not null,
    credentials_non_expired boolean not null,
    enabled boolean not null,
    
    primary key(id) 
) engine=InnoDB default charset=utf8;