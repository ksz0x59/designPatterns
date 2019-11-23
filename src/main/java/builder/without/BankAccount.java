package builder.without;

public class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public BankAccount(long accountNumber, String owner, String branch, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.branch = branch;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    //Getters and setters omitted for brevity.

    public static void main(String[] args) {
        BankAccount account = new BankAccount(456L, "Marge", "Springfield", 100.00, 2.5);
        BankAccount anotherAccount = new BankAccount(789L, "Homer", null, 2.5, 100.00);  //Oops!
        // for anotherAccount balance will double every month !!!
    }

}
