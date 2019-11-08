package sort;

public class HillSort {
    public static int[] hillSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        int length = arr.length;
        int gap = length / 2;

        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                for (int j = i - gap; j >= 0 && arr[j] > arr[j + gap]; j--) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            gap /= 2;
        }

        return arr;
    }
}
