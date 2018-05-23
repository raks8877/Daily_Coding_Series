for _ in range(int(input())):
    data = input()
    n = len(data)
    val = ord(data[0]) - ord('a')
    flag = True
    for i in range(1, n):
        val2 = ord(data[i]) - ord('a')
        tmp = abs(val2 - val)
        
        if(tmp != 1 and tmp != 25):
            flag = False
            break
        val = val2
    if(flag == True):
        print("YES")
    else:
        print("NO")
