First we iterated through the original list, and mapped all the nodes with their indexes in the hashmap.
​
Then again we iterated through the original list, and this time, we have to create the new list with deep copy.
​
We create another hashmap to map the address of new nodes with their corresponding indexes.
​
So we get the index of the current node, we check if it is present in the hashmap of new nodes, if its present we use that node, else we create a new node.
​
Then we get the random pointer index of the current node from the previous hashmap.
​
We check if the index of random pointer is -1 then it is null.
​
If it is not -1, then we see if the index is prpesent in the hashmap of new nodes, if present then we assign that node to the random pointer of the newly created node.
​
If the randompointer is not present in the hashmap of new nodes, then we create a new node corresponding to the random pointer , and assign that node to the current nodes random pointer and we add the newly created random pinter to the hashmap of new nodes with its corrsponding index.
​
And in the end we add the current new node to the hasmap of new nodes with its corrsponding index.
​
Finally, we move to the next node.