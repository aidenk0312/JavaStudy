package study_8;

import java.util.ArrayList;

public class minheap {
    private ArrayList<Integer> heap;

    public minheap() {
        heap = new ArrayList<>();
    }

    public int min() {
        return heap.get(0);
    }

    public int size() {
        return heap.size();
    }

    public void insert(int val) {
        heap.add(val);
        int index = heap.size() - 1;
    }

}
