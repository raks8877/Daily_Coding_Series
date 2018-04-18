#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int BS(ll ar[], int l, int r, ll k)
{
    int m = 0, pos = 0 ;
    while(l <= r)
    {
        m = l + (r-l)/2;
        if(k >= ar[m])
        {
            pos = m;
            r = m - 1;
        }
        else
            l = m + 1;
        
    }
    return pos;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        ll A[n],B[n];
        for(int i = 0; i < n; i++)
            cin >> A[i];
        for(int i = 0; i < n; i++)
            cin >> B[i];
        int val = 0;
        for(int i = n - 1; i >= 0; i--)
        {
            
            int tmp = BS(A,0,n-1,B[i]);
            if(B[i] >= A[tmp])
                val = max(val, i-tmp);
            
        }
        cout << val << endl;
    }
    
}
