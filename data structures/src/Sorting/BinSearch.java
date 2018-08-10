package Sorting;

public class BinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr2 = new int [] {4,6,10,12,14};
		
		for(int num: arr2) {
			System.out.println(num);
		}	
		System.out.println(binSearch(arr2, 4));
		System.out.println(binSearch(arr2, 6));
		System.out.println(binSearch(arr2, 10));
		System.out.println(binSearch(arr2, 12));
		System.out.println(binSearch(arr2, 14));
		System.out.println(binSearch(arr2, 11));
		
	}

	private static int binSearch(int[] ip, int target) {
		// TODO Auto-generated method stub
		return binSearchHelper(ip, 0, ip.length-1, target);
	}
	
	private static int binSearchHelper(int[] ip, int low, int high, int target) {
		
		if(low > high) {
			return -1;
		}
		int mid = low+ (high-low)/2;
		
		if(ip[mid] == target) {
			return mid;
		}else if(target< ip[mid]) {
			return binSearchHelper(ip, low, mid-1, target);
		}else if (target > ip[mid]){
			return binSearchHelper(ip, mid+1, high, target);
		}
		return -1;
	}

}
