

CREATE DATABASE cl2_cahuana;


USE cl2_cahuana;


CREATE TABLE Area (
  Codigo_Area INT PRIMARY KEY,
  Nombre_Area VARCHAR(100),
  Jefe_Area VARCHAR(100)
);


CREATE TABLE Personal (
  Nombre VARCHAR(100),
  Codigo_Trabajador INT PRIMARY KEY,
  Sueldo DECIMAL(10, 2),
  Codigo_Area INT,
  FOREIGN KEY (Codigo_Area) REFERENCES Area(Codigo_Area)
);

INSERT INTO Area (Codigo_Area, Nombre_Area, Jefe_Area)
VALUES
  (1, 'Ventas', 'Pablo Escobar'),
  (2, 'Logistica', 'Capitan DonGato');

INSERT INTO Personal (Nombre, Codigo_Trabajador, Sueldo, Codigo_Area)
VALUES
  ('Pinocho Gomez', 1, 6500.00, 1),
  ('Bob Esponja', 2, 1000.00, 2),
  ('Carlitos Tilin', 3, 4000.00, 1);

SELECT p.Codigo_Trabajador AS numero, p.Nombre, p.Codigo_Trabajador, p.Sueldo, a.Nombre_Area, a.Jefe_Area
FROM Personal p
JOIN Area a ON p.Codigo_Area = a.Codigo_Area;