#include<bits/stdc++.h>


using namespace std;

int main()
{
    int n,q;
    cin>>n>>q;
    int ar[n];
    for(int i=0;i<n;i++)
    {
        cin>>ar[i];        
    }
    
    for(int i=1;i<=q;i++)
    {
        int a,b,c;
        cin>>a>>b>>c;
        if(a==1)
        {
            ar[b]=c;
        }
        else
        {
            int sum=0;
            for(int j=b;j<=c;j++)
                sum+=ar[j];
            cout<<sum<<endl;
        }
    }
}
