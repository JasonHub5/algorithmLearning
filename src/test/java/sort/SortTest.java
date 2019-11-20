package sort;

import org.junit.Test;
import sort.HillSort;
import sort.InsertSort;
import sort.MergeSort;
import sort.QuickSort;

public class SortTest {

    @Test
    public void insertSortTest(){
        int[] arr = {10, 23, 2, 4, 5, 7, 24, 1};
        int[] ints = InsertSort.insertSort(arr);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    @Test
    public void hillSortTest(){
        int[] arr = {10, 23, 2, 4, 5, 7, 24, 1};
        int[] ints = HillSort.hillSort(arr);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    @Test
    public void quickSortTest() {
        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};

        int[] ints = QuickSort.quickSort(arr, 0, arr.length - 1);

        for (int i : ints) {
            System.out.println(i);
        }
    }

    @Test
    public void mergeSortTest() {
        int[] arr = {10, 23, 2, 4, 5, 7, 24, 1};

        int[] ints = MergeSort.mergeSort(arr);

        for (int i : ints) {
            System.out.println(i);
        }
    }
}
