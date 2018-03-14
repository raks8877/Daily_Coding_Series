#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int ar[n+1]={0};
    
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        cin>>ar[i];
        sum+=ar[i];
    }
    
    int lastDigit=0;
    int ans[n+1]={0};
    for(int i=1;i<=n;i++)
    {
        int currSum = sum-ar[i];
        if(i!=n)
            lastDigit = ar[i-1]+ar[n];
        else
            lastDigit = ar[i-1];
        if(currSum%3==0 && lastDigit%10==0)
            ans[i]=ans[i-1]+1;
        else
            ans[i]=ans[i-1];
    }
    int q;
    cin>>q;
    while(q--)
    {
        int l,r;
        cin>>l>>r;
        cout<<(ans[r]-ans[l-1])<<endl;
    }
    
}
