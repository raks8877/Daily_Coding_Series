def check(ch):
    if(ch == '0'):
        return 6
    elif(ch == '1'):
        return 2
    elif(ch == '2'):
        return 5
    elif(ch == '3'):
        return 5
    elif(ch == '4'):
        return 4
    elif(ch == '5'):
        return 5
    elif(ch == '6'):
        return 6
    elif(ch == '7'):
        return 3
    elif(ch == '8'):
        return 7
    elif(ch == '9'):
        return 6
    return 0   
    

def solu(data):
    ans = 0
    for i in data:
        ans += check(i)
    return ans
    
for _ in range(int(input())):
    ans = ""
    mini = 10**9
    n = int(input())
    for i in input().split():
        val = solu(i)
        if(val < mini):
            mini = val
            ans = i
    print(ans)
