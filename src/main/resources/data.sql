DROP DATABASE IF EXISTS portuguese_dishes;
CREATE DATABASE portuguese_dishes;
USE portuguese_dishes;

CREATE TABLE dishes
(
    dish_id   INT AUTO_INCREMENT PRIMARY KEY,
    dish_name VARCHAR(255),
    version   INT NOT NULL DEFAULT 0
);

CREATE TABLE eaten_dishes
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    dish_id   INT,
    rank_dish INT,
    version   INT NOT NULL DEFAULT 0,
    eat_day   DATETIME,
    FOREIGN KEY (dish_id) REFERENCES dishes (dish_id) ON DELETE CASCADE
);

INSERT INTO dishes (dish_name)
VALUES ('Bacalhau à Brás');
INSERT INTO dishes (dish_name)
VALUES ('Francesinha');
INSERT INTO dishes (dish_name)
VALUES ('Caldo Verde');
INSERT INTO dishes (dish_name)
VALUES ('Arroz de Pato');
INSERT INTO dishes (dish_name)
VALUES ('Açorda à Alentejana');
INSERT INTO dishes (dish_name)
VALUES ('Leitão à Bairrada');
INSERT INTO dishes (dish_name)
VALUES ('Polvo à Lagareiro');
INSERT INTO dishes (dish_name)
VALUES ('Carne de Porco à Alentejana');
INSERT INTO dishes (dish_name)
VALUES ('Feijoada à Portuguesa');
INSERT INTO dishes (dish_name)
VALUES ('Sopa da Pedra');
