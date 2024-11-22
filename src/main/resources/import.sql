INSERT INTO tb_categoria (descricao) VALUES ('Curso');
INSERT INTO tb_categoria (descricao) VALUES ('Oficina');

INSERT INTO tb_participante (nome, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_atividade (categoria_id, nome, descricao, preco) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80);
INSERT INTO tb_atividade (categoria_id, nome, descricao, preco) VALUES (2, 'Oficina de Github', 'Controle versões de seus projetos', 50);

INSERT INTO tb_bloco (atividade_id, inicio, fim) VALUES (1, '2017-09-25 08:00:00', '2017-09-25 11:00:00');
INSERT INTO tb_bloco (atividade_id, inicio, fim) VALUES (2, '2017-09-25 14:00:00', '2017-09-25 18:00:00');
INSERT INTO tb_bloco (atividade_id, inicio, fim) VALUES (2, '2017-09-26 08:00:00', '2017-09-25 11:00:00');

INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (1, 1);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (1, 2);

INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (2, 1);

INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (3, 1);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (3, 2);

INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (4, 2);