data = input()
n = len(data)
flag = [0]*26

for i in range(0, n):
    val = ord(data[i]) - ord('a')
    if(flag[val] == 0):
        flag[val] = 1
        print(data[i], end = '')
    
