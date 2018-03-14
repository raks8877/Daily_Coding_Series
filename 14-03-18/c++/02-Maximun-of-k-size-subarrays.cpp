#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n,k;
    cin>>n>>k;
    int ar[n];
    for(int i=0;i<n;i++)
        cin>>ar[i];
    map<int,int> mp;
    priority_queue<int> pq;
    
    for(int i=0;i<k;i++)
    {
        pq.push(ar[i]);
        mp[ar[i]]+=1;
    }
    cout<<pq.top()<<" ";
    for(int i=k;i<n;i++)
    {
        mp[ar[i-k]]-=1;
        mp[ar[i]]+=1;
        pq.push(ar[i]);
        while(mp[pq.top()]==0)
        {
            pq.pop();
        }
        cout<<pq.top()<<" ";
    }
    cout<<endl;
}
