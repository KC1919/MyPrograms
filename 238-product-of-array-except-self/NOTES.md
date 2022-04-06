the intuition behind this approach is that we,
​
calculate the prefix product till the ith element and we also
calculate the postfix product till the ith element.
​
and we iterate from the start and we multtiply the prefix[i] and postfix[i] and
store the result at ith position in the result array.
​
Now we can optimize the space complexity here, as we take 2 extra arrays
one to store the prefix product and another to store the postfix product.