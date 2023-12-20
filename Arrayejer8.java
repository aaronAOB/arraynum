
public class Arrayejer8 {

	public static void main(String[] args) {
	
		        int[] numeros = {1, 2, 3, 4, 5, 4, 3, 2, 1}; // Suponiendo un array de números

		        boolean esSimetrico = true;

		        for (int i = 0; i < numeros.length / 2; i++) {
		            if (numeros[i] != numeros[numeros.length - 1 - i]) {
		                esSimetrico = false;
		                break;
		            }
		        }

		        if (esSimetrico) {
		            System.out.println("El array es simétrico.");
		        } else {
		            System.out.println("El array no es simétrico.");
		        }
		    }
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


