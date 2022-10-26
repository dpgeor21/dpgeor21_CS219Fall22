package Exam2Study;

public class Studycode {

    public static String s_string(String s, char z) {
        String sub = null;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == z) {
                sub = s.substring(0, i);
            }
        }
        return sub;
    }


    public static void main(String[] args) {

        char char1 = 'z';
        String s2 = "bazooka";
        String s = "bamboozled";
        System.out.println(s_string(s, char1).equals("bamboo"));
        System.out.println(s_string(s2, char1).equals("ba"));

        char ch1 = '7';
        char ch2 = '9';

    }
}
