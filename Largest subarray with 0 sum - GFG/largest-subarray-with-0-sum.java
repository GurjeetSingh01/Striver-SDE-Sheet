// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
  int maxLen(int arr[], int n)
    {
        // Your code here
        
        //map holds the prefix sum as key 
        //and idx at which the sum occurs as value.
        //15 -2 2 -8 1 7 10 23
        Map<Integer, Integer> map=new HashMap<>();
        int prefix_sum=0, ans=Integer.MIN_VALUE, sum_to_find=0;
        map.put(prefix_sum,-1);
        
        for(int i=0;i<n;i++){
            prefix_sum+=arr[i];
            //premise: if sum from idx a to b = x
            //& sum from idx b to c = y,
            //then sum from idx a to b should be x-y.
            if(map.containsKey(prefix_sum-sum_to_find)){
                ans=Math.max(ans,i-map.get(prefix_sum));
            }else{
                map.put(prefix_sum,i);
            }
        }
        return (ans==Integer.MIN_VALUE)?0:ans;
    }
}