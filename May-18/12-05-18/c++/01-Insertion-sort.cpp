#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n], pos[n];
    for(int i = 0; i < n; i++)
    {
        cin >>  ar[i];
        pos[i] = ar[i];
    }
    sort(ar, ar + n);
    
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            if(pos[i] == ar[j])
            {
                cout << (j+1) << " ";
            }
        }
    }
    
}
