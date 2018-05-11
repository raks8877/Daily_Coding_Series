
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n, k;
    cin >> n >> k;
    int ar[n];
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
    }
    
    for(int i = 0; i < k; i++)
    {
        int pos = i;
        for(int j = i + 1; j < n; j++)
        {
            if(ar[j] < ar[pos])
            {
                pos = j;
            }
        }
        int tmp = ar[i];
        ar[i] = ar[pos];
        ar[pos] = tmp;
    }
    
    for(int i = 0; i < n; i++)
        cout << ar[i] << " ";
    cout << endl;
}
