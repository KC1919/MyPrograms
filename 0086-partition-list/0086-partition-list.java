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

    class Pair{
        int idx;
        int val;

        Pair(int val, int idx){
            this.val=val;
            this.idx=idx;
        }
    }

    public ListNode partition(ListNode head, int x) {
        
        List<Pair>slist=new ArrayList<>();

        ListNode n=head;
        int idx=0;
        int ind=-1;

        while(n!=null){
            if(n.val<x){
                slist.add(new Pair(n.val,idx));
            }
            else if(n.val==x){
                ind=idx;
            }

            n=n.next;
            idx++;
        }

        List<Pair>glist=new ArrayList<>();
        n=head;
        idx=0;

        while(n!=null){
            if(n.val>=x){
                glist.add(new Pair(n.val,idx));
            }
            n=n.next;
            idx++;
        }

        ListNode dummy=new ListNode(-1);

        ListNode temp=dummy;

        for(int i=0;i<slist.size();i++){
            ListNode node=new ListNode(slist.get(i).val);
            temp.next=node;
            temp=temp.next;
        }

        for(int i=0;i<glist.size();i++){

            ListNode node=new ListNode(glist.get(i).val);
            temp.next=node;
            temp=temp.next;
        }

        return dummy.next;
    }
}