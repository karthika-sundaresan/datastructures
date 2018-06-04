package recursionDynamicProgramming;

import java.util.ArrayList;

import models.TreeNode;

public class PowerSet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ip = new ArrayList<>();
		
		ip.add(5);
		ip.add(6);
		ip.add(7);
	
		ArrayList<ArrayList<Integer>> result = generatePowerSet(ip);
		
		for(int i=0; i<result.size(); i++) {
			for(Integer n: result.get(i)) {	
				System.out.print(n);
				System.out.print("\t");
			}	
			System.out.println("");
		}
		
	}

	static void generatePowerSetHelper(ArrayList<Integer> ip, ArrayList<ArrayList<Integer>> result, int level) {

		ArrayList<Integer> list= new ArrayList<Integer>();
		if(level ==0) {
			result.add(list);
			return;
		}
		
		ArrayList<ArrayList<Integer>> cloneResult = new ArrayList<>();
		for(int i=0; i<result.size(); i++) {
			ArrayList<Integer> current = result.get(i);
			cloneResult.add((ArrayList<Integer>) current.clone());
		}
		
		for(int i=0; i<cloneResult.size(); i++) {			
			cloneResult.get(i).add(ip.get(level-1));
		}
		
		for(int i=0; i<cloneResult.size(); i++) {
			result.add(cloneResult.get(i));
		}
	}
	private static ArrayList<ArrayList<Integer>> generatePowerSet(ArrayList<Integer> ip) {
		
		if(ip == null) {
			throw new IllegalArgumentException("invalid ip");
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		
		for(int i=0; i<=ip.size(); i++) {
			generatePowerSetHelper(ip, result, i);
		}
		return result;
	}

}
