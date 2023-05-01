package study_8;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        // 노드가 없거나, 노드의 다음 노드가 없을 때 노드를 반환
        if (head == null || head.next == null) {
            return head;
        }

        // 재귀 호출로 뒤집힌 연결 리스트를 반환받음
        ListNode reversedList = reverseList(head.next);

        // 현재 노드를 뒤집힌 리스트의 마지막 노드로 연결
        head.next.next = head;

        // 현재 노드의 다음 노드를 null로 설정하여 뒤집힌 연결 리스트의 끝을 표시
        head.next = null;

        // 뒤집힌 연결 리스트를 반환
        return reversedList;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode reveredList = solution.reverseList(head);
        printList(reveredList);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" > ");
            }
            current = current.next;
        }
        System.out.println();
    }
}



