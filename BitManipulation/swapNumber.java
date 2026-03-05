public class swapNumber {

    public static void main(String[] args) {

        int x = 3, y = 4;

        System.out.println("Before swap: x = " + x + " and y = " + y);

        // Swap using XOR
        x = x ^ y; // 3^4 0011 ^ 0100 = now x is 0111
        y = x ^ y; // 0111 ^ 0100 = now y is 0011
        x = x ^ y; // 0111^ 0011 = now x is 0100

        System.out.println("After swap: x = " + x + " and y = " + y);
    }
}