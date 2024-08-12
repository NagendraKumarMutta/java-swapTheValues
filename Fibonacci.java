public class Fibonacci {
    public static void main(String args[]){
      int n = Integer.parseInt(args[0]);
      System.out.println(" "+0+" ");
      int f1, f2=0,f3=1;
      for(int i=0; i<(n-1); i++){
        System.out.println(" "+f3+" ");
        f1 = f2; f2 = f3;
        f3 = f1+f2;
      }
    }
  
}