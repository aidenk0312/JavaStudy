package study_8;

public class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}

class Solution2 {
    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 dummy = new ListNode2(0);
        ListNode2 current = dummy; // 현재 위치
        int carry = 0; // 자릿수 올림

        while (l1 != null || l2 != null) {
            int sum = carry; // 현재 자리수의 합에 이전 자릿수의 올림을 더함
            if (l1 != null) {
                sum += l1.val; // l1의 값을 합에 더함
                l1 = l1.next; // l1을 다음 노드로 이동
            }
            if (l2 != null) {
                sum += l2.val; // l2의 값을 합에 더함
                l2 = l2.next; // l2를 다음 노드로 이동
            }

            carry = sum / 10; // 올림 값을 계산 (10을 넘어가면 1, 그렇지 않으면 0)
            current.next = new ListNode2(sum % 10); // 합의 일의 자리 값을 결과 노드에 추가
            current = current.next; // 결과 노드의 현재 위치를 다음으로 이동
        }

        // 두 숫자의 모든 자릿수를 더한 후에도 올림이 남아있으면 결과에 추가
        if (carry > 0) {
            current.next = new ListNode2(carry);
        }

        return dummy.next; // 더미 노드의 다음 노드부터 결과를 반환
    }

    public static void main(String[] args) {
        ListNode2 l1 = new ListNode2(2);
        l1.next = new ListNode2(4);
        l1.next.next = new ListNode2(3);

        ListNode2 l2 = new ListNode2(5);
        l2.next = new ListNode2(6);
        l2.next.next = new ListNode2(4);

        Solution2 solution = new Solution2();
        ListNode2 result = solution.addTwoNumbers(l1, l2);
        printList(result);
    }

    public static void printList(ListNode2 head) {
        ListNode2 current = head;
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