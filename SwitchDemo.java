class SwitchDemo {
    public static void main(String args[]){
        int marks = Integer.parseInt(args[0]);
        switch (marks/10) {
            case 10:
            case 9:
            case 8:
                 System.out.println("Excellent academic performance");
                 break;
            case 7 : 
                 System.out.println("Very good");
                 break;
            case 6:
                 System.out.println("Good");
                 break;
            case 5:
                 System.out.println("Work Hard");
                 break;
            case 4:
                 System.out.println("Poor performance");
                 break;
            case 3:
            case 2:
            case 1:
                 System.out.println("Very Poor Performance");
                 break;
            default:
                 System.out.println("Invalid Value Entered");
                break;
        }
    }
}
