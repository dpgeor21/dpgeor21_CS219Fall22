package HW5;


public class Exercise66 {
    public static boolean canSpell(String word, String tiles){
        String checkword = "";

        for(int i = 0; i < word.length(); i ++){
            char chword = word.charAt(i);

            for(int j = 0; j < tiles.length(); j ++){
                char chtile = tiles.charAt(j);

                if (chword == chtile){
                    checkword += chtile;
                    tiles = tiles.substring(0, j) + tiles.substring(j + 1);
                    break;
                }
            } // loop 1

        } // loop 2
        if (checkword.equals(word)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("hoot", "hooasafafto"));
        System.out.println(!canSpell("hello", "haxobapsrito"));
        System.out.println(!canSpell("boot", "axobasrt"));
        System.out.println(!canSpell("boot", "axbasrto"));

    }

}
