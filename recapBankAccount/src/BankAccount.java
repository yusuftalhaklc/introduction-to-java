public class BankAccount {
    private String accountNumber;
    private String iban;
    private String name;
    private String lastName;
    private double accountPrice;

    //getter
    public String getIban() {
        return iban;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAccountPrice() {
        return accountPrice;
    }

    //setter
    public void setIban(String iban) {this.iban = iban; }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountPrice(double accountPrice) {
        this.accountPrice = accountPrice;
    }
}
