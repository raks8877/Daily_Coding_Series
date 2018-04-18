def BS(ar, l, r, k):
    m = 0
    pos = 0
    while(l <= r):
        m = l + (r-l)//2
        if(k >= ar[m]):
            pos = m
            r = m - 1
        else:
            l = m + 1
    return pos

for _ in range(int(input())):
    n = int(input())
    A = [int(x) for x in input().split()]
    B = [int(x) for x in input().split()]
    val = 0
    for i in range(n-1,0,-1):
        tmp = BS(A,0,n-1,B[i])
        if(B[i] >= A[tmp]):
            val = max(val, i-tmp)
    print(val)
