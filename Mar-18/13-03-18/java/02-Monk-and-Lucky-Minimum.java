import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int t=input.nextInt();
        while(t-->0)
        {
            int n=input.nextInt();
            int mini=Integer.MAX_VALUE,cnt=0;
            
            for(int i=0;i<n;i++)
            {
                int val=input.nextInt();
                if(val<mini)
                {
                    mini=val;cnt=1;
                }
                else if(val==mini)
                    cnt++;
            }
        
        if(cnt%2==0)
            System.out.println("Unlucky");
        else
            System.out.println("Lucky");
    
        }        
    }
}
