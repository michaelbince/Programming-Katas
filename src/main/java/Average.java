/**
 * Copyright 2024 American Well Systems
 * All rights reserved.
 * <p>
 * It is illegal to use, reproduce or distribute
 * any part of this Intellectual Property without
 * prior written authorization from American Well.
 */
public class Average {

  public float calculateAverage(float[] numbers){
    float average = 0;
    float sum= 0;

    if(numbers == null || numbers.length == 0){
      throw new IllegalArgumentException("Array must not be empty");
    }

    for(int index = 0; index < numbers.length; index++){
      sum += numbers[index];
    }
    average = sum/numbers.length;
    return average;
  }
}
