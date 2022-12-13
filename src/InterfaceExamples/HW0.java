package InterfaceExamples;

public class HW0 implements HW0_Specification{

    public int sod (int n){
        int sum = 0;
        while (n > 0){
            sum += n%10;
            n = n/ 10;
        }
        return sum;
        }

    public static void main(String[] args) {
        HW0 hw0 = new HW0(); // calls the default constructor
        System.out.println(hw0.sod(4539) == 21);
    }
}
