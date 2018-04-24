
import java.io.*;


class TestClass {
    static int check(String str)
    {
        int n = str.length();
        int maxi = -1,diff = 0;
        int N = 27;
        int first[] = new int[N];
        int last[] = new int[N];
        
        for(int i = 0; i < N; i++)
        {
            first[i] = last[i] = -1;
        }
        for(int i = 0; i < n; i++)
        {
            int val = str.charAt(i)- 'a';
            if(first[val] == -1)
            {
                first[val] = i;
            }
            else
            {
                last[val] = i;
            }
        }
        
        for(int i = 0; i < N; i++)
        {
            if(first[i] != -1 && last[i] != -1)
            {
                diff = last[i] - first[i] - 1;
                if(diff > maxi)
                    maxi = diff;
            }
        }
        return maxi;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            System.out.println(check(str));
            
            
        }
        
    }
}
