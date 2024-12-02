/**
 * Copyright 2024 American Well Systems
 * All rights reserved.
 * <p>
 * It is illegal to use, reproduce or distribute
 * any part of this Intellectual Property without
 * prior written authorization from American Well.
 */
public class Factorial {

    public int factorialFor(int number){
        int result = 1;
        if(number <=1){
            return 1;
        }
        for(int index = 1; index<=number;index++){
            result = result * index;
        }
        return result;
    }

    public int recursionFactorialFor(int number){
        if(number <=1){
            return 1;
        }
        return number * recursionFactorialFor(number - 1);
    }
}
