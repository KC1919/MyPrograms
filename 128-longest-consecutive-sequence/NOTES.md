the intuition behind this approach is that,
​
first we put tll the elements in the hashmap.
​
then we again iterate over the hashmap and check if, an element has its prevous consecutive element.
​
if it has previous consecutive element, that means, the current element cannot be the beginning of a sequence.
​
So when we encounter an element who does not have a previous consecutive element present in the hashset. It means it can be the beginning of a sequence, so we start
looking for its consecutive elements present in the set.
​
As long as we keep on getting the consecutive sequence we keep incrementing the count.
​
And when the sequence finishes we update out max, witht the length of the sequence.
​
In the end return max length of the sequence obtained.