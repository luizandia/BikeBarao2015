CREATE TABLE Localizacao
(
	cep VARCHAR(8)NOT NULL,
	rua VARCHAR(255)NOT NULL,
	bairro VARCHAR(255)NOT NULL,
	cidade VARCHAR(255)NOT NULL,
	PRIMARY KEY (CEP)
);

CREATE TABLE Estacao
(
	id VARCHAR(255) NOT NULL,
	qtd_armazenamento VARCHAR(255) NOT NULL,
	qtd_ocupada VARCHAR(255) NOT NULL,
	cep VARCHAR(255) NOT NULL,
	num VARCHAR(255) NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (cep) REFERENCES Localizacao(cep)
);

CREATE TABLE Cartao
(
	numero VARCHAR(255) NOT NULL,
	saldo VARCHAR(255) NOT NULL,
	estado VARCHAR(255) NOT NULL,
	tipo VARCHAR(255) NOT NULL,
	validade TIMESTAMP NOT NULL,
	PRIMARY KEY (numero)
);

CREATE TABLE Usuario
(
	cpf VARCHAR(255)NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento TIMESTAMP NOT NULL,
	numero_cartao VARCHAR(255) NOT NULL,
	PRIMARY KEY (cpf),
	FOREIGN KEY (numero_cartao) REFERENCES Cartao(numero)
);

CREATE TABLE Fornecedor
(
	cnpj VARCHAR(255) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	PRIMARY KEY (CNPJ)
);

CREATE TABLE Bicicleta
(
	id VARCHAR(255) NOT NULL,
	tamanho VARCHAR(255) NOT NULL,
	modelo VARCHAR(255) NOT NULL,
	estado VARCHAR(255) NOT NULL,
	ativo BOOLEAN NOT NULL,
	cnpj_fornecedor VARCHAR(255) NOT NULL,
	id_estacao VARCHAR(255) NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (cnpj_fornecedor) REFERENCES Fornecedor(cnpj),
	FOREIGN KEY (id_estacao) REFERENCES Estacao(id)
);

CREATE TABLE Aluguel
(
	ID_ALUGUEL VARCHAR(255) NOT NULL,
	ID_BICICLETA VARCHAR(255) NOT NULL,
	CPF_USUARIO VARCHAR(255) NOT NULL,
	DATA_INICIO TIMESTAMP NOT NULL,
	DATA_FIM TIMESTAMP,
	ID_ESTACAO_INICIO VARCHAR(255) NOT NULL,
	ID_ESTACAO_FIM VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID_ALUGUEL),
	FOREIGN KEY (ID_BICICLETA) REFERENCES Bicicleta(ID_BICICLETA),
	FOREIGN KEY (CPF_USUARIO) REFERENCES Usuario(CPF),
	FOREIGN KEY (ID_ESTACAO_INICIO) REFERENCES Estacao(ID_ESTACAO),
	FOREIGN KEY (ID_ESTACAO_FIM) REFERENCES Estacao(ID_ESTACAO)
);

CREATE TABLE Conserta
(
	id VARCHAR(255) NOT NULL
	id_bicicleta VARCHAR(255) NOT NULL,
	cnpj_fornecedor VARCHAR(255) NOT NULL,
	data_inicio TIMESTAMP NOT NULL,
	data_fim TIMESTAMP,
	prazo TIMESTAMP NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (id_bicicleta) REFERENCES Bicicleta(id),
	FOREIGN KEY (cnpj_fornecedor) REFERENCES Fornecedor(CNPJ)
);

CREATE TABLE Armazena
(
	ID_ESTACAO VARCHAR(255) NOT NULL,
	ID_BICICLETA VARCHAR(255) NOT NULL,
	DATA_INICIO VARCHAR(255) NOT NULL,
	DATA_FIM VARCHAR(255),
	PRIMARY KEY (ID_BICICLETA, ID_ESTACAO, DATA_INICIO),
	FOREIGN KEY (ID_BICICLETA) REFERENCES Bicicleta(ID_BICICLETA),
	FOREIGN KEY (ID_ESTACAO) REFERENCES Estacao(ID_ESTACAO)
);