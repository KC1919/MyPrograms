class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if (nums.length <= 1 || k == 0) {
            return false;
        }

        HashSet<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            
            //if window size becomes greater than k we slide the window
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            
            //it return true if the the element being added 
            // is not present in the hashset, so if it returns false, means the
            // the element was already present, hence we return true
            if (!window.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}

// ---------------------------------------------------------------

// HASHMAP SOLUTION

// class Solution {
//     public boolean containsNearbyDuplicate(int[] a, int k) {
        
//         HashMap<Integer,Integer>hm=new HashMap<>();
        
//         for(int i=0;i<a.length;i++){
//             if(!hm.containsKey(a[i])){
//                 hm.put(a[i],i);
//             }
            
//             else{
//                 if(i-hm.get(a[i])<=k){
//                     return true;
//                 }
//                 else{
//                     hm.put(a[i],i);
//                 }
//             }
//         }
//         return false;
//     }
// }