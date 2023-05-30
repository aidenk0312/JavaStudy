package study_8;

public class DynamicArray {
    private int size; // 크기
    private int capacity; // 용량
    private int[] data;

    public DynamicArray(int initialCapacity) {
        capacity = initialCapacity;
        data = new int[capacity];
        size = 0;
    }

    public void insert(int index, int value) {
        if (size == capacity) {
            doubleSize();
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        size++;
    }

    public void doubleSize() {
        capacity *= 2;
        int[] newData = new int[capacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void addBack(int value) {
        insert(size, value);
    }

    public void removeAt(int index) {
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }

        size--;
    }

    public void removeBack() {
        removeAt(size - 1);
    }

    public int size() {
        return size;
    }

    public int getByIndex(int index) {
        return data[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + (i < size - 1 ? ", " : ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(4);

        dynamicArray.addBack(1);
        dynamicArray.addBack(2);
        dynamicArray.addBack(3);
        dynamicArray.addBack(4);

        dynamicArray.print();

        System.out.println("=====================");
        dynamicArray.insert(2,5);
        dynamicArray.print();

        System.out.println("=====================");
        dynamicArray.removeAt(3);
        dynamicArray.print();

    }
}
