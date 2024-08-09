import java.util.Scanner;

class ArmStrong{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp=n;
        int digits=0;
        while (temp!=0){
            digits++;
            temp/=10;
        }

        temp = n;
        int remainder=0; 
        int sum=0;
        while (temp!=0) {
             remainder = temp%10;
             sum += power(remainder, digits);
             temp/=10;
        }
        if(sum == n){
            System.out.println(n + " is an Armstrong number");
        }else{
            System.out.println(n + " is not an Armstrong number");
        }
    }

    public static int power(int r, int d){
            int c=0; int p=1;
            for(c=0; c<d; c++){
                p *= r;
            }
            return p;
        }
}