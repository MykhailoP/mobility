CREATE TABLE IF NOT EXISTS allmob.am_user
(
    ID_user        SMALLINT UNSIGNED NOT NULL,
    name           VARCHAR(128),
    surname        VARCHAR(128),
    email          VARCHAR(128),
    changed        TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ID_user_change SMALLINT UNSIGNED,
    PRIMARY KEY (ID_user, name, surname),
    INDEX indx_am_user USING HASH (ID_user, name, surname)
) ENGINE = InnoDB;