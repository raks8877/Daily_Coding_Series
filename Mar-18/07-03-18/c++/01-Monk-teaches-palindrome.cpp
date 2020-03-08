#include<bits/stdc++.h>

using namespace std;

bool pali(string str,int len)
{
    for(int i=0;i<len/2;i++)
    {
        if(str[i]!=str[len-i-1])
            return false;
    }
    return true;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string str;
        cin>>str;
        int len=str.length();
        if(pali(str,len))
        {
            if(len%2==0)
                cout<<"YES EVEN\n";
            else
                cout<<"YES ODD\n";
        }
        else
            cout<<"NO\n";
    }
}
