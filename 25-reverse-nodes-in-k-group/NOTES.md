//then we link the firstHead node of previous group to the
//returned reverseHeadof the current group
fhead.next=rhead;
fhead=start;   //and make the start of the current group as the firsthead
}                  //of the current group that will be used to link to the
//head of the next group
start=next;  //assigning the start to the head node of the next group
end=next;    //and end also to the head of the next group
}
}
//reversing the nodes from start node till end node
public ListNode reverse(ListNode node, ListNode end){
ListNode curr=node, prev=null, next=null;
while(curr!=end){
next=curr.next;
curr.next=prev;
prev=curr;
curr=next;
}
curr.next=prev;
prev=curr;
return prev;
}