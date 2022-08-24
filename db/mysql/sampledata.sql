  INSERT INTO task.product(id, name, description)
  VALUES (1,'Iphone SE','5G Mobilfunk. Bis zu 15 Std. Videowiedergabe. Touch ID'),
  	   (2,'Iphone 12','Superschneller 5G Mobilfunk. Superschneller 5G Mobilfunk. Face ID'),
  	   (3,'Iphone 13','Superschneller 5G Mobilfunk. Bis zu 19 Std. Videowiedergabe. Face ID'),
   	   (4,'Samsung Galaxy S20 FE','Interner Gerätespeicher in GB:128 GB. Hauptdisplay:1.080 x 2.400 (FHD+)'),
   	   (5,'Samsung Galaxy S21 Ultra','Interner Gerätespeicher in GB:128 GB/256 GB/ 512 GB. Hauptdisplay:3.200 x 1.440 (Quad HD+)'),
   	   (6,'Samsung Galaxy A52','Interner Gerätespeicher in GB:256 GB. Hauptdisplay:1.080 x 2.400 (FHD+)');

  INSERT INTO task.media (id, filename, url,product_id)
  VALUES(1,'filename 1','url 1',6),
  (2,'filename 2','url 2',5),
  (3,'filename 3','url 3',4),
  (4,'filename 4','url 4',3),
  (5,'filename 5','url 5',2),
  (6,'filename 6','url 6',1);
  INSERT INTO task.price (id, value, currencyIsoCode,product_id)
  VALUES(1,199,'EUR',6),
  (2,189,'USD',5),
  (3,159,'EUR',4),
  (4,149,'USD',3),
  (5,269,'EUR',2),
  (6,259,'USD',1);


