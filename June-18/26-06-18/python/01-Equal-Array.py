for _ in range(int(input())):
    n = int(input())
    ar = [int(x) for x in input().split()]
    pre = [0]*n
    post = [0]*n
    
    for i in range(0, n):
        pre[i] = ar[i]
        if(i != 0):
            pre[i] += pre[i-1]
    for i in range(n-1, -1, -1):
        post[i] = ar[i]
        if(i != n-1):
            post[i] += post[i+1]
    mini = 10**15
    
    for i in range(0, n-1):
        if(post[i+1] - pre[i] >= 0):
            mini = min(mini, post[i+1] - pre[i])
    if(mini == 10**15):
        mini = -1
    print(mini)
