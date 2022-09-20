package LogicExercises;

public class Logic {

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if (isBirthday) {
            if (speed <= 65){
                return 0;
            }
            else if (speed < 86){
                return 1;
            }
            else{
                return 2;
            }
        }
        else{
            if (speed <= 60){
                return 0;
            }
            else if (speed < 81){
                return 1;
            }
            else{
                return 2;
            }
        }
    }

    public static void  main(String [] args) {
        System.out.println(caughtSpeeding(60, false) == 0);
        System.out.println(caughtSpeeding(65, false) == 1);
        System.out.println(caughtSpeeding(65, true) == 0);
        System.out.println(caughtSpeeding(81, false) == 2);
        System.out.println(caughtSpeeding(81, true) == 1);

    }
}
