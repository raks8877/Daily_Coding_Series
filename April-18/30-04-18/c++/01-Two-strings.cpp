#include<bits/stdc++.h>

using namespace std;

bool check(string str1, string str2)
{
    int n1 = str1.length();
    int n2 = str2.length();
    int hash1[27] = {0};
    int hash2[27] = {0};
    
    for(int i = 0; i < n1; i++)
    {
        int val = str1[i] - 'a';
        hash1[val] += 1;
    }
    
    
    for(int i = 0; i < n2; i++)
    {
        int val = str2[i] - 'a';
        hash2[val] += 1;
    }
    
    for(int i = 0; i < 27; i++)
    {
        if(hash1[i] != hash2[i])
            return false;
    }
    return true;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string str1,str2;
        cin >> str1 >> str2;
        if(check(str1, str2))
            cout << "YES\n";
        else
            cout << "NO\n";
    }
}
