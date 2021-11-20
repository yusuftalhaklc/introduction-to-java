public class Main {

    public static void main(String[] args) {

        System.out.println(total2(5,9,5,6,98,7));
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void remove() {
        System.out.println("Removed");
    }

    public static void update() {
        System.out.println("Updated");
    }
    public static int total(int num1, int num2){
        return num1+num2;
    }
    public static int total2(int... numbers){
        int totalNumbers = 0;
        for (int num:numbers){
            totalNumbers += num;
        }
        return totalNumbers;
    }


}
