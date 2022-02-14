package algorithms.selection_sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortingTest {

    @Test
    public void throwsIllegalArgumentExceptionWhenArrayParameterIsEmpty() {
        //Given
        int[] emptyArray = {};
        //Then
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> SelectionSorting.sort(emptyArray));
        assertEquals("Array cannot be null or empty", illegalArgumentException.getMessage());
    }

    @Test
    public void throwsIllegalArgumentExceptionWhenArrayParameterIsNull() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> SelectionSorting.sort(null));
        assertEquals("Array cannot be null or empty", illegalArgumentException.getMessage());
    }

    @Test
    public void returnProperlySortedArrayWithPositiveNumbers() {
        //Given
        int[] numbers = {10, 57, 2, 24, 67, 1, 9, 0};
        int[] expectedSortedNumbers = {0, 1, 2, 9, 10, 24, 57, 67};
        //When
        int[] sortedNumbers = SelectionSorting.sort(numbers);
        //Then
        assertArrayEquals(expectedSortedNumbers, sortedNumbers);
    }

    @Test
    public void returnProperlySortedArrayWithNegativeNumbers() {
        //Given
        int[] numbers = {-5, -8, -18, -33, -58, -100, -250, 0};
        int[] expectedSortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(expectedSortedNumbers);
        //When
        int[] sortedNumbers = SelectionSorting.sort(numbers);
        //Then
        assertArrayEquals(expectedSortedNumbers, sortedNumbers);
    }

    @Test
    public void returnProperlySortedArrayWithPositiveAndNegativeNumbers() {
        //Given
        int[] numbers = {-5, 24, -8, 78, -18, 0, 44, 33, -58, 65, -100, 103, -250};
        int[] expectedSortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(expectedSortedNumbers);
        //When
        int[] sortedNumbers = SelectionSorting.sort(numbers);
        //Then
        assertArrayEquals(expectedSortedNumbers, sortedNumbers);
    }


}

