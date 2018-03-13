n = int(input())
ar = [int(x) for x in input().split()]
maxi = {}

maxi[n-1] = ar[n-1]
for i in range(n-2,-1,-1):
    maxi[i] = max(maxi[i+1],ar[i])

for i in range(0,n):
    if(ar[i]>=maxi[i]):
        print(ar[i],end=' ')
