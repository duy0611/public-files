package fi.dnguyen.epic_assignment3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatrixUtilsTest {

	@Test
	public void printMatrixClockwise_shoultPrintResultCorrectlyTest() {
		int[][] arrMatrix = {
			{1,  2,  3,  4},
			{5,  6,  7,  8},
			{9, 10, 11, 12}
		};
		String expectedResult = "1 2 3 4 8 12 11 10 9 5 6 7";
		
		String printedResult = MatrixUtils.printMatrixClockwise(arrMatrix);
		
		assertEquals(expectedResult, printedResult);
	}
	
	@Test
	public void printMatrixClockwise_nullMatrixTest() {
		int[][] arrMatrix = null;
		String expectedResult = "";
		
		String printedResult = MatrixUtils.printMatrixClockwise(arrMatrix);
		
		assertEquals(expectedResult, printedResult);
	}
	
	@Test
	public void printMatrixClockwise_emptyMatrixTest() {
		int[][] arrMatrix = {{}};
		String expectedResult = "";
		
		String printedResult = MatrixUtils.printMatrixClockwise(arrMatrix);
		
		assertEquals(expectedResult, printedResult);
	}
	
	@Test
	public void printMatrixClockwise_oneRowMatrixTest() {
		int[][] arrMatrix = {
			{1, 2, 3, 4, 5}
		};
		String expectedResult = "1 2 3 4 5";
		
		String printedResult = MatrixUtils.printMatrixClockwise(arrMatrix);
		
		assertEquals(expectedResult, printedResult);
	}
	
	@Test
	public void printMatrixClockwise_oneColumnMatrixTest() {
		int[][] arrMatrix = {
			{1},
			{3},
			{5},
			{7},
			{9}
		};
		String expectedResult = "1 3 5 7 9";
		
		String printedResult = MatrixUtils.printMatrixClockwise(arrMatrix);
		
		assertEquals(expectedResult, printedResult);
	}
	
	@Test
	public void printMatrixClockwise_largeMatrixTest() {
		int[][] arrMatrix = {
			{1,  2,  3,  4},
			{5,  6,  7,  8},
			{9, 10, 11, 12},
			{1,  2,  3,  4},
			{5,  6,  7,  8},
			{9, 10, 11, 12}
		};
		String expectedResult = "1 2 3 4 8 12 4 8 12 11 10 9 5 1 9 5 6 7 11 3 7 6 2 10";
		
		String printedResult = MatrixUtils.printMatrixClockwise(arrMatrix);
		
		assertEquals(expectedResult, printedResult);
	}
	
	@Test
	public void printMatrixClockwise_squareMatrixTest() {
		int[][] arrMatrix = {
			{ 1,  2,  3,  4, 5},
			{16, 17, 18, 19, 6},
			{15, 24, 25, 20, 7},
			{14, 23, 22, 21, 8},
			{13, 12, 11, 10, 9}
		};
		String expectedResult = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25";
		
		String printedResult = MatrixUtils.printMatrixClockwise(arrMatrix);
		
		assertEquals(expectedResult, printedResult);
	}
	
}
