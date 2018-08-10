package Sorting;

import models.Listy;

public class SortedSearchNoSize {
	
	public static int findSize(Listy ip) {
		
		if(ip.getElementAt(0) == -1) {
			throw new IllegalArgumentException("invalid ip");
		}
		
		int i=0;
		int j = (int) Math.pow(2, i);
		
		while(ip.getElementAt(j) !=-1) {
			i= i+1;
			j= (int) Math.pow(2, i);
		}
		
		int startIndex = j/2;
		int endIndex = j;
		
		int size = findSizeHelper(ip, startIndex, endIndex);
	
		return size;
		
	}

	public static int findSizeHelper(Listy ip, int low, int high) {
		
		while(low<=high) {
			int mid = low+ (high-low)/2;
			
	        if(ip.getElementAt(mid) == -1) {
	        	int temp = findSizeHelper(ip, low, mid-1);
	        	if(temp == -1) {
		        	return mid;
		        }else {
		        	return temp;
		        }
	        }else {
	        	int temp = findSizeHelper(ip, mid+1, high);
		        return temp;
		    } 
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = new int[] {2,4,6,8,10,12,14};
		Listy input = new Listy(ip);
		
		System.out.println(findSize(input));
		
	}

}
