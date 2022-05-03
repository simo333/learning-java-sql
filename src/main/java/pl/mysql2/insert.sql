INSERT INTO `users` (`id`, `name`, `email`, `password`) VALUES
(1, 'user1', 'user1@coderslab.pl', '12345'),
(2, 'user2', '222@email.pl', '4321'),
(3, 'user3', '333@email.pl', '5555');

INSERT INTO `messages` (`id`, `user_id`, `message`) VALUES
(1, 1, 'message 1 user 1'),
(2, 2, 'message 1 user 2'),
(3, 1, 'message 2 user 1'),
(4, 2, 'amessage 2 user 2');

INSERT INTO `items` (`id`, `name`, `description`, `price`) VALUES
(1, 'Bob', 'Doe', '10.00'),
(2, 'Bob', 'Doe', '51.00'),
(3, 'Bob', 'Doe', '52.00');

INSERT INTO `orders` (`id`, `description`, `created`, `user_id`) VALUES
(1, 'order 1', '2017-12-04', 1),
(2, 'order 2', '2017-12-25', 1),
(3, 'order 3', '2017-11-12', 1);

INSERT INTO `items_orders` (`item_id`, `order_id`) VALUES
(1, 1),
(2, 1);
