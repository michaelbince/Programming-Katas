import java.util.ArrayList;
import java.util.Arrays;

/**
 * Copyright 2024 American Well Systems
 * All rights reserved.
 * <p>
 * It is illegal to use, reproduce or distribute
 * any part of this Intellectual Property without
 * prior written authorization from American Well.
 */
public class Main {

  public static void main(String[] arg){
      System.out.println("Exercises");

      System.out.println("Matrix first diagonal sum");
      MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
      System.out.println(matrixDiagonalSum.sumOfSquareMatrixDiagonal(matrixDiagonalSum.getMatrix()));
      System.out.println(matrixDiagonalSum.sumOfSquareMatrixDiagonal());

      System.out.println("Letters verification");
      LettersVerification lettersVerification = new LettersVerification();
      System.out.println(lettersVerification.verifyFirstAndLastLetterAreSame("Olo"));
      System.out.println(lettersVerification.verifyFirstAndLastLetterAreSame());

      System.out.println("Sum the matrix corners");
      SumOfMatrixCorners sumOfMatrixCorners = new SumOfMatrixCorners();
      System.out.println(sumOfMatrixCorners.sumMatrixCorners(sumOfMatrixCorners.getMatrix()));
      System.out.println(sumOfMatrixCorners.sumOfCornerElements(sumOfMatrixCorners.getMatrix()));


      System.out.println(" push all the zeros that are present to the end of the array");
      PushAllTheZeros pushAllTheZeros = new PushAllTheZeros();
      pushAllTheZeros.pushAllTheZerosToTheEnd(pushAllTheZeros.getArray());

      System.out.println("Array ordered");
      OrderAnArray orderAnArray = new OrderAnArray();
      orderAnArray.showArray(orderAnArray.oderArray(orderAnArray.getArray()));

      System.out.println("matrix ordered");
      OrderMatrix orderMatrix = new OrderMatrix();
      orderMatrix.showMatrix(orderMatrix.orderMatrix(orderMatrix.getMatrix()));

      System.out.println("matrix SumMatrixFirstWithSecondDiagonal");
      SumMatrixFirstWithSecondDiagonal sumMatrixFirstWithSecondDiagonal = new SumMatrixFirstWithSecondDiagonal();
      System.out.println(sumMatrixFirstWithSecondDiagonal.sumMatrixFirstWithSecondDiagonal(sumMatrixFirstWithSecondDiagonal.getMatrix()));

      System.out.println("Factorial");
      Factorial factorial = new Factorial();
      System.out.println(factorial.factorialFor(5));
      System.out.println("Factorial");
      System.out.println(factorial.recursionFactorialFor(5));

      System.out.println("Sorting list");
      SortingList sortingList = new SortingList();
      sortingList.fillList();
      sortingList.orderList();
      sortingList.showList();

      System.out.println("Average");
      Average average = new Average();
      System.out.println(average.calculateAverage(new float[]{4,5,4,5}));

      System.out.println("FindLinkElements");
      FindLinkElements findLinkElements = new FindLinkElements();
      ArrayList<String> linksExample = new ArrayList<>(Arrays.asList("www.google.com","www.moon.co.com","www.fines.com.co"));
      findLinkElements.findBrookeLinks(linksExample);

      System.out.println("DatesList");
      DatesList datesList = new DatesList();
      System.out.println(datesList.isCurrentTimeDateInList(datesList.fillDateList()));

      System.out.println("NumberSegregation");
      NumberSegregation numberSegregation = new NumberSegregation();
      numberSegregation.segregateListNumbers( numberSegregation.fillOutList());
      numberSegregation.showList(numberSegregation.getEvenNumberList());
      numberSegregation.showList(numberSegregation.getOddNumberList());

  }
}
