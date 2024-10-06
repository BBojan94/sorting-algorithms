package sortingAlgorithms;

public class Test {
	
	/*
	 * Bubble sort
	 */
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j+1] < a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	/*
	 * Selection sort
	 */
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
	}
	
	/*
	 * Insertion sort
	 */
	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}
	
	/*
	 * Merge sort
	 */
	public static void mergeSort(int[] a) {
		if (a.length < 2)
			return;
		int mid = a.length/2;
		int left = a.length - mid;
		int right = a.length - left;
		int[] leftArray = new int[left];
		int[] rightArray = new int[right];
		for (int i = 0; i < left; i++)
			leftArray[i] = a[i];
		for (int j = 0; j < right; j++)
			rightArray[j] = a[left+j];
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(a, leftArray, rightArray);
	}
	public static void merge(int[] a, int[] leftArray, int[] rightArray) {
		int i = 0, j = 0, k = 0;
		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] < rightArray[j]) {
				a[k++] = leftArray[i++];
			}
			else {
				a[k++] = rightArray[j++];
			}
		}
		while (i < leftArray.length)
			a[k++] = leftArray[i++];
		while (j < rightArray.length)
			a[k++] = rightArray[j++];
	}
	
	/*
	 * Quick sort
	 */
	public static void quickSort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}
	public static void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(a, low, high);
			// Recursively sort elements before and after the partition
			quickSort(a, low, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, high);
		}
	}
	public static int partition(int[] a, int low, int high) {
		// Choose the pivot element (can be any element from the array)
        int pivot = a[high];
        // Index of the smaller element
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (a[j] <= pivot) {
                i++;
                // Swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // Swap a[i+1] and a[high] (or pivot)
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;
        return i + 1;
	}
	
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
public static void main(String[] args) {
		
		int[] a1 = {65, 21, 13, 44, 28};
		int[] a2 = {65, 21, 13, 44, 28};
		int[] a3 = {65, 21, 13, 44, 28};
		int[] a4 = {65, 21, 13, 44, 28};
		int[] a5 = {65, 21, 13, 44, 28};
		
		System.out.println("Unsorted:");
		print(a1);
		
		bubbleSort(a1);
		System.out.println("Sorted using bubbleSort:");
		print(a1);
		
		selectionSort(a2);
		System.out.println("Sorted using selectionSort:");
		print(a2);
		
		insertionSort(a3);
		System.out.println("Sorted using insertionSort:");
		print(a3);
		
		mergeSort(a4);
		System.out.println("Sorted using mergeSort:");
		print(a4);
		
		quickSort(a5);
		System.out.println("Sorted using quickSort:");
		print(a5);
		
	}

}
