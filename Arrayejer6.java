
public class Arrayejer6 {

	public static void main(String[] args) {
		
		        int[] fibonacci = new int[20]; // Crear un array de 20 posiciones

		        // Llenar el array con la secuencia de Fibonacci
		        fibonacci[0] = 0;
		        fibonacci[1] = 1;
		        for (int i = 2; i < 20; i++) {
		            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		        }

		        // Mostrar el array con la secuencia de Fibonacci
		        System.out.println("Secuencia de Fibonacci:");
		        for (int i = 0; i < 20; i++) {
		            System.out.print(fibonacci[i] + " ");
		        
		  
		
		
		
		
		}
		
		

	}

}
