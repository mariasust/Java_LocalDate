import java.util.*;
import java.lang.*;
import java.io.*;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;  
import java.time.format.DateTimeFormatter;

// The main method must be in a class named "Main".

class Main {
  
public static void main(String[] args) throws Exception {
//Local date
System.out.println("Example for Local date");
System.out.println("**************");
LocalDateTime dateTime = LocalDateTime.parse("2016-12-08T10:20:30");
LocalDate date1 = LocalDate.parse("2016-12-18");
LocalDate date2 = LocalDate.parse("2016-12-15");
System.out.println("date1: "+date1);
System.out.println("date2: "+date2);
int diff=Math.abs(date1.get(ChronoField.DAY_OF_MONTH)-date2.get(ChronoField.DAY_OF_MONTH)); 
System.out.println("Difference in days of the Month: "+diff);

System.out.println();
LocalDate date3 = LocalDate.parse("2016-11-08");
LocalDate date4 = LocalDate.parse("2016-09-18");
System.out.println("date: "+date3+" DAY_OF_YEAR: "+date3.get(ChronoField.DAY_OF_YEAR));
System.out.println("date: "+date4+" DAY_OF_YEAR: "+date4.get(ChronoField.DAY_OF_YEAR));
System.out.println("Difference in day of the Year");
System.out.println(date3.get(ChronoField.DAY_OF_YEAR)-date4.get(ChronoField.DAY_OF_YEAR)); 
System.out.println();
LocalTime hourMinute = LocalTime.parse("13:20", DateTimeFormatter.ofPattern("H:m"));
System.out.println("hourMinute: "+hourMinute+" Hour: "+hourMinute.get(ChronoField.HOUR_OF_DAY));

    }
}


