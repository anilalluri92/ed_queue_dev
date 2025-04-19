CREATE TABLE public.email_message (
	id serial4 NOT NULL,
	config_id int4 NULL,
	mail_subject varchar(150) NOT NULL,
	to_address text NULL,
	cc_address text NULL,
	bcc_address text NULL,
	mail_message text NULL,
	content_type text NULL,
	attachment_path text NULL,
	remarks varchar(150) NULL,
	created_by int4 NULL,
	created_date timestamp NOT NULL,
	modified_by int4 NULL,
	modified_date timestamp NULL,
	mail_sent bpchar(1) NULL,
	important_mail bpchar(1) NULL,
	"version" int4 NULL,
	sent_by_scheduler varchar(10) NULL,
	created_from_ip varchar(25) NULL,
	modified_from_ip varchar(25) NULL,
	CONSTRAINT pk_email_message PRIMARY KEY (id),
	CONSTRAINT fk_email_message_createdby FOREIGN KEY (created_by) REFERENCES public.user_master(id) ON DELETE RESTRICT ON UPDATE CASCADE,
	CONSTRAINT fk_email_message_modifiedby FOREIGN KEY (modified_by) REFERENCES public.user_master(id) ON DELETE RESTRICT ON UPDATE CASCADE
);



