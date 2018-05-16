
def pali(data):
    n = len(data)
    for i in range(0, n//2):
        if(data[i] != data[n-1-i]):
            return False
    return True


for _ in range(int(input())):
    data = input()
    if(pali(data) == True):
        print("YES")
    else:
        print("NO")
