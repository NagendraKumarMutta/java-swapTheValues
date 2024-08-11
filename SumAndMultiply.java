import java.util.Scanner;

public class SumAndMultiply{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int i = in.nextInt();
      int result = 0;
      int temp = i;
      while(temp>0){
        result+=temp;
        temp--;
      }
      System.out.println("sum of digit number: "+result);

      result = 1;
      temp=i;
      while (temp>0) {
        result*=temp;
        temp--;
      }

      System.out.println("product of Digit Number: "+result);
    }
}
