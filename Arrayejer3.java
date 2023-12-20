
public class Arrayejer3 {

	public static void main(String[] args) {

		        int[] array = {5, 8, 3, 12, 7, 6, 9, 4, 1, 10};

		        boolean todosSonDistintos = true;

		        // Verificar si hay elementos duplicados
		        for (int i = 0; i < array.length - 1; i++) {
		            for (int j = i + 1; j < array.length; j++) {
		                if (array[i] == array[j]) {
		                    todosSonDistintos = false;
		                    break;
		                }
		            }
		            if (!todosSonDistintos) {
		                break;
		            }
		        }

		        if (todosSonDistintos) {
		            System.out.println("Todos los elementos del array son diferentes.");
		        } else {
		            System.out.println("Hay elementos duplicados en el array.");
		        }
		    }
		

		
		
		
		
		
		
		
		

	}


