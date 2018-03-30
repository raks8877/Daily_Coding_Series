
for t in range( int(input()) ):
    n = int(input())
    ar = [int(x) for x in input().split()]
    dp = []
    for i in range(0, n+1):
        dp.append(0)
    
    maxi = ar[0]
    dp[1] = ar[0]
    
    for i in range(2, n+1):
        dp[i] = max(dp[i-2] + ar[i-1] , dp[i-3] + ar[i-1])
        if(dp[i] > maxi):
            maxi = dp[i]
    
    print("Case {0}: {1}".format(t+1, maxi))
    
    
