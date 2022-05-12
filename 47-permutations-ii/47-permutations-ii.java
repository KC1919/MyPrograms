class Solution {
    public List<List<Integer>> permuteUnique(int[] a) {
        List<List<Integer>>ans=new ArrayList<>();
        //to avoid duplicates we have to sort the array so that we can keep track
        //of the previously used element easily
        Arrays.sort(a);
        permutations(a,new ArrayList<>(),0,ans);
        return ans;
    }
    
    public void permutations(int a[], List<Integer>list, int idx, List<List<Integer>>ans){
        
        //when we fill all the slots our permutation is ready so we add it to our list of 
        //answers
        if(idx==a.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        //for every slot, we loop through all the elements to see who can be placed
        //because every element can come at every slot, then only all the 
        //possible permutations will be formed
        for(int i=0;i<a.length;i++){                                
            
            //this condition is to prevent dupicates calls
            //suppose for slot 1, we have 3 choices [1,1,2]
            //so now 1st we chose 1(i=0) to be placed in the 1st slot
            //then we made call for the 2nd slot
            //Now when we return from the call again to the 1st slot, then
            //we will try to place 1(i=1) at slot 1, but as we have already placed 
            //1(i=0) before , so placing 1(i=1) will create same call again
            //and this would result in duplicate permutations, so we put a condition
            //which checks if the current element is same as the previous element
            //then we dont make a call and continue, because the previous element would
            //have already made the call, so again making the call with same element for
            //the same slot will create duplicacy
            if(i!=0 && a[i-1]==a[i])
                continue;
                
            else{
                //we check if the element has not been used before
                if(a[i]>=-10){
                    //so we place the ith element at idx slot
                    list.add(a[i]);
                    a[i]+=-20;  //and mark it as used
                    permutations(a,list,idx+1,ans); //and make call to the next slot
                    list.remove(list.size()-1);  //after returning from the call, we empty 
                                                 //the slot
                    a[i]+=20; //and mark the ith element as unused
                }
            }
        }
    }
}