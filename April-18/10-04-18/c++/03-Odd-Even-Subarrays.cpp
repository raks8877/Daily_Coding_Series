#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n+1] = {0};
    for(int i = 1; i <= n; i++)
    {
        cin >> ar[i];
        if(ar[i] % 2 == 0)
            ar[i] = 1;
        else 
            ar[i] = -1;
    }
    map<int, int> mp;
    mp[0]++;
    long ans = 0;
    for(int i = 1; i <= n; i++)
    {
        ar[i] += ar[i-1];
        ans += mp[ar[i]];
        mp[ar[i]] += 1;
    }
    cout << ans << endl;
    
}
