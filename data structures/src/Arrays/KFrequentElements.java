package Arrays;

import java.util.*;

public class KFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> countMap = new HashMap<>();
	        
	    for(int i=0; i<nums.length; i++) {
	    	if(countMap.containsKey(nums[i])){
	    		countMap.put(nums[i], countMap.get(nums[i])+1);
	        }else{
	            countMap.put(nums[i], 1);
	        }
	    }
	    ArrayList<Integer> values = new ArrayList<>(countMap.values());
	    Collections.sort(values, Collections.reverseOrder());
	    List<Integer> result = new ArrayList<>();
	    
	    Set<Integer> topvalues = new HashSet<>(values.subList(0, k));
	    for(Map.Entry<Integer, Integer> v1: countMap.entrySet()) {
	    	
	    	if(topvalues.contains(v1.getValue())) {
	    		result.add(v1.getKey());
	    	}
	    }
	    
	    return result;
	        
	}
	    
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
