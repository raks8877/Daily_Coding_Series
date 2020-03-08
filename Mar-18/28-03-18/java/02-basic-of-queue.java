import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        Queue<Integer> que = new LinkedList<>();
        while(n-- > 0)
        {
            String data[] = input.readLine().split(" ");
            if(data[0].equals("E"))
            {
                int x = Integer.parseInt(data[1]);
                que.add(x);
                System.out.println(que.size());
            }
            else
            {
                if(!que.isEmpty())
                {
                    System.out.print(que.peek() + " ");
                    que.remove();
                }
                else
                {
                    System.out.print("-1 ");
                }
                System.out.println(que.size());
            }
        }
        
    }
}
