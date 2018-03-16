#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,x,y,z;
        cin>>n>>x>>y>>z;
        int ar[n];
        for(int i=0;i<n;i++)
        {
            cin>>ar[i];
            while(ar[i]%x==0)
                ar[i]/=x;
            while(ar[i]%y==0)
                ar[i]/=y;
            while(ar[i]%z==0)
                ar[i]/=z;
        }
        bool flag=false;
        for(int i=1;i<n;i++)
        {
            if(ar[i]!=ar[0])
            {
                flag=true;
                break;
            }
        }
        if(flag)
            cout<<"She can't\n";
        else
            cout<<"She can\n";
    }
}
