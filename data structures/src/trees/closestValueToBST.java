package trees;

import java.util.ArrayList;

import models.TreeNode;

public class closestValueToBST {
	
		public static int min_diff = Integer.MAX_VALUE;
		public static int min_diff_key = Integer.MAX_VALUE;
	static int findClosestValueToBST(TreeNode root, int target) {
		
		findClosestValueToBSHelper(root, target);
		return min_diff_key;
	}
	
    static void findClosestValueToBSHelper(TreeNode root, int target) {
		int cal_min_diff = Integer.MAX_VALUE;
		if(root !=null) {
			cal_min_diff = Math.abs(target-root.getData());
			if(cal_min_diff < min_diff) {
				min_diff = cal_min_diff;
				min_diff_key = root.getData();
			}
			if(root.getData() ==target) {
				min_diff_key = root.getData();
				return;
			}else if (root.getData() < target) {
				 findClosestValueToBSHelper(root.getRight(), target);
			} else {
				 findClosestValueToBSHelper(root.getLeft(), target);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(9);	
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		TreeNode ten = new TreeNode(10);
		
		root.setLeft(five);
		root.setRight(ten);
		five.setRight(eight);
		eight.setLeft(six);
		six.setRight(seven);
		
		//System.out.println("closest of 7 :" + findClosestValueToBST(root, 7));
		System.out.println("closest of 4 :"+ findClosestValueToBST(root, 4));
		
		
	}

}
