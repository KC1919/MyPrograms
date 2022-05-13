class Solution {
    public int findDuplicate(int[] a) {
        
        while(true){
            
            //we treat 0th index as a spare storage point
            //since we have n+1 slots and integers in the range 1 to n
            //so the nth integer can be placed at nth index,
            //like 3 can be placed at 3rd index
            //so as there is one or more duplicates, so we take the element at 0th index
            //suppose the elemnt at 0th index is 3, so now we check what element is
            //present at the 3rd index, if there is an element other than 3
            //we swap the elements, means we place the element at 0th index to its correct
            //correct position and the element that was lying on the place of some other 
            //element we move it to 0th index, this is how we one by one
            //for every element, we move them to their correct position,
            //and if at any point we see that the element at 0th index
            //that we ahve to place to its correct position, we check if at its position
            //there is already the correct element present, that means there are duplicate
            //elements and we return that elemen
            int ele=a[0];
            
            //checking if the element at 0th index is same as the element at the ele'th
            //index, if yes means duplicate, so we return it
            if(a[ele]==ele)
                return ele;
            
            //else we normally put the element at 0th index to its correct position
            a[0]=a[ele];
            a[ele]=ele;
        }
    }
}