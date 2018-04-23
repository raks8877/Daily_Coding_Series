#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n, b, g;
        cin >> n >> b >> g;
        
        if(max(b,g) - 1 >  min(b,g))
            cout << "Little Jhool wins!\n";
        else
            cout << "The teacher wins!\n";
        
        
    }
}
