The intuition behind this apprach is that.
​
We took a Min Heap DS.
We keep on adding the elements in the stream till we have k elements in the heap.
Once we have k elements, after that we only add any element if its greater than the peek element of heap(this improves time complexity) and we remove the peek element first then add the current element.
​
*Since any smaller element than the peek element of the PQ will not affect the kth largest
so we dont add any smaller element than the peek once we have k elements in the PQ.Because ultimately we have to eliminate smaller elements and keep the K greater elements among the total elements encountered so far.*
​
**That is why we taken Min Heap PQ, so that it can remove the smallest element among the k elements and we are left with K gretest elements, so the Kth largest would be the smallest among the K largest elements. Which would be at the peek of the PQ.**
​
And when add is called we add the elemet in the PQ, we check if the size becomes gretaer than K, then again we remoe an element, and the minimum element from the PQ will be removed since its a Min Heap and we would be having the Kth largest element at the peek
​
​
​
of the PQ. so we return that.