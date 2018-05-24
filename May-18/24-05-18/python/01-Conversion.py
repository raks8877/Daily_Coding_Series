for _ in range(int(input())):
    data = input()
    
    for i in data:
        val = ord(i) - ord('a')
        if(val < 0 or val > 26):
            val = ord(i) - ord('A')
        if(val < 0 or val > 26):
            val = -1
        if(val == -1):
            print("$", end = '' )
        else:
            print(val+1, end = '')
    print()
