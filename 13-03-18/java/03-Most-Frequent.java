import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        Arrays.sort(ar);
        int cnt=1,maxi=0,val=0;
        
        for(int i=1;i<n;i++)
        {
            if(ar[i]==ar[i-1])
                cnt++;
            else if(ar[i]!=ar[i-1])
                cnt=1;
            if(cnt>maxi)
            {
                maxi=cnt;val=ar[i];
            }
        }
        System.out.println(val);
        
    }
}
