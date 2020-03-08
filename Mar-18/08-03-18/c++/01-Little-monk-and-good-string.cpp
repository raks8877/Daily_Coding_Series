#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str;
    cin>>str;
    int len=str.length();
    int ans=0,cnt=0;
    for(int i=0;i<len;i++)
    {
        if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||
           str[i]=='o' || str[i]=='u')
           {
               cnt+=1;
           }
        else
            {
                ans=max(cnt,ans);
                cnt=0;
            }
    }
	ans=max(ans,cnt);
    cout<<ans<<endl;
}
