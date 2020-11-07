import java.util.Comparator;
import java.util.LinkedList;

public class SelectionSort {

    public static void sort(LinkedList<Comparable> table){
        int n = table.size();
        for(int fill = 0; fill < n-1; fill++){

            int postMin = fill;
            for(int next = fill + 1 ; next < n ; next++){

                if(table.get(next).compareTo(table.get(postMin))<0){

                    postMin = next;
                }

            }

            Comparable temp = table.get(fill);
            table.set(fill,table.get(postMin));
            table.set(postMin,temp);
        }
    }

}
