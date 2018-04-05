#include<bits/stdc++.h>

using namespace std;

vector<int> prime;

void seive()
{
    int n = 1e8;
    n = sqrt(n)+1;
    int check[n+1] = {0};
    for(int i = 2; i <= n; i ++)
    {
        if(!check[i])
        {
            prime.push_back(i);
            for(int j = 2*i; j <=n ; j+=i)
            {
                check[j] = 1;
            }
        }
    }
}

long NumOfDivisor(long n)
{
    
    vector<int>::iterator i;
    long ans = 1;
    long tmp = n;
        
    for(i = prime.begin(); i != prime.end(); i++)
    {
        int cnt = 0;
        bool flag = false;
        while(tmp % (*i) == 0)
        {
            cnt++;
            tmp /= (*i);
            flag = true;
        }
        if(flag)
            ans = ans * (cnt+1);
        
        if((*i) > n || tmp == 0 )
            break;
    }
    if(tmp > 2)
        ans *= 2;
    return ans;
}
   


int main()
{
    seive();
    int t;
    cin >> t;
    while(t--)
    {
        long n;
        cin >> n;
        long ans = NumOfDivisor(n);
        cout << ans << endl;
    }
}
