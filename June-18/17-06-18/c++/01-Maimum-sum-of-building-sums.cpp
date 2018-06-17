#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[2*n];
    for(int i = 0; i < 2*n; i++)
        cin >> ar[i];
    sort(ar,ar+(2*n));
    int ans = 0;
    for(int i = 0; i < 2*n; i += 2)
        ans += ar[i];
    cout << ans << endl;
}
