#include<bits/stdc++.h>

using namespace std;

bool BS(int ar[], int l, int r, int k)
{
    int m;
    while(l <= r)
    {
        m = l + (r-l)/2;
        if(ar[m] == k )
            return true;
        if(k > ar[m])
            l = m + 1;
        else
            r = m - 1;
    }
    return false;
}


int main()
{
    int n, q;
    cin >> n >> q;
    int ar[n];
    for(int i = 0; i < n; i++)
        cin >> ar[i];
    sort(ar,ar+n);
    while(q--)
    {
        int x;
        cin >> x;
        if(BS(ar,0,n-1,x))
            cout << "YES\n";
        else
            cout << "NO\n";
        
    }
}
