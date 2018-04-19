for _ in range(int(input())):
    n, q = map(int, input().split())
    ar = [int(x) for x in input().split()]
    ar.sort()
    
    ans = 0
    
    for i in range(0, n-1):
        ans += (q*abs(ar[i]-ar[i+1]))
    print(ans)
