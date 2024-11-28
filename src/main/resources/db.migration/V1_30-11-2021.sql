SELECT CONSTRAINT_NAME FROM information_schema.constraint_column_usage
WHERE table_name = 'usuarios_acessos' AND COLUMN_NAME = 'acesso_id'
AND CONSTRAINT_NAME <> 'unique_acesso_user';

ALTER TABLE usuarios_acessos DROP CONSTRAINT "ukqs91qokws6i46m1vnsoakivh1";