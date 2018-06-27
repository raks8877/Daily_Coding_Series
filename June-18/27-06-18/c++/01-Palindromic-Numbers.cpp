#include<bits/stdc++.h>

using namespace std;

bool pali(int n)
{
    int tmp = n;
    int num = 0;
    while(n != 0)
    {
        int d = n % 10;
        num = (num*10) + d;
        n /= 10;
    }
    if(num == tmp)
        return true;
    else
        return false;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int a,b;
        cin >> a >> b;
        int cnt = 0;
        for(int i = a; i <= b; i++)
        {
            if(pali(i))
                cnt += 1;
        }
        cout << cnt << endl;
    }
}
