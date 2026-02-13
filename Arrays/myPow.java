
public class myPow{

    public static double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0,10));   // 1024.0
        System.out.println(myPow(2.1,3));    // 9.261
        System.out.println(myPow(2.0,-2));   // 0.25
    }
}