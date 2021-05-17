/*Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen 
 * numbers sum to target. You may return the combinations in any order.The same number may be chosen from candidates an unlimited number of times. 
 * Two combinations are unique if the frequency of at least one of the chosen numbers is different.
*/

import java.util.*;
class comSum 
{
    public List<List<Integer>> combinationSum(int[] a, int target) 
    {
        HashMap<String,Integer>hm=new HashMap<>(); //we created a hashmap to check for uniqueness of the combination that forms an answer
        List<List<Integer>>fres=new ArrayList<>(); //to store all the unique combinations of the answer
        work("",a,0,target,fres,hm);
        return fres;
    }
    
    public void work(String ans, int a[], int sum, int target,List<List<Integer>>fres,HashMap<String,Integer>hm)
    {
        if(sum>target) //if the combination sum exceeds the target sum, we return
        {
            return;
        }
        
        if(sum==target)  //when the combinations sum is equal to the target sum,that means we got an valid combination
        {
            String tempArray[] = ans.split("");  //now we convert it into a String array
            
            Arrays.sort(tempArray);  //we sort the array
            String s=Arrays.toString(tempArray); //and convert back to the string
            if(!hm.containsKey(s))  //now we check in the hashmap, for this string,which contains the combination, if its present in the hashmap
            {                      //that means, its a repetetive combination,thats why we sorted to check for the uniqueness of the aal the digits
                hm.put(s,1);    //if its not present ,we put the ans in the hashmap
                List<Integer>list=new ArrayList<>(); //and make a new list
                for(int i=0;i<tempArray.length;i++) //now we extract each number from our combination ans array
                {
                   list.add(Integer.parseInt(tempArray[i]));//and add them to the list
                }
                fres.add(list);//when all the numbers have been added to the list, we add thist list to the list of combinations
            }
            return;
            
                
        }
        for(int i=0;i<a.length;i++) //thhis is the main part of the program, calling all possible combinations
        {
            int cand=a[i];//taking a candidate from the given candidates
            work(ans+cand,a,sum+cand,target,fres,hm);//and making a call, to all candidates that can pair with it,
        }                                       //we add the cand to the sum, to keep track if it gets equal to the target, and we add the chosen 
    }                       //candidate to the ans
}