--liquibase formatted sql

--changeset rgurinovich:1
insert into users(id, username, email, password) values (1, 'roma', 'roma@gmail.com', 'roma');

