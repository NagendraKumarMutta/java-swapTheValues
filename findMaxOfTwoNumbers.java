public class findMaxOfTwoNumbers{
    public static void main(String args[]){
          int i = Integer.parseInt(args[0]);
          int j = Integer.parseInt(args[1]);
          if(i>j){
            System.out.println("Max number is "+i);
          }else if(j>i){
            System.out.println("Max number is "+j);
          }else{
            System.out.println("Both numbers are equal");
          }
    }
}
