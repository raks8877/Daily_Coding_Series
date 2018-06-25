#include<bits/stdc++.h>

using namespace std;

void print(int ar1[], int ar2[], int n, int m)
{
    bool flag = true;
    int i = n - 1, j = m - 1;
    while(flag)
    {
        if(i < 0 or j < 0)
            flag = false;
        else if(ar1[i] >= ar2[j])
        {
            cout << ar1[i] << " ";
            i--;
        }
        else if(ar1[i] < ar2[j])
        {
            cout << ar2[j] << " ";
            j--;
        }
        
    }
    
    while(i >= 0)
    {
        cout << ar1[i] << " ";
        i--;
    }
    
    while(j >= 0)
    {
        cout << ar2[j] << " ";
        j--;
    }
    
    cout << endl;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n, m;
        cin >> n >> m;
        int ar1[n], ar2[m];
        for(int i = 0; i < n; i++)
            cin >> ar1[i];
        
        for(int i = 0; i < m; i++)
            cin >> ar2[i];
        sort(ar1, ar1+n);
        sort(ar2, ar2+m);
        
        print(ar1, ar2, n, m);
        
    }
}
