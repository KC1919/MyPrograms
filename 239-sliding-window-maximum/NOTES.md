```
for(int i=0;i<n;i++)
{
//if the index at the peek of que is out of the window, then we remove it
if(!que.isEmpty() && que.peek()==i-k)
que.poll();
//till the elements at indices contained in the que are smaller than the
//current element, we keep on removing element from the last
//because we have to maintain monotonic increasing queue
//so if any elementcomes it removes all the smaller element from the que in the
//curent window being considered
while(!que.isEmpty() && a[que.peekLast()]<a[i])
que.pollLast();
//adding the current index in the que
que.offer(i);
if(i>=k-1){
ans[c++]=a[que.peek()]; //the peek index will always have the greatest
// element in the current window
}
```