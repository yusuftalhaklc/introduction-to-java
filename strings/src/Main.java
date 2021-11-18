import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String message = "Bugün hava çok güzel";
        System.out.println(message.length());
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println("5. eleman: "+ message.charAt(4));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("l"));
        char[] charArray = new char[5];
        message.getChars(0,5,charArray,0);
        System.out.println(charArray);
        System.out.println(message.indexOf('a'));
        System.out.println(message.replace('a','æ'));
        System.out.println(message.substring(6));
        System.out.println(message.substring(6,10));
        for(String kelime:message.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());


    }
}
