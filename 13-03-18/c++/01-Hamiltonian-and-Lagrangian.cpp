#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int ar[n],maxi[n]={0};
    for(int i=0;i<n;i++)
        cin>>ar[i];
    
    maxi[n-1]=ar[n-1];
    for(int i=n-2;i>=0;i--)
        maxi[i]=max(maxi[i+1],ar[i]);
    
    
    for(int i=0;i<n;i++)
        if(ar[i]>=maxi[i])
            cout<<ar[i]<<" ";
    
}
