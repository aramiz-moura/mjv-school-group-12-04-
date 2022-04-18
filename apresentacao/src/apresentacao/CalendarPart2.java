import java.util.Calendar;


public class CalendarExemplo {

	public static void main(String[] args) {
		
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		
		boolean before1 = calendar1.before(calendar2);
		boolean after1 = calendar1.after(calendar2);
		boolean after2 = calendar2.after(calendar1);
		boolean before2 = calendar2.before(calendar1);
		
		System.out.println("Primeiro Calendar:");
		System.out.println("O calendário 1 é uma data anterior ao calendário 2 ?: " + before1);
		System.out.println("O calendário 1 é uma data posterior ao calendário 2 ?: " + after1);
		System.out.println();
		System.out.println("Segundo Calendar:");
		System.out.println("O calendário 2 é uma data inferior ao calendário 1 ?: "+ before2);
		System.out.println("O calendário 2 é uma data posterior ao calendário 1 ?: "+ after2);
		System.out.println();
		
		
		int hora = calendar1.get(Calendar.HOUR_OF_DAY);//HOUR_OF_DAY retorna um inteiro com a hora atual do dia
		
		if(hora > 6 && hora < 12){
			System.out.println("Bom Dia");
		}else if(hora > 12 && hora < 18){
			System.out.println("Boa Tarde");
		}else{
			System.out.println("Boa Noite");
		}
		
		System.out.println("\n\n" + calendar1);
		System.out.println(calendar2);
		
	}
		
		

}
