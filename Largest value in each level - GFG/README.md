# Largest value in each level
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a binary tree, find the largest value in each level.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input :</span></strong>
<span style="font-size: 18px; user-select: auto;">        1
       / \
      2   3 </span>

<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output :</strong> 1 3</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Explanation : </span></strong>
<span style="font-size: 18px; user-select: auto;">There are two levels in the tree :
</span><span style="font-size: 18px; user-select: auto;">1. {1}, max = 1</span>
<span style="font-size: 18px; user-select: auto;">2. {2, 3}, max = 3</span></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input :</span></strong>
<span style="font-size: 18px; user-select: auto;">        4
       / \
      9   2
     / \   \
    3   5   7 </span>

<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output :</strong> 4 9 7</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Explanation : </span></strong>
<span style="font-size: 18px; user-select: auto;">There are three levels in the tree:</span>
<span style="font-size: 18px; user-select: auto;">1. {4}, max = 4</span>
<span style="font-size: 18px; user-select: auto;">2. {9, 2}, max = 9</span>
<span style="font-size: 18px; user-select: auto;">3. {3, 5, 7}, max=7</span></pre>

<div style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your task :</span></strong></div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">largestValues()</strong> which takes the root node of the tree as input and returns a vector containing the largest value in each level.&nbsp;</span></div>

<div style="user-select: auto;">&nbsp;</div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity :</strong> O(n) , where n = number of nodes</span></div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space :</strong> O(n) , where n = number of nodes</span></div>

<div style="user-select: auto;">&nbsp;</div>

<div style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Constraints :&nbsp;</span></strong></div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 ≤&nbsp;Number of nodes ≤&nbsp;10^5</span></div>
 <p style="user-select: auto;"></p>
            </div>