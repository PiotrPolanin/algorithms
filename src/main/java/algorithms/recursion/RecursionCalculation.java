package algorithms.recursion;

public class RecursionCalculation {

    private final static String ERROR_MESSAGE_FOR_LAST_INDEX_PARAMETER = "Number of last index is greater than array size";
    private final static String ERROR_MESSAGE_FOR_ARRAY_PARAMETER = "Array parameter is null";

    public static int sum(int[] input, int numberOfLastIndex) {
        if (input == null) {
            throw new IllegalArgumentException(ERROR_MESSAGE_FOR_ARRAY_PARAMETER);
        }
        if (input.length > 0) {
            if (numberOfLastIndex > input.length - 1) {
                throw new IllegalArgumentException(ERROR_MESSAGE_FOR_LAST_INDEX_PARAMETER);
            } else if (numberOfLastIndex == 0) {
                return input[numberOfLastIndex];
            } else {
                return input[numberOfLastIndex] + sum(input, numberOfLastIndex - 1);
            }
        }
        return 0;
    }

    public static int size(int[] input) {
        if (input != null) {
            if (input.length == 0) {
                return 0;
            } else {
                return 1 + size(reduceSize(input));
            }
        }
        throw new IllegalArgumentException(ERROR_MESSAGE_FOR_ARRAY_PARAMETER);
    }

    public static int[] reduceSize(int[] input) {
        if (input != null) {
            if (input.length > 0) {
                int[] reducedInput = new int[input.length - 1];
                for (int i = 0; i < reducedInput.length; i++) {
                    reducedInput[i] = input[i];
                }
                return reducedInput;
            }
            return input;
        }
        throw new IllegalArgumentException(ERROR_MESSAGE_FOR_ARRAY_PARAMETER);
    }

    public static int max(int[] input) {
        if (input != null) {
            if (input.length == 1) {
                return input[0];
            } else {
                return input[input.length - 1] > max(reduceSize(input)) ? input[input.length - 1] : max(reduceSize(input));
            }
        }
        throw new IllegalArgumentException(ERROR_MESSAGE_FOR_ARRAY_PARAMETER);
    }

}
