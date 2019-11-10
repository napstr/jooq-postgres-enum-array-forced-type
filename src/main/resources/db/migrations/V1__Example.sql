CREATE TYPE ExampleEnum AS ENUM ('A', 'B', 'C');

CREATE TABLE example_table
(
    id    serial PRIMARY KEY,
    enum  ExampleEnum   NOT NULL,
    enums ExampleEnum[] NOT NULL
);
