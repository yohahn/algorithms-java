package yoh.algorithms.sorting;

/**
 * @author yohahn.kim
 * @since 7/13/14 9:43 PM
 */
public final class SortUtils {

    private SortUtils() {

    }

    public static void swap(int[] array, int leftIdx, int rightIdx) {
        int temp = array[leftIdx];
        array[leftIdx] = array[rightIdx];
        array[rightIdx] = temp;
    }

}
