import java.util.ArrayList;

public class SelectionSort {
	//This method uses the Selection Sort Algorithm on the arraylist
	public static <T> void selectionSort(ArrayList<T> arr, java.util.Comparator<? super T> comparator ) {
		int n = arr.size(); //Gets the size of the arraylist
		
		//Iterates over the entire list, except for the last element
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i; //Assumes the current index is the minimum
			
			//Iterates over the entire list from the current index, moving up one per iteration
			for (int j = i + 1; j < n; j++) {
				//If an element is smaller than the current minimum, the minimum is updated
				if (comparator.compare(arr.get(j), arr.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			
			//Swap the found minimum element with the current element
			T temp = arr.get(minIndex);
			arr.set(minIndex, arr.get(i));
			arr.set(i, temp);
		}
	}

}
