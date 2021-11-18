public class Main {

    public static void main(String[] args) {
	    int[] numbers = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,37};
        for(int i=2;i<numbers[0];i++)
        {
            if (numbers[0] % i == 0)
                System.out.println("Sayı asal değil");
            else
                System.out.println("Sayı asal");
        }
    }
}
