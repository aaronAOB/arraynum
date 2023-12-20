
public class Arrayejer2 {

	public static void main(String[] args) {
	
		 int[] array = {5, 8, 3, 12, 7, 6, 9, 4, 1, 10};
	        int sumaPrimeraMitad = 0;
	        int sumaSegundaMitad = 0;
	        
	        //calcular suma primera mitad 
	        
	        for (int i = 0; i < array.length / 2; i++) {
	            sumaPrimeraMitad += array[i];
		
	           
	        //calcular suma segunda mitad 
	        
	        for (int j = array.length / 2; i< array.length; i++) {
	                sumaSegundaMitad += array[i];
	            }
	            
	            //comparar sumas 
	        
	        
	        if (sumaPrimeraMitad > sumaSegundaMitad) {
	            System.out.println("La suma de la primera mitad es mayor.");
	        } else if (sumaPrimeraMitad < sumaSegundaMitad) {
	            System.out.println("La suma de la segunda mitad es mayor.");
	        } else {
	            System.out.println("Las sumas de ambas mitades son iguales.");
	            
		
		
		
		

	}

}}}
