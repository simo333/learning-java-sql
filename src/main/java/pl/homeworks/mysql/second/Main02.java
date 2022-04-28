package pl.homeworks.mysql.second;

public class Main02 {
    public String queryRelationImages = "ALTER TABLE images ADD FOREIGN KEY (offer_id) REFERENCES offers(id)";

    public String queryRelationUsersCompanies = "ALTER TABLE users_companies ADD FOREIGN KEY (user_id) REFERENCES users(id)";

}
