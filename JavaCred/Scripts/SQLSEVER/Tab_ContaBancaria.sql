USE JAVACRED;
GO

CREATE TABLE conta_bancaria (
    ID_CONTA INT PRIMARY KEY IDENTITY(1,1) NOT NULL ,
    TIPO_CONTA VARCHAR(1) NOT NULL,
    SALDO_CONTA DECIMAL(10, 2) NOT NULL,
    NOME_CONTA VARCHAR(40) NOT NULL,
    CPF_CONTA VARCHAR(11) NOT NULL,
    STATUS_CONTA TINYINT NOT NULL,
    NUMERO_CONTA INT NOT NULL
);
GO

SELECT * FROM conta_bancaria;
GO
