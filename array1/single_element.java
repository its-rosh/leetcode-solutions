public class SingleElement {

    public static int singleNumber(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {2, 2, 1,3,3,1,4};

        System.out.println(singleNumber(arr));
    }
}