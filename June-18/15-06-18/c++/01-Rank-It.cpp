#include<bits/stdc++.h>


using namespace std;

int BS(int ar[], int l, int r,int key)
{
    while(l <= r)
    {
        int m = l + (r-l)/2;
        if(ar[m] == key)
            return m+1;
        else if(key > ar[m])
            l = m + 1;
        else
            r = m - 1;
    }
}

int main()
{
    int n;
    cin >> n;
    int ar[n] = {0};
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
    }
    sort(ar,ar+n);
    int q;
    cin >> q;
    while(q--)
    {
        int x;
        cin >> x;
        cout << BS(ar,0,n-1,x) << endl;
    }
}
