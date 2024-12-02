/**
 * Copyright 2024 American Well Systems
 * All rights reserved.
 * <p>
 * It is illegal to use, reproduce or distribute
 * any part of this Intellectual Property without
 * prior written authorization from American Well.
 */
public class OrderMatrix {

  private int[][] matrix =  {{10,2,3,4},
                            {45,5,63,7},
                            {4,55,67,37},
                            {4,55,6,37}};

  public int[][] getMatrix(){
    return this.matrix;
  }

  public void setMatrix(int [][] matrix){
    this.matrix = matrix;
  }

  public int[][] orderMatrix(int [][] matrix){
    for(int i=0;i< matrix.length*2;i++){
      for(int j=0;j< matrix.length;j++){
        for(int k=0;k< matrix[j].length-1;k++){
        if(matrix[j][k] > matrix[j][k+1]){
          int aux = matrix[j][k];
          matrix[j][k] = matrix[j][k+1];
          matrix[j][k+1] = aux;
        }
        }
      }
    }
    return matrix;
  }

  public void showMatrix(int [][] matrix){
    System.out.println("");
    for(int i=0;i< matrix.length;i++){
      for(int j=0;j< matrix[i].length;j++){
        System.out.print(matrix[i][j]+", ");
        if(j==matrix[i].length-1){
          System.out.println("");
        }
      }
    }
  }
}
