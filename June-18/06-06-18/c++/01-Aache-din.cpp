#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int ar[n];
        map<int,int> mp;
        
        for(int i=0;i<n;i++)
        {
            cin>>ar[i];
            mp[ar[i]]+=1;    
        }
        map<int,int>::iterator it;
        
        for(it=mp.begin();it!=mp.end();it++)
        {
            if(it->second==1)
            {    
                cout<<it->first<<endl;
                break;
            }
        }
        
    }
}
