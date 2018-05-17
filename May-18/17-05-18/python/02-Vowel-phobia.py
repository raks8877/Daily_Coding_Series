for _ in range(int(input())):
    data = input()
    
    cnt = 0
    for i in data:
        if(i == 'a' or
           i == 'e' or
           i == 'i' or
           i == 'o' or
           i == 'u' 
           ):
               cnt += 1
    print(cnt)
           
