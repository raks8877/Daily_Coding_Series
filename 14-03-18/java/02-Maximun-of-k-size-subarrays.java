import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n,k;
        n=input.nextInt();
        k=input.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((x, y) -> y - x);
        
        for(int i=0;i<k;i++)
        {
            if(mp.containsKey(ar[i]))
                mp.put(ar[i],mp.get(ar[i])+1);
            else
                mp.put(ar[i],1);
            pq.add(ar[i]);
        }
        System.out.print(pq.peek()+" ");
        
        for(int i=k;i<n;i++)
        {
            if(mp.containsKey(ar[i-k]))
                mp.put(ar[i-k],mp.get(ar[i-k])-1);
            if(mp.containsKey(ar[i]) )
                mp.put(ar[i],mp.get(ar[i])+1);
            else
                mp.put(ar[i],1);
            
            pq.add(ar[i]);
            while(mp.get(pq.peek())<=0)
            {
                pq.poll();
            }
            System.out.print(pq.peek()+" ");
        }
        
    }
}
