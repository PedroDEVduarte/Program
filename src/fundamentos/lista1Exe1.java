package fundamentos;

import java.util.Random;
public class lista1Exe1 {

	public static void main(String[] args) {
		//CRIE UM ARRAY DE INTEIROS DE TAMANHO 10. IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O
		//ARRAY, BEM COMO A QUANTIDADE DE ELEMENTOS ARMAZENADOS NESTE ARRAY QUE SÃO PARES.
		
		int numeros[] = new int [10];
		Random array = new Random();
		int contarPares = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = array.nextInt(10);
			System.out.print(numeros[i] + " ");
			if(numeros[i] % 2 ==0) {
			contarPares += 1;
		}		
	
	}
		System.out.println("==============================");
		System.out.println("este codigo tem "  + contarPares + " elementos pares.");	
	}
}	


