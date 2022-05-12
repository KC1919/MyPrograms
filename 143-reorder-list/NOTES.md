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