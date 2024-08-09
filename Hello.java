import java.util.Scanner;

class BubbleSort{
    public static void main(String args[]){
           Scanner in = new Scanner(System.in);
           System.out.println("How many number you want to sort with BubbleSort Algorithm");
           int n = in.nextInt();
           int arr[] = new int[n];
           int swap = 0;

           System.out.println("Enter "+n+" elements to sort");
           for(int i=0; i<n; i++){
             arr[i] = in.nextInt();
           }

           for(int i=0; i<(n-1);i++ ){
            for(int j=0; j<(n-i-1); j++){
                if(arr[j]>arr[j+1]){
                   swap = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = swap;
                }
            }
           }
           System.out.println("Sorting elements are: ");
           for(int i=0; i<n; i++){
            System.out.println(arr[i]);
           }
    }
}
