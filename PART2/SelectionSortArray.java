public class SelectionSortArray {
    /** Sort the array using selection sort algorithm.
     @pre table contains Comparable objects.
     @post table is sorted.
     @param table The array to be sorted
     */
    public static void sort(Comparable[] table) {
        int n = table.length;
        for (int fill = 0; fill < n - 1; fill++) {
            // Invariant: table[0 . . . fill – 1] is sorted.
            int posMin = fill;
            for (int next = fill + 1; next < n; next++) {

                if (table[next].compareTo(table[posMin]) < 0) {
                    posMin = next;
                }
            }


            Comparable temp = table[fill];
            table[fill] = table[posMin];
            table[posMin] = temp;

        }

    }
}
