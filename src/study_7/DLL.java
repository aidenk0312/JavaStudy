package study_7;

class dllNode {
    int data;
    dllNode next;
    dllNode prev;
    dllNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
public class DLL {
    dllNode head;
    dllNode tail;
    int size;

    void addFront(int data) {
        dllNode newNode = new dllNode(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    void removeFront() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
    }

    int size() {
        return size;
    }

    int front() {
        if (head == null) {
            return 0;
        }
        return head.data;
    }

    void addBack(int data) {
        dllNode newNode = new dllNode(data);
        if (tail != null) {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    void removeBack() {
        if (head == null) {
            return;
        }
        if (tail == null) {
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }
        if (size == 0) {
            head = null;
        }
        size--;
    }

    void insertPrev(dllNode node, int data) {
        dllNode newNode = new dllNode(data);
        newNode.prev = node.prev;
        newNode.next = node;
        node.prev = newNode;
        if (newNode.prev != null) {
            newNode.prev.next = newNode;
        } else {
            head = newNode;
        }
        size++;
    }

    void remove(dllNode node) {
        if (head == null) {
            return;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
        size--;
    }

    void print() {
        dllNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printReverse() {
        dllNode curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFront(1);
        dll.addFront(2);
        dll.addFront(3);

        System.out.println("==================");

        System.out.println("Size: " + dll.size);
        System.out.println("Front: " + dll.front());
        dll.print();
        dll.printReverse();

        System.out.println("==================");

        dll.addBack(2);
        dll.addBack(3);

        System.out.println("Size: " + dll.size);
        System.out.println("Front: " + dll.front());
        dll.print();
        dll.printReverse();

        System.out.println("==========removeback========");
        dll.removeBack();
        dll.removeBack();
        dll.removeBack();
        dll.removeBack();
        dll.removeBack();

        System.out.println("Size: " + dll.size);
        System.out.println("Front: " + dll.front());
        dll.print();
        dll.printReverse();

    }
}
