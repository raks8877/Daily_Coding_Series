#include<bits/stdc++.h>

using namespace std;

vector<int> vec;
void seive()
{
    int check[1001] = {0};
    
    for(int i = 2; i <= 1000; i++)
    {
        if(check[i] == 0)
        {
            vec.push_back(i);
            for(int j = 2*i; j <= 1000; j+=i)
            {
                check[j] = 1;
            }
            
            
        }
    }
}

int main()
{
    seive();
    int n;
    cin >> n;
    vector<int>::iterator i;
    for(i = vec.begin(); i != vec.end(); i++)
    {
        if( (*i) > n)
        {
            break;
        }
        cout << (*i) << " ";
    }
}
