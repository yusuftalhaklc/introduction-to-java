public class Main {

    public static void main(String[] args) {
        String[] cityNames = {"Istanbul","Ankara","İzmir","Tekirdağ","Edirne","Ağrı","Konya","Sivas","Tunceli"};
        String[][] cities = new String[3][3];
        int counter = 0;
        for (int i = 0;i < cities.length;i++){
            for (int j = 0;j < cities.length;j++){
                cities[i][j] = cityNames[counter];
                System.out.println(cities[i][j]);
                counter++;

            }
        }
    }
}
