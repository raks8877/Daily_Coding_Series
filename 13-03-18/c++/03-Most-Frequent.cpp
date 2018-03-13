#include<bits/stdc++.h>.
 
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
        cin>>ar[i];
    sort(ar,ar+n);
    int cnt=1,maxi=0,val=0;
    
    for(int i=1;i<n;i++)
    {
        if(ar[i]==ar[i-1])
        {
            cnt++;
        }
        else if(ar[i]!=ar[i-1])
        {
            cnt=1;
        }
        if(cnt>maxi)
        {
            maxi=cnt;val=ar[i];
        }
    }
    cout<<val<<endl;
}
