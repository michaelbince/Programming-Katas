import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Copyright 2024 American Well Systems
 * All rights reserved.
 * <p>
 * It is illegal to use, reproduce or distribute
 * any part of this Intellectual Property without
 * prior written authorization from American Well.
 */
public class PushAllTheZeros {

  private int[] array = {1,0,2,0,3,0,4,0,5,6,7,8,0,10};

  public int[] getArray(){
    return this.array;
  }

  public int[] pushAllTheZerosToTheEnd(int[]  array){
    for (int index=0;index< array.length;index++){
      if(array[index] == 0){
        for (int innerIndex=index;innerIndex< array.length;innerIndex++){
          if(array[innerIndex] == 0 && innerIndex+1 < array.length){
            int aux = array[innerIndex+1];
            array[innerIndex+1] = 0;
            array[innerIndex] = aux;
          }
        }
      }
    }
    Arrays.stream(array).forEach(System.out::println);
    return array;
  }

}
