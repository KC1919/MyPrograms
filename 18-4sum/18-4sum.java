class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) 
    {
        Arrays.sort(a);
        List<List<Integer>>res=new ArrayList<>();
        
        for(int i=0;i<a.length;i++)
        {
            if(i!=0 && a[i-1]==a[i])
                continue;
            
            List<List<Integer>>smallSum=threeSum(a,i+1,a.length-1,target-a[i]);
            
            for(List<Integer>list:smallSum)
            {
                list.add(a[i]);
                res.add(list);
            }
        }
        
        return res;
        
    }
    
    public List<List<Integer>> twoSum(int a[], int si, int ei, int target)
    {
        List<List<Integer>>res=new ArrayList<>();
        
        while(si<ei)
        {
            int sum=a[si]+a[ei];
            
            if(sum>target)ei--;
            else if(sum<target)si++;
            
            else
            {
                res.add(new ArrayList(Arrays.asList(a[si],a[ei])));    
                si++;
                ei--;
                
                while(si<ei && a[si]==a[si-1])si++;
                while(si<ei && a[ei]==a[ei+1])ei--;
            }
        }
        
        return res;
    }
    
    public List<List<Integer>> threeSum(int a[], int si, int ei, int target)
    {
        List<List<Integer>>res=new ArrayList<>();
        
        for(int i=si;i<=ei;i++)
        {
            if(i!=si && a[i-1]==a[i])
                continue;
            
            List<List<Integer>>smallSum=twoSum(a,i+1,ei,target-a[i]);
            
            for(List<Integer>list:smallSum)
            {
                list.add(a[i]);
                res.add(list);
            }
        }
        
        return res;
    }
}