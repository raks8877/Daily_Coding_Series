
for _ in range(int(input())):
    data = input()
    
    flag = [0]*26
    
    for i in data:
        val = ord(i) - ord('a')
        if(flag[val] == 0):
            flag[val] = 1
            print(i, end = '')
    print()
