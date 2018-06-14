MOD = 10 ** 9 + 7
for _ in range(int(input())):
    n = int(input())
    ar = [int(x) for x in input().split()]
    ar.sort()
    maxi = ar[n-1]
    diff = 0
    val = n - 1
    
    for i in range(n-1, -1, -1):
        diff += (val * ar[i])
        val -= 2
    
    ans = diff * maxi
    ans %= MOD
    print(ans)
