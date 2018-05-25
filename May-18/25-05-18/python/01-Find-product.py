MOD = 10**9 + 7
ans = 1
n = input()
for val in input().split():
    val = int(val)
    ans = ans*val
    ans %= MOD
print(ans)
