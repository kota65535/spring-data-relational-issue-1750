CREATE DATABASE db
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_bin;

USE db;

CREATE TABLE user
(
    id    binary(16) NOT NULL,
    email varchar(256),

    PRIMARY KEY (id)
);

CREATE TABLE task
(
    id    int          NOT NULL AUTO_INCREMENT,
    title varchar(256) NOT NULL,
    owner binary(16)   NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (owner) REFERENCES user (id)
);
