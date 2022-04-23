package pl.mysql.onetoone;

public class Main01 {
    public static void main(String[] args) {
        String queryCreateColumn = "create table client_address\n" +
                "(\n" +
                "    client_id INT UNSIGNED,\n" +
                "    city      VARCHAR(100) NOT NULL,\n" +
                "    street    VARCHAR(100),\n" +
                "    house_nr  VARCHAR(10)  NOT NULL,\n" +
                "    primary key (client_id),\n" +
                "    foreign key (client_id) REFERENCES clients (id) ON DELETE CASCADE\n" +
                ")";

        String queryInsertIntoClients = "INSERT INTO clients (name, surname)\n" +
                "VALUES ('John', 'Doe'),\n" +
                "       ('Artur', 'Pietrucha'),\n" +
                "       ('Jan', 'Kowalski')";

        String queryInsertIntoAddress = "INSERT INTO client_address\n" +
                "VALUES (1, 'Warszawa', 'Krakowska', '15'),\n" +
                "       (2, 'Kraków', 'Warszawska', '20'),\n" +
                "       (3, 'Gdańsk', 'Gnieźnieńska', '30')";

        String queryDeleteClient = "delete\n" +
                "FROM clients\n" +
                "WHERE id = 3;";


    }
}
