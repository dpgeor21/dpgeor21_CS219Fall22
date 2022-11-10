package Binary;

public class Binary {

    // takes an integer and puts it in binary

    public static void printBinary(int n){

        while (n > 0){
            System.out.print(n%2); // prints least significant bit
            n = n/2;
        }
        System.out.println();
    }

    public static void printBinary2(int n){
        if (n == 0)
            System.out.print(0);
        else{
            printBinary2(n/2);
            System.out.print(n % 2);
        }
    }

    public static String toBinary(int n){
        String r = "";
        while (n > 0){
            r = (n % 2) + r;
            n = n / 2;
        }
        return r;
    }

    public static int parseInt(String bits){

        int curr_pow_2 = 1;
        int r = 0;

        for(int i = bits.length() - 1; i >= 0; i --){
            if(bits.charAt(i) == '1') {
                r += curr_pow_2;
            }
            curr_pow_2 *= 2;
        }
        return r;
    }

    public static void main(String[] args) {
        printBinary(43); // this prints the answer backwards. Just the way we set it up
        // recursive statements help with this issue
        printBinary2(43);
        System.out.println();
        System.out.println(toBinary(43));

        System.out.println(parseInt("101011") == 43);
        System.out.println(Integer.parseInt("101011", 2));
        System.out.println(Integer.toBinaryString(43));
        System.out.println(Integer.toHexString(456));
        System.out.println(0b1111);
    }
}