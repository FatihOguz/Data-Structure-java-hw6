import java.util.LinkedList;

public class MergeSort {

    private static <T extends Comparable<T>> void merge(LinkedList<T> outputSequence, LinkedList<T> leftSequence, LinkedList<T> rightSequence){

        int i = 0;
        // Index into the left input sequence.
        int j = 0;
        // Index into the right input sequence.
        int k = 0;
        // Index into the output sequence.
        // While there is data in both input sequences
        while (i < leftSequence.size() && j < rightSequence.size()){
            // Find the smaller and
            // insert it into the output sequence.
            if (leftSequence.get(i).compareTo(rightSequence.get(j)) < 0) {
                outputSequence.set(k,leftSequence.get(i));
                i++;
                k++;
            } else {
                outputSequence.set(k,rightSequence.get(j));
                j++;
                k++;
            }
        }
        // assert: one of the sequences has more items to copy.
        // Copy remaining input from left sequence into the output.
        while (i < leftSequence.size()) {
            outputSequence.set(k,leftSequence.get(i));
            i++;
            k++;
        }
        // Copy remaining input from right sequence into output.
        while (j < rightSequence.size()) {
            outputSequence.set(k,rightSequence.get(j));
            j++;
            k++;
        }
    }


    public static <T extends Comparable<T>> void sort(LinkedList<T> table){

        // A table with one element is sorted already.
        if (table.size() > 1){
            // Split table into halves.
            int halfSize = table.size() / 2;
            /**
             * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  CASTING***************************
             */
            LinkedList<T> leftTable  = (LinkedList) new LinkedList<Comparable>();
            LinkedList<T> rightTable = (LinkedList) new LinkedList<Comparable>();
            for(int i = 0 ; i < halfSize; i++) {
                leftTable.add(table.get(i));
            }
            for(int i = halfSize; i< table.size() ; i++){
                rightTable.add(table.get(i));
            }

            // Sort the halves.
            sort(leftTable);
            sort(rightTable);
            // Merge the halves.
            merge(table, leftTable, rightTable);

        }
    }
}
