for _ in range(int(input())):
    data = input()
    n = len(data)
    ch = [0]*n
    cnt = n - 1
    
    for i in range(n-1, -1, -2):
        ch[cnt] = data[i]
        cnt -= 1
    extra = 0
    if(n % 2 != 0):
        extra = 1
    
    for i in range(0 + extra, n, 2):
        ch[cnt] = data[i]
        cnt -= 1
    
    for i in ch:
        print(i, end = '')
    print()
