# Get minimum element from stack
##  Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You are given <strong style="user-select: auto;">N</strong>&nbsp;elements&nbsp;and your task is to Implement a Stack in which you can get minimum element in O(1) time.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>push(2)
push(3)
pop()
getMin()
push(1)
getMin()<strong style="user-select: auto;">
Output: </strong>3 2 1<strong style="user-select: auto;">
Explanation: </strong>In the first test case for
query&nbsp;
push(2)&nbsp; the stack&nbsp;will be {2}
push(3)&nbsp; the stack&nbsp;will be {2 3}
pop()    poped element will be 3&nbsp;the
&nbsp;        stack will be {2}
getMin() min element will be 2&nbsp;
push(1)  the stack&nbsp;will be {2 1}
getMin() min element will be 1</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You are required to complete the three&nbsp;methods&nbsp;<strong style="user-select: auto;">push()</strong>&nbsp;which take one argument an integer <strong style="user-select: auto;">'x'</strong>&nbsp;to be pushed into the stack,&nbsp;<strong style="user-select: auto;">pop()</strong>&nbsp;which returns a integer&nbsp;poped out from the stack and <strong style="user-select: auto;">getMin()</strong> which returns the min element from the stack. (-1 will be returned if for&nbsp;<strong style="user-select: auto;">pop() and getMin()&nbsp;</strong>the stack is empty.)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity</strong> : O(1) for all the 3 methods.<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auixilliary Space</strong> : O(1) for all the 3 methods.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= Number of queries&nbsp;&lt;= 100<br style="user-select: auto;">
1 &lt;= values of the stack&nbsp;&lt;= 100</span></p>
 <p style="user-select: auto;"></p>
            </div>