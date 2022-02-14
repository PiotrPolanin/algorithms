package algorithms.selection_sorting;

public class SelectionSorting {

    public static int[] sort(int[] input) {
        if (input != null && input.length > 0) {
            int[] sorted = new int[input.length];
            int cnt = 0;
            while (input.length > 0) {
                sorted[cnt] = input[getIndexOfSmallest(input)];
                input = removeElement(input, getIndexOfSmallest(input));
                cnt++;
            }
            return sorted;
        }
        throw new IllegalArgumentException("Array cannot be null or empty");
    }

    private static int getIndexOfSmallest(int[] input) {
        int value = input[0];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < value) {
                index = i;
                value = input[i];
            }
        }
        return index;
    }


    private static int[] removeElement(int[] input, int index) {
        int[] result = new int[input.length - 1];
        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = input[i];
            } else {
                result[i] = input[i + 1];
            }
        }
        return result;
    }

}
