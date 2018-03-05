t = int(input())
while(t > 0):
    n = int(input())
    ar = [int(x) for x in input().split()]
    cnt = 1
    mini = ar[0]
    for i in range(1,n):
        if(ar[i]<=ar[i-1] and ar[i]<=mini):
            cnt+=1
        if(ar[i]<mini):
            mini = ar[i]
    print(cnt)
    t-=1
