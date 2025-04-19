CREATE TABLE public.user_master(
	id serial4 NOT NULL,
	user_name varchar(100) NOT NULL,
	"password" varchar(250) NOT NULL,
	status bool DEFAULT true NULL,
	user_type varchar(100) NULL,
	email_id varchar(150) NULL,
	onetime_password varchar(200) NULL,
	reset_token varchar(50) NULL,
	mobile_number varchar(10) NULL,
	sess_id varchar(100) NULL,
	last_login timestamp NULL,
	CONSTRAINT pk_usermaster_id PRIMARY KEY (id),
	CONSTRAINT uq_usermaster_mobile_number UNIQUE (mobile_number) 

		
);
        ALTER TABLE public.user_master
        ADD COLUMN created_date date NOT NULL;

		SELECT * FROM public.user_master;

