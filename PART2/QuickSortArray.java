public class QuickSortArray {
    /**
     * Sort the table using the quicksort algorithm.
     *
     * @param table The array to be sorted
     * @pre table contains Comparable objects.
     * @post table is sorted.
     */
    public static <T extends Comparable<T>> void sort(T[] table) {
        // Sort the whole table.
        quickSort(table, 0, table.length - 1);
    }

    /**
     * Sort a part of the table using the quicksort algorithm.
     *
     * @param table The array to be sorted
     * @param first The index of the low bound
     * @param last  The index of the high bound
     * @post The part of table from first through last is sorted.
     */
    private static <T extends Comparable<T>> void quickSort(T[] table,
                                                            int first, int last) {
        if (first < last) { // There is data to be sorted.
            // Partition the table.
            int pivIndex = partition(table, first, last);
            // Sort the left half.
            quickSort(table, first, pivIndex - 1);
            // Sort the right half.
            quickSort(table, pivIndex + 1, last);
        }
    }

    /**
     * Partition the table so that values from first to pivIndex
     * are less than or equal to the pivot value, and values from
     * pivIndex to last are greater than the pivot value.
     *
     * @param table The table to be partitioned
     * @param first The index of the low bound
     * @param last  The index of the high bound
     * @return The location of the pivot value
     */
    private static <T extends Comparable<T>> int partition(T[] table,
                                                           int first, int last) {


        // Select the first item as the pivot value.
        T pivot = table[first];
        int up = first;
        int down = last;
        do {

            while ((up < last) && (pivot.compareTo(table[up]) >= 0)) {
                up++;
            }

            while (pivot.compareTo(table[down]) < 0) {
                down--;
            }

            if (up < down) {

                swap(table, up, down);
            }
        } while (up < down);

        swap(table, first, down);

        return down;

    }
    private static <T extends Comparable<T>> void swap(T[] table,
                                                       int i, int j) {
        T temp = table[i];
        table[i] = table[j];
        table[j] = temp;
    }

}