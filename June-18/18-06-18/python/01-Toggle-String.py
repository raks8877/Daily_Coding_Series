data = input()
n = len(data)

for i in range(0, n):
    val = ord(data[i]) - ord('a')
    if(val >=0 and val <= 26):
        
        print(chr(ord('A') + val), end = '')
    else:
        print(chr(ord('a') + (ord(data[i]) - ord('A'))), end = '')
