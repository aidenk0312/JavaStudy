package study_8;

// void push(int x): 요소 x를 큐의 뒤쪽에 추가합니다.
// int pop(): 큐의 앞쪽에서 요소를 제거하고 반환합니다.
// int peek(): 큐의 앞쪽에 있는 요소를 반환합니다.
// boolean empty(): 큐가 비어 있으면 true, 그렇지 않으면 false를 반환합니다.

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1; // 추가
    Stack<Integer> stack2; // 삭제

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        int peekOutput = myQueue.peek();
        int popOutput = myQueue.pop();
        boolean emptyOutput = myQueue.empty();

        System.out.println("peek: " + peekOutput);
        System.out.println("pop: " + popOutput);
        System.out.println("empty: " + emptyOutput);
    }
}