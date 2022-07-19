class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        
        List<List<Integer>>res=new ArrayList<>();
        int n=a.length;
        
        Arrays.sort(a);
        
        for(int i=0;i<n-2;i++){
            
            if(i>0 && a[i]==a[i-1])
                continue;
            
            int ele=a[i];
            int target=0-ele;
            
            List<List<Integer>>list=twoSum(a,i+1,n-1,target);
            
            for(List<Integer>item:list){
                item.add(0,ele);
                res.add(item);
            }
        }
        return res;
    }
    
    private List<List<Integer>> twoSum(int a[], int start, int end, int target){
        
        List<List<Integer>>list=new ArrayList<>();
        
        while(start<end){
            
            if(a[start]+a[end]<target){
                start++;
            }
            
            else if(a[start]+a[end]>target){
                end--;
            }
            
            else{
                
                List<Integer>res=new ArrayList<>();
                res.add(a[start]);
                res.add(a[end]);
                
                list.add(res);
                
                start++;
                end--;
                
                while(start<a.length && a[start]==a[start-1]){
                    start++;
                }
                
                while(end>=0 && a[end]==a[end+1]){
                    end--;
                }
            }
        }
        
        return list;
    }
}