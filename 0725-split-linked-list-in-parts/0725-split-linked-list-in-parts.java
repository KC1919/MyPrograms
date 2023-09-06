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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        int total=0;
        ListNode n=head;

        while(n!=null){
            n=n.next;
            total++;
        }

        ListNode ans[]=new ListNode[k];

        int partCount=total/k; // 2
        int rem=total%k;   // 6

        int incPartsCount=0;

        while(rem>0){
            incPartsCount++;
            rem--;
        }

        boolean flag=false;

        if(incPartsCount>0){
            flag=true;
            partCount+=1;
        }

        n=head;

        // ListNode dummy=new ListNode(-1);
        ListNode temp=head;
        // temp.next=head;

        int idx=0;

        while(n!=null){

            if(incPartsCount==0 && flag==true){
                incPartsCount=-1;
                partCount-=1;
            }

            int count=partCount;

            while(count-->1 && n!=null){
                n=n.next;
            }

            if(n!=null){
                ListNode t=n;
                n=n.next;
                t.next=null;
            }

            ans[idx++]=temp;
            temp=n;
            incPartsCount--;
        }

        return ans;
    }
}