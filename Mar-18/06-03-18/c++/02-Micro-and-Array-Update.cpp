#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,k,mini=INT_MAX;
        cin>>n>>k;
        int ar[n];
        for(int i=0;i<n;i++)
        {
            cin>>ar[i];
            mini=min(ar[i],mini);
            
        }
        cout<<max(0,k-mini)<<endl;
        
    }
}
