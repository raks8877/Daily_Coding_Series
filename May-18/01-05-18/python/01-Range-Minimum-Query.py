
N = (10**5) + 5
TV = (10**6) + 5
tree = [0]*(2*TV)
ar = [0]*N


def build(node, start, end):
    if(start == end):
        tree[node] = ar[start]
    else:
        mid = start + (end - start)//2
        build(2*node, start, mid)
        build(2*node+1, mid+1, end)
        tree[node] = min(tree[2*node], tree[2*node+1])

def update(node, start, end, idx, val):
    if(start == end):
        ar[idx] = val
        tree[node] = val
    else:
        mid = start + (end - start)//2
        if(start <= idx and idx <= mid):
            update(2*node, start, mid, idx, val)
        else:
            update(2*node+1, mid+1, end, idx, val)
        tree[node] = min(tree[2*node], tree[2*node+1])

def query(node, start, end, l, r):
    if(r < start or end < l):
        return 10**10
    
    if(l <= start and end <= r):
        return tree[node]
    
    mid = start + (end - start)//2
    p1 = query(2*node, start, mid, l, r)
    p2 = query(2*node+1, mid+1, end, l, r)
    return min(p1, p2)
    
    
        




n, q = map(int, input().split())
data = [int(x) for x in input().split()]

for i in range(1, n+1):
    ar[i] = data[i-1]

build(1, 1, n)


for _ in range(0, q):
    data = input()
    ch = data.split()[0]
    l = int(data.split()[1])
    r = int(data.split()[2])
    if(ch == 'q'):
        print(query(1, 1, n, l, r))
    else:
        update(1, 1, n, l, r)
