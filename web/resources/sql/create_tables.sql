CREATE TABLE funcao(
	id SERIAL PRIMARY KEY,
	nome VARCHAR
);

CREATE TABLE funcionario(
	id SERIAL PRIMARY KEY,
	nome VARCHAR,
	funcao_id INTEGER REFERENCES funcao(id)
);

CREATE TABLE meta(
	id SERIAL PRIMARY KEY,
	nome VARCHAR,
	quantidade_minima INTEGER,
	porcentagem NUMERIC(3,2)
);

CREATE TABLE meta_funcionario(
	meta_id INTEGER  REFERENCES meta(id),
	funcionario_id INTEGER REFERENCES funcionario(id),
	PRIMARY KEY (meta_id, funcionario_id)
);

CREATE TABLE meta_funcao(
	meta_id INTEGER REFERENCES meta(id),
	funcao_id INTEGER REFERENCES funcao(id),
	PRIMARY KEY (meta_id, funcao_id)
);

CREATE TABLE caixa(
	id SERIAL PRIMARY KEY,
	data DATE
);

CREATE TABLE produto(
	id SERIAL PRIMARY KEY,
	nome VARCHAR,
	preco NUMERIC(20,2),
	estoque INTEGER
);

CREATE TABLE item_caixa (
	id SERIAL PRIMARY KEY,
	caixa_id INTEGER REFERENCES caixa(id),
	produto_id INTEGER REFERENCES produto(id),
	funcionario_id INTEGER REFERENCES funcionario(id),
	preco NUMERIC(20,2)
);