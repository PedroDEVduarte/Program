package fundamentos;

import java.util.Scanner;

public class lista2exer2 {
	/** – CRIE UM PROGRAMA ONDE O USUÁRIO IRÁ DIGITAR UMA FRASE. DEPOIS O PROGRAMA DEVERÁ SOLICITAR
	QUE O USUÁRIO DIGITE UMA PALAVRA. O PROGRAMA DEVE APRESENTAR A FRASE DIGITADA, A PALAVRA
	DIGITADA, BEM COMO A QUANTIDADE DE VEZES QUE A PALAVRA DIGITADA APARECE NA FRASE.*/
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String texto, palavra;
	
		
		System.out.println("digite uma frase: ");
		texto = teclado.nextLine();
		System.out.println("Digite uma palavra: ");
		palavra = teclado.nextLine();
		String [] cont = texto.split(" pedro ");
		System.out.println(" A quantidade de palavras usadas iguais no texto é: " + cont.length);
	}

	}


