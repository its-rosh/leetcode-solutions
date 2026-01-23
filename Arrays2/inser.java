public class inser{
    public static void inser(int arr[]){
        for (int i = 1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]={2,5,1,7};
        inser(arr);

        for (int x:arr){
            System.out.println(x+ " ");
        }
    }
}