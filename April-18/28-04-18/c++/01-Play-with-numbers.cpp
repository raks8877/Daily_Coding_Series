#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n,q;
    scanf("%d",&n);
    scanf("%d",&q);
    int ar[n+1];
    for(int i = 1; i <= n; i++)
        scanf("%d",&ar[i]);
    
    double ans[n+1];
    ar[0] = 0;
    for(int i = 1; i <= n; i++)
    {
        ans[i] = ans[i-1] + ar[i];
    }
    
    while(q--)
    {
        int a,b;
        scanf("%d",&a);
        scanf("%d",&b);
        
        int divi = b-a+1;
        long val =  (ans[b] - ans[a-1]) / divi;
        printf("%ld\n",val);
    }
    
    
}
