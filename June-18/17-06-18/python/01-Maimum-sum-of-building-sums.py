n = int(input())
n *= 2

ar = [int(x) for x in input().split()]

ar.sort()
ans = 0
for i in range(0, n, 2):
    ans += ar[i]
print(ans)
