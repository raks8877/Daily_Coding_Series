def pali(s):
    n = len(s)
    for i in range(0, n//2):
        if(s[i] != s[n-i-1]):
            return False
    return True

data = input()
if(pali(data) == True):
    print("YES")
else:
    print("NO")
        
