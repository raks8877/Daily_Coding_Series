import java.util.*;

class TestClass {
    int check(int ar[],int n)
    {
        int cnt=1,maxi=0,val=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]==ar[i+1])
                cnt+=1;
            else
                cnt=1;
            if(cnt>=maxi)
            {
                maxi=cnt;
                val=ar[i];
            }
            
        }    
        return val;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        TestClass obj=new TestClass();
        int t=input.nextInt();        
        while(t-->0)
        {
            int n=input.nextInt();
            int ru[]=new int[n+1];
            int an[]=new int[n+1];
            //passing ar removes last element so added large num
            //don't know why it happens,do comment if you know the answer
            ru[n]=Integer.MAX_VALUE;
            an[n]=Integer.MAX_VALUE;
            
            
            for(int i=0;i<n;i++)
                ru[i]=input.nextInt();
            for(int i=0;i<n;i++)
                an[i]=input.nextInt();
            Arrays.sort(ru);
            Arrays.sort(an);
            
            int ru_val=obj.check(ru,n);
            int an_val=obj.check(an,n);
            
            if(ru_val>an_val)
                System.out.println("Rupam");
            else if(ru_val<an_val)
                System.out.println("Ankit");
            else
                System.out.println("Tie");
            
            
        }
    }
}
