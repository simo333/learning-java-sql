package pl.homeworks.mysql.first;

public class Main03 {
     public String insertIntoImages =
             "INSERT INTO images(offer_id, src, dimension) VALUES (1, 'url', '100x100');" +
             "INSERT INTO images(offer_id, src, dimension) VALUES (2, 'url2', '200x100');" +
             "INSERT INTO images(offer_id, src, dimension) VALUES (3, 'url3', '300x100');" +
             "INSERT INTO images(offer_id, src, dimension) VALUES (4, 'url4', '400x100');" +
             "INSERT INTO images(offer_id, src, dimension) VALUES (5, 'url5', '500x100');";

     public String insertIntoUsersCompanies =
             "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
                     "VALUES (1, 'name1', 1234567890, 'ulica1', '12', '123456789', '62432', 1.2, 1.2, CURRENT_DATE);";

}
