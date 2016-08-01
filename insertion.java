public class InsertionSort {
    
    
    public static int[] insertionSort(int[] intarray) {
        for (int i = 1; i < list.length; i++) {
            int next = list[i];
            // find the insertion location while moving all larger element up
            int j = i;
            while (j > 0 && intarray[j - 1] > next) {
                intarray[j] = intarray[j - 1];
                j--;
            }
            // insert the element
            intarray[j] = next;
        }
        return list;
    }
}