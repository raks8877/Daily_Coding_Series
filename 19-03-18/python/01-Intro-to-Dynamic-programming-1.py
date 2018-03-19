MOD = 1000000007
dp = {}
dp[0] = dp[1] = 1

def solu(n):
    for i in range(2,n+1):
        dp[i] = ( (dp[i-1] % MOD) * (i % MOD) ) % MOD

n = int(input())
ar = []

for i in range(0,n):
    ar.append( int(input()) )

solu(max(ar))

for i in range(0,n):
    print(dp[ ar[i] ])
