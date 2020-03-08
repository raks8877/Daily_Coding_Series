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
        
        int mini=INT_MAX,cnt=0,val;
        for(int i=0;i<n;i++)
        { 
            cin>>val;
            if(val<mini)
            {
                mini=val;cnt=1;
            }
            else if(val==mini)
            {
                cnt++;
            }
        }
        if(cnt%2==0)
            cout<<"Unlucky\n";
        else
            cout<<"Lucky\n";
    }
}
