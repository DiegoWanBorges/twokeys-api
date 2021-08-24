
INSERT INTO CLIENTE_1.tb_user (name,login,password) VALUES ('Diego Wandrofski Borges','diego@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO CLIENTE_1.tb_user (name,login,password) VALUES ('Machado de Assis','machado@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO CLIENTE_1.tb_user (name,login,password) VALUES ('José de Alencar','jose@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO CLIENTE_1.tb_user (name,login,password) VALUES ('Monteiro Lobato','monteiro@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO CLIENTE_1.tb_role (authority,description) VALUES ('ROLE_MASTER','System Admin');
INSERT INTO CLIENTE_1.tb_role (authority,description) VALUES ('ROLE_ADMIN','Company Admin');
INSERT INTO CLIENTE_1.tb_role (authority,description) VALUES ('ROLE_SELLER','Seller');


INSERT INTO CLIENTE_1.tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO CLIENTE_1.tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO CLIENTE_1.tb_user_role (user_id, role_id) VALUES (3, 3);
INSERT INTO CLIENTE_1.tb_user_role (user_id, role_id) VALUES (4, 3);


