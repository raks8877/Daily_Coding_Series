#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n, id;
        cin >> n >> id;
        stack<int> st;
        st.push(id);
        int last = 0;
        while(n--)
        {
            char ch;
            cin >> ch;
            if(ch == 'P')
            {
                cin >> id;
                st.push(id);
                last = 0;
            }
            else
            {
                if(!st.empty())
                {
                    if(last == 0)
                    {
                        last = st.top();
                        st.pop();
                    }
                    else
                    {
                        int temp = last;
                        last = st.top();
                        st.pop();
                        st.push(temp);
                    }
                }
                
            }
        }
        cout << "Player " << st.top() << endl;
    }
}
