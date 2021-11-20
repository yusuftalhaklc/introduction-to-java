public class Main {

    public static void main(String[] args) {
        // reference type
        // camelCasing
        /*  stack ----------- heap
        101  cM    -->  {customerManager}
        102  cM2   -->  {customerManager}
        */
        customerManager customerManager = new customerManager();
        customerManager.add();
        customerManager.update();

        int num1 = 10;
        int num2 = 20;
        num2 = num1;
        num1 = 30;
        System.out.println(num2);

        int[] numbers = new int[]{1,2,3};
        int[] numbers2 = new int[]{4,5,6};
        numbers2 = numbers;
        numbers[0] = 10;
        System.out.println(numbers2[0]);

    }
}
