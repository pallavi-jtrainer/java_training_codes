import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToDate {

	public static void main(String[] args) {
		String strDate = "29/07/2020";
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate today = LocalDate.parse(strDate, dt);
		
		System.out.println(today);
		
		

	}

}
