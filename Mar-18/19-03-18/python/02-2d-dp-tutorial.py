n, m = map(int,input().split())

ar = {}
dp = {}

for i in range(0, n):
    tmp = [int(x) for x in input().split()]
    ar[i] = tmp
    val = [x for x in range(0, m)]
    dp[i] = val

dp[0][0] = ar[0][0]

for i in range(1, n):
    dp[i][0] = dp[i-1][0] + ar[i][0]

for j in range(1, m):
    dp[0][j] = dp[0][j-1] + ar[0][j]

for i in range(1, n):
    for j in range(1, m):
        dp[i][j] = dp[i-1][j] + dp[i][j-1] + ar[i][j] - dp[i-1][j-1] 

for _ in range(int(input())):
    x, y = map(int,input().split())
    x -= 1
    y -= 1
    print(dp[x][y])
