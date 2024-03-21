class Solution {
 public ListNode reverseList(ListNode head) {
 ListNode curr = head;
 ListNode pre = null;
 ListNode next = null;
 while(curr!=null)
 {
 next = curr.next;
 curr.next = pre;
 pre = curr;
 curr = next;
 }
 return pre;
 }
}