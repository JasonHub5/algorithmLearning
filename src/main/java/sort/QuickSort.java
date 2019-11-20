package sort;

public class QuickSort {

    /**
     * 快速排序
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int[] quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return arr;
        }

        int pivot = partition1(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);

        return arr;
    }

    /**
     * find pivot （从右边开始遍历）
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int partition1(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            //从右边开始
            while (i <= j && arr[j] >= pivot) {
                j--;
            }
            //再遍历左边
            while (i <= j && arr[i] <= pivot) {
                i++;
            }

            if (i >= j) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[j];
        arr[j] = pivot;

        return j;
    }

    /**
     * find pivot （从左边开始遍历）
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int partition2(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            //从左边开始
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            //再遍历右边
            while (i <= j && arr[j] >= pivot) {
                j--;
            }

            if (i >= j) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[j];
        arr[j] = pivot;

        return j;
    }
}
