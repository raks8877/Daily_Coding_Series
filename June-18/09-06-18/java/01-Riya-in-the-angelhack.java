
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n % 3 == 0 && n % 5 == 0)
            System.out.println("AngelHack!");
        else if(n % 3 == 0)
            System.out.println("Angel");
        else if(n % 5 == 0)
            System.out.println("Hack");
        else
            System.out.println(n);
        

    }
}
