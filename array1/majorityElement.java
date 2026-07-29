public class majorityElement {

    public static int majorityElement(int[] nums) {
        int freq = 0;
        int cand = 0;

        for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                cand = nums[i];
            }

            if (cand == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }

        return cand;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int ans = majorityElement(nums);

        System.out.println("Majority Element = " + ans);
    }
}