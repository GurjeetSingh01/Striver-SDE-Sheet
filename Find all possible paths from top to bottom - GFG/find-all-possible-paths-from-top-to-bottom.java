// { Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 2);
            
            
            int[][] grid = IntMatrix.input(br, a[0], a[1]);
            
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> res = obj.findAllPossiblePaths(a[0],a[1], grid);
            
            IntMatrix.print(res);
            
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n,int m, int[][] grid) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ls = new ArrayList<>();
        helper(grid, n, m, 0, 0, ls, ans);
        return ans;
    }
    
    public static void helper(int[][] grid, int n, int m, int i, int j, ArrayList<Integer> ls, ArrayList<ArrayList<Integer>> ans) {
        // out of boundary
        if (i >= n || j >= m) {
            return;
        }
        
        // reached our destination
        if (i == n - 1 && j == m - 1) {
            // adding last cell value to our list
            ls.add(grid[i][j]);
            
            // adding ls into ans by copying it
            ans.add(new ArrayList<>(ls));
            
            // backtracking by removing the last added element
            ls.remove(ls.size() - 1);
            
            return;
        }
        
        // add current cell
        ls.add(grid[i][j]);
        
        // going down
        helper(grid, n, m, i + 1, j, ls, ans);
        
        // going right
        helper(grid, n, m, i, j + 1, ls, ans);
        
        // backtracking
        ls.remove(ls.size() - 1);
        
        return;
    }
}