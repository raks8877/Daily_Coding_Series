#include<bits/stdc++.h>

using namespace std;

int BS(int ar[], int l, int r, int k )
{
    int m = 0, pos = -1;
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


int main()
{
    int n;
    cin >> n;
    int ar[n];
    for(int i = 0; i < n; i++)
        cin >> ar[i];
    sort(ar,ar+n);
    
    int q;
    cin >> q;
    while(q--)
    {
        int x;
        cin >> x;
        cout << BS(ar, 0, n-1, x) << endl;
    }
}
