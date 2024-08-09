import java.util.Scanner;

class FahernheitToCelcius{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        int Temperature = in.nextInt();
        int celcius = ((Temperature - 32)*5)/9;
        System.out.println("Temperature in celcius is: "+celcius+"c");
    }
}
