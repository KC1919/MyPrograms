the intuition behind this approach is that
​
We take a min heap priority queue, that return node whose value is smallest
​
So we add the 1st node of all the lists in the priority queue.
​
And we now one by one, take out the peek node from the priority queue
the peek node will be the smallest among all the nodes present in the queue
​
So we add this removed node into our new list, and move to the next node
of the list from which this node came.
​
if the next node is not null, we add the next node to the priority queue.
​
If the next node is null we do not add, means the current list has finished,
​
And when the priority queue is empty means no nodes are left in the queue
​
means all the nodes have been processed and we have merged all the lists and
formed the sorted list.
​
So we return the head of the new list formed.