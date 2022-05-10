the logic behind this approach is that,
​
if there is an opening bracket we add it to the stack.
​
and if there is a closing bracket we check the previously pushed bracket onto the peek of the stack.
​
If it is not the corresponding opening bracket to the current closing bracket, that means its not valid sequnce of pranthesis , so we return false.
​
If its valid we pop it from the stack.
​
And if a closing brack comes and there is no opening bracket in the stack,
i.e the stack is empty, so we return false.
​
If the above conditions do not occur during the whole trvaersla of the string,
that means the sequence of paranthesis was valid and we return true.