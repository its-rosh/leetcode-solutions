public class spiralMatrix{
    
    public static int spiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow= matrix.length-1;
        int endCol=matrix[0].length-1;
//row or col who have the least anount of elements decide the no. of time the loop will run the while condition will change accordingly
        while (startRow<=endRow && startCol<=endCol){
            //top j is for COl
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right i is for Row
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom j is for Col
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left i is for Row
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;

        }
        // odd caese if we end with 
        return 0;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        spiral(matrix);
    }
}