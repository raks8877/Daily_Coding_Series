for _ in range(int(input())):
    n, k = map(int, input().split())
    data = input()
    
    for i in data:
        val1 = ord(i) - ord('a')
        val2 = ord(i) - ord('A')
        val3 = ord(i) - ord('0')
        
        if(val1 >= 0 and val1 <= 26):
            val1 = (val1+k)%26
            print(chr( ord('a') + val1), end = '')
        
        elif(val2 >= 0 and val2 <= 26):
            val2 = (val2+k)%26
            print(chr( ord('A') + val2), end = '')
        
        elif(val3 >= 0 and val3 <= 10):
            val3 = (val3+k)%10
            print(chr( ord('0') + val3), end = '')
        
        else:
            print(i,end = '')
    print()
        
