import java.util.Random; 
import java.util.HashSet;
import java.util.Set;

public class Arrayejer9 {

	public static void main(String[] args) {
		
		 int[] array = new int[8];
	        Set<Integer> numerosGenerados = new HashSet<>();
	        Random random = new Random();

	        // Mientras no se hayan generado 8 números únicos
	        while (numerosGenerados.size() < 8) {
	            int numeroAleatorio = random.nextInt(40); // Genera números de 0 a 39
	            // Agrega el número generado al conjunto si no está presente
	            if (!numerosGenerados.contains(numeroAleatorio)) {
	                numerosGenerados.add(numeroAleatorio);
	            }
	        }

	        // Convierte el conjunto en un array
	        Integer[] numerosArray = numerosGenerados.toArray(new Integer[0]);

	        // Copia los valores del array de Integer al array de int
	        for (int i = 0; i < numerosArray.length; i++) {
	            array[i] = numerosArray[i];
	        }

	        // Muestra el array resultante
	        for (int num : array) {
	            System.out.print(num + " ");
		
		
		
		
		
		
		
		
		
		
		

	}

}}
