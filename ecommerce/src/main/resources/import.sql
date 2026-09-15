insert into categoria (nome, descricao) values ('Livros', 'Livros Técnicos');

insert into categoria (nome, descricao) values ('Eletrônicos', 'Equipamentos Eletrônicos');

insert into categoria (nome, descricao) values ('Escritório', 'Material de Escritório');

insert into categoria (nome, descricao) values ('Roupas', 'Vestuário e acessórios');

insert into categoria (nome, descricao) values ('Esportes', 'Artigos esportivos');

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Caderno Universitário', 'Caderno com 200 folhas', 24.90, 50, 3);

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Caneta Azul', 'Caneta esferográfica azul', 3.50, 100, 3);

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Camiseta Básica', 'Camiseta de algodão', 49.90, 25, 4);

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Bola de Futebol', 'Bola oficial para futebol', 99.90, 10, 5);

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Luminária de Mesa', 'Luminária para escritório', 79.90, 18, 3);

insert into cliente (nome, email, telefone) values ('Ana Souza', 'ana.souza@email.com', '11987654321');

insert into cliente (nome, email, telefone) values ('Carlos Oliveira', 'carlos.oliveira@email.com', '11976543210');

insert into cliente (nome, email, telefone) values ('Mariana Santos', 'mariana.santos@email.com', '11965432109');

insert into cliente (nome, email, telefone) values ('João Pereira', 'joao.pereira@email.com', '11954321098');

insert into cliente (nome, email, telefone) values ('Fernanda Lima', 'fernanda.lima@email.com', '11943210987');

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-10 10:25:00', 'Concluído', 49.80, 1);

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-11 14:10:00', 'Concluído', 3.50, 2);

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-12 09:40:00', 'Pendente', 149.70, 3);

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-13 16:15:00', 'Enviado', 99.90, 4);

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-14 17:55:00', 'Pendente', 159.80, 5);

insert into item_pedido (quantidade, valor_unitario, produto_id, pedido_id) values (2, 24.90, 1, 1);

insert into item_pedido (quantidade, valor_unitario, produto_id, pedido_id) values (1, 3.50, 2, 2);

insert into item_pedido (quantidade, valor_unitario, produto_id, pedido_id) values (3, 49.90, 3, 3);

insert into item_pedido (quantidade, valor_unitario, produto_id, pedido_id) values (1, 99.90, 4, 4);

insert into item_pedido (quantidade, valor_unitario, produto_id, pedido_id) values (2, 79.90, 5, 5);

insert into pagamento (valor, data, status, tipo, pedido_id) values (49.80, '2026-09-10 10:30:00', 'Pago', 'Pix', 1);

insert into pagamento (valor, data, status, tipo, pedido_id) values (3.50, '2026-09-11 14:15:00', 'Pago', 'Cartão de Crédito', 2);

insert into pagamento (valor, data, status, tipo, pedido_id) values (149.70, '2026-09-12 09:45:00', 'Pendente', 'Boleto', 3);

insert into pagamento (valor, data, status, tipo, pedido_id) values (99.90, '2026-09-13 16:20:00', 'Pago', 'Cartão de Débito', 4);

insert into pagamento (valor, data, status, tipo, pedido_id) values (159.80, '2026-09-14 18:00:00', 'Pendente', 'Pix', 5);