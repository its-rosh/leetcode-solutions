public class diagonalSum {

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if (i != n - 1 - i) {   // avoid double count
                sum += matrix[i][n - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Diagonal Sum = " + diagonalSum(matrix));
    }
}
