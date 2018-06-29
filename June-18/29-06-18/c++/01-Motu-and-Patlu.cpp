
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        int ar[n];
        for(int i = 0; i < n; i++)
        {
            cin >> ar[i];
        }
        
        
        
        long sum1 = 0,sum2 = 0;
        int i = 0, j = n - 1;
        
        
        while(i <= j)
        {
            if(sum1 <= (2*sum2))
            {
                while((sum1 <= 2*sum2) && i<=j)
                {
                    sum1+=ar[i];
                    i++;
                }
            }
            else
            if(sum1>sum2)
            {
                while((sum1>2*sum2)&&j>=i)
                {
                    sum2+=ar[j];
                    j--;
                }
            }
        }
        
        
        int a,b;
        a = i;
        b = n - j - 1;
        cout << a << " " << b << endl;
        if(a > b)
            cout << "Motu\n";
        else if(a < b)
            cout << "Patlu\n";
        else
            cout << "Tie\n";
        
    }
}
