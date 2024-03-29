public Node removeDuplicates(Node head) 
    {
         Set<Integer>set=new HashSet<>();
         Node prev=null;
         Node curr=head;
         while(curr!=null)
         {
             if(set.contains(curr.data))
             {
                 prev.next=curr.next;
             }
             else
             {
                set.add(curr.data);
                prev=curr;
             }
             curr=curr.next;
         }
         return head;
    }
