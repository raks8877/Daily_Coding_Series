def check(ar,n,l,r):
    cnt = 0
    for i in range(0,n):
        for j in range(0,n):
            if(l<=i and r<=j):
                if(ar[l][r]>ar[i][j]):
                    cnt+=1
    return cnt

for _ in range(int(input())):
    n = int(input())
    ar = {}
    
    for i in range(0,n):
        tmp = [int(x) for x in input().split()]
        ar[i]=tmp
    
    ans = 0
    for i in range(0,n):
        for j in range(0,n):
            ans+=check(ar,n,i,j)
    print(ans)
