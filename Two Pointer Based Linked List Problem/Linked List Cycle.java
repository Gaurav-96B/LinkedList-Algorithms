/*TC=>O(N)
SC=>O(N)*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode>hs=new HashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(hs.contains(temp))
            {
                return true;
            }
            hs.add(temp);
            temp=temp.next;
        }
        return false;
    }
        
}

/* TC=>O(N)
SC=>O(1)*/
Algorithms: Floyd’s Cycle-Finding Algorithm 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)
        {
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
              return true;
          }
        }
        return false;
        
    }
}
