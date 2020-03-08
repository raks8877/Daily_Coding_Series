#include<bits/stdc++.h>
#include <boost/math/common_factor.hpp>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long n,a,b,c;
        cin>>n>>a>>b>>c;
        
        long total=(n/a)+(n/b)+(n/c);
        total -= (n/boost::math::lcm(a,b)); 
        total -= (n/boost::math::lcm(a,c)); 
        total -= (n/boost::math::lcm(b,c)); 
        total -= (n/boost::math::lcm(a,boost::math::lcm(b,c)));
        cout<<total<<endl;
    }
}
