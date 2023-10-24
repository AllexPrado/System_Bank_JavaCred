USE JAVACARD;
GO

CREATE TABLE tipo_bancaria (
    ID_TIPO INT PRIMARY KEY,
    TRANSACAO_TIPO VARCHAR(50)
);
GO

INSERT INTO tipo_bancaria (ID_TIPO, TRANSACAO_TIPO) VALUES (1, 'pagamento');
INSERT INTO tipo_bancaria (ID_TIPO, TRANSACAO_TIPO) VALUES (2, 'deposito');
INSERT INTO tipo_bancaria (ID_TIPO, TRANSACAO_TIPO) VALUES (3, 'saque');
INSERT INTO tipo_bancaria (ID_TIPO, TRANSACAO_TIPO) VALUES (4, 'transferencia');
GO

SELECT * FROM tipo_bancaria;
GO