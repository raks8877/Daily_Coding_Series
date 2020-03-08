#include<bits/stdc++.h>

using namespace std;

int main()
{
    int q;
    cin >> q;
    stack<int> st;
    while(q--)
    {
        int x, y;
        cin >> x;
        if(x == 1)
        {
            if(st.empty())
                cout << "No Food\n";
            else
            {
                cout << st.top() << endl;
                st.pop();
            }
        }
        else
        {
            cin >> y;
            st.push(y);
        }
    }
}
