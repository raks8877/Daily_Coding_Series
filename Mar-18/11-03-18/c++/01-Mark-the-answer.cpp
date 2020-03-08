#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n,x;
    cin>>n>>x;
    int ar[n];
    for(int i=0;i<n;i++)
        cin>>ar[i];
    int cnt=0;
    bool skip=true;
    
    for(int i=0;i<n;i++)
    {
        if(ar[i]<=x)
            cnt++;
        else if(skip)
            skip=false;
        else
            break;
    }
    cout<<cnt<<endl;
}
