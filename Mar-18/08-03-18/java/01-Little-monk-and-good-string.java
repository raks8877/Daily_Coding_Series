import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str=input.readLine();
        int len=str.length();
        int ans=0,cnt=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='a' ||
               str.charAt(i)=='e' ||
               str.charAt(i)=='i' ||
               str.charAt(i)=='o' ||
               str.charAt(i)=='u')
               cnt++;
            else
            {
                ans=Math.max(ans,cnt);
                cnt=0;
            }
        }
        ans=Math.max(ans,cnt);
        System.out.println(ans);
    }
}
