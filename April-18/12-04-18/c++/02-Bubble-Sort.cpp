#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n];
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
    }
    int cnt = 0;
    for(int i = 0; i < n-1; i++)
    {
        for(int j = 0; j < n - i - 1; j++)
        {
            if(ar[j] > ar[j+1])
            {
                int tmp = ar[j];
                ar[j] = ar[j+1];
                ar[j+1] = tmp;
                cnt++;
            }
        }
    }
    cout << cnt << endl;
}
