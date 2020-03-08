import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = 3;
        int val,sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                val = input.nextInt();
                if( (i+j)%2==0 )
                    sum1 += val;
                else
                    sum2 += val;
            }
        }
        System.out.println(sum1+"\n"+sum2);
    }
}
