CREATE TABLE public.country_master (
	id serial4 NOT NULL,
	code varchar(5) NOT NULL,
	"name" varchar(100) NOT NULL,
	created_by int4 NULL,
	created_date date NOT NULL,
	active_status bool NOT NULL,
	CONSTRAINT pk_country_master PRIMARY KEY (id),
	CONSTRAINT uq_country_master_code UNIQUE (code),
	CONSTRAINT uq_country_master_name UNIQUE (name),
	CONSTRAINT fk_country_createdby FOREIGN KEY (created_by) REFERENCES public.user_master(id) ON DELETE RESTRICT ON UPDATE CASCADE,
	CONSTRAINT fk_country_master_createdby FOREIGN KEY (created_by) REFERENCES public.user_master(id) ON DELETE RESTRICT ON UPDATE CASCADE
	
);

