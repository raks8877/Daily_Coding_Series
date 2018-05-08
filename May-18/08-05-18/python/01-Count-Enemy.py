for _  in range(int(input())):
    data = list(input())
    n = len(data)
    
    flag = False
    ans = 0
    
    for i in range(0, n):
        if(data[i] == 'X'):
            flag = True
        if(data[i] == '*'):
            flag = False
        if(flag and data[i] == 'O'):
            data[i] = '-'
    flag = False
    for i in range(n-1, -1, -1):
        if(data[i] == 'X'):
            flag = True
        if(data[i] == '*'):
            flag = False
        if(flag and data[i] == 'O'):
            data[i] = '-'
    
    ans = data.count('O')
    print(ans)
