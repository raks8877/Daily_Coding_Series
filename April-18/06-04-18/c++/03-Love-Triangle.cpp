#include<bits/stdc++.h>

using namespace std;
typedef unsigned long long ll;

ll solve(ll n)
{
    if(n < 9)
        return n;
    else
        return n % 9 + (10*solve(n/9));
}

int main()
{
    ll n;
    while(cin >> n)
    {
        cout << solve(n) << endl;
    }

}
