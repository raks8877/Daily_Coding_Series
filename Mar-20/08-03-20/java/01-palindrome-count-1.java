import java.util.*;
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //Scanner input = new Scanner(System.in);
        String str = input.readLine();
        int n = str.length();
        int pali[][] = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            pali[i][i] = 1;
            if (i-1 >=0)
                pali[i][i-1] = 1;
        }
        int cnt = 0;
        
        for (int k = 2; k <= n; k++)
        {
            for (int i = 0; i < n - k +1; i++)
            {
                int j = i + k -1;
                int diff = j - i + 1;
                if (str.charAt(i) == str.charAt(j))
                {
                    if (diff % 2 != 0)
                    {
                        if (pali[i+1][j-1] > 0 )
                        {
                            pali[i][j] = 1;
                            cnt += 1;
                        }
                    }
                    else
                    {
                        if (pali[i+1][j-1] > 0 && (pali[i][j-1] > 0 || pali[i+1][j] > 0))
                        {
                            pali[i][j] = 1;
                            cnt += 1;
                        }
                        
                    }
                }
            }
        }
        System.out.println(n+cnt);
        
    }
}


