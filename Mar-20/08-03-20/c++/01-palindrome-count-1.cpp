#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    string str;
    cin >> str;
    int len = str.length();
    
    bool pali[len][len];
    
    memset(pali, 0, sizeof(pali[0][0]) * len * len);
    
    
    for (int i = 0; i < len; i++)
    {
        pali[i][i] = 1;
        if (i-1 >= 0)
            pali[i][i-1] = 1;
    }
    
    int cnt = 0;
    for (int k = 2; k <= len; k++)
    {
        for (int i = 0; i < len - k + 1; i++)
        {
            int j = i + k - 1;
            int diff = j - i + 1;
            
            if (str[i] == str[j])
            {
                if (diff % 2 != 0)
                {
                    if (pali[i+1][j-1] )
                    {
                        pali[i][j] = 1;
                        cnt += 1;
                    }
                }
                else
                {
                    if (pali[i+1][j-1] && (pali[i][j-1] || pali[i+1][j]))
                    {
                        pali[i][j] = 1;
                        cnt += 1;
                    }
                    
                    
                }
            }
        }
    }
    
   
    // for (int i = 0; i < len; i++)
    // {
    //     for (int j = 0; j < len; j++)
    //     {
    //         cout << pali[i][j] << " ";
    //     }
    //     cout << endl;
    // }
    
    cout << len + cnt << endl;
   
}
