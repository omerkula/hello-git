public class sortTerstenBubble {

	public static void main(String[] args) {
		int[] array = { 23, 42, 65, 17, 54};
		int n = array.length;
		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			 
			for (int j = n - 1; j > i; j--) {
				if (array[j] > array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;

				}
				count ++;
			}
			printArray(array);
			System.out.println("----");
		}
		System.out.print("Sorted: ");
		 printArray(array);
		
		//Çalışma sayının test etmek için ekledik
		System.out.println("Count: " + count);
	}

	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
}

