package yoh.algorithms.sorting.selection;

import static yoh.algorithms.sorting.SortUtils.*;

/**
 * @author yohahn.kim
 * @since 7/13/14 9:41 PM
 */
public class SelectionSort {

    private SelectionSort() {

    }

    /**
     * Mistakes:
     *
     * 1. initializing minValue with Integer.MIN_VALUE
     *
     * @param array
     */
    public static void sort(int[] array) {

        if (array != null && array.length > 1) {
            for (int minIndexWithNotSortedValue = 0; minIndexWithNotSortedValue < array.length; minIndexWithNotSortedValue++) {
                int minValue = Integer.MAX_VALUE;
                int indexWithMinValue = minIndexWithNotSortedValue;
                for (int currentIndex = minIndexWithNotSortedValue; currentIndex < array.length; currentIndex++) {
                    if (minValue > array[currentIndex]) {
                        minValue = array[currentIndex];
                        indexWithMinValue = currentIndex;
                    }
                }
                if (minIndexWithNotSortedValue != indexWithMinValue) {
                    swap(array, minIndexWithNotSortedValue, indexWithMinValue);
                }
            }
        }
    }

}
