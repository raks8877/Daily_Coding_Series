for _ in range(int(input())):
    data = input()
    n = len(data)
    
    for i in range(0, n):
        v1 = ord(data[i]) - ord('a') 
        v2 = ord(data[n-i-1]) - ord('a')
        v = (v1 + v2 + 1) % 26
        v = v + 97
        print(chr(v),end = '')
    print()
