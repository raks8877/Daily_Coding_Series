#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        int ar[n];
        
        for(int i = 0; i < n; i++)
            cin >> ar[i];
        stack<int> st;
        st.push(0);
        
        int val[n] = {0};
        val[0] = 1;
        
        for(int i = 1; i < n; i++)
        {
            while(!st.empty() && ar[st.top()] <= ar[i])
                st.pop();
            val[i] = (st.empty())? (i+1) : (i - st.top());
            st.push(i);
        }
        
        for(int i = 0; i < n ; i++)
            cout << val[i] << " ";
        
        cout << endl;
        
    }
}
