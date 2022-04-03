we start from the first node, and keep breaking the chain and adding the next of current node to the next of the current node's next.
​
before changing the link we store the next of the current node in a variable. so that we can go the next node after changing the link.
​
After all hte links have been modified, we just have to put condition according to the length of the list.
if its even, then our count variable would store an odd value as it starts from 0.
​
**in this case our current pointer stops at the last node of the even indexed nodes.**
*so we append the start of odd indexed node to the next of the current pointer.*
​
**if the length is odd, means the count variable holds an odd value,**
and in **this case out current pointer is at null**, so to handle this case we have taken a prev pointer, *which in this case would be pointing at the last node of the even indexed nodes*.
So we *append the start of odd indexed node to the next of previous pointer*.
​
​
​