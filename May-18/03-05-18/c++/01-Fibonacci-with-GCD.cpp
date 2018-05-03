
#include<bits/stdc++.h>

using namespace std;

const long MOD = 1e9+7;
const int N = 1e5+5;
const int SEG_TREE = 4*N;
long ar[N];
long tree[SEG_TREE];

void multiply(long F[2][2], long M[2][2]);
 
void power(long F[2][2], long n);


long fibo(long n)
{
    long F[2][2] = { {1,1}, {1,0} };
    if(n == 0)
        return 1;
    power(F,n);
    return F[0][0];
}

void power(long F[2][2], long n)
{
  if( n == 0 || n == 1)
      return;
  long M[2][2] = {{1,1},{1,0}};
 
  power(F, n/2);
  multiply(F, F);
 
  if (n%2 != 0)
     multiply(F, M);
}
 
void multiply(long F[2][2], long M[2][2])
{
  long x = ( ( (F[0][0]%MOD)*(M[0][0]%MOD) ) + ( (F[0][1]%MOD)*(M[1][0]%MOD) ) ) %MOD;
  long y = ( ( (F[0][0]%MOD)*(M[0][1]%MOD) ) + ( (F[0][1]%MOD)*(M[1][1]%MOD) ) ) %MOD ;
  long z = ( ( (F[1][0]%MOD)*(M[0][0]%MOD) ) + ( (F[1][1]%MOD)*(M[1][0]%MOD) ) ) %MOD;
  long w = ( ( (F[1][0]%MOD)*(M[0][1]%MOD) ) + ( (F[1][1]%MOD)*(M[1][1]%MOD) ) ) %MOD ;

  F[0][0] = x;
  F[0][1] = y;
  F[1][0] = z;
  F[1][1] = w;
}

long GCD(long a, long b)
{
    if(b == 0)
        return a;
    else
        return GCD(b, a%b);
}
int MID(int a, int b)
{
    return a + (b-a)/2;
}

void build(int node, int start, int end)
{
    if(start == end)
    {
        tree[node] = ar[start];
        // cout << start << "_" << ar[start] << "_" << tree[node] << endl;
    }
    else
    {
        int mid = MID(start,end);
        build(2*node, start, mid);
        build(2*node+1, mid+1, end);
        tree[node] = GCD(tree[2*node], tree[2*node+1]) ;
    }
}

long query(int node, int start, int end, int l, int r)
{
    if(r < start or end < l)
        return 0;
    if(l <= start and end <= r)
        return tree[node];
    int mid = MID(start, end);
    long p1 = query(2*node, start, mid, l, r);
    long p2 = query(2*node+1, mid+1, end, l, r);
    return GCD(p1,p2);

}


int main()
{
    int n, q;
    cin >> n >> q;
    for(int i = 1; i <= n; i++)
        cin >> ar[i];
    build(1, 1, n);
    
    // for(int i = 1; i <= 2*n; i++)
    //     cout << i << " " << tree[i] <<endl;
    
    while(q--)
    {
        int l, r;
        cin >> l >> r;
        cout << fibo( query(1, 1, n, l, r) - 1)<< endl;
    }
}
