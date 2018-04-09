dp = []
MOD = 1000003
dp.append(1)
for i in range(1, MOD+1):
    val = (dp[i-1] * i ) % MOD
    dp.append(val)

for _ in range(int(input())):
    n, x = map(int, input().split())
    if(n >= MOD):
        print(0)
    else:
        ans =(dp[n] * (x%MOD) ) % MOD
        print(ans)
