package fundamentos;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class lista1Exerc4 {

	public static void main(String[] args) {
		/** TODO 4 � LER AS DUAS NOTAS BIMESTRAIS PARA UM CONJUNTO DE 5 ALUNOS. ARMAZENAR AS NOTAS INFORMADAS
		PELO USU�RIO EM DOIS ARRAYS �NOTA1� E �NOTA2�, BEM COMO O NOME DO ALUNO EM UM ARRAY �ALUNO�. O
		PROGRAMA DEVE CALCULAR A M�DIA DAS NOTAS E INFORMAR:
		� NOME DO ALUNO;
		� NOTA 1;
		� NOTA 2;
		� M�DIA;
		� SITUA��O;
		SE A M�DIA CALCULADA FOR SUPERIOR OU IGUAL A 7 O ALUNO ESTAR� COM A SITUA��O �APROVADO�, CASO
		NTR�RIO, A SITUA��O SER� �REPROVADO�.*/
		
		String [] aluno = new String [5]; 
		double [] nota1 = new double[5];
		double [] nota2 = new double[5];
		double [] mediaN = new double[5];
	
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		while(contador <5) {
			System.out.println("digite o nome do aluno: ");	
		    aluno [contador] = teclado.nextLine();
		
		    System.out.println("digite a primeira nota: ");
		    nota1[contador] = teclado.nextDouble();
		    
		    System.out.println("digite a segunda nota: ");
		    nota2[contador] = teclado.nextDouble();
		   
		mediaN[contador] =(nota1[contador] + nota2[contador])/2;
		
		System.out.println( aluno[contador] + " A m�dia das suas notas �:  " + mediaN[contador]);
		if (mediaN[contador] >= 7) {
			System.out.println("aprovado");
		}
		else {
			System.out.println("reprovado");
						
		}
		contador = contador +1;
		String entrada = teclado.nextLine();
		
		
		}
		
		
		}

	}


