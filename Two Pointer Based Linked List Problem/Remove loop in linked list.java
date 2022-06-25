public static void removeLoop(Node head){
       if(head==null||head.next==null)
       {
           return;
       }
       Node slow=head;
       Node fast=head;
       while(fast!=null&&fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast)
           {
               break;
           }
       }
       Node entry=head;
       if(slow==fast)
       {
       while(slow!=entry)
       {
           slow=slow.next;
           entry=entry.next;
       }
       Node temp=slow;
       while(temp.next!=slow)
       {
          temp=temp.next; 
       }
       temp.next=null;
       }
       
    }
