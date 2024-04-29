package com.epam.rd.autotasks.matrix;

import java.util.Arrays;

public class MatrixUtil {

	public static void transformMatrix(int[][] matrix) {
		try {
				if (matrix != null){
					int n = matrix.length;
					for (int i = 0; i < n; i++) {
						for (int j = 0; j < n; j++) {
							if (i < j) {
								matrix[i][j] = 1;
							}
							else if (i > j) {
								matrix[i][j] = 0;
							}

						}
					}
				}
				else{
					throw new NullPointerException("Please enter a matrix!");
				}
			}
			catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
	}

	public static void main(String[] args) {
		{
			int[][] matrix = null;
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = {};
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { {} };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { {}, {} };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 3 }, { 4, 5, 6 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 3 }, { 4, 5 }, {} };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 3 }, { 4, 5 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 4, 3, 3 }, { 5, 7, 8, 5 }, { 2, 4, 3, 3 }, { 5, 7, 8, 5 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{

			int[][] matrix = { { 2, 3 }, { 4, 5 }, { 6, 7 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 4, 3, 3 }, { 5, 7, 8, 5 }, { 2, 4, 3, 3 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}

	}

}
