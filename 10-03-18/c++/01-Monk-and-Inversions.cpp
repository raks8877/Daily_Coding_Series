#include<bits/stdc++.h>

using namespace std;
int n;
int ar[1001][1001];
int check(int l,int r)
{
    int cnt=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(l<=i && r<=j)
            {
                if(ar[l][r]>ar[i][j])
                    cnt++;
            }
        }
    }
    return cnt;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        
        cin>>n;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                cin>>ar[i][j];
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans+=check(i,j);
            }
        }
        cout<<ans<<endl;
    }
}
