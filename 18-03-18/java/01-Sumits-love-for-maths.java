import java.util.*;

class TestClass {
    public Long GCD(Long a, Long b) 
    {
       if (b==0) return a;
       return GCD(b,a%b);
    }
    public Long LCM(Long a, Long b) 
    {
       TestClass obj = new TestClass();
       return (a*b)/obj.GCD(a,b);
    }
    
    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        TestClass obj = new TestClass();
        int t = input.nextInt();
        while(t-->0)
        {
            Long n,a,b,c,d;
            n = input.nextLong();
            a = input.nextLong();
            b = input.nextLong();
            c = input.nextLong();
            long total = (n/a)+ (n/b)+ (n/c);
            total -= (n/obj.LCM(a,b));
            total -= (n/obj.LCM(a,c));
            total -= (n/obj.LCM(b,c));
            total += (n/ obj.LCM(obj.LCM(a,b),c) );
            System.out.println(total);
            
        }
    }
}
