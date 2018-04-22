#include<bits/stdc++.h>

using namespace std;

int start[100005];
int ending[100005];

int main()
{
    int n;
    cin >> n;
    int ar[n]; 
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
        if(start[ ar[i] ] == 0)
        {
            start[ ar[i] ] = i;
        }
        else
        {
            ending[ ar[i] ] = i;
        }
    }
    
    int maxi = 0;
    
    for(int i = 0; i < n; i++)
    {
        int tmp = ending[ar[i]] - start[ar[i]] + 1;
        if(tmp > maxi)
            maxi = tmp;
    }
    cout << maxi << endl;
    
}
