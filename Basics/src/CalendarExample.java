
import java.util.Calendar;
public class CalendarExample {
	public static void main(String[] args)
	{
		Calendar calendar = Calendar.getInstance();
        System.out.println("The Current Date is:" + calendar.getTime());
		System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
		System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
		System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
	}
}
