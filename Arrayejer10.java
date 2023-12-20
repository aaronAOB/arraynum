
public class Arrayejer10 {

	public static void main(String[] args) {
	
		 int[] array = {14, 3, 21, 35, 8, 42, 10, 49}; 

	        int divisiblesPor7 = 0;

	        for (int num : array) {
	            if (num % 7 == 0) {
	                divisiblesPor7++;
	            }
	        }

	        System.out.println("Cantidad de valores divisibles por 7: " + divisiblesPor7);

	}

}
