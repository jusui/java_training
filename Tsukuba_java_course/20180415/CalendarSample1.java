import java.util.Calendar;
import static java.lang.System.*;

public class CalendarSample1 {
    public static void main(String[] args) {
	int year, month, day;

	// インスタンスを習得
	Calendar datenow = Calendar.getInstance();
	
	// Year
	year = datenow.get(datenow.YEAR);

	// Month
	month = datenow.get(datenow.MONTH) + 1;

	// Day
	day = datenow.get(datenow.DATE);

	out.println("今日は，" + year + "年" + month + "月" + day + "日です。");
    }
}
