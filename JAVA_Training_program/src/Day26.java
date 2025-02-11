public class Day26 {
    
}
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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head ==null || head.next==null){
            return null;
        }
        ListNode cur_no = head;
        int count = 0;
        while(cur_no!=null){
            count++;
            cur_no = cur_no.next;
        }
        if(count == n){
            return head.next;
        }   

        cur_no = head;
        int curr_count = 0;
        while(cur_no!=null){
            curr_count++;
            if(count-n+1==curr_count){
                if(cur_no == head){
                    head = head.next;
                }
                if(n==1 && count-n+1==n){
                    
                }
                cur_no.next = cur_no.next.next;
                break;
            }
            cur_no = cur_no.next;
        }
        return head;
    }
}