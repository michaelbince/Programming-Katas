public class SumMatrixFirstWithSecondDiagonal {

  private final int[][] matrix = {{1,2,3,4},
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
