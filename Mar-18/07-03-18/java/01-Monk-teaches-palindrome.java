import java.io.*;

class TestClass {
    boolean pali(String str,int len)
    {
        for(int i=0;i<len/2;i++)
        {
            if(str.charAt(i)!=str.charAt(len-i-1))
                return false;
        }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        TestClass obj=new TestClass();
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(input.readLine());
        while(t-->0)
        {
            String str;
            str=input.readLine();
            int len=str.length();
            if(obj.pali(str,len))
                if(len%2==0)
                    System.out.println("YES EVEN");
                else
                    System.out.println("YES ODD");
            else
                System.out.println("NO");
            
        }
    }
}
