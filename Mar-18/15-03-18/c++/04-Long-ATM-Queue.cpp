#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
        cin>>ar[i];
    int ans=1;
    
    for(int i=0;i<n-1;i++)
    {
        if(ar[i]>ar[i+1])
            ans+=1;
    }
    cout<<ans<<endl;
    
        
}
