#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    vector< pair<int,string> > vec;
    for(int i=0;i<n;i++)
    {
        int a;string str;
        cin>>str>>a;
        vec.push_back(make_pair(a,str));
    }
    sort(vec.begin(),vec.end());
    
    for(int i=n-1;i>n-4;i--)
    {
        cout<<vec[i].second<<endl;
    }
}
