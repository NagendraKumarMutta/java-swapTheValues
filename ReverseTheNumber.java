import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int number = n;
        int reverseNumber=0;
        while(n!=0){
          int value = n%10;
          reverseNumber=(reverseNumber*10)+value;
          n/=10;
        }
        System.out.println("Reversed number is "+reverseNumber);
        if(number == reverseNumber)System.out.println("The given number is a Palindrome");
    }
}
