import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n,m;
        n=input.nextInt();
        m=input.nextInt();
        int ar[][]=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                ar[i][j]=input.nextInt();
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[j][i]+" ");
            }
            System.out.println();
        }
    }
}
