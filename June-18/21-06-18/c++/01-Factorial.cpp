#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    long ans = 1;
    for(int i = 1; i <= n; i++)
    {
        ans = ans *i;
    }
    cout << ans << endl;
}
