/**
 * Copyright 2024 American Well Systems
 * All rights reserved.
 * <p>
 * It is illegal to use, reproduce or distribute
 * any part of this Intellectual Property without
 * prior written authorization from American Well.
 */
public class SumMatrixFirstWithSecondDiagonal {

  private  int[][] matrix = {{1,2,3,4},
                             {4,5,6,7},
                             {4,5,6,7},
                             {4,5,6,7}};

  public int[][] getMatrix() {
    return matrix;
  }

  public int sumMatrixFirstWithSecondDiagonal(int [][] matrix){
    int sum = 0;
    for(int row=0;row<matrix.length;row++){
      for(int column=0;column<matrix[0].length;column++){
        if(row==column || (row+column) == matrix.length-1){
          System.out.println(matrix[row][column]);
          sum = sum + matrix[row][column];
        }
      }
    }
    return sum;
  }
}
