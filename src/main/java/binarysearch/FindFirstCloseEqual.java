package binarysearch;

public class FindFirstCloseEqual {
    /**
     * 找到第一个大于target的元素
     *
     * @param nums
     * @param target
     * @return
     */
    public static int firstGreaterThan(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return nums[left] >= target ? left : right;
    }

    /**
     * 找到第一个大于等于target的元素
     *
     * @param nums
     * @param target
     * @return
     */
    public static int firstGreaterThanEqual(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return nums[left] >= target ? left : right;
    }

    /**
     * 找到第一个大于等于target的元素,如果等于，则找到最大index
     *
     * @param nums
     * @param target
     * @return
     */
    public static int firstGreaterThanEqual2(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return nums[left] >= target ? left : right;
    }
}
