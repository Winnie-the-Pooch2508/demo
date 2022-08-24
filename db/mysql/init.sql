DROP SCHEMA IF EXISTS task;
CREATE SCHEMA task;

CREATE TABLE task.product(
    id INT primary key auto_increment not null,
    name Text NULL,
    version INT NOT NULL default 0,
	description TEXT
);
CREATE TABLE task.media(
    id INT primary key auto_increment not null,
    filename text not null,
    url text not null,
	product_id INT,
	version INT NOT NULL default 0,
	FOREIGN KEY (product_id) REFERENCES product(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE task.price(
    id INT primary key auto_increment not null,
    value INT not null,
    currencyIsoCode text,
    product_id INT,
     version INT NOT NULL default 0,
    FOREIGN KEY (product_id) REFERENCES product(id) ON DELETE CASCADE ON UPDATE CASCADE
);