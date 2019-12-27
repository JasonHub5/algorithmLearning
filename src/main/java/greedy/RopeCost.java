/*
连接绳索的最小成本
有n根不同长度的绳子，我们需要把这些绳子连接成一根绳子。连接两根绳子的费用等于它们的长度之和。我们需要以最低的成本连接绳索。

例如，如果我们有4根绳子，长度分别为4、3、2和6。我们可以用以下方法连接绳子。

1）首先连接长度为2和3的绳索。现在我们有三根绳子，长度分别是4、6和5。

2）现在连接长度为4和5的绳索。现在我们有两条长度为6和9的绳子。

3）最后连接两条绳索，所有绳索都已连接。

所有绳索的连接总成本为5+9+15=29。这是连接绳索的最佳成本。其他连接绳索的方法总是有相同或更多的成本。
例如，如果我们先连接4和6（我们得到3、2和10的三个字符串），然后连接10和3（我们得到13和2的两个字符串）。最后我们连接13和2。
这样的总成本是10+13+15=38。
 */
package greedy;

import java.util.PriorityQueue;

public class RopeCost {
    public static int ropeCost(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> {
            return o1 - o2;
        });
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }
        int curr = heap.poll();
        int cost = 0;
        while (!heap.isEmpty()) {
            heap.add(curr);
            curr = heap.poll() + heap.poll();
            cost += curr;
        }
        return cost;
    }
}
