#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int main()
{
    int n;
    cin >> n;
    int ar[n];
    for(int i = 0; i < n; i++)
        cin >> ar[i];
    ll a,b,c;
    a = b = c = 0;
    for(int i = 0; i < n; i+=3)
        a += ar[i];
    for(int i = 1; i < n; i+=3)
        b += ar[i];
    for(int i = 2; i < n; i+=3)
        c += ar[i];
    
    cout << a << " " << b << " " << c << endl;
    
}
