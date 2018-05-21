
#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

int main()
{
    int n;
    cin >> n;
    ll sum = 0, val = 0;
    for(int i = 0; i < n; i++)
    {
        ll val;
        cin >> val;
        sum += val;
    }
    cout << sum << endl;
}
