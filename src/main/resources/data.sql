DROP TABLE IF EXISTS reserva_programa;

CREATE TABLE reserva_programa (
    id            BIGINT,
    id_programa   VARCHAR(10),
    id_reserva    BIGINT,
    quantidade    INT,
    tempo         INT,
    data_exibicao DATE
);

DROP TABLE IF EXISTS reserva;

CREATE TABLE reserva (
     id             BIGINT,
     codigo_reserva VARCHAR(10),
     data_reserva   DATE,
     request_id     UUID
);


DROP TABLE IF EXISTS estoque;

CREATE TABLE estoque (
     id               BIGINT,
     id_programa      VARCHAR(10),
     data_exibicao    DATE,
     tempo_disponivel INT
);


INSERT INTO estoque (id, id_programa, data_exibicao, tempo_disponivel) VALUES (1, 'MAVO', '2020-09-04', 100);
INSERT INTO estoque (id, id_programa, data_exibicao, tempo_disponivel) VALUES (2, 'N19H', '2020-09-09', 100);
INSERT INTO estoque (id, id_programa, data_exibicao, tempo_disponivel) VALUES (3, 'HUCK', '2020-09-05', 40);
INSERT INTO estoque (id, id_programa, data_exibicao, tempo_disponivel) VALUES (4, 'DFAU', '2020-09-06', 100);