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

/*TC=>O(N)
SC=>O(1)*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode entry=head;
        while(fast!=null&&fast.next!=null)
        {
           slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
              while(slow!=entry)
              {
                  slow=slow.next;
                  entry=entry.next;
              }
                return entry;
            }
        }
        return null;
       
    }
}

