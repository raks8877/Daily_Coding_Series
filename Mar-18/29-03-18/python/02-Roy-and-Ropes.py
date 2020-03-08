for _ in range( int(input()) ):
    n = int(input())
    ar = [int(x) for x in input().split()]
    dp = [int(x) for x in input().split()]
    
    for i in range(0, n-1):
        dp[i] = max(dp[i], ar[i])
    
    maxi = 0
    
    for i in range(n-2, -1, -1):
        dp[i] = dp[i] - (n - i - 1)
        if(dp[i] > maxi):
            maxi = dp[i]
    
    print(n + maxi)
