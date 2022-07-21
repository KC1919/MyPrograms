public void reorderList(ListNode head) {
if(head==null || head.next==null)
return;
ListNode slow=head, fast=head, prev=null;
//first we find the mid point of the list
while(fast!=null && fast.next!=null){
prev=slow;
slow=slow.next;
fast=fast.next.next;
}
//then we reverse the right half of the list
ListNode currRight=reverse(slow); //returns the head of the reversed list
prev.next=null; //making the next of the last node of the left half equal to null
//so that there occurs no cycle
//now we start from the head of left half of the list
//and head of the reversed right half of the list
//means the last node of the list
ListNode currLeft=head, nextLeft=null, nextRight=null;
int turn=0;
//now we iterate through both the halves of the list, till any one half of the
//list ends
while(currLeft!=null && currRight!=null){
//if the turn is even, we make link from the currentLeft node in the left half
// of the list to the currRight in the right half of the list
if(turn%2==0){
nextLeft=currLeft.next; //storing the next node, before changing the links
currLeft.next=currRight; //move to the next node in the left half
currLeft=nextLeft;
turn++; //this indicates which side turn it is to change the link
}
//and if the trn is odd, we make link from the currentRight node in the right
//half of the list to the currLeft in the left half of the list
else{
nextRight=currRight.next;//storing the next node, before changing the links
currRight.next=currLeft; //move to the next node in the right half
currRight=nextRight;
turn++;
}
}