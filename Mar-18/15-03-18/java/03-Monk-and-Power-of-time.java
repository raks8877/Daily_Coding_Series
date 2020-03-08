import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        Queue<Integer> que = new LinkedList<>();
        int ar[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            int tmp=input.nextInt();
            que.add(tmp);
        }
        
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            ans++;
            while(que.peek()!=ar[i])
            {
                ans++;
                que.add(que.peek());
                que.remove();
            }
            que.remove();
        }
        System.out.println(ans);
        
        
    }
}
