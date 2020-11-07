public class InsertionSortArray {


        /** Sort the table using insertion sort algorithm.
         @pre table contains Comparable objects.
         @post table is sorted.
         @param table The array to be sorted
         */
        public static <T extends Comparable<T>> void sort(T[] table) {
            for (int nextPos = 1; nextPos < table.length; nextPos++) {

                insert(table, nextPos);
            }
        }

    private static <T extends Comparable<T>> void insert(T[] table,
                                                         int nextPos) {
        T nextVal = table[nextPos];
        // Element to insert.
        while (nextPos > 0 && nextVal.compareTo(table
                [nextPos - 1]) < 0) {
            table[nextPos] = table[nextPos - 1];
            // Shift down.
            nextPos--;
            // Check next smaller element.
        }
        // Insert nextVal at nextPos.
        table[nextPos] = nextVal;
    }

}
