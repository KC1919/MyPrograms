<h2><a href="https://leetcode.com/problems/flatten-nested-list-iterator/">341. Flatten Nested List Iterator</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a nested list of integers <code style="user-select: auto;">nestedList</code>. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">NestedIterator</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">NestedIterator(List&lt;NestedInteger&gt; nestedList)</code> Initializes the iterator with the nested list <code style="user-select: auto;">nestedList</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int next()</code> Returns the next integer in the nested list.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">boolean hasNext()</code> Returns <code style="user-select: auto;">true</code> if there are still some integers in the nested list and <code style="user-select: auto;">false</code> otherwise.</li>
</ul>

<p style="user-select: auto;">Your code will be tested with the following pseudocode:</p>

<pre style="user-select: auto;">initialize iterator with nestedList
res = []
while iterator.hasNext()
    append iterator.next() to the end of res
return res
</pre>

<p style="user-select: auto;">If <code style="user-select: auto;">res</code> matches the expected flattened list, then your code will be judged as correct.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nestedList = [[1,1],2,[1,1]]
<strong style="user-select: auto;">Output:</strong> [1,1,2,1,1]
<strong style="user-select: auto;">Explanation:</strong> By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nestedList = [1,[4,[6]]]
<strong style="user-select: auto;">Output:</strong> [1,4,6]
<strong style="user-select: auto;">Explanation:</strong> By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nestedList.length &lt;= 500</code></li>
	<li style="user-select: auto;">The values of the integers in the nested list is in the range <code style="user-select: auto;">[-10<sup style="user-select: auto;">6</sup>, 10<sup style="user-select: auto;">6</sup>]</code>.</li>
</ul>
</div>