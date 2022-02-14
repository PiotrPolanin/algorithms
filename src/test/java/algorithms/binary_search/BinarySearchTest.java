package algorithms.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    private final int[] sortedNumbers = {-8, 1, 5, 10, 16, 20, 36};

    @Test
    public void returnPositionOfNumberLocatedAtFirstIndexOfArray() {
        //Given
        int numberToFind = -8;
        int numberIndex = 0;
        //When
        int foundNumber = BinarySearch.getPositionOfNumber(sortedNumbers, numberToFind);
        //Then
        assertEquals(numberIndex, foundNumber);
    }

    @Test
    public void returnPositionOfNumberLocatedAtLastIndexOfArray() {
        //Given
        int numberToFind = 36;
        int numberIndex = 6;
        //When
        int foundNumber = BinarySearch.getPositionOfNumber(sortedNumbers, numberToFind);
        //Then
        assertEquals(numberIndex, foundNumber);
    }

    @Test
    public void returnPositionOfNumberLocatedInTheMiddleOfArray() {
        //Given
        int numberToFind = 10;
        int numberIndex = 3;
        //When
        int foundNumber = BinarySearch.getPositionOfNumber(sortedNumbers, numberToFind);
        //Then
        assertEquals(numberIndex, foundNumber);
    }

    @Test
    public void throwsIllegalArgumentExceptionWhenNumberDoesNotExistInArray() {
        //Given
        int numberToFind = 100;
        //Then
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> BinarySearch.getPositionOfNumber(sortedNumbers, numberToFind));
        assertEquals("Array parameter doesn't contain number " + numberToFind, illegalArgumentException.getMessage());
    }

    @Test
    public void throwsIllegalArgumentExceptionWhenArrayIsEmpty() {
        //Given
        int[] emptyArray = {};
        int numberToFind = 15;
        //Then
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> BinarySearch.getPositionOfNumber(emptyArray, numberToFind));
        assertEquals("Array cannot be null or empty", illegalArgumentException.getMessage());
    }

    @Test
    public void throwsIllegalArgumentExceptionWhenArrayIsNull() {
        //Given
        int[] nullArray = null;
        int numberToFind = 1;
        //Then
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> BinarySearch.getPositionOfNumber(nullArray, numberToFind));
        assertEquals("Array cannot be null or empty", illegalArgumentException.getMessage());
    }

}
