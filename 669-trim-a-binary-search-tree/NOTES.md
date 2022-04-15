The intuition behind this approach is that,
​
We check the value of the current node.
​
If the value is either lower than the low range, that means all the values on left of the node would be lower. So we move to right child of the current node and whatever result it gives us we return that.
As the current node is not in range so we dont retun the current node, instead return the result that we get from the right child where possible in range nodes can exists.
​
Another case is that if the current node is greater then the high range, so all the nodes on right of the curent node would also be greater.
So we move to the left of the current node, and delete jnodes that are not in range.
​
If the current nodes values is in range, we make a call to left child.
and also to the right child,
whatever result we get from the left we attach it to the left and whatever we get from the right we attach it to the rightAnd return the current node.