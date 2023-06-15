# CREATE SCHEMA IF NOT EXISTS allmob;

CREATE TABLE IF NOT EXISTS am_user
(
    ID_user                      INT,
    name                         VARCHAR(128),
    surname                      VARCHAR(128),
    email                        VARCHAR(128),
    changed                      TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change               INT,
    PRIMARY KEY (ID_user, name, surname),
    INDEX indx_am_user USING HASH (ID_user, name, surname)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS am_leasing_contract
(
    ID_contract_number          INT,
    ID_vehicle                  INT,
    monthly_rate                DECIMAL(10,2) UNSIGNED NOT NULL DEFAULT '0.0000',
    changed                     TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change              INT,
    PRIMARY KEY (ID_contract_number, ID_vehicle),
    INDEX indx_am_user USING HASH (ID_contract_number, ID_vehicle)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS am_customer
(
    ID_customer                INT,
    name                       VARCHAR(128),
    surname                    VARCHAR(128),
    birthday                   DATETIME NOT NULL,
    changed                    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change             INT,
    PRIMARY KEY (ID_customer, name, surname),
    INDEX indx_am_user USING HASH (ID_customer, name, surname)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS am_vehicle
(
    ID_vehicle                INT,
    brand                     VARCHAR(128),
    model                     VARCHAR(128),
    model_year                INT,
    vin_code                  VARCHAR(128),
    price                     DECIMAL(10,2) UNSIGNED NOT NULL DEFAULT '0.0000',
    changed                   TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change            INT,
    PRIMARY KEY (ID_vehicle)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS am_customer_leasing_contract
(
    ID_customer               INT,
    ID_contract_number        INT,
    changed                   TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change            INT,
    PRIMARY KEY (ID_customer, ID_contract_number)
) ENGINE = InnoDB;