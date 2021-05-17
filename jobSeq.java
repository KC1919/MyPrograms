import java.util.*;
class jobSeq
{
    static Scanner sc=new Scanner(System.in);
    
    static public class Job //implements Comparable <job>
    {
        int id;
        int deadline;
        int profit;
        
        Job(int id,int deadline,int profit)
        {
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
        
        /*public int compareTo(job obj)
        {
            return (this.profit-obj.profit);
        }*/
        
    }
    
    static int[] work(Job a[],int n)
    {
        Arrays.sort(a,(first,second)->(second.profit-first.profit)); //we sort the array of job, in descending order of their profits
        
        int profit=0; //we take a profit variable ,to store the maximum earned profit
        
        int max=0;
        
        for(int i=0;i<a.length;i++) //now we loop thru the array of jobs
        {
            if(a[i].deadline>max)  //we find the maximum deadline present out of all the deadlines of the jobs
            {
                max=a[i].deadline; //and store it in max
            }
        }
        int slot[]=new int[max+1]; //now we create an array of time slots, with max+1 size, as each job takes 1  unit of time to get completed
        slot[0]=-1;         //no job will have deadline as 0, so we put -1 at 0 index
    
        for(int i=1;i<a.length;i++)  //now we loop thru all the available jobs
        {
            if(slot[a[i].deadline]=='\0') //we check if the time slot is available for a job to be done
            {
                slot[a[i].deadline]=1; //so we assign that slot to that job
                profit+=a[i].profit;   //and add its profit
            }
            else   //if that slot is not available,
            {
                int j=a[i].deadline;  //then we store the deadline of the job
                while(j>0)   //and check if there is any empty time slot available previous to the current occupied slot
                {
                    if(slot[j]=='\0') //if present
                    {
                        slot[j]=1;            //then we assign that slot
                        profit+=a[i].profit;  //and add the job's profit
                        break;                //and break from the loop
                    }
                    j--;
                }
            }
        }
        
        int count=0;  //now we take a count variable to count total no. of jobs done to make maximum profit
        for(int i=0;i<slot.length;i++)
        {
            if(slot[i]==1)  //if slot is filled ,means job is done
            {
                count++;  //we increment the count by 1
            }
        }
        
        return new int[]{count,profit};  //and finally we return the no. of jobs done and the profit made
    }
    
    public static void main(String args[])
    {
        System.out.println("enter no. of jobs: ");
        int n=sc.nextInt();
        
        Job a[]=new Job[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("enter job description: ");
            int id=sc.nextInt();
            int deadline=sc.nextInt();
            int profit=sc.nextInt();
            Job obj=new Job(id,deadline,profit);
            a[i]=obj;
        }
        
        int res[]=work(a,n);
        
        System.out.println(res[0]+" "+res[1]); 
        
    }
}
        
    
    