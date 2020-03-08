#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
        cin>>ar[i];
    
    int diff=ar[0];
    for(int i=1;i<n;i++)
    {
        diff=ar[i]-diff;
        if(diff<0)
            break;
    }
    if(diff==0)
        cout<<"YES\n";
    else
        cout<<"NO\n";
    
}
