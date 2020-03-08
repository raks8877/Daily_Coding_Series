n, q = map(int, input().split())
ar1 = [int(x) for x in input().split()]
ar2 = [int(x) for x in input().split()]

dp1 = {}
dp2 = {}
dp1[0] = 0
dp2[0] = 0

for i in range(1,n+1):
    if (i % 2 == 0):
        dp1[i] = dp1[i-1] + ar2[i-1];
        dp2[i] = dp2[i-1] + ar1[i-1];
    else:
        dp1[i] = dp1[i-1] + ar1[i-1];
        dp2[i] = dp2[i-1] + ar2[i-1];
        
for _ in range(0, q):
    a, x, y = map(int, input().split())
    if(a == 1):
        if(x % 2 != 0):
            print(dp1[y] - dp1[x-1])
        else:
            print(dp2[y] - dp2[x-1])
    else:
        if(x % 2 == 0):
            print(dp1[y] - dp1[x-1])
        else:
            print(dp2[y] - dp2[x-1])
        
            
        
