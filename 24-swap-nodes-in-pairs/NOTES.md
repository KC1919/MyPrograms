* One by one reverse 2 nodes at a time, and keep storing the address of the last node of the reversed pair.
​
Once all the pairs are reversed, we have in our list, the address of the last node of all the pairs.
​
* So now using these addresses we start connecting the nodes, such that they are linked as reversed pairs.
​
# So we connect the 1st node of the current pair with the 1st node of next pair, and wee keep on connecting this till we connect all the nodes.