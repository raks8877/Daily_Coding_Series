n, m = map(int,input().split())

ar = {}
for i in range(0,n):
    temp = [int(x) for x in input().split()]
    ar[i] = temp



for i in range(0,m):
    for j in range(0,n):
        print(ar[j][i],end=' ')
    print("")
    
