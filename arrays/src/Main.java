public class Main {

    public static void main(String[] args) {

      /*  String[] students = new String[3];
        students[0] ="Yusuf";
        students[1] ="Talha";
        students[2] = "Esma";
        for(String stu:students){
            System.out.println(stu);
        }*/
        double[] myList = {7.2, 1.3, 4.3, 5.6};
        double max = 0;
        for (double number:myList){
            if(max<number){
                max = number;
            }
        }
        System.out.println("Max Number is "+max);
    }
}
