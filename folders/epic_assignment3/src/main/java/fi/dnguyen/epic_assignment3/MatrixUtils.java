package fi.dnguyen.epic_assignment3;

public class MatrixUtils {
	
	/**
	 * Given a matrix of integers, return a string with the entries of matrix appended in clockwise order
	 * 
	 * @param arrMatrix matrix of integers
	 * @return a string in clockwise order
	 */
	public static String printMatrixClockwise(int[][] arrMatrix) {
		if (arrMatrix == null || arrMatrix.length == 0 || arrMatrix[0].length == 0)
			return "";
		
		StringBuilder sb = new StringBuilder();
		
		int top = 0, bottom = arrMatrix.length - 1;
		int left = 0, right = arrMatrix[0].length - 1;

		while (true) {
			
			if (left > right) {
				break;
			}

			// print top row
			for (int i=left; i<=right; i++) {
				sb.append(arrMatrix[top][i] + " ");
			}
			top++;

			if (top > bottom) {
				break;
			}

			// print right column
			for (int i=top; i<=bottom; i++) {
				sb.append(arrMatrix[i][right] + " ");
			}
			right--;

			if (left > right) {
				break;
			}

			// print bottom row
			for (int i=right; i>=left; i--) {
				sb.append(arrMatrix[bottom][i] + " ");
			}
			bottom--;

			if (top > bottom) {
				break;
			}

			// print left column
			for (int i=bottom; i>=top; i--) {
				sb.append(arrMatrix[i][left] + " ");
			}
			left++;
		}
		
		return sb.toString().trim();
	}
}
