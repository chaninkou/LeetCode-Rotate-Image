package leetcode48;

public class RotateMatrix90degreeFunction {
	// time O(n + m) where n is i and m is j
	public void rotate(int[][] matrix){
		int temp, secondTemp = 1;
		
		// Flip the matrix symmetrically
		// ex: 123, 456, 789
		// result: 147, 258, 369
		// Swap them
		for(int i = 0; i < matrix.length; i++){
			for(int j = i; j< matrix.length; j++){
				temp = matrix[i][j];
				
				// [0][1] = [1][0]
				// [0][2] = [2][0]
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		// flip the matrix from start and end for each row
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length/2; j++){ // matrix.length / 2 is the amount of number getting flip
				secondTemp = matrix[i][j];
				
				// matrix.length - 1 - j will get the last element and then second last and so on
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				
				matrix[i][matrix.length - 1 - j] = secondTemp;
			}
		}
	}
}
