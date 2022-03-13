used hashmap to store all the elements with their frequency.
​
then one by one made choices for each place.
that is, for a particular slot, all the elements can come, if its available, means if it has not been used.
​
So we pick the unused element and reduce its frequency by 1.
and make call to the next slot.
after returnng from the call, we put back the original frequncy of the chosen element
and empty the slot.(backtrack)
​
So like this all possible choices for every slot is made, and when all the slots are occupied(base case). then we store the configuration in out resultant list, and return.