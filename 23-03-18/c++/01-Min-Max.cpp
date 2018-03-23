#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n];
    int sum = 0, maxi = INT_MIN, mini = INT_MAX;
    
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
        sum += ar[i];
        
        if(ar[i] < mini)
            mini = ar[i];
        else if(ar[i] > maxi)
            maxi = ar[i];
    }
    
    cout << (sum-maxi) << " " << (sum-mini) << endl;
}
