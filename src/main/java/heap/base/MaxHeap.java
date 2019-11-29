package heap.base;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MaxHeap {

    ArrayList<Integer> list = null;

    public MaxHeap() {
        list = new ArrayList<>();
    }

    /**
     * 堆长度
     *
     * @return
     */
    public int getSize() {
        return list.size();
    }

    /**
     * 判空
     *
     * @return
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * 取堆顶
     *
     * @return
     */
    public int peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("max heap has no data");
        }
        return list.get(0);
    }

    /**
     * 左孩子index
     *
     * @param index
     * @return
     */
    public int leftChildIndex(int index) {
        return 2 * index + 1;
    }

    /**
     * 右孩子index
     *
     * @param index
     * @return
     */
    public int rightChildIndex(int index) {
        return 2 * index + 2;
    }

    /**
     * 父节点值
     *
     * @param index
     * @return
     */
    public int perent(int index) {
        return list.get(perentIndex(index));
    }

    /**
     * 父节点index
     *
     * @param index
     * @return
     */
    public int perentIndex(int index) {
        return (index - 1) / 2;
    }

    private void swap(int i, int j) {
        int t = list.get(i);
        list.set(i, list.get(j));
        list.set(j, t);
    }

    /**
     * 添加
     *
     * @param value
     */
    public MaxHeap add(int value) {
        list.add(value);
        siftUp(list.size() - 1);
        return this;
    }

    /**
     * 向上构造堆
     *
     * @param current
     */
    private void siftUp(int current) {
        while (current > 0 && list.get(current) > perent(current)) {
            swap(current, perentIndex(current));
            current = perentIndex(current);
        }
    }

    /**
     * 向下构造堆
     *
     * @param current
     */
    private void siftDown(int current) {
        int left = leftChildIndex(current);
        while (left < list.size()) {
            if ((left + 1) < list.size() && list.get(left) < list.get(left + 1)) {
                left = left + 1;
            }
            if (list.get(left) > list.get(current)) {
                swap(left, current);
                current = left;
                left = leftChildIndex(current);
            } else {
                break;
            }
        }
    }

    /**
     * 删除堆顶
     *
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("max heap has no data");
        }
        if (list.size() == 0) {
            int result = list.get(0);
            list.remove(0);
            return result;
        } else {
            int result = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
            siftDown(0);
            return result;
        }
    }
}
