#include<bits/stdc++.h>

using namespace std;
typedef long long ll;


int visit[100005];
void solu(ll ar[], ll n, ll k, ll l)
{
    memset(visit, -1, sizeof(visit));
    
    queue<ll> que;
    que.push(k);
    visit[k] = 0;
    while(!que.empty())
    {
        ll val = que.front();
        que.pop();
        
        for(int i = 0; i < n; i++) 
        {
            int data = (val * ar[i]) % 100000;
            if(visit[data] == -1)
            {
                visit[data] = 1 + visit[val];
                que.push(data);
            }
        }
    }
    cout << visit[l] << endl;
    
}


int main()
{
    
    ll k, l;
    cin >> k >> l;
    ll n;
    cin >> n;
    ll ar[n];
    for(int i = 0; i < n; i++)
        cin >> ar[i];
    
    solu(ar, n, k, l );
    
    
}
