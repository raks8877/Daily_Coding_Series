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
        for(int i=0;i<n;i++)
            cin>>ar[i];
        int cnt=1;int mini=ar[0];
        for(int i=1;i<n;i++)
        {
            if(ar[i]<=ar[i-1] && ar[i]<=mini)
                cnt++;
            if(ar[i]<mini)
                mini=ar[i];
        }
        cout<<cnt<<endl;
    }
}
