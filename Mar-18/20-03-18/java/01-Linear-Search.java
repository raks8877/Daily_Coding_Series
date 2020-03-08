import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n, m;
        n = input.nextInt();
        m = input.nextInt();
        int ar[] = new int[n];
        int pos = -1;
        for(int i = 0; i < n; i++)
        {
            ar[i] = input.nextInt();
            if(ar[i] == m)
                pos = i+1;
        }
        System.out.println(pos);
    }
}
