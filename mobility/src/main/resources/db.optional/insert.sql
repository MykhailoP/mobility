INSERT INTO am_leasing_contract (ID_contract_number, ID_vehicle, monthly_rate)
VALUES (1, 101, 810.11),
       (2, 102, 812.22),
       (3, 103, 813.33),
       (4, 104, 814.44),
       (5, 105, 815.55),
       (6, 105, 815.55),
       (7, 105, 815.55);

INSERT INTO am_vehicle (ID_vehicle, brand, model, model_year, vin_code, price)
VALUES (101, 'BMW', 'X5', 2021, 'ADJDSUW459', 110810.11),
       (102, 'Audi', 'Q5', 2021, 'ADJDSUW459', 34567.11),
       (103, 'VW', 'T5', 2021, 'ADJDSUW459', 56789.11),
       (104, 'Tesla', 'X5', 2021, 'ASWADJDSUW459', 88888.11),
       (105, 'Porsche', '911', 2023, '', 210810.11);

INSERT INTO am_customer (ID_customer, name, surname, birthday)
VALUES (1, 'Olaf', 'Scholz', '1958-06-14 00:00:00.000'),
       (2, 'Robert', 'Habeck', '1969-02-09 00:00:00.000'),
       (3, 'Christian', 'Lindner', '1979-07-01 00:00:00.000'),
       (4, 'Nancy', 'Faeser', '1970-07-13 00:00:00.000'),
       (5, 'Annalena', 'Baerbock', '1980-12-15 00:00:00.000');

INSERT INTO am_customer_leasing_contract (ID_customer, ID_contract_number)
VALUES (1, 1),
       (1, 7),
       (1, 2),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5),
       (5, 6);