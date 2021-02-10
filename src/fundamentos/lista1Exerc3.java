package fundamentos;

import java.util.Random;

public class lista1Exerc3 {

	public static void main(String[] args) {
		
	     Random gerador = new Random();
	        double media = 0;
			int impares = 0;
			int numeros[] = new int [10];
			
			
			for (int i = 0; i < 10; i++) {
				numeros[i] = gerador.nextInt(9)+1;
				System.out.println(numeros[i]);
				if(numeros[i] % 2 == 1) {
					impares += numeros[i];
				media = impares / numeros.length * 1.0;
			}		
				
		}
			System.out.println(" a soma dos impares é  "  + impares);
			System.out.println("a media dos impares é  "  + media);
		}
	}	
