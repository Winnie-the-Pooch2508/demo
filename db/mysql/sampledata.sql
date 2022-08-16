  INSERT INTO task.product(name, description)
  VALUES ('Iphone SE','5G Mobilfunk. Bis zu 15 Std. Videowiedergabe. Touch ID'),
  	   ('Iphone 12','Superschneller 5G Mobilfunk. Superschneller 5G Mobilfunk. Face ID'),
  	   ('Iphone 13','Superschneller 5G Mobilfunk. Bis zu 19 Std. Videowiedergabe. Face ID'),
   	   ('Samsung Galaxy S20 FE','Interner Gerätespeicher in GB:128 GB. Hauptdisplay:1.080 x 2.400 (FHD+)'),
   	   ('Samsung Galaxy S21 Ultra','Interner Gerätespeicher in GB:128 GB/256 GB/ 512 GB. Hauptdisplay:3.200 x 1.440 (Quad HD+)'),
   	   ('Samsung Galaxy A52','Interner Gerätespeicher in GB:256 GB. Hauptdisplay:1.080 x 2.400 (FHD+)');

  INSERT INTO task.media (filename, url,product_id)
  VALUES('filename 1','url 1',6),('filename 2','url 2',5),
  ('filename 3','url 3',4),('filename 4','url 4',3),
  ('filename 5','url 5',2),('filename 6','url 6',1);
  INSERT INTO task.price ( value, currencyIsoCode,product_id)
  VALUES(199,'EUR',6),(189,'USD',5),
  (159,'EUR',4),(149,'USD',3),
  (269,'EUR',2),(259,'USD',1);


