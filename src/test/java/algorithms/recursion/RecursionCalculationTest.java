package algorithms.recursion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionCalculationTest {

    @Test
    public void shouldSumThrowsIllegalArgumentExceptionWhenArrayParameterIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> RecursionCalculation.sum(null, 5));
        assertEquals("Array parameter is null", exception.getMessage());
    }

    @Test
    public void shouldSumThrowsIllegalArgumentExceptionWhenLastIndexIsGreaterThenArraySize() {
        //Given
        int[] numbers = {1, 5, 6, 7};
        //Then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> RecursionCalculation.sum(numbers, numbers.length));
        assertEquals("Number of last index is greater than array size", exception.getMessage());
    }

    @Test
    public void shouldSumReturnZeroWhenArrayParameterIsEmpty() {
        //Given
        int[] empty = {};
        //When
        int result = RecursionCalculation.sum(empty, 0);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void shouldSumReturnProperResultWhenArrayParameterHasOneElement() {
        //Given
        int[] number = {5};
        //Then
        int result = RecursionCalculation.sum(number, 0);
        //Then
        assertEquals(5, result);
    }


    @Test
    public void shouldSumReturnProperResultWhenInputParametersAreCorrect() {
        //Given
        int[] numbers = {-3, 0, 8, 12, 35};
        //When
        int result = RecursionCalculation.sum(numbers, numbers.length - 1);
        //Then
        assertEquals(Arrays.stream(numbers).sum(), result);
    }

    @Test
    public void shouldReduceSizeThrowsIllegalArgumentExceptionWhenArrayParameterIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> RecursionCalculation.reduceSize(null));
        assertEquals("Array parameter is null", exception.getMessage());
    }

    @Test
    public void shouldReduceSizeReturnEmptyArrayWhenArrayParameterHasOneElement() {
        //Given
        int[] number = {4};
        //When
        int[] result = RecursionCalculation.reduceSize(number);
        //Then
        assertEquals(number.length - 1, result.length);
    }

    @Test
    public void shouldReduceSizeReturnEmptyArrayWhenArrayParameterIsEmptyToo() {
        //Given
        int[] empty = {};
        //When
        int[] result = RecursionCalculation.reduceSize(empty);
        //Then
        assertEquals(empty.length, result.length);
    }

    @Test
    public void shouldReduceSizeReturnArrayWhenArrayParameterHasMoreElements() {
        //Given
        int[] empty = {5, 6, 9, 10, 3};
        int[] expected_result_1 = Arrays.copyOfRange(empty, 0, empty.length - 1);
        int[] expected_result_2 = Arrays.copyOfRange(empty, 0, empty.length - 2);
        int[] expected_result_3 = Arrays.copyOfRange(empty, 0, empty.length - 3);
        int[] expected_result_4 = Arrays.copyOfRange(empty, 0, empty.length - 4);
        int[] expected_result_5 = Arrays.copyOfRange(empty, 0, empty.length - 5);
        //When
        int[] result_1 = RecursionCalculation.reduceSize(empty);
        int[] result_2 = RecursionCalculation.reduceSize(result_1);
        int[] result_3 = RecursionCalculation.reduceSize(result_2);
        int[] result_4 = RecursionCalculation.reduceSize(result_3);
        int[] result_5 = RecursionCalculation.reduceSize(result_4);
        //Then
        assertEquals(expected_result_1.length, result_1.length);
        assertArrayEquals(expected_result_1, result_1);
        assertEquals(expected_result_2.length, result_2.length);
        assertArrayEquals(expected_result_2, result_2);
        assertEquals(expected_result_3.length, result_3.length);
        assertArrayEquals(expected_result_3, result_3);
        assertEquals(expected_result_4.length, result_4.length);
        assertArrayEquals(expected_result_4, result_4);
        assertEquals(expected_result_5.length, result_5.length);
        assertArrayEquals(expected_result_5, result_5);
    }

    @Test
    public void shouldSizeThrowsIllegalArgumentExceptionWhenArrayParameterIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> RecursionCalculation.size(null));
        assertEquals("Array parameter is null", exception.getMessage());
    }

    @Test
    public void shouldSizeReturnZeroWhenArrayParameterIsEmpty() {
        //Given
        int[] empty = {};
        //When
        int result = RecursionCalculation.size(empty);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void shouldSizeReturnProperResultWhenArrayParameterIsNotEmpty() {
        //Given
        int[] numbers = {1, 7, 8, 10};
        //When
        int result = RecursionCalculation.size(numbers);
        //Then
        assertEquals(numbers.length, result);
    }

    @Test
    public void shouldMaxThrowsIllegalArgumentExceptionWhenArrayParameterIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> RecursionCalculation.max(null));
        assertEquals("Array parameter is null", exception.getMessage());
    }

    @Test
    public void shouldMaxValueReturnProperResultWhenMaxPositiveValueIsLocatedInDifferentPosition() {
        //Given
        int[] positive_numbers_1 = {0, 3, 7, 5, 10};
        int[] positive_numbers_2 = {3, 0, 5, 10, 7};
        int[] positive_numbers_3 = {7, 5, 10, 0, 7};
        int[] positive_numbers_4 = {5, 10, 0, 7, 3};
        int[] positive_numbers_5 = {10, 7, 3, 0, 5};
        //When
        int positive_numbers_result_1 = RecursionCalculation.max(positive_numbers_1);
        int positive_numbers_result_2 = RecursionCalculation.max(positive_numbers_2);
        int positive_numbers_result_3 = RecursionCalculation.max(positive_numbers_3);
        int positive_numbers_result_4 = RecursionCalculation.max(positive_numbers_4);
        int positive_numbers_result_5 = RecursionCalculation.max(positive_numbers_5);
        //Then
        assertEquals(Arrays.stream(positive_numbers_1).max().orElseThrow(), positive_numbers_result_1);
        assertEquals(Arrays.stream(positive_numbers_2).max().orElseThrow(), positive_numbers_result_2);
        assertEquals(Arrays.stream(positive_numbers_3).max().orElseThrow(), positive_numbers_result_3);
        assertEquals(Arrays.stream(positive_numbers_4).max().orElseThrow(), positive_numbers_result_4);
        assertEquals(Arrays.stream(positive_numbers_5).max().orElseThrow(), positive_numbers_result_5);
    }

    @Test
    public void shouldMaxValueReturnProperResultWhenMaxNegativeValueIsLocatedInDifferentPosition() {
        //Given
        int[] negative_numbers_1 = {-5, -20, -8, -15, -3};
        int[] negative_numbers_2 = {-2, -9, -3, -1, -5};
        int[] negative_numbers_3 = {-30, -25, -10, -15, -20};
        int[] negative_numbers_4 = {-150, -60, -200, -180, -100};
        int[] negative_numbers_5_with_zero = {0, -7, -3, -1, -9};
        int[] negative_numbers_6_with_the_same_value = {-8, -8, -8, -8, -8};
        //When
        int negative_numbers_result_1 = RecursionCalculation.max(negative_numbers_1);
        int negative_numbers_result_2 = RecursionCalculation.max(negative_numbers_2);
        int negative_numbers_result_3 = RecursionCalculation.max(negative_numbers_3);
        int negative_numbers_result_4 = RecursionCalculation.max(negative_numbers_4);
        int negative_numbers_result_5_with_zero = RecursionCalculation.max(negative_numbers_5_with_zero);
        int negative_numbers_result_6_with_the_same_value = RecursionCalculation.max(negative_numbers_6_with_the_same_value);
        //Then
        assertEquals(Arrays.stream(negative_numbers_1).max().orElseThrow(), negative_numbers_result_1);
        assertEquals(Arrays.stream(negative_numbers_2).max().orElseThrow(), negative_numbers_result_2);
        assertEquals(Arrays.stream(negative_numbers_3).max().orElseThrow(), negative_numbers_result_3);
        assertEquals(Arrays.stream(negative_numbers_4).max().orElseThrow(), negative_numbers_result_4);
        assertEquals(Arrays.stream(negative_numbers_5_with_zero).max().orElseThrow(), negative_numbers_result_5_with_zero);
        assertEquals(Arrays.stream(negative_numbers_6_with_the_same_value).max().orElseThrow(), negative_numbers_result_6_with_the_same_value);
    }


}
