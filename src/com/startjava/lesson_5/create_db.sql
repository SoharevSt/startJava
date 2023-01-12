CREATE
DATABASE test_db;
\c test_db;
DROP TABLE IF EXISTS jaegers;
CREATE TABLE jaegers
(
    id_jaeger  INT         NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    model_name VARCHAR(30) NOT NULL,
    mark       VARCHAR(20) NOT NULL,
    height     NUMERIC     NOT NULL,
    weight     NUMERIC     NOT NULL,
    status     VARCHAR(20) NOT NULL,
    origin     VARCHAR(20) NOT NULL,
    launch     INT         NOT NULL,
    kaiju_kill INT
);
\ir init_db.sql;
\ir queries.sql;