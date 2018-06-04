package trees;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import models.TreeNode;

public class LevelOrderTraversalIterative {
	
	private static ArrayList<ArrayList <TreeNode>> levelOrderTraversal(TreeNode root) {		
		ArrayList<ArrayList<TreeNode>> levelList = new ArrayList<>();
		
		ArrayList<TreeNode> parent = new ArrayList<>();
		
		if(root != null) {
			parent.add(root);			
			while(parent.size() >0) {
				levelList.add(parent);			
				ArrayList<TreeNode> child = new ArrayList<>();
				
				for(TreeNode p: parent) {
					if(p.getLeft() != null) {
						child.add(p.getLeft());
					}
					if(p.getRight() != null) {
						child.add(p.getRight());
					}
				}
				parent = child;
			}
		}
	    return levelList;
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
		
		root.setLeft(five);
		root.setRight(six);
		five.setLeft(seven);
		five.setRight(eight);
		six.setLeft(nine);
		six.setRight(ten);
		

		ArrayList<ArrayList<TreeNode>> levelList = levelOrderTraversal(root);
		
		for(int i=0; i<levelList.size(); i++) {
			for(TreeNode n: levelList.get(i)) {	
				System.out.print(n.getData());
				System.out.print("\t");
			}	
			System.out.println("");
		}
	}

}
