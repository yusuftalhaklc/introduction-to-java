import java.util.Locale;
import java.util.Random;
import java.util.stream.IntStream;

public class BankAccountManager {

    public void UpdateAccountPrice(BankAccount bankAccount){
        String name = "Yusuf Talha";

        String _name= bankAccount.getName();
        if (_name == name){
            bankAccount.setAccountPrice(76848.76);
            bankAccount.setAccountNumber("6871-56794316-6001");
            bankAccount.setIban("TR75 0001 6598 4763 1456 01");
        }//Değerler rastgele yazılmıştır.
        else {
            System.out.println("Hesap Bulunamadı.");

        }
    }
}
