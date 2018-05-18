for _ in range(int(input())):
    n = int(input())
    data = input()
    cnt = 0
    flag = False
    
    for i in data:
        val = ord(i) - ord('0')
        if(val >= 0 and val <= 10):
            if(flag == False):
                cnt += 1
                flag = True
        else:
            flag = False
    print(cnt)
    
