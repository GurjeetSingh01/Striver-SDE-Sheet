// { Driver Code Starts
import java.util.Scanner;
import java.io.*;
class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}
class GFG2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node start1=null,cur1=null,start2=null,cur2=null;
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start1==null)
                {
                    start1=ptr;
                    cur1=ptr;
                }
                else{
                    cur1.next=ptr;
                    cur1=ptr;
                }
            }
            n=sc.nextInt();
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start2==null)
                {
                    start2=ptr;
                    cur2=ptr;
                }
                else{
                    cur2.next=ptr;
                    cur2=ptr;
                }
            }
            Solution obj=new Solution();
            Node sum = obj.addPolynomial(start1,start2);
            for(Node ptr=sum ; ptr != null; ptr=ptr.next  )
            {
                // printing polynomial
                System.out.print(ptr.coeff + "x^" + ptr.pow);
                if(ptr.next != null)
                System.out.print(" + ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


/*class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}*/

class Solution
{
   public static Node addPolynomial(Node p1,Node p2) {
       if (p1 == null) {
           return p2;
       } else if (p2 == null) {
           return p1;
       }
       Node a = p1, b = p2;
       Node dummyHead = new Node(-1, -1);
       Node ans = dummyHead;
       
       while (a != null && b != null) {
          
           if (a.pow == b.pow) {
               Node newNode = new Node(a.coeff + b.coeff, a.pow);
               ans.next = newNode;
               a = a.next;
               b = b.next;
           } else if (a.pow > b.pow) {
               ans.next = a;
               a = a.next;
           } else {
               ans.next = b;
               b = b.next;
           }
           
           ans = ans.next;
       }
       
       if (a != null) ans.next = a;
       if (b != null) ans.next = b;
       
       return dummyHead.next;
   }
}