CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE robots(
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark        CHAR(6),
    height      NUMERIC,
    weight      NUMERIC,
    status      TEXT,
    origin      TEXT,
    launch      TEXT,
    kaijuKill   INTEGER
);