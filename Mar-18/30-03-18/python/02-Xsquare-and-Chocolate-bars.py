for _ in range( int(input()) ):
    data = input()
    n = len(data)
    dp = {}
    dp[0] = 0
    dp[1] = 0
    
    maxi = 0
    for i in range(2, n):
        dp[i] = 0
        if(data[i] == data[i-1] and data[i] == data[i-2]):
            dp[i] = 0
        else:
            if(i-3 > 0):
                dp[i] = dp[i-3] +1
            else:
                dp[i] = 1
        
        if(dp[i] > maxi):
            maxi = dp[i]
    maxi *= 3
    print(n - maxi)
