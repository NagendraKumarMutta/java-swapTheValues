import java.util.Scanner;

class BinarySearch{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int search = in.nextInt();
        int first = 0;
        int last = n-1;
        int middle=(first+last)/2;

        while (first<=last) {
            if(arr[middle] < search){
                first = middle+1;
            }else if(arr[middle] == search){
                System.out.println(search + " found at location "+ (middle+1));
                break;
            }else{
                last = middle-1;
            }
            middle = (first + last)/2;
        }
    }
    }
