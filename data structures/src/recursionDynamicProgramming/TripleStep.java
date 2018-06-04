package recursionDynamicProgramming;

import java.util.HashMap;

public class TripleStep {
	
	private static HashMap<Integer, Long> lookup = new HashMap<>();
	
	public static long noOfWaysOfTripleStep(int totalSteps) {
		
		if(totalSteps < 0) {
			return 0;
		}
		if (totalSteps ==0) {
			return 1;
		}
		
		if (lookup.containsKey(totalSteps)) {
			return lookup.get(totalSteps);
		}
		
		long totalWays = noOfWaysOfTripleStep(totalSteps-1) + 
				    noOfWaysOfTripleStep(totalSteps-2) + 
				    noOfWaysOfTripleStep(totalSteps-3);
		
		lookup.put(totalSteps, totalWays);
		return totalWays;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("total Steps: 1" + " No of Ways:" + noOfWaysOfTripleStep(1));
		System.out.println("total Steps: 2" + " No of Ways:" + noOfWaysOfTripleStep(2));
		System.out.println("total Steps: 3" + " No of Ways:" + noOfWaysOfTripleStep(3));
		System.out.println("total Steps: 37" + " No of Ways:" + noOfWaysOfTripleStep(37));

	}

}
