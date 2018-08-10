package Arrays;

import java.util.HashSet;

public class TwoSumFollowUp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] ip = new int[] {5,3,3,4,6,9,10};
			
			printTwoSumPairs(ip, 6);
			
		}

		private static void printTwoSumPairs(int[] ip, int targetSum) {
			// TODO Auto-generated method stub
			HashSet<Integer> visited = new HashSet<>();
			
			for(int i=0; i<ip.length; i++) {
							
				if(visited.contains(targetSum-ip[i])) {
					System.out.println("pair " + Integer.toString(ip[i])+","+Integer.toString(targetSum-ip[i]));
				}
				visited.add(ip[i]);
			}
			
		}

}