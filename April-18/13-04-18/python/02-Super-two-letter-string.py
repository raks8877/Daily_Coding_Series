MOD = (10**9) + 7

for _ in range(int(input())):
    n, p = map(int,input().split())
    dp = [0]*(n+1)
    dp[0] = 1
    
    for i in range(1, n+1):
        j = i-1
        while(j >= 0 and i-j <= p):
            dp[i] += dp[j]
            j -= 1
    print(dp[n] % MOD)
    
    
