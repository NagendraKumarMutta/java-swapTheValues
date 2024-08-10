import java.util.*;

class DisplayCureentTimeAndDate{
    public static void main(String args[]){
        GregorianCalendar date = new GregorianCalendar();
        int day = date.get(Calendar.DAY_OF_MONTH);
        int month = date.get(Calendar.MONTH);
        int year = date.get(Calendar.YEAR);
        int sec = date.get(Calendar.SECOND);
        int minute = date.get(Calendar.MINUTE);
        int hour = date.get(Calendar.HOUR);
        System.out.println(day+"/"+(month+1)+"/"+year);
        System.out.println(hour+" : "+minute + " : "+ sec);
    }
}
