class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged,temp;
        if(l1==null||l2==null)
            return l1==null?l2:l1;
        if(l1.val<=l2.val){
            merged=l1;
            l1=l1.next;
        }
        else{
            merged=l2;
            l2=l2.next;
        }
        temp=merged;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            }
        }
        temp.next= (l1==null)?l2:l1;
        return merged;
    }
}