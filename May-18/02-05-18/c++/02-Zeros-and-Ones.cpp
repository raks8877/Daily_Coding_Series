#include<bits/stdc++.h>

using namespace std;
const int N = 1e6 + 5;
const int SEG_TREE = 4*N;

int tree[SEG_TREE];


void build(int node, int start, int end)
{
    if(start == end)
    {
        tree[node] = 1;
    }
    else
    {
        int mid = start + (end-start)/2;
        build(2*node, start, mid);
        build(2*node+1, mid+1, end);
        tree[node] = tree[2*node] + tree[2*node+1];
    }
}

void update(int node, int start, int end, int idx)
{
    if(start == idx and end == idx)
    {
        tree[node] = 0;
        
    }
    else
    {
        int mid = start + (end-start)/2;
        if(start <= idx and idx <= mid)
            update(2*node, start, mid, idx);
        else
            update(2*node+1, mid+1, end, idx);
        tree[node] = tree[2*node] + tree[2*node+1];
    }
}


int query(int node, int start, int end, int k, int n)
{
    if(start < 1 or end > n or tree[node] < k)
        return -1;
    if(start == end and k == 1)
        return start;
    
    int val = tree[node];
    int mid = start + (end-start)/2;
    int left = tree[2*node];
    int right = tree[2*node+1];
    if(k > left)
        return query(2*node+1, mid+1, end, k-left, n);
    else
        return query(2*node, start, mid, k, n);
    
}


int main()
{
    int n;
    cin >> n;
    
    build(1, 1, n);
    
    int q;
    cin >> q;
    while(q--)
    {
        int a, x;
        cin >> a >> x;
        if(a == 0)
            update(1, 1, n, x);
        else
            cout << query(1, 1, n, x, n) << endl;
    }
}
