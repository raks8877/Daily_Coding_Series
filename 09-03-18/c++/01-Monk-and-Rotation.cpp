#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,k;
        cin>>n>>k;
        int ar[n];
        for(int i=0;i<n;i++)
            cin>>ar[i];
        int pos=n-(k%n);
        for(int i=pos;i<n;i++)
        {
            cout<<ar[i]<<" ";
        }
        for(int i=0;i<pos;i++)
            cout<<ar[i]<<" ";
        cout<<endl;
    }
}
