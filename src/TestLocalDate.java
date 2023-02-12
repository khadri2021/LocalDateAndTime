import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TestLocalDate {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));

//		System.out.println("Day of Month : " + date.getDayOfMonth());
//		System.out.println("Day of Year : " + date.getDayOfYear());
//		System.out.println("Day of Week : " + date.getDayOfWeek());
//		System.out.println("Day of ERA : " + date.getEra());
//		System.out.println("Day of Month : " + date.getMonth());
 
		
		LocalDateTime minusDays = date.minusDays(6);
		if (minusDays.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			System.out.println("Today is Sunday and Holiday");
			System.out.println(minusDays);
		} else {
			System.out.println("Today is Not Sunday and not Holiday ");
			System.out.println(minusDays);
			System.out.println(minusDays.getDayOfWeek());
		}

	}
}
