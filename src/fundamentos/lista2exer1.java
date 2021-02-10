package fundamentos;

import java.util.Scanner;

public class lista2exer1 {

	public static void main(String[] args) {
		//CRIE UM PROGRAMA QUE, A PARTIR DE UM TEXTO DIGITADO PELO USUÁRIO, CONTE O NÚMERO DE
		//PALAVRAS E EXIBA O RESULTADO.
		
		Scanner teclado = new Scanner(System.in);
		String texto;
	
		
		System.out.println("digite um texto sobre java: ");
		texto = teclado.nextLine();
		String [] cont = texto.split(" ");
		System.out.println(" A quantidade de palavras é: " + cont.length);
		
		

	}

}
