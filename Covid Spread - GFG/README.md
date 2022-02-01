# Covid Spread
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Aterp is the head nurse at a city hospital. City hospital contains R*C&nbsp;number of wards and the structure of a hospital is in the form of a 2-D matrix.<br style="user-select: auto;">
Given a matrix of dimension <strong style="user-select: auto;">R</strong>*<strong style="user-select: auto;">C</strong> where each cell in the matrix can have values 0, 1, or 2 which has the following meaning:</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">0</strong>: Empty ward</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">1</strong>: Cells have uninfected patients</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">2</strong>: Cells have infected patients</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">An infected patient at ward [i,j] can infect other uninfected patient at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (<strong style="user-select: auto;">up</strong>, <strong style="user-select: auto;">down</strong>, <strong style="user-select: auto;">left</strong> and <strong style="user-select: auto;">right</strong>) in unit time. Help Aterp&nbsp;determine the minimum units of time after which there won't remain any uninfected patient i.e all patients would be infected.&nbsp;If all patients are not infected after infinite units of time then simply return -1.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
3 5
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1 </span><span style="font-size: 18px; user-select: auto;">
<strong style="user-select: auto;">Output:</strong>
2</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:
</strong>Patients at positions {0,0}, {0, 3}, {1, 3}
and {2, 3} will infect patient at {0, 1}, 
{1, 0},{0, 4}, {1, 2}, {1, 4}, {2, 4} during 1st 
unit time. And, during 2nd unit time, patient at 
{1, 0} will get infected and will infect patient 
at {2, 0}. Hence, total 2 unit of time is
required to infect all patients.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong></span>
<span style="font-size: 18px; user-select: auto;">3 5
2 1 0 2 1
0 0 1 2 1
1 0 0 2 1
<strong style="user-select: auto;">Output:</strong>
-1</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong></span>
<span style="font-size: 18px; user-select: auto;">All patients will not be infected.</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong>&nbsp;&nbsp;</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">helpaterp</strong>()&nbsp;which takes a 2-D Matrix <strong style="user-select: auto;">hospital&nbsp;</strong>as input parameter&nbsp;and returns the minimum units of time in which all patients will be infected or -1 if it is impossible.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(R*C)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(R*C)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 </span> <span style="font-size: 18px; user-select: auto;">≤</span> <span style="font-size: 18px; user-select: auto;"> R,C&nbsp;≤ 1000<br style="user-select: auto;">
0 ≤ mat[i][j]&nbsp;≤ 2</span></p>
 <p style="user-select: auto;"></p>
            </div>