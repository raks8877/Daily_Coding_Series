MOD = int(1e9)+7
N = 2
K = 2
F = [[1]*(N+1) for i in range(K+1)]
M = [[1]*(N+1) for i in range(K+1)]
 
NUM = 10**5 + 5
SEG_TREE = 4*NUM
ar = [0]*NUM
tree = [0]*SEG_TREE
cache = {} 
 
def fibo(n):
    if n in cache:
        return cache[n]
    
    F[0][0] = 1
    F[0][1] = 1
    F[1][0] = 1
    F[1][1] = 0
    if(n == 0):
        return 1
    power(n)
    
    if n not in cache:
        cache[n] = F[0][0]
    
    return F[0][0]
 
def power(n):
    M[0][0] = 1
    M[0][1] = 1
    M[1][0] = 1
    M[1][1] = 0
 
    if( n == 1 or n == 0):
        return
    power(n//2)
    multiply(F,F)
    if(n % 2 != 0):
        multiply(F,M)
 
def multiply(F,M):
    a = ( (F[0][0] * M[0][0]) + (F[0][1] * M[1][0]) ) % MOD
    b = ( (F[0][0] * M[0][1]) + (F[0][1] * M[1][1]) ) % MOD
   
    c = ( (F[1][0] * M[0][0]) + (F[1][1] * M[1][0]) ) % MOD
    d = ( (F[1][0] * M[0][1]) + (F[1][1] * M[1][1]) ) % MOD
    
    F[0][0] = a
    F[0][1] = b
    F[1][0] = c
    F[1][1] = d
 
 
def GCD(a, b):
    if(b == 0):
        return a
    else:
        return GCD(b, a%b)
    
 
def build(node, start, end):
    if(start == end):
        tree[node] = ar[start]
    else:
        mid = start + (end-start)//2
        build(2*node, start, mid)
        build(2*node+1, mid+1, end)
        tree[node] = GCD(tree[2*node], tree[2*node+1])
 
def query(node, start, end, l, r):
    if(r < start or end < l):
        return 0
    if(l <= start and end <= r):
        return tree[node]
    mid = start + (end-start)//2
    p1 = query(2*node, start, mid, l, r)
    p2 = query(2*node+1, mid+1, end, l, r)
    return GCD(p1,p2)
 
 
n, q = map(int, input().split())
data = [int(x) for x in input().split()]
 
for i in range(1,n+1):
    ar[i] = data[i-1]
build(1, 1, n);
 
 
for _ in range(0, q):
    l, r = map(int, input().split())
    print(fibo( query(1, 1, n, l, r) -1 ))
    
 
