public class factorial {
    public static void main(String args[]){
        int number = Integer.parseInt(args[0]);
        int result = 1;
        while (number>0) {
          result*=number;
          number--;  
        } 
        System.out.println("Factorial of given number is: "+ result);
    }
}
