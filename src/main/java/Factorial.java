public class Factorial {

    public int factorialFor(int number){
        int result = 1;

        if(number < 0){
            throw new IllegalArgumentException("Factorials are only defined for non-negative integers");
        }

        if(number <=1){
            return result;
        }

        for(int index = number; index>=1;index--){
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
