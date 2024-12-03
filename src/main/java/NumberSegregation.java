import java.util.ArrayList;
import java.util.List;

public class NumberSegregation {

    private final List<Integer>  oddNumberList = new ArrayList<>();
    private final List<Integer> evenNumberList = new ArrayList<>();

    public List<Integer> getEvenNumberList() {
        return evenNumberList;
    }

    public List<Integer> getOddNumberList() {
        return oddNumberList;
    }

    public void segregateListNumbers(List<Integer> numbersList){
        for(Integer number: numbersList) {
            if ((number % 2) == 0){
                evenNumberList.add(number);
            }else {
                oddNumberList.add(number);
            }
        }
    }

    public List<Integer> fillOutList(){
        List<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(1);
        numberList.add(5);
        numberList.add(6);
        numberList.add(4);
        numberList.add(7);
        numberList.add(12);
        numberList.add(21);
        return numberList;
    }

    public void showList(List<Integer> list){
        list.stream().forEach(System.out::println);
    }
}
