package models;

public class Listy{
	private int [] data = new int[1000];
	private int size = 0;
	
	public Listy(int[] data) {
		this.data = data;
		this.size = data.length;
	}
	
	public int getElementAt(int index) {
		if (index < this.size) {
			return data[index];
		}
		return -1;
	}
}
