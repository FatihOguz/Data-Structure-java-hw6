import java.util.LinkedList;

public class ShellSort {

    public static <T extends Comparable<T>> void sort(LinkedList<T> table){
        int gap = table.size() / 2 ;
        while(gap > 0 ){
            for (int nextPos = gap; nextPos < table.size(); nextPos++){
                insert(table, nextPos, gap);
            }
            if (gap == 2) {
                gap = 1;
            } else {
                gap = (int) (gap / 2.2);
            }

        }

    }



    private static <T extends Comparable<T>> void insert(LinkedList<T> table,int nextPos, int gap){

        T nextVal = table.get(nextPos);

        while ((nextPos > gap - 1) && (nextVal.compareTo(table.get(nextPos - gap)) < 0)){
            table.set(nextPos,table.get(nextPos-gap));
            nextPos -= gap;
        }
        table.set(nextPos,nextVal);

    }
}
