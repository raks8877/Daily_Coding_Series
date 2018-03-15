#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
        cin>>ar[i];
    for(int i=0;i<n;i++)
    {
        if(ar[i]==0)
        {
            int tmp=i;
            while(ar[tmp]==0)
            {
                tmp--;
                if(tmp<=0)
                    break;
            }
            ar[tmp]=0;
        }
    }
    int sum=0;
    for(int i=0;i<n;i++)
        sum+=ar[i];
    
    cout<<sum<<endl;
}
