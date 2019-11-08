package sort;

public class InsertSort {

    public static int[] insertSort(int[] arr) {
        if (arr != null && arr.length > 2) {
            for (int i = 1; i < arr.length; i++) {
                //第二次遍历解决当前项应该排在哪个位置
                for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
