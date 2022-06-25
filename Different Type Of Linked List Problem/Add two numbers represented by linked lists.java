static Node addTwoLists(Node l1, Node l2){
        if(l1==null||l2==null)
        {
            return l1!=null ? l1:l2;
        }
        Node c1=reverse(l1);
        Node c2=reverse(l2);
        Node head=new Node(-1);
        Node itr=head;
        
        int carry=0;
        while(c1!=null||c2!=null||carry!=0)
        {
            int sum=carry+(c1!=null?c1.data:0)+(c2!=null?c2.data:0);
            int ld=sum%10;
            carry=sum/10;
            itr.next=new Node(ld);
            itr=itr.next;
            if(c1!=null)
            {
                c1=c1.next;
            }
            if(c2!=null)
            {
                c2=c2.next;
            }
        }
        return reverse(head.next);
    }
    static  Node reverse(Node head) {
        Node newHead=null;
        while(head!=null)
        {
            Node next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
        
    }
