we make a stringbuilder, if there is a alphabet we append it simply
​
if there is an opening parenthesis we append it and store its index in the stack
​
if there is an closing parenthesis and the stack is empty means this is an unbalanced closing paranthesis, so we dont append it , but we increment the count by 1. The count denotes the count of unbalanced closing paranthesis.
​
if there is a closing paranthesis and the stack is not empty we pop an element fromt he stack which corresponds to opening parenthesis, and we append the closing paranthesis
to the stringbuilder.
​
when the whole string is iterated over.
​
we check if the stack is empty means all the parenthesis were balanced out.
​
But if the stack is not empty, we start from the back end of the stringbuilder, and one by one pop an index from the stack, and remove the character at that index, because those are the index of unbalanced opening parenthesis. so we remove all of the, till the stack gets empty.