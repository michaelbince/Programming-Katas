/**
 * Copyright 2024 American Well Systems
 * All rights reserved.
 * <p>
 * It is illegal to use, reproduce or distribute
 * any part of this Intellectual Property without
 * prior written authorization from American Well.
 */
public class OrderAnArray {

  int[] array = {2,4,7,3,6,9};

  public int[] getArray() {
    return array;
  }

  public void setArray(int[] array) {
    this.array = array;
  }

  public int[] oderArray(int[] array){
    for(int externalIndex=0;externalIndex<array.length;externalIndex++){
      for(int i=0;i<array.length-1;i++){
        if(array[i] > array[i+1]){
          int aux = array[i];
          array[i] = array[i+1];
          array[i+1] = aux;
        }
      }
    }
    return array;
  }

  public void showArray(int[] Array){
    for(int index=0;index<array.length;index++){
      System.out.print(array[index]);
      if(index< array.length-1){
        System.out.print(",");
      }
    }
  }

}
