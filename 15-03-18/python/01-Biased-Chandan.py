n = int(input())
ar = {}
for i in range(0,n):
    ar[i] = int(input())

for i in range(0,n):
    if(ar[i] == 0):
        tmp = i
        while(ar[tmp]==0):
            tmp -= 1
            if(tmp<=0):
                break
        ar[tmp] = 0

ans = 0
for i in range(0,n):
    ans += ar[i]
print(ans)
