import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String s = br.readLine();
 
            String out_ = decode(s);
            System.out.println(out_);
         }
 
         wr.close();
         br.close();
    }
    static String decode(String s){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) 
        {
            if((s.length() - i - 1) % 2 == 0) 
            {
                ans.append(s.charAt(i));
            } else 
            {
                ans.insert(0, s.charAt(i));
            }
        }
        
        return ans.toString();
    }
}
