package algorithms.binary_search;

public class BinarySearch {

    public static int getPositionOfNumber(int[] sorted, int number) {
        if (sorted != null && sorted.length > 0) {
            int low = 0;
            int high = sorted.length - 1;
            int mid = 0;
            int cnt = 0;

            while (low <= high) {
                cnt++;
                mid = (low + high) / 2;
                System.out.println(cnt);
                if (sorted[mid] == number) {
                    return mid;
                } else if (sorted[mid] < number) {
                    low = mid + 1;
                } else if (sorted[mid] > number) {
                    high = mid - 1;
                }
            }
            throw new IllegalArgumentException(String.format("Array parameter doesn't contain number %s", number));
        }
        throw new IllegalArgumentException("Array cannot be null or empty");
    }
}
