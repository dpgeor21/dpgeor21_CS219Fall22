package Exam1Study;

public class Exam1Study {
    public static double f2c(double f) {
        return 5/9.0 * (f - 32);
    }

    public static boolean firstandlast(String s){
        s = s.toLowerCase();
        if (s.charAt(0) == s.charAt(s.length() - 1)){
            return true;
        }
        else return false;
    }
    public static void main(String [] args) {
        System.out.println("Hello World");
        System.out.printf("%f", f2c(211.9));

        System.out.println(Math.round(6.02235e4));
        System.out.printf("%.3f\n", 3.14159);
        System.out.println('d' - 'a'); // weird
        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2 + 3) + "bc");
        System.out.println("bc" + 2 + 3);
        System.out.println("bc" + (2 + 3));

        int n = 12345;
        int m = 0;

        while (n !=0){
            m = (m * 10) + (n % 10);
            n = n / 10;
        }
        System.out.printf("m = %d, n = %d\n",m , n);

        System.out.println(firstandlast("Wow"));

        String s = "hippopotomonstrosesquippedaliophobia";
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('q'));
        System.out.println(s.indexOf('o'));
        System.out.println(s.substring(s.indexOf('m'),16));
        System.out.println(s.charAt(s.length() - 1));

    }
}
