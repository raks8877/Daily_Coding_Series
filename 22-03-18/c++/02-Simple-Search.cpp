#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n];
    for(int i = 0; i < n; i++)
        cin >> ar[i];
    int k, pos = -1; 
    cin >> k;
    for(int i = 0; i < n; i++)
    {
        if(ar[i] == k)
        {
            pos = i;
            break;
        }
    }
    cout << pos << endl;
}
