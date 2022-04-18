package apresentacao;

import java.util.Calendar;

public class CalendarPart1 {
	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		System.out.println(calendario);

		
		calendario.add(Calendar.YEAR, 0); 
		Integer ano = calendario.get(Calendar.YEAR); 
		System.out.println("Ano: " + ano);
	}
}
