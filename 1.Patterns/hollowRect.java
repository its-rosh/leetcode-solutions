public class hollowRect{
    public static int hollow_rectangle( int totalCol, int totalRow){
        for(int i =1; i<=totalRow;i++){
            for(int j=1;j<=totalCol;j++){
                if(i==1 || j==1 || i==totalRow || j==totalCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }return 0;
    }
    public static void main(String []arg){
        hollow_rectangle(7, 7);
    }
}