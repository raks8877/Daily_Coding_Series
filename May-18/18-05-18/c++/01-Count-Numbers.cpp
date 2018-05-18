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
        string str;
        cin >> str;
        int cnt = 0;
        bool flag = false;
        for(int i = 0; i < n; i++)
        {
            int val = str[i] - '0';
            if(val >=0 and val <=10 )
            {    
                if(!flag )
                {
                    cnt += 1;
                    flag = true;
                }
            }
            else 
            {
                flag = false;
            }
        }
        cout << cnt << endl;
    }
}
