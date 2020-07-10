DROP TABLE IF EXISTS proposta;
DROP TABLE IF EXISTS cliente;

CREATE TABLE cliente (
  id            BIGINT AUTO_INCREMENT   PRIMARY KEY,
  nome          VARCHAR(250)            NOT NULL,
  cpf           BIGINT                  NOT NULL,
  sexo          VARCHAR(50)             NOT NULL,
  idade         INT                     NOT NULL,
  estado_civil   VARCHAR(50)             NOT NULL,
  uf            VARCHAR(50)             NOT NULL,
  quantidade_dependentes INT             NOT NULL,
  renda         INT                     NOT NULL
);

INSERT INTO cliente (nome, idade, cpf, sexo, estado_civil, uf, quantidade_dependentes, renda) VALUES
    ('Lucas',   28 , 12164856749, 'M', 'solteiro', 'SC', 0, 2500),
    ('Ana',     17 , 12164858238, 'F', 'solteiro', 'SP', 0, 1000),
    ('Pedro',   68 , 12164851289, 'M', 'casado', 'SC', 3, 8000),
    ('Paula',   61 , 12164854282, 'F', 'casado', 'RJ', 3, 5000),
    ('João',    56 , 12164857277, 'M', 'divorciado', 'RJ', 2, 2000),
    ('Maria',   45 , 12164857266, 'F', 'divorciado', 'SP', 1, 2000),
    ('José',    30 , 12164851251, 'M', 'casado', 'MA', 2, 8000),
    ('Dinae',   33 , 12164849254, 'F', 'casado', 'SP', 1, 10000),
    ('Marcos',  19 , 12164858840, 'M', 'solteiro', 'SC', 1, 400),
    ('Suzan',   63 , 12164857784, 'F', 'viuva', 'MA', 3, 1500),
    ('Luci',    28 , 12164856749, 'F', 'solteiro', 'SC', 2, 2500),
    ('Roberto', 16 , 12164858737, 'M', 'solteiro', 'SP', 0, 500),
    ('Bruno',   30 , 12164851251, 'M', 'casado', 'MA', 5, 8000),
    ('Ariel',   33 , 12164849254, 'F', 'viuva', 'SP', 0, 10000);

CREATE TABLE proposta (
  id                    INT AUTO_INCREMENT  PRIMARY KEY,
  id_cliente             BIGINT              NOT NULL,
  resultado_analise      VARCHAR(50)         NOT NULL,
  limite_credito_cliente  VARCHAR(250)        NULL,
  valor_credito          INT                 NOT NULL,
  foreign key (id_cliente) references cliente(id)
);

