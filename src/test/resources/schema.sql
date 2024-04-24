CREATE TABLE IF NOT EXISTS artefact
(
	id serial PRIMARY KEY,
	name varchar(80)
);

insert into artefact (name) values ('tree'), ('crystal'), ('tree'),('tree'),('box');

CREATE TABLE IF NOT EXISTS account(
                                      id serial PRIMARY KEY,
                                      account_pool_id integer,
                                      account_number VARCHAR(25),
                                      bussy BOOLEAN
);

