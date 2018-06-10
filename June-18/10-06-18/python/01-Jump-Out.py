
n = int(input())
ar = [int(x) for x in input().split()]

ans = 0

for i in range(0, n):
    if(ans == 0 and n - ar[i] - i <= 0):
        ans = i + 1
print(ans)
