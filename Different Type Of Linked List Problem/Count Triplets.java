static int countTriplets(Node head, int x) 
    { 
        ArrayList<Integer>a = new ArrayList<>();
        Node p=head;
        while(p!=null)
        {
            a.add(p.data);
            p=p.next;
        }
        int n=a.size();
        int c=0;
        for(int i=0; i<n; i++)
        {
            int lo=i+1, hi=n-1;
            while(lo<hi)
            {
                if(x==a.get(lo)+a.get(hi)+a.get(i)){
                    c++;
                    lo++;
                    hi--;
                }
                else if(x>a.get(lo)+a.get(hi)+a.get(i))
                    hi--;
                else
                    lo++;
            }
        }
        return c;
    } 
