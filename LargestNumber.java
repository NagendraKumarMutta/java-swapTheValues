import java.util.*;

public class LargestNumber {
    public static void main(String args[]){
           Scanner in = new Scanner(System.in);
           int x, y,z;
           x = in.nextInt();
           y = in.nextInt();
           z = in.nextInt();
           if(x>y && x>z ){
              System.out.println("First number is the largest number");
           }else if(y>x && y>z){
            System.out.println("Second number is the largest number");
           }else if(z>x && z>y){
            System.out.println("Third number is the larget number");
           }else{
            System.out.println("Numbers you entered are not distinct");
           }
    }
}
