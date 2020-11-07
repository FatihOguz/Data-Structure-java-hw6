import java.util.LinkedList;

public class HeapSort {

        /** Sort the array using heapsort algorithm.
         @pre table contains Comparable items.
         @post table is sorted.
         @param table The array to be sorted
         */
        public static <T extends Comparable<T>> void sort(LinkedList<T> table){

                buildHeap(table);
                shrinkHeap(table);
        }



    /** buildHeap transforms the table into a heap.
     @pre The array contains at least one item.
     @post All items in the array are in heap order.
     @param table The array to be transformed into a heap
     */
    private static <T extends Comparable<T>> void buildHeap(LinkedList<T> table){


        int n = 1;

        while (n < table.size()){

            n++;
            int child = n - 1;
            int parent = (child - 1) / 2;
            while (parent >= 0 && table.get(parent).compareTo(table.get(child)) < 0){
                swap(table, parent, child);
                child = parent;
                parent = (child - 1) / 2;
            }
        }

    }




    /** shrinkHeap transforms a heap into a sorted array.
     @pre All items in the array are in heap order.
     @post The array is sorted.
     @param table The array to be sorted
     */
    private static <T extends Comparable<T>> void shrinkHeap(LinkedList<T> table){
        int n = table.size();

        while (n > 0){
        n--;
        swap(table, 0, n);


        int parent = 0;
        while (true){
            int leftChild = 2 * parent + 1;
            if (leftChild >= n) {
                break;
            }
            int rightChild = leftChild + 1;

            int maxChild = leftChild;
            if (rightChild < n
                    && table.get(leftChild).compareTo(table.get(rightChild)) < 0){
                maxChild = rightChild;

            }

            if (table.get(parent).compareTo(table.get(maxChild)) < 0){
                swap(table, parent, maxChild);
                parent = maxChild;
            }else{
                break;
            }
        }
    }
}

    /** Swap the items in table[i] and table[j].
     @param table The array that contains the items
     @param i The index of one item
     @param j The index of the other item
     */
    private static <T extends Comparable<T>> void swap(LinkedList<T> table, int i, int j){
        T temp = table.get(i);
        table.set(i,table.get(j));
        table.set(j,temp);
    }

}
