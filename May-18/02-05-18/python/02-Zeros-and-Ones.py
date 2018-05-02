#getting tle 
N = 10**6 + 5
SEG_TREE = 4*N

tree = [0]*SEG_TREE

def build(node, start, end):
    if(start == end):
        tree[node] = 1
    else:
        mid = start + (end-start)//2
        build(2*node, start, mid)
        build(2*node+1, mid+1, end)
        tree[node] = tree[2*node] + tree[2*node+1]

def update(node, start, end, idx):
    if(start == idx and end == idx):
        tree[node] = 0
    else:
        mid = start + (end-start)//2
        if(start <= idx and idx <= mid):
            update(2*node, start, mid, idx)
        else:
            update(2*node+1, mid+1, end, idx)
        tree[node] = tree[2*node] + tree[2*node+1]

def query(node, start, end, k, n):
    if(start < 1 or end > n or tree[node] < k):
        return -1
    
    if(start == end and k == 1):
        return start
    
    mid = start + (end-start)//2
    val = tree[node]
    left = tree[2*node]
    right = tree[2*node+1]
    if(k > left):
        return query(2*node+1, mid+1, end, k-left, n)
    else:
        return query(2*node, start, mid, k, n)
    
n = int(input())
build(1, 1, n)
for _ in range(int(input())):
    a, x = map(int, input().split())
    if(a == 0):
        update(1, 1, n, x)
    else:
        print(query(1, 1, n, x, n))
        
