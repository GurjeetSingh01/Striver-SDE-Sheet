// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.FindNthTerm(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    private int mod = (int)1e9+7;
    
    private long[][] multiply(long a[][], long b[][]){
        long arr[][] = new long[2][2];
        arr[0][0] = (a[0][0]*b[0][0]+a[0][1]*b[1][0])%mod;
        arr[0][1] = (a[0][0]*b[0][1]+a[0][1]*b[1][1])%mod;
        arr[1][0] = (a[1][0]*b[0][0]+a[1][1]*b[1][0])%mod;
        arr[1][1] = (a[1][0]*b[0][1]+a[1][1]*b[1][1])%mod;
        return arr;
    }
    
    private long[][] power(long arr[][], int p){
        if(p==1) return arr;
        long temp[][] = power(arr,p/2);
        if(p%2==0) return multiply(temp,temp);
        return multiply(multiply(temp,temp),arr);
    }
    
    public int FindNthTerm(int n)
    {
        // code here
        long arr[][] = {{1,1},{1,0}};
        arr = power(arr,n);
        return (int)arr[0][0];
    }
}