package fundamentos;

import java.util.Scanner;

public class lista2exerc3 {

	public static void main(String[] args) {
		/**3 � CRIE UM PROGRAMA ONDE O USU�RIO IR� DIGITAR UMA FRASE E O PROGRAMA IR� CONTABILIZAR A
		QUANTIDADE DE CADA VOGAL DA FRASE DIGITADA. CONSIDERE QUE A FRASE N�O POSSUA NENHUMA
		ACENTUA��O. POR FIM APRESENTE A FRASE E A QUANTIDADE DE CADA VOGAL.*/
		
		Scanner teclado = new Scanner(System.in);
		String frase, fraseLower;
		int contarA = 0, contarE = 0, contarI = 0, contarO = 0, contarU = 0;
		
		System.out.print("Digite uma frase: ");
		frase = teclado.nextLine().trim();
		fraseLower = frase.toLowerCase();
				
		char [] letras = fraseLower.toCharArray();
		
		
		for(int i = 0; i < letras.length; i++) {
			if (letras[i] == 'a') {
				contarA++;
			}else if(letras[i] == 'e') {
				contarE++;
			}else if (letras[i] == 'i') {
				contarI++;
			}else if (letras[i] == 'o') {
				contarO++;
			}else if (letras[i] == 'u') {
				contarU++;
			}
			  System.out.println("*********************************************" );
			  System.out.println(" frase digitada acima " + frase);
			   System.out.println(" A quantidade da vogal A �: " + contarA );
			   System.out.println(" A quantidade da vogal E �: " + contarE );
			   System.out.println(" A quantidade da vogal I �: " + contarI );
			   System.out.println(" A quantidade da vogal O �: " + contarO );
			   System.out.println(" A quantidade da vogal U �: " + contarU );
			   
			   
			   }
			   
			
				   
			   
		}


	}


