public class Main {

    public static void main(String[] args) {
	BankAccount bankAccount = new BankAccount();
    BankAccountManager bankAccountManager = new BankAccountManager();
    bankAccount.setName("Yusuf Talha");
    bankAccount.setLastName("Kılıç");
    bankAccountManager.UpdateAccountPrice(bankAccount);
    System.out.println(
             "Merhaba         "+bankAccount.getName()+" "+bankAccount.getLastName()+"\n"
            +"Hesap Numarası : "+bankAccount.getAccountNumber()+"\n"
            +"İban           : "+bankAccount.getIban()+"\n"
            +"Bakiye         : "+bankAccount.getAccountPrice() +" TL"

    );
    }
}
