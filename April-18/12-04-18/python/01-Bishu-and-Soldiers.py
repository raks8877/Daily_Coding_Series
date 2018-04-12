def BS(ar, l, r, key):
    m = 0
    while(l <= r):
        m = l + (r-l) // 2
        if(ar[m] > key):
            if(ar[m-1] <= key):
                return m-1
            else:
                r = m -1
        else:
            l = m + 1
    return m

ar = []
n = int(input())
for _ in range(0, n):
    ar.append( int(input()) )
    
ar.sort()

dp = [0]*(n+1)
dp[0] = ar[0]
for i in range(1,n):
    dp[i] = dp[i-1] + ar[i]

for _ in range(int(input())):
    x = int(input())
    pos = BS(ar, 0, n-1, x)
    print((pos+1), dp[pos])
