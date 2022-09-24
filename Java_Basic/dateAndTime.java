import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateAndTime {
    public static void main(String[] args) {
        
        //Printing Local DAte And Time-------------
        LocalDateTime date1 = LocalDateTime.now();
        System.out.println("Current Date and Time = "+date1);


        //Printing  LocalDate--------- 
        LocalDate date = LocalDate.now();
        System.out.println("Current date = "+date);
        

        //Printing  LocalTime--------- 
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println("Current Time = "+formattedTime);

    }
}
