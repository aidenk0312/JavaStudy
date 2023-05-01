package study_6;

public class study110 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    /**
     * 풀이
     * 연결 리스트의 가장 앞쪽 노드가 가장 높은 자릿수를 가지므로, 연결 리스트를 순회하면서 값을 누적하고
     * 각 단계에서 누적된 값을 2배씩 늘어남
     * 연결 리스트 [1, 0, 1]이 주어졌을 때, 이진 표현으로 101이므로 이를 십진수로 변환하면 결과값 5
     * 연결리스트: 연결리스트(linked list)는 데이터 요소를 순서대로 저장하는 자료구조 중 하나로,
     * 각 요소(node 또는 노드)는 데이터와 다음 요소의 주소(포인터)를 가지고 있습니다.
     *
     * 연결리스트는 배열과 달리 메모리 상에서 연속적으로 위치하지 않으며, 각 요소들이 링크(포인터)를 통해 연결되어 있음
     */

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution {
        public int getDecimalValue(ListNode head) {
            int decimalValue = 0;
            ListNode currentNode = head;

            while (currentNode != null) {
                decimalValue = decimalValue * 2 + currentNode.val;
                currentNode = currentNode.next;
            }

            return decimalValue;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));

        Solution solution = new Solution();
        System.out.println(solution.getDecimalValue(head));
    }
}