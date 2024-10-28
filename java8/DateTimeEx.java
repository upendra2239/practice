package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEx {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("current date:"+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("current time:"+time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("current date & time:"+dateTime);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		
		String FormatedDateTime = dateTime.format(format);
		
		System.out.println("formated:"+FormatedDateTime);
		
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("current zone:"+currentZone);
		
		
		LocalDate date1 = LocalDate.of(1999, Month.MARCH, 22);
		
		Period period = Period.between(date, date1);
		System.out.println("period:"+period);
	}

}
