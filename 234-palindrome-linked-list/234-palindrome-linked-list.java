/**
Picture:
    node at front, node at end, they compare and move towards each other
    
    [] - [] - [] - [] - [] - [] - NULL
    (f)->                  <-(e)  
    
    -(e) recursions foward and then back
    -(f) move to next if values equal
 */



class Solution {
    ListNode node; 
    public boolean isPalindrome(ListNode head){
        if(head == null) return true; 
        if(node == null) node = head; 
        boolean bl = isPalindrome(head.next);
        if(head.val == node.val)
            node = node.next; 
        else 
            bl = false ;
        return bl;
        
    }
}

