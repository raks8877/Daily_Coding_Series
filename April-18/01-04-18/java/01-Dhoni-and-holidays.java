import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            ar[i] = input.nextInt();
        }
        
        int cnt = 0;
        boolean car = false, acad = false;
        
        for(int i = 0; i < n; i++)
        {
            if(ar[i] == 0)
            {
                cnt += 1;
                car = acad = false;
            }
            else if(ar[i] == 1)
            {
                if(!acad)
                {
                    car = false;
                    acad = true;
                }
                else
                {
                    cnt += 1;
                    car = acad = false;
                }
            }
            else if(ar[i] == 2)
            {
                if(!car)
                {
                    car = true;
                    acad = false;
                }
                else
                {
                    cnt += 1;
                    car = acad = false;
                }
            }
            else if(ar[i] == 3)
            {
                if(!car && !acad)
                {
                    car = acad = false;
                }
                else if(car && !acad)
                {
                    car = false;
                    acad = true;
                }
                else if(!car && acad)
                {
                    car = true;
                    acad = false;
                }
            }
        }
        System.out.println(cnt);
        
    }
}
