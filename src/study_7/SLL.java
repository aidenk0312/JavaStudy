package study_7;

class sllNode {
    int data;
    sllNode next;
    sllNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    sllNode head;
    int size;

    void addFront(int data) {
        sllNode newNode = new sllNode(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    void RemoveFront() {
        if (head == null) {
            return;
        }
        head = head.next;
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

    void print() {
        sllNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.addFront(1);
        sll.addFront(2);
        sll.addFront(3);

        System.out.println("Size: " + sll.size);
        System.out.println("Front: " + sll.front());
        sll.print();

        sll.RemoveFront();
        System.out.println("Size: " + sll.size);
        System.out.println("Front: " + sll.front());
        sll.print();

        sll.RemoveFront();
        sll.RemoveFront();
        System.out.println("Size: " + sll.size);
        System.out.println("Front: " + sll.front());
        sll.print();

        sll.addFront(1);
        sll.addFront(2);
        System.out.println("Size: " + sll.size);
        System.out.println("Front: " + sll.front());
        sll.print();
    }
}
