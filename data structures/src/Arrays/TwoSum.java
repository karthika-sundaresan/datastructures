package Arrays;

import java.util.HashSet;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ip = new int[] {-5,3,4,6,9,10};
		
		System.out.println(isTwoSumPossible(ip, -2));
		
	}

	private static boolean isTwoSumPossible(int[] ip, int targetSum) {
		// TODO Auto-generated method stub
		HashSet<Integer> visited = new HashSet<>();
		
		for(int i=0; i<ip.length; i++) {
						
			if(visited.contains(targetSum-ip[i])) {
				return true;
			}
			visited.add(ip[i]);
		}
		return false;
	}

}
