#include<bits/stdc++.h>

using namespace std;
const int N = 100001;

int main()
{
    int t;
    scanf("%d", &t);
    while(t--)
    {
        int n;
        scanf("%d", &n);
        int pos[N] = {0},neg[N] = {0};
        for(int i = 0; i < n; i++)
        {
            int a;
            scanf("%d", &a);
            if(a < 0)
                neg[abs(a)] = 1;
            else
                pos[a] = 1;
        }
        int q;
        cin >> q;
        for(int i = 0; i < q; i++)
        {
            int x;
            cin >> x;
            if(x < 0)
            {
                if(neg[abs(x)] == 1)
                    printf("Yes\n");
                else
                    printf("No\n");
            }
            else
            {
                if(pos[x] == 1)
                    printf("Yes\n");
                else
                    printf("No\n");
            }
        }
        
    }
}
