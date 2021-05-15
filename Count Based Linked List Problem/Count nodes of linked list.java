/*TC=>O(N)
SC=>O(1)*/

class Solution
{
    public static int getCount(Node head)
    {
       Node temp=head;
       int count=0;
       while(temp!=null)
       {
          temp=temp.next;
          count++;
       }
       return count;
        
    }
}

/*TC=>O(N)
SC=>O(1)*/

class Solution
{
    public static int getCount(Node head)
    {
       Node temp=head;
       int count=1;
       while(temp.next!=null)
       {
          temp=temp.next;
          count++;
       }
       return count;
        
    }
}
