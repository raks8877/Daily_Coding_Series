def check(string):
    l = len(string)
    a = False
    e = False
    i = False
    o = False
    u = False
    
    for x in range(0,l):
        if(string[x] == 'a'):
            a = True
        if(string[x] == 'e'):
            e = True
        if(string[x] == 'i'):
            i = True
        if(string[x] == 'o'):
            o = True
        if(string[x] == 'u'):
            u = True
    
    if(a and e and i and o and u):
        return True
    else:
        return False

for _ in range(int(input())):
    string = input()
    if(check(string) == True):
        print("YES")
    else:
        print("NO")
    
