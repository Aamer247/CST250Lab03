
public class BinarySearch {
	public static void binarySearch(int arr[], int first, int last, int key) {
		
		//find middle point of the array
		//at start it will be the middle point of the array to be searched
		int mid = (first + last) / 2;
		
		//if first becomes greater than last, means there
		//is no element found so break the loop
		while (first <= last) {
			//if they item to be searched is greater than
			//item at middle position, then now search the
			//next portion of array from middle + 1 to last point
			if (arr[mid] < key) {
				first = mid + 1;
			}
			//if item at middle position is the item we want to search
			//display message and break the loop
			else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				//the element we want to search is the in the first half of the array
				//so change the last value. 
				last = mid - 1;
			}
			
			//now that we have re-defined first or last
			//find the new middle value
			mid = (first + last) / 2;
		}
		
		//this means, we haven't found our element
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[]) {
		//array of integers
		int arr[] = { 10, 20, 30, 40, 50 };
		//to search key
		int key = 30;
		//last will be the length - 1
		int last = arr.length - 1;
		//perform binary search
		binarySearch(arr, 0, last, key);
	}
}
