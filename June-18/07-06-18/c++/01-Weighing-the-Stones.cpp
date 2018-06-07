#include<bits/stdc++.h>

using namespace std;


int check(int ar[],int n)
{
    int cnt=1,maxi=0,val=0;
    for(int i=0;i<n;i++)
    {
        if(ar[i]==ar[i+1])
            cnt+=1;
        else
            cnt=1;
        if(cnt>=maxi)
        {
            maxi=cnt;
            val=ar[i];
        }
    }
    return val;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int ru[n],an[n];
        for(int i=0;i<n;i++)
            cin>>ru[i];
        for(int i=0;i<n;i++)
            cin>>an[i];
        sort(ru,ru+n);
        sort(an,an+n);
        
        int ru_val=check(ru,n);
        int an_val=check(an,n);
        
        if(ru_val>an_val)
            cout<<"Rupam\n";
        else if(ru_val<an_val)
            cout<<"Ankit\n";
        else
            cout<<"Tie\n";
    }
}
