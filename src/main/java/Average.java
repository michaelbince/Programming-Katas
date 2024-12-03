public class Average {

  public float calculateAverage(float[] numbers){
    float average = 0;
    float sum= 0;

    if(numbers == null || numbers.length == 0){
      throw new IllegalArgumentException("Array must not be empty");
    }

    for (float number : numbers) {
      sum += number;
    }
    average = sum/numbers.length;
    return average;
  }
}
