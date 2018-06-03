#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str1,str2;
    cin >> str1 >> str2;
    
    int n = str1.length(), cnt = 0;
    for(int i = 0; i < n; i++)
    {
        if(str1[i] != str2[i])
            cnt++;
    }
    if(cnt % 2 != 0)
        cout << "-1\n";
    else
        cout << cnt/2 << endl;
}
