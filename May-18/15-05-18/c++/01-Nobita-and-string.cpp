#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string str = "";
        
        while (str.length() == 0 )
            getline(cin, str);
        str = str + " ";
        int n = str.length();
        stack<string> st;
        string nstr = "";
        for(int i = 0; i < n; i++)
        {
            if(str[i] == ' ')
            {
                nstr = nstr + " ";
                st.push(nstr);
                nstr = "";
            }
            else
            {
                nstr += str[i];
            }
        }
        
        while(!st.empty())
        {
            cout << st.top();
            st.pop();
        }
        cout << endl;
    }
}
