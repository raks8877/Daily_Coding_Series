for _ in range( int(input()) ):
    data = input()
    n = len(data)
    cnt = []
    for i in range(0,27):
        cnt.append(0)
    
    
    for i in range(0, n):
        cnt[ ord(data[i]) - 97 ] += 1
    
    flag = True
    for i in range(0, 27):
        if(cnt[i] % 2 != 0):
            flag = False
            break
     
    if(flag):
        print("1")
    else:
        print("-1")
        
