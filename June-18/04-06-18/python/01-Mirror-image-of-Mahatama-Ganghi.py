def pali(data, n):
    for i in range(0, n//2):
        if(data[i] != data[n-i-1]):
            return False
    return True
for _ in range(int(input())):
    data = input()
    n = len(data)
    flag = False
    
    for i in range(0, n):
        if(data[i] == '0' or data[i] == '1' or data[i] == '8'):
            continue
        else:
            flag = True
            break
    if(flag == False and pali(data, n) == True):
        print("YES")
    else:
        print("NO")
