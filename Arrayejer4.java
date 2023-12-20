
public class Arrayejer4 {

	public static void main(String[] args) {
		
		int[] array = {5, 8, 3, 12, 7, 6, 9, 4, 1, 10};


        int ultimoElemento = array[array.length - 1];
        
        //realizar rotacion 
        
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
            
           }
        array[0] = ultimoElemento;

        // Imprimir el array rotado
        System.out.println("Array rotado hacia la derecha:");
        for (int elemento : array) {
            System.out.print(elemento + " ");

	}

}}
