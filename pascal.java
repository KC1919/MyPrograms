//Q) Pascal's triangle.

import java.util.*;
class pascal
{
    static Scanner sc=new Scanner(System.in);
    
    static ArrayList<ArrayList<Integer>> pastri(int n)
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        
            
        for(int i=1;i<=n;i++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            if(i==1)
            {
                list.add(i);
                res.add(list);
            }
                
            else if(i==2)
            {
                list.add(1);
                list.add(1);
                res.add(list);
            }
                
            else 
            {
                list.add(1);
                for(int j=0;j<(i-2);j++)
                {
                    int sum=res.get(i-2).get(j)+res.get(i-2).get(j+1);
                    list.add(sum);
                }
                list.add(1);
                res.add(list);
            }
        }
            
        return res;
    }
        
    public static void main(String args[])
    {
        System.out.println("enter number: ");
        int n=sc.nextInt();
        
        ArrayList<ArrayList<Integer>> result=pastri(n);
        
        for(ArrayList<Integer> i:result)
        {
            System.out.println(i);
        }
    }
}

/*
Input: 5
Output:
[
      [1],
     [1,1],
    [1,2,1],
   [1,3,3,1],
  [1,4,6,4,1]
]
*/         
                        
                        
                        
                    
                
            