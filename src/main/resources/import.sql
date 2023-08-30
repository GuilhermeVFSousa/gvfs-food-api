INSERT INTO kitchen (id, name) VALUES (1, 'Brasileira');
INSERT INTO kitchen (id, name) VALUES (2, 'Japonesa');

INSERT INTO state (id, name) VALUES (1, 'São Paulo');

INSERT INTO city (id, name, state_id) VALUES (1, 'São Carlos', 1);

INSERT INTO permission (id, name, description) VALUES (1, 'Administrador', 'Autorizado para todas as rotas');

INSERT INTO payment_option (id, description) VALUES (1, 'Dinheiro');
INSERT INTO payment_option (id, description) VALUES (2, 'Pix');
INSERT INTO payment_option (id, description) VALUES (3, 'Cartão de Crédito');
INSERT INTO payment_option (id, description) VALUES (4, 'Cartão de Débito');

INSERT INTO restaurant (name, rate_shipping, kitchen_id, payment_option_id) VALUES ('Mc Donalds', 10.90, 1, 1);
INSERT INTO restaurant (name, rate_shipping, kitchen_id, payment_option_id) VALUES ('Lual Lanches', 3.90, 1, 2);
INSERT INTO restaurant (name, rate_shipping, kitchen_id, payment_option_id) VALUES ('Natsumi', 6.89, 2, 3);

