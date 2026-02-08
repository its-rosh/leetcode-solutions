public class shortesPath{
    public static float  shortesPath(String path){
        int x = 0;
        int y = 0;
        for (int i = 0;i<path.length();i++){
            char dir = path.charAt(i);
            switch (dir) {
                case 'W' -> x--;
                case 'N' -> y++;
                case 'E' -> x++;
                default -> y--;
            }
            // two ways to right the code 
            //if (dir == 'W'){
            //     x--;
            // }
            // else if (dir == 'N'){
            //     y++;
            // }
            // else if (dir == 'E'){
            //     x++;
            // }
            // else {
            //     y--;
            // }
    }
    int square = (x*x)+(y*y);
    System.out.println("this is X and Y   " + y +" " + x);
    return(float) (Math.sqrt(square));
}
    public static void main(String[] arg){
        String path="WNEENESENNN";
        System.out.println(shortesPath(path));
    }
}