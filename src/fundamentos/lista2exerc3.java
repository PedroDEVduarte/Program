package fundamentos;

import java.util.Scanner;

public class lista2exerc3 {

	public static void main(String[] args) {
		/**3 – CRIE UM PROGRAMA ONDE O USUÁRIO IRÁ DIGITAR UMA FRASE E O PROGRAMA IRÁ CONTABILIZAR A
		QUANTIDADE DE CADA VOGAL DA FRASE DIGITADA. CONSIDERE QUE A FRASE NÃO POSSUA NENHUMA
		ACENTUAÇÃO. POR FIM APRESENTE A FRASE E A QUANTIDADE DE CADA VOGAL.*/
		
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
			   System.out.println(" A quantidade da vogal A é: " + contarA );
			   System.out.println(" A quantidade da vogal E é: " + contarE );
			   System.out.println(" A quantidade da vogal I é: " + contarI );
			   System.out.println(" A quantidade da vogal O é: " + contarO );
			   System.out.println(" A quantidade da vogal U é: " + contarU );
			   
			   
			   }
			   
			
				   
			   
		}


	}


