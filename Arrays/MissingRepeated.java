
public class MissingRepeated {

    // Function to find repeating and missing values
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        int[] freq = new int[N + 1];

        // Count frequencies
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= N; i++) {
            if (freq[i] == 2) repeating = i;
            if (freq[i] == 0) missing = i;
        }

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {

        int[][] grid1 = {
                {1, 3},
                {2, 2}
        };

        int[] ans1 = findMissingAndRepeatedValues(grid1);
        System.out.println("Repeating: " + ans1[0] + ", Missing: " + ans1[1]);

        int[][] grid2 = {
                {9, 1, 7},
                {8, 9, 2},
                {3, 4, 6}
        };

        int[] ans2 = findMissingAndRepeatedValues(grid2);
        System.out.println("Repeating: " + ans2[0] + ", Missing: " + ans2[1]);
    }
}
