maxi = 0
for _ in range(int(input())):
    ans = 0
    add = False
    sub = False
    data = input()
    for i in data:
        val = ord(i) - ord('0')
        if(val >=0 and val <= 10):
            val = int(i)
            if(add == False and sub == False):
                ans = val
            elif(add == True):
                ans += val
            elif(sub == True):
                ans -= val
        
        elif(i == '+'):
            add = True
            sub = False
        elif(i == '-'):
            add = False
            sub = True
        
    if(ans > maxi):
        maxi = ans
print(maxi)
        
