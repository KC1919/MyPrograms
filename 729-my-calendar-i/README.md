<h2><a href="https://leetcode.com/problems/my-calendar-i/">729. My Calendar I</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a <strong style="user-select: auto;">double booking</strong>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">double booking</strong> happens when two events have some non-empty intersection (i.e., some moment is common to both events.).</p>

<p style="user-select: auto;">The event can be represented as a pair of integers <code style="user-select: auto;">start</code> and <code style="user-select: auto;">end</code> that represents a booking on the half-open interval <code style="user-select: auto;">[start, end)</code>, the range of real numbers <code style="user-select: auto;">x</code> such that <code style="user-select: auto;">start &lt;= x &lt; end</code>.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">MyCalendar</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">MyCalendar()</code> Initializes the calendar object.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">boolean book(int start, int end)</code> Returns <code style="user-select: auto;">true</code> if the event can be added to the calendar successfully without causing a <strong style="user-select: auto;">double booking</strong>. Otherwise, return <code style="user-select: auto;">false</code> and do not add the event to the calendar.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["MyCalendar", "book", "book", "book"]
[[], [10, 20], [15, 25], [20, 30]]
<strong style="user-select: auto;">Output</strong>
[null, true, false, true]

<strong style="user-select: auto;">Explanation</strong>
MyCalendar myCalendar = new MyCalendar();
myCalendar.book(10, 20); // return True
myCalendar.book(15, 25); // return False, It can not be booked because time 15 is already booked by another event.
myCalendar.book(20, 30); // return True, The event can be booked, as the first event takes every time less than 20, but not including 20.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= start &lt; end &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">1000</code> calls will be made to <code style="user-select: auto;">book</code>.</li>
</ul>
</div>