DROP TABLE IF EXISTS athletes;
DROP TABLE IF EXISTS clubs;
DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    id          SERIAL PRIMARY KEY,
    username    VARCHAR(64) UNIQUE NOT NULL,
    password    VARCHAR(256) NOT NULL,
    token_value VARCHAR(256),
    created_at  BIGINT NOT NULL
);

CREATE TABLE clubs
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR(100) NOT NULL,
    short_name VARCHAR(20),
    created_at BIGINT NOT NULL
);

CREATE TABLE athletes
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR(100),
    gender     VARCHAR(20) NOT NULL,
    club_id    INT REFERENCES clubs (id),  
    created_at BIGINT NOT NULL
);