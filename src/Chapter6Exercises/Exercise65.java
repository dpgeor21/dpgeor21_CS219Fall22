package Chapter6Exercises;

public class Exercise65 {
    // A word is a 'doubloon' if every letter appears twice

    public static boolean isDoubloon(String s){
        //returns true if ever letter in the string appears exactly twice

        for (int i = 0; i < s.length(); i++){
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count ++;
                }

                } // for
            if (count < 2){
                return false;
            }

        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(isDoubloon("abba"));
    }
}
