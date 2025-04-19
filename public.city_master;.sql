CREATE TABLE public.city_master (
	id serial4 NOT NULL,
	state_id int4 NULL,
	code varchar NULL,
	"name" varchar(100) NOT NULL,
	created_by int4 NULL,
	created_date date NOT NULL,
	status bool NULL,
	CONSTRAINT pk_citymaster_id PRIMARY KEY (id),
	CONSTRAINT uq_citymaster_name UNIQUE (name),
	CONSTRAINT fk_citymaster_createdby FOREIGN KEY (created_by) REFERENCES public.user_master(id) ON DELETE RESTRICT ON UPDATE CASCADE

);

