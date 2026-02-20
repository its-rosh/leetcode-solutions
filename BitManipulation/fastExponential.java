public class fastExponential{
    public static int powerOf(int a, int n){
        int ans = 1;

        while (n>0){
            if((n & 1) != 0){
                ans = ans*a;
                //System.out.println(ans + "new ans");
            }
            a = a*a;
            n = n >>1;
            //System.out.println(a + "new a");
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(powerOf(10,5));
    }       
}