public class SumOfMatrixCorners {
  private final int[][] matrix = {{1,2,3,4,7},
                            {4,5,6,7,6},
                            {4,5,6,7,8},
                            //{4,5,6,7,9},
                            {4,5,6,7,12}};

  public int[][] getMatrix() {
    return matrix;
  }

  public int sumMatrixCorners(int[][] matrix){
    int columnLength = matrix[0].length-1;
    int rowLength = matrix.length-1;
    int firstBorder = matrix[0][0];
    int secondBorder = matrix[0][columnLength];
    int thirdBorder = matrix[rowLength][0];
    int lastBorder = matrix[rowLength][columnLength];
    return firstBorder+secondBorder+thirdBorder+lastBorder;
  }

  /**
   * Calculates the sum of the elements in the four corners of a matrix.
   *
   * @param matrix The 2D array representing the matrix.
   * @return The sum of the corner elements.
   * @throws IllegalArgumentException if the matrix is null or empty.
   */
  public int sumOfCornerElements(int[][] matrix) {
    // Validate input (optional)
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      throw new IllegalArgumentException("Input matrix cannot be null or empty");
    }

    int rows = matrix.length;
    int cols = matrix[0].length;

    int topLeftCorner = matrix[0][0];
    int topRightCorner = matrix[0][cols - 1];
    int bottomLeftCorner = matrix[rows - 1][0];
    int bottomRightCorner = matrix[rows - 1][cols - 1];

    return topLeftCorner + topRightCorner + bottomLeftCorner + bottomRightCorner;
  }

}
