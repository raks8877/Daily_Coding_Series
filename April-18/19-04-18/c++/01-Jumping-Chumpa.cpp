#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        long n, q;
        cin >> n >> q;
        long ar[n];
        for(int i = 0; i < n; i++)
            cin >> ar[i];
        sort(ar,ar+n);
        long ans = 0;
        for(int i = 0; i < n-1; i++)
        {
            ans += (q*abs(ar[i]-ar[i+1]));
        }
        cout << ans << endl;
    }
}
