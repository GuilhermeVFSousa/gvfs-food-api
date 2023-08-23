INSERT INTO cozinha (id, nome) VALUES (1, 'Brasileira');
INSERT INTO cozinha (id, nome) VALUES (2, 'Japonesa');

INSERT INTO estado (id, nome) VALUES (1, 'São Paulo');

INSERT INTO cidade (id, nome, estado_id) VALUES (1, 'São Carlos', 1);

INSERT INTO permissao (id, nome, descricao) VALUES (1, 'Administrador', 'Autorizado para todas as rotas');

INSERT INTO forma_pagamento (id, descricao) VALUES (1, 'Dinheiro');
INSERT INTO forma_pagamento (id, descricao) VALUES (2, 'Pix');
INSERT INTO forma_pagamento (id, descricao) VALUES (3, 'Cartão de Crédito');
INSERT INTO forma_pagamento (id, descricao) VALUES (4, 'Cartão de Débito');

INSERT INTO restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) VALUES ('Mc Donalds', 10.90, 1, 1);
INSERT INTO restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) VALUES ('Lual Lanches', 3.90, 1, 2);
INSERT INTO restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) VALUES ('Natsumi', 6.89, 2, 3);

