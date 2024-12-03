public class MatrixDiagonalSum {
    private final int[][] matrix = {{1,2,3,4},
                               {4,5,6,7},
                               {4,5,6,7},
                               {4,5,6,7}};

    public int[][] getMatrix() {
        return matrix;
    }

    public int sumOfSquareMatrixDiagonal(int[][] squareMatrix){
    int sum = 0;
    if (squareMatrix.length != squareMatrix[0].length){
        throw new IllegalArgumentException("The input is not a square matrix");
    }

    for(int rowIndex=0;rowIndex<squareMatrix[0].length;rowIndex++){
        for(int columIndex=0;columIndex<squareMatrix.length;columIndex++){
            if (rowIndex==columIndex){
                sum = sum + squareMatrix[rowIndex][columIndex];
            }
        }
    }
        return sum;
    }

    public int sumOfSquareMatrixDiagonal() {
        int [][]squareMatrix = matrix;
        // Check if it's a square matrix (optional)
        if (squareMatrix.length != squareMatrix[0].length) {
            throw new IllegalArgumentException("Input must be a square matrix");
        }

        int sum = 0;
        for (int rowIndex = 0; rowIndex < squareMatrix.length; rowIndex++) {
            sum += squareMatrix[rowIndex][rowIndex];
        }
        return sum;
    }
}
