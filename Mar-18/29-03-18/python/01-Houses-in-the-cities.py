for _ in range( int(input()) ):
    n = int(input())
    ar = [int(x) for x in input().split()]
    
    dp = {}
    dp[0] = 0
    for i in range(1, n+1):
        dp[i] = dp[i-1] + ar[i-1]
    
    for __ in range( int(input())):
        x, y = map(int, input().split())
        
        print( dp[y] - dp[x-1] )
