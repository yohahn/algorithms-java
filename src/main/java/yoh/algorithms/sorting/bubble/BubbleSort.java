package yoh.algorithms.sorting.bubble;

/**
 * @author yohahn.kim
 * @since 7/13/14 8:31 PM
 */
public class BubbleSort {

    private BubbleSort() {

    }

    /**
     * Mistakes:
     *
     * 1. Not handling null array
     * 2. Not handling array of length 1
     * 3. setting maxIndex to array.length instead of array.length-1
     *
     * @param array
     */
    public static void sort(int[] array) {

        if (array != null && array.length > 1) {
            for (int maxIndex = array.length-1; maxIndex > 0; maxIndex--) {
                for (int currentIndex = 0; currentIndex < maxIndex; currentIndex++ ) {
                    if (array[currentIndex] > array[currentIndex+1]) {
                        swap(array, currentIndex, currentIndex+1);
                    }
                }
            }
        }
    }

    private static void swap(int[] array, int leftIdx, int rightIdx) {
        int temp = array[leftIdx];
        array[leftIdx] = array[rightIdx];
        array[rightIdx] = temp;
    }
}
