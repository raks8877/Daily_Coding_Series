#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n];
    int sum[n] = {0};
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
        if(i == 0)
            sum[i] = ar[i];
        else
            sum[i] = sum[i-1] + ar[i];
    }
    
    int q;
    cin >> q;
    while(q--)
    {
        int val, i = 0 ;
        cin >> val;
        
        for(i = 0; i < n; i++)
        {
            if(val <= sum[i])
            {
                cout << (i+1) << endl;
                break;
            }
        }
        if(i == n)
            cout << "-1\n";
    }
}
