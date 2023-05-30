package study_8;


import java.util.*;

public class Node<T> {
    private T element;
    private Node<T> parent;
    private List<Node<T>> children;

    public Node(T element) {
        this.element = element;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void addChild(Node<T> child) {
        child.setParent(this);
        children.add(child);
    }

    public int getDepth() {
        if (parent == null) {
            return 0;
        }
        return parent.getDepth() + 1;
    }

    public int getHeight() {
        if (children.isEmpty()) {
            return 0;
        }

        int maxChildHeight = 0;
        for (Node<T> child : children) {
            int childHeight = child.getHeight();
            if (childHeight > maxChildHeight) {
                maxChildHeight = childHeight;
            }
        }
        return maxChildHeight + 1;
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);

        node1.addChild(node2);
        node1.addChild(node3);
        node3.addChild(node4);

        System.out.println("1의 부모: " + node1.getParent());
        System.out.println("2의 부모: " + node2.getParent().getElement());
        System.out.println("3의 부모: " + node3.getParent().getElement());
        System.out.println("4의 부모: " + node4.getParent().getElement());
        System.out.println("=================");
        System.out.println("1의 자식: " + node1.getChildren().size());
        System.out.println("2의 자식: " + node2.getChildren().size());
        System.out.println("3의 자식: " + node3.getChildren().size());
        System.out.println("4의 자식: " + node4.getChildren().size());
        System.out.println("=================");
        System.out.println("1의 깊이: " + node1.getDepth());
        System.out.println("2의 깊이: " + node2.getDepth());
        System.out.println("3의 깊이: " + node3.getDepth());
        System.out.println("4의 깊이: " + node4.getDepth());
        System.out.println("=================");
        System.out.println("1의 높이: " + node1.getChildren());
        System.out.println("2의 높이: " + node2.getChildren());
        System.out.println("3의 높이: " + node3.getChildren());
        System.out.println("4의 높이: " + node4.getChildren());
    }
}
