DROP SCHEMA IF EXISTS task;
CREATE SCHEMA task;

CREATE TABLE task.media(
    id INT primary key auto_increment not null,
    filename text not null,
    url text not null
);

CREATE TABLE task.price(
    id INT primary key auto_increment not null,
    value INT not null,
    currencyIsoCode text,
    product_id INT,
    FOREIGN KEY (product_id) REFERENCES product(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE task.product(
    id INT primary key auto_increment not null,
    name Text NULL,
	description TEXT,
    picture_id INT,
    FOREIGN KEY (picture_id) REFERENCES media(id) ON DELETE CASCADE ON UPDATE CASCADE
);

select * from task.product;
select * from task.media;
select * from task.price;

DROP TABLE task.product;
DROP TABLE task.media;
DROP TABLE task.price;