import java.time.LocalTime;

public class WithPrac2 {
	public static void main(String[] args) {
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalTime now_time=lt.withHour(3).withMinute(25).withSecond(24).withNano(33333);
		System.out.println(now_time);
	}
}


