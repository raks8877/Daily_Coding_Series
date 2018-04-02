#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int main()
{
    int n;
    cin >> n;
    ll ar[n];
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
    }
    
    stack<ll> st;
    ll front[n] = {0};
    ll back[n] = {0};
    
    ll sum = 0;
    for(int i = 0; i < n; i++)
    {
        while (!st.empty() && ar[st.top()] <= ar[i])
            st.pop();
        
        front[i] = (st.empty())? (-1) : (st.top() + 1);
        st.push(i);
    }
    while(!st.empty())
        st.pop();
    for(int i = n-1 ; i >= 0; i--)
    {
        while(!st.empty() && ar[st.top()] <= ar[i])
            st.pop();
        
        back[i] = (st.empty())? (-1) : (st.top() + 1);
        st.push(i);
    }
    
    for(int i = 0; i < n; i++)
    {
        cout << front[i] + back[i] << " ";
    }
    cout << endl;
    
}
