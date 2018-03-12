#include<bits/stdc++.h>

using namespace std;

typedef long long ll;


int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        ll n;
        cin>>n;
        ll ar[n];
        ll nsum=0;
        for(int i=0;i<n;i++)
        {
            cin>>ar[i];
            if(ar[i]<=0)
                nsum+=ar[i];
        }
        
        sort(ar,ar+n);
        ll psum=0,ans,cnt=0;
        
        for(int i=n-1;i>=0;i--)
        {
            if(ar[i]>=0)
            {
                psum+=ar[i];
                cnt++;
            }
            else
            {
                break;
            }
        }
        ans=(psum*cnt)+nsum;
        
        for(int i=n-1-cnt;i>=0;i--)
        {
            psum+=ar[i];
            nsum-=ar[i];
            cnt++;
            ll tmp=(psum*cnt)+nsum;
            ans=max(ans,tmp);
        }
        
        cout<<ans<<endl;
        
    }
    
}  
