n = int(input())
ar = [int(x) for x in input().split()]

ans = 1

for i in range(0,n-1):
    if ar[i] > ar[i+1]:
        ans += 1
print(ans)
