for _ in range(int(input())):
    n = int(input())
    ar = [0]*n
    sad = 0
    
    for i in range(0, n):
        n1, n2 = map(int, input().split())
        ar[i] = n1 + n2
        sad += n2
    ar.sort()
    ans = ar[n-1] + ar[n-2] - sad
    print(ans)
