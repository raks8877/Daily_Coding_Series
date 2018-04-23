#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    scanf("%d", &t);
    while(t--)
    {
        int n,k,p;
        scanf("%d", &n);
        scanf("%d", &k);
        scanf("%d", &p);
        int ar[k+2];
        ar[0] = 0;
        for(int i = 1; i <= k; i++)
            cin >> ar[i];
        ar[k+1] = INT_MAX;
    
        if(p > (n-k))
            printf("-1\n");
        else
        {
            sort(ar,ar+k+2);
            for(int i = 1; i <= k+1; i++)
            {
                int capacity = ar[i] - ar[i-1] - 1;
                if(p - capacity <= 0)
                {
                    cout << ar[i-1] + p << endl;
                    break;
                }
                else
                {
                    p -= capacity;
                }
            }
        }
    }
}
