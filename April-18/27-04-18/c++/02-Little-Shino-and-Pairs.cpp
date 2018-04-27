#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n];
    for(int i = 0; i < n; i++)
        cin >> ar[i];
    stack<int> st;
    st.push(ar[0]);
    int ans = 0;
    for(int i = 1; i < n; i++)
    {
        while(!st.empty() && ar[i] > st.top())
        {    
            st.pop();
            ans++;
        }
        if(!st.empty())
            ans++;
        
        st.push(ar[i]);
        
    }
    
    cout << ans << endl;
}
