#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar1[n], ar2[n];
    
    for(int i = 0; i < n; i++)
        cin >> ar1[i];
    
    for(int i = 0; i < n; i++)
        cin >> ar2[i];
    
    sort(ar1, ar1+n);
    sort(ar2, ar2+n);
    
    bool flag = true;
    
    for(int i = 0; i < n; i++)
    {
        if(ar2[i] >= ar1[i])
        {
            flag = false;
            break;
        }
    }
    
    if(flag)
        cout << "Yes\n";
    else
        cout << "No\n";
}
