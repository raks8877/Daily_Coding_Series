def BS(ar, l, r, k):
    m = 0
    while(l <= r):
        m = l + (r-l)//2
        if(ar[m] == k):
            return True
        if(k > ar[m]):
            l = m + 1
        else:
            r = m - 1
    return False
        
n, q = map(int, input().split())
ar = [int(x) for x in input().split()]
ar.sort()

for _ in range(q):
    x = int(input())
    if(BS(ar,0,n-1,x)):
        print("YES")
    else:
        print("NO")
