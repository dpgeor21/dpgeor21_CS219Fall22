package ZipCodeDB;

public class Main {
    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("13617", "NY", "Canton", 75.16, 44.59,  11781);

        System.out.println(z1);

        Zipcode z2 = new Zipcode("13760", "NY", "Endwell", 76.06, 42.11, 46236);

        System.out.println(z2);

        Database db = new Database();

    }
}
