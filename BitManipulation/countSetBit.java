public class countSetBit {
    public  static int countBits(int n){
        int count =0;
        while (n> 0){
            if( (n & 1) != 0){ //we are checking least significant bit LSB
                count ++;
            }
            n= n>>1;
        }
        return count;
    }
    public static void main (String agr[]){
        System.out.println(countBits(2));
    }
}