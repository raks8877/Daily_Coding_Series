
prime = []
N = 10000
dp = [0]*(N+1)
def seive():
    check = [0]*(N+1);
    for i in range(2, N+1):
        if(check[i] == 0):
            prime.append(i)
            for j in range(2*i,N+1,i):
                check[j] = 1
            dp[i] = 1
            if(i <= 5):
                val = pow(i,i)
                dp[val] = 1
def solve():
    dp[0] = dp[1] = N
    for i in range(2,N+1):
        if(dp[i] != 1):
            dp[i] = N
            for val in prime:
                if(val > i):
                    break
                if(i-val >= 0 ):
                    dp[i] = min(dp[i-val] + 1, dp[i])
                if(val <= 5):
                    val = pow(val,val)
                    if(i-val >= 0):
                        dp[i] = min(dp[i-val] + 1, dp[i])
    
seive()
solve()
for _ in range(int(input())):
    n = int(input())
    print(dp[n])
