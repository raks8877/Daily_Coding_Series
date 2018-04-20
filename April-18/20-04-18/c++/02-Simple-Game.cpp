#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int BS(int ar[], int l, int r, int k)
{
    int m = 0,pos = -1;
    while(l <= r)
    {
        m = l + (r-l)/2;
        
        if(k > ar[m])
        {
            pos = m;
            l = m + 1;
        }
        else
        {
            r = m - 1;
        }
    }
    return pos+1;
}

int BSg(int ar[], int l, int r, int k)
{
    int m = 0,pos = -1;
    while(l <= r)
    {
        m = l + (r-l)/2;
        
        if(k >= ar[m])
        {
            pos = m;
            l = m + 1;
        }
        else
        {
            r = m - 1;
        }
    }
    return pos+1;
}


int main()
{
    int n, m;
    cin >> n >> m;
    int ar1[n], ar2[m];
    
    for(int i = 0; i < n; i++)
        cin >> ar1[i];
    for(int i = 0; i < m; i++)
        cin >> ar2[i];
    
    sort(ar1,ar1+n);
    sort(ar2,ar2+m);
    
    ll val1 = 0, val2 = 0;
    for(int i = 0; i < n; i++)
    {
        ll t1 = BS(ar2,0,m-1,ar1[i]);
        ll t2 = m - BSg(ar2,0,m-1,ar1[i]);
        val1 += (t1*t2);
    }
    for(int i = 0; i < m; i++)
    {
        ll t1 = BS(ar1,0,n-1,ar2[i]);
        ll t2 = n - BSg(ar1,0,n-1,ar2[i]);
        val2 += (t1*t2);
    }
    
    if(val1 > val2)
        cout << "Monk " << (val1-val2) << endl;
    else if(val1 < val2)
        cout << "!Monk " << (val2-val1) << endl;
    else
        cout << "Tie\n";
    
    
}
