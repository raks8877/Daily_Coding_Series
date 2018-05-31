for _ in range(int(input())):
    data = input()
    ar = [0]*27
    for i in data:
        val = ord(i) - ord('a')
        ar[val] += 1
    cnt = 0
    for i in range(0, 26):
        if(ar[i] > 0):
            cnt += 1
    if(cnt % 2 == 0):
        print("Player2")
    else:
        print("Player1")
        
