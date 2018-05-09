#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int main()
{
    int n;
    cin >> n;
    int ar[n];
    ll ans = 0;
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
    }
    sort(ar, ar+n);
    
    int tmp = -1;
    ll cnt = 1;
    for(int i = 0; i < n; i++)
    {
        if(ar[i] != tmp)
        {
            tmp = ar[i];
            ans += (cnt*(cnt-1))/2;
            cnt = 1;
        }
        else
        {
            cnt += 1;
        }
        
    }
    ans += (cnt*(cnt-1))/2;
    
    cout << ans << endl;
}
