#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

ll findSum(int ar[], int n, int v1, int v2)
{
    ll sum = 0;
    ll modi_sum = 0;
    for(int i = 0; i < n; i++)
    {
        sum += abs(ar[i]);
        modi_sum += abs(ar[i] + v1);
    }
    ll m1,m2;
    m1 = n;
    m2 = v2;
    ll ans = m1*m2;
    return max(sum, max(modi_sum, ans));
    
}


int main()
{
    int n, m;
    cin >> n >> m;
    int ar[n][m];
    int colmaj[m][n];
    
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < m; j++)
        {
            cin >> ar[i][j];
            colmaj[j][i] = ar[i][j];
            
        }
    }
    
    
    
    int v1, v2, v3, v4;
    cin >> v1 >> v2 >> v3 >> v4;
    
    ll row = 0;
    ll col = 0;
    for(int i = 0; i < n; i++)
    {
        row += findSum(ar[i], m, v1, v2);
    }
    
    for(int i = 0; i < m; i++)
    {
        col += findSum(colmaj[i], n, v3, v4);
    }
    
    cout << max(row, col) << endl;
    
}
