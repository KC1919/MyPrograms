The logic behind this problem is,
​
We can use BFS level-order traversal.
​
At each level, we have all the nodes of that level in our queue.
​
So we take out a node from the queue.
Then check if there is any element left of same level in the queue.
If there is element in the queue, that means the current removed element
next pointer can be attached to the element in the que, because that element
will be the right element to the current removed element, because it is
level order traversal, and the nodes come at each level from left to right
​
So we link the removed node to the node at the peek of the queue.
Else if the re is no element left of that level after removing from the queue
means the current removed element is the last element of the level, hence
it will have no next element to it and its next pointer will point to null.