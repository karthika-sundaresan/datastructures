
package models;

public class TreeNode {
	
	private int data;
	private TreeNode left;
	private TreeNode right;

	public TreeNode() {
		this.setData(0);
		this.setLeft(null);
		this.setRight(null);
	}
	
	public TreeNode(int data) {  	
    	this.setData(data);
    	this.setLeft(null);
    	this.setRight(null);
    }
	
    public TreeNode(int data, TreeNode left, TreeNode right) {  	
    	this.setData(data);
    	this.setLeft(left);
    	this.setRight(right);
    }

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}
}
