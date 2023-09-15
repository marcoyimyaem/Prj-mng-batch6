import java.time.*;

public class IfSample {

    public static void main(String[] args) {
        if(LocalTime.now().getHour()>18)
            System.out.println("Good evening");
        else if(LocalTime.now().getHour()>11)
            System.out.println("Good afternoon");
        else if(LocalTime.now().getHour()<11)
            System.out.println("Good Morning");
        else
            System.out.println("invalid time");

        if(LocalTime.now().getHour()>=17)
            System.out.println("Take a break");
        int x = LocalDate.now().getDayOfWeek().getValue();
        switch (7){
            case 1: System.out.println("Monday again");
                    break;
            case 2: System.out.println("Tuesday again");
                    break;
            case 3: System.out.println("Wednesday  again");break;
            case 4: System.out.println("Thursday again");break;
            case 5: System.out.println("Friday again");break;
            case 6: System.out.println("Saturday again");break;
            case 7: System.out.println("Sunday again");break;
            default: System.out.println("Holiday again");
        }
    }
}
