package Algorithms;

public class main {

	public static void main(String[] args) {

		// fill the array with random values, output unsorted
		final int size = 50;
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = 10 + (int) (Math.random() * 1000);
		}

		System.out.println("Unsorted array of size: " + size);
		printarray(array, size);

		// call quick sort method, output list once again
		quicksort(array, 0, size - 1);

		System.out.println("Sorted array of size: " + size);
		printarray(array, size);

	}

	public static void printarray(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			if (i == size) {
				System.out.println(array[i] + ".");
			}
			System.out.print(array[i] + ",");
		}
		System.out.println("");
	}

	public static void quicksort(int array[], int start, int end) {
		int pivot;

		if (start < end) {
			pivot = partition(array, start, end);
			quicksort(array, start, pivot);
			quicksort(array, pivot + 1, end);
		}
	}

	// partition method
	public static int partition(int array[], int start, int end) {
		int wall = start;
		int pivot = array[start];

		for (int i = start + 1; i <= end; i++) {
			if (array[i] < pivot) {
				// call swap
				array[i] = array[wall + 1];
				array[wall + 1] = array[wall];
				wall++;
			}
		}
		return wall;
	}
}