
public class Arrayejer11 {

	public static void main(String[] args) {
	
		        int[] array = {7, 4, 11, 9, 13, 6, 17}; 
		        int primos = 0;

		        for (int num : array) {
		            if (esPrimo(num)) {
		                primos++;
		            }
		        }

		        System.out.println("Cantidad de valores primos: " + primos);
		    }

		    // Función para verificar si un número es primo
		    public static boolean esPrimo(int numero) {
		        if (numero <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(numero); i++) {
		            if (numero % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		

	}


