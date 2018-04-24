def pali(str1, str2):
    l1 = len(str1)
    l2 = len(str1)
    if(l1 != l2):
        return False
    
    for i in range(0, l1):
        if(str1[i] != str2[l2-i-1]):
            return False
    return True

n = int(input())
string = [input() for x in range(0,n)]

l = 0
ch = ' '
for i in range(0, n):
    for j in range(i+1, n):
        if(pali(string[i], string[j])):
            l = len(string[i])
            ch = string[i][l//2]
            break
print(l, ch)
