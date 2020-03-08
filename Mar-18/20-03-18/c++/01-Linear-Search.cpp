#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    int ar[n];
    int pos = -1;
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
        if(ar[i] == m)
            pos = i+1;
    }
    cout << pos <<endl;
        
}
