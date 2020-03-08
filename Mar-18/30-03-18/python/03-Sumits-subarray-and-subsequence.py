import sys

for _ in range( int(input()) ):
    n = int(input())
    ar = [int(x) for x in input().split()]
    dp = []
    dp.append(0)
    for i in range(0, n):
        dp.append(ar[i])
    
    
    
    maxi = -sys.maxsize
    non_conti = 0
    
    for i in range(1, n+1):
        if(ar[i-1] > 0):
            non_conti += ar[i-1]
            
        dp[i] = max( dp[i-1] + ar[i-1], ar[i-1] )
        if(dp[i] > maxi):
            maxi = dp[i]
        
    
    #All negative numbers
    if(non_conti == 0):
        non_conti = maxi
        
    print(maxi,non_conti)
