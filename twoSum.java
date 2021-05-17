import java.util.*;
class twoSum
{
    static Scanner sc=new Scanner(System.in);
    
    static public int[] twoSum(int[] nums, int target)  //brute-force O(N^2) space=O(1)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    
    static public int[] two_Sum(int[] a, int target)  //optimal approach O(N) space=O(N)  using hashmap
    {
        Map<Integer,Integer> map=new HashMap<>(); //we take a map
        
        for(int i=0;i<a.length;i++) //we start traversing the array containing elements
        {
            if(map.containsKey(target-a[i]))  //we check if there is any element present in the map, that can be paired to, form the target
            {
                int ind=map.get(target-a[i]); //if present in the hashmap, we fetch the index of the pairing element
                return new int[]{i,ind};   //and we return the index of both the pairing element that form the target sum
            }
            
            map.put(a[i],i); //putting the elements in the hashmap
            
        }
        return new int[0]; //if we do not found any pair, we simply return an empty array of 0 size
    }
    
    public static void main(String args[])
    {
        System.out.println("enter no. of elements: ");
        
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements: ");
        
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        System.out.println("enter target sum: ");
        int k=sc.nextInt();
        
        int res[]=twoSum(a,k);
        System.out.println(res[0]+" , "+res[1]);
    }
}