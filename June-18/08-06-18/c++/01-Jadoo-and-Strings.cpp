#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str;
    getline(cin, str);
    int n = str.length();
    for(int i = n-1; i > 0; i--)
        cout << str[i];
}
