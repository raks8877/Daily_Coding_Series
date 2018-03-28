#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    deque<int> que;
    while(n--)
    {
        char ch; int x;
        cin >> ch;
        if(ch == 'E')
        {
            cin >> x;
            que.push_back(x);
            cout << que.size() << endl;
        }
        else
        {
            if(!que.empty())
            {
                cout << que.front() << " " ;
                que.pop_front();
            }
            else
            {
                cout << "-1 ";
            }
            cout << que.size() << endl;
            
        }
    }
}
