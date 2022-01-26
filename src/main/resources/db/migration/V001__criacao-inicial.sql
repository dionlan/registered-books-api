create table IF NOT EXISTS person (
	id bigint not null auto_increment,
    first_name varchar(80) not null,
    last_name varchar(80) not null,
    address varchar(80) not null,
    gender varchar(16) not null,
    
    primary key(id) 
) engine=InnoDB default charset=utf8;

create table IF NOT EXISTS book (
	id bigint not null auto_increment,
    author varchar(255) not null,
    launch_date datetime not null,
    price decimal(10,2) not null,
    title varchar(255) not null,
    
    primary key(id) 
) engine=InnoDB default charset=utf8;

create table IF NOT EXISTS permission (
	id bigint not null auto_increment,
    description varchar(255) not null,
    
    primary key(id) 
) engine=InnoDB default charset=utf8;

create table IF NOT EXISTS user (
	id bigint not null auto_increment,
    user_name varchar(255) not null,
    full_name varchar(255) not null,
    password varchar(255) not null,
    account_non_expired boolean default null,
    account_non_locked boolean default null,
    credentials_non_expired boolean default null,
    enabled boolean default null,
    
    primary key(id),
    unique key uk_user_name (user_name)
) engine=InnoDB default charset=utf8;

CREATE TABLE IF NOT EXISTS user_permission (
  id_user bigint(20) NOT NULL,
  id_permission bigint(20) NOT NULL,
  
  primary key (id_user, id_permission),
  key fk_user_permission_permission (id_permission),
  CONSTRAINT fk_user_permission FOREIGN KEY (id_user) REFERENCES user (id),
  CONSTRAINT fk_user_permission_permission FOREIGN KEY (id_permission) REFERENCES permission (id)
) ENGINE=InnoDB;

ALTER TABLE person
	ADD COLUMN enabled BIT(1) NOT NULL DEFAULT b'1' AFTER last_name;