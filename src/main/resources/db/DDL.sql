CREATE TABLE `addresses`
(
    `id`           bigint PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `street_name`  varchar(100)       NOT NULL,
    `house_number` varchar(100),
    `flat_number`  varchar(100),
    `city`         varchar(100)       NOT NULL,
    `zip_code`     varchar(100),
    `country`      varchar(100)       NOT NULL,
    `phone`        varchar(100)       NOT NULL
);

CREATE TABLE `users`
(
    `id`         bigint PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `first_name` varchar(100)       NOT NULL,
    `last_name`  varchar(100)       NOT NULL,
    `birth_date` date               NOT NULL,
    `address_id` bigint             NOT NULL,
    `admin`      boolean            NOT NULL,
    `email`      varchar(255)       NOT NULL UNIQUE,
    `password`   varchar(255)       NOT NULL,
    FOREIGN KEY (address_id) REFERENCES addresses (id)

);

CREATE TABLE `cars`
(
    `id`        bigint PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `reg_code`  varchar(10)        NOT NULL,
    `brand`     varchar(50)        NOT NULL,
    `year`      int                NOT NULL,
    `transmission` varchar(40)     NOT NULL,
    `fuel_type` varchar(50)        NOT NULL,
    `sit_count` int                NOT NULL,
    `day_price` double             NOT NULL
);

CREATE TABLE `reservations`
(
    `id`            bigint PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `car_id`        bigint             NOT NULL,
    `user_id`       bigint             NOT NULL,
    `start_date`    date               NOT NULL,
    `end_date`      date               NOT NULL,
    `date_returned` date,
    `total_price`   double             NOT NULL,
    FOREIGN KEY (car_id) REFERENCES cars (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);



