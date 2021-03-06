DROP TABLE user IF EXISTS;

create table user(
  id       bigint GENERATED BY DEFAULT AS IDENTITY,
  username VARCHAR(40),
  name     VARCHAR(20),
  age      INT(3),
  balance  DECIMAL(10, 2),
  primary key(id)
);