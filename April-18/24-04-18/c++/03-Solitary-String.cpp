#include<bits/stdc++.h>

using namespace std;

int check(string str)
{
    int n = str.length();
    int maxi = -1,diff = 0;
    int N = 27;
    int first[N] = {0}, last[N] = {0};
    
    for(int i = 0; i < N; i++)
    {
        first[i] = last[i] = -1;
    }
    for(int i = 0; i < n; i++)
    {
        int val = str[i] - 'a';
        if(first[val] == -1)
        {
            first[val] = i;
        }
        else
        {
            last[val] = i;
        }
    }
    
    for(int i = 0; i < N; i++)
    {
        if(first[i] != -1 && last[i] != -1)
        {
            diff = last[i] - first[i] - 1;
            if(diff > maxi)
                maxi = diff;
        }
    }
    return maxi;
}
    


int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string str;
        cin >> str;
        
        cout << check(str) << endl;
        
    }
}
