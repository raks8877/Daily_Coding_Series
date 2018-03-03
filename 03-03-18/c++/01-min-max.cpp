#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
        cin>>ar[i];
    
    sort(ar,ar+n);
    
    int cnt=0;
    for(int i=ar[0];i<=ar[n-1];i++)
    {
        while(ar[cnt]==i)
        {
            cnt++;
        }
        if(ar[cnt-1]!=i)
        {
            cout<<"NO\n";
            exit(0);
        }
    }
    cout<<"YES\n";
    
}
