//@author Davy
package atividadeMJV;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Scanner;

// Dando extends na classe ContaBanco
public class IniciarDeposito  extends ContaBanco  {

	public static void main(String[] args){

		ContaBanco conta = new ContaBanco();
		
		//LocalDate class é uma classe imutável que representa Date com um formato padrão de aaaa-MM-dd.
		 LocalDate data = LocalDate.now();
		
		//Apresentando o valor inicial de saldo, usando (getCurrencyInstance() - Usado para formatar moedas).
		System.out.println("Valor em seu saldo : " + NumberFormat.getCurrencyInstance().format(conta.saldo));
		System.out.print("Iniciar deposito : " );
		//Classe Scanner registra a entrada de dados que o usuário fornece.
		Scanner leitor = new Scanner(System.in);
		
		conta.saldo = leitor.nextDouble();
		
		leitor.close();
		//Usando o LocalDate.now (data) para trazer a data da atualização do saldo com o método (Now).
		System.out.println("Atualizar saldo : " + NumberFormat.getCurrencyInstance().format(conta.saldo) + "     Data do Depósito : " + data);
		
		
		
		
	}

}
