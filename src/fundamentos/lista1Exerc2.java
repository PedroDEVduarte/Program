package fundamentos;
import java.util.Random;
public class lista1Exerc2 {

	public static void main(String[] args) {
	
		
		        Random array = new Random();
		        double soma = 0;
				int numeros[] = new int [10];
				int total = 0;
				
				
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = array.nextInt(10);
					System.out.println(numeros[i]);
					if(numeros[i] % 2 ==1) {
					soma = total + numeros.length + 1.0;
				}		
				System.out.println("este codigo tem a soma de:  "  + soma);	
			}
					
			}
		}	
       
       
       
	


	