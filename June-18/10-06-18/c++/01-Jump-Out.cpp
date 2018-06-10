#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ans = 0;
    for(int i = 0; i < n; i++)
    {
        int tmp;
        cin >> tmp;
        if(ans == 0 and n-tmp - i <= 0)
            ans = i + 1;
    }
    cout << ans << endl;
}
