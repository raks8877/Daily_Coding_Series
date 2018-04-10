n = int(input())
data = [int(x) for x in input().split()]

ar = []
ar.append(0)
for i in range(0,n):
    if(data[i] % 2 == 0):
        ar.append(1)
    else:
        ar.append(-1)

mp = {}
mp[0] = 1
ans = 0
for i in range(1,n+1):
    ar[i] += ar[i-1]
    val = 0
    try:
        val = mp[ar[i]]
    except:
        mp[ar[i]] = 0
    ans += val
    mp[ar[i]] += 1
print(ans)
    
