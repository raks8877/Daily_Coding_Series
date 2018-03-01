#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str;
    cin>>str;
    int len = str.length();
    int cnt[10] = {0};
    
    for(int i = 0; i<len; i++)
    {
        cnt[str[i]-'0']++;
    }
    
    for(int i = 0; i<10; i++)
    {
        cout<<i<<" "<<cnt[i]<<endl;        
    }
    
}
