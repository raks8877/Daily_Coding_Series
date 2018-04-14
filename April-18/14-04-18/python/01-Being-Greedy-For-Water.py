for _ in range(int(input())):
    n , x = map(int,input().split())
    ar = [int(x) for x in input().split()]
    ar.sort()
    cnt = 0 
    for i in range(0, n):
        if(x - ar[i] < 0):
            break
        else:
            cnt += 1
            x -= ar[i]
    print(cnt)
