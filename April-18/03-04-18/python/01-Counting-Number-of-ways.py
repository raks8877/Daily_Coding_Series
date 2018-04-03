MOD = int(1e9)+7
N = 10000
K = 100
dp = [[1]*(N+1) for i in range(K+1)]

for i in range(2,K+1):
    val = 2
    for j in range(2,N+1):
        val %= MOD
        dp[i][j] = val
        val += dp[i][j]
        if j-i>=0: 
            val -= dp[i][j-i]

for _ in range(int(input())):
    x,k = list(map(int,input().split()))
    print(dp[k][x])
