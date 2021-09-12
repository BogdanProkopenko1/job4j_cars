CREATE TABLE car(
    id serial primary key,
    model varchar(100),
    engine_id int not null references engine(id)
);

CREATE TABLE engine(
    id serial primary key,
    model varchar(100),
    power int
);

CREATE TABLE driver(
    id serial primary key,
    name varchar(100)
);

CREATE TABLE history(
    id serial primary key,
    driver_id int not null references driver(id),
    car_id int not null references car(id)
);