
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n];
    for(int i = 0; i < n; i++)
        cin >> ar[i];
    
    int q;
    cin >> q;
    while(q--)
    {
        int x;
        cin >> x;
        for(int i = 0; i < n; i++)
        {
            if(ar[i] > x)
            {
                ar[i] -= 1;
            }
        }
    }
    
    for(int i = 0; i < n; i++)
        cout << ar[i] << " ";
    cout << endl;
}
