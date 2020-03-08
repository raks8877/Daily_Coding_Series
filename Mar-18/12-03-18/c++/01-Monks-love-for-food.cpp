#include<bits/stdc++.h>

using namespace std;

int main()
{
    int q;
    cin>>q;
    stack<int> st;
    while(q--)
    {
        int t;
        cin>>t;
        if(t==1)
        {
            if(!st.empty())
            {    cout<<st.top()<<endl;
                st.pop();
            }
            else
                cout<<"No Food\n";
        }
        else
        {
            int c;
            cin>>c;
            st.push(c);
        }
    }
}
