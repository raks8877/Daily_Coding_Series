
import java.util.*;


class TestClass {
    
    static double func(double r,double g){
        if(r==0||g==0) return 1;
        if(g==1) return r/(r+g);
        double t=r+g;
        return (r/t)+(g/t)*((g-1)/(t-1))*func(r,g-2);
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n, m;
            n = input.nextInt();
            m = input.nextInt();
            System.out.printf("%.6f \n",func(n,m));
             
        }
    }
}
