#include<bits/stdc++.h>

using namespace std;
map<int,int> dp;
int cnt = 0;

int cmp(string str1, string str2)
{
    int n1 = str1.length();
    
    for(int i = 0; i < n1; i++)
    {
        if(str1[i] != str2[i])
        {
            dp[i] = 1;
            cnt += 1;   
        }
    }
    return 1;
}

int main()
{
    int n, q;
    cin >> n >> q;
    string str1, str2;
    cin >> str1 >> str2;
    int  x = cmp(str1, str2);
    bool flag = false;
    while(q--)
    {
        scanf("%d", &x);
        x--;
        if(dp[x])
            cnt -= 1;
        else
        {
            if(str1[x] == '0')
                flag = true;
        }
        
        if(cnt == 0 && !flag)
            printf("YES\n");
        else
            printf("NO\n");
    }
}
