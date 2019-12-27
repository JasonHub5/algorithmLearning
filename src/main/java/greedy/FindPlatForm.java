/*
火车站台数量问题
假设已知某个火车站的所有过往列车的到达arrival和离开departure时间（同一天），如果要求所有列车都不等待直接进站，问至少需要多少个站台。
无需考虑晚点等特殊情况。

例如，
Input：
到达时间： arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
离开时间： dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

Output：
3 （最多有3辆列车同时进站（在11:00到11:20之间））
 */
package greedy;

import java.util.Arrays;

public class FindPlatForm {
    public static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int result = 1;
        int currNeed = 1;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            currNeed++;
            if (arr[i] > dep[j]) {
                while (j <= i && dep[j] < arr[i]) {
                    currNeed--;
                    j++;
                }
            }
            result = Math.max(currNeed, result);
        }
        return result;
    }

    public static int findPlatform2(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int result = 0;
        int currNeed = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (arr[i] < dep[j]) {
                currNeed++;
                i++;
                result = Math.max(result, currNeed);
            } else {
                currNeed--;
                j++;
            }
        }
        return result;
    }
}
