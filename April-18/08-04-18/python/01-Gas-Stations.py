n, x = map(int, input().split())
ar = [int(x) for x in input().split()]

ans = 0
for i in range(0, n):
    if(i > 0):
        ar[i] += ar[i-1]
    if(ar[i] >= x):
        ans = i+1
        break
print(ans)
