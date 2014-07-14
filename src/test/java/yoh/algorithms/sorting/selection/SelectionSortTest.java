package yoh.algorithms.sorting.selection;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author yohahn.kim
 * @since 7/13/14 9:53 PM
 */
public class SelectionSortTest {

    @Test
    public void sort_NullArray() {

        SelectionSort.sort(null);
    }

    @Test
    public void sort_EmptyArray() {

        int[] fixture = {};
        SelectionSort.sort(fixture);
    }


    @Test
    public void sort_One() {

        int[] actual = { 3 };
        SelectionSort.sort(actual);

        int[] expected = { 3 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sort_Two() {

        int[] actual = { 10, 3 };
        SelectionSort.sort(actual);

        int[] expected = { 3, 10 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sort_Unique() {

        int[] actual = { 10, 1, 8, 2, 6, 9, 4, 3, 7, 5 };
        SelectionSort.sort(actual);

        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sort_Duplicate() {


        int[] actual = { 10, 1, 8, 2, 6, 10, 4, 3, 8, 5 };
        SelectionSort.sort(actual);

        int[] expected = { 1, 2, 3, 4, 5, 6, 8, 8, 10, 10 };
        assertArrayEquals(expected, actual);
    }
}
