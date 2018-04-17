for _ in range(int(input())):
    ar = [0]*10002
    cnt = 0
    for __ in range(int(input())):
        a, b = map(int,input().split())
        if(ar[a] == 0):
            ar[a] = 1
            cnt += 1
        if(ar[b] == 0):
            ar[b] = 1
            cnt += 1
    print(cnt)
