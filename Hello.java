class findMinOfTwoNumbers{
    public static void main(String args[]){
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        if(i<j){
            System.out.println("Minimum number of two numbers is "+i);
        }else if(j<i){
            System.out.println("Minimum number of two numbers is "+j);
        }else{
            System.out.println("Both given numbers are equal");
        }
    }
}
