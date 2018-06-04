package trees;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import models.TreeNode;

public class LevelOrderTraversalRecursive {
	
	static void levelOrderTraversal(TreeNode root,ArrayList<ArrayList<TreeNode>> levelLists, int level) {	
		
		if(root ==null) {
			return;
		}
		
		if(levelLists.size() > level) {
			ArrayList<TreeNode> levelList = levelLists.get(level);
			if(levelList != null) {
				levelList.add(root);
			}
		}else{			
			ArrayList<TreeNode> newList = new ArrayList<>();
			newList.add(root);
			levelLists.add(newList);
		}
		
		if(root.getLeft() != null) {
			levelOrderTraversal(root.getLeft(), levelLists, level+1);
		}
		if(root.getRight() != null) {
			levelOrderTraversal(root.getRight(), levelLists, level+1);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(1);	
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		TreeNode nine = new TreeNode(9);
		TreeNode ten = new TreeNode(10);
		
		root.setLeft(six);
		root.setRight(five);
		five.setLeft(seven);
		five.setRight(eight);
		six.setLeft(nine);
		six.setRight(ten);
		

		ArrayList<ArrayList<TreeNode>> levelList = new ArrayList<>();
		levelOrderTraversal(root,levelList, 0);
		
		for(int i=0; i<levelList.size(); i++) {
			for(TreeNode n: levelList.get(i)) {	
				System.out.print(n.getData());
				System.out.print("\t");
			}	
			System.out.println("");
		}
	}

}
