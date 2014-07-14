package yoh.algorithms.sorting.bubble;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author yohahn.kim
 * @since 7/13/14 8:50 PM
 */
public class BubbleSortTest {

    @Test
    public void sort_NullArray() {

        BubbleSort.sort(null);
    }

    @Test
    public void sort_EmptyArray() {

        int[] fixture = {};
        BubbleSort.sort(fixture);
    }


    @Test
    public void sort_One() {

        int[] actual = { 3 };
        BubbleSort.sort(actual);

        int[] expected = { 3 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sort_Two() {

        int[] actual = { 10, 3 };
        BubbleSort.sort(actual);

        int[] expected = { 3, 10 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sort_Unique() {

        int[] actual = { 10, 1, 8, 2, 6, 9, 4, 3, 7, 5 };
        BubbleSort.sort(actual);

        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sort_Duplicate() {


        int[] actual = { 10, 1, 8, 2, 6, 10, 4, 3, 8, 5 };
        BubbleSort.sort(actual);

        int[] expected = { 1, 2, 3, 4, 5, 6, 8, 8, 10, 10 };
        assertArrayEquals(expected, actual);
    }
}
