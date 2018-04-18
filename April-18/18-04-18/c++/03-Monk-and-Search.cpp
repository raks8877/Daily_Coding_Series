#include<bits/stdc++.h>

using namespace std;

int BS1(int ar[],int l, int r, int k)
{
    int m = 0;
    while(l <= r )
    {
        m = l + (r-l)/2;
        
        if(ar[m] < k)
        {
            if(ar[m+1] >= k)
                return m+1;
            else
                l = m + 1;
        }
        else 
            r = m - 1;
    }
    return m;
}


int BS2(int ar[],int l, int r, int k)
{
    int m = 0;
    while(l <= r )
    {
        m = l + (r-l)/2;
        if(ar[m] == k)
        {
            if(ar[m+1] > k)
                return m+1;
            else
                l = m + 1;
        }
        else if(ar[m] > k)
        {
            if(ar[m-1] < k)
                return m;
            else
                r = m - 1;
        }
        else 
            l = m + 1;
    }
    return m;
}


int main()
{
    int n;
    cin >> n;
    int ar[n+1];
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
    }
    ar[n] = INT_MAX;
    sort(ar,ar+n);
    int q;
    cin >> q;
    while(q--)
    {
        int a,x;
        cin >> a >> x;
        if(a == 0)
            cout << n - BS1(ar,0,n,x) << endl;
        else
            cout << n - BS2(ar,0,n,x) << endl;
        
    }
}
