package Sorting;

public class Merge2SortedArray {
	
	public static void merge(int [] arr1, int [] arr2, int last1, int last2) {
		
		if(arr2 == null || last2 ==0) {
		    return;
		}
		if(arr1 == null || last1 ==0) {
		    for(int i=0; i<last2; i++) {
		    	arr1[i] = arr2[i];
		    }
		}
		int i=last1, j=last2;
		
		int k = last1 + 1 + last2;
		
		while(i >=0 && j >=0) {
			
			if (arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				i--;
			}else {
				arr1[k] = arr2[j];
				j--;
			}
			k--;		
		}
		
		while(j>=0) {
			arr1[k] = arr2[j];
			k--;
			j--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = new int[8];
		arr1[0] = 5;
		arr1[1] = 6;
		arr1[2] = 7;
		arr1[3] = 8;
		
		int [] arr2 = new int [] {2,4,6};
		System.out.println("before");
		for(int num: arr1) {
			System.out.println(num);
		}
		merge(arr1, arr2,3,2);
		System.out.println("after");
		for(int num: arr1) {
			System.out.println(num);
		}

	}

}
