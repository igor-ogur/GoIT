package practice.practicum3.task5;

import java.util.TreeSet;

public class BinaryHeap {

    TreeSet<Integer> treeSet = new TreeSet<>();

    public BinaryHeap(int size) {

    }

    public void insert(int val) {
        treeSet.add(val);
    }

    public int poll() {
        if (treeSet.size() > 0) {
            int max = treeSet.last();
            treeSet.remove(max);
            return max;
        }
        return 0;
    }
}
