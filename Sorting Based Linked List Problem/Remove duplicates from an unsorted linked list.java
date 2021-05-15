/*TC=>O(N)
SC=>O(N)*/

class Solution
{
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> hs = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null)
        {
            int curval = current.data;
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}
