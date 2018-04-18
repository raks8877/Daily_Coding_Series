import sys

for _ in range(int(input())):
    n = int(input())
    c = [int(x) for x in input().split()]
    l = [int(x) for x in input().split()]
    
    ans = 0
    mini = sys.maxsize
    for i in range(0,n):
        ans += (l[i] * min(c[i], mini))
        if(c[i] < mini):
            mini = c[i]
    print(ans)
