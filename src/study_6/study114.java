package study_6;

/**
 * 단일 연결 리스트의 헤드가 주어졌을 때, 리스트를 뒤집고 뒤집어진 리스트를 반환하는 함수 reverseList()를 작성
 * 이를 재귀적으로 구현하기 위해서는, 먼저 기저 사례를 정의해야 합니다. 기저 사례는 주어진 리스트의 길이가 1 이하인 경우이며,
 * 이때는 리스트를 그대로 반환, 그렇지 않은 경우에는 리스트의 마지막 노드를 찾은 다음, 뒤집어진 리스트의 헤드로 설정하고 이전 노드와 연결
 */

public class study114 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode reversedList = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return reversedList;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        Solution solution = new Solution();
        ListNode reversedList = solution.reverseList(head);

        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}