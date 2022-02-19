# Find the number of islands
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a grid of size n*m (n is number of rows and m is number of columns grid has) consisting of '0's(Water)&nbsp;and '1's(Land). Find the number of islands.</span><br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Note: </span></strong><span style="font-size: 18px; user-select: auto;">An&nbsp;island&nbsp;is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>grid = {{0,1},{1,0},{1,1},{1,0}}
<strong style="user-select: auto;">Output:
</strong>1
<strong style="user-select: auto;">Explanation:
</strong>The grid is-
0 <span style="color: rgb(0, 0, 128); user-select: auto;">1</span></span>
<span style="font-size: 18px; user-select: auto;"><span style="color: rgb(0, 0, 128); user-select: auto;">1</span> 0
<span style="color: rgb(0, 0, 128); user-select: auto;">1</span> <span style="color: rgb(0, 0, 128); user-select: auto;">1
1</span> 0
All lands are connected.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}}
<strong style="user-select: auto;">Output:
</strong>2
<strong style="user-select: auto;">Expanation:
</strong>The grid is-
0 <span style="color: rgb(0, 0, 128); user-select: auto;">1 1 1</span> 0 0 0
0 0 <span style="color: rgb(0, 0, 128); user-select: auto;">1 1</span> 0 <span style="color: rgb(255, 0, 0); user-select: auto;">1</span> 0&nbsp;
There are two islands one is colored in blue 
and other in orange.</span>
</pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read or print anything. Your task is to complete the function <strong style="user-select: auto;">numIslands()&nbsp;</strong>which takes grid as input parameter and returns the total number of islands.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Compelxity:&nbsp;</strong>O(n*m)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Space Compelxity:&nbsp;</strong>O(n*m)</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ n, m ≤ 500</span></p>
 <p style="user-select: auto;"></p>
            </div>