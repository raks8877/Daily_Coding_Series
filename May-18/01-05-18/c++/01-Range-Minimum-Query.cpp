#include<bits/stdc++.h>

using namespace std;

const int N = 1e5+5;
const int TV = 1e6+5;
int tree[2*TV] = {0};
int ar[N] = {0};

void build(int node, int start, int end)
{
    if(start == end)
    {
        tree[node] = ar[start];
    }
    else
    {
        int mid = start + (end - start)/2;
        build(2*node, start, mid);
        build(2*node+1, mid+1, end);
        tree[node] = min(tree[2*node], tree[2*node+1]);
    }
}

void update(int node, int start, int end, int idx, int val)
{
    if(start == end)
    {
        ar[idx] = val;
        tree[node] = val;
    }
    else
    {
        int mid = start + (end - start)/2;
        if(start <= idx and idx <= mid)
            update(2*node, start, mid, idx, val);
        else
            update(2*node+1, mid+1, end, idx, val);
        tree[node] = min(tree[2*node], tree[2*node+1]);
    }
    
}

int query(int node, int start, int end, int l, int r)
{
    
    if(r < start or end < l)
        return INT_MAX;
    
    if(l <= start and end <= r)
    {
        return tree[node];
    }
    int mid = start + (end - start)/2;
    int p1 = query(2*node, start, mid, l, r);
    int p2 = query(2*node+1, mid+1, end, l, r);
    return min(p1,p2);
    
}

int main()
{
    int n,q;
    cin >> n >> q;
    for(int i = 1; i <= n; i++)
        cin >> ar[i];
    build(1, 1, n);
    while(q--)
    {
        char ch;
        int l, r;
        cin >> ch >> l >> r;
        if(ch == 'q')
        {
            cout << query(1, 1, n, l, r) << endl;
        }
        else
        {
            update(1, 1, n, l, r);
        }
    }
}
