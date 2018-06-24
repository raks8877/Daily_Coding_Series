
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int n = input.nextInt();
        while(n-- > 0)
        {
            int w, h;
            w = input.nextInt();
            h = input.nextInt();
            if(w < l || h < l)
                System.out.print("UPLOAD ANOTHER\n");
            else
            {
                if(w == h)
                    System.out.print("ACCEPTED\n");
                else
                    System.out.print("CROP IT\n");
            }
            
        }
        
        
    }
}
