ListNode slow=head, fast=head;
//we used the concept of slow fast pointer, in a way like, what we did is
//we made the fast pointer move n steps, then we move both the pointer
//together so when the fast pointer will reach the last node
//the slow pointer will reach the node jsut before the nth node,
//because the gap that we cretaed between the slow and afst pointer
//will remain same as we move them together
while(n>0)
{
fast=fast.next;
n--;
}
//if the fast pointer reaches null, that means the 1st node is to be deleted
//in other word, nth node from the end of the list is to be deleted
//that is why the fast pointer reached null
//so we simply return the next of head, that will ensure the 1st node is removed
if(fast==null)
return head.next;
//else we move the slow and fast pointer simultaneously, so when the fast
//pointer will reach the last node, our slow pointer would be at the node just
//before the nth node from the end
while(fast.next!=null)