USE db;

INSERT INTO user (id, email)
VALUES (UUID_TO_BIN('87a48aa8-a071-705e-54a9-e52fe3a012f1'), 'sre.aip.sample.test+01@gmail.com');

INSERT INTO task (id, title, owner)
VALUES (1, 'foo', UUID_TO_BIN('87a48aa8-a071-705e-54a9-e52fe3a012f1'));
