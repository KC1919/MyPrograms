//then reverse the group, from the start node to the end node
//of the current group
ListNode rhead=reverse(start,end);
//if it is the first group, so we assign the firstHead(fhead) to the
//original head of the list, from where the linking of the next
//group will start
if(fhead==null){
fhead=start;
frhead=rhead;  //assign the first reverseHead that will be the head
//node of the final list that has to be returned
}
//if it is not the first reversed group
else{
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