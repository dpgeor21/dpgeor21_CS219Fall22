package Chapter6Exercises;

public class Exercise64 {
    public static boolean isAbecerdarian(String s){
        s = s.toLowerCase(); // this is a method (defined on objects, called using . notation on an object)
        s = toLower(s); // this is a function (defined on a class, called using the name of the class, calling the object as a parameter)

        for (int i = 0; i < s.length() - 1; i ++){
            if(s.charAt(i) >= s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static boolean Abecerdarian(String s){
        int i = 0;
        while (i < s.length() - 1){
            if (s.charAt(i) >= s.charAt(i + 1)){
                return false;
            }
            i ++;
        }
        return true;
    }

    public static String toLower(String s){
        String r = "";

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (s.charAt(i) < 'a' && s.charAt(i) >= 'A'){
                r = r + (char)((ch - 'A') + 'a');
            }
            else{
                r = r + (ch);
            }
        }
        return r;

    }


    public static void main(String [] args){
        System.out.println(Abecerdarian("biopsy"));
        System.out.println(!Abecerdarian("apple"));
        System.out.println(isAbecerdarian("biopsy"));
        System.out.println(!isAbecerdarian("apple"));

        System.out.println(toLower("APPLE"));
        System.out.println(toLower("AppLe"));
    }
}