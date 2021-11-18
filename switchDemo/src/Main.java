public class Main {

    public static void main(String[] args) {
        // IDE hızlı kod düzeltme format code CTRL+SHIFT+ALT+L
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("A ile Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("geçtiniz");
                break;
            case 'F':
                System.out.println("F ile geçemediniz!");
                break;
            default:
                System.out.println("Geçersiz not girişi!");
        }
    }
}
