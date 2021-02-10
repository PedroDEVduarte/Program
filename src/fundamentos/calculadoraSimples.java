package fundamentos;

import java.util.Scanner;

public class calculadoraSimples {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
	     int numero1;
         int numero2;
         boolean continua = true;
         do {
	System.out.println("calculadora");
	System.out.println("1 - SOMAR");
	System.out.println("2 - SUBTRAIR");
	System.out.println("3 - MULTIPLICAR");
	System.out.println("4 - DIVIDIR");
	System.out.println("Digite uma opção: ");
	int opcao = teclado.nextInt();
	
	System.out.print("digite o 1º numero: ");
	numero1 = teclado.nextInt();
	System.out.print("Digite o 2º numero: ");
	numero2 = teclado.nextInt();
	

	switch(opcao) {
	case 1:{
		System.out.println("resultado: " + (numero1 + numero2));
		break;
	}
	case 2:{
		System.out.println("resultado: " + (numero1 - numero2));
		break;
	}
	case 3:{
		System.out.println("resultado: " + (numero1 * numero2));
		break;
	}
	case 4: {
		System.out.println("resultado: " + (numero1 / numero2));
		break;
	}
	default: {
		System.out.println("opcao invalida!");
	}
}
System.out.println("deseja continuar executando? sim = 1, não = 2");
int valor = teclado.nextInt();
if(valor ==2) {
	continua = false;
}
         } while (continua);
	}      
}