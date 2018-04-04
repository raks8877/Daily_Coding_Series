for _ in range( int(input()) ):
    n = int(input())
    ar = []
    dp = []
    for i in range(0, n):
        dp.append(0)
        
        a, b = map(int, input().split())
        tmp = []
        tmp.append(a)
        tmp.append(b)
        ar.append(tmp)
    ar.sort(key=lambda x:x[0], reverse=True)
    maxi = 0
    for i in range(0,n):
        r1 = ar[i][0]
        h1 = ar[i][1]
        dp[i] = h1
        for j in range(0,i):
            r2 = ar[j][0]
            h2 = ar[j][1]
            if(r2 > r1 and h2 > h1):
                dp[i] = max(h1+dp[j], dp[i])
        maxi = max(dp[i], maxi)
    print(maxi)
