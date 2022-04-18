package apresentacao;

import java.time.LocalDateTime;

public class Tempo2 {

	public static void main(String[] args) {
		
		LocalDateTime teste = LocalDateTime.now();
		System.out.println(teste);
		
		System.out.println(teste.plusYears(-20));
		
	}

}



