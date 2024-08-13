import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("******MULTIPLICATION TABLE******");
        for(int i=n;i<n+1; i++){
            for(int j=1; j<13; j++){
                System.out.println(i + " x " + j +" = " + (i*j));
            }
        }
    }
}
