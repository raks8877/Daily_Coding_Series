#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n = 3;
    int val;
    int sum1=0,sum2=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>val;
            if( (i+j)%2==0 )
                sum1+=val;
            else
                sum2+=val;
        }
    }
    cout<<sum1<<endl;
    cout<<sum2<<endl;
    
    
}
