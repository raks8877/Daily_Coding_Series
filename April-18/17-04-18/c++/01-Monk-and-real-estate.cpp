#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int e;
        cin >> e;
        int hash[10002] = {0};
        int cnt = 0;
        while(e--)
        {
            int a, b;
            cin >> a >> b;
            if(!hash[a])
            {
                hash[a] = 1;
                cnt++;
            }
            if(!hash[b])
            {
                hash[b] = 1;
                cnt++;
            }
        }
        cout << cnt << endl;
        
    }
}
