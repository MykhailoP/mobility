# CREATE SCHEMA IF NOT EXISTS allmob;

CREATE TABLE IF NOT EXISTS allmob.am_user
(
    ID_user                      SMALLINT UNSIGNED NOT NULL,
    name                         VARCHAR(128),
    surname                      VARCHAR(128),
    email                        VARCHAR(128),
    changed                      TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change               SMALLINT UNSIGNED,
    PRIMARY KEY (ID_user, name, surname),
    INDEX indx_am_user USING HASH (ID_user, name, surname)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS allmob.am_leasing_contract
(
    ID_contract_number          SMALLINT UNSIGNED NOT NULL,
    ID_vehicle                  SMALLINT UNSIGNED NOT NULL,
    monthly_rate                DECIMAL(10,2) UNSIGNED NOT NULL DEFAULT '0.0000',
    changed                     TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change              SMALLINT UNSIGNED,
    PRIMARY KEY (ID_contract_number, ID_vehicle),
    INDEX indx_am_user USING HASH (ID_contract_number, ID_vehicle)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS allmob.am_customer
(
    ID_customer                SMALLINT UNSIGNED NOT NULL,
    name                       VARCHAR(128),
    surname                    VARCHAR(128),
    birthday                   DATETIME NOT NULL,
    changed                    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change             SMALLINT UNSIGNED,
    PRIMARY KEY (ID_customer, name, surname),
    INDEX indx_am_user USING HASH (ID_customer, name, surname)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS allmob.am_vehicle
(
    ID_vehicle                SMALLINT UNSIGNED NOT NULL,
    brand                     VARCHAR(128),
    model                     VARCHAR(128),
    model_year                TINYINT UNSIGNED NOT NULL,
    vin_code                  VARCHAR(128),
    price                     DECIMAL(10,2) UNSIGNED NOT NULL DEFAULT '0.0000',
    changed                   TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change            SMALLINT UNSIGNED,
    PRIMARY KEY (ID_vehicle)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS allmob.am_customer_leasing_contract
(
    ID_customer               SMALLINT UNSIGNED NOT NULL,
    ID_contract_number        SMALLINT UNSIGNED NOT NULL,
    changed                   TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change            SMALLINT UNSIGNED,
    PRIMARY KEY (ID_customer, ID_contract_number)
) ENGINE = InnoDB;