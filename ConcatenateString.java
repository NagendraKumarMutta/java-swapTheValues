import java.util.Scanner;

public class ConcatenateString {
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println(args[0]);
      System.out.println(args[1]);
      System.out.println(args[2]);
      String result = "";
      for(int i=1; i<=n; i++){
          result+=i+" ";
      } 
      // System.out.println(result);
      }
    }