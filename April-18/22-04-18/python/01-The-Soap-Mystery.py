def BS(ar, l, r, k):
    m = 0
    pos = -1
    while(l <= r):
        m = l + (r-l)//2
        if(k > ar[m]):
            pos = m
            l = m + 1
        else:
            r = m - 1
    return pos + 1

n = int(input())
ar = [int(x) for x in input().split()]
ar.sort()

for _ in range(int(input())):
    x = int(input())
    print( BS(ar, 0, n-1, x) )
    
