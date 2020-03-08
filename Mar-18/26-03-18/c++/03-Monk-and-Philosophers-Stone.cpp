#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n];
    for(int i = 0; i < n; i++)
        cin >> ar[i];
    int q, x, sum = 0, i = 0;
    
    cin >> q >> x;
    stack<int> st;
    bool flag = false;
    while(q--)
    {
        string str;
        cin >> str;
        if(str == "Harry")
        {
            sum += ar[i];
            st.push(ar[i]);
            i++;
        }
        else
        {
            sum -= st.top();
            if(!st.empty())
                st.pop();
        }
        
        if(sum == x)
        {
            flag = true;
            q = 0;
        }
    }
    if(flag)
        cout << st.size() << endl;
    else
        cout << "-1\n";
    
}
