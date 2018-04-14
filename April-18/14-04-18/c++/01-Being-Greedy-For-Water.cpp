#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n, x;
        cin >> n >> x;
        int ar[n];
        for(int i = 0; i < n; i++)
            cin >> ar[i];
        sort(ar,ar+n);
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            if(x - ar[i] < 0)
            {
                break;
            }
            else
            {
                cnt++;
                x -= ar[i];
            }
        }
        cout << cnt << endl;
        
    }
}
