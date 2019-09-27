package matrix2D;

public class RotateMatrix90degreeFunction {
	public void rotate(int[][] matrix){
		int temp, secondTemp = 1;
		
		// Flip the matrix symmetrically
		// 123, 456, 789
		// 147, 258, 369
		for(int i = 0; i < matrix.length; i++){
			for(int j = i; j< matrix.length; j++){
				// Temp to keep track of matrix that is getting replaced
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		// flip the matrix horizontally for each row
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length/2; j++){ // matrix.length / 2 is the amount of number getting flip
				secondTemp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = secondTemp;
			}
		}
	}
}
