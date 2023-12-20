
public class Arrayejer5 {

	public static void main(String[] args) {
		        int[] tabla = new int[10];

		        // Calcular y asignar el factorial a cada posición del array
		        for (int i = 0; i < tabla.length; i++) {
		            tabla[i] = factorial(i);
		        }

		        // Imprimir el array con los factoriales
		        System.out.println("Array con los factoriales:");
		        for (int elemento : tabla) {
		            System.out.print(elemento + " ");
		        }
		    }

		    // Función para calcular el factorial de un número
		    public static int factorial(int n) {
		        if (n <= 1) {
		            return 1;
		        } else {
		            return n * factorial(n - 1);
		        }
		    }
		


	}


