n = int(input())
ar = [int(x) for x in input().split()]
ar.sort()
tmp = -1
cnt = 1
ans = 0

for i in range(0, n):
    if(tmp != ar[i]):
        tmp = ar[i]
        ans += (cnt*(cnt-1))//2
        cnt = 1
    else:
        cnt += 1

ans += (cnt*(cnt-1))//2
print(ans)
