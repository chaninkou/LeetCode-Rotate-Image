package leetcode48;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Before rotate: " + Arrays.deepToString(matrix));
		
		RotateMatrix90degreeFunction solution = new RotateMatrix90degreeFunction();
		
		solution.rotate(matrix);
		
		System.out.println("Final rotate: " + Arrays.deepToString(matrix));
	}
}
