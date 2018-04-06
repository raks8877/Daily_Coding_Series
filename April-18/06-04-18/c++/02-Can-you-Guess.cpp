#include<bits/stdc++.h>

using namespace std;

int FactorSum(int n)
{
    int ans = 0;
    for(int i = 1; i < n; i ++)
    {
        if(n % i == 0)
        {
            ans += i;
        }
    }
    return ans;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        cout << FactorSum(n) << endl;
    }
}
