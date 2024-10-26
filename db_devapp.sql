create database db_devapp;
use db_devapp;

create table produtos (
id int primary key not null AUTO_INCREMENT,
descricao varchar(50) not null,
preco double not null,
fornecedor varchar(50) not null,
qtdestoque int not null
);

INSERT INTO produtos (descricao, preco, fornecedor, qtdestoque) VALUES ('Notebook Dell', 3500.00, 'Kabum', 60);
INSERT INTO produtos (descricao, preco, fornecedor, qtdestoque) VALUES ('Smartphone Samsung', 2500.00, 'Amazon', 50);
INSERT INTO produtos (descricao, preco, fornecedor, qtdestoque) VALUES ('Monitor LG', 1200.50, 'Amazon', 70);
INSERT INTO produtos (descricao, preco, fornecedor, qtdestoque) VALUES ('Teclado Mecânico Redragon', 450.99, 'Kabum', 90);
INSERT INTO produtos (descricao, preco, fornecedor, qtdestoque) VALUES ('Mouse Gamer Logitech', 320.00, 'Submarino', 70);
INSERT INTO produtos (descricao, preco, fornecedor, qtdestoque) VALUES ('Fone de Ouvido JBL', 200.00, 'Magazine', 80);
INSERT INTO produtos (descricao, preco, fornecedor, qtdestoque) VALUES ('Impressora HP', 850.00, 'Amazon', 80);
INSERT INTO produtos (descricao, preco, fornecedor, qtdestoque) VALUES ('Tablet Apple', 2999.99, 'Americanas', 90);

SELECT * from produtos;
