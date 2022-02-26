Used simple multipoint BFS traversal startingfrom all the 1's.
We just calculated how many cycles it takes to cover all the 0's.
So the farthest zero would be added last in the Queue.
So when that is removed, it see's there are no more 0's left.
But still that cycle is also counted.
So we return "max-1", where max corresponds to cylces or distance whatever we can say.