def check(ar, n, m, M):
    cnt = 1
    summ = 0
    for i in range(0, n):
        if(summ + ar[i] > m):
            summ = ar[i]
            cnt += 1
        else:
            summ += ar[i]
    if(cnt <= M):
        return 1
    else:
        return 0
def BS(ar, l, r, M, n):
    m = 0
    while(l <= r):
        m = l + (r-l)//2
        pos = check(ar,n,m, M)
        if(pos):
            r = m - 1
        else:
            l = m + 1
    return l
    
n, m = map(int, input().split())
ar = [int(x) for x in input().split()]

print(BS(ar,max(ar),10**17,m,n))
