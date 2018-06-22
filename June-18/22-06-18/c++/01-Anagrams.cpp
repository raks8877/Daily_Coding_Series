#include<bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string str1, str2;
        cin >> str1 >> str2;
        int n1 = str1.length();
        int n2 = str2.length();
        int val = 0;
        int ar1[27] = {0};
        int ar2[27] = {0};
        
        
        for(int i = 0; i < n1; i++)
        {
            int v = str1[i] - 'a';
            ar1[v] += 1;
        }
        
        for(int i = 0; i < n2; i++)
        {
            int v = str2[i] - 'a';
            ar2[v] += 1;
        }
        
        for(int i = 0; i < 27; i++)
        {
            if(ar1[i] != 0 and ar2[i] != 0)
            {
                val += 2* min(ar1[i] , ar2[i]);
            }
        }
        
        int ans = n1 + n2 - val;
        cout << ans << endl;
        
    }
}
