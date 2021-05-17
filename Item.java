import java.util.*;

class Item 
{
    int value, weight;
    Item(int x, int y)
    {
        this.value = x;
        this.weight = y;
    }
}


class itemComparator implements Comparator<Item>
{
    @Override
    public int compare(Item a, Item b)
    {
        double r1=(double)(a.value) / (double)(a.weight);  //we calculate the ratio of value to weight
        double r2=(double)(b.value) / (double)(b.weight);
        if(r1>r2)                       //as we have to sort in descending order
        return -1;
        else if(r2>r1)          //so when r2 is greater than r1 we return 1;
        return 1;
        else
        return 0;
    }
    
}

class solve
{
    static Scanner sc=new Scanner(System.in);
    static double fractionalKnapsack(int W, Item a[], int n) 
    {
        Arrays.sort(a,new itemComparator());   //this sorts the array based on the ratio decreasing ratio
        
        double val=0;
        int i,weight=0;
        
        for(i=0;i<n;i++)
        {
            
                if(a[i].weight+weight<=W)  //then we start adding up the weight and the corresponding value to that weight
                {                          //we keep a check that the weight does not cross the given weight
                    val+=a[i].value;
                    weight+=a[i].weight;
                }
                else         //if some weight is left to be added, and there is no equivalent weight available to that, means we require
                {            // a part of some weight
                    int remain=W-weight;  //so we calculate the remaining weight
                    val+=((double)a[i].value/(double)a[i].weight)*(double)remain;  //and find the unit value of the present weight,and muliply it by the
                    weight+=remain;                                              //remain to get the total value for the remain
                    break;  //finally we achieved the total weight, and the maximum possible value, so we break;
                }

        }
        return val; //and return the value
    }
  
}