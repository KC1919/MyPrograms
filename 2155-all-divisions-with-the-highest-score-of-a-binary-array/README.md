<h2><a href="https://leetcode.com/problems/all-divisions-with-the-highest-score-of-a-binary-array/">2155. All Divisions With the Highest Score of a Binary Array</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> binary array <code style="user-select: auto;">nums</code> of length <code style="user-select: auto;">n</code>. <code style="user-select: auto;">nums</code> can be divided at index <code style="user-select: auto;">i</code> (where <code style="user-select: auto;">0 &lt;= i &lt;= n)</code> into two arrays (possibly empty) <code style="user-select: auto;">nums<sub style="user-select: auto;">left</sub></code> and <code style="user-select: auto;">nums<sub style="user-select: auto;">right</sub></code>:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">nums<sub style="user-select: auto;">left</sub></code> has all the elements of <code style="user-select: auto;">nums</code> between index <code style="user-select: auto;">0</code> and <code style="user-select: auto;">i - 1</code> <strong style="user-select: auto;">(inclusive)</strong>, while <code style="user-select: auto;">nums<sub style="user-select: auto;">right</sub></code> has all the elements of nums between index <code style="user-select: auto;">i</code> and <code style="user-select: auto;">n - 1</code> <strong style="user-select: auto;">(inclusive)</strong>.</li>
	<li style="user-select: auto;">If <code style="user-select: auto;">i == 0</code>, <code style="user-select: auto;">nums<sub style="user-select: auto;">left</sub></code> is <strong style="user-select: auto;">empty</strong>, while <code style="user-select: auto;">nums<sub style="user-select: auto;">right</sub></code> has all the elements of <code style="user-select: auto;">nums</code>.</li>
	<li style="user-select: auto;">If <code style="user-select: auto;">i == n</code>, <code style="user-select: auto;">nums<sub style="user-select: auto;">left</sub></code> has all the elements of nums, while <code style="user-select: auto;">nums<sub style="user-select: auto;">right</sub></code> is <strong style="user-select: auto;">empty</strong>.</li>
</ul>

<p style="user-select: auto;">The <strong style="user-select: auto;">division score</strong> of an index <code style="user-select: auto;">i</code> is the <strong style="user-select: auto;">sum</strong> of the number of <code style="user-select: auto;">0</code>'s in <code style="user-select: auto;">nums<sub style="user-select: auto;">left</sub></code> and the number of <code style="user-select: auto;">1</code>'s in <code style="user-select: auto;">nums<sub style="user-select: auto;">right</sub></code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;"><strong style="user-select: auto;">all distinct indices</strong> that have the <strong style="user-select: auto;">highest</strong> possible <strong style="user-select: auto;">division score</strong></em>. You may return the answer in <strong style="user-select: auto;">any order</strong>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [0,0,1,0]
<strong style="user-select: auto;">Output:</strong> [2,4]
<strong style="user-select: auto;">Explanation:</strong> Division at index
- 0: nums<sub style="user-select: auto;">left</sub> is []. nums<sub style="user-select: auto;">right</sub> is [0,0,<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>,0]. The score is 0 + 1 = 1.
- 1: nums<sub style="user-select: auto;">left</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>]. nums<sub style="user-select: auto;">right</sub> is [0,<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>,0]. The score is 1 + 1 = 2.
- 2: nums<sub style="user-select: auto;">left</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>]. nums<sub style="user-select: auto;">right</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>,0]. The score is 2 + 1 = 3.
- 3: nums<sub style="user-select: auto;">left</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>,1]. nums<sub style="user-select: auto;">right</sub> is [0]. The score is 2 + 0 = 2.
- 4: nums<sub style="user-select: auto;">left</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>,1,<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>]. nums<sub style="user-select: auto;">right</sub> is []. The score is 3 + 0 = 3.
Indices 2 and 4 both have the highest possible division score 3.
Note the answer [4,2] would also be accepted.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [0,0,0]
<strong style="user-select: auto;">Output:</strong> [3]
<strong style="user-select: auto;">Explanation:</strong> Division at index
- 0: nums<sub style="user-select: auto;">left</sub> is []. nums<sub style="user-select: auto;">right</sub> is [0,0,0]. The score is 0 + 0 = 0.
- 1: nums<sub style="user-select: auto;">left</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>]. nums<sub style="user-select: auto;">right</sub> is [0,0]. The score is 1 + 0 = 1.
- 2: nums<sub style="user-select: auto;">left</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>]. nums<sub style="user-select: auto;">right</sub> is [0]. The score is 2 + 0 = 2.
- 3: nums<sub style="user-select: auto;">left</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">0</strong></u>]. nums<sub style="user-select: auto;">right</sub> is []. The score is 3 + 0 = 3.
Only index 3 has the highest possible division score 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,1]
<strong style="user-select: auto;">Output:</strong> [0]
<strong style="user-select: auto;">Explanation:</strong> Division at index
- 0: nums<sub style="user-select: auto;">left</sub> is []. nums<sub style="user-select: auto;">right</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>]. The score is 0 + 2 = 2.
- 1: nums<sub style="user-select: auto;">left</sub> is [1]. nums<sub style="user-select: auto;">right</sub> is [<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>]. The score is 0 + 1 = 1.
- 2: nums<sub style="user-select: auto;">left</sub> is [1,1]. nums<sub style="user-select: auto;">right</sub> is []. The score is 0 + 0 = 0.
Only index 0 has the highest possible division score 2.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums[i]</code> is either <code style="user-select: auto;">0</code> or <code style="user-select: auto;">1</code>.</li>
</ul>
</div>