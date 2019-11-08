import org.junit.Test;
import sort.MergeSort;
import sort.QuickSort;

public class SortTest {

    @Test
    public void quickSortTest() {
        int[] arr = {10, 23, 2, 4, 5, 7, 24, 1};

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
