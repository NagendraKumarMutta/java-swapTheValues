import java.util.Scanner;
class ValueFormat{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in) ;
        double i = in.nextDouble();
        System.out.println("Given number is "+i);
        System.out.println("Largest Integer of Float "+Math.ceil(i));
        System.out.println("Smallest Integer of Float "+Math.floor(i));
    }
}
