the logic behind this approach is that,
​
we need to evaluate the expression from left to right.
​
There is no precedence or paranthesis.
​
So if any number comes we push it to the stack of integers after converting it to a integer.
​
If an operator comes, then we pop two numbers from the stack and
evaluate them, then push the result back into the stack.
​
We repaet this till the whole expression is evaluated, and when its is complete
we have the final result of the expression at the peek of the stack.
​
So we return it.