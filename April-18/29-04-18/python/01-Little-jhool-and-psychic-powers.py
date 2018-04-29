def check(s):
    n = len(s)
    cnt0 = 0
    cnt1 = 0
    for i in range(0, n):
        if(s[i] == '0'):
            cnt0 += 1
            cnt1 = 0
        else:
            cnt0 = 0
            cnt1 += 1
        if(cnt0 == 6 or cnt1 == 6):
            return True
    return False
    
data = input()
if(check(data) == False):
    print("Good luck!")
else:
    print("Sorry, sorry!")
    
