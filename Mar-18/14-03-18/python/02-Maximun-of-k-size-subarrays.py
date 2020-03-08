n, k = map(int,input().split())
ar = [int(x) for x in input().split()]

for i in range(0,n-k+1):
    print(max(ar[i:i+k]),end=' ')
