for _ in range( int(input()) ):
    n, k = map(int, input().split())
    ar = [int(x) for x in input().split()]
    dp = [0 for x in range(0,n+1)]
    
    for i in range(0, n):
        if(i > 0):
            if(ar[i] <= k ):
                dp[i+1] = dp[i] + ar[i]
            
        elif(ar[i] <= k):
            dp[i+1] = ar[i]
    
    print( max(dp) )
