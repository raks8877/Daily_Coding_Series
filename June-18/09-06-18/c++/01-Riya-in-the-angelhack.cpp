#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    if(n % 3 == 0 and n % 5 == 0)
        cout << "AngelHack!\n";
    else if(n % 3 == 0)
        cout << "Angel\n";
    else if(n % 5 == 0)
        cout << "Hack\n";
    else
        cout << n << endl;
}
