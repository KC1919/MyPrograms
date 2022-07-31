<h2><a href="https://leetcode.com/problems/range-sum-query-mutable/">307. Range Sum Query - Mutable</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code>, handle multiple queries of the following types:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;"><strong style="user-select: auto;">Update</strong> the value of an element in <code style="user-select: auto;">nums</code>.</li>
	<li style="user-select: auto;">Calculate the <strong style="user-select: auto;">sum</strong> of the elements of <code style="user-select: auto;">nums</code> between indices <code style="user-select: auto;">left</code> and <code style="user-select: auto;">right</code> <strong style="user-select: auto;">inclusive</strong> where <code style="user-select: auto;">left &lt;= right</code>.</li>
</ol>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">NumArray</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">NumArray(int[] nums)</code> Initializes the object with the integer array <code style="user-select: auto;">nums</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void update(int index, int val)</code> <strong style="user-select: auto;">Updates</strong> the value of <code style="user-select: auto;">nums[index]</code> to be <code style="user-select: auto;">val</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int sumRange(int left, int right)</code> Returns the <strong style="user-select: auto;">sum</strong> of the elements of <code style="user-select: auto;">nums</code> between indices <code style="user-select: auto;">left</code> and <code style="user-select: auto;">right</code> <strong style="user-select: auto;">inclusive</strong> (i.e. <code style="user-select: auto;">nums[left] + nums[left + 1] + ... + nums[right]</code>).</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["NumArray", "sumRange", "update", "sumRange"]
[[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
<strong style="user-select: auto;">Output</strong>
[null, 9, null, 8]

<strong style="user-select: auto;">Explanation</strong>
NumArray numArray = new NumArray([1, 3, 5]);
numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
numArray.update(1, 2);   // nums = [1, 2, 5]
numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-100 &lt;= nums[i] &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= index &lt; nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-100 &lt;= val &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= left &lt;= right &lt; nums.length</code></li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">3 * 10<sup style="user-select: auto;">4</sup></code> calls will be made to <code style="user-select: auto;">update</code> and <code style="user-select: auto;">sumRange</code>.</li>
</ul>
</div>