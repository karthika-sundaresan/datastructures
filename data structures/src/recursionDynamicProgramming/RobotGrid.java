package recursionDynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class RobotGrid {
	
	public static boolean pathExistsInGrid(int [][] grid) {
		
		if(grid == null) {
			return false;
		}
		//1*1 grid start and end position are the same
		if (grid.length ==1 && grid[0].length == 1) {
			return true;
		}
		int [][] results = new int[grid.length][grid[0].length];
		
		for(int i=0; i<grid.length; i++) {
			Arrays.fill(results[i], -1);
		}
		
		return pathExistsInGridHelper(grid, grid.length-1, grid[0].length-1, results)==1;
		
	}
	

	
	
	public static int pathExistsInGridHelper(int [][] grid, int x, int y, int [][] results) {
		
		if(grid == null) {
			return 0;
		}
		if(x < 0 || y < 0) {
			return 0;
		}
		if (x==0 && y ==0) {
			return 1;
		}
		//O in a grid represents a blocked position
		if(grid[x][y] ==0) {
			return 0;
		}
		
		if (results[x][y] != -1) {
			return results[x][y];
		}
		
		if (pathExistsInGridHelper(grid, x, y-1, results) ==1 || 
				pathExistsInGridHelper(grid, x -1, y, results) ==1) {
			results[x][y] = 1;
		}else {
			results[x][y] =0;
		}
		
		return results[x][y];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] maze1 = new int[][] {
			{1,1},
			{1,1}
		};
		
		System.out.println("Maze 1" + " Pathexists " + pathExistsInGrid(maze1));
		
		int [][] maze2 = new int[][] {
			{1,1,1,0},
			{1,0,0,1},
			{1,1,0,1}
		};
		
		System.out.println("Maze 2" + " Pathexists " + pathExistsInGrid(maze2));
	}

}
