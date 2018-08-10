package Sorting;

public class FindElementInRotatedSortedArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr2 = new int [] {14,4,6,10,12};
		
		for(int num: arr2) {
			System.out.println(num);
		}
		
		System.out.println(findElement(arr2, 14));
		System.out.println(findElement(arr2, 4));
		System.out.println(findElement(arr2, 6));
		System.out.println(findElement(arr2, 10));
		System.out.println(findElement(arr2, 12));
		System.out.println(findElement(arr2, 11));
		
		
		int [] arr3 = new int [] {2,2,2,3,2};
		
		for(int num: arr3) {
			System.out.println(num);
		}
		
		System.out.println(findElement(arr3, 3));
		System.out.println(findElement(arr3, 2));
		
	}

	private static int findElement(int[] input, int target) {
		
		return binSearch(input, target, 0, input.length -1);
	}
	
	private static int binSearch(int[] input, int target, int low, int high) {
		
		int mid = (low + high)/2;
		if (low > high) {
			return -1;
		}
		if(input[mid] == target) {
			return mid;
		}
		// left is sorted 
		if(input[low] < input[mid]) {		
			if(target >= input[low] && target <= input[mid]) {
				return binSearch(input, target, low, mid-1);
			}else {
				return binSearch(input, target, mid+1, high);
			}
		} else if (input[mid] < input[high]) {
			// right half is sorted
			if(target >= input[mid] && target <= input[high]) {
				return binSearch(input, target, mid+1, high);
			}else {
				return binSearch(input, target, low, mid-1);
			}
			
		} else if(input[low] == input[mid]) {
			if(input[mid] != input[high]) {
				return binSearch(input, target, mid+1, high);
			}
			int res = binSearch(input, target, low, mid-1);
			
		    return res != -1 ? res : binSearch(input, target, mid+1, high);
		}
		
		return -1;
	}

}
