def check(str1, str2):
    n1 = len(str1)
    n2 = len(str2)
    
    hash1 = [0]*27
    hash2 = [0]*27
    
    for i in range(0,n1):
        val = ord(str1[i]) - ord('a')
        hash1[val] += 1
    
    for i in range(0,n2):
        val = ord(str2[i]) - ord('a')
        hash2[val] += 1
    
    for i in range(0, 27):
        if(hash1[i] != hash2[i]):
            return False
    return True

for _ in range(int(input())):
    s1, s2 = map(str, input().split())
    if(check(s1, s2) == True):
        print("YES")
    else:
        print("NO")
