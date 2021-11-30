import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("Book", "Kitap");
        dict.put("Table", "Masa");
        dict.put("Computer", "Bilgisayar");

        for (String item:dict.keySet()) // sıralı gelmez
        {System.out.println("Eleman : "+item+" Değer : "+dict.get(item));}

        dict.remove("Table");
        System.out.println(dict.get("Table"));

    }
}
