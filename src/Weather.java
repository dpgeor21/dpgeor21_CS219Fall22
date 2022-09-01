public class Weather {
    public static double windchill(double temp //temp far
            , double velo){ // velocity in mph
        return 35.75 + 0.6215*temp + (0.4275*temp - 35.75)*(Math.pow(velo, 0.16));
    }

    public static void main(String [] args){

        int temp = 32;
        double velo = 10;

        System.out.println(windchill(temp, velo));
    }

}