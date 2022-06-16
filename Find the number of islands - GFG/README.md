# Find the number of islands
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid) consisting of '0's (Water)&nbsp;and '1's(Land). Find the number of islands.</span><br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Note: </span></strong><span style="font-size: 18px; user-select: auto;">An&nbsp;island&nbsp;is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.</span></p>

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
<lclighter data-id="lgt258117284" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">0 </lclighter><span style="color: rgb(0, 0, 128); user-select: auto;"><lclighter data-id="lgt258117284" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">1 1 1</lclighter></span><lclighter data-id="lgt258117284" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;"> 0 0 0<br style="user-select: auto;">0 0 </lclighter><span style="color: rgb(0, 0, 128); user-select: auto;"><lclighter data-id="lgt258117284" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">1 1</lclighter></span><lclighter data-id="lgt258117284" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;"> 0 </lclighter><span style="color: rgb(255, 0, 0); user-select: auto;"><lclighter data-id="lgt258117284" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">1</lclighter></span><lclighter data-id="lgt258117284" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;"> 0</lclighter><div class="LinerThreadIcon LinerFirst " data-highlight-id="258117284" data-bundle-id="0" id="lgt258117284" style="background-image: url(&quot;https://profile.getliner.com/liner-service-bucket/user_photo_default/color-10/D.svg&quot;); user-select: auto;">
        <div class="LinerThreadIcon__dim" style="user-select: auto;"></div>
        <div class="LinerThreadIcon__mentioned" style="user-select: auto;">
          <div class="LinerThreadIcon__mentionedImg" style="user-select: auto;"></div>
        </div>
        <div class="LinerThreadIcon__onlyMe" style="user-select: auto;">
          <div class="LinerThreadIcon__onlyMeImg" style="user-select: auto;"></div>
        </div>
      </div>&nbsp;
There are two islands :- one is colored in blue 
and other in orange.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read or print anything. Your task is to complete the function <strong style="user-select: auto;">numIslands()&nbsp;</strong>which takes the grid as an input parameter and returns the total number of islands.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(n*m)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Space Complexity:&nbsp;</strong>O(n*m)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ n, m ≤ 500</span></p>
 <p style="user-select: auto;"></p>
            </div>