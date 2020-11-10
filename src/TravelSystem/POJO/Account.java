package TravelSystem.POJO;

import TravelSystem.EnumPackage.AccountStatus;

public class Account {
    private String id;
    private String password;
    private AccountStatus status;

    public boolean resetPassword() {
        return false;
    }
}
