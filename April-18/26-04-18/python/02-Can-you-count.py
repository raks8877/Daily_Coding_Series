import sys

MOD = sys.maxsize + 1

for _ in range(int(input())):
    s = input()
    n = len(s)
    cnt = 0
    cnta = 0
    cnte = 0
    cnti = 0
    cnto = 0
    cntu = 0
    ans = 1
    
    for i in range(0, n):
        if(s[i] == '_'):
            if(cnt != 0):
                ans *= cnt
                ans %= MOD
        if(s[i] == 'a'):
            cnta = 1
        if(s[i] == 'e'):
            cnte = 1
        if(s[i] == 'i'):
            cnti = 1
        if(s[i] == 'o'):
            cnto = 1
        if(s[i] == 'u'):
            cntu = 1
        cnt = cnta + cnte + cnti + cnto + cntu 
    print(ans)
        
