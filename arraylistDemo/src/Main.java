import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        ArrayList numbers = new ArrayList();
//        numbers.add(1);
//        numbers.add(10);
//        numbers.add("Ankara");
        //System.out.println(numbers.size());
        //System.out.println(numbers.get(2));

        //numbers.set(0, 100);

        //numbers.remove(0);
        //numbers.clear(); // clear all elements
        //System.out.println(numbers.get(0));

//        for (Object i : numbers){
//            System.out.println(i);
//        }
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");

        //cities.remove("İstanbul");
        Collections.sort(cities);

        for (String city: cities){
            System.out.println(city);
        }
    }
}
