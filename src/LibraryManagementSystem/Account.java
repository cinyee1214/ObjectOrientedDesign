package LibraryManagementSystem;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public abstract boolean resetPassword();
}
