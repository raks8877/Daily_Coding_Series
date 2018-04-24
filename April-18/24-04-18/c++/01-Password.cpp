#include<bits/stdc++.h>

using namespace std;

bool pali(string str1, string str2)
{
    
    int l1 = str1.length();
    int l2 = str2.length();
    if(l1 != l2)
        return false;
    
    for(int i = 0; i < l1; i++)
    {
        if(str1[i] != str2[l2-i-1])
        {
            return false;
        }
        
    }
    return true;
}

int main()
{
    int n;
    cin >> n;
    string str[n];
    for(int i = 0; i < n; i++)
    {
        cin >> str[i];
    }
    char ans;
    int len;
    for(int i = 0; i < n; i++)
    {
        for(int j = i + 1; j < n; j++)
        {
            bool check = pali(str[i],str[j]);
            if(check)
            {
                len = str[i].length();
                ans = str[i][len/2];
                break;
            }
        }
    }
    cout << len << " " << ans << endl;
}
