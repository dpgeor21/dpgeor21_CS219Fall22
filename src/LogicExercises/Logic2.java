package LogicExercises;

public class Logic2 {

    public static boolean cigarParty(int cigars, boolean isWeekend){
        if (isWeekend){
            if (cigars >= 40 && cigars <= 80){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (cigars >= 40){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static boolean ordered(int d1, int d2, int d3){
        return (d1 > d2 && d2 > d3 || d3 > d2 && d2 > d1);
    }

    public static void main(String [] args){
        System.out.println(cigarParty(30, false) == false);
        System.out.println(cigarParty(50, false) == true);
        System.out.println(cigarParty(70, true) == true);


        System.out.println(ordered(1, 2, 3));
        System.out.println(ordered(3, 2, 1));
        System.out.println(ordered(1, 8, 5));

    }
}