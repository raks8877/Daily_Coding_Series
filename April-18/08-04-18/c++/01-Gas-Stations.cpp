#include<bits/stdc++.h>

using namespace std;

int main()
{
    long n, x;
    cin >> n >> x;
    long ar[n];
    for(int i = 0 ; i < n; i++)
    {
        cin >> ar[i];
        if(i > 0)
            ar[i] += ar[i-1];
    }
    int ans = 0;
    for(int i = 0; i < n; i++)
    {
        if(ar[i] >= x)
        {
            ans = i+1;
            break;
        }
    }
    cout << ans <<endl;
}
