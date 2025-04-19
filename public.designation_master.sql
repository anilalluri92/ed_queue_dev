CREATE TABLE public.designation_master (
	id serial4 NOT NULL,
	code varchar(25) NULL,
	"name" varchar(100) NOT NULL,
	created_by int4 NOT NULL,
	created_date timestamp NOT NULL,
	cadre_id int4 NULL,
	department_id int4 NULL,
	"version" int4 NOT NULL,
	status bool DEFAULT true NOT NULL,
	short_name varchar(10) NULL,
	CONSTRAINT pk_designation_master PRIMARY KEY (id),
	CONSTRAINT uq_designation_master_code UNIQUE (code),
	CONSTRAINT uq_designation_master_name UNIQUE (name),
	CONSTRAINT fk_designation_master_createdby FOREIGN KEY (created_by) REFERENCES public.user_master(id) ON DELETE RESTRICT ON UPDATE CASCADE
	
);



