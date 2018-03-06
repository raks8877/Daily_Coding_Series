#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n,m;
    cin>>n>>m;
    int ar[n][m];
    
    for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
            cin>>ar[i][j];
    for(int i=0;i<m;i++)
    {    for(int j=0;j<n;j++)
         {
             cout<<ar[j][i]<<" ";
         }
        cout<<endl;
    }   
}
