import java.util.ArrayList;
import java.util.List;
public class SortingList {

   private final List<Integer> myList = new ArrayList<>();

   public void fillList(){
       myList.add(6);
       myList.add(3);
       myList.add(2);
       myList.add(4);
       myList.add(7);
       myList.add(9);
       myList.add(1);
   }

   public void orderList(){
       int listSize = myList.size();
       for(int outerLoopIndex = 0; outerLoopIndex < listSize - 1; outerLoopIndex++){
           for(int innerLoopIndex = 0; innerLoopIndex < listSize - outerLoopIndex - 1; innerLoopIndex++){
               int currentIndexValue = myList.get(innerLoopIndex);
               int nextIndexValue = myList.get(innerLoopIndex+1);
               if(nextIndexValue < currentIndexValue){
                   myList.set(innerLoopIndex,nextIndexValue);
                   myList.set(innerLoopIndex+1,currentIndexValue);
               }
           }
       }
   }

   public void showList(){
    myList.forEach(item -> System.out.println(item));
   }
}
