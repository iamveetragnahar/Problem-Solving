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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            ListNode itr = lists[i];
            while(itr != null){
                l.add(itr.val);
                itr = itr.next;
            }
        }
        if(n==0 || l.size()==0){
            return null;
        }
        Collections.sort(l);
        ListNode head = new ListNode(l.get(0));
        ListNode it = head;
        for(int i=1;i<l.size();i++){
            ListNode a = new ListNode(l.get(i));
            it.next = a;
            it = it.next;
        }
        it.next = null;
        return head;
    }
}