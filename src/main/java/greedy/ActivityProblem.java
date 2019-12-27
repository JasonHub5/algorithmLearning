/*
设有n个活动的集合E={1,2,…,n}，其中每个活动都要求使用同一资源，如演讲会场等，而在同一时间内只有一个活动能使用这一资源。
每个活动i都有一个要求使用该资源的起始时间si和一个结束时间fi,且si <fi 。如果选择了活动i，则它在半开时间区间[si, fi)内占用资源。
若区间[si, fi)与区间[sj, fj)不相交，则称活动i与活动j是相容的。也就是说，当si≥fj或sj≥fi时，活动i与活动j相容。

活动安排问题： 要在所给的活动集合中选出最大的相容活动子集合。

活动安排问题的关键是如何按照一定的顺序安排活动，使得选出的活动间相容并能安排尽量多的活动。

例：
设待安排的11个活动的开始时间和结束时间按结束时间的非减序排列如下：

 */

package greedy;

import java.util.ArrayList;
import java.util.List;

public class ActivityProblem {
    public static List<int[]> activityProblem(List<int[]> activities) {
        List<int[]> result = new ArrayList<>();
        activities.sort((x, y) -> {
            return x[1] - y[1];
        });
        result.add(activities.get(0));
        int[] pre = activities.get(0);
        for (int i = 1; i < activities.size(); i++) {
            int[] act = activities.get(i);
            if (act[0] > pre[1]) {
                result.add(act);
                pre = act;
            }
        }
        return result;
    }
}
