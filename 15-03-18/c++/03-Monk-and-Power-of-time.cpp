#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int ar[n];
    queue<int> que;
    for(int i=0;i<n;i++)
    {
        int tmp;
        cin>>tmp;
        que.push(tmp);
    }
    for(int i=0;i<n;i++)
        cin>>ar[i];
    int ans=0;
    
    for(int i=0;i<n;i++)
    {
        ans++;
        while(que.front()!=ar[i])
        {
            que.push(que.front());
            que.pop();
            ans++;
        }
        que.pop();
    }
    cout<<ans<<endl;
}
