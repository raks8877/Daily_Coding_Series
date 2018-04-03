for _ in range( int(input()) ):
    n, k = map(int, input().split())
    ar = [int(x) for  x in input().split()]
    dp = ar
    
    maxi = 0
    
    for i in range(0, n):
        if(i- (k+1) >= 0):
            dp[i] = max(maxi, dp[i] + dp[i-(k+1)])
        else:
            dp[i] = max(maxi, dp[i])
        if(dp[i] > maxi):
            maxi = dp[i]
    print(maxi)
    
