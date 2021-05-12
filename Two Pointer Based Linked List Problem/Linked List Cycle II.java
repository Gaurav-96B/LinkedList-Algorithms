/*TC=>O(N)
SC=>O(N)*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode>hs=new HashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(hs.contains(temp))
            {
                return temp;
            }
            else
            {
                hs.add(temp);
            }
            temp=temp.next;
        }
        return null;
        
    }
}
