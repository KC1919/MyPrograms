class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if (nums.length <= 1 || k == 0) {
            return false;
        }

        HashSet<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
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