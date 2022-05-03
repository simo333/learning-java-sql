package pl.mysql2;

public class VIPUser extends User {
    private Integer vipCardNumber;

    public VIPUser(String name, String lastName, String email, Integer vipCardNumber) {
        super(name, lastName, email);
        if(checkCard(vipCardNumber)) {
            this.vipCardNumber = vipCardNumber;
        } else {
            vipCardNumber = null;
        }
    }

    private boolean checkCard(int newNumber) {
        return newNumber > 999 && newNumber % 2 == 0;
    }

    public Integer getVipCardNumber() {
        return vipCardNumber;
    }

    public void setVipCardNumber(Integer vipCardNumber) {
        if(checkCard(vipCardNumber)) {
            this.vipCardNumber = vipCardNumber;
        }
    }
}
