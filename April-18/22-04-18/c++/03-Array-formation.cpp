#include<bits/stdc++.h>
using namespace std;

const int N = 1000001;
bool check[N];

void checkFunc()
{
    check[0] = check[1] = true;
    for(int i = 2; i < N; i++)
    {
        if(check[i] == false)
        {
            for(int j = 2*i; j < N; j += i)
            {
                check[j] = true;
            }
        }
    }
}

vector<vector<int> > queue_and_stack (vector<int> A) {
   checkFunc();
   vector< vector<int> > ans;
   vector<int> a1,a2;
   int cnt = 0;
   for(vector<int>::iterator i = A.begin(); i != A.end(); i++)
   {
        int val = (*i);
        if(!check[val])
        {
            a1.push_back(val);
        }
        else
        {
            a2.push_back(val);
        }
   }
   reverse(a2.begin(),a2.end());
   ans.push_back(a1);
   ans.push_back(a2);
   
   return ans;
}

int main() {

    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    vector<int> A(n);
    for(int i_A=0; i_A<n; i_A++)
    {
    	cin >> A[i_A];
    }

    vector<vector<int> > out_;
    out_ = queue_and_stack(A);
    for(int i_out_=0; i_out_<out_.size(); i_out_++)
    {
    	cout << out_[i_out_][0];
    	for(int j_out_=1; j_out_<out_[i_out_].size(); j_out_++)
    	{
    		cout << " " << out_[i_out_][j_out_];
    	}
    	cout << "\n";
    }
}
